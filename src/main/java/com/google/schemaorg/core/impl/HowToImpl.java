package com.google.schemaorg.core;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgException;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.*;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;


/**
 * Implementation of {@link HowTo}.
 */
public class HowToImpl extends CreativeWorkImpl implements HowTo {
    private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

    public HowToImpl(
            Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
        super(properties, reverseMap);
    }

    private static ImmutableSet<String> initializePropertySet() {
        ImmutableSet.Builder<String> builder = ImmutableSet.builder();

        builder.add(CoreConstants.PROPERTY_ESTIMATED_COST);
        builder.add(CoreConstants.PROPERTY_PERFORM_TIME);
        builder.add(CoreConstants.PROPERTY_PREP_TIME);
        builder.add(CoreConstants.PROPERTY_STEP);
        builder.add(CoreConstants.PROPERTY_SUPPLY);
        builder.add(CoreConstants.PROPERTY_TOOL);
        builder.add(CoreConstants.PROPERTY_TOTAL_TIME);
        builder.add(CoreConstants.PROPERTY_YIELD);

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

    @Override
    public String getFullTypeName() {
        return CoreConstants.TYPE_HOW_TO;
    }

    @Override
    public boolean includesProperty(String property) {
        return false;
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
    public ImmutableList<SchemaOrgType> getPositionList() {
        return getProperty(CoreConstants.PROPERTY_POSITION);
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
    public boolean containsJsonLdId() {
        return false;
    }

    @Override
    public ImmutableList<ValueType> getJsonLdContextList() {
        return null;
    }

    @Override
    public String getJsonLdId() throws SchemaOrgException {
        return null;
    }

    @Override
    public ImmutableMultimap<String, Thing> getJsonLdReverseMap() {
        return null;
    }

    @Override
    public boolean contentEquals(ValueType that) {
        return false;
    }

    @Override
    public ImmutableList<SchemaOrgType> getEstimatedCostList() {
        return getProperty(CoreConstants.PROPERTY_ESTIMATED_COST);
    }

    @Override
    public ImmutableList<SchemaOrgType> getPerformTimeList() {
        return getProperty(CoreConstants.PROPERTY_PERFORM_TIME);
    }

    @Override
    public ImmutableList<SchemaOrgType> getPrepTimeList() {
        return getProperty(CoreConstants.PROPERTY_PREP_TIME);
    }

    @Override
    public ImmutableList<SchemaOrgType> getStepList() {
        return getProperty(CoreConstants.PROPERTY_STEP);
    }

    @Override
    public ImmutableList<SchemaOrgType> getSupplyList() {
        return getProperty(CoreConstants.PROPERTY_SUPPLY);
    }

    @Override
    public ImmutableList<SchemaOrgType> getToolList() {
        return getProperty(CoreConstants.PROPERTY_TOOL);
    }

    @Override
    public ImmutableList<SchemaOrgType> getTotalTimeList() {
        return getProperty(CoreConstants.PROPERTY_TOTAL_TIME);
    }

    @Override
    public ImmutableList<SchemaOrgType> getYieldList() {
        return getProperty(CoreConstants.PROPERTY_YIELD);
    }

    static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<HowTo.Builder> implements HowTo.Builder {

        @Override
        public HowTo.Builder addEstimatedCost(Text value) {
            return addProperty(CoreConstants.PROPERTY_ESTIMATED_COST, value);
        }

        @Override
        public HowTo.Builder addEstimatedCost(String value) {
            return addProperty(CoreConstants.PROPERTY_ESTIMATED_COST, Text.of(value));
        }

        @Override
        public HowTo.Builder addPerformTime(Duration value) {
            return addProperty(CoreConstants.PROPERTY_PERFORM_TIME, value);
        }

        @Override
        public HowTo.Builder addPrepTime(Duration value) {
            return addProperty(CoreConstants.PROPERTY_PREP_TIME, value);
        }

        @Override
        public HowTo.Builder addStep(Text value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);
        }

        @Override
        public HowTo.Builder addStep(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);
        }

        @Override
        public HowTo.Builder addStep(HowToSection value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);
        }

        @Override
        public HowTo.Builder addStep(HowToStep value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value);
        }

        @Override
        public HowTo.Builder addStep(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value.build());
        }

        @Override
        public HowTo.Builder addStep(HowToSection.Builder value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value.build());
        }

        @Override
        public HowTo.Builder addStep(HowToStep.Builder value) {
            return addProperty(CoreConstants.PROPERTY_STEP, value.build());
        }


        @Override
        public HowTo.Builder addSupply(Text value) {
            return addProperty(CoreConstants.PROPERTY_SUPPLY, value);
        }

        @Override
        public HowTo.Builder addTool(Text value) {
            return addProperty(CoreConstants.PROPERTY_TOOL, value);
        }

        @Override
        public HowTo.Builder addTotalTime(Duration value) {
            return addProperty(CoreConstants.PROPERTY_TOTAL_TIME, value);
        }

        @Override
        public HowTo.Builder addYield(Text value) {
            return addProperty(CoreConstants.PROPERTY_YIELD, value);
        }

        @Override
        public HowTo.Builder addYield(QuantitativeValue value) {
            return addProperty(CoreConstants.PROPERTY_YIELD, value);
        }

        @Override
        public HowTo.Builder addAbout(Thing value) {
            return addProperty(CoreConstants.PROPERTY_ABOUT, value);
        }

        @Override
        public HowTo.Builder addAbout(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ABOUT, value.build());
        }

        @Override
        public HowTo.Builder addAbout(String value) {
            return addProperty(CoreConstants.PROPERTY_ABOUT, Text.of(value));
        }

        @Override
        public HowTo.Builder addAccessibilityAPI(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, value);
        }

        @Override
        public HowTo.Builder addAccessibilityAPI(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_API, Text.of(value));
        }

        @Override
        public HowTo.Builder addAccessibilityControl(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, value);
        }

        @Override
        public HowTo.Builder addAccessibilityControl(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_CONTROL, Text.of(value));
        }

        @Override
        public HowTo.Builder addAccessibilityFeature(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, value);
        }

        @Override
        public HowTo.Builder addAccessibilityFeature(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_FEATURE, Text.of(value));
        }

        @Override
        public HowTo.Builder addAccessibilityHazard(Text value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, value);
        }

        @Override
        public HowTo.Builder addAccessibilityHazard(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCESSIBILITY_HAZARD, Text.of(value));
        }

        @Override
        public HowTo.Builder addAccountablePerson(Person value) {
            return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value);
        }

        @Override
        public HowTo.Builder addAccountablePerson(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, value.build());
        }

        @Override
        public HowTo.Builder addAccountablePerson(String value) {
            return addProperty(CoreConstants.PROPERTY_ACCOUNTABLE_PERSON, Text.of(value));
        }

        @Override
        public HowTo.Builder addAdditionalType(URL value) {
            return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
        }

        @Override
        public HowTo.Builder addAdditionalType(String value) {
            return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
        }

        @Override
        public HowTo.Builder addAggregateRating(AggregateRating value) {
            return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
        }

        @Override
        public HowTo.Builder addAggregateRating(AggregateRating.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
        }

        @Override
        public HowTo.Builder addAggregateRating(String value) {
            return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
        }

        @Override
        public HowTo.Builder addAlternateName(Text value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
        }

        @Override
        public HowTo.Builder addAlternateName(String value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
        }

        @Override
        public HowTo.Builder addAlternativeHeadline(Text value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, value);
        }

        @Override
        public HowTo.Builder addAlternativeHeadline(String value) {
            return addProperty(CoreConstants.PROPERTY_ALTERNATIVE_HEADLINE, Text.of(value));
        }

        @Override
        public HowTo.Builder addAssociatedMedia(MediaObject value) {
            return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value);
        }

        @Override
        public HowTo.Builder addAssociatedMedia(MediaObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, value.build());
        }

        @Override
        public HowTo.Builder addAssociatedMedia(String value) {
            return addProperty(CoreConstants.PROPERTY_ASSOCIATED_MEDIA, Text.of(value));
        }

        @Override
        public HowTo.Builder addAudience(Audience value) {
            return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
        }

        @Override
        public HowTo.Builder addAudience(Audience.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
        }

        @Override
        public HowTo.Builder addAudience(String value) {
            return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
        }

        @Override
        public HowTo.Builder addAudio(AudioObject value) {
            return addProperty(CoreConstants.PROPERTY_AUDIO, value);
        }

        @Override
        public HowTo.Builder addAudio(AudioObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUDIO, value.build());
        }

        @Override
        public HowTo.Builder addAudio(String value) {
            return addProperty(CoreConstants.PROPERTY_AUDIO, Text.of(value));
        }

        @Override
        public HowTo.Builder addAuthor(Organization value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
        }

        @Override
        public HowTo.Builder addAuthor(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
        }

        @Override
        public HowTo.Builder addAuthor(Person value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value);
        }

        @Override
        public HowTo.Builder addAuthor(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, value.build());
        }

        @Override
        public HowTo.Builder addAuthor(String value) {
            return addProperty(CoreConstants.PROPERTY_AUTHOR, Text.of(value));
        }

        @Override
        public HowTo.Builder addAward(Text value) {
            return addProperty(CoreConstants.PROPERTY_AWARD, value);
        }

        @Override
        public HowTo.Builder addAward(String value) {
            return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
        }

        @Override
        public HowTo.Builder addAwards(Text value) {
            return addProperty(CoreConstants.PROPERTY_AWARDS, value);
        }

        @Override
        public HowTo.Builder addAwards(String value) {
            return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
        }

        @Override
        public HowTo.Builder addCharacter(Person value) {
            return addProperty(CoreConstants.PROPERTY_CHARACTER, value);
        }

        @Override
        public HowTo.Builder addCharacter(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CHARACTER, value.build());
        }

        @Override
        public HowTo.Builder addCharacter(String value) {
            return addProperty(CoreConstants.PROPERTY_CHARACTER, Text.of(value));
        }

        @Override
        public HowTo.Builder addCitation(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, value);
        }

        @Override
        public HowTo.Builder addCitation(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, value.build());
        }

        @Override
        public HowTo.Builder addCitation(Text value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, value);
        }

        @Override
        public HowTo.Builder addCitation(String value) {
            return addProperty(CoreConstants.PROPERTY_CITATION, Text.of(value));
        }

        @Override
        public HowTo.Builder addComment(Comment value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT, value);
        }

        @Override
        public HowTo.Builder addComment(Comment.Builder value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT, value.build());
        }

        @Override
        public HowTo.Builder addComment(String value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT, Text.of(value));
        }

        @Override
        public HowTo.Builder addCommentCount(Integer value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, value);
        }

        @Override
        public HowTo.Builder addCommentCount(String value) {
            return addProperty(CoreConstants.PROPERTY_COMMENT_COUNT, Text.of(value));
        }

        @Override
        public HowTo.Builder addContentLocation(Place value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value);
        }

        @Override
        public HowTo.Builder addContentLocation(Place.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, value.build());
        }

        @Override
        public HowTo.Builder addContentLocation(String value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_LOCATION, Text.of(value));
        }

        @Override
        public HowTo.Builder addContentRating(Text value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, value);
        }

        @Override
        public HowTo.Builder addContentRating(String value) {
            return addProperty(CoreConstants.PROPERTY_CONTENT_RATING, Text.of(value));
        }

        @Override
        public HowTo.Builder addContributor(Organization value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
        }

        @Override
        public HowTo.Builder addContributor(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
        }

        @Override
        public HowTo.Builder addContributor(Person value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value);
        }

        @Override
        public HowTo.Builder addContributor(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, value.build());
        }

        @Override
        public HowTo.Builder addContributor(String value) {
            return addProperty(CoreConstants.PROPERTY_CONTRIBUTOR, Text.of(value));
        }

        @Override
        public HowTo.Builder addCopyrightHolder(Organization value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
        }

        @Override
        public HowTo.Builder addCopyrightHolder(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
        }

        @Override
        public HowTo.Builder addCopyrightHolder(Person value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value);
        }

        @Override
        public HowTo.Builder addCopyrightHolder(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, value.build());
        }

        @Override
        public HowTo.Builder addCopyrightHolder(String value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_HOLDER, Text.of(value));
        }

        @Override
        public HowTo.Builder addCopyrightYear(Number value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, value);
        }

        @Override
        public HowTo.Builder addCopyrightYear(String value) {
            return addProperty(CoreConstants.PROPERTY_COPYRIGHT_YEAR, Text.of(value));
        }

        @Override
        public HowTo.Builder addCreator(Organization value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value);
        }

        @Override
        public HowTo.Builder addCreator(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
        }

        @Override
        public HowTo.Builder addCreator(Person value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value);
        }

        @Override
        public HowTo.Builder addCreator(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, value.build());
        }

        @Override
        public HowTo.Builder addCreator(String value) {
            return addProperty(CoreConstants.PROPERTY_CREATOR, Text.of(value));
        }

        @Override
        public HowTo.Builder addDateCreated(Date value) {
            return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
        }

        @Override
        public HowTo.Builder addDateCreated(DateTime value) {
            return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
        }

        @Override
        public HowTo.Builder addDateCreated(String value) {
            return addProperty(CoreConstants.PROPERTY_DATE_CREATED, Text.of(value));
        }

        @Override
        public HowTo.Builder addDateModified(Date value) {
            return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
        }

        @Override
        public HowTo.Builder addDateModified(DateTime value) {
            return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
        }

        @Override
        public HowTo.Builder addDateModified(String value) {
            return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, Text.of(value));
        }

        @Override
        public HowTo.Builder addDatePublished(Date value) {
            return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, value);
        }

        @Override
        public HowTo.Builder addDatePublished(String value) {
            return addProperty(CoreConstants.PROPERTY_DATE_PUBLISHED, Text.of(value));
        }

        @Override
        public HowTo.Builder addDescription(Text value) {
            return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
        }

        @Override
        public HowTo.Builder addDescription(String value) {
            return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
        }

        @Override
        public HowTo.Builder addDiscussionUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, value);
        }

        @Override
        public HowTo.Builder addDiscussionUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_DISCUSSION_URL, Text.of(value));
        }

        @Override
        public HowTo.Builder addEditor(Person value) {
            return addProperty(CoreConstants.PROPERTY_EDITOR, value);
        }

        @Override
        public HowTo.Builder addEditor(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_EDITOR, value.build());
        }

        @Override
        public HowTo.Builder addEditor(String value) {
            return addProperty(CoreConstants.PROPERTY_EDITOR, Text.of(value));
        }

        @Override
        public HowTo.Builder addEducationalAlignment(AlignmentObject value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value);
        }

        @Override
        public HowTo.Builder addEducationalAlignment(AlignmentObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, value.build());
        }

        @Override
        public HowTo.Builder addEducationalAlignment(String value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_ALIGNMENT, Text.of(value));
        }

        @Override
        public HowTo.Builder addEducationalUse(Text value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, value);
        }

        @Override
        public HowTo.Builder addEducationalUse(String value) {
            return addProperty(CoreConstants.PROPERTY_EDUCATIONAL_USE, Text.of(value));
        }

        @Override
        public HowTo.Builder addEncoding(MediaObject value) {
            return addProperty(CoreConstants.PROPERTY_ENCODING, value);
        }

        @Override
        public HowTo.Builder addEncoding(MediaObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ENCODING, value.build());
        }

        @Override
        public HowTo.Builder addEncoding(String value) {
            return addProperty(CoreConstants.PROPERTY_ENCODING, Text.of(value));
        }

        @Override
        public HowTo.Builder addEncodings(MediaObject value) {
            return addProperty(CoreConstants.PROPERTY_ENCODINGS, value);
        }

        @Override
        public HowTo.Builder addEncodings(MediaObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_ENCODINGS, value.build());
        }

        @Override
        public HowTo.Builder addEncodings(String value) {
            return addProperty(CoreConstants.PROPERTY_ENCODINGS, Text.of(value));
        }

        @Override
        public HowTo.Builder addExampleOfWork(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value);
        }

        @Override
        public HowTo.Builder addExampleOfWork(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, value.build());
        }

        @Override
        public HowTo.Builder addExampleOfWork(String value) {
            return addProperty(CoreConstants.PROPERTY_EXAMPLE_OF_WORK, Text.of(value));
        }

        @Override
        public HowTo.Builder addFileFormat(Text value) {
            return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, value);
        }

        @Override
        public HowTo.Builder addFileFormat(String value) {
            return addProperty(CoreConstants.PROPERTY_FILE_FORMAT, Text.of(value));
        }

        @Override
        public HowTo.Builder addGenre(Text value) {
            return addProperty(CoreConstants.PROPERTY_GENRE, value);
        }

        @Override
        public HowTo.Builder addGenre(URL value) {
            return addProperty(CoreConstants.PROPERTY_GENRE, value);
        }

        @Override
        public HowTo.Builder addGenre(String value) {
            return addProperty(CoreConstants.PROPERTY_GENRE, Text.of(value));
        }

        @Override
        public HowTo.Builder addHasPart(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_HAS_PART, value);
        }

        @Override
        public HowTo.Builder addHasPart(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_HAS_PART, value.build());
        }

        @Override
        public HowTo.Builder addHasPart(String value) {
            return addProperty(CoreConstants.PROPERTY_HAS_PART, Text.of(value));
        }

        @Override
        public HowTo.Builder addHeadline(Text value) {
            return addProperty(CoreConstants.PROPERTY_HEADLINE, value);
        }

        @Override
        public HowTo.Builder addHeadline(String value) {
            return addProperty(CoreConstants.PROPERTY_HEADLINE, Text.of(value));
        }

        @Override
        public HowTo.Builder addImage(ImageObject value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, value);
        }

        @Override
        public HowTo.Builder addImage(ImageObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
        }

        @Override
        public HowTo.Builder addImage(URL value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, value);
        }

        @Override
        public HowTo.Builder addImage(String value) {
            return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
        }

        @Override
        public HowTo.Builder addInLanguage(Language value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
        }

        @Override
        public HowTo.Builder addInLanguage(Language.Builder value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
        }

        @Override
        public HowTo.Builder addInLanguage(Text value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
        }

        @Override
        public HowTo.Builder addInLanguage(String value) {
            return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
        }

        @Override
        public HowTo.Builder addInteractionStatistic(InteractionCounter value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value);
        }

        @Override
        public HowTo.Builder addInteractionStatistic(InteractionCounter.Builder value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, value.build());
        }

        @Override
        public HowTo.Builder addInteractionStatistic(String value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTION_STATISTIC, Text.of(value));
        }

        @Override
        public HowTo.Builder addInteractivityType(Text value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, value);
        }

        @Override
        public HowTo.Builder addInteractivityType(String value) {
            return addProperty(CoreConstants.PROPERTY_INTERACTIVITY_TYPE, Text.of(value));
        }

        @Override
        public HowTo.Builder addIsBasedOnUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, value);
        }

        @Override
        public HowTo.Builder addIsBasedOnUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_IS_BASED_ON_URL, Text.of(value));
        }

        @Override
        public HowTo.Builder addIsFamilyFriendly(Boolean value) {
            return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, value);
        }

        @Override
        public HowTo.Builder addIsFamilyFriendly(String value) {
            return addProperty(CoreConstants.PROPERTY_IS_FAMILY_FRIENDLY, Text.of(value));
        }

        @Override
        public HowTo.Builder addIsPartOf(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value);
        }

        @Override
        public HowTo.Builder addIsPartOf(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_IS_PART_OF, value.build());
        }

        @Override
        public HowTo.Builder addIsPartOf(String value) {
            return addProperty(CoreConstants.PROPERTY_IS_PART_OF, Text.of(value));
        }

        @Override
        public HowTo.Builder addKeywords(Text value) {
            return addProperty(CoreConstants.PROPERTY_KEYWORDS, value);
        }

        @Override
        public HowTo.Builder addKeywords(String value) {
            return addProperty(CoreConstants.PROPERTY_KEYWORDS, Text.of(value));
        }

        @Override
        public HowTo.Builder addLearningResourceType(Text value) {
            return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, value);
        }

        @Override
        public HowTo.Builder addLearningResourceType(String value) {
            return addProperty(CoreConstants.PROPERTY_LEARNING_RESOURCE_TYPE, Text.of(value));
        }

        @Override
        public HowTo.Builder addLicense(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, value);
        }

        @Override
        public HowTo.Builder addLicense(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, value.build());
        }

        @Override
        public HowTo.Builder addLicense(URL value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, value);
        }

        @Override
        public HowTo.Builder addLicense(String value) {
            return addProperty(CoreConstants.PROPERTY_LICENSE, Text.of(value));
        }

        @Override
        public HowTo.Builder addLocationCreated(Place value) {
            return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value);
        }

        @Override
        public HowTo.Builder addLocationCreated(Place.Builder value) {
            return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, value.build());
        }

        @Override
        public HowTo.Builder addLocationCreated(String value) {
            return addProperty(CoreConstants.PROPERTY_LOCATION_CREATED, Text.of(value));
        }

        @Override
        public HowTo.Builder addMainEntity(Thing value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value);
        }

        @Override
        public HowTo.Builder addMainEntity(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, value.build());
        }

        @Override
        public HowTo.Builder addMainEntity(String value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY, Text.of(value));
        }

        @Override
        public HowTo.Builder addMainEntityOfPage(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
        }

        @Override
        public HowTo.Builder addMainEntityOfPage(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
        }

        @Override
        public HowTo.Builder addMainEntityOfPage(URL value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
        }

        @Override
        public HowTo.Builder addMainEntityOfPage(String value) {
            return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
        }

        @Override
        public HowTo.Builder addMentions(Thing value) {
            return addProperty(CoreConstants.PROPERTY_MENTIONS, value);
        }

        @Override
        public HowTo.Builder addMentions(Thing.Builder value) {
            return addProperty(CoreConstants.PROPERTY_MENTIONS, value.build());
        }

        @Override
        public HowTo.Builder addMentions(String value) {
            return addProperty(CoreConstants.PROPERTY_MENTIONS, Text.of(value));
        }

        @Override
        public HowTo.Builder addName(Text value) {
            return addProperty(CoreConstants.PROPERTY_NAME, value);
        }

        @Override
        public HowTo.Builder addName(String value) {
            return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
        }

        @Override
        public HowTo.Builder addOffers(Offer value) {
            return addProperty(CoreConstants.PROPERTY_OFFERS, value);
        }

        @Override
        public HowTo.Builder addOffers(Offer.Builder value) {
            return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
        }

        @Override
        public HowTo.Builder addOffers(String value) {
            return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
        }

        @Override
        public HowTo.Builder addPosition(Integer value) {
            return addProperty(CoreConstants.PROPERTY_POSITION, value);
        }

        @Override
        public HowTo.Builder addPosition(Text value) {
            return addProperty(CoreConstants.PROPERTY_POSITION, value);
        }

        @Override
        public HowTo.Builder addPosition(String value) {
            return addProperty(CoreConstants.PROPERTY_POSITION, Text.of(value));
        }

        @Override
        public HowTo.Builder addPotentialAction(Action value) {
            return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
        }

        @Override
        public HowTo.Builder addPotentialAction(Action.Builder value) {
            return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
        }

        @Override
        public HowTo.Builder addPotentialAction(String value) {
            return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
        }

        @Override
        public HowTo.Builder addProducer(Organization value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
        }

        @Override
        public HowTo.Builder addProducer(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
        }

        @Override
        public HowTo.Builder addProducer(Person value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value);
        }

        @Override
        public HowTo.Builder addProducer(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, value.build());
        }

        @Override
        public HowTo.Builder addProducer(String value) {
            return addProperty(CoreConstants.PROPERTY_PRODUCER, Text.of(value));
        }

        @Override
        public HowTo.Builder addProvider(Organization value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
        }

        @Override
        public HowTo.Builder addProvider(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
        }

        @Override
        public HowTo.Builder addProvider(Person value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
        }

        @Override
        public HowTo.Builder addProvider(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
        }

        @Override
        public HowTo.Builder addProvider(String value) {
            return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
        }

        @Override
        public HowTo.Builder addPublication(PublicationEvent value) {
            return addProperty(CoreConstants.PROPERTY_PUBLICATION, value);
        }

        @Override
        public HowTo.Builder addPublication(PublicationEvent.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PUBLICATION, value.build());
        }

        @Override
        public HowTo.Builder addPublication(String value) {
            return addProperty(CoreConstants.PROPERTY_PUBLICATION, Text.of(value));
        }

        @Override
        public HowTo.Builder addPublisher(Organization value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
        }

        @Override
        public HowTo.Builder addPublisher(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
        }

        @Override
        public HowTo.Builder addPublisher(Person value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value);
        }

        @Override
        public HowTo.Builder addPublisher(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, value.build());
        }

        @Override
        public HowTo.Builder addPublisher(String value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHER, Text.of(value));
        }

        @Override
        public HowTo.Builder addPublishingPrinciples(URL value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, value);
        }

        @Override
        public HowTo.Builder addPublishingPrinciples(String value) {
            return addProperty(CoreConstants.PROPERTY_PUBLISHING_PRINCIPLES, Text.of(value));
        }

        @Override
        public HowTo.Builder addRecordedAt(Event value) {
            return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value);
        }

        @Override
        public HowTo.Builder addRecordedAt(Event.Builder value) {
            return addProperty(CoreConstants.PROPERTY_RECORDED_AT, value.build());
        }

        @Override
        public HowTo.Builder addRecordedAt(String value) {
            return addProperty(CoreConstants.PROPERTY_RECORDED_AT, Text.of(value));
        }

        @Override
        public HowTo.Builder addReleasedEvent(PublicationEvent value) {
            return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value);
        }

        @Override
        public HowTo.Builder addReleasedEvent(PublicationEvent.Builder value) {
            return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, value.build());
        }

        @Override
        public HowTo.Builder addReleasedEvent(String value) {
            return addProperty(CoreConstants.PROPERTY_RELEASED_EVENT, Text.of(value));
        }

        @Override
        public HowTo.Builder addReview(Review value) {
            return addProperty(CoreConstants.PROPERTY_REVIEW, value);
        }

        @Override
        public HowTo.Builder addReview(Review.Builder value) {
            return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
        }

        @Override
        public HowTo.Builder addReview(String value) {
            return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
        }

        @Override
        public HowTo.Builder addReviews(Review value) {
            return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
        }

        @Override
        public HowTo.Builder addReviews(Review.Builder value) {
            return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
        }

        @Override
        public HowTo.Builder addReviews(String value) {
            return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
        }

        @Override
        public HowTo.Builder addSameAs(URL value) {
            return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
        }

        @Override
        public HowTo.Builder addSameAs(String value) {
            return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
        }

        @Override
        public HowTo.Builder addSchemaVersion(Text value) {
            return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
        }

        @Override
        public HowTo.Builder addSchemaVersion(URL value) {
            return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, value);
        }

        @Override
        public HowTo.Builder addSchemaVersion(String value) {
            return addProperty(CoreConstants.PROPERTY_SCHEMA_VERSION, Text.of(value));
        }

        @Override
        public HowTo.Builder addSourceOrganization(Organization value) {
            return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value);
        }

        @Override
        public HowTo.Builder addSourceOrganization(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, value.build());
        }

        @Override
        public HowTo.Builder addSourceOrganization(String value) {
            return addProperty(CoreConstants.PROPERTY_SOURCE_ORGANIZATION, Text.of(value));
        }

        @Override
        public HowTo.Builder addText(Text value) {
            return addProperty(CoreConstants.PROPERTY_TEXT, value);
        }

        @Override
        public HowTo.Builder addText(String value) {
            return addProperty(CoreConstants.PROPERTY_TEXT, Text.of(value));
        }

        @Override
        public HowTo.Builder addThumbnailUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, value);
        }

        @Override
        public HowTo.Builder addThumbnailUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_THUMBNAIL_URL, Text.of(value));
        }

        @Override
        public HowTo.Builder addTimeRequired(Duration value) {
            return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value);
        }

        @Override
        public HowTo.Builder addTimeRequired(Duration.Builder value) {
            return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, value.build());
        }

        @Override
        public HowTo.Builder addTimeRequired(String value) {
            return addProperty(CoreConstants.PROPERTY_TIME_REQUIRED, Text.of(value));
        }

        @Override
        public HowTo.Builder addTranslator(Organization value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
        }

        @Override
        public HowTo.Builder addTranslator(Organization.Builder value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
        }

        @Override
        public HowTo.Builder addTranslator(Person value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value);
        }

        @Override
        public HowTo.Builder addTranslator(Person.Builder value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, value.build());
        }

        @Override
        public HowTo.Builder addTranslator(String value) {
            return addProperty(CoreConstants.PROPERTY_TRANSLATOR, Text.of(value));
        }

        @Override
        public HowTo.Builder addTypicalAgeRange(Text value) {
            return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, value);
        }

        @Override
        public HowTo.Builder addTypicalAgeRange(String value) {
            return addProperty(CoreConstants.PROPERTY_TYPICAL_AGE_RANGE, Text.of(value));
        }

        @Override
        public HowTo.Builder addUrl(URL value) {
            return addProperty(CoreConstants.PROPERTY_URL, value);
        }

        @Override
        public HowTo.Builder addUrl(String value) {
            return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
        }

        @Override
        public HowTo.Builder addVersion(Number value) {
            return addProperty(CoreConstants.PROPERTY_VERSION, value);
        }

        @Override
        public HowTo.Builder addVersion(String value) {
            return addProperty(CoreConstants.PROPERTY_VERSION, Text.of(value));
        }

        @Override
        public HowTo.Builder addVideo(VideoObject value) {
            return addProperty(CoreConstants.PROPERTY_VIDEO, value);
        }

        @Override
        public HowTo.Builder addVideo(VideoObject.Builder value) {
            return addProperty(CoreConstants.PROPERTY_VIDEO, value.build());
        }

        @Override
        public HowTo.Builder addVideo(String value) {
            return addProperty(CoreConstants.PROPERTY_VIDEO, Text.of(value));
        }

        @Override
        public HowTo.Builder addWorkExample(CreativeWork value) {
            return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value);
        }

        @Override
        public HowTo.Builder addWorkExample(CreativeWork.Builder value) {
            return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, value.build());
        }

        @Override
        public HowTo.Builder addWorkExample(String value) {
            return addProperty(CoreConstants.PROPERTY_WORK_EXAMPLE, Text.of(value));
        }

        @Override
        public HowTo.Builder addDetailedDescription(Article value) {
            return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
        }

        @Override
        public HowTo.Builder addDetailedDescription(Article.Builder value) {
            return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
        }

        @Override
        public HowTo.Builder addDetailedDescription(String value) {
            return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
        }

        @Override
        public HowTo.Builder addPopularityScore(PopularityScoreSpecification value) {
            return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
        }

        @Override
        public HowTo.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
            return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
        }

        @Override
        public HowTo.Builder addPopularityScore(String value) {
            return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
        }

        @Override
        public HowTo build() {
            return new HowToImpl(properties, reverseMap);
        }
    }

}
