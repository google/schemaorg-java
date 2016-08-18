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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link PropertyValueSpecification}. */
public class PropertyValueSpecificationImpl extends IntangibleImpl
    implements PropertyValueSpecification {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DEFAULT_VALUE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MAX_VALUE);

    builder.add(CoreConstants.PROPERTY_MIN_VALUE);

    builder.add(CoreConstants.PROPERTY_MULTIPLE_VALUES);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_READONLY_VALUE);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_STEP_VALUE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VALUE_MAX_LENGTH);

    builder.add(CoreConstants.PROPERTY_VALUE_MIN_LENGTH);

    builder.add(CoreConstants.PROPERTY_VALUE_NAME);

    builder.add(CoreConstants.PROPERTY_VALUE_PATTERN);

    builder.add(CoreConstants.PROPERTY_VALUE_REQUIRED);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl
      extends SchemaOrgTypeImpl.BuilderImpl<PropertyValueSpecification.Builder>
      implements PropertyValueSpecification.Builder {

    @Override
    public PropertyValueSpecification.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public PropertyValueSpecification.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addDefaultValue(Text value) {
      return addProperty(CoreConstants.PROPERTY_DEFAULT_VALUE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addDefaultValue(Thing value) {
      return addProperty(CoreConstants.PROPERTY_DEFAULT_VALUE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addDefaultValue(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEFAULT_VALUE, value.build());
    }

    @Override
    public PropertyValueSpecification.Builder addDefaultValue(String value) {
      return addProperty(CoreConstants.PROPERTY_DEFAULT_VALUE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public PropertyValueSpecification.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public PropertyValueSpecification.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public PropertyValueSpecification.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addMaxValue(Number value) {
      return addProperty(CoreConstants.PROPERTY_MAX_VALUE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addMaxValue(String value) {
      return addProperty(CoreConstants.PROPERTY_MAX_VALUE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addMinValue(Number value) {
      return addProperty(CoreConstants.PROPERTY_MIN_VALUE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addMinValue(String value) {
      return addProperty(CoreConstants.PROPERTY_MIN_VALUE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addMultipleValues(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_MULTIPLE_VALUES, value);
    }

    @Override
    public PropertyValueSpecification.Builder addMultipleValues(String value) {
      return addProperty(CoreConstants.PROPERTY_MULTIPLE_VALUES, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public PropertyValueSpecification.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public PropertyValueSpecification.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public PropertyValueSpecification.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addReadonlyValue(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_READONLY_VALUE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addReadonlyValue(String value) {
      return addProperty(CoreConstants.PROPERTY_READONLY_VALUE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public PropertyValueSpecification.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addStepValue(Number value) {
      return addProperty(CoreConstants.PROPERTY_STEP_VALUE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addStepValue(String value) {
      return addProperty(CoreConstants.PROPERTY_STEP_VALUE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public PropertyValueSpecification.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addValueMaxLength(Number value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_MAX_LENGTH, value);
    }

    @Override
    public PropertyValueSpecification.Builder addValueMaxLength(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_MAX_LENGTH, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addValueMinLength(Number value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_MIN_LENGTH, value);
    }

    @Override
    public PropertyValueSpecification.Builder addValueMinLength(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_MIN_LENGTH, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addValueName(Text value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_NAME, value);
    }

    @Override
    public PropertyValueSpecification.Builder addValueName(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_NAME, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addValuePattern(Text value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_PATTERN, value);
    }

    @Override
    public PropertyValueSpecification.Builder addValuePattern(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_PATTERN, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addValueRequired(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REQUIRED, value);
    }

    @Override
    public PropertyValueSpecification.Builder addValueRequired(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REQUIRED, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public PropertyValueSpecification.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public PropertyValueSpecification.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public PropertyValueSpecification.Builder addPopularityScore(
        PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public PropertyValueSpecification.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public PropertyValueSpecification.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public PropertyValueSpecification build() {
      return new PropertyValueSpecificationImpl(properties, reverseMap);
    }
  }

  public PropertyValueSpecificationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PROPERTY_VALUE_SPECIFICATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDefaultValueList() {
    return getProperty(CoreConstants.PROPERTY_DEFAULT_VALUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMaxValueList() {
    return getProperty(CoreConstants.PROPERTY_MAX_VALUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMinValueList() {
    return getProperty(CoreConstants.PROPERTY_MIN_VALUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMultipleValuesList() {
    return getProperty(CoreConstants.PROPERTY_MULTIPLE_VALUES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReadonlyValueList() {
    return getProperty(CoreConstants.PROPERTY_READONLY_VALUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getStepValueList() {
    return getProperty(CoreConstants.PROPERTY_STEP_VALUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValueMaxLengthList() {
    return getProperty(CoreConstants.PROPERTY_VALUE_MAX_LENGTH);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValueMinLengthList() {
    return getProperty(CoreConstants.PROPERTY_VALUE_MIN_LENGTH);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValueNameList() {
    return getProperty(CoreConstants.PROPERTY_VALUE_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValuePatternList() {
    return getProperty(CoreConstants.PROPERTY_VALUE_PATTERN);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValueRequiredList() {
    return getProperty(CoreConstants.PROPERTY_VALUE_REQUIRED);
  }
}
