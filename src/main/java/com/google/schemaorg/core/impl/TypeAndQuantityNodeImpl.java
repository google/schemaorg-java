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

/** Implementation of {@link TypeAndQuantityNode}. */
public class TypeAndQuantityNodeImpl extends StructuredValueImpl implements TypeAndQuantityNode {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AMOUNT_OF_THIS_GOOD);

    builder.add(CoreConstants.PROPERTY_BUSINESS_FUNCTION);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_TYPE_OF_GOOD);

    builder.add(CoreConstants.PROPERTY_UNIT_CODE);

    builder.add(CoreConstants.PROPERTY_UNIT_TEXT);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<TypeAndQuantityNode.Builder>
      implements TypeAndQuantityNode.Builder {

    @Override
    public TypeAndQuantityNode.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addAmountOfThisGood(Number value) {
      return addProperty(CoreConstants.PROPERTY_AMOUNT_OF_THIS_GOOD, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addAmountOfThisGood(String value) {
      return addProperty(CoreConstants.PROPERTY_AMOUNT_OF_THIS_GOOD, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addBusinessFunction(BusinessFunction value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addBusinessFunction(String value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public TypeAndQuantityNode.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public TypeAndQuantityNode.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public TypeAndQuantityNode.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addTypeOfGood(Product value) {
      return addProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addTypeOfGood(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD, value.build());
    }

    @Override
    public TypeAndQuantityNode.Builder addTypeOfGood(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addUnitCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addUnitCode(URL value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addUnitCode(String value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addUnitText(Text value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_TEXT, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addUnitText(String value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_TEXT, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public TypeAndQuantityNode.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public TypeAndQuantityNode.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public TypeAndQuantityNode.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public TypeAndQuantityNode build() {
      return new TypeAndQuantityNodeImpl(properties, reverseMap);
    }
  }

  public TypeAndQuantityNodeImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_TYPE_AND_QUANTITY_NODE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAmountOfThisGoodList() {
    return getProperty(CoreConstants.PROPERTY_AMOUNT_OF_THIS_GOOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBusinessFunctionList() {
    return getProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTypeOfGoodList() {
    return getProperty(CoreConstants.PROPERTY_TYPE_OF_GOOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUnitCodeList() {
    return getProperty(CoreConstants.PROPERTY_UNIT_CODE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUnitTextList() {
    return getProperty(CoreConstants.PROPERTY_UNIT_TEXT);
  }
}
