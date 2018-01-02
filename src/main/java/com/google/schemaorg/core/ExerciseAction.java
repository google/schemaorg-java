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

/**
 * Interface of <a href="http://schema.org/ExerciseAction">http://schema.org/ExerciseAction</a>.
 */
public interface ExerciseAction extends PlayAction {

  /**
   * Builder interface of <a
   * href="http://schema.org/ExerciseAction">http://schema.org/ExerciseAction</a>.
   */
  public interface Builder extends PlayAction.Builder {

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

    /** Add a value to property actionStatus. */
    Builder addActionStatus(ActionStatusType value);

    /** Add a value to property actionStatus. */
    Builder addActionStatus(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property agent. */
    Builder addAgent(Organization value);

    /** Add a value to property agent. */
    Builder addAgent(Organization.Builder value);

    /** Add a value to property agent. */
    Builder addAgent(Person value);

    /** Add a value to property agent. */
    Builder addAgent(Person.Builder value);

    /** Add a value to property agent. */
    Builder addAgent(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property audience. */
    Builder addAudience(Audience value);

    /** Add a value to property audience. */
    Builder addAudience(Audience.Builder value);

    /** Add a value to property audience. */
    Builder addAudience(String value);

    /** Add a value to property course. */
    Builder addCourse(Place value);

    /** Add a value to property course. */
    Builder addCourse(Place.Builder value);

    /** Add a value to property course. */
    Builder addCourse(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property diet. */
    Builder addDiet(Diet value);

    /** Add a value to property diet. */
    Builder addDiet(Diet.Builder value);

    /** Add a value to property diet. */
    Builder addDiet(String value);

    /** Add a value to property distance. */
    Builder addDistance(Distance value);

    /** Add a value to property distance. */
    Builder addDistance(Distance.Builder value);

    /** Add a value to property distance. */
    Builder addDistance(String value);

    /** Add a value to property endTime. */
    Builder addEndTime(DateTime value);

    /** Add a value to property endTime. */
    Builder addEndTime(String value);

    /** Add a value to property error. */
    Builder addError(Thing value);

    /** Add a value to property error. */
    Builder addError(Thing.Builder value);

    /** Add a value to property error. */
    Builder addError(String value);

    /** Add a value to property event. */
    Builder addEvent(Event value);

    /** Add a value to property event. */
    Builder addEvent(Event.Builder value);

    /** Add a value to property event. */
    Builder addEvent(String value);

    /** Add a value to property exerciseCourse. */
    Builder addExerciseCourse(Place value);

    /** Add a value to property exerciseCourse. */
    Builder addExerciseCourse(Place.Builder value);

    /** Add a value to property exerciseCourse. */
    Builder addExerciseCourse(String value);

    /** Add a value to property exercisePlan. */
    Builder addExercisePlan(ExercisePlan value);

    /** Add a value to property exercisePlan. */
    Builder addExercisePlan(ExercisePlan.Builder value);

    /** Add a value to property exercisePlan. */
    Builder addExercisePlan(String value);

    /** Add a value to property exerciseRelatedDiet. */
    Builder addExerciseRelatedDiet(Diet value);

    /** Add a value to property exerciseRelatedDiet. */
    Builder addExerciseRelatedDiet(Diet.Builder value);

    /** Add a value to property exerciseRelatedDiet. */
    Builder addExerciseRelatedDiet(String value);

    /** Add a value to property exerciseType. */
    Builder addExerciseType(Text value);

    /** Add a value to property exerciseType. */
    Builder addExerciseType(String value);

    /** Add a value to property fromLocation. */
    Builder addFromLocation(Place value);

    /** Add a value to property fromLocation. */
    Builder addFromLocation(Place.Builder value);

    /** Add a value to property fromLocation. */
    Builder addFromLocation(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property instrument. */
    Builder addInstrument(Thing value);

    /** Add a value to property instrument. */
    Builder addInstrument(Thing.Builder value);

    /** Add a value to property instrument. */
    Builder addInstrument(String value);

    /** Add a value to property location. */
    Builder addLocation(Place value);

    /** Add a value to property location. */
    Builder addLocation(Place.Builder value);

    /** Add a value to property location. */
    Builder addLocation(PostalAddress value);

    /** Add a value to property location. */
    Builder addLocation(PostalAddress.Builder value);

    /** Add a value to property location. */
    Builder addLocation(Text value);

    /** Add a value to property location. */
    Builder addLocation(String value);

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

    /** Add a value to property object. */
    Builder addObject(Thing value);

    /** Add a value to property object. */
    Builder addObject(Thing.Builder value);

    /** Add a value to property object. */
    Builder addObject(String value);

    /** Add a value to property opponent. */
    Builder addOpponent(Person value);

    /** Add a value to property opponent. */
    Builder addOpponent(Person.Builder value);

    /** Add a value to property opponent. */
    Builder addOpponent(String value);

    /** Add a value to property participant. */
    Builder addParticipant(Organization value);

    /** Add a value to property participant. */
    Builder addParticipant(Organization.Builder value);

    /** Add a value to property participant. */
    Builder addParticipant(Person value);

    /** Add a value to property participant. */
    Builder addParticipant(Person.Builder value);

    /** Add a value to property participant. */
    Builder addParticipant(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property result. */
    Builder addResult(Thing value);

    /** Add a value to property result. */
    Builder addResult(Thing.Builder value);

    /** Add a value to property result. */
    Builder addResult(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property sportsActivityLocation. */
    Builder addSportsActivityLocation(SportsActivityLocation value);

    /** Add a value to property sportsActivityLocation. */
    Builder addSportsActivityLocation(SportsActivityLocation.Builder value);

    /** Add a value to property sportsActivityLocation. */
    Builder addSportsActivityLocation(String value);

    /** Add a value to property sportsEvent. */
    Builder addSportsEvent(SportsEvent value);

    /** Add a value to property sportsEvent. */
    Builder addSportsEvent(SportsEvent.Builder value);

    /** Add a value to property sportsEvent. */
    Builder addSportsEvent(String value);

    /** Add a value to property sportsTeam. */
    Builder addSportsTeam(SportsTeam value);

    /** Add a value to property sportsTeam. */
    Builder addSportsTeam(SportsTeam.Builder value);

    /** Add a value to property sportsTeam. */
    Builder addSportsTeam(String value);

    /** Add a value to property startTime. */
    Builder addStartTime(DateTime value);

    /** Add a value to property startTime. */
    Builder addStartTime(String value);

    /** Add a value to property target. */
    Builder addTarget(EntryPoint value);

    /** Add a value to property target. */
    Builder addTarget(EntryPoint.Builder value);

    /** Add a value to property target. */
    Builder addTarget(String value);

    /** Add a value to property toLocation. */
    Builder addToLocation(Place value);

    /** Add a value to property toLocation. */
    Builder addToLocation(Place.Builder value);

    /** Add a value to property toLocation. */
    Builder addToLocation(String value);

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

    /** Build a {@link ExerciseAction} object. */
    ExerciseAction build();
  }

  /**
   * Returns the value list of property course. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCourseList();

  /**
   * Returns the value list of property diet. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getDietList();

  /**
   * Returns the value list of property distance. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getDistanceList();

  /**
   * Returns the value list of property exerciseCourse. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getExerciseCourseList();

  /**
   * Returns the value list of property exercisePlan. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getExercisePlanList();

  /**
   * Returns the value list of property exerciseRelatedDiet. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getExerciseRelatedDietList();

  /**
   * Returns the value list of property exerciseType. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getExerciseTypeList();

  /**
   * Returns the value list of property fromLocation. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getFromLocationList();

  /**
   * Returns the value list of property opponent. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getOpponentList();

  /**
   * Returns the value list of property sportsActivityLocation. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getSportsActivityLocationList();

  /**
   * Returns the value list of property sportsEvent. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getSportsEventList();

  /**
   * Returns the value list of property sportsTeam. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getSportsTeamList();

  /**
   * Returns the value list of property toLocation. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getToLocationList();
}
