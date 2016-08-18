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
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link BusTrip}. */
public class BusTripImpl extends IntangibleImpl implements BusTrip {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_BUS_STOP);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_TIME);

    builder.add(CoreConstants.PROPERTY_BUS_NAME);

    builder.add(CoreConstants.PROPERTY_BUS_NUMBER);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_BUS_STOP);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_TIME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<BusTrip.Builder>
      implements BusTrip.Builder {

    @Override
    public BusTrip.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public BusTrip.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public BusTrip.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public BusTrip.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public BusTrip.Builder addArrivalBusStop(BusStation value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_BUS_STOP, value);
    }

    @Override
    public BusTrip.Builder addArrivalBusStop(BusStation.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_BUS_STOP, value.build());
    }

    @Override
    public BusTrip.Builder addArrivalBusStop(BusStop value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_BUS_STOP, value);
    }

    @Override
    public BusTrip.Builder addArrivalBusStop(BusStop.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_BUS_STOP, value.build());
    }

    @Override
    public BusTrip.Builder addArrivalBusStop(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_BUS_STOP, Text.of(value));
    }

    @Override
    public BusTrip.Builder addArrivalTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TIME, value);
    }

    @Override
    public BusTrip.Builder addArrivalTime(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TIME, Text.of(value));
    }

    @Override
    public BusTrip.Builder addBusName(Text value) {
      return addProperty(CoreConstants.PROPERTY_BUS_NAME, value);
    }

    @Override
    public BusTrip.Builder addBusName(String value) {
      return addProperty(CoreConstants.PROPERTY_BUS_NAME, Text.of(value));
    }

    @Override
    public BusTrip.Builder addBusNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_BUS_NUMBER, value);
    }

    @Override
    public BusTrip.Builder addBusNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_BUS_NUMBER, Text.of(value));
    }

    @Override
    public BusTrip.Builder addDepartureBusStop(BusStation value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_BUS_STOP, value);
    }

    @Override
    public BusTrip.Builder addDepartureBusStop(BusStation.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_BUS_STOP, value.build());
    }

    @Override
    public BusTrip.Builder addDepartureBusStop(BusStop value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_BUS_STOP, value);
    }

    @Override
    public BusTrip.Builder addDepartureBusStop(BusStop.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_BUS_STOP, value.build());
    }

    @Override
    public BusTrip.Builder addDepartureBusStop(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_BUS_STOP, Text.of(value));
    }

    @Override
    public BusTrip.Builder addDepartureTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TIME, value);
    }

    @Override
    public BusTrip.Builder addDepartureTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TIME, Text.of(value));
    }

    @Override
    public BusTrip.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public BusTrip.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public BusTrip.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public BusTrip.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public BusTrip.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public BusTrip.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public BusTrip.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public BusTrip.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public BusTrip.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public BusTrip.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public BusTrip.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public BusTrip.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public BusTrip.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public BusTrip.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public BusTrip.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public BusTrip.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public BusTrip.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public BusTrip.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public BusTrip.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public BusTrip.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public BusTrip.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public BusTrip.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public BusTrip.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public BusTrip.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public BusTrip.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public BusTrip.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public BusTrip.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public BusTrip.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public BusTrip.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public BusTrip.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public BusTrip build() {
      return new BusTripImpl(properties, reverseMap);
    }
  }

  public BusTripImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_BUS_TRIP;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalBusStopList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_BUS_STOP);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalTimeList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBusNameList() {
    return getProperty(CoreConstants.PROPERTY_BUS_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBusNumberList() {
    return getProperty(CoreConstants.PROPERTY_BUS_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureBusStopList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_BUS_STOP);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureTimeList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProviderList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDER);
  }
}
