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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Offer}. */
public class OfferImpl extends IntangibleImpl implements Offer {
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

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INCLUDES_OBJECT);

    builder.add(CoreConstants.PROPERTY_INELIGIBLE_REGION);

    builder.add(CoreConstants.PROPERTY_INVENTORY_LEVEL);

    builder.add(CoreConstants.PROPERTY_ITEM_CONDITION);

    builder.add(CoreConstants.PROPERTY_ITEM_OFFERED);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MPN);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OFFERED_BY);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Offer.Builder>
      implements Offer.Builder {

    @Override
    public Offer.Builder addAcceptedPaymentMethod(PaymentMethod value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD, value);
    }

    @Override
    public Offer.Builder addAcceptedPaymentMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD, Text.of(value));
    }

    @Override
    public Offer.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Offer.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Offer.Builder addAddOn(Offer value) {
      return addProperty(CoreConstants.PROPERTY_ADD_ON, value);
    }

    @Override
    public Offer.Builder addAddOn(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADD_ON, value.build());
    }

    @Override
    public Offer.Builder addAddOn(String value) {
      return addProperty(CoreConstants.PROPERTY_ADD_ON, Text.of(value));
    }

    @Override
    public Offer.Builder addAdvanceBookingRequirement(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, value);
    }

    @Override
    public Offer.Builder addAdvanceBookingRequirement(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, value.build());
    }

    @Override
    public Offer.Builder addAdvanceBookingRequirement(String value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, Text.of(value));
    }

    @Override
    public Offer.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public Offer.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public Offer.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public Offer.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Offer.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Offer.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Offer.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Offer.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Offer.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Offer.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Offer.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Offer.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Offer.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public Offer.Builder addAvailability(ItemAvailability value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY, value);
    }

    @Override
    public Offer.Builder addAvailability(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY, Text.of(value));
    }

    @Override
    public Offer.Builder addAvailabilityEnds(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_ENDS, value);
    }

    @Override
    public Offer.Builder addAvailabilityEnds(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_ENDS, Text.of(value));
    }

    @Override
    public Offer.Builder addAvailabilityStarts(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_STARTS, value);
    }

    @Override
    public Offer.Builder addAvailabilityStarts(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_STARTS, Text.of(value));
    }

    @Override
    public Offer.Builder addAvailableAtOrFrom(Place value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, value);
    }

    @Override
    public Offer.Builder addAvailableAtOrFrom(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, value.build());
    }

    @Override
    public Offer.Builder addAvailableAtOrFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, Text.of(value));
    }

    @Override
    public Offer.Builder addAvailableDeliveryMethod(DeliveryMethod value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD, value);
    }

    @Override
    public Offer.Builder addAvailableDeliveryMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD, Text.of(value));
    }

    @Override
    public Offer.Builder addBusinessFunction(BusinessFunction value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, value);
    }

    @Override
    public Offer.Builder addBusinessFunction(String value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, Text.of(value));
    }

    @Override
    public Offer.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Offer.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Offer.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Offer.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public Offer.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public Offer.Builder addDeliveryLeadTime(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, value);
    }

    @Override
    public Offer.Builder addDeliveryLeadTime(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, value.build());
    }

    @Override
    public Offer.Builder addDeliveryLeadTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, Text.of(value));
    }

    @Override
    public Offer.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Offer.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Offer.Builder addEligibleCustomerType(BusinessEntityType value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE, value);
    }

    @Override
    public Offer.Builder addEligibleCustomerType(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE, Text.of(value));
    }

    @Override
    public Offer.Builder addEligibleDuration(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, value);
    }

    @Override
    public Offer.Builder addEligibleDuration(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, value.build());
    }

    @Override
    public Offer.Builder addEligibleDuration(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, Text.of(value));
    }

    @Override
    public Offer.Builder addEligibleQuantity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value);
    }

    @Override
    public Offer.Builder addEligibleQuantity(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value.build());
    }

    @Override
    public Offer.Builder addEligibleQuantity(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, Text.of(value));
    }

    @Override
    public Offer.Builder addEligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public Offer.Builder addEligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public Offer.Builder addEligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public Offer.Builder addEligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public Offer.Builder addEligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public Offer.Builder addEligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public Offer.Builder addEligibleTransactionVolume(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value);
    }

    @Override
    public Offer.Builder addEligibleTransactionVolume(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value.build());
    }

    @Override
    public Offer.Builder addEligibleTransactionVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, Text.of(value));
    }

    @Override
    public Offer.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public Offer.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public Offer.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public Offer.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public Offer.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public Offer.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public Offer.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public Offer.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public Offer.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Offer.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Offer.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Offer.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Offer.Builder addIncludesObject(TypeAndQuantityNode value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, value);
    }

    @Override
    public Offer.Builder addIncludesObject(TypeAndQuantityNode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, value.build());
    }

    @Override
    public Offer.Builder addIncludesObject(String value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, Text.of(value));
    }

    @Override
    public Offer.Builder addIneligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public Offer.Builder addIneligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public Offer.Builder addIneligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public Offer.Builder addIneligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public Offer.Builder addIneligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public Offer.Builder addIneligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public Offer.Builder addInventoryLevel(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value);
    }

    @Override
    public Offer.Builder addInventoryLevel(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value.build());
    }

    @Override
    public Offer.Builder addInventoryLevel(String value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, Text.of(value));
    }

    @Override
    public Offer.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public Offer.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public Offer.Builder addItemOffered(Product value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value);
    }

    @Override
    public Offer.Builder addItemOffered(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value.build());
    }

    @Override
    public Offer.Builder addItemOffered(Service value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value);
    }

    @Override
    public Offer.Builder addItemOffered(Service.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value.build());
    }

    @Override
    public Offer.Builder addItemOffered(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, Text.of(value));
    }

    @Override
    public Offer.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Offer.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Offer.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Offer.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Offer.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public Offer.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public Offer.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Offer.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Offer.Builder addOfferedBy(Organization value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value);
    }

    @Override
    public Offer.Builder addOfferedBy(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value.build());
    }

    @Override
    public Offer.Builder addOfferedBy(Person value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value);
    }

    @Override
    public Offer.Builder addOfferedBy(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, value.build());
    }

    @Override
    public Offer.Builder addOfferedBy(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERED_BY, Text.of(value));
    }

    @Override
    public Offer.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Offer.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Offer.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Offer.Builder addPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public Offer.Builder addPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, value);
    }

    @Override
    public Offer.Builder addPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE, Text.of(value));
    }

    @Override
    public Offer.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public Offer.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public Offer.Builder addPriceSpecification(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, value);
    }

    @Override
    public Offer.Builder addPriceSpecification(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, value.build());
    }

    @Override
    public Offer.Builder addPriceSpecification(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, Text.of(value));
    }

    @Override
    public Offer.Builder addPriceValidUntil(Date value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_VALID_UNTIL, value);
    }

    @Override
    public Offer.Builder addPriceValidUntil(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_VALID_UNTIL, Text.of(value));
    }

    @Override
    public Offer.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public Offer.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public Offer.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public Offer.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public Offer.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public Offer.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public Offer.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Offer.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Offer.Builder addSeller(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Offer.Builder addSeller(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Offer.Builder addSeller(Person value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Offer.Builder addSeller(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Offer.Builder addSeller(String value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, Text.of(value));
    }

    @Override
    public Offer.Builder addSerialNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_SERIAL_NUMBER, value);
    }

    @Override
    public Offer.Builder addSerialNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_SERIAL_NUMBER, Text.of(value));
    }

    @Override
    public Offer.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public Offer.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public Offer.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Offer.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Offer.Builder addValidFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, value);
    }

    @Override
    public Offer.Builder addValidFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, Text.of(value));
    }

    @Override
    public Offer.Builder addValidThrough(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, value);
    }

    @Override
    public Offer.Builder addValidThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, Text.of(value));
    }

    @Override
    public Offer.Builder addWarranty(WarrantyPromise value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, value);
    }

    @Override
    public Offer.Builder addWarranty(WarrantyPromise.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, value.build());
    }

    @Override
    public Offer.Builder addWarranty(String value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, Text.of(value));
    }

    @Override
    public Offer.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Offer.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Offer.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Offer.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Offer.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Offer.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Offer build() {
      return new OfferImpl(properties, reverseMap);
    }
  }

  public OfferImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_OFFER;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAcceptedPaymentMethodList() {
    return getProperty(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAddOnList() {
    return getProperty(CoreConstants.PROPERTY_ADD_ON);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAdvanceBookingRequirementList() {
    return getProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAggregateRatingList() {
    return getProperty(CoreConstants.PROPERTY_AGGREGATE_RATING);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAreaServedList() {
    return getProperty(CoreConstants.PROPERTY_AREA_SERVED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailabilityList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABILITY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailabilityEndsList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABILITY_ENDS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailabilityStartsList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABILITY_STARTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailableAtOrFromList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailableDeliveryMethodList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBusinessFunctionList() {
    return getProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCategoryList() {
    return getProperty(CoreConstants.PROPERTY_CATEGORY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDeliveryLeadTimeList() {
    return getProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEligibleCustomerTypeList() {
    return getProperty(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEligibleDurationList() {
    return getProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEligibleQuantityList() {
    return getProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEligibleRegionList() {
    return getProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEligibleTransactionVolumeList() {
    return getProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGtin12List() {
    return getProperty(CoreConstants.PROPERTY_GTIN12);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGtin13List() {
    return getProperty(CoreConstants.PROPERTY_GTIN13);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGtin14List() {
    return getProperty(CoreConstants.PROPERTY_GTIN14);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGtin8List() {
    return getProperty(CoreConstants.PROPERTY_GTIN8);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIncludesObjectList() {
    return getProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIneligibleRegionList() {
    return getProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInventoryLevelList() {
    return getProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getItemConditionList() {
    return getProperty(CoreConstants.PROPERTY_ITEM_CONDITION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getItemOfferedList() {
    return getProperty(CoreConstants.PROPERTY_ITEM_OFFERED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMpnList() {
    return getProperty(CoreConstants.PROPERTY_MPN);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOfferedByList() {
    return getProperty(CoreConstants.PROPERTY_OFFERED_BY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPriceList() {
    return getProperty(CoreConstants.PROPERTY_PRICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPriceCurrencyList() {
    return getProperty(CoreConstants.PROPERTY_PRICE_CURRENCY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPriceSpecificationList() {
    return getProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPriceValidUntilList() {
    return getProperty(CoreConstants.PROPERTY_PRICE_VALID_UNTIL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReviewList() {
    return getProperty(CoreConstants.PROPERTY_REVIEW);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReviewsList() {
    return getProperty(CoreConstants.PROPERTY_REVIEWS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSellerList() {
    return getProperty(CoreConstants.PROPERTY_SELLER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSerialNumberList() {
    return getProperty(CoreConstants.PROPERTY_SERIAL_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSkuList() {
    return getProperty(CoreConstants.PROPERTY_SKU);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValidFromList() {
    return getProperty(CoreConstants.PROPERTY_VALID_FROM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getValidThroughList() {
    return getProperty(CoreConstants.PROPERTY_VALID_THROUGH);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWarrantyList() {
    return getProperty(CoreConstants.PROPERTY_WARRANTY);
  }
}
