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

/** Interface of <a href="http://schema.org/EntryPoint">http://schema.org/EntryPoint</a>. */
public interface EntryPoint extends Intangible {

  /**
   * Builder interface of <a href="http://schema.org/EntryPoint">http://schema.org/EntryPoint</a>.
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

    /** Add a value to property actionApplication. */
    Builder addActionApplication(SoftwareApplication value);

    /** Add a value to property actionApplication. */
    Builder addActionApplication(SoftwareApplication.Builder value);

    /** Add a value to property actionApplication. */
    Builder addActionApplication(String value);

    /** Add a value to property actionPlatform. */
    Builder addActionPlatform(Text value);

    /** Add a value to property actionPlatform. */
    Builder addActionPlatform(URL value);

    /** Add a value to property actionPlatform. */
    Builder addActionPlatform(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property application. */
    Builder addApplication(SoftwareApplication value);

    /** Add a value to property application. */
    Builder addApplication(SoftwareApplication.Builder value);

    /** Add a value to property application. */
    Builder addApplication(String value);

    /** Add a value to property contentType. */
    Builder addContentType(Text value);

    /** Add a value to property contentType. */
    Builder addContentType(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property encodingType. */
    Builder addEncodingType(Text value);

    /** Add a value to property encodingType. */
    Builder addEncodingType(String value);

    /** Add a value to property httpMethod. */
    Builder addHttpMethod(Text value);

    /** Add a value to property httpMethod. */
    Builder addHttpMethod(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(Language value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(Language.Builder value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(Text value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(String value);

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

    /** Add a value to property urlTemplate. */
    Builder addUrlTemplate(Text value);

    /** Add a value to property urlTemplate. */
    Builder addUrlTemplate(String value);

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

    /** Build a {@link EntryPoint} object. */
    EntryPoint build();
  }

  /**
   * Returns the value list of property actionApplication. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getActionApplicationList();

  /**
   * Returns the value list of property actionPlatform. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getActionPlatformList();

  /**
   * Returns the value list of property application. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getApplicationList();

  /**
   * Returns the value list of property contentType. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getContentTypeList();

  /**
   * Returns the value list of property encodingType. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getEncodingTypeList();

  /**
   * Returns the value list of property httpMethod. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getHttpMethodList();

  /**
   * Returns the value list of property inLanguage. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getInLanguageList();

  /**
   * Returns the value list of property urlTemplate. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getUrlTemplateList();
}
