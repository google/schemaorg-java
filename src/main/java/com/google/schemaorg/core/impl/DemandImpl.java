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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Demand}. */
public class DemandImpl extends IntangibleImpl implements Demand {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AREA_SERVED);

    builder.add(CoreConstants.PROPERTY_AVAILABILITY);

    builder.add(CoreConstants.PROPERTY_AVAILABILITY_ENDS);

    builder.add(CoreConstants.PROPERTY_AVAILABILITY_STARTS);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD);

    builder.add(CoreConstants.PROPERTY_BUSINESS_FUNCTION);

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

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRICE_SPECIFICATION);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Demand.Builder>
      implements Demand.Builder {

    @Override
    public Demand.Builder addAcceptedPaymentMethod(PaymentMethod value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD, value);
    }

    @Override
    public Demand.Builder addAcceptedPaymentMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_PAYMENT_METHOD, Text.of(value));
    }

    @Override
    public Demand.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Demand.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Demand.Builder addAdvanceBookingRequirement(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, value);
    }

    @Override
    public Demand.Builder addAdvanceBookingRequirement(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, value.build());
    }

    @Override
    public Demand.Builder addAdvanceBookingRequirement(String value) {
      return addProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT, Text.of(value));
    }

    @Override
    public Demand.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Demand.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Demand.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Demand.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Demand.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Demand.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Demand.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Demand.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Demand.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Demand.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public Demand.Builder addAvailability(ItemAvailability value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY, value);
    }

    @Override
    public Demand.Builder addAvailability(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY, Text.of(value));
    }

    @Override
    public Demand.Builder addAvailabilityEnds(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_ENDS, value);
    }

    @Override
    public Demand.Builder addAvailabilityEnds(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_ENDS, Text.of(value));
    }

    @Override
    public Demand.Builder addAvailabilityStarts(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_STARTS, value);
    }

    @Override
    public Demand.Builder addAvailabilityStarts(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABILITY_STARTS, Text.of(value));
    }

    @Override
    public Demand.Builder addAvailableAtOrFrom(Place value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, value);
    }

    @Override
    public Demand.Builder addAvailableAtOrFrom(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, value.build());
    }

    @Override
    public Demand.Builder addAvailableAtOrFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_AT_OR_FROM, Text.of(value));
    }

    @Override
    public Demand.Builder addAvailableDeliveryMethod(DeliveryMethod value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD, value);
    }

    @Override
    public Demand.Builder addAvailableDeliveryMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_DELIVERY_METHOD, Text.of(value));
    }

    @Override
    public Demand.Builder addBusinessFunction(BusinessFunction value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, value);
    }

    @Override
    public Demand.Builder addBusinessFunction(String value) {
      return addProperty(CoreConstants.PROPERTY_BUSINESS_FUNCTION, Text.of(value));
    }

    @Override
    public Demand.Builder addDeliveryLeadTime(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, value);
    }

    @Override
    public Demand.Builder addDeliveryLeadTime(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, value.build());
    }

    @Override
    public Demand.Builder addDeliveryLeadTime(String value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_LEAD_TIME, Text.of(value));
    }

    @Override
    public Demand.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Demand.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Demand.Builder addEligibleCustomerType(BusinessEntityType value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE, value);
    }

    @Override
    public Demand.Builder addEligibleCustomerType(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_CUSTOMER_TYPE, Text.of(value));
    }

    @Override
    public Demand.Builder addEligibleDuration(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, value);
    }

    @Override
    public Demand.Builder addEligibleDuration(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, value.build());
    }

    @Override
    public Demand.Builder addEligibleDuration(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_DURATION, Text.of(value));
    }

    @Override
    public Demand.Builder addEligibleQuantity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value);
    }

    @Override
    public Demand.Builder addEligibleQuantity(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, value.build());
    }

    @Override
    public Demand.Builder addEligibleQuantity(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_QUANTITY, Text.of(value));
    }

    @Override
    public Demand.Builder addEligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public Demand.Builder addEligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public Demand.Builder addEligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public Demand.Builder addEligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value.build());
    }

    @Override
    public Demand.Builder addEligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, value);
    }

    @Override
    public Demand.Builder addEligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public Demand.Builder addEligibleTransactionVolume(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value);
    }

    @Override
    public Demand.Builder addEligibleTransactionVolume(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, value.build());
    }

    @Override
    public Demand.Builder addEligibleTransactionVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_ELIGIBLE_TRANSACTION_VOLUME, Text.of(value));
    }

    @Override
    public Demand.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public Demand.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public Demand.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public Demand.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public Demand.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public Demand.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public Demand.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public Demand.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public Demand.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Demand.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Demand.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Demand.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Demand.Builder addIncludesObject(TypeAndQuantityNode value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, value);
    }

    @Override
    public Demand.Builder addIncludesObject(TypeAndQuantityNode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, value.build());
    }

    @Override
    public Demand.Builder addIncludesObject(String value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDES_OBJECT, Text.of(value));
    }

    @Override
    public Demand.Builder addIneligibleRegion(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public Demand.Builder addIneligibleRegion(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public Demand.Builder addIneligibleRegion(Place value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public Demand.Builder addIneligibleRegion(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value.build());
    }

    @Override
    public Demand.Builder addIneligibleRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, value);
    }

    @Override
    public Demand.Builder addIneligibleRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_INELIGIBLE_REGION, Text.of(value));
    }

    @Override
    public Demand.Builder addInventoryLevel(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value);
    }

    @Override
    public Demand.Builder addInventoryLevel(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value.build());
    }

    @Override
    public Demand.Builder addInventoryLevel(String value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, Text.of(value));
    }

    @Override
    public Demand.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public Demand.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public Demand.Builder addItemOffered(Product value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value);
    }

    @Override
    public Demand.Builder addItemOffered(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value.build());
    }

    @Override
    public Demand.Builder addItemOffered(Service value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value);
    }

    @Override
    public Demand.Builder addItemOffered(Service.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, value.build());
    }

    @Override
    public Demand.Builder addItemOffered(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_OFFERED, Text.of(value));
    }

    @Override
    public Demand.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Demand.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Demand.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Demand.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Demand.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public Demand.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public Demand.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Demand.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Demand.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Demand.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Demand.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Demand.Builder addPriceSpecification(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, value);
    }

    @Override
    public Demand.Builder addPriceSpecification(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, value.build());
    }

    @Override
    public Demand.Builder addPriceSpecification(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION, Text.of(value));
    }

    @Override
    public Demand.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Demand.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Demand.Builder addSeller(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Demand.Builder addSeller(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Demand.Builder addSeller(Person value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Demand.Builder addSeller(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Demand.Builder addSeller(String value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, Text.of(value));
    }

    @Override
    public Demand.Builder addSerialNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_SERIAL_NUMBER, value);
    }

    @Override
    public Demand.Builder addSerialNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_SERIAL_NUMBER, Text.of(value));
    }

    @Override
    public Demand.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public Demand.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public Demand.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Demand.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Demand.Builder addValidFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, value);
    }

    @Override
    public Demand.Builder addValidFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, Text.of(value));
    }

    @Override
    public Demand.Builder addValidThrough(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, value);
    }

    @Override
    public Demand.Builder addValidThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_THROUGH, Text.of(value));
    }

    @Override
    public Demand.Builder addWarranty(WarrantyPromise value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, value);
    }

    @Override
    public Demand.Builder addWarranty(WarrantyPromise.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, value.build());
    }

    @Override
    public Demand.Builder addWarranty(String value) {
      return addProperty(CoreConstants.PROPERTY_WARRANTY, Text.of(value));
    }

    @Override
    public Demand.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Demand.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Demand.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Demand.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Demand.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Demand.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Demand build() {
      return new DemandImpl(properties, reverseMap);
    }
  }

  public DemandImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_DEMAND;
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
  public ImmutableList<SchemaOrgType> getAdvanceBookingRequirementList() {
    return getProperty(CoreConstants.PROPERTY_ADVANCE_BOOKING_REQUIREMENT);
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
  public ImmutableList<SchemaOrgType> getPriceSpecificationList() {
    return getProperty(CoreConstants.PROPERTY_PRICE_SPECIFICATION);
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
