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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link BroadcastService}. */
public class BroadcastServiceImpl extends ServiceImpl implements BroadcastService {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AREA);

    builder.add(CoreConstants.PROPERTY_AREA_SERVED);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_CHANNEL);

    builder.add(CoreConstants.PROPERTY_AWARD);

    builder.add(CoreConstants.PROPERTY_BROADCAST_AFFILIATE_OF);

    builder.add(CoreConstants.PROPERTY_BROADCAST_DISPLAY_NAME);

    builder.add(CoreConstants.PROPERTY_BROADCASTER);

    builder.add(CoreConstants.PROPERTY_BROADCAST_FREQUENCY);

    builder.add(CoreConstants.PROPERTY_BROADCAST_TIMEZONE);

    builder.add(CoreConstants.PROPERTY_CATEGORY);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_HAS_OFFER_CATALOG);

    builder.add(CoreConstants.PROPERTY_HOURS_AVAILABLE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OFFERS);

    builder.add(CoreConstants.PROPERTY_PARENT_SERVICE);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRODUCES);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_PROVIDER_MOBILITY);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SERVICE_AREA);

    builder.add(CoreConstants.PROPERTY_SERVICE_AUDIENCE);

    builder.add(CoreConstants.PROPERTY_SERVICE_OUTPUT);

    builder.add(CoreConstants.PROPERTY_SERVICE_TYPE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VIDEO_FORMAT);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<BroadcastService.Builder>
      implements BroadcastService.Builder {

    @Override
    public BroadcastService.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public BroadcastService.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public BroadcastService.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public BroadcastService.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public BroadcastService.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addArea(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA, value);
    }

    @Override
    public BroadcastService.Builder addArea(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA, value.build());
    }

    @Override
    public BroadcastService.Builder addArea(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public BroadcastService.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public BroadcastService.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public BroadcastService.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public BroadcastService.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public BroadcastService.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public BroadcastService.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public BroadcastService.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addAvailableChannel(ServiceChannel value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_CHANNEL, value);
    }

    @Override
    public BroadcastService.Builder addAvailableChannel(ServiceChannel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_CHANNEL, value.build());
    }

    @Override
    public BroadcastService.Builder addAvailableChannel(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_CHANNEL, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public BroadcastService.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addBroadcastAffiliateOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_AFFILIATE_OF, value);
    }

    @Override
    public BroadcastService.Builder addBroadcastAffiliateOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_AFFILIATE_OF, value.build());
    }

    @Override
    public BroadcastService.Builder addBroadcastAffiliateOf(String value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_AFFILIATE_OF, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addBroadcastDisplayName(Text value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_DISPLAY_NAME, value);
    }

    @Override
    public BroadcastService.Builder addBroadcastDisplayName(String value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_DISPLAY_NAME, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addBroadcaster(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BROADCASTER, value);
    }

    @Override
    public BroadcastService.Builder addBroadcaster(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROADCASTER, value.build());
    }

    @Override
    public BroadcastService.Builder addBroadcaster(String value) {
      return addProperty(CoreConstants.PROPERTY_BROADCASTER, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addBroadcastFrequency(BroadcastFrequencySpecification value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_FREQUENCY, value);
    }

    @Override
    public BroadcastService.Builder addBroadcastFrequency(
        BroadcastFrequencySpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_FREQUENCY, value.build());
    }

    @Override
    public BroadcastService.Builder addBroadcastFrequency(Text value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_FREQUENCY, value);
    }

    @Override
    public BroadcastService.Builder addBroadcastFrequency(String value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_FREQUENCY, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addBroadcastTimezone(Text value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_TIMEZONE, value);
    }

    @Override
    public BroadcastService.Builder addBroadcastTimezone(String value) {
      return addProperty(CoreConstants.PROPERTY_BROADCAST_TIMEZONE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addCategory(PhysicalActivityCategory value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public BroadcastService.Builder addCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public BroadcastService.Builder addCategory(Thing value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value);
    }

    @Override
    public BroadcastService.Builder addCategory(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, value.build());
    }

    @Override
    public BroadcastService.Builder addCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_CATEGORY, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public BroadcastService.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addHasOfferCatalog(OfferCatalog value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value);
    }

    @Override
    public BroadcastService.Builder addHasOfferCatalog(OfferCatalog.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value.build());
    }

    @Override
    public BroadcastService.Builder addHasOfferCatalog(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addHoursAvailable(OpeningHoursSpecification value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, value);
    }

    @Override
    public BroadcastService.Builder addHoursAvailable(OpeningHoursSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, value.build());
    }

    @Override
    public BroadcastService.Builder addHoursAvailable(String value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public BroadcastService.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public BroadcastService.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public BroadcastService.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public BroadcastService.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public BroadcastService.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public BroadcastService.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public BroadcastService.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addOffers(Offer value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value);
    }

    @Override
    public BroadcastService.Builder addOffers(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, value.build());
    }

    @Override
    public BroadcastService.Builder addOffers(String value) {
      return addProperty(CoreConstants.PROPERTY_OFFERS, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addParentService(BroadcastService value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_SERVICE, value);
    }

    @Override
    public BroadcastService.Builder addParentService(BroadcastService.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_SERVICE, value.build());
    }

    @Override
    public BroadcastService.Builder addParentService(String value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_SERVICE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public BroadcastService.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public BroadcastService.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addProduces(Thing value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCES, value);
    }

    @Override
    public BroadcastService.Builder addProduces(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCES, value.build());
    }

    @Override
    public BroadcastService.Builder addProduces(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCES, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public BroadcastService.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public BroadcastService.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public BroadcastService.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public BroadcastService.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addProviderMobility(Text value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER_MOBILITY, value);
    }

    @Override
    public BroadcastService.Builder addProviderMobility(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER_MOBILITY, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public BroadcastService.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public BroadcastService.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public BroadcastService.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addServiceArea(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public BroadcastService.Builder addServiceArea(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public BroadcastService.Builder addServiceArea(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public BroadcastService.Builder addServiceArea(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public BroadcastService.Builder addServiceArea(Place value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public BroadcastService.Builder addServiceArea(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public BroadcastService.Builder addServiceArea(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addServiceAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AUDIENCE, value);
    }

    @Override
    public BroadcastService.Builder addServiceAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AUDIENCE, value.build());
    }

    @Override
    public BroadcastService.Builder addServiceAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AUDIENCE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addServiceOutput(Thing value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_OUTPUT, value);
    }

    @Override
    public BroadcastService.Builder addServiceOutput(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_OUTPUT, value.build());
    }

    @Override
    public BroadcastService.Builder addServiceOutput(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_OUTPUT, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addServiceType(Text value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_TYPE, value);
    }

    @Override
    public BroadcastService.Builder addServiceType(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_TYPE, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public BroadcastService.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addVideoFormat(Text value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO_FORMAT, value);
    }

    @Override
    public BroadcastService.Builder addVideoFormat(String value) {
      return addProperty(CoreConstants.PROPERTY_VIDEO_FORMAT, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public BroadcastService.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public BroadcastService.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public BroadcastService.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public BroadcastService.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public BroadcastService.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public BroadcastService build() {
      return new BroadcastServiceImpl(properties, reverseMap);
    }
  }

  public BroadcastServiceImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_BROADCAST_SERVICE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAreaList() {
    return getProperty(CoreConstants.PROPERTY_AREA);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBroadcastAffiliateOfList() {
    return getProperty(CoreConstants.PROPERTY_BROADCAST_AFFILIATE_OF);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBroadcastDisplayNameList() {
    return getProperty(CoreConstants.PROPERTY_BROADCAST_DISPLAY_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBroadcasterList() {
    return getProperty(CoreConstants.PROPERTY_BROADCASTER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBroadcastFrequencyList() {
    return getProperty(CoreConstants.PROPERTY_BROADCAST_FREQUENCY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBroadcastTimezoneList() {
    return getProperty(CoreConstants.PROPERTY_BROADCAST_TIMEZONE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getParentServiceList() {
    return getProperty(CoreConstants.PROPERTY_PARENT_SERVICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVideoFormatList() {
    return getProperty(CoreConstants.PROPERTY_VIDEO_FORMAT);
  }
}
