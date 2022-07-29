package com.google.schemaorg.core;

import com.google.common.collect.ImmutableList;
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.*;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.goog.PopularityScoreSpecification;

import javax.annotation.Nullable;

public interface HowToStep extends CreativeWork, ItemList, ListItem {
    public interface Builder extends CreativeWork.Builder, ItemList.Builder, ListItem.Builder {
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

        @Override
        Builder addAbout(Thing value);

        @Override
        Builder addAbout(Thing.Builder value);

        @Override
        Builder addAbout(String value);

        @Override
        Builder addAccessibilityAPI(Text value);

        @Override
        Builder addAccessibilityAPI(String value);

        @Override
        Builder addAccessibilityControl(Text value);

        @Override
        Builder addAccessibilityControl(String value);

        @Override
        Builder addAccessibilityFeature(Text value);

        @Override
        Builder addAccessibilityFeature(String value);

        @Override
        Builder addAccessibilityHazard(Text value);

        @Override
        Builder addAccessibilityHazard(String value);

        @Override
        Builder addAccountablePerson(Person value);

        @Override
        Builder addAccountablePerson(Person.Builder value);

        @Override
        Builder addAccountablePerson(String value);

        @Override
        Builder addAdditionalType(URL value);

        @Override
        Builder addAdditionalType(String value);

        @Override
        Builder addAggregateRating(AggregateRating value);

        @Override
        Builder addAggregateRating(AggregateRating.Builder value);

        @Override
        Builder addAggregateRating(String value);

        @Override
        Builder addAlternateName(Text value);

        @Override
        Builder addAlternateName(String value);

        @Override
        Builder addAlternativeHeadline(Text value);

        @Override
        Builder addAlternativeHeadline(String value);

        @Override
        Builder addAssociatedMedia(MediaObject value);

        @Override
        Builder addAssociatedMedia(MediaObject.Builder value);

        @Override
        Builder addAssociatedMedia(String value);

        @Override
        Builder addAudience(Audience value);

        @Override
        Builder addAudience(Audience.Builder value);

        @Override
        Builder addAudience(String value);

        @Override
        Builder addAudio(AudioObject value);

        @Override
        Builder addAudio(AudioObject.Builder value);

        @Override
        Builder addAudio(String value);

        @Override
        Builder addAuthor(Organization value);

        @Override
        Builder addAuthor(Organization.Builder value);

        @Override
        Builder addAuthor(Person value);

        @Override
        Builder addAuthor(Person.Builder value);

        @Override
        Builder addAuthor(String value);

        @Override
        Builder addAward(Text value);

        @Override
        Builder addAward(String value);

        @Override
        Builder addAwards(Text value);

        @Override
        Builder addAwards(String value);

        @Override
        Builder addCharacter(Person value);

        @Override
        Builder addCharacter(Person.Builder value);

        @Override
        Builder addCharacter(String value);

        @Override
        Builder addCitation(CreativeWork value);

        @Override
        Builder addCitation(CreativeWork.Builder value);

        @Override
        Builder addCitation(Text value);

        @Override
        Builder addCitation(String value);

        @Override
        Builder addComment(Comment value);

        @Override
        Builder addComment(Comment.Builder value);

        @Override
        Builder addComment(String value);

        @Override
        Builder addCommentCount(Integer value);

        @Override
        Builder addCommentCount(String value);

        @Override
        Builder addContentLocation(Place value);

        @Override
        Builder addContentLocation(Place.Builder value);

        @Override
        Builder addContentLocation(String value);

        @Override
        Builder addContentRating(Text value);

        @Override
        Builder addContentRating(String value);

        @Override
        Builder addContributor(Organization value);

        @Override
        Builder addContributor(Organization.Builder value);

        @Override
        Builder addContributor(Person value);

        @Override
        Builder addContributor(Person.Builder value);

        @Override
        Builder addContributor(String value);

        @Override
        Builder addCopyrightHolder(Organization value);

        @Override
        Builder addCopyrightHolder(Organization.Builder value);

        @Override
        Builder addCopyrightHolder(Person value);

        @Override
        Builder addCopyrightHolder(Person.Builder value);

        @Override
        Builder addCopyrightHolder(String value);

        @Override
        Builder addCopyrightYear(Number value);

        @Override
        Builder addCopyrightYear(String value);

        @Override
        Builder addCreator(Organization value);

        @Override
        Builder addCreator(Organization.Builder value);

        @Override
        Builder addCreator(Person value);

        @Override
        Builder addCreator(Person.Builder value);

        @Override
        Builder addCreator(String value);

        @Override
        Builder addDateCreated(Date value);

        @Override
        Builder addDateCreated(DateTime value);

        @Override
        Builder addDateCreated(String value);

        @Override
        Builder addDateModified(Date value);

        @Override
        Builder addDateModified(DateTime value);

        @Override
        Builder addDateModified(String value);

        @Override
        Builder addDatePublished(Date value);

        @Override
        Builder addDatePublished(String value);

        @Override
        Builder addDescription(Text value);

        @Override
        Builder addDescription(String value);

        @Override
        Builder addDiscussionUrl(URL value);

        @Override
        Builder addDiscussionUrl(String value);

        @Override
        Builder addEditor(Person value);

        @Override
        Builder addEditor(Person.Builder value);

        @Override
        Builder addEditor(String value);

        @Override
        Builder addEducationalAlignment(AlignmentObject value);

        @Override
        Builder addEducationalAlignment(AlignmentObject.Builder value);

        @Override
        Builder addEducationalAlignment(String value);

        @Override
        Builder addEducationalUse(Text value);

        @Override
        Builder addEducationalUse(String value);

        @Override
        Builder addEncoding(MediaObject value);

        @Override
        Builder addEncoding(MediaObject.Builder value);

        @Override
        Builder addEncoding(String value);

        @Override
        Builder addEncodings(MediaObject value);

        @Override
        Builder addEncodings(MediaObject.Builder value);

        @Override
        Builder addEncodings(String value);

        @Override
        Builder addExampleOfWork(CreativeWork value);

        @Override
        Builder addExampleOfWork(CreativeWork.Builder value);

        @Override
        Builder addExampleOfWork(String value);

        @Override
        Builder addFileFormat(Text value);

        @Override
        Builder addFileFormat(String value);

        @Override
        Builder addGenre(Text value);

        @Override
        Builder addGenre(URL value);

        @Override
        Builder addGenre(String value);

        @Override
        Builder addHasPart(CreativeWork value);

        @Override
        Builder addHasPart(CreativeWork.Builder value);

        @Override
        Builder addHasPart(String value);

        @Override
        Builder addHeadline(Text value);

        @Override
        Builder addHeadline(String value);

        @Override
        Builder addImage(ImageObject value);

        @Override
        Builder addImage(ImageObject.Builder value);

        @Override
        Builder addImage(URL value);

        @Override
        Builder addImage(String value);

        @Override
        Builder addItem(Thing value);

        @Override
        Builder addItem(Thing.Builder value);

        @Override
        Builder addItem(String value);

        @Override
        Builder addItemListElement(ListItem value);

        @Override
        Builder addItemListElement(ListItem.Builder value);

        @Override
        Builder addItemListElement(Text value);

        @Override
        Builder addItemListElement(Thing value);

        @Override
        Builder addItemListElement(Thing.Builder value);

        @Override
        Builder addItemListElement(String value);

        @Override
        Builder addItemListOrder(ItemListOrderType value);

        @Override
        Builder addItemListOrder(Text value);

        @Override
        Builder addItemListOrder(String value);

        @Override
        Builder addInLanguage(Language value);

        @Override
        Builder addInLanguage(Language.Builder value);

        @Override
        Builder addInLanguage(Text value);

        @Override
        Builder addInLanguage(String value);

        @Override
        Builder addInteractionStatistic(InteractionCounter value);

        @Override
        Builder addInteractionStatistic(InteractionCounter.Builder value);

        @Override
        Builder addInteractionStatistic(String value);

        @Override
        Builder addInteractivityType(Text value);

        @Override
        Builder addInteractivityType(String value);

        @Override
        Builder addIsBasedOnUrl(URL value);

        @Override
        Builder addIsBasedOnUrl(String value);

        @Override
        Builder addIsFamilyFriendly(Boolean value);

        @Override
        Builder addIsFamilyFriendly(String value);

        @Override
        Builder addIsPartOf(CreativeWork value);

        @Override
        Builder addIsPartOf(CreativeWork.Builder value);

        @Override
        Builder addIsPartOf(String value);

        @Override
        Builder addKeywords(Text value);

        @Override
        Builder addKeywords(String value);

        @Override
        Builder addLearningResourceType(Text value);

        @Override
        Builder addLearningResourceType(String value);

        @Override
        Builder addLicense(CreativeWork value);

        @Override
        Builder addLicense(CreativeWork.Builder value);

        @Override
        Builder addLicense(URL value);

        @Override
        Builder addLicense(String value);

        @Override
        Builder addLocationCreated(Place value);

        @Override
        Builder addLocationCreated(Place.Builder value);

        @Override
        Builder addLocationCreated(String value);

        @Override
        Builder addMainEntity(Thing value);

        @Override
        Builder addMainEntity(Thing.Builder value);

        @Override
        Builder addMainEntity(String value);

        @Override
        Builder addMainEntityOfPage(CreativeWork value);

        @Override
        Builder addMainEntityOfPage(CreativeWork.Builder value);

        @Override
        Builder addMainEntityOfPage(URL value);

        @Override
        Builder addMainEntityOfPage(String value);

        @Override
        Builder addMentions(Thing value);

        @Override
        Builder addMentions(Thing.Builder value);

        @Override
        Builder addMentions(String value);

        @Override
        Builder addName(Text value);

        @Override
        Builder addName(String value);

        @Override
        Builder addNextItem(ListItem value);

        @Override
        Builder addNextItem(ListItem.Builder value);

        @Override
        Builder addNextItem(String value);

        @Override
        Builder addNumberOfItems(Integer value);

        @Override
        Builder addNumberOfItems(String value);

        @Override
        Builder addOffers(Offer value);

        @Override
        Builder addOffers(Offer.Builder value);

        @Override
        Builder addOffers(String value);

        @Override
        Builder addPosition(Integer value);

        @Override
        Builder addPosition(Text value);

        @Override
        Builder addPosition(String value);

        @Override
        Builder addPotentialAction(Action value);

        @Override
        Builder addPotentialAction(Action.Builder value);

        @Override
        Builder addPotentialAction(String value);

        @Override
        Builder addPreviousItem(ListItem value);

        @Override
        Builder addPreviousItem(ListItem.Builder value);

        @Override
        Builder addPreviousItem(String value);

        @Override
        Builder addProducer(Organization value);

        @Override
        Builder addProducer(Organization.Builder value);

        @Override
        Builder addProducer(Person value);

        @Override
        Builder addProducer(Person.Builder value);

        @Override
        Builder addProducer(String value);

        @Override
        Builder addProvider(Organization value);

        @Override
        Builder addProvider(Organization.Builder value);

        @Override
        Builder addProvider(Person value);

        @Override
        Builder addProvider(Person.Builder value);

        @Override
        Builder addProvider(String value);

        @Override
        Builder addPublication(PublicationEvent value);

        @Override
        Builder addPublication(PublicationEvent.Builder value);

        @Override
        Builder addPublication(String value);

        @Override
        Builder addPublisher(Organization value);

        @Override
        Builder addPublisher(Organization.Builder value);

        @Override
        Builder addPublisher(Person value);

        @Override
        Builder addPublisher(Person.Builder value);

        @Override
        Builder addPublisher(String value);

        @Override
        Builder addPublishingPrinciples(URL value);

        @Override
        Builder addPublishingPrinciples(String value);

        @Override
        Builder addRecordedAt(Event value);

        @Override
        Builder addRecordedAt(Event.Builder value);

        @Override
        Builder addRecordedAt(String value);

        @Override
        Builder addReleasedEvent(PublicationEvent value);

        @Override
        Builder addReleasedEvent(PublicationEvent.Builder value);

        @Override
        Builder addReleasedEvent(String value);

        @Override
        Builder addReview(Review value);

        @Override
        Builder addReview(Review.Builder value);

        @Override
        Builder addReview(String value);

        @Override
        Builder addReviews(Review value);

        @Override
        Builder addReviews(Review.Builder value);

        @Override
        Builder addReviews(String value);

        @Override
        Builder addSameAs(URL value);

        @Override
        Builder addSameAs(String value);

        @Override
        Builder addSchemaVersion(Text value);

        @Override
        Builder addSchemaVersion(URL value);

        @Override
        Builder addSchemaVersion(String value);

        @Override
        Builder addSourceOrganization(Organization value);

        @Override
        Builder addSourceOrganization(Organization.Builder value);

        @Override
        Builder addSourceOrganization(String value);

        @Override
        Builder addText(Text value);

        @Override
        Builder addText(String value);

        @Override
        Builder addThumbnailUrl(URL value);

        @Override
        Builder addThumbnailUrl(String value);

        @Override
        Builder addTimeRequired(Duration value);

        @Override
        Builder addTimeRequired(Duration.Builder value);

        @Override
        Builder addTimeRequired(String value);

        @Override
        Builder addTranslator(Organization value);

        @Override
        Builder addTranslator(Organization.Builder value);

        @Override
        Builder addTranslator(Person value);

        @Override
        Builder addTranslator(Person.Builder value);

        @Override
        Builder addTranslator(String value);

        @Override
        Builder addTypicalAgeRange(Text value);

        @Override
        Builder addTypicalAgeRange(String value);

        @Override
        Builder addUrl(URL value);

        @Override
        Builder addUrl(String value);

        @Override
        Builder addVersion(Number value);

        @Override
        Builder addVersion(String value);

        @Override
        Builder addVideo(VideoObject value);

        @Override
        Builder addVideo(VideoObject.Builder value);

        @Override
        Builder addVideo(String value);

        @Override
        Builder addWorkExample(CreativeWork value);

        @Override
        Builder addWorkExample(CreativeWork.Builder value);

        @Override
        Builder addWorkExample(String value);

        @Override
        Builder addDetailedDescription(Article value);

        @Override
        Builder addDetailedDescription(Article.Builder value);

        @Override
        Builder addDetailedDescription(String value);

        @Override
        Builder addPopularityScore(PopularityScoreSpecification value);

        @Override
        Builder addPopularityScore(PopularityScoreSpecification.Builder value);

        @Override
        Builder addPopularityScore(String value);

        Builder addStep(String value);

        Builder addStep(Text value);

        Builder addStep(CreativeWork value);

        Builder addStep(CreativeWork.Builder value);

        Builder addStep(HowToStep value);

        Builder addStep(HowToStep.Builder value);

        Builder addStep(HowToSection value);

        Builder addStep(HowToSection.Builder value);

        @Override
        Builder addProperty(String name, SchemaOrgType value);

        @Override
        Builder addProperty(String name, Thing.Builder builder);

        @Override
        Builder addProperty(String name, String value);

        @Override
        HowToStep build();
    }

    ImmutableList<SchemaOrgType> getStepList();
}