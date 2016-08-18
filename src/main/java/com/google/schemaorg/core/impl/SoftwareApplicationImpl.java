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
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link SoftwareApplication}. */
public class SoftwareApplicationImpl extends CreativeWorkImpl implements SoftwareApplication {
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

    builder.add(CoreConstants.PROPERTY_APPLICATION_CATEGORY);

    builder.add(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY);

    builder.add(CoreConstants.PROPERTY_APPLICATION_SUITE);

    builder.add(CoreConstants.PROPERTY_ASSOCIATED_MEDIA);

    builder.add(CoreConstants.PROPERTY_AUDIENCE);

    builder.add(CoreConstants.PROPERTY_AUDIO);

    builder.add(CoreConstants.PROPERTY_AUTHOR);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_ON_DEVICE);

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

    builder.add(CoreConstants.PROPERTY_COUNTRIES_NOT_SUPPORTED);

    builder.add(CoreConstants.PROPERTY_COUNTRIES_SUPPORTED);

    builder.add(CoreConstants.PROPERTY_CREATOR);

    builder.add(CoreConstants.PROPERTY_DATE_CREATED);

    builder.add(CoreConstants.PROPERTY_DATE_MODIFIED);

    builder.add(CoreConstants.PROPERTY_DATE_PUBLISHED);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DEVICE);

    builder.add(CoreConstants.PROPERTY_DISCUSSION_URL);

    builder.add(CoreConstants.PROPERTY_DOWNLOAD_URL);

    builder.add(CoreConstants.PROPERTY_EDITOR);

    builder.add(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT);

    builder.add(CoreConstants.PROPERTY_EDUCATIONAL_USE);

    builder.add(CoreConstants.PROPERTY_ENCODING);

    builder.add(CoreConstants.PROPERTY_ENCODINGS);

    builder.add(CoreConstants.PROPERTY_EXAMPLE_OF_WORK);

    builder.add(CoreConstants.PROPERTY_FEATURE_LIST);

    builder.add(CoreConstants.PROPERTY_FILE_FORMAT);

    builder.add(CoreConstants.PROPERTY_FILE_SIZE);

    builder.add(CoreConstants.PROPERTY_GENRE);

    builder.add(CoreConstants.PROPERTY_HAS_PART);

    builder.add(CoreConstants.PROPERTY_HEADLINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IN_LANGUAGE);

    builder.add(CoreConstants.PROPERTY_INSTALL_URL);

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

    builder.add(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_MENTIONS);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_OPERATING_SYSTEM);

    builder.add(CoreConstants.PROPERTY_PERMISSIONS);

    builder.add(CoreConstants.PROPERTY_POSITION);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROCESSOR_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_PRODUCER);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_PUBLICATION);

    builder.add(CoreConstants.PROPERTY_PUBLISHER);

    builder.add(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES);

    builder.add(CoreConstants.PROPERTY_RECORDED_AT);

    builder.add(CoreConstants.PROPERTY_RELEASED_EVENT);

    builder.add(CoreConstants.PROPERTY_RELEASE_NOTES);

    builder.add(CoreConstants.PROPERTY_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_REVIEWS);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SCHEMA_VERSION);

    builder.add(CoreConstants.PROPERTY_SCREENSHOT);

    builder.add(CoreConstants.PROPERTY_SOFTWARE_ADD_ON);

    builder.add(CoreConstants.PROPERTY_SOFTWARE_HELP);

    builder.add(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_SOFTWARE_VERSION);

    builder.add(CoreConstants.PROPERTY_SOURCE_ORGANIZATION);

    builder.add(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_SUPPORTING_DATA);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<SoftwareApplication.Builder>
      implements SoftwareApplication.Builder {

    @Override
    public SoftwareApplication.Builder addAbout(Thing value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, value);
    }

    @Override
    public SoftwareApplication.Builder addAbout(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAbout(String value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityAPI(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, value);
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityAPI(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityControl(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, value);
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityControl(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityFeature(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, value);
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityFeature(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityHazard(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, value);
    }

    @Override
    public SoftwareApplication.Builder addAccessibilityHazard(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAccountablePerson(Person value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value);
    }

    @Override
    public SoftwareApplication.Builder addAccountablePerson(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAccountablePerson(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public SoftwareApplication.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public SoftwareApplication.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public SoftwareApplication.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAlternativeHeadline(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, value);
    }

    @Override
    public SoftwareApplication.Builder addAlternativeHeadline(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addApplicationCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_CATEGORY, value);
    }

    @Override
    public SoftwareApplication.Builder addApplicationCategory(URL value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_CATEGORY, value);
    }

    @Override
    public SoftwareApplication.Builder addApplicationCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_CATEGORY, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addApplicationSubCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY, value);
    }

    @Override
    public SoftwareApplication.Builder addApplicationSubCategory(URL value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY, value);
    }

    @Override
    public SoftwareApplication.Builder addApplicationSubCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addApplicationSuite(Text value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUITE, value);
    }

    @Override
    public SoftwareApplication.Builder addApplicationSuite(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUITE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAssociatedMedia(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value);
    }

    @Override
    public SoftwareApplication.Builder addAssociatedMedia(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAssociatedMedia(String value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public SoftwareApplication.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAudio(AudioObject value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, value);
    }

    @Override
    public SoftwareApplication.Builder addAudio(AudioObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAudio(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAuthor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
    }

    @Override
    public SoftwareApplication.Builder addAuthor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAuthor(Person value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
    }

    @Override
    public SoftwareApplication.Builder addAuthor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addAuthor(String value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAvailableOnDevice(Text value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_ON_DEVICE, value);
    }

    @Override
    public SoftwareApplication.Builder addAvailableOnDevice(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_ON_DEVICE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public SoftwareApplication.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public SoftwareApplication.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCharacter(Person value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, value);
    }

    @Override
    public SoftwareApplication.Builder addCharacter(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addCharacter(String value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCitation(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value);
    }

    @Override
    public SoftwareApplication.Builder addCitation(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value.build());
    }

    @Override
    public SoftwareApplication.Builder addCitation(Text value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value);
    }

    @Override
    public SoftwareApplication.Builder addCitation(String value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addComment(Comment value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, value);
    }

    @Override
    public SoftwareApplication.Builder addComment(Comment.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, value.build());
    }

    @Override
    public SoftwareApplication.Builder addComment(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCommentCount(Integer value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, value);
    }

    @Override
    public SoftwareApplication.Builder addCommentCount(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addContentLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value);
    }

    @Override
    public SoftwareApplication.Builder addContentLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value.build());
    }

    @Override
    public SoftwareApplication.Builder addContentLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addContentRating(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, value);
    }

    @Override
    public SoftwareApplication.Builder addContentRating(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addContributor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
    }

    @Override
    public SoftwareApplication.Builder addContributor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addContributor(Person value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
    }

    @Override
    public SoftwareApplication.Builder addContributor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addContributor(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCopyrightHolder(Organization value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
    }

    @Override
    public SoftwareApplication.Builder addCopyrightHolder(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addCopyrightHolder(Person value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
    }

    @Override
    public SoftwareApplication.Builder addCopyrightHolder(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addCopyrightHolder(String value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCopyrightYear(Number value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, value);
    }

    @Override
    public SoftwareApplication.Builder addCopyrightYear(String value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCountriesNotSupported(Text value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_NOT_SUPPORTED, value);
    }

    @Override
    public SoftwareApplication.Builder addCountriesNotSupported(String value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_NOT_SUPPORTED, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCountriesSupported(Text value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_SUPPORTED, value);
    }

    @Override
    public SoftwareApplication.Builder addCountriesSupported(String value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_SUPPORTED, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addCreator(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public SoftwareApplication.Builder addCreator(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addCreator(Person value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public SoftwareApplication.Builder addCreator(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addCreator(String value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDateCreated(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public SoftwareApplication.Builder addDateCreated(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public SoftwareApplication.Builder addDateCreated(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDateModified(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public SoftwareApplication.Builder addDateModified(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public SoftwareApplication.Builder addDateModified(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDatePublished(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, value);
    }

    @Override
    public SoftwareApplication.Builder addDatePublished(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public SoftwareApplication.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDevice(Text value) {
      return addProperty(CoreConstants.PROPERTY_DEVICE, value);
    }

    @Override
    public SoftwareApplication.Builder addDevice(String value) {
      return addProperty(CoreConstants.PROPERTY_DEVICE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDiscussionUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, value);
    }

    @Override
    public SoftwareApplication.Builder addDiscussionUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDownloadUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_DOWNLOAD_URL, value);
    }

    @Override
    public SoftwareApplication.Builder addDownloadUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_DOWNLOAD_URL, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addEditor(Person value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, value);
    }

    @Override
    public SoftwareApplication.Builder addEditor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addEditor(String value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addEducationalAlignment(AlignmentObject value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value);
    }

    @Override
    public SoftwareApplication.Builder addEducationalAlignment(AlignmentObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value.build());
    }

    @Override
    public SoftwareApplication.Builder addEducationalAlignment(String value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addEducationalUse(Text value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, value);
    }

    @Override
    public SoftwareApplication.Builder addEducationalUse(String value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addEncoding(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, value);
    }

    @Override
    public SoftwareApplication.Builder addEncoding(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, value.build());
    }

    @Override
    public SoftwareApplication.Builder addEncoding(String value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addEncodings(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, value);
    }

    @Override
    public SoftwareApplication.Builder addEncodings(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, value.build());
    }

    @Override
    public SoftwareApplication.Builder addEncodings(String value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addExampleOfWork(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value);
    }

    @Override
    public SoftwareApplication.Builder addExampleOfWork(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value.build());
    }

    @Override
    public SoftwareApplication.Builder addExampleOfWork(String value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addFeatureList(Text value) {
      return addProperty(CoreConstants.PROPERTY_FEATURE_LIST, value);
    }

    @Override
    public SoftwareApplication.Builder addFeatureList(URL value) {
      return addProperty(CoreConstants.PROPERTY_FEATURE_LIST, value);
    }

    @Override
    public SoftwareApplication.Builder addFeatureList(String value) {
      return addProperty(CoreConstants.PROPERTY_FEATURE_LIST, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addFileFormat(Text value) {
      return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, value);
    }

    @Override
    public SoftwareApplication.Builder addFileFormat(String value) {
      return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addFileSize(Text value) {
      return addProperty(CoreConstants.PROPERTY_FILE_SIZE, value);
    }

    @Override
    public SoftwareApplication.Builder addFileSize(String value) {
      return addProperty(CoreConstants.PROPERTY_FILE_SIZE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addGenre(Text value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, value);
    }

    @Override
    public SoftwareApplication.Builder addGenre(URL value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, value);
    }

    @Override
    public SoftwareApplication.Builder addGenre(String value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addHasPart(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, value);
    }

    @Override
    public SoftwareApplication.Builder addHasPart(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, value.build());
    }

    @Override
    public SoftwareApplication.Builder addHasPart(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addHeadline(Text value) {
      return addProperty(CoreConstants.PROPERTY_HEADLINE, value);
    }

    @Override
    public SoftwareApplication.Builder addHeadline(String value) {
      return addProperty(CoreConstants.PROPERTY_HEADLINE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public SoftwareApplication.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public SoftwareApplication.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public SoftwareApplication.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addInLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public SoftwareApplication.Builder addInLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
    }

    @Override
    public SoftwareApplication.Builder addInLanguage(Text value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public SoftwareApplication.Builder addInLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addInstallUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_INSTALL_URL, value);
    }

    @Override
    public SoftwareApplication.Builder addInstallUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_INSTALL_URL, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addInteractionStatistic(InteractionCounter value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value);
    }

    @Override
    public SoftwareApplication.Builder addInteractionStatistic(InteractionCounter.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value.build());
    }

    @Override
    public SoftwareApplication.Builder addInteractionStatistic(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addInteractivityType(Text value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, value);
    }

    @Override
    public SoftwareApplication.Builder addInteractivityType(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addIsBasedOnUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, value);
    }

    @Override
    public SoftwareApplication.Builder addIsBasedOnUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addIsFamilyFriendly(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, value);
    }

    @Override
    public SoftwareApplication.Builder addIsFamilyFriendly(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addIsPartOf(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value);
    }

    @Override
    public SoftwareApplication.Builder addIsPartOf(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value.build());
    }

    @Override
    public SoftwareApplication.Builder addIsPartOf(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addKeywords(Text value) {
      return addProperty(CoreConstants.PROPERTY_KEYWORDS, value);
    }

    @Override
    public SoftwareApplication.Builder addKeywords(String value) {
      return addProperty(CoreConstants.PROPERTY_KEYWORDS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addLearningResourceType(Text value) {
      return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, value);
    }

    @Override
    public SoftwareApplication.Builder addLearningResourceType(String value) {
      return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addLicense(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value);
    }

    @Override
    public SoftwareApplication.Builder addLicense(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value.build());
    }

    @Override
    public SoftwareApplication.Builder addLicense(URL value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value);
    }

    @Override
    public SoftwareApplication.Builder addLicense(String value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addLocationCreated(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value);
    }

    @Override
    public SoftwareApplication.Builder addLocationCreated(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value.build());
    }

    @Override
    public SoftwareApplication.Builder addLocationCreated(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addMainEntity(Thing value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value);
    }

    @Override
    public SoftwareApplication.Builder addMainEntity(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value.build());
    }

    @Override
    public SoftwareApplication.Builder addMainEntity(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public SoftwareApplication.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public SoftwareApplication.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public SoftwareApplication.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addMemoryRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addMemoryRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addMemoryRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addMentions(Thing value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, value);
    }

    @Override
    public SoftwareApplication.Builder addMentions(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, value.build());
    }

    @Override
    public SoftwareApplication.Builder addMentions(String value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public SoftwareApplication.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public SoftwareApplication.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public SoftwareApplication.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addOperatingSystem(Text value) {
      return addProperty(CoreConstants.PROPERTY_OPERATING_SYSTEM, value);
    }

    @Override
    public SoftwareApplication.Builder addOperatingSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_OPERATING_SYSTEM, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addPermissions(Text value) {
      return addProperty(CoreConstants.PROPERTY_PERMISSIONS, value);
    }

    @Override
    public SoftwareApplication.Builder addPermissions(String value) {
      return addProperty(CoreConstants.PROPERTY_PERMISSIONS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addPosition(Integer value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, value);
    }

    @Override
    public SoftwareApplication.Builder addPosition(Text value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, value);
    }

    @Override
    public SoftwareApplication.Builder addPosition(String value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public SoftwareApplication.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public SoftwareApplication.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addProcessorRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_PROCESSOR_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addProcessorRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_PROCESSOR_REQUIREMENTS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addProducer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
    }

    @Override
    public SoftwareApplication.Builder addProducer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addProducer(Person value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
    }

    @Override
    public SoftwareApplication.Builder addProducer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addProducer(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public SoftwareApplication.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public SoftwareApplication.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addPublication(PublicationEvent value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, value);
    }

    @Override
    public SoftwareApplication.Builder addPublication(PublicationEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, value.build());
    }

    @Override
    public SoftwareApplication.Builder addPublication(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addPublisher(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
    }

    @Override
    public SoftwareApplication.Builder addPublisher(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addPublisher(Person value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
    }

    @Override
    public SoftwareApplication.Builder addPublisher(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
    }

    @Override
    public SoftwareApplication.Builder addPublisher(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addPublishingPrinciples(URL value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, value);
    }

    @Override
    public SoftwareApplication.Builder addPublishingPrinciples(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addRecordedAt(Event value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value);
    }

    @Override
    public SoftwareApplication.Builder addRecordedAt(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value.build());
    }

    @Override
    public SoftwareApplication.Builder addRecordedAt(String value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addReleasedEvent(PublicationEvent value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value);
    }

    @Override
    public SoftwareApplication.Builder addReleasedEvent(PublicationEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value.build());
    }

    @Override
    public SoftwareApplication.Builder addReleasedEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addReleaseNotes(Text value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_NOTES, value);
    }

    @Override
    public SoftwareApplication.Builder addReleaseNotes(URL value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_NOTES, value);
    }

    @Override
    public SoftwareApplication.Builder addReleaseNotes(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_NOTES, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_REQUIREMENTS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public SoftwareApplication.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public SoftwareApplication.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public SoftwareApplication.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public SoftwareApplication.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public SoftwareApplication.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSchemaVersion(Text value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
    }

    @Override
    public SoftwareApplication.Builder addSchemaVersion(URL value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
    }

    @Override
    public SoftwareApplication.Builder addSchemaVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addScreenshot(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, value);
    }

    @Override
    public SoftwareApplication.Builder addScreenshot(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, value.build());
    }

    @Override
    public SoftwareApplication.Builder addScreenshot(URL value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, value);
    }

    @Override
    public SoftwareApplication.Builder addScreenshot(String value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSoftwareAddOn(SoftwareApplication value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_ADD_ON, value);
    }

    @Override
    public SoftwareApplication.Builder addSoftwareAddOn(SoftwareApplication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_ADD_ON, value.build());
    }

    @Override
    public SoftwareApplication.Builder addSoftwareAddOn(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_ADD_ON, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSoftwareHelp(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_HELP, value);
    }

    @Override
    public SoftwareApplication.Builder addSoftwareHelp(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_HELP, value.build());
    }

    @Override
    public SoftwareApplication.Builder addSoftwareHelp(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_HELP, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSoftwareRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addSoftwareRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addSoftwareRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSoftwareVersion(Text value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_VERSION, value);
    }

    @Override
    public SoftwareApplication.Builder addSoftwareVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_VERSION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSourceOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value);
    }

    @Override
    public SoftwareApplication.Builder addSourceOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value.build());
    }

    @Override
    public SoftwareApplication.Builder addSourceOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addStorageRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addStorageRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS, value);
    }

    @Override
    public SoftwareApplication.Builder addStorageRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addSupportingData(DataFeed value) {
      return addProperty(CoreConstants.PROPERTY_SUPPORTING_DATA, value);
    }

    @Override
    public SoftwareApplication.Builder addSupportingData(DataFeed.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUPPORTING_DATA, value.build());
    }

    @Override
    public SoftwareApplication.Builder addSupportingData(String value) {
      return addProperty(CoreConstants.PROPERTY_SUPPORTING_DATA, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addText(Text value) {
      return addProperty(CoreConstants.PROPERTY_TEXT, value);
    }

    @Override
    public SoftwareApplication.Builder addText(String value) {
      return addProperty(CoreConstants.PROPERTY_TEXT, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addThumbnailUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, value);
    }

    @Override
    public SoftwareApplication.Builder addThumbnailUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addTimeRequired(Duration value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value);
    }

    @Override
    public SoftwareApplication.Builder addTimeRequired(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value.build());
    }

    @Override
    public SoftwareApplication.Builder addTimeRequired(String value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addTranslator(Organization value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
    }

    @Override
    public SoftwareApplication.Builder addTranslator(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addTranslator(Person value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
    }

    @Override
    public SoftwareApplication.Builder addTranslator(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
    }

    @Override
    public SoftwareApplication.Builder addTranslator(String value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addTypicalAgeRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
    }

    @Override
    public SoftwareApplication.Builder addTypicalAgeRange(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public SoftwareApplication.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addVersion(Number value) {
      return addProperty(CoreConstants.PROPERTY_VERSION, value);
    }

    @Override
    public SoftwareApplication.Builder addVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_VERSION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addVideo(VideoObject value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, value);
    }

    @Override
    public SoftwareApplication.Builder addVideo(VideoObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, value.build());
    }

    @Override
    public SoftwareApplication.Builder addVideo(String value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addWorkExample(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value);
    }

    @Override
    public SoftwareApplication.Builder addWorkExample(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value.build());
    }

    @Override
    public SoftwareApplication.Builder addWorkExample(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public SoftwareApplication.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public SoftwareApplication.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public SoftwareApplication.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public SoftwareApplication.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public SoftwareApplication.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public SoftwareApplication build() {
      return new SoftwareApplicationImpl(properties, reverseMap);
    }
  }

  public SoftwareApplicationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_SOFTWARE_APPLICATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getApplicationCategoryList() {
    return getProperty(CoreConstants.PROPERTY_APPLICATION_CATEGORY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getApplicationSubCategoryList() {
    return getProperty(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getApplicationSuiteList() {
    return getProperty(CoreConstants.PROPERTY_APPLICATION_SUITE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailableOnDeviceList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABLE_ON_DEVICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCountriesNotSupportedList() {
    return getProperty(CoreConstants.PROPERTY_COUNTRIES_NOT_SUPPORTED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCountriesSupportedList() {
    return getProperty(CoreConstants.PROPERTY_COUNTRIES_SUPPORTED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDeviceList() {
    return getProperty(CoreConstants.PROPERTY_DEVICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDownloadUrlList() {
    return getProperty(CoreConstants.PROPERTY_DOWNLOAD_URL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFeatureListList() {
    return getProperty(CoreConstants.PROPERTY_FEATURE_LIST);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFileSizeList() {
    return getProperty(CoreConstants.PROPERTY_FILE_SIZE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInstallUrlList() {
    return getProperty(CoreConstants.PROPERTY_INSTALL_URL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMemoryRequirementsList() {
    return getProperty(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOperatingSystemList() {
    return getProperty(CoreConstants.PROPERTY_OPERATING_SYSTEM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPermissionsList() {
    return getProperty(CoreConstants.PROPERTY_PERMISSIONS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProcessorRequirementsList() {
    return getProperty(CoreConstants.PROPERTY_PROCESSOR_REQUIREMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReleaseNotesList() {
    return getProperty(CoreConstants.PROPERTY_RELEASE_NOTES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRequirementsList() {
    return getProperty(CoreConstants.PROPERTY_REQUIREMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getScreenshotList() {
    return getProperty(CoreConstants.PROPERTY_SCREENSHOT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSoftwareAddOnList() {
    return getProperty(CoreConstants.PROPERTY_SOFTWARE_ADD_ON);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSoftwareHelpList() {
    return getProperty(CoreConstants.PROPERTY_SOFTWARE_HELP);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSoftwareRequirementsList() {
    return getProperty(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSoftwareVersionList() {
    return getProperty(CoreConstants.PROPERTY_SOFTWARE_VERSION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getStorageRequirementsList() {
    return getProperty(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSupportingDataList() {
    return getProperty(CoreConstants.PROPERTY_SUPPORTING_DATA);
  }
}
