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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link GeoCoordinates}. */
public class GeoCoordinatesImpl extends StructuredValueImpl implements GeoCoordinates {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADDRESS);

    builder.add(CoreConstants.PROPERTY_ADDRESS_COUNTRY);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ELEVATION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_LATITUDE);

    builder.add(CoreConstants.PROPERTY_LONGITUDE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POSTAL_CODE);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<GeoCoordinates.Builder>
      implements GeoCoordinates.Builder {

    @Override
    public GeoCoordinates.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public GeoCoordinates.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public GeoCoordinates.Builder addAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value.build());
    }

    @Override
    public GeoCoordinates.Builder addAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public GeoCoordinates.Builder addAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addAddressCountry(Country value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value);
    }

    @Override
    public GeoCoordinates.Builder addAddressCountry(Country.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value.build());
    }

    @Override
    public GeoCoordinates.Builder addAddressCountry(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value);
    }

    @Override
    public GeoCoordinates.Builder addAddressCountry(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public GeoCoordinates.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public GeoCoordinates.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addElevation(Number value) {
      return addProperty(CoreConstants.PROPERTY_ELEVATION, value);
    }

    @Override
    public GeoCoordinates.Builder addElevation(Text value) {
      return addProperty(CoreConstants.PROPERTY_ELEVATION, value);
    }

    @Override
    public GeoCoordinates.Builder addElevation(String value) {
      return addProperty(CoreConstants.PROPERTY_ELEVATION, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public GeoCoordinates.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public GeoCoordinates.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public GeoCoordinates.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addLatitude(Number value) {
      return addProperty(CoreConstants.PROPERTY_LATITUDE, value);
    }

    @Override
    public GeoCoordinates.Builder addLatitude(Text value) {
      return addProperty(CoreConstants.PROPERTY_LATITUDE, value);
    }

    @Override
    public GeoCoordinates.Builder addLatitude(String value) {
      return addProperty(CoreConstants.PROPERTY_LATITUDE, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addLongitude(Number value) {
      return addProperty(CoreConstants.PROPERTY_LONGITUDE, value);
    }

    @Override
    public GeoCoordinates.Builder addLongitude(Text value) {
      return addProperty(CoreConstants.PROPERTY_LONGITUDE, value);
    }

    @Override
    public GeoCoordinates.Builder addLongitude(String value) {
      return addProperty(CoreConstants.PROPERTY_LONGITUDE, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public GeoCoordinates.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public GeoCoordinates.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public GeoCoordinates.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public GeoCoordinates.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addPostalCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_POSTAL_CODE, value);
    }

    @Override
    public GeoCoordinates.Builder addPostalCode(String value) {
      return addProperty(CoreConstants.PROPERTY_POSTAL_CODE, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public GeoCoordinates.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public GeoCoordinates.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public GeoCoordinates.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public GeoCoordinates.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public GeoCoordinates.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public GeoCoordinates.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public GeoCoordinates.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public GeoCoordinates.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public GeoCoordinates.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public GeoCoordinates build() {
      return new GeoCoordinatesImpl(properties, reverseMap);
    }
  }

  public GeoCoordinatesImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_GEO_COORDINATES;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAddressList() {
    return getProperty(CoreConstants.PROPERTY_ADDRESS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAddressCountryList() {
    return getProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getElevationList() {
    return getProperty(CoreConstants.PROPERTY_ELEVATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLatitudeList() {
    return getProperty(CoreConstants.PROPERTY_LATITUDE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLongitudeList() {
    return getProperty(CoreConstants.PROPERTY_LONGITUDE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPostalCodeList() {
    return getProperty(CoreConstants.PROPERTY_POSTAL_CODE);
  }
}
