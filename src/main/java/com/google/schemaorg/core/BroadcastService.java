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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a
 * href="http://schema.org/BroadcastService">http://schema.org/BroadcastService</a>.
 */
public interface BroadcastService extends Service {

  /**
   * Builder interface of <a
   * href="http://schema.org/BroadcastService">http://schema.org/BroadcastService</a>.
   */
  public interface Builder extends Service.Builder {

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

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(AggregateRating.Builder value);

    /** Add a value to property aggregateRating. */
    Builder addAggregateRating(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property area. */
    Builder addArea(Place value);

    /** Add a value to property area. */
    Builder addArea(Place.Builder value);

    /** Add a value to property area. */
    Builder addArea(String value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(AdministrativeArea value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(AdministrativeArea.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(GeoShape value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(GeoShape.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Place value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Place.Builder value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(Text value);

    /** Add a value to property areaServed. */
    Builder addAreaServed(String value);

    /** Add a value to property availableChannel. */
    Builder addAvailableChannel(ServiceChannel value);

    /** Add a value to property availableChannel. */
    Builder addAvailableChannel(ServiceChannel.Builder value);

    /** Add a value to property availableChannel. */
    Builder addAvailableChannel(String value);

    /** Add a value to property award. */
    Builder addAward(Text value);

    /** Add a value to property award. */
    Builder addAward(String value);

    /** Add a value to property broadcastAffiliateOf. */
    Builder addBroadcastAffiliateOf(Organization value);

    /** Add a value to property broadcastAffiliateOf. */
    Builder addBroadcastAffiliateOf(Organization.Builder value);

    /** Add a value to property broadcastAffiliateOf. */
    Builder addBroadcastAffiliateOf(String value);

    /** Add a value to property broadcastDisplayName. */
    Builder addBroadcastDisplayName(Text value);

    /** Add a value to property broadcastDisplayName. */
    Builder addBroadcastDisplayName(String value);

    /** Add a value to property broadcaster. */
    Builder addBroadcaster(Organization value);

    /** Add a value to property broadcaster. */
    Builder addBroadcaster(Organization.Builder value);

    /** Add a value to property broadcaster. */
    Builder addBroadcaster(String value);

    /** Add a value to property broadcastFrequency. */
    Builder addBroadcastFrequency(BroadcastFrequencySpecification value);

    /** Add a value to property broadcastFrequency. */
    Builder addBroadcastFrequency(BroadcastFrequencySpecification.Builder value);

    /** Add a value to property broadcastFrequency. */
    Builder addBroadcastFrequency(Text value);

    /** Add a value to property broadcastFrequency. */
    Builder addBroadcastFrequency(String value);

    /** Add a value to property broadcastTimezone. */
    Builder addBroadcastTimezone(Text value);

    /** Add a value to property broadcastTimezone. */
    Builder addBroadcastTimezone(String value);

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

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property hasOfferCatalog. */
    Builder addHasOfferCatalog(OfferCatalog value);

    /** Add a value to property hasOfferCatalog. */
    Builder addHasOfferCatalog(OfferCatalog.Builder value);

    /** Add a value to property hasOfferCatalog. */
    Builder addHasOfferCatalog(String value);

    /** Add a value to property hoursAvailable. */
    Builder addHoursAvailable(OpeningHoursSpecification value);

    /** Add a value to property hoursAvailable. */
    Builder addHoursAvailable(OpeningHoursSpecification.Builder value);

    /** Add a value to property hoursAvailable. */
    Builder addHoursAvailable(String value);

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

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property offers. */
    Builder addOffers(Offer value);

    /** Add a value to property offers. */
    Builder addOffers(Offer.Builder value);

    /** Add a value to property offers. */
    Builder addOffers(String value);

    /** Add a value to property parentService. */
    Builder addParentService(BroadcastService value);

    /** Add a value to property parentService. */
    Builder addParentService(BroadcastService.Builder value);

    /** Add a value to property parentService. */
    Builder addParentService(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property produces. */
    Builder addProduces(Thing value);

    /** Add a value to property produces. */
    Builder addProduces(Thing.Builder value);

    /** Add a value to property produces. */
    Builder addProduces(String value);

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

    /** Add a value to property providerMobility. */
    Builder addProviderMobility(Text value);

    /** Add a value to property providerMobility. */
    Builder addProviderMobility(String value);

    /** Add a value to property review. */
    Builder addReview(Review value);

    /** Add a value to property review. */
    Builder addReview(Review.Builder value);

    /** Add a value to property review. */
    Builder addReview(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(AdministrativeArea value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(AdministrativeArea.Builder value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(GeoShape value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(GeoShape.Builder value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(Place value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(Place.Builder value);

    /** Add a value to property serviceArea. */
    Builder addServiceArea(String value);

    /** Add a value to property serviceAudience. */
    Builder addServiceAudience(Audience value);

    /** Add a value to property serviceAudience. */
    Builder addServiceAudience(Audience.Builder value);

    /** Add a value to property serviceAudience. */
    Builder addServiceAudience(String value);

    /** Add a value to property serviceOutput. */
    Builder addServiceOutput(Thing value);

    /** Add a value to property serviceOutput. */
    Builder addServiceOutput(Thing.Builder value);

    /** Add a value to property serviceOutput. */
    Builder addServiceOutput(String value);

    /** Add a value to property serviceType. */
    Builder addServiceType(Text value);

    /** Add a value to property serviceType. */
    Builder addServiceType(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property videoFormat. */
    Builder addVideoFormat(Text value);

    /** Add a value to property videoFormat. */
    Builder addVideoFormat(String value);

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

    /** Build a {@link BroadcastService} object. */
    BroadcastService build();
  }

  /**
   * Returns the value list of property area. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAreaList();

  /**
   * Returns the value list of property broadcastAffiliateOf. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getBroadcastAffiliateOfList();

  /**
   * Returns the value list of property broadcastDisplayName. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getBroadcastDisplayNameList();

  /**
   * Returns the value list of property broadcaster. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getBroadcasterList();

  /**
   * Returns the value list of property broadcastFrequency. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getBroadcastFrequencyList();

  /**
   * Returns the value list of property broadcastTimezone. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getBroadcastTimezoneList();

  /**
   * Returns the value list of property parentService. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getParentServiceList();

  /**
   * Returns the value list of property videoFormat. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getVideoFormatList();
}
