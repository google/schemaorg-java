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

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import com.google.schemaorg.core.BooleanEnum;
import com.google.schemaorg.core.CoreConstants;
import com.google.schemaorg.core.CoreFactory;
import com.google.schemaorg.core.DataFeed;
import com.google.schemaorg.core.Recipe;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.goog.GoogFactory;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Unit tests for {@link JsonLdSerializer}. */
@RunWith(JUnit4.class)
public class JsonLdSerializerTest {

  private final JsonLdSerializer serializer = new JsonLdSerializer(true /* setPrettyPrinting */);

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void testSerialize() throws Exception {
    List<DataFeed> objects =
        ImmutableList.of(
            CoreFactory.newDataFeedBuilder()
                .addJsonLdContext(JsonLdFactory.newContextBuilder().setBase("http://example.com/"))
                .addDataFeedElement(
                    CoreFactory.newRecipeBuilder()
                        .setJsonLdId("123456")
                        .addName("recipe name")
                        .addAuthor(CoreFactory.newPersonBuilder().addName("ABC DEF"))
                        .addIsFamilyFriendly(BooleanEnum.TRUE)
                        .setJsonLdReverse(
                            CoreConstants.PROPERTY_RECIPE,
                            CoreFactory.newCookActionBuilder().setJsonLdId("54321")))
                .build());
    String actual = serializer.serialize(objects);
    assertThat(actual)
        .isEqualTo(
            "{\n"
                + "  \"@context\": [\n"
                + "    \"http://schema.org\",\n"
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
                + "}");
  }

  @Test
  public void testSerialize_googType() throws Exception {
    DataFeed object =
        CoreFactory.newDataFeedBuilder()
            .addJsonLdContext(JsonLdFactory.newContextBuilder().setBase("http://example.com/"))
            .addDataFeedElement(
                GoogFactory.newEntitySearchResultBuilder()
                    .setJsonLdId("123456")
                    .addName("recipe name")
                    .addImage(CoreFactory.newImageObjectBuilder().addName("ABC DEF")))
            .build();
    String actual = serializer.serialize(object);
    assertThat(actual)
        .isEqualTo(
            "{\n"
                + "  \"@context\": [\n"
                + "    \"http://schema.googleapis.com\",\n"
                + "    {\n"
                + "      \"@base\": \"http://example.com/\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"@type\": \"DataFeed\",\n"
                + "  \"dataFeedElement\": {\n"
                + "    \"@type\": \"EntitySearchResult\",\n"
                + "    \"@id\": \"123456\",\n"
                + "    \"name\": \"recipe name\",\n"
                + "    \"image\": {\n"
                + "      \"@type\": \"ImageObject\",\n"
                + "      \"name\": \"ABC DEF\"\n"
                + "    }\n"
                + "  }\n"
                + "}");
  }

  @Test
  public void testSerialize_googProperty() throws Exception {
    DataFeed object =
        CoreFactory.newDataFeedBuilder()
            .addJsonLdContext(JsonLdFactory.newContextBuilder().setBase("http://example.com/"))
            .addDataFeedElement(
                CoreFactory.newRecipeBuilder()
                    .setJsonLdId("123456")
                    .addName("recipe name")
                    .addAuthor(CoreFactory.newPersonBuilder().addName("ABC DEF"))
                    .addIsFamilyFriendly(BooleanEnum.TRUE)
                    .addDetailedDescription("detailed description")
                    .setJsonLdReverse(
                        CoreConstants.PROPERTY_RECIPE,
                        CoreFactory.newCookActionBuilder().setJsonLdId("54321")))
            .build();
    String actual = serializer.serialize(object);
    assertThat(actual)
        .isEqualTo(
            "{\n"
                + "  \"@context\": [\n"
                + "    \"http://schema.googleapis.com\",\n"
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
                + "    \"detailedDescription\": \"detailed description\",\n"
                + "    \"@reverse\": {\n"
                + "      \"recipe\": {\n"
                + "        \"@type\": \"CookAction\",\n"
                + "        \"@id\": \"54321\"\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + "}");
  }

  @Test
  public void testSerialize_customProperty() throws Exception {
    Thing object =
        CoreFactory.newThingBuilder()
            .addJsonLdContext(JsonLdFactory.newContextBuilder().setBase("http://example.com/"))
            .addName("John")
            .addProperty("customProperty", Text.of("value"))
            .addProperty("url", "http://example.com")
            .addProperty("place", CoreFactory.newPlaceBuilder().addName("place"))
            .build();
    String actual = serializer.serialize(object);
    assertThat(actual)
        .isEqualTo(
            "{\n"
                + "  \"@context\": [\n"
                + "    \"http://schema.org\",\n"
                + "    {\n"
                + "      \"@base\": \"http://example.com/\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"@type\": \"Thing\",\n"
                + "  \"name\": \"John\",\n"
                + "  \"customProperty\": \"value\",\n"
                + "  \"url\": \"http://example.com\",\n"
                + "  \"place\": {\n"
                + "    \"@type\": \"Place\",\n"
                + "    \"name\": \"place\"\n"
                + "  }\n"
                + "}");
  }

  @Test
  public void testSerialize_enumeration() throws Exception {
    thrown.expect(JsonLdSyntaxException.class);
    thrown.expectMessage("Enumeration value 'http://schema.org/True' cannot be a JSON-LD entity");

    serializer.serialize(BooleanEnum.TRUE);
  }

  @Test
  public void testDeserialize() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": [\n"
            + "    \"http://schema.org\",\n"
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
            + "  },\n"
            + "  \"customName\": \"custom value\"\n"
            + "}";
    List<Thing> actual = serializer.deserialize(jsonLd);
    List<Thing> expected =
        ImmutableList.<Thing>of(
            CoreFactory.newDataFeedBuilder()
                .addJsonLdContext(JsonLdFactory.newContextUrl("http://schema.org"))
                .addJsonLdContext(JsonLdFactory.newContextBuilder().setBase("http://example.com/"))
                .addDataFeedElement(
                    CoreFactory.newRecipeBuilder()
                        .setJsonLdId("123456")
                        .addName("recipe name")
                        .addAuthor(CoreFactory.newPersonBuilder().addName("ABC DEF"))
                        .addIsFamilyFriendly(BooleanEnum.TRUE)
                        .setJsonLdReverse(
                            "recipe", CoreFactory.newCookActionBuilder().setJsonLdId("54321")))
                .addProperty("customName", "custom value")
                .build());
    assertThat(actual.size()).isEqualTo(expected.size());
    for (int i = 0; i < actual.size(); i++) {
      assertThat(actual.get(i).contentEquals(expected.get(i))).isTrue();
    }
  }

  @Test
  public void testDeserialize_wrongTopLevelObject() throws Exception {
    String jsonLd = "\"string\"";
    thrown.expect(JsonLdSyntaxException.class);
    thrown.expectMessage(
        "Invalid top level JSON-LD token STRING. Should be an object or an array of objects");

    serializer.deserialize(jsonLd);
  }

  @Test
  public void testDeserialize_noTypeValue() throws Exception {
    String jsonLd =
        "{\n"
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

    List<Thing> actual = serializer.deserialize(jsonLd);
    List<Thing> expected =
        ImmutableList.<Thing>of(
            CoreFactory.newThingBuilder()
                .addProperty(
                    "dataFeedElement",
                    CoreFactory.newRecipeBuilder()
                        .setJsonLdId("123456")
                        .addName("recipe name")
                        .addAuthor(CoreFactory.newPersonBuilder().addName("ABC DEF"))
                        .addIsFamilyFriendly(BooleanEnum.TRUE)
                        .setJsonLdReverse(
                            "recipe", CoreFactory.newCookActionBuilder().setJsonLdId("54321")))
                .build());

    assertThat(actual.size()).isEqualTo(expected.size());
    for (int i = 0; i < actual.size(); i++) {
      assertThat(actual.get(i).contentEquals(expected.get(i))).isTrue();
    }
  }

  @Test
  public void testDeserialize_invalidReverseValue() throws Exception {
    String jsonLd =
        "{\n"
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
            + "      \"recipe\": 123456\n"
            + "    }\n"
            + "  }\n"
            + "}";
    thrown.expect(JsonLdSyntaxException.class);
    thrown.expectMessage(
        "Invalid value token NUMBER in @reverse. Should be a JSON-LD object or an "
            + "array of JSON-LD objects");

    serializer.deserialize(jsonLd);
  }

  @Test
  public void testDeserialize_customReverseProperty() throws Exception {
    String jsonLd =
        "{\n"
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
            + "      \"property\": {\n"
            + "        \"@type\": \"CookAction\",\n"
            + "        \"@id\": \"54321\"\n"
            + "      }\n"
            + "    }\n"
            + "  }\n"
            + "}";

    List<Thing> actual = serializer.deserialize(jsonLd);
    Recipe recipe = (Recipe) (actual.get(0).getProperty("dataFeedElement").get(0));
    assertThat(recipe.getJsonLdReverseMap()).hasSize(1);
    assertThat(recipe.getJsonLdReverseMap()).containsKey("property");
  }

  @Test
  public void testDeserialize_invalidContextTerm() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": [\n"
            + "    \"http://schema.org\",\n"
            + "    {\n"
            + "      \"test\": \"abcd\"\n"
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
    thrown.expect(JsonLdSyntaxException.class);
    thrown.expectMessage("Unsupported 'test' in JSON-LD context");

    serializer.deserialize(jsonLd);
  }

  @Test
  public void testDeserialize_invalidBaseValue() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": [\n"
            + "    \"http://schema.org\",\n"
            + "    {\n"
            + "      \"@base\": 1234\n"
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
    thrown.expect(JsonLdSyntaxException.class);
    thrown.expectMessage("The value of @base is 'NUMBER', should be a string");

    serializer.deserialize(jsonLd);
  }

  @Test
  public void testDeserialize_invalidPropertyValue() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": [\n"
            + "    \"https://schema.org/\"\n"
            + "  ],\n"
            + "  \"@type\": \"DataFeed\",\n"
            + "  \"dataFeedElement\": {\n"
            + "    \"@type\": \"Recipe\",\n"
            + "    \"@id\": \"123456\",\n"
            + "    \"name\": \"name\",\n"
            + "    \"author\": 12345,\n"
            + "    \"isFamilyFriendly\": \"http://schema.org/True\",\n"
            + "    \"@reverse\": {\n"
            + "      \"recipe\": {\n"
            + "        \"@type\": \"CookAction\",\n"
            + "        \"@id\": \"54321\"\n"
            + "      }\n"
            + "    }\n"
            + "  }\n"
            + "}";
    thrown.expect(JsonLdSyntaxException.class);
    thrown.expectMessage(
        "Could not call method 'addAuthor' on 'com.google.schemaorg.core.Recipe$Builder': check "
            + "property name and expected value type");

    serializer.deserialize(jsonLd);
  }

  @Test
  public void testDeserialize_invalidTypeValue() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": [\n"
            + "    \"https://schema.googleapis.com\"\n"
            + "  ],\n"
            + "  \"@type\": \"abcd\",\n"
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
    thrown.expect(JsonLdSyntaxException.class);
    thrown.expectMessage("JSON-LD Entity type abcd is not a valid schema.org type");

    serializer.deserialize(jsonLd);
  }

  @Test
  public void testDeserialize_contextNullValue() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": [\n"
            + "    null,\n"
            + "    \"http://schema.org/\",\n"
            + "    {\n"
            + "      \"@base\": null\n"
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
    List<Thing> actual = serializer.deserialize(jsonLd);
    List<Thing> expected =
        ImmutableList.<Thing>of(
            CoreFactory.newDataFeedBuilder()
                .addJsonLdContext((JsonLdContext) null)
                .addJsonLdContext(JsonLdFactory.newContextUrl("http://schema.org/"))
                .addJsonLdContext(JsonLdFactory.newContextBuilder().setBase(null))
                .addDataFeedElement(
                    CoreFactory.newRecipeBuilder()
                        .setJsonLdId("123456")
                        .addName("recipe name")
                        .addAuthor(CoreFactory.newPersonBuilder().addName("ABC DEF"))
                        .addIsFamilyFriendly(BooleanEnum.TRUE)
                        .setJsonLdReverse(
                            "recipe", CoreFactory.newCookActionBuilder().setJsonLdId("54321")))
                .build());
    assertThat(actual.size()).isEqualTo(expected.size());
    for (int i = 0; i < actual.size(); i++) {
      assertThat(actual.get(i).contentEquals(expected.get(i))).isTrue();
    }
  }

  @Test
  public void testDeserialize_parseConcreteDataType() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": \"http://schema.org/\",\n"
            + "  \"@type\": \"DataFeed\",\n"
            + "  \"dataFeedElement\": {\n"
            + "    \"@type\": \"Product\",\n"
            + "    \"@id\": \"123456\",\n"
            + "    \"name\": \"Smith\",\n"
            + "    \"url\": \"http://example.com\",\n"
            + "    \"purchaseDate\": \"2014-1-1\",\n"
            + "    \"aggregateRating\": {\n"
            + "        \"@type\": \"AggregateRating\",\n"
            + "        \"reviewCount\": 100\n"
            + "    }\n"
            + "  }\n"
            + "}";
    List<Thing> actual = serializer.deserialize(jsonLd);
    List<Thing> expected =
        ImmutableList.<Thing>of(
            CoreFactory.newDataFeedBuilder()
                .addJsonLdContext(JsonLdFactory.newContextUrl("http://schema.org/"))
                .addDataFeedElement(
                    CoreFactory.newProductBuilder()
                        .setJsonLdId("123456")
                        .addName("Smith")
                        .addUrl("http://example.com")
                        .addPurchaseDate("2014-1-1")
                        .addAggregateRating(
                            CoreFactory.newAggregateRatingBuilder()
                                .addReviewCount(Integer.of(100))))
                .build());
    assertThat(actual.size()).isEqualTo(expected.size());
    for (int i = 0; i < actual.size(); i++) {
      assertThat(actual.get(i).contentEquals(expected.get(i))).isTrue();
    }
  }

  @Test
  public void testDeserialize_anyPropertyWithString() throws Exception {
    String jsonLd =
        "{\n"
            + "  \"@context\": \"http://schema.org/\",\n"
            + "  \"@type\": \"DataFeed\",\n"
            + "  \"dataFeedElement\": \"abcdefg\"\n"
            + "}";
    List<Thing> actual = serializer.deserialize(jsonLd);
    List<Thing> expected =
        ImmutableList.<Thing>of(
            CoreFactory.newDataFeedBuilder()
                .addJsonLdContext(JsonLdFactory.newContextUrl("http://schema.org/"))
                .addDataFeedElement("abcdefg")
                .build());
    assertThat(actual.size()).isEqualTo(expected.size());
    for (int i = 0; i < actual.size(); i++) {
      assertThat(actual.get(i).contentEquals(expected.get(i))).isTrue();
    }
  }
}
