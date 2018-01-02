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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a href="http://schema.org/ParcelDelivery">http://schema.org/ParcelDelivery</a>.
 */
public interface ParcelDelivery extends Intangible {

  /**
   * Builder interface of <a
   * href="http://schema.org/ParcelDelivery">http://schema.org/ParcelDelivery</a>.
   */
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

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property carrier. */
    Builder addCarrier(Organization value);

    /** Add a value to property carrier. */
    Builder addCarrier(Organization.Builder value);

    /** Add a value to property carrier. */
    Builder addCarrier(String value);

    /** Add a value to property deliveryAddress. */
    Builder addDeliveryAddress(PostalAddress value);

    /** Add a value to property deliveryAddress. */
    Builder addDeliveryAddress(PostalAddress.Builder value);

    /** Add a value to property deliveryAddress. */
    Builder addDeliveryAddress(String value);

    /** Add a value to property deliveryStatus. */
    Builder addDeliveryStatus(DeliveryEvent value);

    /** Add a value to property deliveryStatus. */
    Builder addDeliveryStatus(DeliveryEvent.Builder value);

    /** Add a value to property deliveryStatus. */
    Builder addDeliveryStatus(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property expectedArrivalFrom. */
    Builder addExpectedArrivalFrom(DateTime value);

    /** Add a value to property expectedArrivalFrom. */
    Builder addExpectedArrivalFrom(String value);

    /** Add a value to property expectedArrivalUntil. */
    Builder addExpectedArrivalUntil(DateTime value);

    /** Add a value to property expectedArrivalUntil. */
    Builder addExpectedArrivalUntil(String value);

    /** Add a value to property hasDeliveryMethod. */
    Builder addHasDeliveryMethod(DeliveryMethod value);

    /** Add a value to property hasDeliveryMethod. */
    Builder addHasDeliveryMethod(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property itemShipped. */
    Builder addItemShipped(Product value);

    /** Add a value to property itemShipped. */
    Builder addItemShipped(Product.Builder value);

    /** Add a value to property itemShipped. */
    Builder addItemShipped(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property originAddress. */
    Builder addOriginAddress(PostalAddress value);

    /** Add a value to property originAddress. */
    Builder addOriginAddress(PostalAddress.Builder value);

    /** Add a value to property originAddress. */
    Builder addOriginAddress(String value);

    /** Add a value to property partOfOrder. */
    Builder addPartOfOrder(Order value);

    /** Add a value to property partOfOrder. */
    Builder addPartOfOrder(Order.Builder value);

    /** Add a value to property partOfOrder. */
    Builder addPartOfOrder(String value);

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

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property trackingNumber. */
    Builder addTrackingNumber(Text value);

    /** Add a value to property trackingNumber. */
    Builder addTrackingNumber(String value);

    /** Add a value to property trackingUrl. */
    Builder addTrackingUrl(URL value);

    /** Add a value to property trackingUrl. */
    Builder addTrackingUrl(String value);

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

    /** Build a {@link ParcelDelivery} object. */
    ParcelDelivery build();
  }

  /**
   * Returns the value list of property carrier. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCarrierList();

  /**
   * Returns the value list of property deliveryAddress. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDeliveryAddressList();

  /**
   * Returns the value list of property deliveryStatus. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getDeliveryStatusList();

  /**
   * Returns the value list of property expectedArrivalFrom. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getExpectedArrivalFromList();

  /**
   * Returns the value list of property expectedArrivalUntil. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getExpectedArrivalUntilList();

  /**
   * Returns the value list of property hasDeliveryMethod. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getHasDeliveryMethodList();

  /**
   * Returns the value list of property itemShipped. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getItemShippedList();

  /**
   * Returns the value list of property originAddress. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getOriginAddressList();

  /**
   * Returns the value list of property partOfOrder. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getPartOfOrderList();

  /**
   * Returns the value list of property provider. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getProviderList();

  /**
   * Returns the value list of property trackingNumber. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getTrackingNumberList();

  /**
   * Returns the value list of property trackingUrl. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getTrackingUrlList();
}
