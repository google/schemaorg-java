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
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.*;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/**
 * Implementation of {@link HowToStep}.
 */
public class HowToStepImpl extends CreativeWorkImpl implements HowToStep {
    private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

    private static ImmutableSet<String> initializePropertySet() {
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();

        builder.add(CoreConstants.PROPERTY_ABOUT);

        builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_API);

        builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL);

        builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE);

        builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD);

        builder.add(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON);

        builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

        builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

        builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

        builder.add(CoreConstants.PROPERTY_NEXT_ITEM);

        builder.add(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE);

        builder.add(CoreConstants.PROPERTY_ASSOCIATED_MEDIA);

        builder.add(CoreConstants.PROPERTY_AUDIENCE);

        builder.add(CoreConstants.PROPERTY_AUDIO);

        builder.add(CoreConstants.PROPERTY_AUTHOR);

        builder.add(CoreConstants.PROPERTY_AWARD);

        builder.add(CoreConstants.PROPERTY_AWARDS);

        builder.add(CoreConstants.PROPERTY_CHARACTER);

        builder.add(CoreConstants.PROPERTY_CITATION);

        builder.add(CoreConstants.PROPERTY_COMMENT);

        builder.add(CoreConstants.PROPERTY_COMMENT_COUNT);

        builder.add(CoreConstants.PROPERTY_CONTENT_LOCATION);

        builder.add(CoreConstants.PROPERTY_CONTENT_RATING);

        builder.add(CoreConstants.PROPERTY_CONTRIBUTOR);

        builder.add(CoreConstants.PROPERTY_COPYRIGHT_HOLDER);

        builder.add(CoreConstants.PROPERTY_COPYRIGHT_YEAR);

        builder.add(CoreConstants.PROPERTY_CREATOR);

        builder.add(CoreConstants.PROPERTY_DATE_CREATED);

        builder.add(CoreConstants.PROPERTY_DATE_MODIFIED);

        builder.add(CoreConstants.PROPERTY_DATE_PUBLISHED);

        builder.add(CoreConstants.PROPERTY_DESCRIPTION);

        builder.add(CoreConstants.PROPERTY_DISCUSSION_URL);

        builder.add(CoreConstants.PROPERTY_EDITOR);

        builder.add(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT);

        builder.add(CoreConstants.PROPERTY_EDUCATIONAL_USE);

        builder.add(CoreConstants.PROPERTY_ENCODING);

        builder.add(CoreConstants.PROPERTY_ENCODINGS);

        builder.add(CoreConstants.PROPERTY_EXAMPLE_OF_WORK);

        builder.add(CoreConstants.PROPERTY_FILE_FORMAT);

        builder.add(CoreConstants.PROPERTY_GENRE);

        builder.add(CoreConstants.PROPERTY_HAS_PART);

        builder.add(CoreConstants.PROPERTY_HEADLINE);

        builder.add(CoreConstants.PROPERTY_IMAGE);

        builder.add(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT);

        builder.add(CoreConstants.PROPERTY_ITEM_LIST_ORDER);

        builder.add(CoreConstants.PROPERTY_IN_LANGUAGE);

        builder.add(CoreConstants.PROPERTY_INTERACTION_STATISTIC);

        builder.add(CoreConstants.PROPERTY_INTERACTIVITY_TYPE);

        builder.add(CoreConstants.PROPERTY_IS_BASED_ON_URL);

        builder.add(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY);

        builder.add(CoreConstants.PROPERTY_IS_PART_OF);

        builder.add(CoreConstants.PROPERTY_KEYWORDS);

        builder.add(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE);

        builder.add(CoreConstants.PROPERTY_LICENSE);

        builder.add(CoreConstants.PROPERTY_LOCATION_CREATED);

        builder.add(CoreConstants.PROPERTY_MAIN_ENTITY);

        builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

        builder.add(CoreConstants.PROPERTY_MENTIONS);

        builder.add(CoreConstants.PROPERTY_NAME);

        builder.add(CoreConstants.PROPERTY_NUMBER_OF_ITEMS);

        builder.add(CoreConstants.PROPERTY_OFFERS);

        builder.add(CoreConstants.PROPERTY_POSITION);

        builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

        builder.add(CoreConstants.PROPERTY_PREVIOUS_ITEM);

        builder.add(CoreConstants.PROPERTY_PRODUCER);

        builder.add(CoreConstants.PROPERTY_PROVIDER);

        builder.add(CoreConstants.PROPERTY_PUBLICATION);

        builder.add(CoreConstants.PROPERTY_PUBLISHER);

        builder.add(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES);

        builder.add(CoreConstants.PROPERTY_RECORDED_AT);

        builder.add(CoreConstants.PROPERTY_RELEASED_EVENT);

        builder.add(CoreConstants.PROPERTY_REVIEW);

        builder.add(CoreConstants.PROPERTY_REVIEWS);

        builder.add(CoreConstants.PROPERTY_SAME_AS);

        builder.add(CoreConstants.PROPERTY_SCHEMA_VERSION);

        builder.add(CoreConstants.PROPERTY_SOURCE_ORGANIZATION);

        builder.add(CoreConstants.PROPERTY_TEXT);

        builder.add(CoreConstants.PROPERTY_THUMBNAIL_URL);

        builder.add(CoreConstants.PROPERTY_TIME_REQUIRED);

        builder.add(CoreConstants.PROPERTY_TRANSLATOR);

        builder.add(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE);

        builder.add(CoreConstants.PROPERTY_URL);

        builder.add(CoreConstants.PROPERTY_VERSION);

        builder.add(CoreConstants.PROPERTY_VIDEO);

        builder.add(CoreConstants.PROPERTY_WORK_EXAMPLE);

        builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

        builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

        builder.add(CoreConstants.PROPERTY_STEP);

        return builder.build();
    }

    static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<HowToStep.Builder>
            implements HowToStep.Builder {

        @Override
        public HowToStep.Builder addAbout(Thing value) {
            return addProperty(CoreConstants.PROPERTY_ABOUT, value);
        }

        @Override
        public HowToStep.Builder addAbout(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ABOUT, value.build());
        }

        @Override
        public HowToStep.Builder addAbout(String value) {
            return addProperty(CoreConstants.PROPERTY_ABOUT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAccessibilityAPI(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, value);
        }

        @Override
        public HowToStep.Builder addAccessibilityAPI(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAccessibilityControl(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, value);
        }

        @Override
        public HowToStep.Builder addAccessibilityControl(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAccessibilityFeature(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, value);
        }

        @Override
        public HowToStep.Builder addAccessibilityFeature(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAccessibilityHazard(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, value);
        }

        @Override
        public HowToStep.Builder addAccessibilityHazard(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAccountablePerson(Person value) {
            return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value);
        }

        @Override
        public HowToStep.Builder addAccountablePerson(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value.build());
        }

        @Override
        public HowToStep.Builder addAccountablePerson(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAdditionalType(URL value) {
            return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
        }

        @Override
        public HowToStep.Builder addAdditionalType(String value) {
            return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAggregateRating(AggregateRating value) {
            return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
        }

        @Override
        public HowToStep.Builder addAggregateRating(AggregateRating.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
        }

        @Override
        public HowToStep.Builder addAggregateRating(String value) {
            return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAlternateName(Text value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
        }

        @Override
        public HowToStep.Builder addAlternateName(String value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAlternativeHeadline(Text value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, value);
        }

        @Override
        public HowToStep.Builder addAlternativeHeadline(String value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAssociatedMedia(MediaObject value) {
            return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value);
        }

        @Override
        public HowToStep.Builder addAssociatedMedia(MediaObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value.build());
        }

        @Override
        public HowToStep.Builder addAssociatedMedia(String value) {
            return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAudience(Audience value) {
            return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
        }

        @Override
        public HowToStep.Builder addAudience(Audience.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
        }

        @Override
        public HowToStep.Builder addAudience(String value) {
            return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAudio(AudioObject value) {
            return addProperty(CoreConstants.PROPERTY_AUDIO, value);
        }

        @Override
        public HowToStep.Builder addAudio(AudioObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUDIO, value.build());
        }

        @Override
        public HowToStep.Builder addAudio(String value) {
            return addProperty(CoreConstants.PROPERTY_AUDIO, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAuthor(Organization value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
        }

        @Override
        public HowToStep.Builder addAuthor(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
        }

        @Override
        public HowToStep.Builder addAuthor(Person value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
        }

        @Override
        public HowToStep.Builder addAuthor(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
        }

        @Override
        public HowToStep.Builder addAuthor(String value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAward(Text value) {
            return addProperty(CoreConstants.PROPERTY_AWARD, value);
        }

        @Override
        public HowToStep.Builder addAward(String value) {
            return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
        }

        @Override
        public HowToStep.Builder addAwards(Text value) {
            return addProperty(CoreConstants.PROPERTY_AWARDS, value);
        }

        @Override
        public HowToStep.Builder addAwards(String value) {
            return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addCharacter(Person value) {
            return addProperty(CoreConstants.PROPERTY_CHARACTER, value);
        }

        @Override
        public HowToStep.Builder addCharacter(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CHARACTER, value.build());
        }

        @Override
        public HowToStep.Builder addCharacter(String value) {
            return addProperty(CoreConstants.PROPERTY_CHARACTER, Text.of(value));
        }

        @Override
        public HowToStep.Builder addCitation(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, value);
        }

        @Override
        public HowToStep.Builder addCitation(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, value.build());
        }

        @Override
        public HowToStep.Builder addCitation(Text value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, value);
        }

        @Override
        public HowToStep.Builder addCitation(String value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addComment(Comment value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT, value);
        }

        @Override
        public HowToStep.Builder addComment(Comment.Builder value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT, value.build());
        }

        @Override
        public HowToStep.Builder addComment(String value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addCommentCount(Integer value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, value);
        }

        @Override
        public HowToStep.Builder addCommentCount(String value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addContentLocation(Place value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value);
        }

        @Override
        public HowToStep.Builder addContentLocation(Place.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value.build());
        }

        @Override
        public HowToStep.Builder addContentLocation(String value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addContentRating(Text value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, value);
        }

        @Override
        public HowToStep.Builder addContentRating(String value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, Text.of(value));
        }

        @Override
        public HowToStep.Builder addContributor(Organization value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
        }

        @Override
        public HowToStep.Builder addContributor(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
        }

        @Override
        public HowToStep.Builder addContributor(Person value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
        }

        @Override
        public HowToStep.Builder addContributor(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
        }

        @Override
        public HowToStep.Builder addContributor(String value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, Text.of(value));
        }

        @Override
        public HowToStep.Builder addCopyrightHolder(Organization value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
        }

        @Override
        public HowToStep.Builder addCopyrightHolder(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
        }

        @Override
        public HowToStep.Builder addCopyrightHolder(Person value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
        }

        @Override
        public HowToStep.Builder addCopyrightHolder(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
        }

        @Override
        public HowToStep.Builder addCopyrightHolder(String value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, Text.of(value));
        }

        @Override
        public HowToStep.Builder addCopyrightYear(Number value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, value);
        }

        @Override
        public HowToStep.Builder addCopyrightYear(String value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, Text.of(value));
        }

        @Override
        public HowToStep.Builder addCreator(Organization value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value);
        }

        @Override
        public HowToStep.Builder addCreator(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
        }

        @Override
        public HowToStep.Builder addCreator(Person value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value);
        }

        @Override
        public HowToStep.Builder addCreator(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
        }

        @Override
        public HowToStep.Builder addCreator(String value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, Text.of(value));
        }

        @Override
        public HowToStep.Builder addDateCreated(Date value) {
            return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
        }

        @Override
        public HowToStep.Builder addDateCreated(DateTime value) {
            return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
        }

        @Override
        public HowToStep.Builder addDateCreated(String value) {
            return addProperty(CoreConstants.PROPERTY_DATE_CREATED, Text.of(value));
        }

        @Override
        public HowToStep.Builder addDateModified(Date value) {
            return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
        }

        @Override
        public HowToStep.Builder addDateModified(DateTime value) {
            return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
        }

        @Override
        public HowToStep.Builder addDateModified(String value) {
            return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, Text.of(value));
        }

        @Override
        public HowToStep.Builder addDatePublished(Date value) {
            return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, value);
        }

        @Override
        public HowToStep.Builder addDatePublished(String value) {
            return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, Text.of(value));
        }

        @Override
        public HowToStep.Builder addDescription(Text value) {
            return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
        }

        @Override
        public HowToStep.Builder addDescription(String value) {
            return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addDiscussionUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, value);
        }

        @Override
        public HowToStep.Builder addDiscussionUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, Text.of(value));
        }

        @Override
        public HowToStep.Builder addEditor(Person value) {
            return addProperty(CoreConstants.PROPERTY_EDITOR, value);
        }

        @Override
        public HowToStep.Builder addEditor(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_EDITOR, value.build());
        }

        @Override
        public HowToStep.Builder addEditor(String value) {
            return addProperty(CoreConstants.PROPERTY_EDITOR, Text.of(value));
        }

        @Override
        public HowToStep.Builder addEducationalAlignment(AlignmentObject value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value);
        }

        @Override
        public HowToStep.Builder addEducationalAlignment(AlignmentObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value.build());
        }

        @Override
        public HowToStep.Builder addEducationalAlignment(String value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addEducationalUse(Text value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, value);
        }

        @Override
        public HowToStep.Builder addEducationalUse(String value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addEncoding(MediaObject value) {
            return addProperty(CoreConstants.PROPERTY_ENCODING, value);
        }

        @Override
        public HowToStep.Builder addEncoding(MediaObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ENCODING, value.build());
        }

        @Override
        public HowToStep.Builder addEncoding(String value) {
            return addProperty(CoreConstants.PROPERTY_ENCODING, Text.of(value));
        }

        @Override
        public HowToStep.Builder addEncodings(MediaObject value) {
            return addProperty(CoreConstants.PROPERTY_ENCODINGS, value);
        }

        @Override
        public HowToStep.Builder addEncodings(MediaObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ENCODINGS, value.build());
        }

        @Override
        public HowToStep.Builder addEncodings(String value) {
            return addProperty(CoreConstants.PROPERTY_ENCODINGS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addExampleOfWork(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value);
        }

        @Override
        public HowToStep.Builder addExampleOfWork(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value.build());
        }

        @Override
        public HowToStep.Builder addExampleOfWork(String value) {
            return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, Text.of(value));
        }

        @Override
        public HowToStep.Builder addFileFormat(Text value) {
            return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, value);
        }

        @Override
        public HowToStep.Builder addFileFormat(String value) {
            return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addGenre(Text value) {
            return addProperty(CoreConstants.PROPERTY_GENRE, value);
        }

        @Override
        public HowToStep.Builder addGenre(URL value) {
            return addProperty(CoreConstants.PROPERTY_GENRE, value);
        }

        @Override
        public HowToStep.Builder addGenre(String value) {
            return addProperty(CoreConstants.PROPERTY_GENRE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addHasPart(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_HAS_PART, value);
        }

        @Override
        public HowToStep.Builder addHasPart(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_HAS_PART, value.build());
        }

        @Override
        public HowToStep.Builder addHasPart(String value) {
            return addProperty(CoreConstants.PROPERTY_HAS_PART, Text.of(value));
        }

        @Override
        public HowToStep.Builder addHeadline(Text value) {
            return addProperty(CoreConstants.PROPERTY_HEADLINE, value);
        }

        @Override
        public HowToStep.Builder addHeadline(String value) {
            return addProperty(CoreConstants.PROPERTY_HEADLINE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addImage(ImageObject value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, value);
        }

        @Override
        public HowToStep.Builder addImage(ImageObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
        }

        @Override
        public HowToStep.Builder addImage(URL value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, value);
        }

        @Override
        public HowToStep.Builder addImage(String value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addInLanguage(Language value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
        }

        @Override
        public HowToStep.Builder addInLanguage(Language.Builder value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
        }

        @Override
        public HowToStep.Builder addInLanguage(Text value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
        }

        @Override
        public HowToStep.Builder addInLanguage(String value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addInteractionStatistic(InteractionCounter value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value);
        }

        @Override
        public HowToStep.Builder addInteractionStatistic(InteractionCounter.Builder value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value.build());
        }

        @Override
        public HowToStep.Builder addInteractionStatistic(String value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, Text.of(value));
        }

        @Override
        public HowToStep.Builder addInteractivityType(Text value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, value);
        }

        @Override
        public HowToStep.Builder addInteractivityType(String value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addIsBasedOnUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, value);
        }

        @Override
        public HowToStep.Builder addIsBasedOnUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, Text.of(value));
        }

        @Override
        public HowToStep.Builder addIsFamilyFriendly(Boolean value) {
            return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, value);
        }

        @Override
        public HowToStep.Builder addIsFamilyFriendly(String value) {
            return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, Text.of(value));
        }

        @Override
        public HowToStep.Builder addIsPartOf(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value);
        }

        @Override
        public HowToStep.Builder addIsPartOf(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value.build());
        }

        @Override
        public HowToStep.Builder addIsPartOf(String value) {
            return addProperty(CoreConstants.PROPERTY_IS_PART_OF, Text.of(value));
        }

        @Override
        public HowToStep.Builder addKeywords(Text value) {
            return addProperty(CoreConstants.PROPERTY_KEYWORDS, value);
        }

        @Override
        public HowToStep.Builder addKeywords(String value) {
            return addProperty(CoreConstants.PROPERTY_KEYWORDS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addLearningResourceType(Text value) {
            return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, value);
        }

        @Override
        public HowToStep.Builder addLearningResourceType(String value) {
            return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addLicense(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, value);
        }

        @Override
        public HowToStep.Builder addLicense(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, value.build());
        }

        @Override
        public HowToStep.Builder addLicense(URL value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, value);
        }

        @Override
        public HowToStep.Builder addLicense(String value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addLocationCreated(Place value) {
            return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value);
        }

        @Override
        public HowToStep.Builder addLocationCreated(Place.Builder value) {
            return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value.build());
        }

        @Override
        public HowToStep.Builder addLocationCreated(String value) {
            return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, Text.of(value));
        }

        @Override
        public HowToStep.Builder addMainEntity(Thing value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value);
        }

        @Override
        public HowToStep.Builder addMainEntity(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value.build());
        }

        @Override
        public HowToStep.Builder addMainEntity(String value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, Text.of(value));
        }

        @Override
        public HowToStep.Builder addMainEntityOfPage(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
        }

        @Override
        public HowToStep.Builder addMainEntityOfPage(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
        }

        @Override
        public HowToStep.Builder addMainEntityOfPage(URL value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
        }

        @Override
        public HowToStep.Builder addMainEntityOfPage(String value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addMentions(Thing value) {
            return addProperty(CoreConstants.PROPERTY_MENTIONS, value);
        }

        @Override
        public HowToStep.Builder addMentions(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_MENTIONS, value.build());
        }

        @Override
        public HowToStep.Builder addMentions(String value) {
            return addProperty(CoreConstants.PROPERTY_MENTIONS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addName(Text value) {
            return addProperty(CoreConstants.PROPERTY_NAME, value);
        }

        @Override
        public HowToStep.Builder addName(String value) {
            return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
        }

        @Override
        public HowToStep.Builder addOffers(Offer value) {
            return addProperty(CoreConstants.PROPERTY_OFFERS, value);
        }

        @Override
        public HowToStep.Builder addOffers(Offer.Builder value) {
            return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
        }

        @Override
        public HowToStep.Builder addOffers(String value) {
            return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addPosition(Integer value) {
            return addProperty(CoreConstants.PROPERTY_POSITION, value);
        }

        @Override
        public HowToStep.Builder addPosition(Text value) {
            return addProperty(CoreConstants.PROPERTY_POSITION, value);
        }

        @Override
        public HowToStep.Builder addPosition(String value) {
            return addProperty(CoreConstants.PROPERTY_POSITION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addPotentialAction(Action value) {
            return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
        }

        @Override
        public HowToStep.Builder addPotentialAction(Action.Builder value) {
            return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
        }

        @Override
        public HowToStep.Builder addPotentialAction(String value) {
            return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addProducer(Organization value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
        }

        @Override
        public HowToStep.Builder addProducer(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
        }

        @Override
        public HowToStep.Builder addProducer(Person value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
        }

        @Override
        public HowToStep.Builder addProducer(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
        }

        @Override
        public HowToStep.Builder addProducer(String value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, Text.of(value));
        }

        @Override
        public HowToStep.Builder addProvider(Organization value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
        }

        @Override
        public HowToStep.Builder addProvider(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
        }

        @Override
        public HowToStep.Builder addProvider(Person value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
        }

        @Override
        public HowToStep.Builder addProvider(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
        }

        @Override
        public HowToStep.Builder addProvider(String value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
        }

        @Override
        public HowToStep.Builder addPublication(PublicationEvent value) {
            return addProperty(CoreConstants.PROPERTY_PUBLICATION, value);
        }

        @Override
        public HowToStep.Builder addPublication(PublicationEvent.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PUBLICATION, value.build());
        }

        @Override
        public HowToStep.Builder addPublication(String value) {
            return addProperty(CoreConstants.PROPERTY_PUBLICATION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addPublisher(Organization value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
        }

        @Override
        public HowToStep.Builder addPublisher(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
        }

        @Override
        public HowToStep.Builder addPublisher(Person value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
        }

        @Override
        public HowToStep.Builder addPublisher(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
        }

        @Override
        public HowToStep.Builder addPublisher(String value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, Text.of(value));
        }

        @Override
        public HowToStep.Builder addPublishingPrinciples(URL value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, value);
        }

        @Override
        public HowToStep.Builder addPublishingPrinciples(String value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, Text.of(value));
        }

        @Override
        public HowToStep.Builder addRecordedAt(Event value) {
            return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value);
        }

        @Override
        public HowToStep.Builder addRecordedAt(Event.Builder value) {
            return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value.build());
        }

        @Override
        public HowToStep.Builder addRecordedAt(String value) {
            return addProperty(CoreConstants.PROPERTY_RECORDED_AT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addReleasedEvent(PublicationEvent value) {
            return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value);
        }

        @Override
        public HowToStep.Builder addReleasedEvent(PublicationEvent.Builder value) {
            return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value.build());
        }

        @Override
        public HowToStep.Builder addReleasedEvent(String value) {
            return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addReview(Review value) {
            return addProperty(CoreConstants.PROPERTY_REVIEW, value);
        }

        @Override
        public HowToStep.Builder addReview(Review.Builder value) {
            return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
        }

        @Override
        public HowToStep.Builder addReview(String value) {
            return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
        }

        @Override
        public HowToStep.Builder addReviews(Review value) {
            return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
        }

        @Override
        public HowToStep.Builder addReviews(Review.Builder value) {
            return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
        }

        @Override
        public HowToStep.Builder addReviews(String value) {
            return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addSameAs(URL value) {
            return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
        }

        @Override
        public HowToStep.Builder addSameAs(String value) {
            return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addSchemaVersion(Text value) {
            return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
        }

        @Override
        public HowToStep.Builder addSchemaVersion(URL value) {
            return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
        }

        @Override
        public HowToStep.Builder addSchemaVersion(String value) {
            return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addSourceOrganization(Organization value) {
            return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value);
        }

        @Override
        public HowToStep.Builder addSourceOrganization(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value.build());
        }

        @Override
        public HowToStep.Builder addSourceOrganization(String value) {
            return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addText(Text value) {
            return addProperty(CoreConstants.PROPERTY_TEXT, value);
        }

        @Override
        public HowToStep.Builder addText(String value) {
            return addProperty(CoreConstants.PROPERTY_TEXT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addThumbnailUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, value);
        }

        @Override
        public HowToStep.Builder addThumbnailUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, Text.of(value));
        }

        @Override
        public HowToStep.Builder addTimeRequired(Duration value) {
            return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value);
        }

        @Override
        public HowToStep.Builder addTimeRequired(Duration.Builder value) {
            return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value.build());
        }

        @Override
        public HowToStep.Builder addTimeRequired(String value) {
            return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, Text.of(value));
        }

        @Override
        public HowToStep.Builder addTranslator(Organization value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
        }

        @Override
        public HowToStep.Builder addTranslator(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
        }

        @Override
        public HowToStep.Builder addTranslator(Person value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
        }

        @Override
        public HowToStep.Builder addTranslator(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
        }

        @Override
        public HowToStep.Builder addTranslator(String value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, Text.of(value));
        }

        @Override
        public HowToStep.Builder addTypicalAgeRange(Text value) {
            return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
        }

        @Override
        public HowToStep.Builder addTypicalAgeRange(String value) {
            return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_URL, value);
        }

        @Override
        public HowToStep.Builder addUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
        }

        @Override
        public HowToStep.Builder addVersion(Number value) {
            return addProperty(CoreConstants.PROPERTY_VERSION, value);
        }

        @Override
        public HowToStep.Builder addVersion(String value) {
            return addProperty(CoreConstants.PROPERTY_VERSION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addVideo(VideoObject value) {
            return addProperty(CoreConstants.PROPERTY_VIDEO, value);
        }

        @Override
        public HowToStep.Builder addVideo(VideoObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_VIDEO, value.build());
        }

        @Override
        public HowToStep.Builder addVideo(String value) {
            return addProperty(CoreConstants.PROPERTY_VIDEO, Text.of(value));
        }

        @Override
        public HowToStep.Builder addWorkExample(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value);
        }

        @Override
        public HowToStep.Builder addWorkExample(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value.build());
        }

        @Override
        public HowToStep.Builder addWorkExample(String value) {
            return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addDetailedDescription(Article value) {
            return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
        }

        @Override
        public HowToStep.Builder addDetailedDescription(Article.Builder value) {
            return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
        }

        @Override
        public HowToStep.Builder addDetailedDescription(String value) {
            return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
        }

        @Override
        public HowToStep.Builder addPopularityScore(PopularityScoreSpecification value) {
            return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
        }

        @Override
        public HowToStep.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
            return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
        }

        @Override
        public HowToStep.Builder addPopularityScore(String value) {
            return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
        }

        @Override
        public HowToStep.Builder addItem(Thing value) {
            return addProperty(CoreConstants.PROPERTY_ITEM, value);
        }

        @Override
        public HowToStep.Builder addItem(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ITEM, value.build());
        }

        @Override
        public HowToStep.Builder addItem(String value) {
            return addProperty(CoreConstants.PROPERTY_ITEM, Text.of(value));
        }

        @Override
        public HowToStep.Builder addNextItem(ListItem value) {
            return addProperty(CoreConstants.PROPERTY_NEXT_ITEM, value);
        }

        @Override
        public HowToStep.Builder addNextItem(ListItem.Builder value) {
            return addProperty(CoreConstants.PROPERTY_NEXT_ITEM, value.build());
        }

        @Override
        public HowToStep.Builder addNextItem(String value) {
            return addProperty(CoreConstants.PROPERTY_NEXT_ITEM, Text.of(value));
        }

        @Override
        public HowToStep.Builder addPreviousItem(ListItem value) {
            return addProperty(CoreConstants.PROPERTY_PREVIOUS_ITEM, value);
        }

        @Override
        public HowToStep.Builder addPreviousItem(ListItem.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PREVIOUS_ITEM, value.build());
        }

        @Override
        public HowToStep.Builder addPreviousItem(String value) {
            return addProperty(CoreConstants.PROPERTY_PREVIOUS_ITEM, Text.of(value));
        }

        @Override
        public HowToStep.Builder addItemListElement(ListItem value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT, value);
        }

        @Override
        public HowToStep.Builder addItemListElement(ListItem.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT, value.build());
        }

        @Override
        public HowToStep.Builder addItemListElement(Text value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT, value);
        }

        @Override
        public HowToStep.Builder addItemListElement(Thing value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT, value);
        }

        @Override
        public HowToStep.Builder addItemListElement(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT, value.build());
        }

        @Override
        public HowToStep.Builder addItemListElement(String value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT, Text.of(value));
        }

        @Override
        public HowToStep.Builder addItemListOrder(ItemListOrderType value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ORDER, value);
        }

        @Override
        public HowToStep.Builder addItemListOrder(Text value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ORDER, value);
        }

        @Override
        public HowToStep.Builder addItemListOrder(String value) {
            return addProperty(CoreConstants.PROPERTY_ITEM_LIST_ORDER, Text.of(value));
        }

        @Override
        public HowToStep.Builder addNumberOfItems(Integer value) {
            return addProperty(CoreConstants.PROPERTY_NUMBER_OF_ITEMS, value);
        }

        @Override
        public HowToStep.Builder addNumberOfItems(String value) {
            return addProperty(CoreConstants.PROPERTY_NUMBER_OF_ITEMS, Text.of(value));
        }

        @Override
        public HowToStep.Builder addStep(String value) {
            return addProperty(CoreConstants.PROPERTY_STEP, Text.of(value));
        }

        @Override
        public HowToStep.Builder addStep(Text value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);
        }

        @Override
        public HowToStep.Builder addStep(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);        }

        @Override
        public HowToStep.Builder addStep(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value.build());        }

        @Override
        public HowToStep.Builder addStep(HowToStep value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);        }

        @Override
        public HowToStep.Builder addStep(HowToStep.Builder value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value.build());        }

        @Override
        public HowToStep.Builder addStep(HowToSection value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);        }

        @Override
        public HowToStep.Builder addStep(HowToSection.Builder value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value.build());
        }

        @Override
        public HowToStep build() {
            return new HowToStepImpl(properties, reverseMap);
        }
    }

    public HowToStepImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
        super(properties, reverseMap);
    }

    @Override
    public String getFullTypeName() {
        return CoreConstants.TYPE_HOW_TO_STEP;
    }

    @Override
    public boolean includesProperty(String property) {
        return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
                || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
                || PROPERTY_SET.contains(property);
    }

    @Override
    public ImmutableList<SchemaOrgType> getItemList() {
        return getProperty(CoreConstants.PROPERTY_ITEM);
    }

    @Override
    public ImmutableList<SchemaOrgType> getNextItemList() {
        return getProperty(CoreConstants.PROPERTY_NEXT_ITEM);
    }

    @Override
    public ImmutableList<SchemaOrgType> getPositionList() {
        return getProperty(CoreConstants.PROPERTY_POSITION);
    }

    @Override
    public ImmutableList<SchemaOrgType> getPreviousItemList() {
        return getProperty(CoreConstants.PROPERTY_PREVIOUS_ITEM);
    }

    @Override
    public ImmutableList<SchemaOrgType> getItemListElementList() {
        return getProperty(CoreConstants.PROPERTY_ITEM_LIST_ELEMENT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getItemListOrderList() {
        return getProperty(CoreConstants.PROPERTY_ITEM_LIST_ORDER);
    }

    @Override
    public ImmutableList<SchemaOrgType> getNumberOfItemsList() {
        return getProperty(CoreConstants.PROPERTY_NUMBER_OF_ITEMS);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAboutList() {
        return getProperty(CoreConstants.PROPERTY_ABOUT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAccessibilityAPIList() {
        return getProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAccessibilityControlList() {
        return getProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAccessibilityFeatureList() {
        return getProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAccessibilityHazardList() {
        return getProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAccountablePersonList() {
        return getProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAggregateRatingList() {
        return getProperty(CoreConstants.PROPERTY_AGGREGATE_RATING);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAlternativeHeadlineList() {
        return getProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAssociatedMediaList() {
        return getProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAudienceList() {
        return getProperty(CoreConstants.PROPERTY_AUDIENCE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAudioList() {
        return getProperty(CoreConstants.PROPERTY_AUDIO);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAuthorList() {
        return getProperty(CoreConstants.PROPERTY_AUTHOR);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAwardList() {
        return getProperty(CoreConstants.PROPERTY_AWARD);
    }

    @Override
    public ImmutableList<SchemaOrgType> getAwardsList() {
        return getProperty(CoreConstants.PROPERTY_AWARDS);
    }

    @Override
    public ImmutableList<SchemaOrgType> getCharacterList() {
        return getProperty(CoreConstants.PROPERTY_CHARACTER);
    }

    @Override
    public ImmutableList<SchemaOrgType> getCitationList() {
        return getProperty(CoreConstants.PROPERTY_CITATION);
    }

    @Override
    public ImmutableList<SchemaOrgType> getCommentList() {
        return getProperty(CoreConstants.PROPERTY_COMMENT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getCommentCountList() {
        return getProperty(CoreConstants.PROPERTY_COMMENT_COUNT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getContentLocationList() {
        return getProperty(CoreConstants.PROPERTY_CONTENT_LOCATION);
    }

    @Override
    public ImmutableList<SchemaOrgType> getContentRatingList() {
        return getProperty(CoreConstants.PROPERTY_CONTENT_RATING);
    }

    @Override
    public ImmutableList<SchemaOrgType> getContributorList() {
        return getProperty(CoreConstants.PROPERTY_CONTRIBUTOR);
    }

    @Override
    public ImmutableList<SchemaOrgType> getCopyrightHolderList() {
        return getProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER);
    }

    @Override
    public ImmutableList<SchemaOrgType> getCopyrightYearList() {
        return getProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR);
    }

    @Override
    public ImmutableList<SchemaOrgType> getCreatorList() {
        return getProperty(CoreConstants.PROPERTY_CREATOR);
    }

    @Override
    public ImmutableList<SchemaOrgType> getDateCreatedList() {
        return getProperty(CoreConstants.PROPERTY_DATE_CREATED);
    }

    @Override
    public ImmutableList<SchemaOrgType> getDateModifiedList() {
        return getProperty(CoreConstants.PROPERTY_DATE_MODIFIED);
    }

    @Override
    public ImmutableList<SchemaOrgType> getDatePublishedList() {
        return getProperty(CoreConstants.PROPERTY_DATE_PUBLISHED);
    }

    @Override
    public ImmutableList<SchemaOrgType> getDiscussionUrlList() {
        return getProperty(CoreConstants.PROPERTY_DISCUSSION_URL);
    }

    @Override
    public ImmutableList<SchemaOrgType> getEditorList() {
        return getProperty(CoreConstants.PROPERTY_EDITOR);
    }

    @Override
    public ImmutableList<SchemaOrgType> getEducationalAlignmentList() {
        return getProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getEducationalUseList() {
        return getProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getEncodingList() {
        return getProperty(CoreConstants.PROPERTY_ENCODING);
    }

    @Override
    public ImmutableList<SchemaOrgType> getEncodingsList() {
        return getProperty(CoreConstants.PROPERTY_ENCODINGS);
    }

    @Override
    public ImmutableList<SchemaOrgType> getExampleOfWorkList() {
        return getProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK);
    }

    @Override
    public ImmutableList<SchemaOrgType> getFileFormatList() {
        return getProperty(CoreConstants.PROPERTY_FILE_FORMAT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getGenreList() {
        return getProperty(CoreConstants.PROPERTY_GENRE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getHasPartList() {
        return getProperty(CoreConstants.PROPERTY_HAS_PART);
    }

    @Override
    public ImmutableList<SchemaOrgType> getHeadlineList() {
        return getProperty(CoreConstants.PROPERTY_HEADLINE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getInLanguageList() {
        return getProperty(CoreConstants.PROPERTY_IN_LANGUAGE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getInteractionStatisticList() {
        return getProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC);
    }

    @Override
    public ImmutableList<SchemaOrgType> getInteractivityTypeList() {
        return getProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getIsBasedOnUrlList() {
        return getProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL);
    }

    @Override
    public ImmutableList<SchemaOrgType> getIsFamilyFriendlyList() {
        return getProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY);
    }

    @Override
    public ImmutableList<SchemaOrgType> getIsPartOfList() {
        return getProperty(CoreConstants.PROPERTY_IS_PART_OF);
    }

    @Override
    public ImmutableList<SchemaOrgType> getKeywordsList() {
        return getProperty(CoreConstants.PROPERTY_KEYWORDS);
    }

    @Override
    public ImmutableList<SchemaOrgType> getLearningResourceTypeList() {
        return getProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getLicenseList() {
        return getProperty(CoreConstants.PROPERTY_LICENSE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getLocationCreatedList() {
        return getProperty(CoreConstants.PROPERTY_LOCATION_CREATED);
    }

    @Override
    public ImmutableList<SchemaOrgType> getMainEntityList() {
        return getProperty(CoreConstants.PROPERTY_MAIN_ENTITY);
    }

    @Override
    public ImmutableList<SchemaOrgType> getMentionsList() {
        return getProperty(CoreConstants.PROPERTY_MENTIONS);
    }

    @Override
    public ImmutableList<SchemaOrgType> getOffersList() {
        return getProperty(CoreConstants.PROPERTY_OFFERS);
    }

    @Override
    public ImmutableList<SchemaOrgType> getProducerList() {
        return getProperty(CoreConstants.PROPERTY_PRODUCER);
    }

    @Override
    public ImmutableList<SchemaOrgType> getProviderList() {
        return getProperty(CoreConstants.PROPERTY_PROVIDER);
    }

    @Override
    public ImmutableList<SchemaOrgType> getPublicationList() {
        return getProperty(CoreConstants.PROPERTY_PUBLICATION);
    }

    @Override
    public ImmutableList<SchemaOrgType> getPublisherList() {
        return getProperty(CoreConstants.PROPERTY_PUBLISHER);
    }

    @Override
    public ImmutableList<SchemaOrgType> getPublishingPrinciplesList() {
        return getProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES);
    }

    @Override
    public ImmutableList<SchemaOrgType> getRecordedAtList() {
        return getProperty(CoreConstants.PROPERTY_RECORDED_AT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getReleasedEventList() {
        return getProperty(CoreConstants.PROPERTY_RELEASED_EVENT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getReviewList() {
        return getProperty(CoreConstants.PROPERTY_REVIEW);
    }

    @Override
    public ImmutableList<SchemaOrgType> getReviewsList() {
        return getProperty(CoreConstants.PROPERTY_REVIEWS);
    }

    @Override
    public ImmutableList<SchemaOrgType> getSchemaVersionList() {
        return getProperty(CoreConstants.PROPERTY_SCHEMA_VERSION);
    }

    @Override
    public ImmutableList<SchemaOrgType> getSourceOrganizationList() {
        return getProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION);
    }

    @Override
    public ImmutableList<SchemaOrgType> getTextList() {
        return getProperty(CoreConstants.PROPERTY_TEXT);
    }

    @Override
    public ImmutableList<SchemaOrgType> getThumbnailUrlList() {
        return getProperty(CoreConstants.PROPERTY_THUMBNAIL_URL);
    }

    @Override
    public ImmutableList<SchemaOrgType> getTimeRequiredList() {
        return getProperty(CoreConstants.PROPERTY_TIME_REQUIRED);
    }

    @Override
    public ImmutableList<SchemaOrgType> getTranslatorList() {
        return getProperty(CoreConstants.PROPERTY_TRANSLATOR);
    }

    @Override
    public ImmutableList<SchemaOrgType> getTypicalAgeRangeList() {
        return getProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getVersionList() {
        return getProperty(CoreConstants.PROPERTY_VERSION);
    }

    @Override
    public ImmutableList<SchemaOrgType> getVideoList() {
        return getProperty(CoreConstants.PROPERTY_VIDEO);
    }

    @Override
    public ImmutableList<SchemaOrgType> getWorkExampleList() {
        return getProperty(CoreConstants.PROPERTY_WORK_EXAMPLE);
    }

    @Override
    public ImmutableList<SchemaOrgType> getStepList() {
        return getProperty(CoreConstants.PROPERTY_STEP);
    }
}
