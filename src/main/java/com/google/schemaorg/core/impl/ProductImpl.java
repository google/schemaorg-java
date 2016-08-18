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

/** Implementation of {@link Product}. */
public class ProductImpl extends ThingImpl implements Product {
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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Product.Builder>
      implements Product.Builder {

    @Override
    public Product.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public Product.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public Product.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public Product.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Product.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Product.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public Product.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public Product.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public Product.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Product.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Product.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public Product.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public Product.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public Product.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public Product.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public Product.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public Product.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public Product.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Product.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Product.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Product.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Product.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public Product.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Product.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Product.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Product.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public Product.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public Product.Builder addColor(Text value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, value);
    }

    @Override
    public Product.Builder addColor(String value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, Text.of(value));
    }

    @Override
    public Product.Builder addDepth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public Product.Builder addDepth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public Product.Builder addDepth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public Product.Builder addDepth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public Product.Builder addDepth(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, Text.of(value));
    }

    @Override
    public Product.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Product.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Product.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public Product.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public Product.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public Product.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public Product.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public Product.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public Product.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public Product.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public Product.Builder addHeight(Distance value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Product.Builder addHeight(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Product.Builder addHeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Product.Builder addHeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Product.Builder addHeight(String value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, Text.of(value));
    }

    @Override
    public Product.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Product.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Product.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Product.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Product.Builder addIsAccessoryOrSparePartFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value);
    }

    @Override
    public Product.Builder addIsAccessoryOrSparePartFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value.build());
    }

    @Override
    public Product.Builder addIsAccessoryOrSparePartFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, Text.of(value));
    }

    @Override
    public Product.Builder addIsConsumableFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value);
    }

    @Override
    public Product.Builder addIsConsumableFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value.build());
    }

    @Override
    public Product.Builder addIsConsumableFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, Text.of(value));
    }

    @Override
    public Product.Builder addIsRelatedTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value);
    }

    @Override
    public Product.Builder addIsRelatedTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value.build());
    }

    @Override
    public Product.Builder addIsRelatedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, Text.of(value));
    }

    @Override
    public Product.Builder addIsSimilarTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value);
    }

    @Override
    public Product.Builder addIsSimilarTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value.build());
    }

    @Override
    public Product.Builder addIsSimilarTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, Text.of(value));
    }

    @Override
    public Product.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public Product.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public Product.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Product.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public Product.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Product.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public Product.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Product.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Product.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Product.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Product.Builder addManufacturer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value);
    }

    @Override
    public Product.Builder addManufacturer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value.build());
    }

    @Override
    public Product.Builder addManufacturer(String value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, Text.of(value));
    }

    @Override
    public Product.Builder addModel(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public Product.Builder addModel(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value.build());
    }

    @Override
    public Product.Builder addModel(Text value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public Product.Builder addModel(String value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, Text.of(value));
    }

    @Override
    public Product.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public Product.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public Product.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Product.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Product.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public Product.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public Product.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public Product.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Product.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Product.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Product.Builder addProductID(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, value);
    }

    @Override
    public Product.Builder addProductID(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, Text.of(value));
    }

    @Override
    public Product.Builder addProductionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, value);
    }

    @Override
    public Product.Builder addProductionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, Text.of(value));
    }

    @Override
    public Product.Builder addPurchaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, value);
    }

    @Override
    public Product.Builder addPurchaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, Text.of(value));
    }

    @Override
    public Product.Builder addReleaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, value);
    }

    @Override
    public Product.Builder addReleaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, Text.of(value));
    }

    @Override
    public Product.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public Product.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public Product.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public Product.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public Product.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public Product.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public Product.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Product.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Product.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public Product.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public Product.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Product.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Product.Builder addWeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value);
    }

    @Override
    public Product.Builder addWeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value.build());
    }

    @Override
    public Product.Builder addWeight(String value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, Text.of(value));
    }

    @Override
    public Product.Builder addWidth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public Product.Builder addWidth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public Product.Builder addWidth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public Product.Builder addWidth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public Product.Builder addWidth(String value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, Text.of(value));
    }

    @Override
    public Product.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Product.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Product.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Product.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Product.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Product.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Product build() {
      return new ProductImpl(properties, reverseMap);
    }
  }

  public ProductImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PRODUCT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAdditionalPropertyList() {
    return getProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAggregateRatingList() {
    return getProperty(CoreConstants.PROPERTY_AGGREGATE_RATING);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAudienceList() {
    return getProperty(CoreConstants.PROPERTY_AUDIENCE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAwardList() {
    return getProperty(CoreConstants.PROPERTY_AWARD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAwardsList() {
    return getProperty(CoreConstants.PROPERTY_AWARDS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBrandList() {
    return getProperty(CoreConstants.PROPERTY_BRAND);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCategoryList() {
    return getProperty(CoreConstants.PROPERTY_CATEGORY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getColorList() {
    return getProperty(CoreConstants.PROPERTY_COLOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepthList() {
    return getProperty(CoreConstants.PROPERTY_DEPTH);
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
  public ImmutableList<SchemaOrgType> getHeightList() {
    return getProperty(CoreConstants.PROPERTY_HEIGHT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsAccessoryOrSparePartForList() {
    return getProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsConsumableForList() {
    return getProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsRelatedToList() {
    return getProperty(CoreConstants.PROPERTY_IS_RELATED_TO);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsSimilarToList() {
    return getProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO);
  }

  @Override
  public ImmutableList<SchemaOrgType> getItemConditionList() {
    return getProperty(CoreConstants.PROPERTY_ITEM_CONDITION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLogoList() {
    return getProperty(CoreConstants.PROPERTY_LOGO);
  }

  @Override
  public ImmutableList<SchemaOrgType> getManufacturerList() {
    return getProperty(CoreConstants.PROPERTY_MANUFACTURER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getModelList() {
    return getProperty(CoreConstants.PROPERTY_MODEL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMpnList() {
    return getProperty(CoreConstants.PROPERTY_MPN);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOffersList() {
    return getProperty(CoreConstants.PROPERTY_OFFERS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProductIDList() {
    return getProperty(CoreConstants.PROPERTY_PRODUCT_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProductionDateList() {
    return getProperty(CoreConstants.PROPERTY_PRODUCTION_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPurchaseDateList() {
    return getProperty(CoreConstants.PROPERTY_PURCHASE_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReleaseDateList() {
    return getProperty(CoreConstants.PROPERTY_RELEASE_DATE);
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
  public ImmutableList<SchemaOrgType> getSkuList() {
    return getProperty(CoreConstants.PROPERTY_SKU);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWeightList() {
    return getProperty(CoreConstants.PROPERTY_WEIGHT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWidthList() {
    return getProperty(CoreConstants.PROPERTY_WIDTH);
  }
}
