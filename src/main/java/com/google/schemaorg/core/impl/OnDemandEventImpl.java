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

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link OnDemandEvent}. */
public class OnDemandEventImpl extends PublicationEventImpl implements OnDemandEvent {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ATTENDEE);

    builder.add(CoreConstants.PROPERTY_ATTENDEES);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DOOR_TIME);

    builder.add(CoreConstants.PROPERTY_DURATION);

    builder.add(CoreConstants.PROPERTY_END_DATE);

    builder.add(CoreConstants.PROPERTY_EVENT_STATUS);

    builder.add(CoreConstants.PROPERTY_FREE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IN_LANGUAGE);

    builder.add(CoreConstants.PROPERTY_IS_ACCESSIBLE_FOR_FREE);

    builder.add(CoreConstants.PROPERTY_LOCATION);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_ORGANIZER);

    builder.add(CoreConstants.PROPERTY_PERFORMER);

    builder.add(CoreConstants.PROPERTY_PERFORMERS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PREVIOUS_START_DATE);

    builder.add(CoreConstants.PROPERTY_PUBLISHED_ON);

    builder.add(CoreConstants.PROPERTY_RECORDED_IN);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_START_DATE);

    builder.add(CoreConstants.PROPERTY_SUB_EVENT);

    builder.add(CoreConstants.PROPERTY_SUB_EVENTS);

    builder.add(CoreConstants.PROPERTY_SUPER_EVENT);

    builder.add(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_WORK_FEATURED);

    builder.add(CoreConstants.PROPERTY_WORK_PERFORMED);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<OnDemandEvent.Builder>
      implements OnDemandEvent.Builder {

    @Override
    public OnDemandEvent.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public OnDemandEvent.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public OnDemandEvent.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public OnDemandEvent.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public OnDemandEvent.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addAttendee(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value);
    }

    @Override
    public OnDemandEvent.Builder addAttendee(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value.build());
    }

    @Override
    public OnDemandEvent.Builder addAttendee(Person value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value);
    }

    @Override
    public OnDemandEvent.Builder addAttendee(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value.build());
    }

    @Override
    public OnDemandEvent.Builder addAttendee(String value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addAttendees(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value);
    }

    @Override
    public OnDemandEvent.Builder addAttendees(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value.build());
    }

    @Override
    public OnDemandEvent.Builder addAttendees(Person value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value);
    }

    @Override
    public OnDemandEvent.Builder addAttendees(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value.build());
    }

    @Override
    public OnDemandEvent.Builder addAttendees(String value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public OnDemandEvent.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addDoorTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DOOR_TIME, value);
    }

    @Override
    public OnDemandEvent.Builder addDoorTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DOOR_TIME, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addDuration(Duration value) {
      return addProperty(CoreConstants.PROPERTY_DURATION, value);
    }

    @Override
    public OnDemandEvent.Builder addDuration(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DURATION, value.build());
    }

    @Override
    public OnDemandEvent.Builder addDuration(String value) {
      return addProperty(CoreConstants.PROPERTY_DURATION, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addEndDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_END_DATE, value);
    }

    @Override
    public OnDemandEvent.Builder addEndDate(String value) {
      return addProperty(CoreConstants.PROPERTY_END_DATE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addEventStatus(EventStatusType value) {
      return addProperty(CoreConstants.PROPERTY_EVENT_STATUS, value);
    }

    @Override
    public OnDemandEvent.Builder addEventStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENT_STATUS, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addFree(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_FREE, value);
    }

    @Override
    public OnDemandEvent.Builder addFree(String value) {
      return addProperty(CoreConstants.PROPERTY_FREE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public OnDemandEvent.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public OnDemandEvent.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public OnDemandEvent.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addInLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public OnDemandEvent.Builder addInLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
    }

    @Override
    public OnDemandEvent.Builder addInLanguage(Text value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public OnDemandEvent.Builder addInLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addIsAccessibleForFree(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSIBLE_FOR_FREE, value);
    }

    @Override
    public OnDemandEvent.Builder addIsAccessibleForFree(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSIBLE_FOR_FREE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public OnDemandEvent.Builder addLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public OnDemandEvent.Builder addLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public OnDemandEvent.Builder addLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public OnDemandEvent.Builder addLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public OnDemandEvent.Builder addLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public OnDemandEvent.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public OnDemandEvent.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public OnDemandEvent.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public OnDemandEvent.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public OnDemandEvent.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public OnDemandEvent.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addOrganizer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value);
    }

    @Override
    public OnDemandEvent.Builder addOrganizer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value.build());
    }

    @Override
    public OnDemandEvent.Builder addOrganizer(Person value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value);
    }

    @Override
    public OnDemandEvent.Builder addOrganizer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value.build());
    }

    @Override
    public OnDemandEvent.Builder addOrganizer(String value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addPerformer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value);
    }

    @Override
    public OnDemandEvent.Builder addPerformer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value.build());
    }

    @Override
    public OnDemandEvent.Builder addPerformer(Person value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value);
    }

    @Override
    public OnDemandEvent.Builder addPerformer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value.build());
    }

    @Override
    public OnDemandEvent.Builder addPerformer(String value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addPerformers(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value);
    }

    @Override
    public OnDemandEvent.Builder addPerformers(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value.build());
    }

    @Override
    public OnDemandEvent.Builder addPerformers(Person value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value);
    }

    @Override
    public OnDemandEvent.Builder addPerformers(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value.build());
    }

    @Override
    public OnDemandEvent.Builder addPerformers(String value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public OnDemandEvent.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public OnDemandEvent.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addPreviousStartDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PREVIOUS_START_DATE, value);
    }

    @Override
    public OnDemandEvent.Builder addPreviousStartDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PREVIOUS_START_DATE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addPublishedOn(BroadcastService value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHED_ON, value);
    }

    @Override
    public OnDemandEvent.Builder addPublishedOn(BroadcastService.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHED_ON, value.build());
    }

    @Override
    public OnDemandEvent.Builder addPublishedOn(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHED_ON, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addRecordedIn(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_IN, value);
    }

    @Override
    public OnDemandEvent.Builder addRecordedIn(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_IN, value.build());
    }

    @Override
    public OnDemandEvent.Builder addRecordedIn(String value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_IN, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public OnDemandEvent.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public OnDemandEvent.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public OnDemandEvent.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addStartDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_START_DATE, value);
    }

    @Override
    public OnDemandEvent.Builder addStartDate(String value) {
      return addProperty(CoreConstants.PROPERTY_START_DATE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addSubEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENT, value);
    }

    @Override
    public OnDemandEvent.Builder addSubEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENT, value.build());
    }

    @Override
    public OnDemandEvent.Builder addSubEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENT, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addSubEvents(Event value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENTS, value);
    }

    @Override
    public OnDemandEvent.Builder addSubEvents(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENTS, value.build());
    }

    @Override
    public OnDemandEvent.Builder addSubEvents(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENTS, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addSuperEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_SUPER_EVENT, value);
    }

    @Override
    public OnDemandEvent.Builder addSuperEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUPER_EVENT, value.build());
    }

    @Override
    public OnDemandEvent.Builder addSuperEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_SUPER_EVENT, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addTypicalAgeRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
    }

    @Override
    public OnDemandEvent.Builder addTypicalAgeRange(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public OnDemandEvent.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addWorkFeatured(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_WORK_FEATURED, value);
    }

    @Override
    public OnDemandEvent.Builder addWorkFeatured(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_FEATURED, value.build());
    }

    @Override
    public OnDemandEvent.Builder addWorkFeatured(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_FEATURED, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addWorkPerformed(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_WORK_PERFORMED, value);
    }

    @Override
    public OnDemandEvent.Builder addWorkPerformed(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_PERFORMED, value.build());
    }

    @Override
    public OnDemandEvent.Builder addWorkPerformed(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_PERFORMED, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public OnDemandEvent.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public OnDemandEvent.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public OnDemandEvent.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public OnDemandEvent.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public OnDemandEvent.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public OnDemandEvent build() {
      return new OnDemandEventImpl(properties, reverseMap);
    }
  }

  public OnDemandEventImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_ON_DEMAND_EVENT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
