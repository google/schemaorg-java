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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link OrderItem}. */
public class OrderItemImpl extends IntangibleImpl implements OrderItem {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_ORDER_DELIVERY);

    builder.add(CoreConstants.PROPERTY_ORDERED_ITEM);

    builder.add(CoreConstants.PROPERTY_ORDER_ITEM_NUMBER);

    builder.add(CoreConstants.PROPERTY_ORDER_ITEM_STATUS);

    builder.add(CoreConstants.PROPERTY_ORDER_QUANTITY);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<OrderItem.Builder>
      implements OrderItem.Builder {

    @Override
    public OrderItem.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public OrderItem.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public OrderItem.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public OrderItem.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public OrderItem.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public OrderItem.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public OrderItem.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public OrderItem.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public OrderItem.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public OrderItem.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public OrderItem.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public OrderItem.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public OrderItem.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public OrderItem.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public OrderItem.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public OrderItem.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public OrderItem.Builder addOrderDelivery(ParcelDelivery value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DELIVERY, value);
    }

    @Override
    public OrderItem.Builder addOrderDelivery(ParcelDelivery.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DELIVERY, value.build());
    }

    @Override
    public OrderItem.Builder addOrderDelivery(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DELIVERY, Text.of(value));
    }

    @Override
    public OrderItem.Builder addOrderedItem(OrderItem value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value);
    }

    @Override
    public OrderItem.Builder addOrderedItem(OrderItem.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value.build());
    }

    @Override
    public OrderItem.Builder addOrderedItem(Product value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value);
    }

    @Override
    public OrderItem.Builder addOrderedItem(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value.build());
    }

    @Override
    public OrderItem.Builder addOrderedItem(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, Text.of(value));
    }

    @Override
    public OrderItem.Builder addOrderItemNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_ITEM_NUMBER, value);
    }

    @Override
    public OrderItem.Builder addOrderItemNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_ITEM_NUMBER, Text.of(value));
    }

    @Override
    public OrderItem.Builder addOrderItemStatus(OrderStatus value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_ITEM_STATUS, value);
    }

    @Override
    public OrderItem.Builder addOrderItemStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_ITEM_STATUS, Text.of(value));
    }

    @Override
    public OrderItem.Builder addOrderQuantity(Number value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_QUANTITY, value);
    }

    @Override
    public OrderItem.Builder addOrderQuantity(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_QUANTITY, Text.of(value));
    }

    @Override
    public OrderItem.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public OrderItem.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public OrderItem.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public OrderItem.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public OrderItem.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public OrderItem.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public OrderItem.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public OrderItem.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public OrderItem.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public OrderItem.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public OrderItem.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public OrderItem.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public OrderItem.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public OrderItem build() {
      return new OrderItemImpl(properties, reverseMap);
    }
  }

  public OrderItemImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_ORDER_ITEM;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOrderDeliveryList() {
    return getProperty(CoreConstants.PROPERTY_ORDER_DELIVERY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOrderedItemList() {
    return getProperty(CoreConstants.PROPERTY_ORDERED_ITEM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOrderItemNumberList() {
    return getProperty(CoreConstants.PROPERTY_ORDER_ITEM_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOrderItemStatusList() {
    return getProperty(CoreConstants.PROPERTY_ORDER_ITEM_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOrderQuantityList() {
    return getProperty(CoreConstants.PROPERTY_ORDER_QUANTITY);
  }
}
