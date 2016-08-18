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

package com.google.schemaorg.goog;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.Action;
import com.google.schemaorg.core.Article;
import com.google.schemaorg.core.Boolean;
import com.google.schemaorg.core.CoreConstants;
import com.google.schemaorg.core.CreativeWork;
import com.google.schemaorg.core.GeoShape;
import com.google.schemaorg.core.ImageObject;
import com.google.schemaorg.core.IntangibleImpl;
import com.google.schemaorg.core.Place;
import com.google.schemaorg.core.StructuredValue;
import com.google.schemaorg.core.Thing;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;

/** Implementation of {@link PopularityScoreSpecification}. */
public class PopularityScoreSpecificationImpl extends IntangibleImpl
    implements PopularityScoreSpecification {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_REGION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VALUE);

    builder.add(GoogConstants.PROPERTY_APPLICABLE_KEYWORD_OR_GENRE);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl
      extends SchemaOrgTypeImpl.BuilderImpl<PopularityScoreSpecification.Builder>
      implements PopularityScoreSpecification.Builder {

    @Override
    public PopularityScoreSpecification.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addEligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addEligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addEligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addEligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addEligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addEligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addValue(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addValue(Number value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addValue(StructuredValue value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addValue(StructuredValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addValue(Text value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addValue(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addApplicableKeywordOrGenre(Text value) {
      return addProperty(GoogConstants.PROPERTY_APPLICABLE_KEYWORD_OR_GENRE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addApplicableKeywordOrGenre(String value) {
      return addProperty(GoogConstants.PROPERTY_APPLICABLE_KEYWORD_OR_GENRE, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification.Builder addPopularityScore(
        PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public PopularityScoreSpecification.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public PopularityScoreSpecification.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public PopularityScoreSpecification build() {
      return new PopularityScoreSpecificationImpl(properties, reverseMap);
    }
  }

  public PopularityScoreSpecificationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return GoogConstants.TYPE_POPULARITY_SCORE_SPECIFICATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEligibleRegionList() {
    return getProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValueList() {
    return getProperty(CoreConstants.PROPERTY_VALUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getApplicableKeywordOrGenreList() {
    return getProperty(GoogConstants.PROPERTY_APPLICABLE_KEYWORD_OR_GENRE);
  }
}
