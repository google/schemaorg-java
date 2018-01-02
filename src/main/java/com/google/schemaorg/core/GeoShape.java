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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/GeoShape">http://schema.org/GeoShape</a>. */
public interface GeoShape extends StructuredValue {

  /** Builder interface of <a href="http://schema.org/GeoShape">http://schema.org/GeoShape</a>. */
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

    /** Add a value to property address. */
    Builder addAddress(PostalAddress value);

    /** Add a value to property address. */
    Builder addAddress(PostalAddress.Builder value);

    /** Add a value to property address. */
    Builder addAddress(Text value);

    /** Add a value to property address. */
    Builder addAddress(String value);

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(Country value);

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(Country.Builder value);

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(Text value);

    /** Add a value to property addressCountry. */
    Builder addAddressCountry(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property box. */
    Builder addBox(Text value);

    /** Add a value to property box. */
    Builder addBox(String value);

    /** Add a value to property circle. */
    Builder addCircle(Text value);

    /** Add a value to property circle. */
    Builder addCircle(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property elevation. */
    Builder addElevation(Number value);

    /** Add a value to property elevation. */
    Builder addElevation(Text value);

    /** Add a value to property elevation. */
    Builder addElevation(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property line. */
    Builder addLine(Text value);

    /** Add a value to property line. */
    Builder addLine(String value);

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

    /** Add a value to property polygon. */
    Builder addPolygon(Text value);

    /** Add a value to property polygon. */
    Builder addPolygon(String value);

    /** Add a value to property postalCode. */
    Builder addPostalCode(Text value);

    /** Add a value to property postalCode. */
    Builder addPostalCode(String value);

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

    /** Build a {@link GeoShape} object. */
    GeoShape build();
  }

  /**
   * Returns the value list of property address. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAddressList();

  /**
   * Returns the value list of property addressCountry. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAddressCountryList();

  /**
   * Returns the value list of property box. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBoxList();

  /**
   * Returns the value list of property circle. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCircleList();

  /**
   * Returns the value list of property elevation. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getElevationList();

  /**
   * Returns the value list of property line. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getLineList();

  /**
   * Returns the value list of property polygon. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getPolygonList();

  /**
   * Returns the value list of property postalCode. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getPostalCodeList();
}
