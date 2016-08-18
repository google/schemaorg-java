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
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link UserComments}. */
public class UserCommentsImpl extends UserInteractionImpl implements UserComments {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ATTENDEE);

    builder.add(CoreConstants.PROPERTY_ATTENDEES);

    builder.add(CoreConstants.PROPERTY_COMMENT_TEXT);

    builder.add(CoreConstants.PROPERTY_COMMENT_TIME);

    builder.add(CoreConstants.PROPERTY_CREATOR);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DISCUSSES);

    builder.add(CoreConstants.PROPERTY_DOOR_TIME);

    builder.add(CoreConstants.PROPERTY_DURATION);

    builder.add(CoreConstants.PROPERTY_END_DATE);

    builder.add(CoreConstants.PROPERTY_EVENT_STATUS);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IN_LANGUAGE);

    builder.add(CoreConstants.PROPERTY_LOCATION);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_ORGANIZER);

    builder.add(CoreConstants.PROPERTY_PERFORMER);

    builder.add(CoreConstants.PROPERTY_PERFORMERS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PREVIOUS_START_DATE);

    builder.add(CoreConstants.PROPERTY_RECORDED_IN);

    builder.add(CoreConstants.PROPERTY_REPLY_TO_URL);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<UserComments.Builder>
      implements UserComments.Builder {

    @Override
    public UserComments.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public UserComments.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public UserComments.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public UserComments.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public UserComments.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public UserComments.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public UserComments.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public UserComments.Builder addAttendee(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value);
    }

    @Override
    public UserComments.Builder addAttendee(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value.build());
    }

    @Override
    public UserComments.Builder addAttendee(Person value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value);
    }

    @Override
    public UserComments.Builder addAttendee(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, value.build());
    }

    @Override
    public UserComments.Builder addAttendee(String value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEE, Text.of(value));
    }

    @Override
    public UserComments.Builder addAttendees(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value);
    }

    @Override
    public UserComments.Builder addAttendees(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value.build());
    }

    @Override
    public UserComments.Builder addAttendees(Person value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value);
    }

    @Override
    public UserComments.Builder addAttendees(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, value.build());
    }

    @Override
    public UserComments.Builder addAttendees(String value) {
      return addProperty(CoreConstants.PROPERTY_ATTENDEES, Text.of(value));
    }

    @Override
    public UserComments.Builder addCommentText(Text value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_TEXT, value);
    }

    @Override
    public UserComments.Builder addCommentText(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_TEXT, Text.of(value));
    }

    @Override
    public UserComments.Builder addCommentTime(Date value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_TIME, value);
    }

    @Override
    public UserComments.Builder addCommentTime(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_TIME, Text.of(value));
    }

    @Override
    public UserComments.Builder addCreator(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public UserComments.Builder addCreator(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public UserComments.Builder addCreator(Person value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public UserComments.Builder addCreator(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public UserComments.Builder addCreator(String value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, Text.of(value));
    }

    @Override
    public UserComments.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public UserComments.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public UserComments.Builder addDiscusses(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSES, value);
    }

    @Override
    public UserComments.Builder addDiscusses(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSES, value.build());
    }

    @Override
    public UserComments.Builder addDiscusses(String value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSES, Text.of(value));
    }

    @Override
    public UserComments.Builder addDoorTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DOOR_TIME, value);
    }

    @Override
    public UserComments.Builder addDoorTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DOOR_TIME, Text.of(value));
    }

    @Override
    public UserComments.Builder addDuration(Duration value) {
      return addProperty(CoreConstants.PROPERTY_DURATION, value);
    }

    @Override
    public UserComments.Builder addDuration(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DURATION, value.build());
    }

    @Override
    public UserComments.Builder addDuration(String value) {
      return addProperty(CoreConstants.PROPERTY_DURATION, Text.of(value));
    }

    @Override
    public UserComments.Builder addEndDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_END_DATE, value);
    }

    @Override
    public UserComments.Builder addEndDate(String value) {
      return addProperty(CoreConstants.PROPERTY_END_DATE, Text.of(value));
    }

    @Override
    public UserComments.Builder addEventStatus(EventStatusType value) {
      return addProperty(CoreConstants.PROPERTY_EVENT_STATUS, value);
    }

    @Override
    public UserComments.Builder addEventStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENT_STATUS, Text.of(value));
    }

    @Override
    public UserComments.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public UserComments.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public UserComments.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public UserComments.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public UserComments.Builder addInLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public UserComments.Builder addInLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
    }

    @Override
    public UserComments.Builder addInLanguage(Text value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public UserComments.Builder addInLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
    }

    @Override
    public UserComments.Builder addLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public UserComments.Builder addLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public UserComments.Builder addLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public UserComments.Builder addLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public UserComments.Builder addLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public UserComments.Builder addLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, Text.of(value));
    }

    @Override
    public UserComments.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public UserComments.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public UserComments.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public UserComments.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public UserComments.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public UserComments.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public UserComments.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public UserComments.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public UserComments.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public UserComments.Builder addOrganizer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value);
    }

    @Override
    public UserComments.Builder addOrganizer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value.build());
    }

    @Override
    public UserComments.Builder addOrganizer(Person value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value);
    }

    @Override
    public UserComments.Builder addOrganizer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, value.build());
    }

    @Override
    public UserComments.Builder addOrganizer(String value) {
      return addProperty(CoreConstants.PROPERTY_ORGANIZER, Text.of(value));
    }

    @Override
    public UserComments.Builder addPerformer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value);
    }

    @Override
    public UserComments.Builder addPerformer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value.build());
    }

    @Override
    public UserComments.Builder addPerformer(Person value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value);
    }

    @Override
    public UserComments.Builder addPerformer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, value.build());
    }

    @Override
    public UserComments.Builder addPerformer(String value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER, Text.of(value));
    }

    @Override
    public UserComments.Builder addPerformers(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value);
    }

    @Override
    public UserComments.Builder addPerformers(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value.build());
    }

    @Override
    public UserComments.Builder addPerformers(Person value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value);
    }

    @Override
    public UserComments.Builder addPerformers(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, value.build());
    }

    @Override
    public UserComments.Builder addPerformers(String value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMERS, Text.of(value));
    }

    @Override
    public UserComments.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public UserComments.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public UserComments.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public UserComments.Builder addPreviousStartDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PREVIOUS_START_DATE, value);
    }

    @Override
    public UserComments.Builder addPreviousStartDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PREVIOUS_START_DATE, Text.of(value));
    }

    @Override
    public UserComments.Builder addRecordedIn(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_IN, value);
    }

    @Override
    public UserComments.Builder addRecordedIn(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_IN, value.build());
    }

    @Override
    public UserComments.Builder addRecordedIn(String value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_IN, Text.of(value));
    }

    @Override
    public UserComments.Builder addReplyToUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_REPLY_TO_URL, value);
    }

    @Override
    public UserComments.Builder addReplyToUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_REPLY_TO_URL, Text.of(value));
    }

    @Override
    public UserComments.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public UserComments.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public UserComments.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public UserComments.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public UserComments.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public UserComments.Builder addStartDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_START_DATE, value);
    }

    @Override
    public UserComments.Builder addStartDate(String value) {
      return addProperty(CoreConstants.PROPERTY_START_DATE, Text.of(value));
    }

    @Override
    public UserComments.Builder addSubEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENT, value);
    }

    @Override
    public UserComments.Builder addSubEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENT, value.build());
    }

    @Override
    public UserComments.Builder addSubEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENT, Text.of(value));
    }

    @Override
    public UserComments.Builder addSubEvents(Event value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENTS, value);
    }

    @Override
    public UserComments.Builder addSubEvents(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENTS, value.build());
    }

    @Override
    public UserComments.Builder addSubEvents(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_EVENTS, Text.of(value));
    }

    @Override
    public UserComments.Builder addSuperEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_SUPER_EVENT, value);
    }

    @Override
    public UserComments.Builder addSuperEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUPER_EVENT, value.build());
    }

    @Override
    public UserComments.Builder addSuperEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_SUPER_EVENT, Text.of(value));
    }

    @Override
    public UserComments.Builder addTypicalAgeRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
    }

    @Override
    public UserComments.Builder addTypicalAgeRange(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
    }

    @Override
    public UserComments.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public UserComments.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public UserComments.Builder addWorkFeatured(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_WORK_FEATURED, value);
    }

    @Override
    public UserComments.Builder addWorkFeatured(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_FEATURED, value.build());
    }

    @Override
    public UserComments.Builder addWorkFeatured(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_FEATURED, Text.of(value));
    }

    @Override
    public UserComments.Builder addWorkPerformed(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_WORK_PERFORMED, value);
    }

    @Override
    public UserComments.Builder addWorkPerformed(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_PERFORMED, value.build());
    }

    @Override
    public UserComments.Builder addWorkPerformed(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_PERFORMED, Text.of(value));
    }

    @Override
    public UserComments.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public UserComments.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public UserComments.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public UserComments.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public UserComments.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public UserComments.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public UserComments build() {
      return new UserCommentsImpl(properties, reverseMap);
    }
  }

  public UserCommentsImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_USER_COMMENTS;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCommentTextList() {
    return getProperty(CoreConstants.PROPERTY_COMMENT_TEXT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCommentTimeList() {
    return getProperty(CoreConstants.PROPERTY_COMMENT_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCreatorList() {
    return getProperty(CoreConstants.PROPERTY_CREATOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDiscussesList() {
    return getProperty(CoreConstants.PROPERTY_DISCUSSES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReplyToUrlList() {
    return getProperty(CoreConstants.PROPERTY_REPLY_TO_URL);
  }
}
