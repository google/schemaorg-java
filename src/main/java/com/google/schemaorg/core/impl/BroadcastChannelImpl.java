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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link BroadcastChannel}. */
public class BroadcastChannelImpl extends IntangibleImpl implements BroadcastChannel {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BROADCAST_CHANNEL_ID);

    builder.add(CoreConstants.PROPERTY_BROADCAST_SERVICE_TIER);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IN_BROADCAST_LINEUP);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROVIDES_BROADCAST_SERVICE);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<BroadcastChannel.Builder>
      implements BroadcastChannel.Builder {

    @Override
    public BroadcastChannel.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public BroadcastChannel.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public BroadcastChannel.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addBroadcastChannelId(Text value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_CHANNEL_ID, value);
    }

    @Override
    public BroadcastChannel.Builder addBroadcastChannelId(String value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_CHANNEL_ID, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addBroadcastServiceTier(Text value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_SERVICE_TIER, value);
    }

    @Override
    public BroadcastChannel.Builder addBroadcastServiceTier(String value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_SERVICE_TIER, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public BroadcastChannel.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public BroadcastChannel.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public BroadcastChannel.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public BroadcastChannel.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addInBroadcastLineup(CableOrSatelliteService value) {
      return addProperty(CoreConstants.PROPERTY_IN_BROADCAST_LINEUP, value);
    }

    @Override
    public BroadcastChannel.Builder addInBroadcastLineup(CableOrSatelliteService.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IN_BROADCAST_LINEUP, value.build());
    }

    @Override
    public BroadcastChannel.Builder addInBroadcastLineup(String value) {
      return addProperty(CoreConstants.PROPERTY_IN_BROADCAST_LINEUP, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public BroadcastChannel.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public BroadcastChannel.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public BroadcastChannel.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public BroadcastChannel.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public BroadcastChannel.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public BroadcastChannel.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addProvidesBroadcastService(BroadcastService value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDES_BROADCAST_SERVICE, value);
    }

    @Override
    public BroadcastChannel.Builder addProvidesBroadcastService(BroadcastService.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDES_BROADCAST_SERVICE, value.build());
    }

    @Override
    public BroadcastChannel.Builder addProvidesBroadcastService(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDES_BROADCAST_SERVICE, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public BroadcastChannel.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public BroadcastChannel.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public BroadcastChannel.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public BroadcastChannel.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public BroadcastChannel.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public BroadcastChannel.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public BroadcastChannel.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public BroadcastChannel build() {
      return new BroadcastChannelImpl(properties, reverseMap);
    }
  }

  public BroadcastChannelImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_BROADCAST_CHANNEL;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBroadcastChannelIdList() {
    return getProperty(CoreConstants.PROPERTY_BROADCAST_CHANNEL_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBroadcastServiceTierList() {
    return getProperty(CoreConstants.PROPERTY_BROADCAST_SERVICE_TIER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInBroadcastLineupList() {
    return getProperty(CoreConstants.PROPERTY_IN_BROADCAST_LINEUP);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProvidesBroadcastServiceList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDES_BROADCAST_SERVICE);
  }
}
