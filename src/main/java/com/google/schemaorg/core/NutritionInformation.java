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
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a
 * href="http://schema.org/NutritionInformation">http://schema.org/NutritionInformation</a>.
 */
public interface NutritionInformation extends StructuredValue {

  /**
   * Builder interface of <a
   * href="http://schema.org/NutritionInformation">http://schema.org/NutritionInformation</a>.
   */
  public interface Builder extends StructuredValue.Builder {

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

    @Override
    Builder setJsonLdId(@Nullable String value);

    @Override
    Builder setJsonLdReverse(String property, Thing obj);

    @Override
    Builder setJsonLdReverse(String property, Thing.Builder builder);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property calories. */
    Builder addCalories(Energy value);

    /** Add a value to property calories. */
    Builder addCalories(Energy.Builder value);

    /** Add a value to property calories. */
    Builder addCalories(String value);

    /** Add a value to property carbohydrateContent. */
    Builder addCarbohydrateContent(Mass value);

    /** Add a value to property carbohydrateContent. */
    Builder addCarbohydrateContent(Mass.Builder value);

    /** Add a value to property carbohydrateContent. */
    Builder addCarbohydrateContent(String value);

    /** Add a value to property cholesterolContent. */
    Builder addCholesterolContent(Mass value);

    /** Add a value to property cholesterolContent. */
    Builder addCholesterolContent(Mass.Builder value);

    /** Add a value to property cholesterolContent. */
    Builder addCholesterolContent(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property fatContent. */
    Builder addFatContent(Mass value);

    /** Add a value to property fatContent. */
    Builder addFatContent(Mass.Builder value);

    /** Add a value to property fatContent. */
    Builder addFatContent(String value);

    /** Add a value to property fiberContent. */
    Builder addFiberContent(Mass value);

    /** Add a value to property fiberContent. */
    Builder addFiberContent(Mass.Builder value);

    /** Add a value to property fiberContent. */
    Builder addFiberContent(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property proteinContent. */
    Builder addProteinContent(Mass value);

    /** Add a value to property proteinContent. */
    Builder addProteinContent(Mass.Builder value);

    /** Add a value to property proteinContent. */
    Builder addProteinContent(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property saturatedFatContent. */
    Builder addSaturatedFatContent(Mass value);

    /** Add a value to property saturatedFatContent. */
    Builder addSaturatedFatContent(Mass.Builder value);

    /** Add a value to property saturatedFatContent. */
    Builder addSaturatedFatContent(String value);

    /** Add a value to property servingSize. */
    Builder addServingSize(Text value);

    /** Add a value to property servingSize. */
    Builder addServingSize(String value);

    /** Add a value to property sodiumContent. */
    Builder addSodiumContent(Mass value);

    /** Add a value to property sodiumContent. */
    Builder addSodiumContent(Mass.Builder value);

    /** Add a value to property sodiumContent. */
    Builder addSodiumContent(String value);

    /** Add a value to property sugarContent. */
    Builder addSugarContent(Mass value);

    /** Add a value to property sugarContent. */
    Builder addSugarContent(Mass.Builder value);

    /** Add a value to property sugarContent. */
    Builder addSugarContent(String value);

    /** Add a value to property transFatContent. */
    Builder addTransFatContent(Mass value);

    /** Add a value to property transFatContent. */
    Builder addTransFatContent(Mass.Builder value);

    /** Add a value to property transFatContent. */
    Builder addTransFatContent(String value);

    /** Add a value to property unsaturatedFatContent. */
    Builder addUnsaturatedFatContent(Mass value);

    /** Add a value to property unsaturatedFatContent. */
    Builder addUnsaturatedFatContent(Mass.Builder value);

    /** Add a value to property unsaturatedFatContent. */
    Builder addUnsaturatedFatContent(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article.Builder value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(String value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification.Builder value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(String value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The value of the property.
     */
    Builder addProperty(String name, SchemaOrgType value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param builder The schema.org object builder for the property value.
     */
    Builder addProperty(String name, Thing.Builder builder);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The string value of the property.
     */
    Builder addProperty(String name, String value);

    /** Build a {@link NutritionInformation} object. */
    NutritionInformation build();
  }

  /**
   * Returns the value list of property calories. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCaloriesList();

  /**
   * Returns the value list of property carbohydrateContent. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getCarbohydrateContentList();

  /**
   * Returns the value list of property cholesterolContent. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getCholesterolContentList();

  /**
   * Returns the value list of property fatContent. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getFatContentList();

  /**
   * Returns the value list of property fiberContent. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getFiberContentList();

  /**
   * Returns the value list of property proteinContent. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getProteinContentList();

  /**
   * Returns the value list of property saturatedFatContent. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getSaturatedFatContentList();

  /**
   * Returns the value list of property servingSize. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getServingSizeList();

  /**
   * Returns the value list of property sodiumContent. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getSodiumContentList();

  /**
   * Returns the value list of property sugarContent. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getSugarContentList();

  /**
   * Returns the value list of property transFatContent. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getTransFatContentList();

  /**
   * Returns the value list of property unsaturatedFatContent. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getUnsaturatedFatContentList();
}
