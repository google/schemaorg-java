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
 * Interface of <a href="http://schema.org/ServiceChannel">http://schema.org/ServiceChannel</a>.
 */
public interface ServiceChannel extends Intangible {

  /**
   * Builder interface of <a
   * href="http://schema.org/ServiceChannel">http://schema.org/ServiceChannel</a>.
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

    /** Add a value to property availableLanguage. */
    Builder addAvailableLanguage(Language value);

    /** Add a value to property availableLanguage. */
    Builder addAvailableLanguage(Language.Builder value);

    /** Add a value to property availableLanguage. */
    Builder addAvailableLanguage(String value);

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

    /** Add a value to property processingTime. */
    Builder addProcessingTime(Duration value);

    /** Add a value to property processingTime. */
    Builder addProcessingTime(Duration.Builder value);

    /** Add a value to property processingTime. */
    Builder addProcessingTime(String value);

    /** Add a value to property providesService. */
    Builder addProvidesService(Service value);

    /** Add a value to property providesService. */
    Builder addProvidesService(Service.Builder value);

    /** Add a value to property providesService. */
    Builder addProvidesService(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property serviceLocation. */
    Builder addServiceLocation(Place value);

    /** Add a value to property serviceLocation. */
    Builder addServiceLocation(Place.Builder value);

    /** Add a value to property serviceLocation. */
    Builder addServiceLocation(String value);

    /** Add a value to property servicePhone. */
    Builder addServicePhone(ContactPoint value);

    /** Add a value to property servicePhone. */
    Builder addServicePhone(ContactPoint.Builder value);

    /** Add a value to property servicePhone. */
    Builder addServicePhone(String value);

    /** Add a value to property servicePostalAddress. */
    Builder addServicePostalAddress(PostalAddress value);

    /** Add a value to property servicePostalAddress. */
    Builder addServicePostalAddress(PostalAddress.Builder value);

    /** Add a value to property servicePostalAddress. */
    Builder addServicePostalAddress(String value);

    /** Add a value to property serviceSmsNumber. */
    Builder addServiceSmsNumber(ContactPoint value);

    /** Add a value to property serviceSmsNumber. */
    Builder addServiceSmsNumber(ContactPoint.Builder value);

    /** Add a value to property serviceSmsNumber. */
    Builder addServiceSmsNumber(String value);

    /** Add a value to property serviceUrl. */
    Builder addServiceUrl(URL value);

    /** Add a value to property serviceUrl. */
    Builder addServiceUrl(String value);

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

    /** Build a {@link ServiceChannel} object. */
    ServiceChannel build();
  }

  /**
   * Returns the value list of property availableLanguage. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getAvailableLanguageList();

  /**
   * Returns the value list of property processingTime. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getProcessingTimeList();

  /**
   * Returns the value list of property providesService. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getProvidesServiceList();

  /**
   * Returns the value list of property serviceLocation. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getServiceLocationList();

  /**
   * Returns the value list of property servicePhone. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getServicePhoneList();

  /**
   * Returns the value list of property servicePostalAddress. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getServicePostalAddressList();

  /**
   * Returns the value list of property serviceSmsNumber. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getServiceSmsNumberList();

  /**
   * Returns the value list of property serviceUrl. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getServiceUrlList();
}
