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

/** Implementation of {@link DeliveryChargeSpecification}. */
public class DeliveryChargeSpecificationImpl extends PriceSpecificationImpl
    implements DeliveryChargeSpecification {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_APPLIES_TO_DELIVERY_METHOD);

    builder.add(CoreConstants.PROPERTY_AREA_SERVED);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_REGION);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INELIGIBLE_REGION);

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
      extends SchemaOrgTypeImpl.BuilderImpl<DeliveryChargeSpecification.Builder>
      implements DeliveryChargeSpecification.Builder {

    @Override
    public DeliveryChargeSpecification.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addAppliesToDeliveryMethod(DeliveryMethod value) {
      return addProperty(CoreConstants.PROPERTY_APPLIES_TO_DELIVERY_METHOD, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addAppliesToDeliveryMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLIES_TO_DELIVERY_METHOD, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleQuantity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleQuantity(
        QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleQuantity(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleTransactionVolume(
        PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleTransactionVolume(
        PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addEligibleTransactionVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addIneligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addIneligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addIneligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addIneligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addIneligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addIneligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addMaxPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_MAX_PRICE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addMaxPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_MAX_PRICE, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addMinPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_MIN_PRICE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addMinPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_MIN_PRICE, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addValidFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addValidFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addValidThrough(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addValidThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addValueAddedTaxIncluded(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addValueAddedTaxIncluded(String value) {
      return addProperty(CoreConstants.PROPERTY_VALUE_ADDED_TAX_INCLUDED, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification.Builder addPopularityScore(
        PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public DeliveryChargeSpecification.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public DeliveryChargeSpecification.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public DeliveryChargeSpecification build() {
      return new DeliveryChargeSpecificationImpl(properties, reverseMap);
    }
  }

  public DeliveryChargeSpecificationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_DELIVERY_CHARGE_SPECIFICATION;
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
  public ImmutableList<SchemaOrgType> getAreaServedList() {
    return getProperty(CoreConstants.PROPERTY_AREA_SERVED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEligibleRegionList() {
    return getProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIneligibleRegionList() {
    return getProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION);
  }
}
