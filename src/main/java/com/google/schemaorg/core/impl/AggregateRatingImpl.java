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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link AggregateRating}. */
public class AggregateRatingImpl extends RatingImpl implements AggregateRating {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BEST_RATING);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ITEM_REVIEWED);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RATING_COUNT);

    builder.add(CoreConstants.PROPERTY_RATING_VALUE);

    builder.add(CoreConstants.PROPERTY_REVIEW_COUNT);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_WORST_RATING);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<AggregateRating.Builder>
      implements AggregateRating.Builder {

    @Override
    public AggregateRating.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public AggregateRating.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public AggregateRating.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addBestRating(Number value) {
      return addProperty(CoreConstants.PROPERTY_BEST_RATING, value);
    }

    @Override
    public AggregateRating.Builder addBestRating(Text value) {
      return addProperty(CoreConstants.PROPERTY_BEST_RATING, value);
    }

    @Override
    public AggregateRating.Builder addBestRating(String value) {
      return addProperty(CoreConstants.PROPERTY_BEST_RATING, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public AggregateRating.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public AggregateRating.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public AggregateRating.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public AggregateRating.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addItemReviewed(Thing value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_REVIEWED, value);
    }

    @Override
    public AggregateRating.Builder addItemReviewed(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_REVIEWED, value.build());
    }

    @Override
    public AggregateRating.Builder addItemReviewed(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_REVIEWED, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public AggregateRating.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public AggregateRating.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public AggregateRating.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public AggregateRating.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public AggregateRating.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public AggregateRating.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addRatingCount(Integer value) {
      return addProperty(CoreConstants.PROPERTY_RATING_COUNT, value);
    }

    @Override
    public AggregateRating.Builder addRatingCount(String value) {
      return addProperty(CoreConstants.PROPERTY_RATING_COUNT, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addRatingValue(Text value) {
      return addProperty(CoreConstants.PROPERTY_RATING_VALUE, value);
    }

    @Override
    public AggregateRating.Builder addRatingValue(String value) {
      return addProperty(CoreConstants.PROPERTY_RATING_VALUE, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addReviewCount(Integer value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW_COUNT, value);
    }

    @Override
    public AggregateRating.Builder addReviewCount(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW_COUNT, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public AggregateRating.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public AggregateRating.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addWorstRating(Number value) {
      return addProperty(CoreConstants.PROPERTY_WORST_RATING, value);
    }

    @Override
    public AggregateRating.Builder addWorstRating(Text value) {
      return addProperty(CoreConstants.PROPERTY_WORST_RATING, value);
    }

    @Override
    public AggregateRating.Builder addWorstRating(String value) {
      return addProperty(CoreConstants.PROPERTY_WORST_RATING, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public AggregateRating.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public AggregateRating.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public AggregateRating.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public AggregateRating.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public AggregateRating.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public AggregateRating build() {
      return new AggregateRatingImpl(properties, reverseMap);
    }
  }

  public AggregateRatingImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_AGGREGATE_RATING;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getItemReviewedList() {
    return getProperty(CoreConstants.PROPERTY_ITEM_REVIEWED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRatingCountList() {
    return getProperty(CoreConstants.PROPERTY_RATING_COUNT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReviewCountList() {
    return getProperty(CoreConstants.PROPERTY_REVIEW_COUNT);
  }
}
