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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link SomeProducts}. */
public class SomeProductsImpl extends ProductImpl implements SomeProducts {
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

    builder.add(CoreConstants.PROPERTY_CATEGORY);

    builder.add(CoreConstants.PROPERTY_COLOR);

    builder.add(CoreConstants.PROPERTY_DEPTH);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_GTIN12);

    builder.add(CoreConstants.PROPERTY_GTIN13);

    builder.add(CoreConstants.PROPERTY_GTIN14);

    builder.add(CoreConstants.PROPERTY_GTIN8);

    builder.add(CoreConstants.PROPERTY_HEIGHT);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INVENTORY_LEVEL);

    builder.add(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR);

    builder.add(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR);

    builder.add(CoreConstants.PROPERTY_IS_RELATED_TO);

    builder.add(CoreConstants.PROPERTY_IS_SIMILAR_TO);

    builder.add(CoreConstants.PROPERTY_ITEM_CONDITION);

    builder.add(CoreConstants.PROPERTY_LOGO);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MANUFACTURER);

    builder.add(CoreConstants.PROPERTY_MODEL);

    builder.add(CoreConstants.PROPERTY_MPN);

    builder.add(CoreConstants.PROPERTY_NAME);

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

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_WEIGHT);

    builder.add(CoreConstants.PROPERTY_WIDTH);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<SomeProducts.Builder>
      implements SomeProducts.Builder {

    @Override
    public SomeProducts.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public SomeProducts.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public SomeProducts.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public SomeProducts.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public SomeProducts.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public SomeProducts.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public SomeProducts.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public SomeProducts.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public SomeProducts.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public SomeProducts.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public SomeProducts.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public SomeProducts.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public SomeProducts.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public SomeProducts.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public SomeProducts.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public SomeProducts.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public SomeProducts.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public SomeProducts.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public SomeProducts.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addColor(Text value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, value);
    }

    @Override
    public SomeProducts.Builder addColor(String value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addDepth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public SomeProducts.Builder addDepth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public SomeProducts.Builder addDepth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public SomeProducts.Builder addDepth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public SomeProducts.Builder addDepth(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public SomeProducts.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public SomeProducts.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public SomeProducts.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public SomeProducts.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public SomeProducts.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addHeight(Distance value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public SomeProducts.Builder addHeight(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public SomeProducts.Builder addHeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public SomeProducts.Builder addHeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public SomeProducts.Builder addHeight(String value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public SomeProducts.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public SomeProducts.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public SomeProducts.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addInventoryLevel(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value);
    }

    @Override
    public SomeProducts.Builder addInventoryLevel(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, value.build());
    }

    @Override
    public SomeProducts.Builder addInventoryLevel(String value) {
      return addProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addIsAccessoryOrSparePartFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value);
    }

    @Override
    public SomeProducts.Builder addIsAccessoryOrSparePartFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value.build());
    }

    @Override
    public SomeProducts.Builder addIsAccessoryOrSparePartFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addIsConsumableFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value);
    }

    @Override
    public SomeProducts.Builder addIsConsumableFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value.build());
    }

    @Override
    public SomeProducts.Builder addIsConsumableFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addIsRelatedTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value);
    }

    @Override
    public SomeProducts.Builder addIsRelatedTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value.build());
    }

    @Override
    public SomeProducts.Builder addIsRelatedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addIsSimilarTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value);
    }

    @Override
    public SomeProducts.Builder addIsSimilarTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value.build());
    }

    @Override
    public SomeProducts.Builder addIsSimilarTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public SomeProducts.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public SomeProducts.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public SomeProducts.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public SomeProducts.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public SomeProducts.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public SomeProducts.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public SomeProducts.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addManufacturer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value);
    }

    @Override
    public SomeProducts.Builder addManufacturer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value.build());
    }

    @Override
    public SomeProducts.Builder addManufacturer(String value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addModel(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public SomeProducts.Builder addModel(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value.build());
    }

    @Override
    public SomeProducts.Builder addModel(Text value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public SomeProducts.Builder addModel(String value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public SomeProducts.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public SomeProducts.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public SomeProducts.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public SomeProducts.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public SomeProducts.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public SomeProducts.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addProductID(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, value);
    }

    @Override
    public SomeProducts.Builder addProductID(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addProductionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, value);
    }

    @Override
    public SomeProducts.Builder addProductionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addPurchaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, value);
    }

    @Override
    public SomeProducts.Builder addPurchaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addReleaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, value);
    }

    @Override
    public SomeProducts.Builder addReleaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public SomeProducts.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public SomeProducts.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public SomeProducts.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public SomeProducts.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public SomeProducts.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public SomeProducts.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public SomeProducts.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addWeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value);
    }

    @Override
    public SomeProducts.Builder addWeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value.build());
    }

    @Override
    public SomeProducts.Builder addWeight(String value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addWidth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public SomeProducts.Builder addWidth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public SomeProducts.Builder addWidth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public SomeProducts.Builder addWidth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public SomeProducts.Builder addWidth(String value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public SomeProducts.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public SomeProducts.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public SomeProducts.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public SomeProducts.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public SomeProducts.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public SomeProducts build() {
      return new SomeProductsImpl(properties, reverseMap);
    }
  }

  public SomeProductsImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_SOME_PRODUCTS;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInventoryLevelList() {
    return getProperty(CoreConstants.PROPERTY_INVENTORY_LEVEL);
  }
}
