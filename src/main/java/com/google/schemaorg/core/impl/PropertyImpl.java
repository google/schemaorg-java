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

/** Implementation of {@link Property}. */
public class PropertyImpl extends IntangibleImpl implements Property {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DOMAIN_INCLUDES);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INVERSE_OF);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RANGE_INCLUDES);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SUPERSEDED_BY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Property.Builder>
      implements Property.Builder {

    @Override
    public Property.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Property.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Property.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Property.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Property.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Property.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Property.Builder addDomainIncludes(Class value) {
      return addProperty(CoreConstants.PROPERTY_DOMAIN_INCLUDES, value);
    }

    @Override
    public Property.Builder addDomainIncludes(Class.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DOMAIN_INCLUDES, value.build());
    }

    @Override
    public Property.Builder addDomainIncludes(String value) {
      return addProperty(CoreConstants.PROPERTY_DOMAIN_INCLUDES, Text.of(value));
    }

    @Override
    public Property.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Property.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Property.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Property.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Property.Builder addInverseOf(Property value) {
      return addProperty(CoreConstants.PROPERTY_INVERSE_OF, value);
    }

    @Override
    public Property.Builder addInverseOf(Property.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INVERSE_OF, value.build());
    }

    @Override
    public Property.Builder addInverseOf(String value) {
      return addProperty(CoreConstants.PROPERTY_INVERSE_OF, Text.of(value));
    }

    @Override
    public Property.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Property.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Property.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Property.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Property.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Property.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Property.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Property.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Property.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Property.Builder addRangeIncludes(Class value) {
      return addProperty(CoreConstants.PROPERTY_RANGE_INCLUDES, value);
    }

    @Override
    public Property.Builder addRangeIncludes(Class.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RANGE_INCLUDES, value.build());
    }

    @Override
    public Property.Builder addRangeIncludes(String value) {
      return addProperty(CoreConstants.PROPERTY_RANGE_INCLUDES, Text.of(value));
    }

    @Override
    public Property.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Property.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Property.Builder addSupersededBy(Class value) {
      return addProperty(CoreConstants.PROPERTY_SUPERSEDED_BY, value);
    }

    @Override
    public Property.Builder addSupersededBy(Class.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUPERSEDED_BY, value.build());
    }

    @Override
    public Property.Builder addSupersededBy(Enumeration value) {
      return addProperty(CoreConstants.PROPERTY_SUPERSEDED_BY, value);
    }

    @Override
    public Property.Builder addSupersededBy(Property value) {
      return addProperty(CoreConstants.PROPERTY_SUPERSEDED_BY, value);
    }

    @Override
    public Property.Builder addSupersededBy(Property.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUPERSEDED_BY, value.build());
    }

    @Override
    public Property.Builder addSupersededBy(String value) {
      return addProperty(CoreConstants.PROPERTY_SUPERSEDED_BY, Text.of(value));
    }

    @Override
    public Property.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Property.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Property.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Property.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Property.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Property.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Property.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Property.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Property build() {
      return new PropertyImpl(properties, reverseMap);
    }
  }

  public PropertyImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PROPERTY;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDomainIncludesList() {
    return getProperty(CoreConstants.PROPERTY_DOMAIN_INCLUDES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInverseOfList() {
    return getProperty(CoreConstants.PROPERTY_INVERSE_OF);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRangeIncludesList() {
    return getProperty(CoreConstants.PROPERTY_RANGE_INCLUDES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSupersededByList() {
    return getProperty(CoreConstants.PROPERTY_SUPERSEDED_BY);
  }
}
