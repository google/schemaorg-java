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

/** Implementation of {@link PaymentChargeSpecification}. */
public class PaymentChargeSpecificationImpl extends PriceSpecificationImpl
    implements PaymentChargeSpecification {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_APPLIES_TO_DELIVERY_METHOD);

    builder.add(CoreConstants.PROPERTY_APPLIES_TO_PAYMENT_METHOD);

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

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VALID_FROM);

    builder.add(CoreConstants.PROPERTY_VALID_THROUGH);

    builder.add(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl
      extends SchemaOrgTypeImpl.BuilderImpl<PaymentChargeSpecification.Builder>
      implements PaymentChargeSpecification.Builder {

    @Override
    public PaymentChargeSpecification.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addAppliesToDeliveryMethod(DeliveryMethod value) {
      return addProperty(CoreConstants.PROPERTY_APPLIES_TO_DELIVERY_METHOD, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addAppliesToDeliveryMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLIES_TO_DELIVERY_METHOD, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addAppliesToPaymentMethod(PaymentMethod value) {
      return addProperty(CoreConstants.PROPERTY_APPLIES_TO_PAYMENT_METHOD, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addAppliesToPaymentMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLIES_TO_PAYMENT_METHOD, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addEligibleQuantity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addEligibleQuantity(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value.build());
    }

    @Override
    public PaymentChargeSpecification.Builder addEligibleQuantity(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addEligibleTransactionVolume(
        PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addEligibleTransactionVolume(
        PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value.build());
    }

    @Override
    public PaymentChargeSpecification.Builder addEligibleTransactionVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public PaymentChargeSpecification.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public PaymentChargeSpecification.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addMaxPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_MAX_PRICE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addMaxPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_MAX_PRICE, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addMinPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_MIN_PRICE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addMinPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_MIN_PRICE, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public PaymentChargeSpecification.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addValidFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addValidFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addValidThrough(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addValidThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addValueAddedTaxIncluded(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addValueAddedTaxIncluded(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public PaymentChargeSpecification.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification.Builder addPopularityScore(
        PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public PaymentChargeSpecification.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public PaymentChargeSpecification.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public PaymentChargeSpecification build() {
      return new PaymentChargeSpecificationImpl(properties, reverseMap);
    }
  }

  public PaymentChargeSpecificationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PAYMENT_CHARGE_SPECIFICATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAppliesToDeliveryMethodList() {
    return getProperty(CoreConstants.PROPERTY_APPLIES_TO_DELIVERY_METHOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAppliesToPaymentMethodList() {
    return getProperty(CoreConstants.PROPERTY_APPLIES_TO_PAYMENT_METHOD);
  }
}
