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

import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/UserTweets">http://schema.org/UserTweets</a>. */
public interface UserTweets extends UserInteraction {

  /**
   * Builder interface of <a href="http://schema.org/UserTweets">http://schema.org/UserTweets</a>.
   */
  public interface Builder extends UserInteraction.Builder {

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

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating.Builder value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property attendee. */
    Builder addAttendee(Organization value);

    /** Add a value to property attendee. */
    Builder addAttendee(Organization.Builder value);

    /** Add a value to property attendee. */
    Builder addAttendee(Person value);

    /** Add a value to property attendee. */
    Builder addAttendee(Person.Builder value);

    /** Add a value to property attendee. */
    Builder addAttendee(String value);

    /** Add a value to property attendees. */
    Builder addAttendees(Organization value);

    /** Add a value to property attendees. */
    Builder addAttendees(Organization.Builder value);

    /** Add a value to property attendees. */
    Builder addAttendees(Person value);

    /** Add a value to property attendees. */
    Builder addAttendees(Person.Builder value);

    /** Add a value to property attendees. */
    Builder addAttendees(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property doorTime. */
    Builder addDoorTime(DateTime value);

    /** Add a value to property doorTime. */
    Builder addDoorTime(String value);

    /** Add a value to property duration. */
    Builder addDuration(Duration value);

    /** Add a value to property duration. */
    Builder addDuration(Duration.Builder value);

    /** Add a value to property duration. */
    Builder addDuration(String value);

    /** Add a value to property endDate. */
    Builder addEndDate(Date value);

    /** Add a value to property endDate. */
    Builder addEndDate(String value);

    /** Add a value to property eventStatus. */
    Builder addEventStatus(EventStatusType value);

    /** Add a value to property eventStatus. */
    Builder addEventStatus(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(Language value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(Language.Builder value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(Text value);

    /** Add a value to property inLanguage. */
    Builder addInLanguage(String value);

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

    /** Add a value to property offers. */
    Builder addOffers(Offer value);

    /** Add a value to property offers. */
    Builder addOffers(Offer.Builder value);

    /** Add a value to property offers. */
    Builder addOffers(String value);

    /** Add a value to property organizer. */
    Builder addOrganizer(Organization value);

    /** Add a value to property organizer. */
    Builder addOrganizer(Organization.Builder value);

    /** Add a value to property organizer. */
    Builder addOrganizer(Person value);

    /** Add a value to property organizer. */
    Builder addOrganizer(Person.Builder value);

    /** Add a value to property organizer. */
    Builder addOrganizer(String value);

    /** Add a value to property performer. */
    Builder addPerformer(Organization value);

    /** Add a value to property performer. */
    Builder addPerformer(Organization.Builder value);

    /** Add a value to property performer. */
    Builder addPerformer(Person value);

    /** Add a value to property performer. */
    Builder addPerformer(Person.Builder value);

    /** Add a value to property performer. */
    Builder addPerformer(String value);

    /** Add a value to property performers. */
    Builder addPerformers(Organization value);

    /** Add a value to property performers. */
    Builder addPerformers(Organization.Builder value);

    /** Add a value to property performers. */
    Builder addPerformers(Person value);

    /** Add a value to property performers. */
    Builder addPerformers(Person.Builder value);

    /** Add a value to property performers. */
    Builder addPerformers(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property previousStartDate. */
    Builder addPreviousStartDate(Date value);

    /** Add a value to property previousStartDate. */
    Builder addPreviousStartDate(String value);

    /** Add a value to property recordedIn. */
    Builder addRecordedIn(CreativeWork value);

    /** Add a value to property recordedIn. */
    Builder addRecordedIn(CreativeWork.Builder value);

    /** Add a value to property recordedIn. */
    Builder addRecordedIn(String value);

    /** Add a value to property review. */
    Builder addReview(Review value);

    /** Add a value to property review. */
    Builder addReview(Review.Builder value);

    /** Add a value to property review. */
    Builder addReview(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property startDate. */
    Builder addStartDate(Date value);

    /** Add a value to property startDate. */
    Builder addStartDate(String value);

    /** Add a value to property subEvent. */
    Builder addSubEvent(Event value);

    /** Add a value to property subEvent. */
    Builder addSubEvent(Event.Builder value);

    /** Add a value to property subEvent. */
    Builder addSubEvent(String value);

    /** Add a value to property subEvents. */
    Builder addSubEvents(Event value);

    /** Add a value to property subEvents. */
    Builder addSubEvents(Event.Builder value);

    /** Add a value to property subEvents. */
    Builder addSubEvents(String value);

    /** Add a value to property superEvent. */
    Builder addSuperEvent(Event value);

    /** Add a value to property superEvent. */
    Builder addSuperEvent(Event.Builder value);

    /** Add a value to property superEvent. */
    Builder addSuperEvent(String value);

    /** Add a value to property typicalAgeRange. */
    Builder addTypicalAgeRange(Text value);

    /** Add a value to property typicalAgeRange. */
    Builder addTypicalAgeRange(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property workFeatured. */
    Builder addWorkFeatured(CreativeWork value);

    /** Add a value to property workFeatured. */
    Builder addWorkFeatured(CreativeWork.Builder value);

    /** Add a value to property workFeatured. */
    Builder addWorkFeatured(String value);

    /** Add a value to property workPerformed. */
    Builder addWorkPerformed(CreativeWork value);

    /** Add a value to property workPerformed. */
    Builder addWorkPerformed(CreativeWork.Builder value);

    /** Add a value to property workPerformed. */
    Builder addWorkPerformed(String value);

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

    /** Build a {@link UserTweets} object. */
    UserTweets build();
  }
}
