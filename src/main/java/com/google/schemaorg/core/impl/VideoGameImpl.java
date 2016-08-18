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

/** Implementation of {@link VideoGame}. */
public class VideoGameImpl extends GameImpl implements VideoGame {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ABOUT);

    builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_API);

    builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL);

    builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE);

    builder.add(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD);

    builder.add(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON);

    builder.add(CoreConstants.PROPERTY_ACTOR);

    builder.add(CoreConstants.PROPERTY_ACTORS);

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

    builder.add(CoreConstants.PROPERTY_CHARACTER_ATTRIBUTE);

    builder.add(CoreConstants.PROPERTY_CHEAT_CODE);

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

    builder.add(CoreConstants.PROPERTY_DIRECTOR);

    builder.add(CoreConstants.PROPERTY_DIRECTORS);

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

    builder.add(CoreConstants.PROPERTY_GAME_ITEM);

    builder.add(CoreConstants.PROPERTY_GAME_LOCATION);

    builder.add(CoreConstants.PROPERTY_GAME_PLATFORM);

    builder.add(CoreConstants.PROPERTY_GAME_SERVER);

    builder.add(CoreConstants.PROPERTY_GAME_TIP);

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

    builder.add(CoreConstants.PROPERTY_MUSIC_BY);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_PLAYERS);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_OPERATING_SYSTEM);

    builder.add(CoreConstants.PROPERTY_PERMISSIONS);

    builder.add(CoreConstants.PROPERTY_PLAY_MODE);

    builder.add(CoreConstants.PROPERTY_POSITION);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROCESSOR_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_PRODUCER);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_PUBLICATION);

    builder.add(CoreConstants.PROPERTY_PUBLISHER);

    builder.add(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES);

    builder.add(CoreConstants.PROPERTY_QUEST);

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

    builder.add(CoreConstants.PROPERTY_TRAILER);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<VideoGame.Builder>
      implements VideoGame.Builder {

    @Override
    public VideoGame.Builder addAbout(Thing value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, value);
    }

    @Override
    public VideoGame.Builder addAbout(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, value.build());
    }

    @Override
    public VideoGame.Builder addAbout(String value) {
      return addProperty(CoreConstants.PROPERTY_ABOUT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAccessibilityAPI(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, value);
    }

    @Override
    public VideoGame.Builder addAccessibilityAPI(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAccessibilityControl(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, value);
    }

    @Override
    public VideoGame.Builder addAccessibilityControl(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAccessibilityFeature(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, value);
    }

    @Override
    public VideoGame.Builder addAccessibilityFeature(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAccessibilityHazard(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, value);
    }

    @Override
    public VideoGame.Builder addAccessibilityHazard(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAccountablePerson(Person value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value);
    }

    @Override
    public VideoGame.Builder addAccountablePerson(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value.build());
    }

    @Override
    public VideoGame.Builder addAccountablePerson(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, Text.of(value));
    }

    @Override
    public VideoGame.Builder addActor(Person value) {
      return addProperty(CoreConstants.PROPERTY_ACTOR, value);
    }

    @Override
    public VideoGame.Builder addActor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACTOR, value.build());
    }

    @Override
    public VideoGame.Builder addActor(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTOR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addActors(Person value) {
      return addProperty(CoreConstants.PROPERTY_ACTORS, value);
    }

    @Override
    public VideoGame.Builder addActors(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACTORS, value.build());
    }

    @Override
    public VideoGame.Builder addActors(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTORS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public VideoGame.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public VideoGame.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public VideoGame.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public VideoGame.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAlternativeHeadline(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, value);
    }

    @Override
    public VideoGame.Builder addAlternativeHeadline(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addApplicationCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_CATEGORY, value);
    }

    @Override
    public VideoGame.Builder addApplicationCategory(URL value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_CATEGORY, value);
    }

    @Override
    public VideoGame.Builder addApplicationCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_CATEGORY, Text.of(value));
    }

    @Override
    public VideoGame.Builder addApplicationSubCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY, value);
    }

    @Override
    public VideoGame.Builder addApplicationSubCategory(URL value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY, value);
    }

    @Override
    public VideoGame.Builder addApplicationSubCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUB_CATEGORY, Text.of(value));
    }

    @Override
    public VideoGame.Builder addApplicationSuite(Text value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUITE, value);
    }

    @Override
    public VideoGame.Builder addApplicationSuite(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION_SUITE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAssociatedMedia(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value);
    }

    @Override
    public VideoGame.Builder addAssociatedMedia(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value.build());
    }

    @Override
    public VideoGame.Builder addAssociatedMedia(String value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public VideoGame.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public VideoGame.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAudio(AudioObject value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, value);
    }

    @Override
    public VideoGame.Builder addAudio(AudioObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, value.build());
    }

    @Override
    public VideoGame.Builder addAudio(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIO, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAuthor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
    }

    @Override
    public VideoGame.Builder addAuthor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
    }

    @Override
    public VideoGame.Builder addAuthor(Person value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
    }

    @Override
    public VideoGame.Builder addAuthor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
    }

    @Override
    public VideoGame.Builder addAuthor(String value) {
      return addProperty(CoreConstants.PROPERTY_AUTHOR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAvailableOnDevice(Text value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_ON_DEVICE, value);
    }

    @Override
    public VideoGame.Builder addAvailableOnDevice(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_ON_DEVICE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public VideoGame.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public VideoGame.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public VideoGame.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCharacter(Person value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, value);
    }

    @Override
    public VideoGame.Builder addCharacter(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, value.build());
    }

    @Override
    public VideoGame.Builder addCharacter(String value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCharacterAttribute(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER_ATTRIBUTE, value);
    }

    @Override
    public VideoGame.Builder addCharacterAttribute(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER_ATTRIBUTE, value.build());
    }

    @Override
    public VideoGame.Builder addCharacterAttribute(String value) {
      return addProperty(CoreConstants.PROPERTY_CHARACTER_ATTRIBUTE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCheatCode(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_CHEAT_CODE, value);
    }

    @Override
    public VideoGame.Builder addCheatCode(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CHEAT_CODE, value.build());
    }

    @Override
    public VideoGame.Builder addCheatCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CHEAT_CODE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCitation(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value);
    }

    @Override
    public VideoGame.Builder addCitation(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value.build());
    }

    @Override
    public VideoGame.Builder addCitation(Text value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, value);
    }

    @Override
    public VideoGame.Builder addCitation(String value) {
      return addProperty(CoreConstants.PROPERTY_CITATION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addComment(Comment value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, value);
    }

    @Override
    public VideoGame.Builder addComment(Comment.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, value.build());
    }

    @Override
    public VideoGame.Builder addComment(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCommentCount(Integer value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, value);
    }

    @Override
    public VideoGame.Builder addCommentCount(String value) {
      return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addContentLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value);
    }

    @Override
    public VideoGame.Builder addContentLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value.build());
    }

    @Override
    public VideoGame.Builder addContentLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addContentRating(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, value);
    }

    @Override
    public VideoGame.Builder addContentRating(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, Text.of(value));
    }

    @Override
    public VideoGame.Builder addContributor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
    }

    @Override
    public VideoGame.Builder addContributor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
    }

    @Override
    public VideoGame.Builder addContributor(Person value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
    }

    @Override
    public VideoGame.Builder addContributor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
    }

    @Override
    public VideoGame.Builder addContributor(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCopyrightHolder(Organization value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
    }

    @Override
    public VideoGame.Builder addCopyrightHolder(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
    }

    @Override
    public VideoGame.Builder addCopyrightHolder(Person value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
    }

    @Override
    public VideoGame.Builder addCopyrightHolder(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
    }

    @Override
    public VideoGame.Builder addCopyrightHolder(String value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCopyrightYear(Number value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, value);
    }

    @Override
    public VideoGame.Builder addCopyrightYear(String value) {
      return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCountriesNotSupported(Text value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_NOT_SUPPORTED, value);
    }

    @Override
    public VideoGame.Builder addCountriesNotSupported(String value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_NOT_SUPPORTED, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCountriesSupported(Text value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_SUPPORTED, value);
    }

    @Override
    public VideoGame.Builder addCountriesSupported(String value) {
      return addProperty(CoreConstants.PROPERTY_COUNTRIES_SUPPORTED, Text.of(value));
    }

    @Override
    public VideoGame.Builder addCreator(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public VideoGame.Builder addCreator(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public VideoGame.Builder addCreator(Person value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value);
    }

    @Override
    public VideoGame.Builder addCreator(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
    }

    @Override
    public VideoGame.Builder addCreator(String value) {
      return addProperty(CoreConstants.PROPERTY_CREATOR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDateCreated(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public VideoGame.Builder addDateCreated(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public VideoGame.Builder addDateCreated(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDateModified(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public VideoGame.Builder addDateModified(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public VideoGame.Builder addDateModified(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDatePublished(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, value);
    }

    @Override
    public VideoGame.Builder addDatePublished(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public VideoGame.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDevice(Text value) {
      return addProperty(CoreConstants.PROPERTY_DEVICE, value);
    }

    @Override
    public VideoGame.Builder addDevice(String value) {
      return addProperty(CoreConstants.PROPERTY_DEVICE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDirector(Person value) {
      return addProperty(CoreConstants.PROPERTY_DIRECTOR, value);
    }

    @Override
    public VideoGame.Builder addDirector(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DIRECTOR, value.build());
    }

    @Override
    public VideoGame.Builder addDirector(String value) {
      return addProperty(CoreConstants.PROPERTY_DIRECTOR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDirectors(Person value) {
      return addProperty(CoreConstants.PROPERTY_DIRECTORS, value);
    }

    @Override
    public VideoGame.Builder addDirectors(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DIRECTORS, value.build());
    }

    @Override
    public VideoGame.Builder addDirectors(String value) {
      return addProperty(CoreConstants.PROPERTY_DIRECTORS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDiscussionUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, value);
    }

    @Override
    public VideoGame.Builder addDiscussionUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDownloadUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_DOWNLOAD_URL, value);
    }

    @Override
    public VideoGame.Builder addDownloadUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_DOWNLOAD_URL, Text.of(value));
    }

    @Override
    public VideoGame.Builder addEditor(Person value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, value);
    }

    @Override
    public VideoGame.Builder addEditor(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, value.build());
    }

    @Override
    public VideoGame.Builder addEditor(String value) {
      return addProperty(CoreConstants.PROPERTY_EDITOR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addEducationalAlignment(AlignmentObject value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value);
    }

    @Override
    public VideoGame.Builder addEducationalAlignment(AlignmentObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value.build());
    }

    @Override
    public VideoGame.Builder addEducationalAlignment(String value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addEducationalUse(Text value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, value);
    }

    @Override
    public VideoGame.Builder addEducationalUse(String value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addEncoding(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, value);
    }

    @Override
    public VideoGame.Builder addEncoding(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, value.build());
    }

    @Override
    public VideoGame.Builder addEncoding(String value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING, Text.of(value));
    }

    @Override
    public VideoGame.Builder addEncodings(MediaObject value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, value);
    }

    @Override
    public VideoGame.Builder addEncodings(MediaObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, value.build());
    }

    @Override
    public VideoGame.Builder addEncodings(String value) {
      return addProperty(CoreConstants.PROPERTY_ENCODINGS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addExampleOfWork(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value);
    }

    @Override
    public VideoGame.Builder addExampleOfWork(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value.build());
    }

    @Override
    public VideoGame.Builder addExampleOfWork(String value) {
      return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, Text.of(value));
    }

    @Override
    public VideoGame.Builder addFeatureList(Text value) {
      return addProperty(CoreConstants.PROPERTY_FEATURE_LIST, value);
    }

    @Override
    public VideoGame.Builder addFeatureList(URL value) {
      return addProperty(CoreConstants.PROPERTY_FEATURE_LIST, value);
    }

    @Override
    public VideoGame.Builder addFeatureList(String value) {
      return addProperty(CoreConstants.PROPERTY_FEATURE_LIST, Text.of(value));
    }

    @Override
    public VideoGame.Builder addFileFormat(Text value) {
      return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, value);
    }

    @Override
    public VideoGame.Builder addFileFormat(String value) {
      return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addFileSize(Text value) {
      return addProperty(CoreConstants.PROPERTY_FILE_SIZE, value);
    }

    @Override
    public VideoGame.Builder addFileSize(String value) {
      return addProperty(CoreConstants.PROPERTY_FILE_SIZE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addGameItem(Thing value) {
      return addProperty(CoreConstants.PROPERTY_GAME_ITEM, value);
    }

    @Override
    public VideoGame.Builder addGameItem(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GAME_ITEM, value.build());
    }

    @Override
    public VideoGame.Builder addGameItem(String value) {
      return addProperty(CoreConstants.PROPERTY_GAME_ITEM, Text.of(value));
    }

    @Override
    public VideoGame.Builder addGameLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_GAME_LOCATION, value);
    }

    @Override
    public VideoGame.Builder addGameLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GAME_LOCATION, value.build());
    }

    @Override
    public VideoGame.Builder addGameLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_GAME_LOCATION, value);
    }

    @Override
    public VideoGame.Builder addGameLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GAME_LOCATION, value.build());
    }

    @Override
    public VideoGame.Builder addGameLocation(URL value) {
      return addProperty(CoreConstants.PROPERTY_GAME_LOCATION, value);
    }

    @Override
    public VideoGame.Builder addGameLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_GAME_LOCATION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addGamePlatform(Text value) {
      return addProperty(CoreConstants.PROPERTY_GAME_PLATFORM, value);
    }

    @Override
    public VideoGame.Builder addGamePlatform(Thing value) {
      return addProperty(CoreConstants.PROPERTY_GAME_PLATFORM, value);
    }

    @Override
    public VideoGame.Builder addGamePlatform(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GAME_PLATFORM, value.build());
    }

    @Override
    public VideoGame.Builder addGamePlatform(URL value) {
      return addProperty(CoreConstants.PROPERTY_GAME_PLATFORM, value);
    }

    @Override
    public VideoGame.Builder addGamePlatform(String value) {
      return addProperty(CoreConstants.PROPERTY_GAME_PLATFORM, Text.of(value));
    }

    @Override
    public VideoGame.Builder addGameServer(GameServer value) {
      return addProperty(CoreConstants.PROPERTY_GAME_SERVER, value);
    }

    @Override
    public VideoGame.Builder addGameServer(GameServer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GAME_SERVER, value.build());
    }

    @Override
    public VideoGame.Builder addGameServer(String value) {
      return addProperty(CoreConstants.PROPERTY_GAME_SERVER, Text.of(value));
    }

    @Override
    public VideoGame.Builder addGameTip(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_GAME_TIP, value);
    }

    @Override
    public VideoGame.Builder addGameTip(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GAME_TIP, value.build());
    }

    @Override
    public VideoGame.Builder addGameTip(String value) {
      return addProperty(CoreConstants.PROPERTY_GAME_TIP, Text.of(value));
    }

    @Override
    public VideoGame.Builder addGenre(Text value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, value);
    }

    @Override
    public VideoGame.Builder addGenre(URL value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, value);
    }

    @Override
    public VideoGame.Builder addGenre(String value) {
      return addProperty(CoreConstants.PROPERTY_GENRE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addHasPart(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, value);
    }

    @Override
    public VideoGame.Builder addHasPart(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, value.build());
    }

    @Override
    public VideoGame.Builder addHasPart(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_PART, Text.of(value));
    }

    @Override
    public VideoGame.Builder addHeadline(Text value) {
      return addProperty(CoreConstants.PROPERTY_HEADLINE, value);
    }

    @Override
    public VideoGame.Builder addHeadline(String value) {
      return addProperty(CoreConstants.PROPERTY_HEADLINE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public VideoGame.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public VideoGame.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public VideoGame.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addInLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public VideoGame.Builder addInLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
    }

    @Override
    public VideoGame.Builder addInLanguage(Text value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public VideoGame.Builder addInLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addInstallUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_INSTALL_URL, value);
    }

    @Override
    public VideoGame.Builder addInstallUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_INSTALL_URL, Text.of(value));
    }

    @Override
    public VideoGame.Builder addInteractionStatistic(InteractionCounter value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value);
    }

    @Override
    public VideoGame.Builder addInteractionStatistic(InteractionCounter.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value.build());
    }

    @Override
    public VideoGame.Builder addInteractionStatistic(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, Text.of(value));
    }

    @Override
    public VideoGame.Builder addInteractivityType(Text value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, value);
    }

    @Override
    public VideoGame.Builder addInteractivityType(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addIsBasedOnUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, value);
    }

    @Override
    public VideoGame.Builder addIsBasedOnUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, Text.of(value));
    }

    @Override
    public VideoGame.Builder addIsFamilyFriendly(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, value);
    }

    @Override
    public VideoGame.Builder addIsFamilyFriendly(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, Text.of(value));
    }

    @Override
    public VideoGame.Builder addIsPartOf(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value);
    }

    @Override
    public VideoGame.Builder addIsPartOf(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value.build());
    }

    @Override
    public VideoGame.Builder addIsPartOf(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_PART_OF, Text.of(value));
    }

    @Override
    public VideoGame.Builder addKeywords(Text value) {
      return addProperty(CoreConstants.PROPERTY_KEYWORDS, value);
    }

    @Override
    public VideoGame.Builder addKeywords(String value) {
      return addProperty(CoreConstants.PROPERTY_KEYWORDS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addLearningResourceType(Text value) {
      return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, value);
    }

    @Override
    public VideoGame.Builder addLearningResourceType(String value) {
      return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addLicense(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value);
    }

    @Override
    public VideoGame.Builder addLicense(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value.build());
    }

    @Override
    public VideoGame.Builder addLicense(URL value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, value);
    }

    @Override
    public VideoGame.Builder addLicense(String value) {
      return addProperty(CoreConstants.PROPERTY_LICENSE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addLocationCreated(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value);
    }

    @Override
    public VideoGame.Builder addLocationCreated(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value.build());
    }

    @Override
    public VideoGame.Builder addLocationCreated(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, Text.of(value));
    }

    @Override
    public VideoGame.Builder addMainEntity(Thing value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value);
    }

    @Override
    public VideoGame.Builder addMainEntity(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value.build());
    }

    @Override
    public VideoGame.Builder addMainEntity(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, Text.of(value));
    }

    @Override
    public VideoGame.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public VideoGame.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public VideoGame.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public VideoGame.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addMemoryRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addMemoryRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addMemoryRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMORY_REQUIREMENTS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addMentions(Thing value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, value);
    }

    @Override
    public VideoGame.Builder addMentions(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, value.build());
    }

    @Override
    public VideoGame.Builder addMentions(String value) {
      return addProperty(CoreConstants.PROPERTY_MENTIONS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addMusicBy(MusicGroup value) {
      return addProperty(CoreConstants.PROPERTY_MUSIC_BY, value);
    }

    @Override
    public VideoGame.Builder addMusicBy(MusicGroup.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MUSIC_BY, value.build());
    }

    @Override
    public VideoGame.Builder addMusicBy(Person value) {
      return addProperty(CoreConstants.PROPERTY_MUSIC_BY, value);
    }

    @Override
    public VideoGame.Builder addMusicBy(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MUSIC_BY, value.build());
    }

    @Override
    public VideoGame.Builder addMusicBy(String value) {
      return addProperty(CoreConstants.PROPERTY_MUSIC_BY, Text.of(value));
    }

    @Override
    public VideoGame.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public VideoGame.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public VideoGame.Builder addNumberOfPlayers(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PLAYERS, value);
    }

    @Override
    public VideoGame.Builder addNumberOfPlayers(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PLAYERS, value.build());
    }

    @Override
    public VideoGame.Builder addNumberOfPlayers(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PLAYERS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public VideoGame.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public VideoGame.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addOperatingSystem(Text value) {
      return addProperty(CoreConstants.PROPERTY_OPERATING_SYSTEM, value);
    }

    @Override
    public VideoGame.Builder addOperatingSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_OPERATING_SYSTEM, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPermissions(Text value) {
      return addProperty(CoreConstants.PROPERTY_PERMISSIONS, value);
    }

    @Override
    public VideoGame.Builder addPermissions(String value) {
      return addProperty(CoreConstants.PROPERTY_PERMISSIONS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPlayMode(GamePlayMode value) {
      return addProperty(CoreConstants.PROPERTY_PLAY_MODE, value);
    }

    @Override
    public VideoGame.Builder addPlayMode(String value) {
      return addProperty(CoreConstants.PROPERTY_PLAY_MODE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPosition(Integer value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, value);
    }

    @Override
    public VideoGame.Builder addPosition(Text value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, value);
    }

    @Override
    public VideoGame.Builder addPosition(String value) {
      return addProperty(CoreConstants.PROPERTY_POSITION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public VideoGame.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public VideoGame.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addProcessorRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_PROCESSOR_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addProcessorRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_PROCESSOR_REQUIREMENTS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addProducer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
    }

    @Override
    public VideoGame.Builder addProducer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
    }

    @Override
    public VideoGame.Builder addProducer(Person value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
    }

    @Override
    public VideoGame.Builder addProducer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
    }

    @Override
    public VideoGame.Builder addProducer(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCER, Text.of(value));
    }

    @Override
    public VideoGame.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public VideoGame.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public VideoGame.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public VideoGame.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public VideoGame.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPublication(PublicationEvent value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, value);
    }

    @Override
    public VideoGame.Builder addPublication(PublicationEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, value.build());
    }

    @Override
    public VideoGame.Builder addPublication(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLICATION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPublisher(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
    }

    @Override
    public VideoGame.Builder addPublisher(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
    }

    @Override
    public VideoGame.Builder addPublisher(Person value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
    }

    @Override
    public VideoGame.Builder addPublisher(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
    }

    @Override
    public VideoGame.Builder addPublisher(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHER, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPublishingPrinciples(URL value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, value);
    }

    @Override
    public VideoGame.Builder addPublishingPrinciples(String value) {
      return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, Text.of(value));
    }

    @Override
    public VideoGame.Builder addQuest(Thing value) {
      return addProperty(CoreConstants.PROPERTY_QUEST, value);
    }

    @Override
    public VideoGame.Builder addQuest(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_QUEST, value.build());
    }

    @Override
    public VideoGame.Builder addQuest(String value) {
      return addProperty(CoreConstants.PROPERTY_QUEST, Text.of(value));
    }

    @Override
    public VideoGame.Builder addRecordedAt(Event value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value);
    }

    @Override
    public VideoGame.Builder addRecordedAt(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value.build());
    }

    @Override
    public VideoGame.Builder addRecordedAt(String value) {
      return addProperty(CoreConstants.PROPERTY_RECORDED_AT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addReleasedEvent(PublicationEvent value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value);
    }

    @Override
    public VideoGame.Builder addReleasedEvent(PublicationEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value.build());
    }

    @Override
    public VideoGame.Builder addReleasedEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addReleaseNotes(Text value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_NOTES, value);
    }

    @Override
    public VideoGame.Builder addReleaseNotes(URL value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_NOTES, value);
    }

    @Override
    public VideoGame.Builder addReleaseNotes(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_NOTES, Text.of(value));
    }

    @Override
    public VideoGame.Builder addRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_REQUIREMENTS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public VideoGame.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public VideoGame.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public VideoGame.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public VideoGame.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public VideoGame.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public VideoGame.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSchemaVersion(Text value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
    }

    @Override
    public VideoGame.Builder addSchemaVersion(URL value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
    }

    @Override
    public VideoGame.Builder addSchemaVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addScreenshot(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, value);
    }

    @Override
    public VideoGame.Builder addScreenshot(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, value.build());
    }

    @Override
    public VideoGame.Builder addScreenshot(URL value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, value);
    }

    @Override
    public VideoGame.Builder addScreenshot(String value) {
      return addProperty(CoreConstants.PROPERTY_SCREENSHOT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSoftwareAddOn(SoftwareApplication value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_ADD_ON, value);
    }

    @Override
    public VideoGame.Builder addSoftwareAddOn(SoftwareApplication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_ADD_ON, value.build());
    }

    @Override
    public VideoGame.Builder addSoftwareAddOn(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_ADD_ON, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSoftwareHelp(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_HELP, value);
    }

    @Override
    public VideoGame.Builder addSoftwareHelp(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_HELP, value.build());
    }

    @Override
    public VideoGame.Builder addSoftwareHelp(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_HELP, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSoftwareRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addSoftwareRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addSoftwareRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_REQUIREMENTS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSoftwareVersion(Text value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_VERSION, value);
    }

    @Override
    public VideoGame.Builder addSoftwareVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_SOFTWARE_VERSION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSourceOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value);
    }

    @Override
    public VideoGame.Builder addSourceOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value.build());
    }

    @Override
    public VideoGame.Builder addSourceOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addStorageRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addStorageRequirements(URL value) {
      return addProperty(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS, value);
    }

    @Override
    public VideoGame.Builder addStorageRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_STORAGE_REQUIREMENTS, Text.of(value));
    }

    @Override
    public VideoGame.Builder addSupportingData(DataFeed value) {
      return addProperty(CoreConstants.PROPERTY_SUPPORTING_DATA, value);
    }

    @Override
    public VideoGame.Builder addSupportingData(DataFeed.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUPPORTING_DATA, value.build());
    }

    @Override
    public VideoGame.Builder addSupportingData(String value) {
      return addProperty(CoreConstants.PROPERTY_SUPPORTING_DATA, Text.of(value));
    }

    @Override
    public VideoGame.Builder addText(Text value) {
      return addProperty(CoreConstants.PROPERTY_TEXT, value);
    }

    @Override
    public VideoGame.Builder addText(String value) {
      return addProperty(CoreConstants.PROPERTY_TEXT, Text.of(value));
    }

    @Override
    public VideoGame.Builder addThumbnailUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, value);
    }

    @Override
    public VideoGame.Builder addThumbnailUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, Text.of(value));
    }

    @Override
    public VideoGame.Builder addTimeRequired(Duration value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value);
    }

    @Override
    public VideoGame.Builder addTimeRequired(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value.build());
    }

    @Override
    public VideoGame.Builder addTimeRequired(String value) {
      return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, Text.of(value));
    }

    @Override
    public VideoGame.Builder addTrailer(VideoObject value) {
      return addProperty(CoreConstants.PROPERTY_TRAILER, value);
    }

    @Override
    public VideoGame.Builder addTrailer(VideoObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRAILER, value.build());
    }

    @Override
    public VideoGame.Builder addTrailer(String value) {
      return addProperty(CoreConstants.PROPERTY_TRAILER, Text.of(value));
    }

    @Override
    public VideoGame.Builder addTranslator(Organization value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
    }

    @Override
    public VideoGame.Builder addTranslator(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
    }

    @Override
    public VideoGame.Builder addTranslator(Person value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
    }

    @Override
    public VideoGame.Builder addTranslator(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
    }

    @Override
    public VideoGame.Builder addTranslator(String value) {
      return addProperty(CoreConstants.PROPERTY_TRANSLATOR, Text.of(value));
    }

    @Override
    public VideoGame.Builder addTypicalAgeRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
    }

    @Override
    public VideoGame.Builder addTypicalAgeRange(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public VideoGame.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public VideoGame.Builder addVersion(Number value) {
      return addProperty(CoreConstants.PROPERTY_VERSION, value);
    }

    @Override
    public VideoGame.Builder addVersion(String value) {
      return addProperty(CoreConstants.PROPERTY_VERSION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addVideo(VideoObject value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, value);
    }

    @Override
    public VideoGame.Builder addVideo(VideoObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, value.build());
    }

    @Override
    public VideoGame.Builder addVideo(String value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO, Text.of(value));
    }

    @Override
    public VideoGame.Builder addWorkExample(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value);
    }

    @Override
    public VideoGame.Builder addWorkExample(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value.build());
    }

    @Override
    public VideoGame.Builder addWorkExample(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, Text.of(value));
    }

    @Override
    public VideoGame.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public VideoGame.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public VideoGame.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public VideoGame.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public VideoGame.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public VideoGame.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public VideoGame build() {
      return new VideoGameImpl(properties, reverseMap);
    }
  }

  public VideoGameImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_VIDEO_GAME;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getActorList() {
    return getProperty(CoreConstants.PROPERTY_ACTOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getActorsList() {
    return getProperty(CoreConstants.PROPERTY_ACTORS);
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
  public ImmutableList<SchemaOrgType> getCheatCodeList() {
    return getProperty(CoreConstants.PROPERTY_CHEAT_CODE);
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
  public ImmutableList<SchemaOrgType> getDirectorList() {
    return getProperty(CoreConstants.PROPERTY_DIRECTOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDirectorsList() {
    return getProperty(CoreConstants.PROPERTY_DIRECTORS);
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
  public ImmutableList<SchemaOrgType> getGamePlatformList() {
    return getProperty(CoreConstants.PROPERTY_GAME_PLATFORM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGameServerList() {
    return getProperty(CoreConstants.PROPERTY_GAME_SERVER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGameTipList() {
    return getProperty(CoreConstants.PROPERTY_GAME_TIP);
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
  public ImmutableList<SchemaOrgType> getMusicByList() {
    return getProperty(CoreConstants.PROPERTY_MUSIC_BY);
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
  public ImmutableList<SchemaOrgType> getPlayModeList() {
    return getProperty(CoreConstants.PROPERTY_PLAY_MODE);
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

  @Override
  public ImmutableList<SchemaOrgType> getTrailerList() {
    return getProperty(CoreConstants.PROPERTY_TRAILER);
  }
}
