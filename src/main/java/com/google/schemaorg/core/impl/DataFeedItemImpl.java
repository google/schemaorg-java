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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link DataFeedItem}. */
public class DataFeedItemImpl extends IntangibleImpl implements DataFeedItem {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DATE_CREATED);

    builder.add(CoreConstants.PROPERTY_DATE_DELETED);

    builder.add(CoreConstants.PROPERTY_DATE_MODIFIED);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ITEM);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<DataFeedItem.Builder>
      implements DataFeedItem.Builder {

    @Override
    public DataFeedItem.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public DataFeedItem.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public DataFeedItem.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addDateCreated(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public DataFeedItem.Builder addDateCreated(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, value);
    }

    @Override
    public DataFeedItem.Builder addDateCreated(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_CREATED, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addDateDeleted(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_DELETED, value);
    }

    @Override
    public DataFeedItem.Builder addDateDeleted(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_DELETED, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addDateModified(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public DataFeedItem.Builder addDateModified(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, value);
    }

    @Override
    public DataFeedItem.Builder addDateModified(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_MODIFIED, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public DataFeedItem.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DataFeedItem.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public DataFeedItem.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DataFeedItem.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addItem(Thing value) {
      return addProperty(CoreConstants.PROPERTY_ITEM, value);
    }

    @Override
    public DataFeedItem.Builder addItem(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM, value.build());
    }

    @Override
    public DataFeedItem.Builder addItem(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DataFeedItem.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public DataFeedItem.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DataFeedItem.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public DataFeedItem.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public DataFeedItem.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public DataFeedItem.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public DataFeedItem.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public DataFeedItem.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public DataFeedItem.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public DataFeedItem.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public DataFeedItem.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public DataFeedItem.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public DataFeedItem.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public DataFeedItem build() {
      return new DataFeedItemImpl(properties, reverseMap);
    }
  }

  public DataFeedItemImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_DATA_FEED_ITEM;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDateCreatedList() {
    return getProperty(CoreConstants.PROPERTY_DATE_CREATED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDateDeletedList() {
    return getProperty(CoreConstants.PROPERTY_DATE_DELETED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDateModifiedList() {
    return getProperty(CoreConstants.PROPERTY_DATE_MODIFIED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getItemList() {
    return getProperty(CoreConstants.PROPERTY_ITEM);
  }
}
