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

/** Interface of <a href="http://schema.org/BusTrip">http://schema.org/BusTrip</a>. */
public interface BusTrip extends Intangible {

  /** Builder interface of <a href="http://schema.org/BusTrip">http://schema.org/BusTrip</a>. */
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

    /** Add a value to property arrivalBusStop. */
    Builder addArrivalBusStop(BusStation value);

    /** Add a value to property arrivalBusStop. */
    Builder addArrivalBusStop(BusStation.Builder value);

    /** Add a value to property arrivalBusStop. */
    Builder addArrivalBusStop(BusStop value);

    /** Add a value to property arrivalBusStop. */
    Builder addArrivalBusStop(BusStop.Builder value);

    /** Add a value to property arrivalBusStop. */
    Builder addArrivalBusStop(String value);

    /** Add a value to property arrivalTime. */
    Builder addArrivalTime(DateTime value);

    /** Add a value to property arrivalTime. */
    Builder addArrivalTime(String value);

    /** Add a value to property busName. */
    Builder addBusName(Text value);

    /** Add a value to property busName. */
    Builder addBusName(String value);

    /** Add a value to property busNumber. */
    Builder addBusNumber(Text value);

    /** Add a value to property busNumber. */
    Builder addBusNumber(String value);

    /** Add a value to property departureBusStop. */
    Builder addDepartureBusStop(BusStation value);

    /** Add a value to property departureBusStop. */
    Builder addDepartureBusStop(BusStation.Builder value);

    /** Add a value to property departureBusStop. */
    Builder addDepartureBusStop(BusStop value);

    /** Add a value to property departureBusStop. */
    Builder addDepartureBusStop(BusStop.Builder value);

    /** Add a value to property departureBusStop. */
    Builder addDepartureBusStop(String value);

    /** Add a value to property departureTime. */
    Builder addDepartureTime(DateTime value);

    /** Add a value to property departureTime. */
    Builder addDepartureTime(String value);

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

    /** Build a {@link BusTrip} object. */
    BusTrip build();
  }

  /**
   * Returns the value list of property arrivalBusStop. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalBusStopList();

  /**
   * Returns the value list of property arrivalTime. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalTimeList();

  /**
   * Returns the value list of property busName. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBusNameList();

  /**
   * Returns the value list of property busNumber. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBusNumberList();

  /**
   * Returns the value list of property departureBusStop. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDepartureBusStopList();

  /**
   * Returns the value list of property departureTime. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDepartureTimeList();

  /**
   * Returns the value list of property provider. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getProviderList();
}
