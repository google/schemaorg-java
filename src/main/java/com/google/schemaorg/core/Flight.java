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
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/Flight">http://schema.org/Flight</a>. */
public interface Flight extends Intangible {

  /** Builder interface of <a href="http://schema.org/Flight">http://schema.org/Flight</a>. */
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

    /** Add a value to property aircraft. */
    Builder addAircraft(Text value);

    /** Add a value to property aircraft. */
    Builder addAircraft(Vehicle value);

    /** Add a value to property aircraft. */
    Builder addAircraft(Vehicle.Builder value);

    /** Add a value to property aircraft. */
    Builder addAircraft(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property arrivalAirport. */
    Builder addArrivalAirport(Airport value);

    /** Add a value to property arrivalAirport. */
    Builder addArrivalAirport(Airport.Builder value);

    /** Add a value to property arrivalAirport. */
    Builder addArrivalAirport(String value);

    /** Add a value to property arrivalGate. */
    Builder addArrivalGate(Text value);

    /** Add a value to property arrivalGate. */
    Builder addArrivalGate(String value);

    /** Add a value to property arrivalTerminal. */
    Builder addArrivalTerminal(Text value);

    /** Add a value to property arrivalTerminal. */
    Builder addArrivalTerminal(String value);

    /** Add a value to property arrivalTime. */
    Builder addArrivalTime(DateTime value);

    /** Add a value to property arrivalTime. */
    Builder addArrivalTime(String value);

    /** Add a value to property boardingPolicy. */
    Builder addBoardingPolicy(BoardingPolicyType value);

    /** Add a value to property boardingPolicy. */
    Builder addBoardingPolicy(String value);

    /** Add a value to property carrier. */
    Builder addCarrier(Organization value);

    /** Add a value to property carrier. */
    Builder addCarrier(Organization.Builder value);

    /** Add a value to property carrier. */
    Builder addCarrier(String value);

    /** Add a value to property departureAirport. */
    Builder addDepartureAirport(Airport value);

    /** Add a value to property departureAirport. */
    Builder addDepartureAirport(Airport.Builder value);

    /** Add a value to property departureAirport. */
    Builder addDepartureAirport(String value);

    /** Add a value to property departureGate. */
    Builder addDepartureGate(Text value);

    /** Add a value to property departureGate. */
    Builder addDepartureGate(String value);

    /** Add a value to property departureTerminal. */
    Builder addDepartureTerminal(Text value);

    /** Add a value to property departureTerminal. */
    Builder addDepartureTerminal(String value);

    /** Add a value to property departureTime. */
    Builder addDepartureTime(DateTime value);

    /** Add a value to property departureTime. */
    Builder addDepartureTime(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property estimatedFlightDuration. */
    Builder addEstimatedFlightDuration(Duration value);

    /** Add a value to property estimatedFlightDuration. */
    Builder addEstimatedFlightDuration(Duration.Builder value);

    /** Add a value to property estimatedFlightDuration. */
    Builder addEstimatedFlightDuration(Text value);

    /** Add a value to property estimatedFlightDuration. */
    Builder addEstimatedFlightDuration(String value);

    /** Add a value to property flightDistance. */
    Builder addFlightDistance(Distance value);

    /** Add a value to property flightDistance. */
    Builder addFlightDistance(Distance.Builder value);

    /** Add a value to property flightDistance. */
    Builder addFlightDistance(Text value);

    /** Add a value to property flightDistance. */
    Builder addFlightDistance(String value);

    /** Add a value to property flightNumber. */
    Builder addFlightNumber(Text value);

    /** Add a value to property flightNumber. */
    Builder addFlightNumber(String value);

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

    /** Add a value to property mealService. */
    Builder addMealService(Text value);

    /** Add a value to property mealService. */
    Builder addMealService(String value);

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

    /** Add a value to property provider. */
    Builder addProvider(Organization value);

    /** Add a value to property provider. */
    Builder addProvider(Organization.Builder value);

    /** Add a value to property provider. */
    Builder addProvider(Person value);

    /** Add a value to property provider. */
    Builder addProvider(Person.Builder value);

    /** Add a value to property provider. */
    Builder addProvider(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property seller. */
    Builder addSeller(Organization value);

    /** Add a value to property seller. */
    Builder addSeller(Organization.Builder value);

    /** Add a value to property seller. */
    Builder addSeller(Person value);

    /** Add a value to property seller. */
    Builder addSeller(Person.Builder value);

    /** Add a value to property seller. */
    Builder addSeller(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property webCheckinTime. */
    Builder addWebCheckinTime(DateTime value);

    /** Add a value to property webCheckinTime. */
    Builder addWebCheckinTime(String value);

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

    /** Build a {@link Flight} object. */
    Flight build();
  }

  /**
   * Returns the value list of property aircraft. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAircraftList();

  /**
   * Returns the value list of property arrivalAirport. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalAirportList();

  /**
   * Returns the value list of property arrivalGate. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalGateList();

  /**
   * Returns the value list of property arrivalTerminal. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalTerminalList();

  /**
   * Returns the value list of property arrivalTime. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalTimeList();

  /**
   * Returns the value list of property boardingPolicy. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getBoardingPolicyList();

  /**
   * Returns the value list of property carrier. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCarrierList();

  /**
   * Returns the value list of property departureAirport. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDepartureAirportList();

  /**
   * Returns the value list of property departureGate. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDepartureGateList();

  /**
   * Returns the value list of property departureTerminal. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getDepartureTerminalList();

  /**
   * Returns the value list of property departureTime. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDepartureTimeList();

  /**
   * Returns the value list of property estimatedFlightDuration. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getEstimatedFlightDurationList();

  /**
   * Returns the value list of property flightDistance. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getFlightDistanceList();

  /**
   * Returns the value list of property flightNumber. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getFlightNumberList();

  /**
   * Returns the value list of property mealService. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getMealServiceList();

  /**
   * Returns the value list of property provider. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getProviderList();

  /**
   * Returns the value list of property seller. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSellerList();

  /**
   * Returns the value list of property webCheckinTime. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getWebCheckinTimeList();
}
