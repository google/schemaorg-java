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

/** Implementation of {@link GeoCircle}. */
public class GeoCircleImpl extends GeoShapeImpl implements GeoCircle {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADDRESS);

    builder.add(CoreConstants.PROPERTY_ADDRESS_COUNTRY);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BOX);

    builder.add(CoreConstants.PROPERTY_CIRCLE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ELEVATION);

    builder.add(CoreConstants.PROPERTY_GEO_MIDPOINT);

    builder.add(CoreConstants.PROPERTY_GEO_RADIUS);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_LINE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POLYGON);

    builder.add(CoreConstants.PROPERTY_POSTAL_CODE);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<GeoCircle.Builder>
      implements GeoCircle.Builder {

    @Override
    public GeoCircle.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public GeoCircle.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public GeoCircle.Builder addAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value.build());
    }

    @Override
    public GeoCircle.Builder addAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public GeoCircle.Builder addAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addAddressCountry(Country value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value);
    }

    @Override
    public GeoCircle.Builder addAddressCountry(Country.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value.build());
    }

    @Override
    public GeoCircle.Builder addAddressCountry(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value);
    }

    @Override
    public GeoCircle.Builder addAddressCountry(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public GeoCircle.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addBox(Text value) {
      return addProperty(CoreConstants.PROPERTY_BOX, value);
    }

    @Override
    public GeoCircle.Builder addBox(String value) {
      return addProperty(CoreConstants.PROPERTY_BOX, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addCircle(Text value) {
      return addProperty(CoreConstants.PROPERTY_CIRCLE, value);
    }

    @Override
    public GeoCircle.Builder addCircle(String value) {
      return addProperty(CoreConstants.PROPERTY_CIRCLE, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public GeoCircle.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addElevation(Number value) {
      return addProperty(CoreConstants.PROPERTY_ELEVATION, value);
    }

    @Override
    public GeoCircle.Builder addElevation(Text value) {
      return addProperty(CoreConstants.PROPERTY_ELEVATION, value);
    }

    @Override
    public GeoCircle.Builder addElevation(String value) {
      return addProperty(CoreConstants.PROPERTY_ELEVATION, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addGeoMidpoint(GeoCoordinates value) {
      return addProperty(CoreConstants.PROPERTY_GEO_MIDPOINT, value);
    }

    @Override
    public GeoCircle.Builder addGeoMidpoint(GeoCoordinates.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO_MIDPOINT, value.build());
    }

    @Override
    public GeoCircle.Builder addGeoMidpoint(String value) {
      return addProperty(CoreConstants.PROPERTY_GEO_MIDPOINT, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addGeoRadius(Distance value) {
      return addProperty(CoreConstants.PROPERTY_GEO_RADIUS, value);
    }

    @Override
    public GeoCircle.Builder addGeoRadius(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO_RADIUS, value.build());
    }

    @Override
    public GeoCircle.Builder addGeoRadius(Number value) {
      return addProperty(CoreConstants.PROPERTY_GEO_RADIUS, value);
    }

    @Override
    public GeoCircle.Builder addGeoRadius(Text value) {
      return addProperty(CoreConstants.PROPERTY_GEO_RADIUS, value);
    }

    @Override
    public GeoCircle.Builder addGeoRadius(String value) {
      return addProperty(CoreConstants.PROPERTY_GEO_RADIUS, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public GeoCircle.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public GeoCircle.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public GeoCircle.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addLine(Text value) {
      return addProperty(CoreConstants.PROPERTY_LINE, value);
    }

    @Override
    public GeoCircle.Builder addLine(String value) {
      return addProperty(CoreConstants.PROPERTY_LINE, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public GeoCircle.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public GeoCircle.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public GeoCircle.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public GeoCircle.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addPolygon(Text value) {
      return addProperty(CoreConstants.PROPERTY_POLYGON, value);
    }

    @Override
    public GeoCircle.Builder addPolygon(String value) {
      return addProperty(CoreConstants.PROPERTY_POLYGON, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addPostalCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_POSTAL_CODE, value);
    }

    @Override
    public GeoCircle.Builder addPostalCode(String value) {
      return addProperty(CoreConstants.PROPERTY_POSTAL_CODE, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public GeoCircle.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public GeoCircle.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public GeoCircle.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public GeoCircle.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public GeoCircle.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public GeoCircle.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public GeoCircle.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public GeoCircle.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public GeoCircle.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public GeoCircle build() {
      return new GeoCircleImpl(properties, reverseMap);
    }
  }

  public GeoCircleImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_GEO_CIRCLE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGeoMidpointList() {
    return getProperty(CoreConstants.PROPERTY_GEO_MIDPOINT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGeoRadiusList() {
    return getProperty(CoreConstants.PROPERTY_GEO_RADIUS);
  }
}
