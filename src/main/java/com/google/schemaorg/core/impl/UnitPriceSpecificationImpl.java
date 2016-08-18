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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link UnitPriceSpecification}. */
public class UnitPriceSpecificationImpl extends PriceSpecificationImpl
    implements UnitPriceSpecification {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BILLING_INCREMENT);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MAX_PRICE);

    builder.add(CoreConstants.PROPERTY_MIN_PRICE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRICE);

    builder.add(CoreConstants.PROPERTY_PRICE_CURRENCY);

    builder.add(CoreConstants.PROPERTY_PRICE_TYPE);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_UNIT_CODE);

    builder.add(CoreConstants.PROPERTY_UNIT_TEXT);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VALID_FROM);

    builder.add(CoreConstants.PROPERTY_VALID_THROUGH);

    builder.add(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl
      extends SchemaOrgTypeImpl.BuilderImpl<UnitPriceSpecification.Builder>
      implements UnitPriceSpecification.Builder {

    @Override
    public UnitPriceSpecification.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public UnitPriceSpecification.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addBillingIncrement(Number value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_INCREMENT, value);
    }

    @Override
    public UnitPriceSpecification.Builder addBillingIncrement(String value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_INCREMENT, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public UnitPriceSpecification.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addEligibleQuantity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value);
    }

    @Override
    public UnitPriceSpecification.Builder addEligibleQuantity(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value.build());
    }

    @Override
    public UnitPriceSpecification.Builder addEligibleQuantity(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addEligibleTransactionVolume(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value);
    }

    @Override
    public UnitPriceSpecification.Builder addEligibleTransactionVolume(
        PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value.build());
    }

    @Override
    public UnitPriceSpecification.Builder addEligibleTransactionVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public UnitPriceSpecification.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public UnitPriceSpecification.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addMaxPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_MAX_PRICE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addMaxPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_MAX_PRICE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addMinPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_MIN_PRICE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addMinPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_MIN_PRICE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public UnitPriceSpecification.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public UnitPriceSpecification.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public UnitPriceSpecification.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public UnitPriceSpecification.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addPriceType(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_TYPE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addPriceType(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_TYPE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public UnitPriceSpecification.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addUnitCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addUnitCode(URL value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addUnitCode(String value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_CODE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addUnitText(Text value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_TEXT, value);
    }

    @Override
    public UnitPriceSpecification.Builder addUnitText(String value) {
      return addProperty(CoreConstants.PROPERTY_UNIT_TEXT, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public UnitPriceSpecification.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addValidFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, value);
    }

    @Override
    public UnitPriceSpecification.Builder addValidFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addValidThrough(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, value);
    }

    @Override
    public UnitPriceSpecification.Builder addValidThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addValueAddedTaxIncluded(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED, value);
    }

    @Override
    public UnitPriceSpecification.Builder addValueAddedTaxIncluded(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public UnitPriceSpecification.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public UnitPriceSpecification.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public UnitPriceSpecification.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public UnitPriceSpecification.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public UnitPriceSpecification.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public UnitPriceSpecification build() {
      return new UnitPriceSpecificationImpl(properties, reverseMap);
    }
  }

  public UnitPriceSpecificationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_UNIT_PRICE_SPECIFICATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBillingIncrementList() {
    return getProperty(CoreConstants.PROPERTY_BILLING_INCREMENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPriceTypeList() {
    return getProperty(CoreConstants.PROPERTY_PRICE_TYPE);
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
