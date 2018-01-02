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

/** Interface of <a href="http://schema.org/TrainTrip">http://schema.org/TrainTrip</a>. */
public interface TrainTrip extends Intangible {

  /**
   * Builder interface of <a href="http://schema.org/TrainTrip">http://schema.org/TrainTrip</a>.
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

    /** Add a value to property arrivalPlatform. */
    Builder addArrivalPlatform(Text value);

    /** Add a value to property arrivalPlatform. */
    Builder addArrivalPlatform(String value);

    /** Add a value to property arrivalStation. */
    Builder addArrivalStation(TrainStation value);

    /** Add a value to property arrivalStation. */
    Builder addArrivalStation(TrainStation.Builder value);

    /** Add a value to property arrivalStation. */
    Builder addArrivalStation(String value);

    /** Add a value to property arrivalTime. */
    Builder addArrivalTime(DateTime value);

    /** Add a value to property arrivalTime. */
    Builder addArrivalTime(String value);

    /** Add a value to property departurePlatform. */
    Builder addDeparturePlatform(Text value);

    /** Add a value to property departurePlatform. */
    Builder addDeparturePlatform(String value);

    /** Add a value to property departureStation. */
    Builder addDepartureStation(TrainStation value);

    /** Add a value to property departureStation. */
    Builder addDepartureStation(TrainStation.Builder value);

    /** Add a value to property departureStation. */
    Builder addDepartureStation(String value);

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

    /** Add a value to property trainName. */
    Builder addTrainName(Text value);

    /** Add a value to property trainName. */
    Builder addTrainName(String value);

    /** Add a value to property trainNumber. */
    Builder addTrainNumber(Text value);

    /** Add a value to property trainNumber. */
    Builder addTrainNumber(String value);

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

    /** Build a {@link TrainTrip} object. */
    TrainTrip build();
  }

  /**
   * Returns the value list of property arrivalPlatform. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalPlatformList();

  /**
   * Returns the value list of property arrivalStation. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalStationList();

  /**
   * Returns the value list of property arrivalTime. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getArrivalTimeList();

  /**
   * Returns the value list of property departurePlatform. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getDeparturePlatformList();

  /**
   * Returns the value list of property departureStation. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDepartureStationList();

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

  /**
   * Returns the value list of property trainName. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getTrainNameList();

  /**
   * Returns the value list of property trainNumber. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getTrainNumberList();
}
