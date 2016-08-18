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
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link OwnershipInfo}. */
public class OwnershipInfoImpl extends StructuredValueImpl implements OwnershipInfo {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACQUIRED_FROM);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OWNED_FROM);

    builder.add(CoreConstants.PROPERTY_OWNED_THROUGH);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_TYPE_OF_GOOD);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<OwnershipInfo.Builder>
      implements OwnershipInfo.Builder {

    @Override
    public OwnershipInfo.Builder addAcquiredFrom(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ACQUIRED_FROM, value);
    }

    @Override
    public OwnershipInfo.Builder addAcquiredFrom(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACQUIRED_FROM, value.build());
    }

    @Override
    public OwnershipInfo.Builder addAcquiredFrom(Person value) {
      return addProperty(CoreConstants.PROPERTY_ACQUIRED_FROM, value);
    }

    @Override
    public OwnershipInfo.Builder addAcquiredFrom(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACQUIRED_FROM, value.build());
    }

    @Override
    public OwnershipInfo.Builder addAcquiredFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_ACQUIRED_FROM, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public OwnershipInfo.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public OwnershipInfo.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public OwnershipInfo.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public OwnershipInfo.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public OwnershipInfo.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public OwnershipInfo.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public OwnershipInfo.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public OwnershipInfo.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public OwnershipInfo.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public OwnershipInfo.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addOwnedFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_OWNED_FROM, value);
    }

    @Override
    public OwnershipInfo.Builder addOwnedFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_OWNED_FROM, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addOwnedThrough(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_OWNED_THROUGH, value);
    }

    @Override
    public OwnershipInfo.Builder addOwnedThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_OWNED_THROUGH, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public OwnershipInfo.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public OwnershipInfo.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public OwnershipInfo.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addTypeOfGood(Product value) {
      return addProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD, value);
    }

    @Override
    public OwnershipInfo.Builder addTypeOfGood(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD, value.build());
    }

    @Override
    public OwnershipInfo.Builder addTypeOfGood(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public OwnershipInfo.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public OwnershipInfo.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public OwnershipInfo.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public OwnershipInfo.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public OwnershipInfo.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public OwnershipInfo.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public OwnershipInfo build() {
      return new OwnershipInfoImpl(properties, reverseMap);
    }
  }

  public OwnershipInfoImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_OWNERSHIP_INFO;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAcquiredFromList() {
    return getProperty(CoreConstants.PROPERTY_ACQUIRED_FROM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOwnedFromList() {
    return getProperty(CoreConstants.PROPERTY_OWNED_FROM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOwnedThroughList() {
    return getProperty(CoreConstants.PROPERTY_OWNED_THROUGH);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTypeOfGoodList() {
    return getProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD);
  }
}
