/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.schemaorg;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.BooleanEnum;
import com.google.schemaorg.core.CoreConstants;
import com.google.schemaorg.core.CoreFactory;
import com.google.schemaorg.core.Enumeration;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.DataType;
import com.google.schemaorg.core.datatype.Float;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.GoogFactory;
import java.io.IOException;
import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Converts Schema.org objects to and from JSON-LD.
 *
 * <p>An example for serialization:
 * <pre>
 * {@code JsonLdSerializer serializer = new JsonLdSerializer(true);
 * Thing object = CoreFactory.newThingBuilder().setName(Text.of("name")).build();
 * String jsonldStr = serializer.serialize(object); }</pre>
 *
 * <p>The serialized JSON-LD string should look like:
 *
 * <pre>
 * {
 *   "@context": "http://schema.org",
 *   "@type": "Thing",
 *   "name": "name"
 * }</pre>
 *
 * <p>If there are more than one objects to be serialized, the overloaded method{@code
 * serialize(List<? extends Thing> objects)} could also be called.
 *
 * <p><b>Warning: serializing process will remove the outer brackets([]) in generated JSON-LD if the
 * {@code objects} list only contains one object.</b>
 *
 * <p>An example for deserialization:
 * <pre>
 * {@code List<Thing> objects = serializer.deserialize(jsonldStr);
 * Thing thing = (Thing) (objects.get(0));
 * Text name = (Text)(thing.getName().get(0)); }</pre>
 */
public class JsonLdSerializer {
  private static final Type thingTypeToken = new TypeToken<List<? extends Thing>>() {}.getType();
  private final Gson gson;

  public JsonLdSerializer(boolean setPrettyPrinting) {
    GsonBuilder gsonBuilder =
        new GsonBuilder()
            .registerTypeAdapter(thingTypeToken, new JsonLdTypeAdapter())
            .serializeNulls();
    if (setPrettyPrinting) {
      gsonBuilder.setPrettyPrinting();
    }
    gson = gsonBuilder.create();
  }

  /**
   * Serializes a list of schema.org objects.
   *
   * @throws JsonLdSyntaxException if the objects cannot be serialized to JSON-LD.
   * @throws JsonIOException if there was a problem writing to the JSON writer.
   */
  public String serialize(List<? extends Thing> objects)
      throws JsonLdSyntaxException, JsonIOException {
    try {
      return gson.toJson(objects, thingTypeToken);
    } catch (JsonIOException e) {
      if (e.getCause() instanceof JsonLdSyntaxException) {
        throw (JsonLdSyntaxException) e.getCause();
      } else {
        throw e;
      }
    }
  }

  /**
   * Serializes one schema.org object.
   *
   * @throws JsonLdSyntaxException if the object cannot be serialized to JSON-LD.
   * @throws JsonIOException if there was a problem writing to the JSON writer.
   */
  public String serialize(Thing object) throws JsonLdSyntaxException, JsonIOException {
    return serialize(ImmutableList.of(object));
  }

  /**
   * Deserialized the JSON-LD string into schema.org objects.
   *
   * @throws JsonLdSyntaxException if the JSON-LD string could not be deserialized to schema.org
   *     types.
   * @throws JsonSyntaxException if the JSON-LD string has JSON syntax error.
   */
  public List<Thing> deserialize(String json) throws JsonLdSyntaxException, JsonSyntaxException {
    try {
      return gson.fromJson(json, thingTypeToken);
    } catch (JsonSyntaxException e) {
      if (e.getCause() instanceof JsonLdSyntaxException) {
        throw (JsonLdSyntaxException) e.getCause();
      } else {
        throw e;
      }
    }
  }

  private static class JsonLdTypeAdapter extends TypeAdapter<List<? extends Thing>> {
    private static final String CORE_PACKAGE = "com.google.schemaorg.core";
    private static final String GOOG_PACKAGE = "com.google.schemaorg.goog";
    private static final String CORE_NAMESPACE = "http://schema.org";
    private static final String GOOG_NAMESPACE = "http://schema.googleapis.com";
    private static final String THING = CORE_NAMESPACE + "/Thing";
    private static final String OF_METHOD_NAME = "of";
    private static final String ADD_PROPERTY_METHOD_NAME = "addProperty";
    private static final Pattern CORE_NAMESPACE_PATTERN = Pattern.compile("https?://schema.org/?");
    private static final Pattern GOOG_NAMESPACE_PATTERN =
        Pattern.compile("https?://schema.googleapis.com/?");

    @Override
    public void write(JsonWriter out, List<? extends Thing> values) throws IOException {
      // Convert property multimap in a concrete schema.org type into JSON key-value pairs
      if (values == null || values.isEmpty()) {
        out.nullValue();
        return;
      }

      // Top level value should be a Thing object or an array of Thing objects.
      if (values.size() == 1) {
        writeObject(out, values.get(0), true /* isTopLevelObject */);
      } else {
        out.beginArray();
        for (Thing value : values) {
          writeObject(out, value, true /* isTopLevelObject */);
        }
        out.endArray();
      }
    }

    /**
     * Scans through the property names and property values of the 'value' object to determine if
     * any type or property in goog namespace is used. Then writes the context URL accordingly.
     * Assumes that there are only core and goog namespaces.
     */
    private void writeContextUrl(JsonWriter out, Thing value) throws IOException {
      Queue<Thing> queue = new LinkedList<>();
      queue.add(value);
      while (!queue.isEmpty()) {
        ImmutableListMultimap<String, ValueType> properties =
            ((SchemaOrgTypeImpl) queue.poll()).getAllProperties();
        for (Entry<String, ValueType> entry : properties.entries()) {
          ValueType propertyValue = entry.getValue();
          if (propertyValue.getClass().getName().startsWith(GOOG_PACKAGE)
              || entry.getKey().startsWith(GOOG_NAMESPACE)) {
            out.value(GOOG_NAMESPACE);
            return;
          }
          if (propertyValue instanceof Thing && !(propertyValue instanceof Enumeration)) {
            queue.add((Thing) propertyValue);
          }
        }
      }
      out.value(CORE_NAMESPACE);
    }

    private void writeContext(JsonWriter out, Thing value, boolean isTopLevelObject)
        throws IOException {
      List<ValueType> list = value.getJsonLdContextList();
      if (!isTopLevelObject && list.size() == 0) {
        return;
      }
      out.name(JsonLdConstants.CONTEXT);
      if (isTopLevelObject && list.size() == 0) {
        writeContextUrl(out, value);
        return;
      }
      if (isTopLevelObject && list.size() > 0) {
        out.beginArray();
        writeContextUrl(out, value);
        for (ValueType context : list) {
          writeContextInternal(out, context);
        }
        out.endArray();
        return;
      }
      if (!isTopLevelObject && list.size() == 1) {
        writeContextInternal(out, list.get(0));
        return;
      }
      if (!isTopLevelObject && list.size() > 1) {
        out.beginArray();
        for (ValueType context : list) {
          writeContextInternal(out, context);
        }
        out.endArray();
      }
    }

    private void writeContextInternal(JsonWriter out, ValueType value) throws IOException {
      if (value == NullValue.VALUE) {
        out.nullValue();
        return;
      }
      if (!(value instanceof JsonLdContext)) {
        throw new JsonLdSyntaxException(String.format("Invalid value of @context: %s", value));
      }
      JsonLdContext context = (JsonLdContext) value;
      if (context.containsBase()) {
        out.beginObject();
        out.name(JsonLdConstants.BASE);
        try {
          String base = context.getBase();
          if (base == null) {
            out.nullValue();
          } else {
            out.value(base);
          }
        } catch (SchemaOrgException e) {
          throw new JsonLdSyntaxException("JSON-LD @base must be single value", e.getCause());
        }
        out.endObject();
      }
    }

    // Only support set @reverse in schema.org object.
    // Do not support set @reverse in @context definition.
    private void writeReverse(JsonWriter out, ImmutableMultimap<String, Thing> map)
        throws IOException {
      Set<String> keySet = map.keySet();
      if (keySet.size() == 0) {
        return;
      }
      out.name(JsonLdConstants.REVERSE);
      out.beginObject();
      for (String key : keySet) {
        out.name(shortNameOf(key));
        Collection<Thing> values = map.get(key);
        if (values.size() == 0) {
          throw new JsonLdSyntaxException(
              String.format("JSON-LD reverse property %s has no value", key));
        } else if (values.size() == 1) {
          writeObject(out, (Thing) values.toArray()[0], false /* isTopLevelObject */);
        } else {
          out.beginArray();
          for (Thing value : values) {
            writeObject(out, value, false /* isTopLevelObject */);
          }
          out.endArray();
        }
      }
      out.endObject();
    }

    private void writeObject(JsonWriter out, Thing value, boolean isTopLevelObject)
        throws IOException {
      if (value instanceof Enumeration) {
        throw new JsonLdSyntaxException(
            String.format(
                "Enumeration value '%s' cannot be a JSON-LD entity",
                ((Enumeration) value).getFullEnumValue()));
      }
      out.beginObject();
      // @context should be at the top of generated JSON-LD entity if exists.
      writeContext(out, value, isTopLevelObject);
      out.name(JsonLdConstants.TYPE).value(shortNameOf(value.getFullTypeName()));
      ImmutableListMultimap<String, ValueType> properties =
          ((SchemaOrgTypeImpl) value).getAllProperties();
      for (String key : properties.keySet()) {
        if (key.equals(JsonLdConstants.CONTEXT)) {
          continue;
        } else if (key.equals(JsonLdConstants.ID)) {
          out.name(key);
          try {
            String id = value.getJsonLdId();
            if (id == null) {
              out.nullValue();
            } else {
              out.value(id);
            }
          } catch (SchemaOrgException e) {
            throw new JsonLdSyntaxException(
                String.format("Multiple value found for @id in type %s", value.getFullTypeName()));
          }
        } else {
          out.name(shortNameOf(key));
          List<SchemaOrgType> values = ((SchemaOrgTypeImpl) value).getProperty(key);
          if (values.size() == 0) {
            throw new JsonLdSyntaxException(
                String.format(
                    "Schema.org type %s's property %s has no value", value.getFullTypeName(), key));
          } else if (values.size() == 1) {
            writeInternal(out, values.get(0));
          } else {
            writeArray(out, values);
          }
        }
      }
      writeReverse(out, value.getJsonLdReverseMap());
      out.endObject();
    }

    private void writeArray(JsonWriter out, List<SchemaOrgType> values) throws IOException {
      out.beginArray();
      for (SchemaOrgType value : values) {
        writeInternal(out, value);
      }
      out.endArray();
    }

    private void writeInternal(JsonWriter out, SchemaOrgType value) throws IOException {
      if (value instanceof DataType) {
        String dataValue = ((DataType) value).getValue();
        if (value instanceof Integer) {
          out.value(java.lang.Integer.parseInt(dataValue));
        } else if (value instanceof Float) {
          out.value(java.lang.Float.parseFloat(dataValue));
        } else if (value instanceof Number) {
          out.value(Double.parseDouble(dataValue));
        } else {
          out.value(dataValue);
        }
        return;
      }
      if (value instanceof Enumeration) {
        out.value(((Enumeration) value).getFullEnumValue());
        return;
      }
      if (value instanceof Thing) {
        writeObject(out, (Thing) value, false /* isTopLevelObject */);
      }
    }

    /**
     * Deserialize from JSON-LD content to Schema.org objects. Doesn't support the interpreting
     * terms with @context.
     */
    @Override
    public List<Thing> read(JsonReader reader) throws IOException {
      // Convert JSON into schema.org Thing objects
      JsonToken token = reader.peek();
      switch (token) {
        case STRING:
        case NUMBER:
        case BOOLEAN:
        case NAME:
        case NULL:
        case END_OBJECT:
        case END_ARRAY:
          throw new JsonLdSyntaxException(
              String.format(
                  "Invalid top level JSON-LD token %s. Should be an object or an array of objects",
                  token));
        case BEGIN_OBJECT:
          return ImmutableList.of(readObject(reader));
        case BEGIN_ARRAY:
          reader.beginArray();
          ImmutableList.Builder<Thing> builder = ImmutableList.builder();
          while (reader.hasNext()) {
            builder.add(readObject(reader));
          }
          reader.endArray();
          return builder.build();
        case END_DOCUMENT:
          break;
      }
      return ImmutableList.of();
    }

    private Thing readObject(JsonReader reader) throws IOException {
      reader.beginObject();
      Multimap<String, ValueType> properties = LinkedListMultimap.create();
      ListMultimap<String, Thing> reverseMap = LinkedListMultimap.create();
      String typeName = null;
      while (reader.hasNext()) {
        String key = reader.nextName();
        if (JsonLdConstants.TYPE.equals(key)) {
          typeName = reader.nextString();
        } else if (JsonLdConstants.CONTEXT.equals(key)) {
          properties.putAll(key, readContext(reader));
        } else if (JsonLdConstants.REVERSE.equals(key)) {
          reverseMap.putAll(readReverse(reader));
        } else {
          properties.putAll(
              key, readInternal(reader, JsonLdConstants.ID.equals(key) /* acceptNull */));
        }
      }
      reader.endObject();
      if (Strings.isNullOrEmpty(typeName)) {
        // Treat any unrecognized types as Thing.
        typeName = THING;
      }
      // Value of @type should be short type name or full type name.
      // Doesn't support relative IRI or compact IRI for now.
      return buildSchemaOrgObject(typeName, properties, reverseMap);
    }

    // Only supports @reverse property in JSON-LD objects. Do not support @reverse in expanded term
    // definitions in context definition.
    private ListMultimap<String, Thing> readReverse(JsonReader reader) throws IOException {
      reader.beginObject();
      ListMultimap<String, Thing> reverseMap = LinkedListMultimap.create();
      while (reader.hasNext()) {
        String property = reader.nextName();
        JsonToken token = reader.peek();
        if (token == JsonToken.BEGIN_OBJECT) {
          reverseMap.put(property, readObject(reader));
        } else if (token == JsonToken.BEGIN_ARRAY) {
          reader.beginArray();
          while (reader.hasNext()) {
            reverseMap.put(property, readObject(reader));
          }
          reader.endArray();
        } else {
          throw new JsonLdSyntaxException(
              String.format(
                  "Invalid value token %s in @reverse. Should be a JSON-LD object or an "
                      + "array of JSON-LD objects",
                  token));
        }
      }
      reader.endObject();
      return reverseMap;
    }

    private JsonLdContext readContextUrl(JsonReader reader) throws IOException {
      String url = reader.nextString();
      if (!CORE_NAMESPACE_PATTERN.matcher(url).matches()
          && !GOOG_NAMESPACE_PATTERN.matcher(url).matches()) {
        throw new JsonLdSyntaxException(String.format("Invalid url %s for @context", url));
      }
      return JsonLdFactory.newContextUrl(url);
    }

    private List<JsonLdContext> readContext(JsonReader reader) throws IOException {
      List<JsonLdContext> list = new ArrayList<>();
      JsonToken token = reader.peek();
      switch (token) {
        case STRING:
          list.add(readContextUrl(reader));
          break;
        case NUMBER:
        case BOOLEAN:
        case END_DOCUMENT:
        case END_OBJECT:
        case END_ARRAY:
        case NAME:
          throw new JsonLdSyntaxException(
              String.format(
                  "Invalid @context value token %s. Should be URL, context definition or an "
                      + "array containing a combination of these",
                  token));
        case BEGIN_OBJECT:
          list.add(readContextDef(reader));
          break;
        case BEGIN_ARRAY:
          list.addAll(readContextArray(reader));
          break;
        case NULL:
          reader.nextNull();
          list.add(null);
          break;
      }
      return list;
    }

    private List<JsonLdContext> readContextArray(JsonReader reader) throws IOException {
      reader.beginArray();
      List<JsonLdContext> list = new ArrayList<>();
      while (reader.hasNext()) {
        JsonToken token = reader.peek();
        if (token == JsonToken.STRING) {
          list.add(readContextUrl(reader));
        } else if (token == JsonToken.NULL) {
          reader.nextNull();
          list.add(null);
        } else if (token == JsonToken.BEGIN_OBJECT) {
          list.add(readContextDef(reader));
        } else {
          throw new JsonLdSyntaxException(
              String.format(
                  "Invalid @context value token %s. Should be URL, context definition", token));
        }
      }
      reader.endArray();
      return list;
    }

    private JsonLdContext readContextDef(JsonReader reader) throws IOException {
      reader.beginObject();
      JsonLdContext.Builder contextBuilder = JsonLdFactory.newContextBuilder();
      while (reader.hasNext()) {
        String key = reader.nextName();
        if (!JsonLdConstants.BASE.equals(key)) {
          throw new JsonLdSyntaxException(
              String.format("Unsupported '%s' in JSON-LD context", key));
        }
        JsonToken valueToken = reader.peek();
        if (valueToken == JsonToken.STRING) {
          contextBuilder.setBase(reader.nextString());
        } else if (valueToken == JsonToken.NULL) {
          reader.nextNull();
          contextBuilder.setBase(null);
        } else {
          throw new JsonLdSyntaxException(
              String.format("The value of @base is '%s', should be a string", valueToken));
        }
      }
      reader.endObject();
      return contextBuilder.build();
    }

    // Only accept null value for @id.
    private List<SchemaOrgType> readInternal(JsonReader reader, boolean acceptNull)
        throws IOException {
      List<SchemaOrgType> list = new ArrayList<>();
      switch (reader.peek()) {
        case STRING:
          list.add(Text.of(reader.nextString()));
          break;
        case NUMBER:
          list.add(Number.of(reader.nextString()));
          break;
        case BOOLEAN:
          if (reader.nextBoolean()) {
            list.add(BooleanEnum.TRUE);
          } else {
            list.add(BooleanEnum.FALSE);
          }
          break;
        case NULL:
          if (acceptNull) {
            reader.nextNull();
            list.add(null);
          } else {
            throw new JsonLdSyntaxException("Found null value for schema.org property value");
          }
          break;
        case BEGIN_OBJECT:
          list.add(readObject(reader));
          break;
        case BEGIN_ARRAY:
          list.addAll(readArray(reader));
          break;
        case END_DOCUMENT:
          throw new JsonLdSyntaxException("Meet end of document");
        case END_OBJECT:
        case END_ARRAY:
        case NAME:
          break;
      }
      return list;
    }

    private List<SchemaOrgType> readArray(JsonReader reader) throws IOException {
      reader.beginArray();
      List<SchemaOrgType> list = new ArrayList<>();
      while (reader.hasNext()) {
        list.addAll(readInternal(reader, false /* acceptNull */));
      }
      reader.endArray();
      return list;
    }

    /**
     * Build a schema.org object of specific type, throw exceptions if it is not valid JSON-LD
     * entity for schema.org type. Uses reflection to invoke newXXXBuilder method in CoreFactory or
     * GoogFactory to create a builder object based on the value of {@literal @type}. Only accept
     * value of {@literal @type} being full type name such as "http://schema.org/Thing" or short
     * type name such as "Thing". And then, call addXXX method to update the property multimap based
     * on key-value pairs got from JSON-LD string.
     */
    private static Thing buildSchemaOrgObject(
        String typeName,
        Multimap<String, ValueType> properties,
        ListMultimap<String, Thing> reverseMap)
        throws JsonLdSyntaxException {
      try {
        Class<?> builderClass = findBuilderClass(typeName);
        Thing.Builder builder = (Thing.Builder) createBuilder(builderClass);
        for (String key : properties.keySet()) {
          setPropertyValues(builderClass, builder, key, properties.get(key), typeName);
        }
        setReverseMap(builder, reverseMap);
        return (Thing) (builderClass.getMethod("build").invoke(builder));
      } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
        // Should not get any exception here. If one is caught, it means something wrong with this
        // client library.
        throw new JsonLdSyntaxException(
            String.format("JSON-LD deserialize internal error for type %s.", typeName),
            e.getCause());
      }
    }

    private static void setReverseMap(
        Thing.Builder builder, ListMultimap<String, Thing> reverseMap) {
      for (String key : reverseMap.keySet()) {
        for (Thing thing : reverseMap.get(key)) {
          builder.setJsonLdReverse(key, thing);
        }
      }
    }

    @SuppressWarnings("unchecked")
    private static void setPropertyValues(
        Class<?> builderClass,
        Thing.Builder builder,
        String key,
        Collection<ValueType> values,
        String typeName)
        throws JsonLdSyntaxException, IllegalAccessException, InvocationTargetException {
      String methodName = "";
      try {
        switch (key) {
          case "@context":
            methodName = "addJsonLdContext";
            for (ValueType value : values) {
              builderClass
                  .getMethod(methodName, JsonLdContext.class)
                  .invoke(builder, value == null ? null : (JsonLdContext) value);
            }
            break;
          case "@id":
            methodName = "setJsonLdId";
            for (ValueType value : values) {
              builderClass
                  .getMethod(methodName, String.class)
                  .invoke(builder, value == null ? null : ((Text) value).getValue());
            }
            break;
          default:
            for (ValueType value : values) {
              if (value instanceof Text) {
                Enumeration enumValue = EnumValues.valueOf(((Text) value).getValue());
                if (enumValue != null) {
                  value = enumValue;
                }
              }
              invokeMethod(builderClass, builder, key, (SchemaOrgType) value);
            }
            break;
        }
      } catch (NoSuchMethodException e) {
        throw new JsonLdSyntaxException(
            String.format("Could not find method %s in %s", methodName, builderClass.getName()),
            e.getCause());
      }
    }

    private static void invokeMethod(
        Class<?> builderClass, Thing.Builder builder, String propertyName, SchemaOrgType value)
        throws JsonLdSyntaxException {
      String methodName = String.format("add%s", capFirst(shortNameOf(propertyName)));
      Method foundMethod = null;
      Object paramValue = null;
      if (value instanceof Text) {
        // Every schema.org property accepts Text value. There is an overloaded addXXX() method
        // that accepts a String parameter for each property in this library. Try to use this
        // method to set property with text value.
        try {
          foundMethod = builderClass.getMethod(methodName, String.class);
          paramValue = ((Text) value).getValue();
        } catch (NoSuchMethodException e) {
          foundMethod = null;
          paramValue = null;
        }
      } else {
        Method[] methods = builderClass.getMethods();
        for (Method m : methods) {
          if (m.getName().equals(methodName)) {
            foundMethod = m;
            Class<?> parameterType = m.getParameterTypes()[0];
            if (parameterType.isAssignableFrom(value.getClass())) {
              paramValue = value;
              break;
            } else if (value instanceof Number && Number.class.isAssignableFrom(parameterType)) {
              // If the property value is a Number and parameter type of addXXX method is a sub-type
              // of Number, try to call of() method to convert value into appropriate sub-type of
              // Number, and invoke addXXX() metohd.
              String strValue = ((Number) value).getValue();
              try {
                if (parameterType == Integer.class) {
                  Method method = parameterType.getMethod(OF_METHOD_NAME, int.class);
                  paramValue = method.invoke(null, java.lang.Integer.parseInt(strValue));
                } else if (parameterType == Float.class) {
                  Method method = parameterType.getMethod(OF_METHOD_NAME, float.class);
                  paramValue = method.invoke(null, java.lang.Float.parseFloat(strValue));
                } else {
                  Method method = parameterType.getMethod(OF_METHOD_NAME, String.class);
                  paramValue = method.invoke(null, ((Text) value).getValue());
                }
                break;
              } catch (NoSuchMethodException
                  | IllegalAccessException
                  | InvocationTargetException e) {
                continue;
              }
            }
          }
        }
      }
      if (foundMethod != null && paramValue != null) {
        try {
          foundMethod.invoke(builder, paramValue);
        } catch (IllegalAccessException | InvocationTargetException e) {
          throw new JsonLdSyntaxException(
              String.format(
                  "Could not call method %s with parameter type %s on %s: check property name "
                      + "and expected value type",
                  methodName, paramValue.getClass().getName(), builderClass.getName()));
        }
      } else if (foundMethod == null) {
        // For unrecognized property name, use addProperty method to add property value.
        try {
          foundMethod =
              builderClass.getMethod(ADD_PROPERTY_METHOD_NAME, String.class, SchemaOrgType.class);
          foundMethod.invoke(builder, propertyName, value);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
          throw new JsonLdSyntaxException(
              String.format(
                  "Could not call method '%s' to add property '%s'",
                  ADD_PROPERTY_METHOD_NAME, propertyName),
              e.getCause());
        }
      } else {
        throw new JsonLdSyntaxException(
            String.format(
                "Could not call method '%s' on '%s': check property name and expected value type",
                methodName, builderClass.getName()));
      }
    }

    /**
     * Use type name to find corresponding builder class in schema.org namespace. Find builder class
     * assuming that the type name should only be full name or short name.
     */
    private static Class<?> findBuilderClass(String typeName) throws JsonLdSyntaxException {
      try {
        if (typeName.startsWith(CoreConstants.NAMESPACE)) {
          return Class.forName(
              builderName(CORE_PACKAGE, typeName.substring(CoreConstants.NAMESPACE.length())));
        } else if (typeName.startsWith(GoogConstants.NAMESPACE)) {
          return Class.forName(
              builderName(GOOG_PACKAGE, typeName.substring(GoogConstants.NAMESPACE.length())));
        } else {
          // typeName is a short type name. Try to find Builder in each namespace.
          try {
            return Class.forName(builderName(CORE_PACKAGE, typeName));
          } catch (ClassNotFoundException e) {
            return Class.forName(builderName(GOOG_PACKAGE, typeName));
          }
        }
      } catch (ClassNotFoundException e) {
        throw new JsonLdSyntaxException(
            String.format("JSON-LD Entity type %s is not a valid schema.org type", typeName),
            e.getCause());
      }
    }

    @SuppressWarnings("unchecked")
    private static <T> T createBuilder(Class<T> builderClass) throws JsonLdSyntaxException {
      // The builder class name should be "com.google.indexing.schemaorg.core.XXX$Builder" or
      // "com.google.indexing.schemaorg.goog.XXX$Builder". Find out the short type name "XXX".
      String typeName = builderClass.getName().split("\\$")[0];
      try {
        if (typeName.startsWith(CORE_PACKAGE)) {
          return (T) CoreFactory.class.getMethod(newBuilderMethodName(typeName)).invoke(null);
        } else if (typeName.startsWith(GOOG_PACKAGE)) {
          return (T) GoogFactory.class.getMethod(newBuilderMethodName(typeName)).invoke(null);
        } else {
          throw new JsonLdSyntaxException(
              String.format(
                  "Invalid type name %s from builder class %s", typeName, builderClass.getName()));
        }
      } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
        throw new JsonLdSyntaxException(
            String.format("Could not create instance of %s builder", typeName));
      }
    }

    private static String newBuilderMethodName(String typeName) {
      return String.format("new%sBuilder", shortNameOf(typeName));
    }

    private static String capFirst(String name) {
      return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    private static String builderName(String packageName, String typeName) {
      return String.format("%s$Builder", typeName(packageName, typeName));
    }

    private static String typeName(String packageName, String typeName) {
      return String.format("%s.%s", packageName, typeName);
    }

    private static String shortNameOf(String fullName) {
      if (fullName.startsWith(CoreConstants.NAMESPACE)) {
        return fullName.substring(CoreConstants.NAMESPACE.length());
      } else if (fullName.startsWith(GoogConstants.NAMESPACE)) {
        return fullName.substring(GoogConstants.NAMESPACE.length());
      } else if (fullName.startsWith(CORE_PACKAGE)) {
        return fullName.substring(CORE_PACKAGE.length() + 1);
      } else if (fullName.startsWith(GOOG_PACKAGE)) {
        return fullName.substring(GOOG_PACKAGE.length() + 1);
      } else {
        return fullName;
      }
    }
  }
}
