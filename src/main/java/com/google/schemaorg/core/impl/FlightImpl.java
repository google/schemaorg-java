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

/** Implementation of {@link Flight}. */
public class FlightImpl extends IntangibleImpl implements Flight {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AIRCRAFT);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_AIRPORT);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_GATE);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_TERMINAL);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_TIME);

    builder.add(CoreConstants.PROPERTY_BOARDING_POLICY);

    builder.add(CoreConstants.PROPERTY_CARRIER);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_AIRPORT);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_GATE);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_TERMINAL);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_TIME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ESTIMATED_FLIGHT_DURATION);

    builder.add(CoreConstants.PROPERTY_FLIGHT_DISTANCE);

    builder.add(CoreConstants.PROPERTY_FLIGHT_NUMBER);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEAL_SERVICE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SELLER);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_WEB_CHECKIN_TIME);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Flight.Builder>
      implements Flight.Builder {

    @Override
    public Flight.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Flight.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Flight.Builder addAircraft(Text value) {
      return addProperty(CoreConstants.PROPERTY_AIRCRAFT, value);
    }

    @Override
    public Flight.Builder addAircraft(Vehicle value) {
      return addProperty(CoreConstants.PROPERTY_AIRCRAFT, value);
    }

    @Override
    public Flight.Builder addAircraft(Vehicle.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AIRCRAFT, value.build());
    }

    @Override
    public Flight.Builder addAircraft(String value) {
      return addProperty(CoreConstants.PROPERTY_AIRCRAFT, Text.of(value));
    }

    @Override
    public Flight.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Flight.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Flight.Builder addArrivalAirport(Airport value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_AIRPORT, value);
    }

    @Override
    public Flight.Builder addArrivalAirport(Airport.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_AIRPORT, value.build());
    }

    @Override
    public Flight.Builder addArrivalAirport(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_AIRPORT, Text.of(value));
    }

    @Override
    public Flight.Builder addArrivalGate(Text value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_GATE, value);
    }

    @Override
    public Flight.Builder addArrivalGate(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_GATE, Text.of(value));
    }

    @Override
    public Flight.Builder addArrivalTerminal(Text value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TERMINAL, value);
    }

    @Override
    public Flight.Builder addArrivalTerminal(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TERMINAL, Text.of(value));
    }

    @Override
    public Flight.Builder addArrivalTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TIME, value);
    }

    @Override
    public Flight.Builder addArrivalTime(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TIME, Text.of(value));
    }

    @Override
    public Flight.Builder addBoardingPolicy(BoardingPolicyType value) {
      return addProperty(CoreConstants.PROPERTY_BOARDING_POLICY, value);
    }

    @Override
    public Flight.Builder addBoardingPolicy(String value) {
      return addProperty(CoreConstants.PROPERTY_BOARDING_POLICY, Text.of(value));
    }

    @Override
    public Flight.Builder addCarrier(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CARRIER, value);
    }

    @Override
    public Flight.Builder addCarrier(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CARRIER, value.build());
    }

    @Override
    public Flight.Builder addCarrier(String value) {
      return addProperty(CoreConstants.PROPERTY_CARRIER, Text.of(value));
    }

    @Override
    public Flight.Builder addDepartureAirport(Airport value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_AIRPORT, value);
    }

    @Override
    public Flight.Builder addDepartureAirport(Airport.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_AIRPORT, value.build());
    }

    @Override
    public Flight.Builder addDepartureAirport(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_AIRPORT, Text.of(value));
    }

    @Override
    public Flight.Builder addDepartureGate(Text value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_GATE, value);
    }

    @Override
    public Flight.Builder addDepartureGate(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_GATE, Text.of(value));
    }

    @Override
    public Flight.Builder addDepartureTerminal(Text value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TERMINAL, value);
    }

    @Override
    public Flight.Builder addDepartureTerminal(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TERMINAL, Text.of(value));
    }

    @Override
    public Flight.Builder addDepartureTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TIME, value);
    }

    @Override
    public Flight.Builder addDepartureTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TIME, Text.of(value));
    }

    @Override
    public Flight.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Flight.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Flight.Builder addEstimatedFlightDuration(Duration value) {
      return addProperty(CoreConstants.PROPERTY_ESTIMATED_FLIGHT_DURATION, value);
    }

    @Override
    public Flight.Builder addEstimatedFlightDuration(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ESTIMATED_FLIGHT_DURATION, value.build());
    }

    @Override
    public Flight.Builder addEstimatedFlightDuration(Text value) {
      return addProperty(CoreConstants.PROPERTY_ESTIMATED_FLIGHT_DURATION, value);
    }

    @Override
    public Flight.Builder addEstimatedFlightDuration(String value) {
      return addProperty(CoreConstants.PROPERTY_ESTIMATED_FLIGHT_DURATION, Text.of(value));
    }

    @Override
    public Flight.Builder addFlightDistance(Distance value) {
      return addProperty(CoreConstants.PROPERTY_FLIGHT_DISTANCE, value);
    }

    @Override
    public Flight.Builder addFlightDistance(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FLIGHT_DISTANCE, value.build());
    }

    @Override
    public Flight.Builder addFlightDistance(Text value) {
      return addProperty(CoreConstants.PROPERTY_FLIGHT_DISTANCE, value);
    }

    @Override
    public Flight.Builder addFlightDistance(String value) {
      return addProperty(CoreConstants.PROPERTY_FLIGHT_DISTANCE, Text.of(value));
    }

    @Override
    public Flight.Builder addFlightNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FLIGHT_NUMBER, value);
    }

    @Override
    public Flight.Builder addFlightNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FLIGHT_NUMBER, Text.of(value));
    }

    @Override
    public Flight.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Flight.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Flight.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Flight.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Flight.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Flight.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Flight.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Flight.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Flight.Builder addMealService(Text value) {
      return addProperty(CoreConstants.PROPERTY_MEAL_SERVICE, value);
    }

    @Override
    public Flight.Builder addMealService(String value) {
      return addProperty(CoreConstants.PROPERTY_MEAL_SERVICE, Text.of(value));
    }

    @Override
    public Flight.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Flight.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Flight.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Flight.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Flight.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Flight.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public Flight.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public Flight.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public Flight.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public Flight.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public Flight.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Flight.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Flight.Builder addSeller(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Flight.Builder addSeller(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Flight.Builder addSeller(Person value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Flight.Builder addSeller(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Flight.Builder addSeller(String value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, Text.of(value));
    }

    @Override
    public Flight.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Flight.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Flight.Builder addWebCheckinTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_WEB_CHECKIN_TIME, value);
    }

    @Override
    public Flight.Builder addWebCheckinTime(String value) {
      return addProperty(CoreConstants.PROPERTY_WEB_CHECKIN_TIME, Text.of(value));
    }

    @Override
    public Flight.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Flight.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Flight.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Flight.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Flight.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Flight.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Flight build() {
      return new FlightImpl(properties, reverseMap);
    }
  }

  public FlightImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_FLIGHT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAircraftList() {
    return getProperty(CoreConstants.PROPERTY_AIRCRAFT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalAirportList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_AIRPORT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalGateList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_GATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalTerminalList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_TERMINAL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalTimeList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBoardingPolicyList() {
    return getProperty(CoreConstants.PROPERTY_BOARDING_POLICY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCarrierList() {
    return getProperty(CoreConstants.PROPERTY_CARRIER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureAirportList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_AIRPORT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureGateList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_GATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureTerminalList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_TERMINAL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureTimeList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEstimatedFlightDurationList() {
    return getProperty(CoreConstants.PROPERTY_ESTIMATED_FLIGHT_DURATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFlightDistanceList() {
    return getProperty(CoreConstants.PROPERTY_FLIGHT_DISTANCE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFlightNumberList() {
    return getProperty(CoreConstants.PROPERTY_FLIGHT_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMealServiceList() {
    return getProperty(CoreConstants.PROPERTY_MEAL_SERVICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProviderList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSellerList() {
    return getProperty(CoreConstants.PROPERTY_SELLER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWebCheckinTimeList() {
    return getProperty(CoreConstants.PROPERTY_WEB_CHECKIN_TIME);
  }
}
