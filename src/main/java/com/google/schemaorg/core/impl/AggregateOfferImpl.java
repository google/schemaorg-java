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
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link AggregateOffer}. */
public class AggregateOfferImpl extends OfferImpl implements AggregateOffer {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADD_ON);

    builder.add(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AREA_SERVED);

    builder.add(CoreConstants.PROPERTY_AVAILABILITY);

    builder.add(CoreConstants.PROPERTY_AVAILABILITY_ENDS);

    builder.add(CoreConstants.PROPERTY_AVAILABILITY_STARTS);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD);

    builder.add(CoreConstants.PROPERTY_BUSINESS_FUNCTION);

    builder.add(CoreConstants.PROPERTY_CATEGORY);

    builder.add(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_DURATION);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_REGION);

    builder.add(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME);

    builder.add(CoreConstants.PROPERTY_GTIN12);

    builder.add(CoreConstants.PROPERTY_GTIN13);

    builder.add(CoreConstants.PROPERTY_GTIN14);

    builder.add(CoreConstants.PROPERTY_GTIN8);

    builder.add(CoreConstants.PROPERTY_HIGH_PRICE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INCLUDES_OBJECT);

    builder.add(CoreConstants.PROPERTY_INELIGIBLE_REGION);

    builder.add(CoreConstants.PROPERTY_INVENTORY_LEVEL);

    builder.add(CoreConstants.PROPERTY_ITEM_CONDITION);

    builder.add(CoreConstants.PROPERTY_ITEM_OFFERED);

    builder.add(CoreConstants.PROPERTY_LOW_PRICE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MPN);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OFFER_COUNT);

    builder.add(CoreConstants.PROPERTY_OFFERED_BY);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRICE);

    builder.add(CoreConstants.PROPERTY_PRICE_CURRENCY);

    builder.add(CoreConstants.PROPERTY_PRICE_SPECIFICATION);

    builder.add(CoreConstants.PROPERTY_PRICE_VALID_UNTIL);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_REVIEWS);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SELLER);

    builder.add(CoreConstants.PROPERTY_SERIAL_NUMBER);

    builder.add(CoreConstants.PROPERTY_SKU);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VALID_FROM);

    builder.add(CoreConstants.PROPERTY_VALID_THROUGH);

    builder.add(CoreConstants.PROPERTY_WARRANTY);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<AggregateOffer.Builder>
      implements AggregateOffer.Builder {

    @Override
    public AggregateOffer.Builder addAcceptedPaymentMethod(PaymentMethod value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD, value);
    }

    @Override
    public AggregateOffer.Builder addAcceptedPaymentMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public AggregateOffer.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAddOn(Offer value) {
      return addProperty(CoreConstants.PROPERTY_ADD_ON, value);
    }

    @Override
    public AggregateOffer.Builder addAddOn(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADD_ON, value.build());
    }

    @Override
    public AggregateOffer.Builder addAddOn(String value) {
      return addProperty(CoreConstants.PROPERTY_ADD_ON, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAdvanceBookingRequirement(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, value);
    }

    @Override
    public AggregateOffer.Builder addAdvanceBookingRequirement(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, value.build());
    }

    @Override
    public AggregateOffer.Builder addAdvanceBookingRequirement(String value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public AggregateOffer.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public AggregateOffer.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public AggregateOffer.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public AggregateOffer.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public AggregateOffer.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public AggregateOffer.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public AggregateOffer.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public AggregateOffer.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public AggregateOffer.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public AggregateOffer.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAvailability(ItemAvailability value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY, value);
    }

    @Override
    public AggregateOffer.Builder addAvailability(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAvailabilityEnds(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_ENDS, value);
    }

    @Override
    public AggregateOffer.Builder addAvailabilityEnds(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_ENDS, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAvailabilityStarts(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_STARTS, value);
    }

    @Override
    public AggregateOffer.Builder addAvailabilityStarts(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_STARTS, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAvailableAtOrFrom(Place value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, value);
    }

    @Override
    public AggregateOffer.Builder addAvailableAtOrFrom(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, value.build());
    }

    @Override
    public AggregateOffer.Builder addAvailableAtOrFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addAvailableDeliveryMethod(DeliveryMethod value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD, value);
    }

    @Override
    public AggregateOffer.Builder addAvailableDeliveryMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addBusinessFunction(BusinessFunction value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, value);
    }

    @Override
    public AggregateOffer.Builder addBusinessFunction(String value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public AggregateOffer.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public AggregateOffer.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public AggregateOffer.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public AggregateOffer.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addDeliveryLeadTime(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, value);
    }

    @Override
    public AggregateOffer.Builder addDeliveryLeadTime(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, value.build());
    }

    @Override
    public AggregateOffer.Builder addDeliveryLeadTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public AggregateOffer.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addEligibleCustomerType(BusinessEntityType value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE, value);
    }

    @Override
    public AggregateOffer.Builder addEligibleCustomerType(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addEligibleDuration(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, value);
    }

    @Override
    public AggregateOffer.Builder addEligibleDuration(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, value.build());
    }

    @Override
    public AggregateOffer.Builder addEligibleDuration(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addEligibleQuantity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value);
    }

    @Override
    public AggregateOffer.Builder addEligibleQuantity(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value.build());
    }

    @Override
    public AggregateOffer.Builder addEligibleQuantity(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addEligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public AggregateOffer.Builder addEligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public AggregateOffer.Builder addEligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public AggregateOffer.Builder addEligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public AggregateOffer.Builder addEligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public AggregateOffer.Builder addEligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addEligibleTransactionVolume(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value);
    }

    @Override
    public AggregateOffer.Builder addEligibleTransactionVolume(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value.build());
    }

    @Override
    public AggregateOffer.Builder addEligibleTransactionVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public AggregateOffer.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public AggregateOffer.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public AggregateOffer.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public AggregateOffer.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addHighPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_HIGH_PRICE, value);
    }

    @Override
    public AggregateOffer.Builder addHighPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_HIGH_PRICE, value);
    }

    @Override
    public AggregateOffer.Builder addHighPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_HIGH_PRICE, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public AggregateOffer.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public AggregateOffer.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public AggregateOffer.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addIncludesObject(TypeAndQuantityNode value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, value);
    }

    @Override
    public AggregateOffer.Builder addIncludesObject(TypeAndQuantityNode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, value.build());
    }

    @Override
    public AggregateOffer.Builder addIncludesObject(String value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addIneligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public AggregateOffer.Builder addIneligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public AggregateOffer.Builder addIneligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public AggregateOffer.Builder addIneligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public AggregateOffer.Builder addIneligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public AggregateOffer.Builder addIneligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addInventoryLevel(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value);
    }

    @Override
    public AggregateOffer.Builder addInventoryLevel(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value.build());
    }

    @Override
    public AggregateOffer.Builder addInventoryLevel(String value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public AggregateOffer.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addItemOffered(Product value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value);
    }

    @Override
    public AggregateOffer.Builder addItemOffered(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value.build());
    }

    @Override
    public AggregateOffer.Builder addItemOffered(Service value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value);
    }

    @Override
    public AggregateOffer.Builder addItemOffered(Service.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value.build());
    }

    @Override
    public AggregateOffer.Builder addItemOffered(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addLowPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_LOW_PRICE, value);
    }

    @Override
    public AggregateOffer.Builder addLowPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOW_PRICE, value);
    }

    @Override
    public AggregateOffer.Builder addLowPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_LOW_PRICE, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public AggregateOffer.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public AggregateOffer.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public AggregateOffer.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public AggregateOffer.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public AggregateOffer.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addOfferCount(Integer value) {
      return addProperty(CoreConstants.PROPERTY_OFFER_COUNT, value);
    }

    @Override
    public AggregateOffer.Builder addOfferCount(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFER_COUNT, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addOfferedBy(Organization value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value);
    }

    @Override
    public AggregateOffer.Builder addOfferedBy(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value.build());
    }

    @Override
    public AggregateOffer.Builder addOfferedBy(Person value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value);
    }

    @Override
    public AggregateOffer.Builder addOfferedBy(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value.build());
    }

    @Override
    public AggregateOffer.Builder addOfferedBy(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public AggregateOffer.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public AggregateOffer.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public AggregateOffer.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public AggregateOffer.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public AggregateOffer.Builder addPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public AggregateOffer.Builder addPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public AggregateOffer.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addPriceSpecification(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, value);
    }

    @Override
    public AggregateOffer.Builder addPriceSpecification(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, value.build());
    }

    @Override
    public AggregateOffer.Builder addPriceSpecification(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addPriceValidUntil(Date value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_VALID_UNTIL, value);
    }

    @Override
    public AggregateOffer.Builder addPriceValidUntil(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_VALID_UNTIL, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public AggregateOffer.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public AggregateOffer.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public AggregateOffer.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public AggregateOffer.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public AggregateOffer.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addSeller(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public AggregateOffer.Builder addSeller(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public AggregateOffer.Builder addSeller(Person value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public AggregateOffer.Builder addSeller(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public AggregateOffer.Builder addSeller(String value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addSerialNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_SERIAL_NUMBER, value);
    }

    @Override
    public AggregateOffer.Builder addSerialNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_SERIAL_NUMBER, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public AggregateOffer.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public AggregateOffer.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addValidFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, value);
    }

    @Override
    public AggregateOffer.Builder addValidFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addValidThrough(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, value);
    }

    @Override
    public AggregateOffer.Builder addValidThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addWarranty(WarrantyPromise value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, value);
    }

    @Override
    public AggregateOffer.Builder addWarranty(WarrantyPromise.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, value.build());
    }

    @Override
    public AggregateOffer.Builder addWarranty(String value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public AggregateOffer.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public AggregateOffer.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public AggregateOffer.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public AggregateOffer.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public AggregateOffer.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public AggregateOffer build() {
      return new AggregateOfferImpl(properties, reverseMap);
    }
  }

  public AggregateOfferImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_AGGREGATE_OFFER;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHighPriceList() {
    return getProperty(CoreConstants.PROPERTY_HIGH_PRICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLowPriceList() {
    return getProperty(CoreConstants.PROPERTY_LOW_PRICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOfferCountList() {
    return getProperty(CoreConstants.PROPERTY_OFFER_COUNT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOffersList() {
    return getProperty(CoreConstants.PROPERTY_OFFERS);
  }
}
