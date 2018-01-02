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

/** Interface of <a href="http://schema.org/PostalAddress">http://schema.org/PostalAddress</a>. */
public interface PostalAddress extends ContactPoint {

  /**
   * Builder interface of <a
   * href="http://schema.org/PostalAddress">http://schema.org/PostalAddress</a>.
   */
  public interface Builder extends ContactPoint.Builder {

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

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(Country value);

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(Country.Builder value);

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(Text value);

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(String value);

    /** Add a value to property addressLocality. */
    Builder addAddressLocality(Text value);

    /** Add a value to property addressLocality. */
    Builder addAddressLocality(String value);

    /** Add a value to property addressRegion. */
    Builder addAddressRegion(Text value);

    /** Add a value to property addressRegion. */
    Builder addAddressRegion(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(AdministrativeArea value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(AdministrativeArea.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(GeoShape value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(GeoShape.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Place value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Place.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Text value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(String value);

    /** Add a value to property availableLanguage. */
    Builder addAvailableLanguage(Language value);

    /** Add a value to property availableLanguage. */
    Builder addAvailableLanguage(Language.Builder value);

    /** Add a value to property availableLanguage. */
    Builder addAvailableLanguage(String value);

    /** Add a value to property contactOption. */
    Builder addContactOption(ContactPointOption value);

    /** Add a value to property contactOption. */
    Builder addContactOption(String value);

    /** Add a value to property contactType. */
    Builder addContactType(Text value);

    /** Add a value to property contactType. */
    Builder addContactType(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property email. */
    Builder addEmail(Text value);

    /** Add a value to property email. */
    Builder addEmail(String value);

    /** Add a value to property faxNumber. */
    Builder addFaxNumber(Text value);

    /** Add a value to property faxNumber. */
    Builder addFaxNumber(String value);

    /** Add a value to property hoursAvailable. */
    Builder addHoursAvailable(OpeningHoursSpecification value);

    /** Add a value to property hoursAvailable. */
    Builder addHoursAvailable(OpeningHoursSpecification.Builder value);

    /** Add a value to property hoursAvailable. */
    Builder addHoursAvailable(String value);

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

    /** Add a value to property postalCode. */
    Builder addPostalCode(Text value);

    /** Add a value to property postalCode. */
    Builder addPostalCode(String value);

    /** Add a value to property postOfficeBoxNumber. */
    Builder addPostOfficeBoxNumber(Text value);

    /** Add a value to property postOfficeBoxNumber. */
    Builder addPostOfficeBoxNumber(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property productSupported. */
    Builder addProductSupported(Product value);

    /** Add a value to property productSupported. */
    Builder addProductSupported(Product.Builder value);

    /** Add a value to property productSupported. */
    Builder addProductSupported(Text value);

    /** Add a value to property productSupported. */
    Builder addProductSupported(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(AdministrativeArea value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(AdministrativeArea.Builder value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(GeoShape value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(GeoShape.Builder value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(Place value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(Place.Builder value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(String value);

    /** Add a value to property streetAddress. */
    Builder addStreetAddress(Text value);

    /** Add a value to property streetAddress. */
    Builder addStreetAddress(String value);

    /** Add a value to property telephone. */
    Builder addTelephone(Text value);

    /** Add a value to property telephone. */
    Builder addTelephone(String value);

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

    /** Build a {@link PostalAddress} object. */
    PostalAddress build();
  }

  /**
   * Returns the value list of property addressCountry. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAddressCountryList();

  /**
   * Returns the value list of property addressLocality. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAddressLocalityList();

  /**
   * Returns the value list of property addressRegion. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAddressRegionList();

  /**
   * Returns the value list of property postalCode. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getPostalCodeList();

  /**
   * Returns the value list of property postOfficeBoxNumber. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getPostOfficeBoxNumberList();

  /**
   * Returns the value list of property streetAddress. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getStreetAddressList();
}
