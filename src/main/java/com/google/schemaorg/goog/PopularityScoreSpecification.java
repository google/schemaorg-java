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

package com.google.schemaorg.goog;

import com.google.common.collect.ImmutableList;
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.Action;
import com.google.schemaorg.core.Article;
import com.google.schemaorg.core.Boolean;
import com.google.schemaorg.core.CreativeWork;
import com.google.schemaorg.core.GeoShape;
import com.google.schemaorg.core.ImageObject;
import com.google.schemaorg.core.Intangible;
import com.google.schemaorg.core.Place;
import com.google.schemaorg.core.StructuredValue;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import javax.annotation.Nullable;

/**
 * Interface of <a
 * href="http://schema.googleapis.com/PopularityScoreSpecification">http://schema.googleapis.com/PopularityScoreSpecification</a>.
 */
public interface PopularityScoreSpecification extends Intangible {

  /**
   * Builder interface of <a
   * href="http://schema.googleapis.com/PopularityScoreSpecification">http://schema.googleapis.com/PopularityScoreSpecification</a>.
   */
  public interface Builder extends Intangible.Builder {

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

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(GeoShape value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(GeoShape.Builder value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(Place value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(Place.Builder value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(Text value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(String value);

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

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property value. */
    Builder addValue(Boolean value);

    /** Add a value to property value. */
    Builder addValue(Number value);

    /** Add a value to property value. */
    Builder addValue(StructuredValue value);

    /** Add a value to property value. */
    Builder addValue(StructuredValue.Builder value);

    /** Add a value to property value. */
    Builder addValue(Text value);

    /** Add a value to property value. */
    Builder addValue(String value);

    /** Add a value to property applicableKeywordOrGenre. */
    Builder addApplicableKeywordOrGenre(Text value);

    /** Add a value to property applicableKeywordOrGenre. */
    Builder addApplicableKeywordOrGenre(String value);

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

    /** Build a {@link PopularityScoreSpecification} object. */
    PopularityScoreSpecification build();
  }

  /**
   * Returns the value list of property eligibleRegion. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getEligibleRegionList();

  /**
   * Returns the value list of property value. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getValueList();

  /**
   * Returns the value list of property applicableKeywordOrGenre. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getApplicableKeywordOrGenreList();
}
