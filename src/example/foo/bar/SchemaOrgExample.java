package foo.bar;

import com.google.common.collect.ImmutableList;
import com.google.schemaorg.JsonLdFactory;
import com.google.schemaorg.JsonLdSerializer;
import com.google.schemaorg.core.BooleanEnum;
import com.google.schemaorg.core.CoreConstants;
import com.google.schemaorg.core.CoreFactory;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.goog.GoogFactory;

import java.util.List;

public class SchemaOrgExample {
  public static void main(String[] args) throws Exception {
    String jsonld = createJsonLd();

    List<Thing> list = new JsonLdSerializer(true).deserialize(jsonld);
    System.out.println(list.toString()); 
  }

  private static String createJsonLd() throws Exception {
    List<Thing> objects =
        ImmutableList.<Thing>of(
            CoreFactory.newDataFeedBuilder()
                .addJsonLdContext(
                    JsonLdFactory.newContextBuilder()
                        .setBase("http://schema.googleapis.com/"))
                .addDataFeedElement(
                    CoreFactory.newRecipeBuilder()
                        .setJsonLdId("123456")
                        .addName("Grandma's Holiday Apple Pie")
                        .addAuthor(CoreFactory.newPersonBuilder().addName("Carol Smith"))
                        .addDatePublished("2009-11-05")
                        .addDescription("This is my grandmother's apple pie recipe. I like to add adash of nummeg.")
                        .addAggregateRating(
                            CoreFactory.newAggregateRatingBuilder().addRatingValue("4.0").addReviewCount("35"))
                        .addPrepTime("PT30M")
                        .addCookTime("PT1H")
                        .addTotalTime("PT1H30M")
                        .addRecipeYield("1 9\" pie (8 servings)")
                        .addNutrition(
                            CoreFactory.newNutritionInformationBuilder()
                                .addServingSize("1 medium slice")
                                .addCalories("250 cal")
                                .addFatContent("12 g"))
                        .addRecipeIngredient("Thinly-sliced apples: 6 cups")
                        .addRecipeIngredient("White sugar: 3/4 cup")
                        .addIsFamilyFriendly(BooleanEnum.TRUE)
                        .addProperty("property1", "property1")
                        .addProperty("property1", "property2")
                        .addProperty("property2", CoreFactory.newThingBuilder()
                                  .addName("thing name"))
                        .addProperty("property3", GoogFactory.newEntitySearchResultBuilder()
                                  .addName("new entity search result")
                                  .build())
                        .setJsonLdReverse(
                            CoreConstants.PROPERTY_RECIPE,
                            CoreFactory.newCookActionBuilder().setJsonLdId("54321"))
                        .setJsonLdReverse(
                            "reverse property",
                            CoreFactory.newThingBuilder().build()))
                .build());
    return new JsonLdSerializer(true).serialize(objects);
  }
}
