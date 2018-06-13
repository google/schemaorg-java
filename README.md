# Schema.org Client Library for Java

-   [Overview](#Overview)
-   [Highlighted Features](#Highlighted_Features)
-   [Quick Start](#Quick_Start)
-   [Important Usage Notes](#Important_Usage_Notes)
-   [Example Code](#Example_Code)
-   [Dependencies](#Dependencies)
-   [Links](#Links)

## <a name='Overview'>Overview</a>

The Schema.org Client Library for Java is a library for creating [schema.org](http://schema.org) entities.
The entities can be easily serialized and deserialized with [JSON-LD](https://json-ld.org)
format by using the JSON-LD serializer in the library.

## <a name='Highlighted_Features'>Library Highlights</a>

The library has the following highlights:

*   Fully supports the vocabulary defined in the http://schema.org namespace as
    well as vocabulary defined in the http://schema.googleapis.com namespace.
*   Fully supports type multiple inheritance, multiple values per property in
    schema.org.
*   Every schema.org type has a corresponding Java interface which provides
    convenient setter methods for setting the values of the properties of that
    particular type.
*   Supports serializing and deserializing schema.org objects to and from
    JSON-LD formats.


## <a name='Limitations'>Limitations</a>

* The library is based on code generated from a specific [release](https://schema.org/docs/releases.html) of schema.org. It may not support more recent additions and changes, or third party extensions.

## <a name='Quick_Start'>Quick Start</a>

Below is a simple example of creating schema.org [Thing](http://schema.org/Thing)
object, serialize it into JSON-LD format and deserialize JSON-LD back to a Thing object.

```java
JsonLdSerializer serializer = new JsonLdSerializer(true /* setPrettyPrinting */);
Thing object =
    CoreFactory.newThingBuilder()
        .addUrl("http://example.com")
        .addName("John")
        .addProperty("customPropertyName", "customPropertyValue")
        .build();
try {
  String jsonLdStr = serializer.serialize(object);
  List<Thing> list = serializer.deserialize(jsonLdStr);
  Thing thing = list.get(0);
  String name = ((Text) thing.getNameList().get(0)).getValue();
  String customPropertyValue =
      ((Text) thing.getProperty("customPropertyName").get(0)).getValue();
} catch (JsonLdSyntaxException e) {
  // Errors related to JSON-LD format and schema.org terms in JSON-LD
} catch (JsonIOException e) {
  // Errors related to JSON format
}
```

## <a name='Important_Usage_Notes'>Important Usage Notes</a>

Some important usage recommendations are given below:

### Package Structure

The Java Classes are organized into the following pakcages:

*   `com.google.schemaorg` (basic interfaces and JSON-LD serializer)
*   `com.google.schemaorg.core` (library for http://schema.org namespace
    vocabulary)
*   `com.google.schemaorg.core.datatype` ([DataType](http://schema.org/DataType)
    primitives)
*   `com.google.schemaorg.goog` (library for http://schema.googleapis.com
    namespace vocabulary)

### Builders

In the Java library, every schema.org type has a corresponding Java interface
with the same name as the schema.org type. The Java interfaces are designed with
the [Builder Pattern](https://en.wikipedia.org/wiki/Builder_pattern). Developers
don't need to know any details about implementation of these interfaces, because
all the operations on the object will be performed through the interface.

`CoreFactory` and `GoogFactory` classes provide static factory methods that
return a Builder object for a specific schema.org type. In the builder
interfaces, there are `add[PropertyName]` methods for each property which could
be set in the corresponding schema.org type. Multiple values can be added to a
property as documented by schema.org. The `build()` method should be called to
create an immutable concrete instance of that type. A `get[PropertyName]List`
method is defined for each property. The `get[PropertyName]List` method will
return an [`ImmutableList`]
(https://google.github.io/guava/releases/snapshot/api/docs/com/google/common/collect/ImmutableList.html)
containing all the values for the specific property. In order to add any custom
property into any schema.org type, the `addProperty` and `getProperty` methods
are defined in the interface for each schema.org type.

### DataType

[DataType](https://schema.org/DataType) is defined in the package
`com.google.schemaorg.core.datatype`. To create a primitive DataType object, the
static method `of()` in each type should be used.

For example:

*   Text.of("help")
*   URL.of("http://schema.org")
*   Time.of("08:32")
*   Date.of("2016-01-28")
*   DateTime.of("2016-01-28 12:00")
*   Number.of("42")
*   Integer.of(42)
*   Float.of(3.14)
*   Boolean has limited possible values of `True` and `False`. It is defined as
    an enum type in this library. `Boolean` is the interface and it has 2 enum
    values: `BooleanEnum.TRUE` and `BooleanEnum.FALSE`.

### Enumeration

Subtypes of [Enumeration](https://schema.org/Enumeration) are handled slightly
differently. For each Enumeration subtype in schema.org, a Java interface is
created which provides accessor methods for the properties of that type. The
name of the interface is the same name as the schema.org type. In addition, a
Java Enum class is also created to hold the enum values of that schema.org
Enumeration type. The name of the Enum class is type name with `Enum` appended.

For example, [ActionStatusType](http://schema.org/ActionStatusType) is a subtype
of [Enumeration](http://schema.org/Enumeration) in schema.org. It has the
following values:

*   ActiveActionStatus
*   CompletedActionStatus
*   FailedActionStatus
*   PotentialActionStatus

In the Java library, an interface named `ActionStatusType` is defined and a Java
Enum class named `ActionStatusTypeEnum` is defined which implements the
`ActionStatusType` interface. The `ActionStatusTypeEnum` contains the following
enum values:

*   `ACTIVE_ACTION_STATUS`
*   `COMPLETED_ACTION_STATUS`
*   `FAILED_ACTION_STATUS`
*   `POTENTIAL_ACTION_STATUS`

### JSON-LD

All the schema.org type builders also support setting the values for JSON-LD
keywords. Following methods are defined in the builder interface:

*   `addJsonLdContext` (Adds the [@context]
    (https://www.w3.org/TR/json-ld/#the-context) with a `JsonLdContext`. The
    [@base](https://www.w3.org/TR/json-ld/#base-iri) could be set by building a
    `JsonLdContext` using `JsonLdFactory.newContextBuilder()`. Examples can be
    found in [Example Code](#Example_Code). More JSON-LD keywords and custom
    term definition will be supported in future release.)
*   `setJsonLdId` (Sets the [@id]
    (https://www.w3.org/TR/json-ld/#node-identifiers) with the given string
    value.)
*   `setJsonLdReverse` (Sets the [@reverse]
    (https://www.w3.org/TR/json-ld/#reverse-properties) relationship between the
    current entity and the target entity.)
*   The JSON-LD serializer is able to determine appropriate `@context` url
    automatically based on serialized objects. So users don't need to explicitly
    set the `@context` URL.

## <a name='Example_Code'>Example Code</a>

### Serialization

```java
JsonLdSerializer serializer = new JsonLdSerializer(true /* setPrettyPrinting */);
DataFeed object =
    CoreFactory.newDataFeedBuilder()
        .addJsonLdContext(
            JsonLdFactory.newContextBuilder()
                .setBase("http://example.com/")
                .build())
        .addDataFeedElement(
            CoreFactory.newRecipeBuilder()
                .setJsonLdId("123456")
                .addName("recipe name")
                .addAuthor(CoreFactory.newPersonBuilder().addName("John Smith").build())
                .addIsFamilyFriendly(BooleanEnum.TRUE)
                .setJsonLdReverse(
                    CoreConstants.PROPERTY_RECIPE,
                    CoreFactory.newCookActionBuilder().setJsonLdId("54321").build())
                .build())
        .build();
try {
  String jsonLdStr = serializer.serialize(object);
} catch (JsonLdSyntaxException e) {
  // Errors related to JSON-LD format and schema.org terms in JSON-LD
} catch (JsonIOException e) {
  // Errors related to JSON format
}
```

Every addXXX() method that takes the immutable class built from the builder
class also has an overloaded convenience method that takes the builder class
itself as shown below:

```java
JsonLdSerializer serializer = new JsonLdSerializer(true /* setPrettyPrinting */);
DataFeed object =
    CoreFactory.newDataFeedBuilder()
        .addJsonLdContext(
            JsonLdFactory.newContextBuilder()
                .setBase("http://example.com/"))
        .addDataFeedElement(
            CoreFactory.newRecipeBuilder()
                .setJsonLdId("123456")
                .addName("recipe name")
                .addAuthor(CoreFactory.newPersonBuilder().addName("John Smith"))
                .addIsFamilyFriendly(BooleanEnum.TRUE)
                .setJsonLdReverse(
                    CoreConstants.PROPERTY_RECIPE,
                    CoreFactory.newCookActionBuilder().setJsonLdId("54321"))
        .build();
try {
  String jsonLdStr = serializer.serialize(object);
} catch (JsonLdSyntaxException e) {
  // Errors related to JSON-LD format and schema.org terms in JSON-LD
} catch (JsonIOException e) {
  // Errors related to JSON format
}
```

Multiple schema.org objects can be serialized by calling the overloaded method
`serialize(List<? extends Thing> objects)`.

### Deserialization

```java
JsonLdSerializer serializer = new JsonLdSerializer(true /* setPrettyPrinting */);
String jsonLd =
    "{\n"
        + "  \"@context\": [\n"
        + "    \"http://schema.org/\",\n"
        + "    {\n"
        + "      \"@base\": \"http://example.com/\"\n"
        + "    }\n"
        + "  ],\n"
        + "  \"@type\": \"DataFeed\",\n"
        + "  \"dataFeedElement\": {\n"
        + "    \"@type\": \"Recipe\",\n"
        + "    \"@id\": \"123456\",\n"
        + "    \"name\": \"recipe name\",\n"
        + "    \"author\": {\n"
        + "      \"@type\": \"Person\",\n"
        + "      \"name\": \"ABC DEF\"\n"
        + "    },\n"
        + "    \"isFamilyFriendly\": \"http://schema.org/True\",\n"
        + "    \"@reverse\": {\n"
        + "      \"recipe\": {\n"
        + "        \"@type\": \"CookAction\",\n"
        + "        \"@id\": \"54321\"\n"
        + "      }\n"
        + "    }\n"
        + "  }\n"
        + "}";
try {
    List<Thing> actual = serializer.deserialize(jsonLd);
    if ("http://schema.org/DataFeed".equals(actual.get(0).getFullTypeName()) {
    DataFeed dataFeed = (DataFeed) actual.get(0);
    List<ValueType> contexts = dataFeed.getJsonLdContextList();
    String url = ((JsonLdContext) contexts.get(0)).getUrl();
    String goog = ((JsonLdContext) contexts.get(1)).getTerm("goog");
    Recipe recipe = (Recipe) (dataFeed.getDataFeedElementList().get(0));
    String id = recipe.getJsonLdId();
    String recipeName = ((Text) recipe.getNameList().get(0)).getValue();
  }
} catch (JsonLdSyntaxException e) {
  // Errors related to JSON-LD format and schema.org terms in JSON-LD
} catch (JsonIOException e) {
  // Errors related to JSON format
}

```

Limitations of current JSON-LD deserialization are given below:

*   Every JSON-LD entity should have a `@type`. Its value must be a full
    schema.org type name (e.g. "http://schema.org/Thing") or a short type name
    (e.g. "Thing").
*   The parser supports only http://schema.org and http://schema.googleapis.com
    terms. It assumes the context is always "http://schema.org" or
    "http://schema.googleapis.com". And all relative IRIs are resolved relative
    to "http://schema.org/" or "http://schema.googleapis.com/".
*   The parser doesn't support [compact IRI]
    (https://www.w3.org/TR/json-ld/#compact-iris).
*   The JSON-LD format does not contain sufficient information to determine the
    exact subtype of the `DataType` hierarchy. The parser does not currently
    understand the [coercion rule]
    (https://www.w3.org/TR/json-ld/#type-coercion). Therefore, all numerical
    values are parsed on a best-effort basis to the numerical type that the
    property accepts. All text values are parsed to be
    `com.google.schemaorg.core.datatype.Text`. You should not expect to see
    other types such as `URL`, `Date`, `Time`, `DateTime`, etc..

Future versions of this client library may remove these limitations.

## <a name='Dependencies'>Dependencies</a>

This library depends on following public libraries:

*   [Google Gson](https://github.com/google/gson)
*   [Google Core Libraries for Java](https://github.com/google/guava)
*   [JSR 305](http://mvnrepository.com/artifact/com.google.code.findbugs/jsr305)

To add dependency using [Gradle](https://docs.gradle.org/current/userguide/userguide.html):

*   Use remote repository

```
repositories {
    mavenCentral()
}

dependencies {
    compile 'com.google.code.findbugs:jsr305:3.0.1'
    compile 'com.google.guava:guava:19.0'
    compile 'com.google.code.gson:gson:2.5'
    compile files('schema-org-client-1.0.0/schema-org-client-1.0.0.jar')
}
```

*   Use local files

```
dependencies {
    compile fileTree(dir: 'schema-org-client-1.0.0/lib', include: '*.jar')
    compile files('schema-org-client-1.0.0/schema-org-client-1.0.0.jar')
}
```

## <a name='Links'>Links</a>

-   [schema.org](https://schema.org/)
-   [JSON-LD](https://json-ld.org)
