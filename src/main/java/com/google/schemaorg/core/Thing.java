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
import com.google.schemaorg.JsonLdNode;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/Thing">http://schema.org/Thing</a>. */
public interface Thing extends JsonLdNode, SchemaOrgType {

  /** Builder interface of <a href="http://schema.org/Thing">http://schema.org/Thing</a>. */
  public interface Builder extends JsonLdNode.Builder, SchemaOrgType.Builder {

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

    /** Build a {@link Thing} object. */
    Thing build();
  }

  /**
   * Returns the value list of property additionalType. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAdditionalTypeList();

  /**
   * Returns the value list of property alternateName. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAlternateNameList();

  /**
   * Returns the value list of property description. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDescriptionList();

  /**
   * Returns the value list of property image. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getImageList();

  /**
   * Returns the value list of property mainEntityOfPage. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getMainEntityOfPageList();

  /**
   * Returns the value list of property name. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getNameList();

  /**
   * Returns the value list of property potentialAction. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPotentialActionList();

  /**
   * Returns the value list of property sameAs. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSameAsList();

  /**
   * Returns the value list of property url. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getUrlList();

  /**
   * Returns the value list of property detailedDescription. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getDetailedDescriptionList();

  /**
   * Returns the value list of property popularityScore. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPopularityScoreList();
}
