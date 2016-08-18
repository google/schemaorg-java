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
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Invoice}. */
public class InvoiceImpl extends IntangibleImpl implements Invoice {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACCOUNT_ID);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BILLING_PERIOD);

    builder.add(CoreConstants.PROPERTY_BROKER);

    builder.add(CoreConstants.PROPERTY_CATEGORY);

    builder.add(CoreConstants.PROPERTY_CONFIRMATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_CUSTOMER);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MINIMUM_PAYMENT_DUE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_PAYMENT_DUE);

    builder.add(CoreConstants.PROPERTY_PAYMENT_DUE_DATE);

    builder.add(CoreConstants.PROPERTY_PAYMENT_METHOD);

    builder.add(CoreConstants.PROPERTY_PAYMENT_METHOD_ID);

    builder.add(CoreConstants.PROPERTY_PAYMENT_STATUS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_REFERENCES_ORDER);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SCHEDULED_PAYMENT_DATE);

    builder.add(CoreConstants.PROPERTY_TOTAL_PAYMENT_DUE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Invoice.Builder>
      implements Invoice.Builder {

    @Override
    public Invoice.Builder addAccountId(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNT_ID, value);
    }

    @Override
    public Invoice.Builder addAccountId(String value) {
      return addProperty(CoreConstants.PROPERTY_ACCOUNT_ID, Text.of(value));
    }

    @Override
    public Invoice.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Invoice.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Invoice.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Invoice.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Invoice.Builder addBillingPeriod(Duration value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_PERIOD, value);
    }

    @Override
    public Invoice.Builder addBillingPeriod(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_PERIOD, value.build());
    }

    @Override
    public Invoice.Builder addBillingPeriod(String value) {
      return addProperty(CoreConstants.PROPERTY_BILLING_PERIOD, Text.of(value));
    }

    @Override
    public Invoice.Builder addBroker(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public Invoice.Builder addBroker(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public Invoice.Builder addBroker(Person value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public Invoice.Builder addBroker(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public Invoice.Builder addBroker(String value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, Text.of(value));
    }

    @Override
    public Invoice.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Invoice.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Invoice.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public Invoice.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public Invoice.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public Invoice.Builder addConfirmationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONFIRMATION_NUMBER, value);
    }

    @Override
    public Invoice.Builder addConfirmationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_CONFIRMATION_NUMBER, Text.of(value));
    }

    @Override
    public Invoice.Builder addCustomer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value);
    }

    @Override
    public Invoice.Builder addCustomer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value.build());
    }

    @Override
    public Invoice.Builder addCustomer(Person value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value);
    }

    @Override
    public Invoice.Builder addCustomer(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, value.build());
    }

    @Override
    public Invoice.Builder addCustomer(String value) {
      return addProperty(CoreConstants.PROPERTY_CUSTOMER, Text.of(value));
    }

    @Override
    public Invoice.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Invoice.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Invoice.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Invoice.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Invoice.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Invoice.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Invoice.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Invoice.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Invoice.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Invoice.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Invoice.Builder addMinimumPaymentDue(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_MINIMUM_PAYMENT_DUE, value);
    }

    @Override
    public Invoice.Builder addMinimumPaymentDue(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MINIMUM_PAYMENT_DUE, value.build());
    }

    @Override
    public Invoice.Builder addMinimumPaymentDue(String value) {
      return addProperty(CoreConstants.PROPERTY_MINIMUM_PAYMENT_DUE, Text.of(value));
    }

    @Override
    public Invoice.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Invoice.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Invoice.Builder addPaymentDue(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE, value);
    }

    @Override
    public Invoice.Builder addPaymentDue(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE, Text.of(value));
    }

    @Override
    public Invoice.Builder addPaymentDueDate(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE_DATE, value);
    }

    @Override
    public Invoice.Builder addPaymentDueDate(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_DUE_DATE, Text.of(value));
    }

    @Override
    public Invoice.Builder addPaymentMethod(PaymentMethod value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD, value);
    }

    @Override
    public Invoice.Builder addPaymentMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD, Text.of(value));
    }

    @Override
    public Invoice.Builder addPaymentMethodId(Text value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD_ID, value);
    }

    @Override
    public Invoice.Builder addPaymentMethodId(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_METHOD_ID, Text.of(value));
    }

    @Override
    public Invoice.Builder addPaymentStatus(PaymentStatusType value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_STATUS, value);
    }

    @Override
    public Invoice.Builder addPaymentStatus(Text value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_STATUS, value);
    }

    @Override
    public Invoice.Builder addPaymentStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_STATUS, Text.of(value));
    }

    @Override
    public Invoice.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Invoice.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Invoice.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Invoice.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public Invoice.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public Invoice.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public Invoice.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public Invoice.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public Invoice.Builder addReferencesOrder(Order value) {
      return addProperty(CoreConstants.PROPERTY_REFERENCES_ORDER, value);
    }

    @Override
    public Invoice.Builder addReferencesOrder(Order.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REFERENCES_ORDER, value.build());
    }

    @Override
    public Invoice.Builder addReferencesOrder(String value) {
      return addProperty(CoreConstants.PROPERTY_REFERENCES_ORDER, Text.of(value));
    }

    @Override
    public Invoice.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Invoice.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Invoice.Builder addScheduledPaymentDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_SCHEDULED_PAYMENT_DATE, value);
    }

    @Override
    public Invoice.Builder addScheduledPaymentDate(String value) {
      return addProperty(CoreConstants.PROPERTY_SCHEDULED_PAYMENT_DATE, Text.of(value));
    }

    @Override
    public Invoice.Builder addTotalPaymentDue(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PAYMENT_DUE, value);
    }

    @Override
    public Invoice.Builder addTotalPaymentDue(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PAYMENT_DUE, value.build());
    }

    @Override
    public Invoice.Builder addTotalPaymentDue(String value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PAYMENT_DUE, Text.of(value));
    }

    @Override
    public Invoice.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Invoice.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Invoice.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Invoice.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Invoice.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Invoice.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Invoice.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Invoice.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Invoice build() {
      return new InvoiceImpl(properties, reverseMap);
    }
  }

  public InvoiceImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_INVOICE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAccountIdList() {
    return getProperty(CoreConstants.PROPERTY_ACCOUNT_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBillingPeriodList() {
    return getProperty(CoreConstants.PROPERTY_BILLING_PERIOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBrokerList() {
    return getProperty(CoreConstants.PROPERTY_BROKER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCategoryList() {
    return getProperty(CoreConstants.PROPERTY_CATEGORY);
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
  public ImmutableList<SchemaOrgType> getMinimumPaymentDueList() {
    return getProperty(CoreConstants.PROPERTY_MINIMUM_PAYMENT_DUE);
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
  public ImmutableList<SchemaOrgType> getPaymentStatusList() {
    return getProperty(CoreConstants.PROPERTY_PAYMENT_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProviderList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReferencesOrderList() {
    return getProperty(CoreConstants.PROPERTY_REFERENCES_ORDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getScheduledPaymentDateList() {
    return getProperty(CoreConstants.PROPERTY_SCHEDULED_PAYMENT_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTotalPaymentDueList() {
    return getProperty(CoreConstants.PROPERTY_TOTAL_PAYMENT_DUE);
  }
}
