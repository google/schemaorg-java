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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link InteractionCounter}. */
public class InteractionCounterImpl extends StructuredValueImpl implements InteractionCounter {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INTERACTION_SERVICE);

    builder.add(CoreConstants.PROPERTY_INTERACTION_TYPE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_USER_INTERACTION_COUNT);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<InteractionCounter.Builder>
      implements InteractionCounter.Builder {

    @Override
    public InteractionCounter.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public InteractionCounter.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public InteractionCounter.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public InteractionCounter.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public InteractionCounter.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public InteractionCounter.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public InteractionCounter.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addInteractionService(SoftwareApplication value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_SERVICE, value);
    }

    @Override
    public InteractionCounter.Builder addInteractionService(SoftwareApplication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_SERVICE, value.build());
    }

    @Override
    public InteractionCounter.Builder addInteractionService(WebSite value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_SERVICE, value);
    }

    @Override
    public InteractionCounter.Builder addInteractionService(WebSite.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_SERVICE, value.build());
    }

    @Override
    public InteractionCounter.Builder addInteractionService(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_SERVICE, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addInteractionType(Action value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_TYPE, value);
    }

    @Override
    public InteractionCounter.Builder addInteractionType(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_TYPE, value.build());
    }

    @Override
    public InteractionCounter.Builder addInteractionType(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTION_TYPE, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public InteractionCounter.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public InteractionCounter.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public InteractionCounter.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public InteractionCounter.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public InteractionCounter.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public InteractionCounter.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public InteractionCounter.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public InteractionCounter.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addUserInteractionCount(Integer value) {
      return addProperty(CoreConstants.PROPERTY_USER_INTERACTION_COUNT, value);
    }

    @Override
    public InteractionCounter.Builder addUserInteractionCount(String value) {
      return addProperty(CoreConstants.PROPERTY_USER_INTERACTION_COUNT, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public InteractionCounter.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public InteractionCounter.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public InteractionCounter.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public InteractionCounter.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public InteractionCounter.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public InteractionCounter build() {
      return new InteractionCounterImpl(properties, reverseMap);
    }
  }

  public InteractionCounterImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_INTERACTION_COUNTER;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInteractionServiceList() {
    return getProperty(CoreConstants.PROPERTY_INTERACTION_SERVICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInteractionTypeList() {
    return getProperty(CoreConstants.PROPERTY_INTERACTION_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUserInteractionCountList() {
    return getProperty(CoreConstants.PROPERTY_USER_INTERACTION_COUNT);
  }
}
