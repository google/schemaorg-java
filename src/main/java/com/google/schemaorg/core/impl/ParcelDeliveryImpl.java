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

/** Implementation of {@link ParcelDelivery}. */
public class ParcelDeliveryImpl extends IntangibleImpl implements ParcelDelivery {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CARRIER);

    builder.add(CoreConstants.PROPERTY_DELIVERY_ADDRESS);

    builder.add(CoreConstants.PROPERTY_DELIVERY_STATUS);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_FROM);

    builder.add(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_UNTIL);

    builder.add(CoreConstants.PROPERTY_HAS_DELIVERY_METHOD);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ITEM_SHIPPED);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_ORIGIN_ADDRESS);

    builder.add(CoreConstants.PROPERTY_PART_OF_ORDER);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_TRACKING_NUMBER);

    builder.add(CoreConstants.PROPERTY_TRACKING_URL);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<ParcelDelivery.Builder>
      implements ParcelDelivery.Builder {

    @Override
    public ParcelDelivery.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public ParcelDelivery.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public ParcelDelivery.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addCarrier(Organization value) {
      return addProperty(CoreConstants.PROPERTY_CARRIER, value);
    }

    @Override
    public ParcelDelivery.Builder addCarrier(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CARRIER, value.build());
    }

    @Override
    public ParcelDelivery.Builder addCarrier(String value) {
      return addProperty(CoreConstants.PROPERTY_CARRIER, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addDeliveryAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_ADDRESS, value);
    }

    @Override
    public ParcelDelivery.Builder addDeliveryAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_ADDRESS, value.build());
    }

    @Override
    public ParcelDelivery.Builder addDeliveryAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_ADDRESS, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addDeliveryStatus(DeliveryEvent value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_STATUS, value);
    }

    @Override
    public ParcelDelivery.Builder addDeliveryStatus(DeliveryEvent.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_STATUS, value.build());
    }

    @Override
    public ParcelDelivery.Builder addDeliveryStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_DELIVERY_STATUS, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public ParcelDelivery.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addExpectedArrivalFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_FROM, value);
    }

    @Override
    public ParcelDelivery.Builder addExpectedArrivalFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_FROM, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addExpectedArrivalUntil(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_UNTIL, value);
    }

    @Override
    public ParcelDelivery.Builder addExpectedArrivalUntil(String value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_UNTIL, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addHasDeliveryMethod(DeliveryMethod value) {
      return addProperty(CoreConstants.PROPERTY_HAS_DELIVERY_METHOD, value);
    }

    @Override
    public ParcelDelivery.Builder addHasDeliveryMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_DELIVERY_METHOD, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ParcelDelivery.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public ParcelDelivery.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ParcelDelivery.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addItemShipped(Product value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_SHIPPED, value);
    }

    @Override
    public ParcelDelivery.Builder addItemShipped(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_SHIPPED, value.build());
    }

    @Override
    public ParcelDelivery.Builder addItemShipped(String value) {
      return addProperty(CoreConstants.PROPERTY_ITEM_SHIPPED, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ParcelDelivery.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public ParcelDelivery.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ParcelDelivery.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public ParcelDelivery.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addOriginAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ORIGIN_ADDRESS, value);
    }

    @Override
    public ParcelDelivery.Builder addOriginAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ORIGIN_ADDRESS, value.build());
    }

    @Override
    public ParcelDelivery.Builder addOriginAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ORIGIN_ADDRESS, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addPartOfOrder(Order value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_ORDER, value);
    }

    @Override
    public ParcelDelivery.Builder addPartOfOrder(Order.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_ORDER, value.build());
    }

    @Override
    public ParcelDelivery.Builder addPartOfOrder(String value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_ORDER, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public ParcelDelivery.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public ParcelDelivery.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public ParcelDelivery.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public ParcelDelivery.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public ParcelDelivery.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public ParcelDelivery.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public ParcelDelivery.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addTrackingNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_TRACKING_NUMBER, value);
    }

    @Override
    public ParcelDelivery.Builder addTrackingNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_TRACKING_NUMBER, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addTrackingUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_TRACKING_URL, value);
    }

    @Override
    public ParcelDelivery.Builder addTrackingUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_TRACKING_URL, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public ParcelDelivery.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public ParcelDelivery.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public ParcelDelivery.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public ParcelDelivery.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public ParcelDelivery.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public ParcelDelivery.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public ParcelDelivery build() {
      return new ParcelDeliveryImpl(properties, reverseMap);
    }
  }

  public ParcelDeliveryImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PARCEL_DELIVERY;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCarrierList() {
    return getProperty(CoreConstants.PROPERTY_CARRIER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDeliveryAddressList() {
    return getProperty(CoreConstants.PROPERTY_DELIVERY_ADDRESS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDeliveryStatusList() {
    return getProperty(CoreConstants.PROPERTY_DELIVERY_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getExpectedArrivalFromList() {
    return getProperty(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_FROM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getExpectedArrivalUntilList() {
    return getProperty(CoreConstants.PROPERTY_EXPECTED_ARRIVAL_UNTIL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHasDeliveryMethodList() {
    return getProperty(CoreConstants.PROPERTY_HAS_DELIVERY_METHOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getItemShippedList() {
    return getProperty(CoreConstants.PROPERTY_ITEM_SHIPPED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOriginAddressList() {
    return getProperty(CoreConstants.PROPERTY_ORIGIN_ADDRESS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPartOfOrderList() {
    return getProperty(CoreConstants.PROPERTY_PART_OF_ORDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProviderList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTrackingNumberList() {
    return getProperty(CoreConstants.PROPERTY_TRACKING_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTrackingUrlList() {
    return getProperty(CoreConstants.PROPERTY_TRACKING_URL);
  }
}
