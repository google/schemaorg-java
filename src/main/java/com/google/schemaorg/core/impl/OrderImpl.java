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

/** Implementation of {@link Order}. */
public class OrderImpl extends IntangibleImpl implements Order {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACCEPTED_OFFER);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BILLING_ADDRESS);

    builder.add(CoreConstants.PROPERTY_BROKER);

    builder.add(CoreConstants.PROPERTY_CONFIRMATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_CUSTOMER);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DISCOUNT);

    builder.add(CoreConstants.PROPERTY_DISCOUNT_CODE);

    builder.add(CoreConstants.PROPERTY_DISCOUNT_CURRENCY);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IS_GIFT);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MERCHANT);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_ORDER_DATE);

    builder.add(CoreConstants.PROPERTY_ORDER_DELIVERY);

    builder.add(CoreConstants.PROPERTY_ORDERED_ITEM);

    builder.add(CoreConstants.PROPERTY_ORDER_NUMBER);

    builder.add(CoreConstants.PROPERTY_ORDER_STATUS);

    builder.add(CoreConstants.PROPERTY_PART_OF_INVOICE);

    builder.add(CoreConstants.PROPERTY_PAYMENT_DUE);

    builder.add(CoreConstants.PROPERTY_PAYMENT_DUE_DATE);

    builder.add(CoreConstants.PROPERTY_PAYMENT_METHOD);

    builder.add(CoreConstants.PROPERTY_PAYMENT_METHOD_ID);

    builder.add(CoreConstants.PROPERTY_PAYMENT_URL);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SELLER);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Order.Builder>
      implements Order.Builder {

    @Override
    public Order.Builder addAcceptedOffer(Offer value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_OFFER, value);
    }

    @Override
    public Order.Builder addAcceptedOffer(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_OFFER, value.build());
    }

    @Override
    public Order.Builder addAcceptedOffer(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCEPTED_OFFER, Text.of(value));
    }

    @Override
    public Order.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Order.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Order.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Order.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Order.Builder addBillingAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_ADDRESS, value);
    }

    @Override
    public Order.Builder addBillingAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_ADDRESS, value.build());
    }

    @Override
    public Order.Builder addBillingAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_ADDRESS, Text.of(value));
    }

    @Override
    public Order.Builder addBroker(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public Order.Builder addBroker(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public Order.Builder addBroker(Person value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public Order.Builder addBroker(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public Order.Builder addBroker(String value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, Text.of(value));
    }

    @Override
    public Order.Builder addConfirmationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONFIRMATION_NUMBER, value);
    }

    @Override
    public Order.Builder addConfirmationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_CONFIRMATION_NUMBER, Text.of(value));
    }

    @Override
    public Order.Builder addCustomer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value);
    }

    @Override
    public Order.Builder addCustomer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value.build());
    }

    @Override
    public Order.Builder addCustomer(Person value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value);
    }

    @Override
    public Order.Builder addCustomer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value.build());
    }

    @Override
    public Order.Builder addCustomer(String value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, Text.of(value));
    }

    @Override
    public Order.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Order.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Order.Builder addDiscount(Number value) {
      return addProperty(CoreConstants.PROPERTY_DISCOUNT, value);
    }

    @Override
    public Order.Builder addDiscount(Text value) {
      return addProperty(CoreConstants.PROPERTY_DISCOUNT, value);
    }

    @Override
    public Order.Builder addDiscount(String value) {
      return addProperty(CoreConstants.PROPERTY_DISCOUNT, Text.of(value));
    }

    @Override
    public Order.Builder addDiscountCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_DISCOUNT_CODE, value);
    }

    @Override
    public Order.Builder addDiscountCode(String value) {
      return addProperty(CoreConstants.PROPERTY_DISCOUNT_CODE, Text.of(value));
    }

    @Override
    public Order.Builder addDiscountCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_DISCOUNT_CURRENCY, value);
    }

    @Override
    public Order.Builder addDiscountCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_DISCOUNT_CURRENCY, Text.of(value));
    }

    @Override
    public Order.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Order.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Order.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Order.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Order.Builder addIsGift(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_GIFT, value);
    }

    @Override
    public Order.Builder addIsGift(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_GIFT, Text.of(value));
    }

    @Override
    public Order.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Order.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Order.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Order.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Order.Builder addMerchant(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MERCHANT, value);
    }

    @Override
    public Order.Builder addMerchant(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MERCHANT, value.build());
    }

    @Override
    public Order.Builder addMerchant(Person value) {
      return addProperty(CoreConstants.PROPERTY_MERCHANT, value);
    }

    @Override
    public Order.Builder addMerchant(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MERCHANT, value.build());
    }

    @Override
    public Order.Builder addMerchant(String value) {
      return addProperty(CoreConstants.PROPERTY_MERCHANT, Text.of(value));
    }

    @Override
    public Order.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Order.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Order.Builder addOrderDate(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DATE, value);
    }

    @Override
    public Order.Builder addOrderDate(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DATE, Text.of(value));
    }

    @Override
    public Order.Builder addOrderDelivery(ParcelDelivery value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DELIVERY, value);
    }

    @Override
    public Order.Builder addOrderDelivery(ParcelDelivery.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DELIVERY, value.build());
    }

    @Override
    public Order.Builder addOrderDelivery(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_DELIVERY, Text.of(value));
    }

    @Override
    public Order.Builder addOrderedItem(OrderItem value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value);
    }

    @Override
    public Order.Builder addOrderedItem(OrderItem.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value.build());
    }

    @Override
    public Order.Builder addOrderedItem(Product value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value);
    }

    @Override
    public Order.Builder addOrderedItem(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, value.build());
    }

    @Override
    public Order.Builder addOrderedItem(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDERED_ITEM, Text.of(value));
    }

    @Override
    public Order.Builder addOrderNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_NUMBER, value);
    }

    @Override
    public Order.Builder addOrderNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_NUMBER, Text.of(value));
    }

    @Override
    public Order.Builder addOrderStatus(OrderStatus value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_STATUS, value);
    }

    @Override
    public Order.Builder addOrderStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_ORDER_STATUS, Text.of(value));
    }

    @Override
    public Order.Builder addPartOfInvoice(Invoice value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_INVOICE, value);
    }

    @Override
    public Order.Builder addPartOfInvoice(Invoice.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_INVOICE, value.build());
    }

    @Override
    public Order.Builder addPartOfInvoice(String value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_INVOICE, Text.of(value));
    }

    @Override
    public Order.Builder addPaymentDue(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE, value);
    }

    @Override
    public Order.Builder addPaymentDue(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE, Text.of(value));
    }

    @Override
    public Order.Builder addPaymentDueDate(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE_DATE, value);
    }

    @Override
    public Order.Builder addPaymentDueDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE_DATE, Text.of(value));
    }

    @Override
    public Order.Builder addPaymentMethod(PaymentMethod value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD, value);
    }

    @Override
    public Order.Builder addPaymentMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD, Text.of(value));
    }

    @Override
    public Order.Builder addPaymentMethodId(Text value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD_ID, value);
    }

    @Override
    public Order.Builder addPaymentMethodId(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD_ID, Text.of(value));
    }

    @Override
    public Order.Builder addPaymentUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_URL, value);
    }

    @Override
    public Order.Builder addPaymentUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_URL, Text.of(value));
    }

    @Override
    public Order.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Order.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Order.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Order.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Order.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Order.Builder addSeller(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Order.Builder addSeller(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Order.Builder addSeller(Person value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value);
    }

    @Override
    public Order.Builder addSeller(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, value.build());
    }

    @Override
    public Order.Builder addSeller(String value) {
      return addProperty(CoreConstants.PROPERTY_SELLER, Text.of(value));
    }

    @Override
    public Order.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Order.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Order.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Order.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Order.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Order.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Order.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Order.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Order build() {
      return new OrderImpl(properties, reverseMap);
    }
  }

  public OrderImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_ORDER;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAcceptedOfferList() {
    return getProperty(CoreConstants.PROPERTY_ACCEPTED_OFFER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBillingAddressList() {
    return getProperty(CoreConstants.PROPERTY_BILLING_ADDRESS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBrokerList() {
    return getProperty(CoreConstants.PROPERTY_BROKER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getConfirmationNumberList() {
    return getProperty(CoreConstants.PROPERTY_CONFIRMATION_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCustomerList() {
    return getProperty(CoreConstants.PROPERTY_CUSTOMER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDiscountList() {
    return getProperty(CoreConstants.PROPERTY_DISCOUNT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDiscountCodeList() {
    return getProperty(CoreConstants.PROPERTY_DISCOUNT_CODE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDiscountCurrencyList() {
    return getProperty(CoreConstants.PROPERTY_DISCOUNT_CURRENCY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsGiftList() {
    return getProperty(CoreConstants.PROPERTY_IS_GIFT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMerchantList() {
    return getProperty(CoreConstants.PROPERTY_MERCHANT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOrderDateList() {
    return getProperty(CoreConstants.PROPERTY_ORDER_DATE);
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
  public ImmutableList<SchemaOrgType> getOrderNumberList() {
    return getProperty(CoreConstants.PROPERTY_ORDER_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOrderStatusList() {
    return getProperty(CoreConstants.PROPERTY_ORDER_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPartOfInvoiceList() {
    return getProperty(CoreConstants.PROPERTY_PART_OF_INVOICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPaymentDueList() {
    return getProperty(CoreConstants.PROPERTY_PAYMENT_DUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPaymentDueDateList() {
    return getProperty(CoreConstants.PROPERTY_PAYMENT_DUE_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPaymentMethodList() {
    return getProperty(CoreConstants.PROPERTY_PAYMENT_METHOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPaymentMethodIdList() {
    return getProperty(CoreConstants.PROPERTY_PAYMENT_METHOD_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPaymentUrlList() {
    return getProperty(CoreConstants.PROPERTY_PAYMENT_URL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSellerList() {
    return getProperty(CoreConstants.PROPERTY_SELLER);
  }
}
