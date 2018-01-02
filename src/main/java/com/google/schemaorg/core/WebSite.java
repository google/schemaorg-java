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
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/WebSite">http://schema.org/WebSite</a>. */
public interface WebSite extends CreativeWork {

  /** Builder interface of <a href="http://schema.org/WebSite">http://schema.org/WebSite</a>. */
  public interface Builder extends CreativeWork.Builder {

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

    /** Add a value to property about. */
    Builder addAbout(Thing value);

    /** Add a value to property about. */
    Builder addAbout(Thing.Builder value);

    /** Add a value to property about. */
    Builder addAbout(String value);

    /** Add a value to property accessibilityAPI. */
    Builder addAccessibilityAPI(Text value);

    /** Add a value to property accessibilityAPI. */
    Builder addAccessibilityAPI(String value);

    /** Add a value to property accessibilityControl. */
    Builder addAccessibilityControl(Text value);

    /** Add a value to property accessibilityControl. */
    Builder addAccessibilityControl(String value);

    /** Add a value to property accessibilityFeature. */
    Builder addAccessibilityFeature(Text value);

    /** Add a value to property accessibilityFeature. */
    Builder addAccessibilityFeature(String value);

    /** Add a value to property accessibilityHazard. */
    Builder addAccessibilityHazard(Text value);

    /** Add a value to property accessibilityHazard. */
    Builder addAccessibilityHazard(String value);

    /** Add a value to property accountablePerson. */
    Builder addAccountablePerson(Person value);

    /** Add a value to property accountablePerson. */
    Builder addAccountablePerson(Person.Builder value);

    /** Add a value to property accountablePerson. */
    Builder addAccountablePerson(String value);

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

    /** Add a value to property alternativeHeadline. */
    Builder addAlternativeHeadline(Text value);

    /** Add a value to property alternativeHeadline. */
    Builder addAlternativeHeadline(String value);

    /** Add a value to property associatedMedia. */
    Builder addAssociatedMedia(MediaObject value);

    /** Add a value to property associatedMedia. */
    Builder addAssociatedMedia(MediaObject.Builder value);

    /** Add a value to property associatedMedia. */
    Builder addAssociatedMedia(String value);

    /** Add a value to property audience. */
    Builder addAudience(Audience value);

    /** Add a value to property audience. */
    Builder addAudience(Audience.Builder value);

    /** Add a value to property audience. */
    Builder addAudience(String value);

    /** Add a value to property audio. */
    Builder addAudio(AudioObject value);

    /** Add a value to property audio. */
    Builder addAudio(AudioObject.Builder value);

    /** Add a value to property audio. */
    Builder addAudio(String value);

    /** Add a value to property author. */
    Builder addAuthor(Organization value);

    /** Add a value to property author. */
    Builder addAuthor(Organization.Builder value);

    /** Add a value to property author. */
    Builder addAuthor(Person value);

    /** Add a value to property author. */
    Builder addAuthor(Person.Builder value);

    /** Add a value to property author. */
    Builder addAuthor(String value);

    /** Add a value to property award. */
    Builder addAward(Text value);

    /** Add a value to property award. */
    Builder addAward(String value);

    /** Add a value to property awards. */
    Builder addAwards(Text value);

    /** Add a value to property awards. */
    Builder addAwards(String value);

    /** Add a value to property character. */
    Builder addCharacter(Person value);

    /** Add a value to property character. */
    Builder addCharacter(Person.Builder value);

    /** Add a value to property character. */
    Builder addCharacter(String value);

    /** Add a value to property citation. */
    Builder addCitation(CreativeWork value);

    /** Add a value to property citation. */
    Builder addCitation(CreativeWork.Builder value);

    /** Add a value to property citation. */
    Builder addCitation(Text value);

    /** Add a value to property citation. */
    Builder addCitation(String value);

    /** Add a value to property comment. */
    Builder addComment(Comment value);

    /** Add a value to property comment. */
    Builder addComment(Comment.Builder value);

    /** Add a value to property comment. */
    Builder addComment(String value);

    /** Add a value to property commentCount. */
    Builder addCommentCount(Integer value);

    /** Add a value to property commentCount. */
    Builder addCommentCount(String value);

    /** Add a value to property contentLocation. */
    Builder addContentLocation(Place value);

    /** Add a value to property contentLocation. */
    Builder addContentLocation(Place.Builder value);

    /** Add a value to property contentLocation. */
    Builder addContentLocation(String value);

    /** Add a value to property contentRating. */
    Builder addContentRating(Text value);

    /** Add a value to property contentRating. */
    Builder addContentRating(String value);

    /** Add a value to property contributor. */
    Builder addContributor(Organization value);

    /** Add a value to property contributor. */
    Builder addContributor(Organization.Builder value);

    /** Add a value to property contributor. */
    Builder addContributor(Person value);

    /** Add a value to property contributor. */
    Builder addContributor(Person.Builder value);

    /** Add a value to property contributor. */
    Builder addContributor(String value);

    /** Add a value to property copyrightHolder. */
    Builder addCopyrightHolder(Organization value);

    /** Add a value to property copyrightHolder. */
    Builder addCopyrightHolder(Organization.Builder value);

    /** Add a value to property copyrightHolder. */
    Builder addCopyrightHolder(Person value);

    /** Add a value to property copyrightHolder. */
    Builder addCopyrightHolder(Person.Builder value);

    /** Add a value to property copyrightHolder. */
    Builder addCopyrightHolder(String value);

    /** Add a value to property copyrightYear. */
    Builder addCopyrightYear(Number value);

    /** Add a value to property copyrightYear. */
    Builder addCopyrightYear(String value);

    /** Add a value to property creator. */
    Builder addCreator(Organization value);

    /** Add a value to property creator. */
    Builder addCreator(Organization.Builder value);

    /** Add a value to property creator. */
    Builder addCreator(Person value);

    /** Add a value to property creator. */
    Builder addCreator(Person.Builder value);

    /** Add a value to property creator. */
    Builder addCreator(String value);

    /** Add a value to property dateCreated. */
    Builder addDateCreated(Date value);

    /** Add a value to property dateCreated. */
    Builder addDateCreated(DateTime value);

    /** Add a value to property dateCreated. */
    Builder addDateCreated(String value);

    /** Add a value to property dateModified. */
    Builder addDateModified(Date value);

    /** Add a value to property dateModified. */
    Builder addDateModified(DateTime value);

    /** Add a value to property dateModified. */
    Builder addDateModified(String value);

    /** Add a value to property datePublished. */
    Builder addDatePublished(Date value);

    /** Add a value to property datePublished. */
    Builder addDatePublished(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property discussionUrl. */
    Builder addDiscussionUrl(URL value);

    /** Add a value to property discussionUrl. */
    Builder addDiscussionUrl(String value);

    /** Add a value to property editor. */
    Builder addEditor(Person value);

    /** Add a value to property editor. */
    Builder addEditor(Person.Builder value);

    /** Add a value to property editor. */
    Builder addEditor(String value);

    /** Add a value to property educationalAlignment. */
    Builder addEducationalAlignment(AlignmentObject value);

    /** Add a value to property educationalAlignment. */
    Builder addEducationalAlignment(AlignmentObject.Builder value);

    /** Add a value to property educationalAlignment. */
    Builder addEducationalAlignment(String value);

    /** Add a value to property educationalUse. */
    Builder addEducationalUse(Text value);

    /** Add a value to property educationalUse. */
    Builder addEducationalUse(String value);

    /** Add a value to property encoding. */
    Builder addEncoding(MediaObject value);

    /** Add a value to property encoding. */
    Builder addEncoding(MediaObject.Builder value);

    /** Add a value to property encoding. */
    Builder addEncoding(String value);

    /** Add a value to property encodings. */
    Builder addEncodings(MediaObject value);

    /** Add a value to property encodings. */
    Builder addEncodings(MediaObject.Builder value);

    /** Add a value to property encodings. */
    Builder addEncodings(String value);

    /** Add a value to property exampleOfWork. */
    Builder addExampleOfWork(CreativeWork value);

    /** Add a value to property exampleOfWork. */
    Builder addExampleOfWork(CreativeWork.Builder value);

    /** Add a value to property exampleOfWork. */
    Builder addExampleOfWork(String value);

    /** Add a value to property fileFormat. */
    Builder addFileFormat(Text value);

    /** Add a value to property fileFormat. */
    Builder addFileFormat(String value);

    /** Add a value to property genre. */
    Builder addGenre(Text value);

    /** Add a value to property genre. */
    Builder addGenre(URL value);

    /** Add a value to property genre. */
    Builder addGenre(String value);

    /** Add a value to property hasPart. */
    Builder addHasPart(CreativeWork value);

    /** Add a value to property hasPart. */
    Builder addHasPart(CreativeWork.Builder value);

    /** Add a value to property hasPart. */
    Builder addHasPart(String value);

    /** Add a value to property headline. */
    Builder addHeadline(Text value);

    /** Add a value to property headline. */
    Builder addHeadline(String value);

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

    /** Add a value to property interactionStatistic. */
    Builder addInteractionStatistic(InteractionCounter value);

    /** Add a value to property interactionStatistic. */
    Builder addInteractionStatistic(InteractionCounter.Builder value);

    /** Add a value to property interactionStatistic. */
    Builder addInteractionStatistic(String value);

    /** Add a value to property interactivityType. */
    Builder addInteractivityType(Text value);

    /** Add a value to property interactivityType. */
    Builder addInteractivityType(String value);

    /** Add a value to property isBasedOnUrl. */
    Builder addIsBasedOnUrl(URL value);

    /** Add a value to property isBasedOnUrl. */
    Builder addIsBasedOnUrl(String value);

    /** Add a value to property isFamilyFriendly. */
    Builder addIsFamilyFriendly(Boolean value);

    /** Add a value to property isFamilyFriendly. */
    Builder addIsFamilyFriendly(String value);

    /** Add a value to property isPartOf. */
    Builder addIsPartOf(CreativeWork value);

    /** Add a value to property isPartOf. */
    Builder addIsPartOf(CreativeWork.Builder value);

    /** Add a value to property isPartOf. */
    Builder addIsPartOf(String value);

    /** Add a value to property keywords. */
    Builder addKeywords(Text value);

    /** Add a value to property keywords. */
    Builder addKeywords(String value);

    /** Add a value to property learningResourceType. */
    Builder addLearningResourceType(Text value);

    /** Add a value to property learningResourceType. */
    Builder addLearningResourceType(String value);

    /** Add a value to property license. */
    Builder addLicense(CreativeWork value);

    /** Add a value to property license. */
    Builder addLicense(CreativeWork.Builder value);

    /** Add a value to property license. */
    Builder addLicense(URL value);

    /** Add a value to property license. */
    Builder addLicense(String value);

    /** Add a value to property locationCreated. */
    Builder addLocationCreated(Place value);

    /** Add a value to property locationCreated. */
    Builder addLocationCreated(Place.Builder value);

    /** Add a value to property locationCreated. */
    Builder addLocationCreated(String value);

    /** Add a value to property mainEntity. */
    Builder addMainEntity(Thing value);

    /** Add a value to property mainEntity. */
    Builder addMainEntity(Thing.Builder value);

    /** Add a value to property mainEntity. */
    Builder addMainEntity(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property mentions. */
    Builder addMentions(Thing value);

    /** Add a value to property mentions. */
    Builder addMentions(Thing.Builder value);

    /** Add a value to property mentions. */
    Builder addMentions(String value);

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

    /** Add a value to property position. */
    Builder addPosition(Integer value);

    /** Add a value to property position. */
    Builder addPosition(Text value);

    /** Add a value to property position. */
    Builder addPosition(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property producer. */
    Builder addProducer(Organization value);

    /** Add a value to property producer. */
    Builder addProducer(Organization.Builder value);

    /** Add a value to property producer. */
    Builder addProducer(Person value);

    /** Add a value to property producer. */
    Builder addProducer(Person.Builder value);

    /** Add a value to property producer. */
    Builder addProducer(String value);

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

    /** Add a value to property publication. */
    Builder addPublication(PublicationEvent value);

    /** Add a value to property publication. */
    Builder addPublication(PublicationEvent.Builder value);

    /** Add a value to property publication. */
    Builder addPublication(String value);

    /** Add a value to property publisher. */
    Builder addPublisher(Organization value);

    /** Add a value to property publisher. */
    Builder addPublisher(Organization.Builder value);

    /** Add a value to property publisher. */
    Builder addPublisher(Person value);

    /** Add a value to property publisher. */
    Builder addPublisher(Person.Builder value);

    /** Add a value to property publisher. */
    Builder addPublisher(String value);

    /** Add a value to property publishingPrinciples. */
    Builder addPublishingPrinciples(URL value);

    /** Add a value to property publishingPrinciples. */
    Builder addPublishingPrinciples(String value);

    /** Add a value to property recordedAt. */
    Builder addRecordedAt(Event value);

    /** Add a value to property recordedAt. */
    Builder addRecordedAt(Event.Builder value);

    /** Add a value to property recordedAt. */
    Builder addRecordedAt(String value);

    /** Add a value to property releasedEvent. */
    Builder addReleasedEvent(PublicationEvent value);

    /** Add a value to property releasedEvent. */
    Builder addReleasedEvent(PublicationEvent.Builder value);

    /** Add a value to property releasedEvent. */
    Builder addReleasedEvent(String value);

    /** Add a value to property review. */
    Builder addReview(Review value);

    /** Add a value to property review. */
    Builder addReview(Review.Builder value);

    /** Add a value to property review. */
    Builder addReview(String value);

    /** Add a value to property reviews. */
    Builder addReviews(Review value);

    /** Add a value to property reviews. */
    Builder addReviews(Review.Builder value);

    /** Add a value to property reviews. */
    Builder addReviews(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property schemaVersion. */
    Builder addSchemaVersion(Text value);

    /** Add a value to property schemaVersion. */
    Builder addSchemaVersion(URL value);

    /** Add a value to property schemaVersion. */
    Builder addSchemaVersion(String value);

    /** Add a value to property sourceOrganization. */
    Builder addSourceOrganization(Organization value);

    /** Add a value to property sourceOrganization. */
    Builder addSourceOrganization(Organization.Builder value);

    /** Add a value to property sourceOrganization. */
    Builder addSourceOrganization(String value);

    /** Add a value to property text. */
    Builder addText(Text value);

    /** Add a value to property text. */
    Builder addText(String value);

    /** Add a value to property thumbnailUrl. */
    Builder addThumbnailUrl(URL value);

    /** Add a value to property thumbnailUrl. */
    Builder addThumbnailUrl(String value);

    /** Add a value to property timeRequired. */
    Builder addTimeRequired(Duration value);

    /** Add a value to property timeRequired. */
    Builder addTimeRequired(Duration.Builder value);

    /** Add a value to property timeRequired. */
    Builder addTimeRequired(String value);

    /** Add a value to property translator. */
    Builder addTranslator(Organization value);

    /** Add a value to property translator. */
    Builder addTranslator(Organization.Builder value);

    /** Add a value to property translator. */
    Builder addTranslator(Person value);

    /** Add a value to property translator. */
    Builder addTranslator(Person.Builder value);

    /** Add a value to property translator. */
    Builder addTranslator(String value);

    /** Add a value to property typicalAgeRange. */
    Builder addTypicalAgeRange(Text value);

    /** Add a value to property typicalAgeRange. */
    Builder addTypicalAgeRange(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property version. */
    Builder addVersion(Number value);

    /** Add a value to property version. */
    Builder addVersion(String value);

    /** Add a value to property video. */
    Builder addVideo(VideoObject value);

    /** Add a value to property video. */
    Builder addVideo(VideoObject.Builder value);

    /** Add a value to property video. */
    Builder addVideo(String value);

    /** Add a value to property workExample. */
    Builder addWorkExample(CreativeWork value);

    /** Add a value to property workExample. */
    Builder addWorkExample(CreativeWork.Builder value);

    /** Add a value to property workExample. */
    Builder addWorkExample(String value);

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

    /** Build a {@link WebSite} object. */
    WebSite build();
  }
}
