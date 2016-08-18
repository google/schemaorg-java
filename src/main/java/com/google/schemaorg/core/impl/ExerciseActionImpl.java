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

/** Implementation of {@link ExerciseAction}. */
public class ExerciseActionImpl extends PlayActionImpl implements ExerciseAction {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACTION_STATUS);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AGENT);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AUDIENCE);

    builder.add(CoreConstants.PROPERTY_COURSE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DIET);

    builder.add(CoreConstants.PROPERTY_DISTANCE);

    builder.add(CoreConstants.PROPERTY_END_TIME);

    builder.add(CoreConstants.PROPERTY_ERROR);

    builder.add(CoreConstants.PROPERTY_EVENT);

    builder.add(CoreConstants.PROPERTY_EXERCISE_COURSE);

    builder.add(CoreConstants.PROPERTY_EXERCISE_PLAN);

    builder.add(CoreConstants.PROPERTY_EXERCISE_RELATED_DIET);

    builder.add(CoreConstants.PROPERTY_EXERCISE_TYPE);

    builder.add(CoreConstants.PROPERTY_FROM_LOCATION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INSTRUMENT);

    builder.add(CoreConstants.PROPERTY_LOCATION);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OBJECT);

    builder.add(CoreConstants.PROPERTY_OPPONENT);

    builder.add(CoreConstants.PROPERTY_PARTICIPANT);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RESULT);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SPORTS_ACTIVITY_LOCATION);

    builder.add(CoreConstants.PROPERTY_SPORTS_EVENT);

    builder.add(CoreConstants.PROPERTY_SPORTS_TEAM);

    builder.add(CoreConstants.PROPERTY_START_TIME);

    builder.add(CoreConstants.PROPERTY_TARGET);

    builder.add(CoreConstants.PROPERTY_TO_LOCATION);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<ExerciseAction.Builder>
      implements ExerciseAction.Builder {

    @Override
    public ExerciseAction.Builder addActionStatus(ActionStatusType value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_STATUS, value);
    }

    @Override
    public ExerciseAction.Builder addActionStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_STATUS, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public ExerciseAction.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addAgent(Organization value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value);
    }

    @Override
    public ExerciseAction.Builder addAgent(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value.build());
    }

    @Override
    public ExerciseAction.Builder addAgent(Person value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value);
    }

    @Override
    public ExerciseAction.Builder addAgent(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value.build());
    }

    @Override
    public ExerciseAction.Builder addAgent(String value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public ExerciseAction.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public ExerciseAction.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public ExerciseAction.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addCourse(Place value) {
      return addProperty(CoreConstants.PROPERTY_COURSE, value);
    }

    @Override
    public ExerciseAction.Builder addCourse(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COURSE, value.build());
    }

    @Override
    public ExerciseAction.Builder addCourse(String value) {
      return addProperty(CoreConstants.PROPERTY_COURSE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public ExerciseAction.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addDiet(Diet value) {
      return addProperty(CoreConstants.PROPERTY_DIET, value);
    }

    @Override
    public ExerciseAction.Builder addDiet(Diet.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DIET, value.build());
    }

    @Override
    public ExerciseAction.Builder addDiet(String value) {
      return addProperty(CoreConstants.PROPERTY_DIET, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addDistance(Distance value) {
      return addProperty(CoreConstants.PROPERTY_DISTANCE, value);
    }

    @Override
    public ExerciseAction.Builder addDistance(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DISTANCE, value.build());
    }

    @Override
    public ExerciseAction.Builder addDistance(String value) {
      return addProperty(CoreConstants.PROPERTY_DISTANCE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addEndTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_END_TIME, value);
    }

    @Override
    public ExerciseAction.Builder addEndTime(String value) {
      return addProperty(CoreConstants.PROPERTY_END_TIME, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addError(Thing value) {
      return addProperty(CoreConstants.PROPERTY_ERROR, value);
    }

    @Override
    public ExerciseAction.Builder addError(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ERROR, value.build());
    }

    @Override
    public ExerciseAction.Builder addError(String value) {
      return addProperty(CoreConstants.PROPERTY_ERROR, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value);
    }

    @Override
    public ExerciseAction.Builder addEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value.build());
    }

    @Override
    public ExerciseAction.Builder addEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addExerciseCourse(Place value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_COURSE, value);
    }

    @Override
    public ExerciseAction.Builder addExerciseCourse(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_COURSE, value.build());
    }

    @Override
    public ExerciseAction.Builder addExerciseCourse(String value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_COURSE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addExercisePlan(ExercisePlan value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_PLAN, value);
    }

    @Override
    public ExerciseAction.Builder addExercisePlan(ExercisePlan.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_PLAN, value.build());
    }

    @Override
    public ExerciseAction.Builder addExercisePlan(String value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_PLAN, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addExerciseRelatedDiet(Diet value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_RELATED_DIET, value);
    }

    @Override
    public ExerciseAction.Builder addExerciseRelatedDiet(Diet.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_RELATED_DIET, value.build());
    }

    @Override
    public ExerciseAction.Builder addExerciseRelatedDiet(String value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_RELATED_DIET, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addExerciseType(Text value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_TYPE, value);
    }

    @Override
    public ExerciseAction.Builder addExerciseType(String value) {
      return addProperty(CoreConstants.PROPERTY_EXERCISE_TYPE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addFromLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_FROM_LOCATION, value);
    }

    @Override
    public ExerciseAction.Builder addFromLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FROM_LOCATION, value.build());
    }

    @Override
    public ExerciseAction.Builder addFromLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_FROM_LOCATION, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ExerciseAction.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public ExerciseAction.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ExerciseAction.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addInstrument(Thing value) {
      return addProperty(CoreConstants.PROPERTY_INSTRUMENT, value);
    }

    @Override
    public ExerciseAction.Builder addInstrument(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INSTRUMENT, value.build());
    }

    @Override
    public ExerciseAction.Builder addInstrument(String value) {
      return addProperty(CoreConstants.PROPERTY_INSTRUMENT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public ExerciseAction.Builder addLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public ExerciseAction.Builder addLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public ExerciseAction.Builder addLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public ExerciseAction.Builder addLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public ExerciseAction.Builder addLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ExerciseAction.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public ExerciseAction.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ExerciseAction.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public ExerciseAction.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addObject(Thing value) {
      return addProperty(CoreConstants.PROPERTY_OBJECT, value);
    }

    @Override
    public ExerciseAction.Builder addObject(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OBJECT, value.build());
    }

    @Override
    public ExerciseAction.Builder addObject(String value) {
      return addProperty(CoreConstants.PROPERTY_OBJECT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addOpponent(Person value) {
      return addProperty(CoreConstants.PROPERTY_OPPONENT, value);
    }

    @Override
    public ExerciseAction.Builder addOpponent(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OPPONENT, value.build());
    }

    @Override
    public ExerciseAction.Builder addOpponent(String value) {
      return addProperty(CoreConstants.PROPERTY_OPPONENT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addParticipant(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value);
    }

    @Override
    public ExerciseAction.Builder addParticipant(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value.build());
    }

    @Override
    public ExerciseAction.Builder addParticipant(Person value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value);
    }

    @Override
    public ExerciseAction.Builder addParticipant(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value.build());
    }

    @Override
    public ExerciseAction.Builder addParticipant(String value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public ExerciseAction.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public ExerciseAction.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addResult(Thing value) {
      return addProperty(CoreConstants.PROPERTY_RESULT, value);
    }

    @Override
    public ExerciseAction.Builder addResult(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RESULT, value.build());
    }

    @Override
    public ExerciseAction.Builder addResult(String value) {
      return addProperty(CoreConstants.PROPERTY_RESULT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public ExerciseAction.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addSportsActivityLocation(SportsActivityLocation value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_ACTIVITY_LOCATION, value);
    }

    @Override
    public ExerciseAction.Builder addSportsActivityLocation(SportsActivityLocation.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_ACTIVITY_LOCATION, value.build());
    }

    @Override
    public ExerciseAction.Builder addSportsActivityLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_ACTIVITY_LOCATION, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addSportsEvent(SportsEvent value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_EVENT, value);
    }

    @Override
    public ExerciseAction.Builder addSportsEvent(SportsEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_EVENT, value.build());
    }

    @Override
    public ExerciseAction.Builder addSportsEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_EVENT, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addSportsTeam(SportsTeam value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_TEAM, value);
    }

    @Override
    public ExerciseAction.Builder addSportsTeam(SportsTeam.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_TEAM, value.build());
    }

    @Override
    public ExerciseAction.Builder addSportsTeam(String value) {
      return addProperty(CoreConstants.PROPERTY_SPORTS_TEAM, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addStartTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_START_TIME, value);
    }

    @Override
    public ExerciseAction.Builder addStartTime(String value) {
      return addProperty(CoreConstants.PROPERTY_START_TIME, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addTarget(EntryPoint value) {
      return addProperty(CoreConstants.PROPERTY_TARGET, value);
    }

    @Override
    public ExerciseAction.Builder addTarget(EntryPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TARGET, value.build());
    }

    @Override
    public ExerciseAction.Builder addTarget(String value) {
      return addProperty(CoreConstants.PROPERTY_TARGET, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addToLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_TO_LOCATION, value);
    }

    @Override
    public ExerciseAction.Builder addToLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TO_LOCATION, value.build());
    }

    @Override
    public ExerciseAction.Builder addToLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_TO_LOCATION, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public ExerciseAction.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public ExerciseAction.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public ExerciseAction.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public ExerciseAction.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public ExerciseAction.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public ExerciseAction.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public ExerciseAction build() {
      return new ExerciseActionImpl(properties, reverseMap);
    }
  }

  public ExerciseActionImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_EXERCISE_ACTION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCourseList() {
    return getProperty(CoreConstants.PROPERTY_COURSE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDietList() {
    return getProperty(CoreConstants.PROPERTY_DIET);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDistanceList() {
    return getProperty(CoreConstants.PROPERTY_DISTANCE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getExerciseCourseList() {
    return getProperty(CoreConstants.PROPERTY_EXERCISE_COURSE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getExercisePlanList() {
    return getProperty(CoreConstants.PROPERTY_EXERCISE_PLAN);
  }

  @Override
  public ImmutableList<SchemaOrgType> getExerciseRelatedDietList() {
    return getProperty(CoreConstants.PROPERTY_EXERCISE_RELATED_DIET);
  }

  @Override
  public ImmutableList<SchemaOrgType> getExerciseTypeList() {
    return getProperty(CoreConstants.PROPERTY_EXERCISE_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFromLocationList() {
    return getProperty(CoreConstants.PROPERTY_FROM_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOpponentList() {
    return getProperty(CoreConstants.PROPERTY_OPPONENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSportsActivityLocationList() {
    return getProperty(CoreConstants.PROPERTY_SPORTS_ACTIVITY_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSportsEventList() {
    return getProperty(CoreConstants.PROPERTY_SPORTS_EVENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSportsTeamList() {
    return getProperty(CoreConstants.PROPERTY_SPORTS_TEAM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getToLocationList() {
    return getProperty(CoreConstants.PROPERTY_TO_LOCATION);
  }
}
