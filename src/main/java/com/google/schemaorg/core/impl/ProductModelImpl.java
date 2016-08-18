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

/** Implementation of {@link ProductModel}. */
public class ProductModelImpl extends ProductImpl implements ProductModel {
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

    builder.add(CoreConstants.PROPERTY_IS_VARIANT_OF);

    builder.add(CoreConstants.PROPERTY_ITEM_CONDITION);

    builder.add(CoreConstants.PROPERTY_LOGO);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MANUFACTURER);

    builder.add(CoreConstants.PROPERTY_MODEL);

    builder.add(CoreConstants.PROPERTY_MPN);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PREDECESSOR_OF);

    builder.add(CoreConstants.PROPERTY_PRODUCT_ID);

    builder.add(CoreConstants.PROPERTY_PRODUCTION_DATE);

    builder.add(CoreConstants.PROPERTY_PURCHASE_DATE);

    builder.add(CoreConstants.PROPERTY_RELEASE_DATE);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_REVIEWS);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SKU);

    builder.add(CoreConstants.PROPERTY_SUCCESSOR_OF);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_WEIGHT);

    builder.add(CoreConstants.PROPERTY_WIDTH);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<ProductModel.Builder>
      implements ProductModel.Builder {

    @Override
    public ProductModel.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public ProductModel.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public ProductModel.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public ProductModel.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public ProductModel.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public ProductModel.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public ProductModel.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public ProductModel.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public ProductModel.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public ProductModel.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public ProductModel.Builder addAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value);
    }

    @Override
    public ProductModel.Builder addAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, value.build());
    }

    @Override
    public ProductModel.Builder addAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_AUDIENCE, Text.of(value));
    }

    @Override
    public ProductModel.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public ProductModel.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public ProductModel.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public ProductModel.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public ProductModel.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public ProductModel.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public ProductModel.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public ProductModel.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public ProductModel.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public ProductModel.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public ProductModel.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public ProductModel.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public ProductModel.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public ProductModel.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public ProductModel.Builder addColor(Text value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, value);
    }

    @Override
    public ProductModel.Builder addColor(String value) {
      return addProperty(CoreConstants.PROPERTY_COLOR, Text.of(value));
    }

    @Override
    public ProductModel.Builder addDepth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public ProductModel.Builder addDepth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public ProductModel.Builder addDepth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value);
    }

    @Override
    public ProductModel.Builder addDepth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, value.build());
    }

    @Override
    public ProductModel.Builder addDepth(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPTH, Text.of(value));
    }

    @Override
    public ProductModel.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public ProductModel.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public ProductModel.Builder addGtin12(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, value);
    }

    @Override
    public ProductModel.Builder addGtin12(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN12, Text.of(value));
    }

    @Override
    public ProductModel.Builder addGtin13(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, value);
    }

    @Override
    public ProductModel.Builder addGtin13(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN13, Text.of(value));
    }

    @Override
    public ProductModel.Builder addGtin14(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, value);
    }

    @Override
    public ProductModel.Builder addGtin14(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN14, Text.of(value));
    }

    @Override
    public ProductModel.Builder addGtin8(Text value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, value);
    }

    @Override
    public ProductModel.Builder addGtin8(String value) {
      return addProperty(CoreConstants.PROPERTY_GTIN8, Text.of(value));
    }

    @Override
    public ProductModel.Builder addHeight(Distance value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public ProductModel.Builder addHeight(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public ProductModel.Builder addHeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public ProductModel.Builder addHeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public ProductModel.Builder addHeight(String value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, Text.of(value));
    }

    @Override
    public ProductModel.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ProductModel.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public ProductModel.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ProductModel.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public ProductModel.Builder addIsAccessoryOrSparePartFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value);
    }

    @Override
    public ProductModel.Builder addIsAccessoryOrSparePartFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, value.build());
    }

    @Override
    public ProductModel.Builder addIsAccessoryOrSparePartFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_ACCESSORY_OR_SPARE_PART_FOR, Text.of(value));
    }

    @Override
    public ProductModel.Builder addIsConsumableFor(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value);
    }

    @Override
    public ProductModel.Builder addIsConsumableFor(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, value.build());
    }

    @Override
    public ProductModel.Builder addIsConsumableFor(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_CONSUMABLE_FOR, Text.of(value));
    }

    @Override
    public ProductModel.Builder addIsRelatedTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value);
    }

    @Override
    public ProductModel.Builder addIsRelatedTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, value.build());
    }

    @Override
    public ProductModel.Builder addIsRelatedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_RELATED_TO, Text.of(value));
    }

    @Override
    public ProductModel.Builder addIsSimilarTo(Product value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value);
    }

    @Override
    public ProductModel.Builder addIsSimilarTo(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, value.build());
    }

    @Override
    public ProductModel.Builder addIsSimilarTo(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_SIMILAR_TO, Text.of(value));
    }

    @Override
    public ProductModel.Builder addIsVariantOf(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_IS_VARIANT_OF, value);
    }

    @Override
    public ProductModel.Builder addIsVariantOf(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IS_VARIANT_OF, value.build());
    }

    @Override
    public ProductModel.Builder addIsVariantOf(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_VARIANT_OF, Text.of(value));
    }

    @Override
    public ProductModel.Builder addItemCondition(OfferItemCondition value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, value);
    }

    @Override
    public ProductModel.Builder addItemCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_CONDITION, Text.of(value));
    }

    @Override
    public ProductModel.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public ProductModel.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public ProductModel.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public ProductModel.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public ProductModel.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ProductModel.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public ProductModel.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ProductModel.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public ProductModel.Builder addManufacturer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value);
    }

    @Override
    public ProductModel.Builder addManufacturer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value.build());
    }

    @Override
    public ProductModel.Builder addManufacturer(String value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, Text.of(value));
    }

    @Override
    public ProductModel.Builder addModel(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public ProductModel.Builder addModel(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value.build());
    }

    @Override
    public ProductModel.Builder addModel(Text value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, value);
    }

    @Override
    public ProductModel.Builder addModel(String value) {
      return addProperty(CoreConstants.PROPERTY_MODEL, Text.of(value));
    }

    @Override
    public ProductModel.Builder addMpn(Text value) {
      return addProperty(CoreConstants.PROPERTY_MPN, value);
    }

    @Override
    public ProductModel.Builder addMpn(String value) {
      return addProperty(CoreConstants.PROPERTY_MPN, Text.of(value));
    }

    @Override
    public ProductModel.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public ProductModel.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public ProductModel.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public ProductModel.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public ProductModel.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public ProductModel.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public ProductModel.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public ProductModel.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public ProductModel.Builder addPredecessorOf(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_PREDECESSOR_OF, value);
    }

    @Override
    public ProductModel.Builder addPredecessorOf(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PREDECESSOR_OF, value.build());
    }

    @Override
    public ProductModel.Builder addPredecessorOf(String value) {
      return addProperty(CoreConstants.PROPERTY_PREDECESSOR_OF, Text.of(value));
    }

    @Override
    public ProductModel.Builder addProductID(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, value);
    }

    @Override
    public ProductModel.Builder addProductID(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_ID, Text.of(value));
    }

    @Override
    public ProductModel.Builder addProductionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, value);
    }

    @Override
    public ProductModel.Builder addProductionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCTION_DATE, Text.of(value));
    }

    @Override
    public ProductModel.Builder addPurchaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, value);
    }

    @Override
    public ProductModel.Builder addPurchaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PURCHASE_DATE, Text.of(value));
    }

    @Override
    public ProductModel.Builder addReleaseDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, value);
    }

    @Override
    public ProductModel.Builder addReleaseDate(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEASE_DATE, Text.of(value));
    }

    @Override
    public ProductModel.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public ProductModel.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public ProductModel.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public ProductModel.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public ProductModel.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public ProductModel.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public ProductModel.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public ProductModel.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public ProductModel.Builder addSku(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKU, value);
    }

    @Override
    public ProductModel.Builder addSku(String value) {
      return addProperty(CoreConstants.PROPERTY_SKU, Text.of(value));
    }

    @Override
    public ProductModel.Builder addSuccessorOf(ProductModel value) {
      return addProperty(CoreConstants.PROPERTY_SUCCESSOR_OF, value);
    }

    @Override
    public ProductModel.Builder addSuccessorOf(ProductModel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUCCESSOR_OF, value.build());
    }

    @Override
    public ProductModel.Builder addSuccessorOf(String value) {
      return addProperty(CoreConstants.PROPERTY_SUCCESSOR_OF, Text.of(value));
    }

    @Override
    public ProductModel.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public ProductModel.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public ProductModel.Builder addWeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value);
    }

    @Override
    public ProductModel.Builder addWeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value.build());
    }

    @Override
    public ProductModel.Builder addWeight(String value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, Text.of(value));
    }

    @Override
    public ProductModel.Builder addWidth(Distance value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public ProductModel.Builder addWidth(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public ProductModel.Builder addWidth(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value);
    }

    @Override
    public ProductModel.Builder addWidth(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, value.build());
    }

    @Override
    public ProductModel.Builder addWidth(String value) {
      return addProperty(CoreConstants.PROPERTY_WIDTH, Text.of(value));
    }

    @Override
    public ProductModel.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public ProductModel.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public ProductModel.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public ProductModel.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public ProductModel.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public ProductModel.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public ProductModel build() {
      return new ProductModelImpl(properties, reverseMap);
    }
  }

  public ProductModelImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PRODUCT_MODEL;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsVariantOfList() {
    return getProperty(CoreConstants.PROPERTY_IS_VARIANT_OF);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPredecessorOfList() {
    return getProperty(CoreConstants.PROPERTY_PREDECESSOR_OF);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSuccessorOfList() {
    return getProperty(CoreConstants.PROPERTY_SUCCESSOR_OF);
  }
}
