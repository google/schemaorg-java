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

/** Implementation of {@link TrainTrip}. */
public class TrainTripImpl extends IntangibleImpl implements TrainTrip {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_PLATFORM);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_STATION);

    builder.add(CoreConstants.PROPERTY_ARRIVAL_TIME);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_PLATFORM);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_STATION);

    builder.add(CoreConstants.PROPERTY_DEPARTURE_TIME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_TRAIN_NAME);

    builder.add(CoreConstants.PROPERTY_TRAIN_NUMBER);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<TrainTrip.Builder>
      implements TrainTrip.Builder {

    @Override
    public TrainTrip.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public TrainTrip.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public TrainTrip.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addArrivalPlatform(Text value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_PLATFORM, value);
    }

    @Override
    public TrainTrip.Builder addArrivalPlatform(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_PLATFORM, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addArrivalStation(TrainStation value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_STATION, value);
    }

    @Override
    public TrainTrip.Builder addArrivalStation(TrainStation.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_STATION, value.build());
    }

    @Override
    public TrainTrip.Builder addArrivalStation(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_STATION, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addArrivalTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TIME, value);
    }

    @Override
    public TrainTrip.Builder addArrivalTime(String value) {
      return addProperty(CoreConstants.PROPERTY_ARRIVAL_TIME, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addDeparturePlatform(Text value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_PLATFORM, value);
    }

    @Override
    public TrainTrip.Builder addDeparturePlatform(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_PLATFORM, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addDepartureStation(TrainStation value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_STATION, value);
    }

    @Override
    public TrainTrip.Builder addDepartureStation(TrainStation.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_STATION, value.build());
    }

    @Override
    public TrainTrip.Builder addDepartureStation(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_STATION, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addDepartureTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TIME, value);
    }

    @Override
    public TrainTrip.Builder addDepartureTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTURE_TIME, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public TrainTrip.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public TrainTrip.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public TrainTrip.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public TrainTrip.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public TrainTrip.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public TrainTrip.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public TrainTrip.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public TrainTrip.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public TrainTrip.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public TrainTrip.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public TrainTrip.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public TrainTrip.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public TrainTrip.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public TrainTrip.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public TrainTrip.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addTrainName(Text value) {
      return addProperty(CoreConstants.PROPERTY_TRAIN_NAME, value);
    }

    @Override
    public TrainTrip.Builder addTrainName(String value) {
      return addProperty(CoreConstants.PROPERTY_TRAIN_NAME, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addTrainNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_TRAIN_NUMBER, value);
    }

    @Override
    public TrainTrip.Builder addTrainNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_TRAIN_NUMBER, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public TrainTrip.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public TrainTrip.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public TrainTrip.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public TrainTrip.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public TrainTrip.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public TrainTrip.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public TrainTrip build() {
      return new TrainTripImpl(properties, reverseMap);
    }
  }

  public TrainTripImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_TRAIN_TRIP;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalPlatformList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_PLATFORM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalStationList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_STATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArrivalTimeList() {
    return getProperty(CoreConstants.PROPERTY_ARRIVAL_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDeparturePlatformList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_PLATFORM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureStationList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_STATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartureTimeList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTURE_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProviderList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTrainNameList() {
    return getProperty(CoreConstants.PROPERTY_TRAIN_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTrainNumberList() {
    return getProperty(CoreConstants.PROPERTY_TRAIN_NUMBER);
  }
}
