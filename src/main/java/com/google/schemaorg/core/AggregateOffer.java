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
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a href="http://schema.org/AggregateOffer">http://schema.org/AggregateOffer</a>.
 */
public interface AggregateOffer extends Offer {

  /**
   * Builder interface of <a
   * href="http://schema.org/AggregateOffer">http://schema.org/AggregateOffer</a>.
   */
  public interface Builder extends Offer.Builder {

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

    @Override
    Builder setJsonLdId(@Nullable String value);

    @Override
    Builder setJsonLdReverse(String property, Thing obj);

    @Override
    Builder setJsonLdReverse(String property, Thing.Builder builder);

    /** Add a value to property acceptedPaymentMethod. */
    Builder addAcceptedPaymentMethod(PaymentMethod value);

    /** Add a value to property acceptedPaymentMethod. */
    Builder addAcceptedPaymentMethod(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property addOn. */
    Builder addAddOn(Offer value);

    /** Add a value to property addOn. */
    Builder addAddOn(Offer.Builder value);

    /** Add a value to property addOn. */
    Builder addAddOn(String value);

    /** Add a value to property advanceBookingRequirement. */
    Builder addAdvanceBookingRequirement(QuantitativeValue value);

    /** Add a value to property advanceBookingRequirement. */
    Builder addAdvanceBookingRequirement(QuantitativeValue.Builder value);

    /** Add a value to property advanceBookingRequirement. */
    Builder addAdvanceBookingRequirement(String value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating.Builder value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(AdministrativeArea value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(AdministrativeArea.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(GeoShape value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(GeoShape.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Place value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Place.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Text value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(String value);

    /** Add a value to property availability. */
    Builder addAvailability(ItemAvailability value);

    /** Add a value to property availability. */
    Builder addAvailability(String value);

    /** Add a value to property availabilityEnds. */
    Builder addAvailabilityEnds(DateTime value);

    /** Add a value to property availabilityEnds. */
    Builder addAvailabilityEnds(String value);

    /** Add a value to property availabilityStarts. */
    Builder addAvailabilityStarts(DateTime value);

    /** Add a value to property availabilityStarts. */
    Builder addAvailabilityStarts(String value);

    /** Add a value to property availableAtOrFrom. */
    Builder addAvailableAtOrFrom(Place value);

    /** Add a value to property availableAtOrFrom. */
    Builder addAvailableAtOrFrom(Place.Builder value);

    /** Add a value to property availableAtOrFrom. */
    Builder addAvailableAtOrFrom(String value);

    /** Add a value to property availableDeliveryMethod. */
    Builder addAvailableDeliveryMethod(DeliveryMethod value);

    /** Add a value to property availableDeliveryMethod. */
    Builder addAvailableDeliveryMethod(String value);

    /** Add a value to property businessFunction. */
    Builder addBusinessFunction(BusinessFunction value);

    /** Add a value to property businessFunction. */
    Builder addBusinessFunction(String value);

    /** Add a value to property category. */
    Builder addCategory(PhysicalActivityCategory value);

    /** Add a value to property category. */
    Builder addCategory(Text value);

    /** Add a value to property category. */
    Builder addCategory(Thing value);

    /** Add a value to property category. */
    Builder addCategory(Thing.Builder value);

    /** Add a value to property category. */
    Builder addCategory(String value);

    /** Add a value to property deliveryLeadTime. */
    Builder addDeliveryLeadTime(QuantitativeValue value);

    /** Add a value to property deliveryLeadTime. */
    Builder addDeliveryLeadTime(QuantitativeValue.Builder value);

    /** Add a value to property deliveryLeadTime. */
    Builder addDeliveryLeadTime(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property eligibleCustomerType. */
    Builder addEligibleCustomerType(BusinessEntityType value);

    /** Add a value to property eligibleCustomerType. */
    Builder addEligibleCustomerType(String value);

    /** Add a value to property eligibleDuration. */
    Builder addEligibleDuration(QuantitativeValue value);

    /** Add a value to property eligibleDuration. */
    Builder addEligibleDuration(QuantitativeValue.Builder value);

    /** Add a value to property eligibleDuration. */
    Builder addEligibleDuration(String value);

    /** Add a value to property eligibleQuantity. */
    Builder addEligibleQuantity(QuantitativeValue value);

    /** Add a value to property eligibleQuantity. */
    Builder addEligibleQuantity(QuantitativeValue.Builder value);

    /** Add a value to property eligibleQuantity. */
    Builder addEligibleQuantity(String value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(GeoShape value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(GeoShape.Builder value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(Place value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(Place.Builder value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(Text value);

    /** Add a value to property eligibleRegion. */
    Builder addEligibleRegion(String value);

    /** Add a value to property eligibleTransactionVolume. */
    Builder addEligibleTransactionVolume(PriceSpecification value);

    /** Add a value to property eligibleTransactionVolume. */
    Builder addEligibleTransactionVolume(PriceSpecification.Builder value);

    /** Add a value to property eligibleTransactionVolume. */
    Builder addEligibleTransactionVolume(String value);

    /** Add a value to property gtin12. */
    Builder addGtin12(Text value);

    /** Add a value to property gtin12. */
    Builder addGtin12(String value);

    /** Add a value to property gtin13. */
    Builder addGtin13(Text value);

    /** Add a value to property gtin13. */
    Builder addGtin13(String value);

    /** Add a value to property gtin14. */
    Builder addGtin14(Text value);

    /** Add a value to property gtin14. */
    Builder addGtin14(String value);

    /** Add a value to property gtin8. */
    Builder addGtin8(Text value);

    /** Add a value to property gtin8. */
    Builder addGtin8(String value);

    /** Add a value to property highPrice. */
    Builder addHighPrice(Number value);

    /** Add a value to property highPrice. */
    Builder addHighPrice(Text value);

    /** Add a value to property highPrice. */
    Builder addHighPrice(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property includesObject. */
    Builder addIncludesObject(TypeAndQuantityNode value);

    /** Add a value to property includesObject. */
    Builder addIncludesObject(TypeAndQuantityNode.Builder value);

    /** Add a value to property includesObject. */
    Builder addIncludesObject(String value);

    /** Add a value to property ineligibleRegion. */
    Builder addIneligibleRegion(GeoShape value);

    /** Add a value to property ineligibleRegion. */
    Builder addIneligibleRegion(GeoShape.Builder value);

    /** Add a value to property ineligibleRegion. */
    Builder addIneligibleRegion(Place value);

    /** Add a value to property ineligibleRegion. */
    Builder addIneligibleRegion(Place.Builder value);

    /** Add a value to property ineligibleRegion. */
    Builder addIneligibleRegion(Text value);

    /** Add a value to property ineligibleRegion. */
    Builder addIneligibleRegion(String value);

    /** Add a value to property inventoryLevel. */
    Builder addInventoryLevel(QuantitativeValue value);

    /** Add a value to property inventoryLevel. */
    Builder addInventoryLevel(QuantitativeValue.Builder value);

    /** Add a value to property inventoryLevel. */
    Builder addInventoryLevel(String value);

    /** Add a value to property itemCondition. */
    Builder addItemCondition(OfferItemCondition value);

    /** Add a value to property itemCondition. */
    Builder addItemCondition(String value);

    /** Add a value to property itemOffered. */
    Builder addItemOffered(Product value);

    /** Add a value to property itemOffered. */
    Builder addItemOffered(Product.Builder value);

    /** Add a value to property itemOffered. */
    Builder addItemOffered(Service value);

    /** Add a value to property itemOffered. */
    Builder addItemOffered(Service.Builder value);

    /** Add a value to property itemOffered. */
    Builder addItemOffered(String value);

    /** Add a value to property lowPrice. */
    Builder addLowPrice(Number value);

    /** Add a value to property lowPrice. */
    Builder addLowPrice(Text value);

    /** Add a value to property lowPrice. */
    Builder addLowPrice(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property mpn. */
    Builder addMpn(Text value);

    /** Add a value to property mpn. */
    Builder addMpn(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property offerCount. */
    Builder addOfferCount(Integer value);

    /** Add a value to property offerCount. */
    Builder addOfferCount(String value);

    /** Add a value to property offeredBy. */
    Builder addOfferedBy(Organization value);

    /** Add a value to property offeredBy. */
    Builder addOfferedBy(Organization.Builder value);

    /** Add a value to property offeredBy. */
    Builder addOfferedBy(Person value);

    /** Add a value to property offeredBy. */
    Builder addOfferedBy(Person.Builder value);

    /** Add a value to property offeredBy. */
    Builder addOfferedBy(String value);

    /** Add a value to property offers. */
    Builder addOffers(Offer value);

    /** Add a value to property offers. */
    Builder addOffers(Offer.Builder value);

    /** Add a value to property offers. */
    Builder addOffers(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property price. */
    Builder addPrice(Number value);

    /** Add a value to property price. */
    Builder addPrice(Text value);

    /** Add a value to property price. */
    Builder addPrice(String value);

    /** Add a value to property priceCurrency. */
    Builder addPriceCurrency(Text value);

    /** Add a value to property priceCurrency. */
    Builder addPriceCurrency(String value);

    /** Add a value to property priceSpecification. */
    Builder addPriceSpecification(PriceSpecification value);

    /** Add a value to property priceSpecification. */
    Builder addPriceSpecification(PriceSpecification.Builder value);

    /** Add a value to property priceSpecification. */
    Builder addPriceSpecification(String value);

    /** Add a value to property priceValidUntil. */
    Builder addPriceValidUntil(Date value);

    /** Add a value to property priceValidUntil. */
    Builder addPriceValidUntil(String value);

    /** Add a value to property review. */
    Builder addReview(Review value);

    /** Add a value to property review. */
    Builder addReview(Review.Builder value);

    /** Add a value to property review. */
    Builder addReview(String value);

    /** Add a value to property reviews. */
    Builder addReviews(Review value);

    /** Add a value to property reviews. */
    Builder addReviews(Review.Builder value);

    /** Add a value to property reviews. */
    Builder addReviews(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property seller. */
    Builder addSeller(Organization value);

    /** Add a value to property seller. */
    Builder addSeller(Organization.Builder value);

    /** Add a value to property seller. */
    Builder addSeller(Person value);

    /** Add a value to property seller. */
    Builder addSeller(Person.Builder value);

    /** Add a value to property seller. */
    Builder addSeller(String value);

    /** Add a value to property serialNumber. */
    Builder addSerialNumber(Text value);

    /** Add a value to property serialNumber. */
    Builder addSerialNumber(String value);

    /** Add a value to property sku. */
    Builder addSku(Text value);

    /** Add a value to property sku. */
    Builder addSku(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property validFrom. */
    Builder addValidFrom(DateTime value);

    /** Add a value to property validFrom. */
    Builder addValidFrom(String value);

    /** Add a value to property validThrough. */
    Builder addValidThrough(DateTime value);

    /** Add a value to property validThrough. */
    Builder addValidThrough(String value);

    /** Add a value to property warranty. */
    Builder addWarranty(WarrantyPromise value);

    /** Add a value to property warranty. */
    Builder addWarranty(WarrantyPromise.Builder value);

    /** Add a value to property warranty. */
    Builder addWarranty(String value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article.Builder value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(String value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification.Builder value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(String value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The value of the property.
     */
    Builder addProperty(String name, SchemaOrgType value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param builder The schema.org object builder for the property value.
     */
    Builder addProperty(String name, Thing.Builder builder);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The string value of the property.
     */
    Builder addProperty(String name, String value);

    /** Build a {@link AggregateOffer} object. */
    AggregateOffer build();
  }

  /**
   * Returns the value list of property highPrice. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getHighPriceList();

  /**
   * Returns the value list of property lowPrice. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getLowPriceList();

  /**
   * Returns the value list of property offerCount. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getOfferCountList();

  /**
   * Returns the value list of property offers. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getOffersList();
}
