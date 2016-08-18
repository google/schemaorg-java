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

package com.google.schemaorg.core;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link NutritionInformation}. */
public class NutritionInformationImpl extends StructuredValueImpl implements NutritionInformation {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CALORIES);

    builder.add(CoreConstants.PROPERTY_CARBOHYDRATE_CONTENT);

    builder.add(CoreConstants.PROPERTY_CHOLESTEROL_CONTENT);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_FAT_CONTENT);

    builder.add(CoreConstants.PROPERTY_FIBER_CONTENT);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROTEIN_CONTENT);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SATURATED_FAT_CONTENT);

    builder.add(CoreConstants.PROPERTY_SERVING_SIZE);

    builder.add(CoreConstants.PROPERTY_SODIUM_CONTENT);

    builder.add(CoreConstants.PROPERTY_SUGAR_CONTENT);

    builder.add(CoreConstants.PROPERTY_TRANS_FAT_CONTENT);

    builder.add(CoreConstants.PROPERTY_UNSATURATED_FAT_CONTENT);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<NutritionInformation.Builder>
      implements NutritionInformation.Builder {

    @Override
    public NutritionInformation.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public NutritionInformation.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public NutritionInformation.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addCalories(Energy value) {
      return addProperty(CoreConstants.PROPERTY_CALORIES, value);
    }

    @Override
    public NutritionInformation.Builder addCalories(Energy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CALORIES, value.build());
    }

    @Override
    public NutritionInformation.Builder addCalories(String value) {
      return addProperty(CoreConstants.PROPERTY_CALORIES, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addCarbohydrateContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_CARBOHYDRATE_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addCarbohydrateContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CARBOHYDRATE_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addCarbohydrateContent(String value) {
      return addProperty(CoreConstants.PROPERTY_CARBOHYDRATE_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addCholesterolContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_CHOLESTEROL_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addCholesterolContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CHOLESTEROL_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addCholesterolContent(String value) {
      return addProperty(CoreConstants.PROPERTY_CHOLESTEROL_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public NutritionInformation.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addFatContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_FAT_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addFatContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FAT_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addFatContent(String value) {
      return addProperty(CoreConstants.PROPERTY_FAT_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addFiberContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_FIBER_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addFiberContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FIBER_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addFiberContent(String value) {
      return addProperty(CoreConstants.PROPERTY_FIBER_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public NutritionInformation.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public NutritionInformation.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public NutritionInformation.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public NutritionInformation.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public NutritionInformation.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public NutritionInformation.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public NutritionInformation.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public NutritionInformation.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public NutritionInformation.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addProteinContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_PROTEIN_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addProteinContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROTEIN_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addProteinContent(String value) {
      return addProperty(CoreConstants.PROPERTY_PROTEIN_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public NutritionInformation.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addSaturatedFatContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_SATURATED_FAT_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addSaturatedFatContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SATURATED_FAT_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addSaturatedFatContent(String value) {
      return addProperty(CoreConstants.PROPERTY_SATURATED_FAT_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addServingSize(Text value) {
      return addProperty(CoreConstants.PROPERTY_SERVING_SIZE, value);
    }

    @Override
    public NutritionInformation.Builder addServingSize(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVING_SIZE, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addSodiumContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_SODIUM_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addSodiumContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SODIUM_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addSodiumContent(String value) {
      return addProperty(CoreConstants.PROPERTY_SODIUM_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addSugarContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_SUGAR_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addSugarContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUGAR_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addSugarContent(String value) {
      return addProperty(CoreConstants.PROPERTY_SUGAR_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addTransFatContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_TRANS_FAT_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addTransFatContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRANS_FAT_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addTransFatContent(String value) {
      return addProperty(CoreConstants.PROPERTY_TRANS_FAT_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addUnsaturatedFatContent(Mass value) {
      return addProperty(CoreConstants.PROPERTY_UNSATURATED_FAT_CONTENT, value);
    }

    @Override
    public NutritionInformation.Builder addUnsaturatedFatContent(Mass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_UNSATURATED_FAT_CONTENT, value.build());
    }

    @Override
    public NutritionInformation.Builder addUnsaturatedFatContent(String value) {
      return addProperty(CoreConstants.PROPERTY_UNSATURATED_FAT_CONTENT, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public NutritionInformation.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public NutritionInformation.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public NutritionInformation.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public NutritionInformation.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public NutritionInformation.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public NutritionInformation.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public NutritionInformation build() {
      return new NutritionInformationImpl(properties, reverseMap);
    }
  }

  public NutritionInformationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_NUTRITION_INFORMATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCaloriesList() {
    return getProperty(CoreConstants.PROPERTY_CALORIES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCarbohydrateContentList() {
    return getProperty(CoreConstants.PROPERTY_CARBOHYDRATE_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCholesterolContentList() {
    return getProperty(CoreConstants.PROPERTY_CHOLESTEROL_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFatContentList() {
    return getProperty(CoreConstants.PROPERTY_FAT_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFiberContentList() {
    return getProperty(CoreConstants.PROPERTY_FIBER_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProteinContentList() {
    return getProperty(CoreConstants.PROPERTY_PROTEIN_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSaturatedFatContentList() {
    return getProperty(CoreConstants.PROPERTY_SATURATED_FAT_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServingSizeList() {
    return getProperty(CoreConstants.PROPERTY_SERVING_SIZE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSodiumContentList() {
    return getProperty(CoreConstants.PROPERTY_SODIUM_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSugarContentList() {
    return getProperty(CoreConstants.PROPERTY_SUGAR_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTransFatContentList() {
    return getProperty(CoreConstants.PROPERTY_TRANS_FAT_CONTENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUnsaturatedFatContentList() {
    return getProperty(CoreConstants.PROPERTY_UNSATURATED_FAT_CONTENT);
  }
}
