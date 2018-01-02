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
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a href="http://schema.org/PeopleAudience">http://schema.org/PeopleAudience</a>.
 */
public interface PeopleAudience extends Audience {

  /**
   * Builder interface of <a
   * href="http://schema.org/PeopleAudience">http://schema.org/PeopleAudience</a>.
   */
  public interface Builder extends Audience.Builder {

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

    /** Add a value to property audienceType. */
    Builder addAudienceType(Text value);

    /** Add a value to property audienceType. */
    Builder addAudienceType(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property geographicArea. */
    Builder addGeographicArea(AdministrativeArea value);

    /** Add a value to property geographicArea. */
    Builder addGeographicArea(AdministrativeArea.Builder value);

    /** Add a value to property geographicArea. */
    Builder addGeographicArea(String value);

    /** Add a value to property healthCondition. */
    Builder addHealthCondition(MedicalCondition value);

    /** Add a value to property healthCondition. */
    Builder addHealthCondition(MedicalCondition.Builder value);

    /** Add a value to property healthCondition. */
    Builder addHealthCondition(String value);

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

    /** Add a value to property requiredGender. */
    Builder addRequiredGender(Text value);

    /** Add a value to property requiredGender. */
    Builder addRequiredGender(String value);

    /** Add a value to property requiredMaxAge. */
    Builder addRequiredMaxAge(Integer value);

    /** Add a value to property requiredMaxAge. */
    Builder addRequiredMaxAge(String value);

    /** Add a value to property requiredMinAge. */
    Builder addRequiredMinAge(Integer value);

    /** Add a value to property requiredMinAge. */
    Builder addRequiredMinAge(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property suggestedGender. */
    Builder addSuggestedGender(Text value);

    /** Add a value to property suggestedGender. */
    Builder addSuggestedGender(String value);

    /** Add a value to property suggestedMaxAge. */
    Builder addSuggestedMaxAge(Number value);

    /** Add a value to property suggestedMaxAge. */
    Builder addSuggestedMaxAge(String value);

    /** Add a value to property suggestedMinAge. */
    Builder addSuggestedMinAge(Number value);

    /** Add a value to property suggestedMinAge. */
    Builder addSuggestedMinAge(String value);

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

    /** Build a {@link PeopleAudience} object. */
    PeopleAudience build();
  }

  /**
   * Returns the value list of property healthCondition. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getHealthConditionList();

  /**
   * Returns the value list of property requiredGender. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getRequiredGenderList();

  /**
   * Returns the value list of property requiredMaxAge. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getRequiredMaxAgeList();

  /**
   * Returns the value list of property requiredMinAge. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getRequiredMinAgeList();

  /**
   * Returns the value list of property suggestedGender. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getSuggestedGenderList();

  /**
   * Returns the value list of property suggestedMaxAge. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getSuggestedMaxAgeList();

  /**
   * Returns the value list of property suggestedMinAge. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getSuggestedMinAgeList();
}
