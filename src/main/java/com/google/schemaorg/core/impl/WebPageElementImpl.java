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
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link WebPageElement}. */
public class WebPageElementImpl extends CreativeWorkImpl implements WebPageElement {
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

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_POSITION);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

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

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<WebPageElement.Builder>
      implements WebPageElement.Builder {

    @Override
    public WebPageElement.Builder addAbout(Thing value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, value);
    }

    @Override
    public WebPageElement.Builder addAbout(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, value.build());
    }

    @Override
    public WebPageElement.Builder addAbout(String value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAccessibilityAPI(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, value);
    }

    @Override
    public WebPageElement.Builder addAccessibilityAPI(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAccessibilityControl(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, value);
    }

    @Override
    public WebPageElement.Builder addAccessibilityControl(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAccessibilityFeature(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, value);
    }

    @Override
    public WebPageElement.Builder addAccessibilityFeature(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAccessibilityHazard(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, value);
    }

    @Override
    public WebPageElement.Builder addAccessibilityHazard(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAccountablePerson(Person value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value);
    }

    @Override
    public WebPageElement.Builder addAccountablePerson(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value.build());
    }

    @Override
    public WebPageElement.Builder addAccountablePerson(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public WebPageElement.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public WebPageElement.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public WebPageElement.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public WebPageElement.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAlternativeHeadline(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, value);
    }

    @Override
    public WebPageElement.Builder addAlternativeHeadline(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAssociatedMedia(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value);
    }

    @Override
    public WebPageElement.Builder addAssociatedMedia(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value.build());
    }

    @Override
    public WebPageElement.Builder addAssociatedMedia(String value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public WebPageElement.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public WebPageElement.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAudio(AudioObject value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, value);
    }

    @Override
    public WebPageElement.Builder addAudio(AudioObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, value.build());
    }

    @Override
    public WebPageElement.Builder addAudio(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAuthor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
    }

    @Override
    public WebPageElement.Builder addAuthor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
    }

    @Override
    public WebPageElement.Builder addAuthor(Person value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
    }

    @Override
    public WebPageElement.Builder addAuthor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
    }

    @Override
    public WebPageElement.Builder addAuthor(String value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public WebPageElement.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public WebPageElement.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addCharacter(Person value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, value);
    }

    @Override
    public WebPageElement.Builder addCharacter(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, value.build());
    }

    @Override
    public WebPageElement.Builder addCharacter(String value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addCitation(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value);
    }

    @Override
    public WebPageElement.Builder addCitation(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value.build());
    }

    @Override
    public WebPageElement.Builder addCitation(Text value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value);
    }

    @Override
    public WebPageElement.Builder addCitation(String value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addComment(Comment value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, value);
    }

    @Override
    public WebPageElement.Builder addComment(Comment.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, value.build());
    }

    @Override
    public WebPageElement.Builder addComment(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addCommentCount(Integer value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, value);
    }

    @Override
    public WebPageElement.Builder addCommentCount(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addContentLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value);
    }

    @Override
    public WebPageElement.Builder addContentLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value.build());
    }

    @Override
    public WebPageElement.Builder addContentLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addContentRating(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, value);
    }

    @Override
    public WebPageElement.Builder addContentRating(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addContributor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
    }

    @Override
    public WebPageElement.Builder addContributor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
    }

    @Override
    public WebPageElement.Builder addContributor(Person value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
    }

    @Override
    public WebPageElement.Builder addContributor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
    }

    @Override
    public WebPageElement.Builder addContributor(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addCopyrightHolder(Organization value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
    }

    @Override
    public WebPageElement.Builder addCopyrightHolder(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
    }

    @Override
    public WebPageElement.Builder addCopyrightHolder(Person value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
    }

    @Override
    public WebPageElement.Builder addCopyrightHolder(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
    }

    @Override
    public WebPageElement.Builder addCopyrightHolder(String value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addCopyrightYear(Number value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, value);
    }

    @Override
    public WebPageElement.Builder addCopyrightYear(String value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addCreator(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public WebPageElement.Builder addCreator(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public WebPageElement.Builder addCreator(Person value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public WebPageElement.Builder addCreator(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public WebPageElement.Builder addCreator(String value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addDateCreated(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public WebPageElement.Builder addDateCreated(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public WebPageElement.Builder addDateCreated(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addDateModified(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public WebPageElement.Builder addDateModified(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public WebPageElement.Builder addDateModified(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addDatePublished(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, value);
    }

    @Override
    public WebPageElement.Builder addDatePublished(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public WebPageElement.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addDiscussionUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, value);
    }

    @Override
    public WebPageElement.Builder addDiscussionUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addEditor(Person value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, value);
    }

    @Override
    public WebPageElement.Builder addEditor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, value.build());
    }

    @Override
    public WebPageElement.Builder addEditor(String value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addEducationalAlignment(AlignmentObject value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value);
    }

    @Override
    public WebPageElement.Builder addEducationalAlignment(AlignmentObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value.build());
    }

    @Override
    public WebPageElement.Builder addEducationalAlignment(String value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addEducationalUse(Text value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, value);
    }

    @Override
    public WebPageElement.Builder addEducationalUse(String value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addEncoding(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, value);
    }

    @Override
    public WebPageElement.Builder addEncoding(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, value.build());
    }

    @Override
    public WebPageElement.Builder addEncoding(String value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addEncodings(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, value);
    }

    @Override
    public WebPageElement.Builder addEncodings(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, value.build());
    }

    @Override
    public WebPageElement.Builder addEncodings(String value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addExampleOfWork(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value);
    }

    @Override
    public WebPageElement.Builder addExampleOfWork(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value.build());
    }

    @Override
    public WebPageElement.Builder addExampleOfWork(String value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addFileFormat(Text value) {
      return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, value);
    }

    @Override
    public WebPageElement.Builder addFileFormat(String value) {
      return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addGenre(Text value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, value);
    }

    @Override
    public WebPageElement.Builder addGenre(URL value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, value);
    }

    @Override
    public WebPageElement.Builder addGenre(String value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addHasPart(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, value);
    }

    @Override
    public WebPageElement.Builder addHasPart(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, value.build());
    }

    @Override
    public WebPageElement.Builder addHasPart(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addHeadline(Text value) {
      return addProperty(CoreConstants.PROPERTY_HEADLINE, value);
    }

    @Override
    public WebPageElement.Builder addHeadline(String value) {
      return addProperty(CoreConstants.PROPERTY_HEADLINE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public WebPageElement.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public WebPageElement.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public WebPageElement.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addInLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public WebPageElement.Builder addInLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
    }

    @Override
    public WebPageElement.Builder addInLanguage(Text value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public WebPageElement.Builder addInLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addInteractionStatistic(InteractionCounter value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value);
    }

    @Override
    public WebPageElement.Builder addInteractionStatistic(InteractionCounter.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value.build());
    }

    @Override
    public WebPageElement.Builder addInteractionStatistic(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addInteractivityType(Text value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, value);
    }

    @Override
    public WebPageElement.Builder addInteractivityType(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addIsBasedOnUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, value);
    }

    @Override
    public WebPageElement.Builder addIsBasedOnUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addIsFamilyFriendly(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, value);
    }

    @Override
    public WebPageElement.Builder addIsFamilyFriendly(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addIsPartOf(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value);
    }

    @Override
    public WebPageElement.Builder addIsPartOf(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value.build());
    }

    @Override
    public WebPageElement.Builder addIsPartOf(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addKeywords(Text value) {
      return addProperty(CoreConstants.PROPERTY_KEYWORDS, value);
    }

    @Override
    public WebPageElement.Builder addKeywords(String value) {
      return addProperty(CoreConstants.PROPERTY_KEYWORDS, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addLearningResourceType(Text value) {
      return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, value);
    }

    @Override
    public WebPageElement.Builder addLearningResourceType(String value) {
      return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addLicense(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value);
    }

    @Override
    public WebPageElement.Builder addLicense(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value.build());
    }

    @Override
    public WebPageElement.Builder addLicense(URL value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value);
    }

    @Override
    public WebPageElement.Builder addLicense(String value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addLocationCreated(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value);
    }

    @Override
    public WebPageElement.Builder addLocationCreated(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value.build());
    }

    @Override
    public WebPageElement.Builder addLocationCreated(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addMainEntity(Thing value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value);
    }

    @Override
    public WebPageElement.Builder addMainEntity(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value.build());
    }

    @Override
    public WebPageElement.Builder addMainEntity(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public WebPageElement.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public WebPageElement.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public WebPageElement.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addMentions(Thing value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, value);
    }

    @Override
    public WebPageElement.Builder addMentions(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, value.build());
    }

    @Override
    public WebPageElement.Builder addMentions(String value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public WebPageElement.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public WebPageElement.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public WebPageElement.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addPosition(Integer value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, value);
    }

    @Override
    public WebPageElement.Builder addPosition(Text value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, value);
    }

    @Override
    public WebPageElement.Builder addPosition(String value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public WebPageElement.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public WebPageElement.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addProducer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
    }

    @Override
    public WebPageElement.Builder addProducer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
    }

    @Override
    public WebPageElement.Builder addProducer(Person value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
    }

    @Override
    public WebPageElement.Builder addProducer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
    }

    @Override
    public WebPageElement.Builder addProducer(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public WebPageElement.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public WebPageElement.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public WebPageElement.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public WebPageElement.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addPublication(PublicationEvent value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, value);
    }

    @Override
    public WebPageElement.Builder addPublication(PublicationEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, value.build());
    }

    @Override
    public WebPageElement.Builder addPublication(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addPublisher(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
    }

    @Override
    public WebPageElement.Builder addPublisher(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
    }

    @Override
    public WebPageElement.Builder addPublisher(Person value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
    }

    @Override
    public WebPageElement.Builder addPublisher(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
    }

    @Override
    public WebPageElement.Builder addPublisher(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addPublishingPrinciples(URL value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, value);
    }

    @Override
    public WebPageElement.Builder addPublishingPrinciples(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addRecordedAt(Event value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value);
    }

    @Override
    public WebPageElement.Builder addRecordedAt(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value.build());
    }

    @Override
    public WebPageElement.Builder addRecordedAt(String value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addReleasedEvent(PublicationEvent value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value);
    }

    @Override
    public WebPageElement.Builder addReleasedEvent(PublicationEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value.build());
    }

    @Override
    public WebPageElement.Builder addReleasedEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public WebPageElement.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public WebPageElement.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public WebPageElement.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public WebPageElement.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public WebPageElement.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addSchemaVersion(Text value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
    }

    @Override
    public WebPageElement.Builder addSchemaVersion(URL value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
    }

    @Override
    public WebPageElement.Builder addSchemaVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addSourceOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value);
    }

    @Override
    public WebPageElement.Builder addSourceOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value.build());
    }

    @Override
    public WebPageElement.Builder addSourceOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addText(Text value) {
      return addProperty(CoreConstants.PROPERTY_TEXT, value);
    }

    @Override
    public WebPageElement.Builder addText(String value) {
      return addProperty(CoreConstants.PROPERTY_TEXT, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addThumbnailUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, value);
    }

    @Override
    public WebPageElement.Builder addThumbnailUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addTimeRequired(Duration value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value);
    }

    @Override
    public WebPageElement.Builder addTimeRequired(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value.build());
    }

    @Override
    public WebPageElement.Builder addTimeRequired(String value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addTranslator(Organization value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
    }

    @Override
    public WebPageElement.Builder addTranslator(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
    }

    @Override
    public WebPageElement.Builder addTranslator(Person value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
    }

    @Override
    public WebPageElement.Builder addTranslator(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
    }

    @Override
    public WebPageElement.Builder addTranslator(String value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addTypicalAgeRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
    }

    @Override
    public WebPageElement.Builder addTypicalAgeRange(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public WebPageElement.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addVersion(Number value) {
      return addProperty(CoreConstants.PROPERTY_VERSION, value);
    }

    @Override
    public WebPageElement.Builder addVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_VERSION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addVideo(VideoObject value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, value);
    }

    @Override
    public WebPageElement.Builder addVideo(VideoObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, value.build());
    }

    @Override
    public WebPageElement.Builder addVideo(String value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addWorkExample(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value);
    }

    @Override
    public WebPageElement.Builder addWorkExample(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value.build());
    }

    @Override
    public WebPageElement.Builder addWorkExample(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public WebPageElement.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public WebPageElement.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public WebPageElement.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public WebPageElement.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public WebPageElement.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public WebPageElement build() {
      return new WebPageElementImpl(properties, reverseMap);
    }
  }

  public WebPageElementImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_WEB_PAGE_ELEMENT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
