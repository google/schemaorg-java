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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/Invoice">http://schema.org/Invoice</a>. */
public interface Invoice extends Intangible {

  /** Builder interface of <a href="http://schema.org/Invoice">http://schema.org/Invoice</a>. */
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

    /** Add a value to property accountId. */
    Builder addAccountId(Text value);

    /** Add a value to property accountId. */
    Builder addAccountId(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property billingPeriod. */
    Builder addBillingPeriod(Duration value);

    /** Add a value to property billingPeriod. */
    Builder addBillingPeriod(Duration.Builder value);

    /** Add a value to property billingPeriod. */
    Builder addBillingPeriod(String value);

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

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property minimumPaymentDue. */
    Builder addMinimumPaymentDue(PriceSpecification value);

    /** Add a value to property minimumPaymentDue. */
    Builder addMinimumPaymentDue(PriceSpecification.Builder value);

    /** Add a value to property minimumPaymentDue. */
    Builder addMinimumPaymentDue(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

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

    /** Add a value to property paymentStatus. */
    Builder addPaymentStatus(PaymentStatusType value);

    /** Add a value to property paymentStatus. */
    Builder addPaymentStatus(Text value);

    /** Add a value to property paymentStatus. */
    Builder addPaymentStatus(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property provider. */
    Builder addProvider(Organization value);

    /** Add a value to property provider. */
    Builder addProvider(Organization.Builder value);

    /** Add a value to property provider. */
    Builder addProvider(Person value);

    /** Add a value to property provider. */
    Builder addProvider(Person.Builder value);

    /** Add a value to property provider. */
    Builder addProvider(String value);

    /** Add a value to property referencesOrder. */
    Builder addReferencesOrder(Order value);

    /** Add a value to property referencesOrder. */
    Builder addReferencesOrder(Order.Builder value);

    /** Add a value to property referencesOrder. */
    Builder addReferencesOrder(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property scheduledPaymentDate. */
    Builder addScheduledPaymentDate(Date value);

    /** Add a value to property scheduledPaymentDate. */
    Builder addScheduledPaymentDate(String value);

    /** Add a value to property totalPaymentDue. */
    Builder addTotalPaymentDue(PriceSpecification value);

    /** Add a value to property totalPaymentDue. */
    Builder addTotalPaymentDue(PriceSpecification.Builder value);

    /** Add a value to property totalPaymentDue. */
    Builder addTotalPaymentDue(String value);

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

    /** Build a {@link Invoice} object. */
    Invoice build();
  }

  /**
   * Returns the value list of property accountId. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAccountIdList();

  /**
   * Returns the value list of property billingPeriod. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getBillingPeriodList();

  /**
   * Returns the value list of property broker. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBrokerList();

  /**
   * Returns the value list of property category. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCategoryList();

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
   * Returns the value list of property minimumPaymentDue. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getMinimumPaymentDueList();

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
   * Returns the value list of property paymentStatus. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPaymentStatusList();

  /**
   * Returns the value list of property provider. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getProviderList();

  /**
   * Returns the value list of property referencesOrder. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getReferencesOrderList();

  /**
   * Returns the value list of property scheduledPaymentDate. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getScheduledPaymentDateList();

  /**
   * Returns the value list of property totalPaymentDue. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getTotalPaymentDueList();
}
