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

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.Text;
import java.lang.Class;
import javax.annotation.Nullable;

/**
 * Base implementation of {@code SchemaOrgType} and {@code JsonLdNode}. It is inherited by all
 * schema.org implementation classes.
 */
public abstract class SchemaOrgTypeImpl extends BaseTypeImpl implements SchemaOrgType, JsonLdNode {
  private final ImmutableListMultimap<String, Thing> reverseMap;

  public abstract static class BuilderImpl<T extends SchemaOrgType.Builder & JsonLdNode.Builder>
      extends BaseTypeImpl.BuilderImpl<T> implements SchemaOrgType.Builder, JsonLdNode.Builder {
    protected final Multimap<String, Thing> reverseMap;

    public BuilderImpl() {
      reverseMap = LinkedListMultimap.create();
    }

    @Override
    public T addJsonLdContext(@Nullable JsonLdContext value) {
      return addPropertyValue(JsonLdConstants.CONTEXT, value);
    }

    @Override
    public T addJsonLdContext(@Nullable JsonLdContext.Builder builder) {
      return addPropertyValue(JsonLdConstants.CONTEXT, builder == null ? null : builder.build());
    }

    @Override
    public T setJsonLdId(@Nullable String value) {
      if (value == null) {
        setSingleValueProperty(JsonLdConstants.ID, null);
      }
      return setSingleValueProperty(JsonLdConstants.ID, Text.of(value));
    }

    @Override
    public T setJsonLdReverse(String property, Thing obj) {
      Preconditions.checkNotNull(property, "property is null");
      Preconditions.checkNotNull(obj, "object is null");
      reverseMap.put(property, obj);
      return (T) this;
    }

    @Override
    public T setJsonLdReverse(String property, Thing.Builder builder) {
      Preconditions.checkNotNull(builder, "builder is null");
      return setJsonLdReverse(property, builder.build());
    }

    public T addProperty(String name, SchemaOrgType value) {
      // Restrain schema.org property value to be non-null;
      Preconditions.checkNotNull(value, "value is null");
      return addPropertyValue(name, value);
    }

    public T addProperty(String name, Thing.Builder builder) {
      // Restrain schema.org property value to be non-null;
      Preconditions.checkNotNull(builder, "value is null");
      return addPropertyValue(name, builder.build());
    }

    public T addProperty(String name, String value) {
      // Restrain schema.org property value to be non-null;
      Preconditions.checkNotNull(value, "value is null");
      return addPropertyValue(name, Text.of(value));
    }
  }

  public SchemaOrgTypeImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties);
    this.reverseMap = ImmutableListMultimap.copyOf(reverseMap);
  }

  @Override
  public boolean containsJsonLdId() {
    return containsProperty(JsonLdConstants.ID);
  }

  @Override
  public ImmutableList<ValueType> getJsonLdContextList() {
    return getPropertyList(JsonLdConstants.CONTEXT);
  }

  @Override
  @Nullable
  public String getJsonLdId() throws SchemaOrgException {
    ValueType value = getSingleValueProperty(JsonLdConstants.ID);
    if (value == null) {
      return null;
    }
    return ((Text) value).getValue();
  }

  @Override
  public ImmutableMultimap<String, Thing> getJsonLdReverseMap() {
    return reverseMap;
  }

  @Override
  public abstract String getFullTypeName();

  @Override
  public abstract boolean includesProperty(String property);

  @Override
  public boolean contentEquals(ValueType o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SchemaOrgTypeImpl) {
      if (this.getClass() != o.getClass()) {
        return false;
      }
      SchemaOrgTypeImpl that = (SchemaOrgTypeImpl) o;
      if (!multimapContentEquals(getAllProperties(), that.getAllProperties())) {
        return false;
      }
      if (!multimapContentEquals(getJsonLdReverseMap(), that.getJsonLdReverseMap())) {
        return false;
      }
      return true;
    }
    return false;
  }

  /**
   * Compares two multimaps. The result is true if and only if two multimaps' key-value pair
   * contents are the same and in the same order.
   */
  @SuppressWarnings("unchecked")
  private static <T extends ValueType> boolean multimapContentEquals(
      Multimap<String, T> m1, Multimap<String, T> m2) {
    if (!m1.keySet().equals(m2.keySet())) {
      return false;
    }
    for (String key : m1.keySet()) {
      Object[] m1Values = m1.get(key).toArray();
      Object[] m2Values = m2.get(key).toArray();
      if (m2Values.length != m2Values.length) {
        return false;
      }
      for (int i = 0; i < m1Values.length; i++) {
        if (!((T) m1Values[i]).contentEquals((T) m2Values[i])) {
          return false;
        }
      }
    }
    return true;
  }

  private <T> ImmutableList<T> getTransformedPropertyList(String name, Class<T> clazz) {
    Function<ValueType, T> transformFunc =
        new Function<ValueType, T>() {
          @Override
          public T apply(ValueType input) {
            return (T) input;
          }
        };
    return ImmutableList.copyOf(Lists.transform(getPropertyList(name), transformFunc));
  }

  @Override
  public ImmutableList<SchemaOrgType> getProperty(String name) {
    return getTransformedPropertyList(name, SchemaOrgType.class);
  }
}
