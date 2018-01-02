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
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/Order">http://schema.org/Order</a>. */
public interface Order extends Intangible {

  /** Builder interface of <a href="http://schema.org/Order">http://schema.org/Order</a>. */
  public interface Builder extends Intangible.Builder {

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

    /** Add a value to property acceptedOffer. */
    Builder addAcceptedOffer(Offer value);

    /** Add a value to property acceptedOffer. */
    Builder addAcceptedOffer(Offer.Builder value);

    /** Add a value to property acceptedOffer. */
    Builder addAcceptedOffer(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property billingAddress. */
    Builder addBillingAddress(PostalAddress value);

    /** Add a value to property billingAddress. */
    Builder addBillingAddress(PostalAddress.Builder value);

    /** Add a value to property billingAddress. */
    Builder addBillingAddress(String value);

    /** Add a value to property broker. */
    Builder addBroker(Organization value);

    /** Add a value to property broker. */
    Builder addBroker(Organization.Builder value);

    /** Add a value to property broker. */
    Builder addBroker(Person value);

    /** Add a value to property broker. */
    Builder addBroker(Person.Builder value);

    /** Add a value to property broker. */
    Builder addBroker(String value);

    /** Add a value to property confirmationNumber. */
    Builder addConfirmationNumber(Text value);

    /** Add a value to property confirmationNumber. */
    Builder addConfirmationNumber(String value);

    /** Add a value to property customer. */
    Builder addCustomer(Organization value);

    /** Add a value to property customer. */
    Builder addCustomer(Organization.Builder value);

    /** Add a value to property customer. */
    Builder addCustomer(Person value);

    /** Add a value to property customer. */
    Builder addCustomer(Person.Builder value);

    /** Add a value to property customer. */
    Builder addCustomer(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property discount. */
    Builder addDiscount(Number value);

    /** Add a value to property discount. */
    Builder addDiscount(Text value);

    /** Add a value to property discount. */
    Builder addDiscount(String value);

    /** Add a value to property discountCode. */
    Builder addDiscountCode(Text value);

    /** Add a value to property discountCode. */
    Builder addDiscountCode(String value);

    /** Add a value to property discountCurrency. */
    Builder addDiscountCurrency(Text value);

    /** Add a value to property discountCurrency. */
    Builder addDiscountCurrency(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property isGift. */
    Builder addIsGift(Boolean value);

    /** Add a value to property isGift. */
    Builder addIsGift(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property merchant. */
    Builder addMerchant(Organization value);

    /** Add a value to property merchant. */
    Builder addMerchant(Organization.Builder value);

    /** Add a value to property merchant. */
    Builder addMerchant(Person value);

    /** Add a value to property merchant. */
    Builder addMerchant(Person.Builder value);

    /** Add a value to property merchant. */
    Builder addMerchant(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property orderDate. */
    Builder addOrderDate(DateTime value);

    /** Add a value to property orderDate. */
    Builder addOrderDate(String value);

    /** Add a value to property orderDelivery. */
    Builder addOrderDelivery(ParcelDelivery value);

    /** Add a value to property orderDelivery. */
    Builder addOrderDelivery(ParcelDelivery.Builder value);

    /** Add a value to property orderDelivery. */
    Builder addOrderDelivery(String value);

    /** Add a value to property orderedItem. */
    Builder addOrderedItem(OrderItem value);

    /** Add a value to property orderedItem. */
    Builder addOrderedItem(OrderItem.Builder value);

    /** Add a value to property orderedItem. */
    Builder addOrderedItem(Product value);

    /** Add a value to property orderedItem. */
    Builder addOrderedItem(Product.Builder value);

    /** Add a value to property orderedItem. */
    Builder addOrderedItem(String value);

    /** Add a value to property orderNumber. */
    Builder addOrderNumber(Text value);

    /** Add a value to property orderNumber. */
    Builder addOrderNumber(String value);

    /** Add a value to property orderStatus. */
    Builder addOrderStatus(OrderStatus value);

    /** Add a value to property orderStatus. */
    Builder addOrderStatus(String value);

    /** Add a value to property partOfInvoice. */
    Builder addPartOfInvoice(Invoice value);

    /** Add a value to property partOfInvoice. */
    Builder addPartOfInvoice(Invoice.Builder value);

    /** Add a value to property partOfInvoice. */
    Builder addPartOfInvoice(String value);

    /** Add a value to property paymentDue. */
    Builder addPaymentDue(DateTime value);

    /** Add a value to property paymentDue. */
    Builder addPaymentDue(String value);

    /** Add a value to property paymentDueDate. */
    Builder addPaymentDueDate(DateTime value);

    /** Add a value to property paymentDueDate. */
    Builder addPaymentDueDate(String value);

    /** Add a value to property paymentMethod. */
    Builder addPaymentMethod(PaymentMethod value);

    /** Add a value to property paymentMethod. */
    Builder addPaymentMethod(String value);

    /** Add a value to property paymentMethodId. */
    Builder addPaymentMethodId(Text value);

    /** Add a value to property paymentMethodId. */
    Builder addPaymentMethodId(String value);

    /** Add a value to property paymentUrl. */
    Builder addPaymentUrl(URL value);

    /** Add a value to property paymentUrl. */
    Builder addPaymentUrl(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

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

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

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

    /** Build a {@link Order} object. */
    Order build();
  }

  /**
   * Returns the value list of property acceptedOffer. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAcceptedOfferList();

  /**
   * Returns the value list of property billingAddress. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getBillingAddressList();

  /**
   * Returns the value list of property broker. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBrokerList();

  /**
   * Returns the value list of property confirmationNumber. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getConfirmationNumberList();

  /**
   * Returns the value list of property customer. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCustomerList();

  /**
   * Returns the value list of property discount. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getDiscountList();

  /**
   * Returns the value list of property discountCode. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDiscountCodeList();

  /**
   * Returns the value list of property discountCurrency. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDiscountCurrencyList();

  /**
   * Returns the value list of property isGift. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getIsGiftList();

  /**
   * Returns the value list of property merchant. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getMerchantList();

  /**
   * Returns the value list of property orderDate. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getOrderDateList();

  /**
   * Returns the value list of property orderDelivery. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getOrderDeliveryList();

  /**
   * Returns the value list of property orderedItem. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getOrderedItemList();

  /**
   * Returns the value list of property orderNumber. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getOrderNumberList();

  /**
   * Returns the value list of property orderStatus. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getOrderStatusList();

  /**
   * Returns the value list of property partOfInvoice. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPartOfInvoiceList();

  /**
   * Returns the value list of property paymentDue. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getPaymentDueList();

  /**
   * Returns the value list of property paymentDueDate. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPaymentDueDateList();

  /**
   * Returns the value list of property paymentMethod. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPaymentMethodList();

  /**
   * Returns the value list of property paymentMethodId. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPaymentMethodIdList();

  /**
   * Returns the value list of property paymentUrl. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getPaymentUrlList();

  /**
   * Returns the value list of property seller. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSellerList();
}
