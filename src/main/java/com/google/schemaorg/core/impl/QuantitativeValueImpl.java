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

/** Implementation of {@link QuantitativeValue}. */
public class QuantitativeValueImpl extends StructuredValueImpl implements QuantitativeValue {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MAX_VALUE);

    builder.add(CoreConstants.PROPERTY_MIN_VALUE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_UNIT_CODE);

    builder.add(CoreConstants.PROPERTY_UNIT_TEXT);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VALUE);

    builder.add(CoreConstants.PROPERTY_VALUE_REFERENCE);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<QuantitativeValue.Builder>
      implements QuantitativeValue.Builder {

    @Override
    public QuantitativeValue.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public QuantitativeValue.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public QuantitativeValue.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public QuantitativeValue.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public QuantitativeValue.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public QuantitativeValue.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public QuantitativeValue.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public QuantitativeValue.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public QuantitativeValue.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public QuantitativeValue.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public QuantitativeValue.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public QuantitativeValue.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addMaxValue(Number value) {
      return addProperty(CoreConstants.PROPERTY_MAX_VALUE, value);
    }

    @Override
    public QuantitativeValue.Builder addMaxValue(String value) {
      return addProperty(CoreConstants.PROPERTY_MAX_VALUE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addMinValue(Number value) {
      return addProperty(CoreConstants.PROPERTY_MIN_VALUE, value);
    }

    @Override
    public QuantitativeValue.Builder addMinValue(String value) {
      return addProperty(CoreConstants.PROPERTY_MIN_VALUE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public QuantitativeValue.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public QuantitativeValue.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public QuantitativeValue.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public QuantitativeValue.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addUnitCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, value);
    }

    @Override
    public QuantitativeValue.Builder addUnitCode(URL value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, value);
    }

    @Override
    public QuantitativeValue.Builder addUnitCode(String value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addUnitText(Text value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_TEXT, value);
    }

    @Override
    public QuantitativeValue.Builder addUnitText(String value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_TEXT, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public QuantitativeValue.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addValue(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public QuantitativeValue.Builder addValue(Number value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public QuantitativeValue.Builder addValue(StructuredValue value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public QuantitativeValue.Builder addValue(StructuredValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value.build());
    }

    @Override
    public QuantitativeValue.Builder addValue(Text value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, value);
    }

    @Override
    public QuantitativeValue.Builder addValue(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addValueReference(Enumeration value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value);
    }

    @Override
    public QuantitativeValue.Builder addValueReference(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value);
    }

    @Override
    public QuantitativeValue.Builder addValueReference(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value.build());
    }

    @Override
    public QuantitativeValue.Builder addValueReference(QualitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value);
    }

    @Override
    public QuantitativeValue.Builder addValueReference(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value);
    }

    @Override
    public QuantitativeValue.Builder addValueReference(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value.build());
    }

    @Override
    public QuantitativeValue.Builder addValueReference(StructuredValue value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value);
    }

    @Override
    public QuantitativeValue.Builder addValueReference(StructuredValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, value.build());
    }

    @Override
    public QuantitativeValue.Builder addValueReference(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_REFERENCE, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public QuantitativeValue.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public QuantitativeValue.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public QuantitativeValue.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public QuantitativeValue.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public QuantitativeValue.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public QuantitativeValue build() {
      return new QuantitativeValueImpl(properties, reverseMap);
    }
  }

  public QuantitativeValueImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_QUANTITATIVE_VALUE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAdditionalPropertyList() {
    return getProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY);
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
  public ImmutableList<SchemaOrgType> getUnitCodeList() {
    return getProperty(CoreConstants.PROPERTY_UNIT_CODE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUnitTextList() {
    return getProperty(CoreConstants.PROPERTY_UNIT_TEXT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValueList() {
    return getProperty(CoreConstants.PROPERTY_VALUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValueReferenceList() {
    return getProperty(CoreConstants.PROPERTY_VALUE_REFERENCE);
  }
}
