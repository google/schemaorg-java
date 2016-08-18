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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Vehicle}. */
public class VehicleImpl extends ProductImpl implements Vehicle {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AUDIENCE);

    builder.add(CoreConstants.PROPERTY_AWARD);

    builder.add(CoreConstants.PROPERTY_AWARDS);

    builder.add(CoreConstants.PROPERTY_BRAND);

    builder.add(CoreConstants.PROPERTY_CARGO_VOLUME);

    builder.add(CoreConstants.PROPERTY_CATEGORY);

    builder.add(CoreConstants.PROPERTY_COLOR);

    builder.add(CoreConstants.PROPERTY_DATE_VEHICLE_FIRST_REGISTERED);

    builder.add(CoreConstants.PROPERTY_DEPTH);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION);

    builder.add(CoreConstants.PROPERTY_FUEL_CONSUMPTION);

    builder.add(CoreConstants.PROPERTY_FUEL_EFFICIENCY);

    builder.add(CoreConstants.PROPERTY_FUEL_TYPE);

    builder.add(CoreConstants.PROPERTY_GTIN12);

    builder.add(CoreConstants.PROPERTY_GTIN13);

    builder.add(CoreConstants.PROPERTY_GTIN14);

    builder.add(CoreConstants.PROPERTY_GTIN8);

    builder.add(CoreConstants.PROPERTY_HEIGHT);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR);

    builder.add(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR);

    builder.add(CoreConstants.PROPERTY_IS_RELATED_TO);

    builder.add(CoreConstants.PROPERTY_IS_SIMILAR_TO);

    builder.add(CoreConstants.PROPERTY_ITEM_CONDITION);

    builder.add(CoreConstants.PROPERTY_KNOWN_VEHICLE_DAMAGES);

    builder.add(CoreConstants.PROPERTY_LOGO);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MANUFACTURER);

    builder.add(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER);

    builder.add(CoreConstants.PROPERTY_MODEL);

    builder.add(CoreConstants.PROPERTY_MPN);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_AXLES);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_DOORS);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRODUCT_ID);

    builder.add(CoreConstants.PROPERTY_PRODUCTION_DATE);

    builder.add(CoreConstants.PROPERTY_PURCHASE_DATE);

    builder.add(CoreConstants.PROPERTY_RELEASE_DATE);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_REVIEWS);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SKU);

    builder.add(CoreConstants.PROPERTY_STEERING_POSITION);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VEHICLE_CONFIGURATION);

    builder.add(CoreConstants.PROPERTY_VEHICLE_ENGINE);

    builder.add(CoreConstants.PROPERTY_VEHICLE_IDENTIFICATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_VEHICLE_INTERIOR_COLOR);

    builder.add(CoreConstants.PROPERTY_VEHICLE_INTERIOR_TYPE);

    builder.add(CoreConstants.PROPERTY_VEHICLE_MODEL_DATE);

    builder.add(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY);

    builder.add(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION);

    builder.add(CoreConstants.PROPERTY_WEIGHT);

    builder.add(CoreConstants.PROPERTY_WIDTH);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Vehicle.Builder>
      implements Vehicle.Builder {

    @Override
    public Vehicle.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public Vehicle.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public Vehicle.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public Vehicle.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Vehicle.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public Vehicle.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public Vehicle.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public Vehicle.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Vehicle.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Vehicle.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public Vehicle.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public Vehicle.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public Vehicle.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public Vehicle.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public Vehicle.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Vehicle.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Vehicle.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Vehicle.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Vehicle.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public Vehicle.Builder addCargoVolume(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_CARGO_VOLUME, value);
    }

    @Override
    public Vehicle.Builder addCargoVolume(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CARGO_VOLUME, value.build());
    }

    @Override
    public Vehicle.Builder addCargoVolume(String value) {
      return addProperty(CoreConstants.PROPERTY_CARGO_VOLUME, Text.of(value));
    }

    @Override
    public Vehicle.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Vehicle.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Vehicle.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Vehicle.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public Vehicle.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public Vehicle.Builder addColor(Text value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, value);
    }

    @Override
    public Vehicle.Builder addColor(String value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, Text.of(value));
    }

    @Override
    public Vehicle.Builder addDateVehicleFirstRegistered(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_VEHICLE_FIRST_REGISTERED, value);
    }

    @Override
    public Vehicle.Builder addDateVehicleFirstRegistered(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_VEHICLE_FIRST_REGISTERED, Text.of(value));
    }

    @Override
    public Vehicle.Builder addDepth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public Vehicle.Builder addDepth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public Vehicle.Builder addDepth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public Vehicle.Builder addDepth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public Vehicle.Builder addDepth(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, Text.of(value));
    }

    @Override
    public Vehicle.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Vehicle.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addDriveWheelConfiguration(DriveWheelConfigurationValue value) {
      return addProperty(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION, value);
    }

    @Override
    public Vehicle.Builder addDriveWheelConfiguration(Text value) {
      return addProperty(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION, value);
    }

    @Override
    public Vehicle.Builder addDriveWheelConfiguration(String value) {
      return addProperty(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addFuelConsumption(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_CONSUMPTION, value);
    }

    @Override
    public Vehicle.Builder addFuelConsumption(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_CONSUMPTION, value.build());
    }

    @Override
    public Vehicle.Builder addFuelConsumption(String value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_CONSUMPTION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addFuelEfficiency(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_EFFICIENCY, value);
    }

    @Override
    public Vehicle.Builder addFuelEfficiency(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_EFFICIENCY, value.build());
    }

    @Override
    public Vehicle.Builder addFuelEfficiency(String value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_EFFICIENCY, Text.of(value));
    }

    @Override
    public Vehicle.Builder addFuelType(QualitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, value);
    }

    @Override
    public Vehicle.Builder addFuelType(Text value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, value);
    }

    @Override
    public Vehicle.Builder addFuelType(URL value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, value);
    }

    @Override
    public Vehicle.Builder addFuelType(String value) {
      return addProperty(CoreConstants.PROPERTY_FUEL_TYPE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public Vehicle.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public Vehicle.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public Vehicle.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public Vehicle.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public Vehicle.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public Vehicle.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public Vehicle.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public Vehicle.Builder addHeight(Distance value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Vehicle.Builder addHeight(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Vehicle.Builder addHeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Vehicle.Builder addHeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Vehicle.Builder addHeight(String value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, Text.of(value));
    }

    @Override
    public Vehicle.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Vehicle.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Vehicle.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Vehicle.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addIsAccessoryOrSparePartFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value);
    }

    @Override
    public Vehicle.Builder addIsAccessoryOrSparePartFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value.build());
    }

    @Override
    public Vehicle.Builder addIsAccessoryOrSparePartFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, Text.of(value));
    }

    @Override
    public Vehicle.Builder addIsConsumableFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value);
    }

    @Override
    public Vehicle.Builder addIsConsumableFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value.build());
    }

    @Override
    public Vehicle.Builder addIsConsumableFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, Text.of(value));
    }

    @Override
    public Vehicle.Builder addIsRelatedTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value);
    }

    @Override
    public Vehicle.Builder addIsRelatedTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value.build());
    }

    @Override
    public Vehicle.Builder addIsRelatedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, Text.of(value));
    }

    @Override
    public Vehicle.Builder addIsSimilarTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value);
    }

    @Override
    public Vehicle.Builder addIsSimilarTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value.build());
    }

    @Override
    public Vehicle.Builder addIsSimilarTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, Text.of(value));
    }

    @Override
    public Vehicle.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public Vehicle.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addKnownVehicleDamages(Text value) {
      return addProperty(CoreConstants.PROPERTY_KNOWN_VEHICLE_DAMAGES, value);
    }

    @Override
    public Vehicle.Builder addKnownVehicleDamages(String value) {
      return addProperty(CoreConstants.PROPERTY_KNOWN_VEHICLE_DAMAGES, Text.of(value));
    }

    @Override
    public Vehicle.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Vehicle.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public Vehicle.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Vehicle.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public Vehicle.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Vehicle.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Vehicle.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Vehicle.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addManufacturer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value);
    }

    @Override
    public Vehicle.Builder addManufacturer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value.build());
    }

    @Override
    public Vehicle.Builder addManufacturer(String value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, Text.of(value));
    }

    @Override
    public Vehicle.Builder addMileageFromOdometer(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER, value);
    }

    @Override
    public Vehicle.Builder addMileageFromOdometer(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER, value.build());
    }

    @Override
    public Vehicle.Builder addMileageFromOdometer(String value) {
      return addProperty(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER, Text.of(value));
    }

    @Override
    public Vehicle.Builder addModel(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public Vehicle.Builder addModel(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value.build());
    }

    @Override
    public Vehicle.Builder addModel(Text value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public Vehicle.Builder addModel(String value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, Text.of(value));
    }

    @Override
    public Vehicle.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public Vehicle.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public Vehicle.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Vehicle.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Vehicle.Builder addNumberOfAirbags(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfAirbags(Text value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfAirbags(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addNumberOfAxles(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, value);
    }

    @Override
    public Vehicle.Builder addNumberOfAxles(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, value);
    }

    @Override
    public Vehicle.Builder addNumberOfAxles(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, value.build());
    }

    @Override
    public Vehicle.Builder addNumberOfAxles(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES, Text.of(value));
    }

    @Override
    public Vehicle.Builder addNumberOfDoors(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfDoors(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfDoors(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, value.build());
    }

    @Override
    public Vehicle.Builder addNumberOfDoors(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addNumberOfForwardGears(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfForwardGears(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfForwardGears(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, value.build());
    }

    @Override
    public Vehicle.Builder addNumberOfForwardGears(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addNumberOfPreviousOwners(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfPreviousOwners(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, value);
    }

    @Override
    public Vehicle.Builder addNumberOfPreviousOwners(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, value.build());
    }

    @Override
    public Vehicle.Builder addNumberOfPreviousOwners(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public Vehicle.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public Vehicle.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Vehicle.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Vehicle.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addProductID(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, value);
    }

    @Override
    public Vehicle.Builder addProductID(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, Text.of(value));
    }

    @Override
    public Vehicle.Builder addProductionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, value);
    }

    @Override
    public Vehicle.Builder addProductionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addPurchaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, value);
    }

    @Override
    public Vehicle.Builder addPurchaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addReleaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, value);
    }

    @Override
    public Vehicle.Builder addReleaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public Vehicle.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public Vehicle.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public Vehicle.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public Vehicle.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public Vehicle.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Vehicle.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Vehicle.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public Vehicle.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public Vehicle.Builder addSteeringPosition(SteeringPositionValue value) {
      return addProperty(CoreConstants.PROPERTY_STEERING_POSITION, value);
    }

    @Override
    public Vehicle.Builder addSteeringPosition(String value) {
      return addProperty(CoreConstants.PROPERTY_STEERING_POSITION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Vehicle.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleConfiguration(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_CONFIGURATION, value);
    }

    @Override
    public Vehicle.Builder addVehicleConfiguration(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_CONFIGURATION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleEngine(EngineSpecification value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_ENGINE, value);
    }

    @Override
    public Vehicle.Builder addVehicleEngine(EngineSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_ENGINE, value.build());
    }

    @Override
    public Vehicle.Builder addVehicleEngine(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_ENGINE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleIdentificationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_IDENTIFICATION_NUMBER, value);
    }

    @Override
    public Vehicle.Builder addVehicleIdentificationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_IDENTIFICATION_NUMBER, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleInteriorColor(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_COLOR, value);
    }

    @Override
    public Vehicle.Builder addVehicleInteriorColor(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_COLOR, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleInteriorType(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_TYPE, value);
    }

    @Override
    public Vehicle.Builder addVehicleInteriorType(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_TYPE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleModelDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_MODEL_DATE, value);
    }

    @Override
    public Vehicle.Builder addVehicleModelDate(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_MODEL_DATE, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleSeatingCapacity(Number value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, value);
    }

    @Override
    public Vehicle.Builder addVehicleSeatingCapacity(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, value);
    }

    @Override
    public Vehicle.Builder addVehicleSeatingCapacity(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, value.build());
    }

    @Override
    public Vehicle.Builder addVehicleSeatingCapacity(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY, Text.of(value));
    }

    @Override
    public Vehicle.Builder addVehicleTransmission(QualitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, value);
    }

    @Override
    public Vehicle.Builder addVehicleTransmission(Text value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, value);
    }

    @Override
    public Vehicle.Builder addVehicleTransmission(URL value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, value);
    }

    @Override
    public Vehicle.Builder addVehicleTransmission(String value) {
      return addProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addWeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value);
    }

    @Override
    public Vehicle.Builder addWeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value.build());
    }

    @Override
    public Vehicle.Builder addWeight(String value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, Text.of(value));
    }

    @Override
    public Vehicle.Builder addWidth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public Vehicle.Builder addWidth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public Vehicle.Builder addWidth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public Vehicle.Builder addWidth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public Vehicle.Builder addWidth(String value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, Text.of(value));
    }

    @Override
    public Vehicle.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Vehicle.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Vehicle.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Vehicle.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Vehicle.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Vehicle.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Vehicle build() {
      return new VehicleImpl(properties, reverseMap);
    }
  }

  public VehicleImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_VEHICLE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCargoVolumeList() {
    return getProperty(CoreConstants.PROPERTY_CARGO_VOLUME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDateVehicleFirstRegisteredList() {
    return getProperty(CoreConstants.PROPERTY_DATE_VEHICLE_FIRST_REGISTERED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDriveWheelConfigurationList() {
    return getProperty(CoreConstants.PROPERTY_DRIVE_WHEEL_CONFIGURATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFuelConsumptionList() {
    return getProperty(CoreConstants.PROPERTY_FUEL_CONSUMPTION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFuelEfficiencyList() {
    return getProperty(CoreConstants.PROPERTY_FUEL_EFFICIENCY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFuelTypeList() {
    return getProperty(CoreConstants.PROPERTY_FUEL_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getKnownVehicleDamagesList() {
    return getProperty(CoreConstants.PROPERTY_KNOWN_VEHICLE_DAMAGES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMileageFromOdometerList() {
    return getProperty(CoreConstants.PROPERTY_MILEAGE_FROM_ODOMETER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumberOfAirbagsList() {
    return getProperty(CoreConstants.PROPERTY_NUMBER_OF_AIRBAGS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumberOfAxlesList() {
    return getProperty(CoreConstants.PROPERTY_NUMBER_OF_AXLES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumberOfDoorsList() {
    return getProperty(CoreConstants.PROPERTY_NUMBER_OF_DOORS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumberOfForwardGearsList() {
    return getProperty(CoreConstants.PROPERTY_NUMBER_OF_FORWARD_GEARS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumberOfPreviousOwnersList() {
    return getProperty(CoreConstants.PROPERTY_NUMBER_OF_PREVIOUS_OWNERS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSteeringPositionList() {
    return getProperty(CoreConstants.PROPERTY_STEERING_POSITION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleConfigurationList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_CONFIGURATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleEngineList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_ENGINE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleIdentificationNumberList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_IDENTIFICATION_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleInteriorColorList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_COLOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleInteriorTypeList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_INTERIOR_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleModelDateList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_MODEL_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleSeatingCapacityList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_SEATING_CAPACITY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVehicleTransmissionList() {
    return getProperty(CoreConstants.PROPERTY_VEHICLE_TRANSMISSION);
  }
}
