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

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Park}. */
public class ParkImpl extends CivicStructureImpl implements Park {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADDRESS);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BRANCH_CODE);

    builder.add(CoreConstants.PROPERTY_CONTAINED_IN);

    builder.add(CoreConstants.PROPERTY_CONTAINED_IN_PLACE);

    builder.add(CoreConstants.PROPERTY_CONTAINS_PLACE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_EVENT);

    builder.add(CoreConstants.PROPERTY_EVENTS);

    builder.add(CoreConstants.PROPERTY_FAX_NUMBER);

    builder.add(CoreConstants.PROPERTY_GEO);

    builder.add(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_HAS_MAP);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ISIC_V4);

    builder.add(CoreConstants.PROPERTY_LOGO);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MAP);

    builder.add(CoreConstants.PROPERTY_MAPS);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OPENING_HOURS);

    builder.add(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION);

    builder.add(CoreConstants.PROPERTY_PHOTO);

    builder.add(CoreConstants.PROPERTY_PHOTOS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_REVIEWS);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_TELEPHONE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Park.Builder>
      implements Park.Builder {

    @Override
    public Park.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public Park.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public Park.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public Park.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Park.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Park.Builder addAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Park.Builder addAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value.build());
    }

    @Override
    public Park.Builder addAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Park.Builder addAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, Text.of(value));
    }

    @Override
    public Park.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public Park.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public Park.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public Park.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Park.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Park.Builder addBranchCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_CODE, value);
    }

    @Override
    public Park.Builder addBranchCode(String value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_CODE, Text.of(value));
    }

    @Override
    public Park.Builder addContainedIn(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, value);
    }

    @Override
    public Park.Builder addContainedIn(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, value.build());
    }

    @Override
    public Park.Builder addContainedIn(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, Text.of(value));
    }

    @Override
    public Park.Builder addContainedInPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, value);
    }

    @Override
    public Park.Builder addContainedInPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, value.build());
    }

    @Override
    public Park.Builder addContainedInPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, Text.of(value));
    }

    @Override
    public Park.Builder addContainsPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, value);
    }

    @Override
    public Park.Builder addContainsPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, value.build());
    }

    @Override
    public Park.Builder addContainsPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, Text.of(value));
    }

    @Override
    public Park.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Park.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Park.Builder addEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value);
    }

    @Override
    public Park.Builder addEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value.build());
    }

    @Override
    public Park.Builder addEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, Text.of(value));
    }

    @Override
    public Park.Builder addEvents(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value);
    }

    @Override
    public Park.Builder addEvents(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value.build());
    }

    @Override
    public Park.Builder addEvents(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, Text.of(value));
    }

    @Override
    public Park.Builder addFaxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, value);
    }

    @Override
    public Park.Builder addFaxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, Text.of(value));
    }

    @Override
    public Park.Builder addGeo(GeoCoordinates value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value);
    }

    @Override
    public Park.Builder addGeo(GeoCoordinates.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value.build());
    }

    @Override
    public Park.Builder addGeo(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value);
    }

    @Override
    public Park.Builder addGeo(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value.build());
    }

    @Override
    public Park.Builder addGeo(String value) {
      return addProperty(CoreConstants.PROPERTY_GEO, Text.of(value));
    }

    @Override
    public Park.Builder addGlobalLocationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, value);
    }

    @Override
    public Park.Builder addGlobalLocationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, Text.of(value));
    }

    @Override
    public Park.Builder addHasMap(Map value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value);
    }

    @Override
    public Park.Builder addHasMap(Map.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value.build());
    }

    @Override
    public Park.Builder addHasMap(URL value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value);
    }

    @Override
    public Park.Builder addHasMap(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, Text.of(value));
    }

    @Override
    public Park.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Park.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Park.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Park.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Park.Builder addIsicV4(Text value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, value);
    }

    @Override
    public Park.Builder addIsicV4(String value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, Text.of(value));
    }

    @Override
    public Park.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Park.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public Park.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Park.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public Park.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Park.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Park.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Park.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Park.Builder addMap(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAP, value);
    }

    @Override
    public Park.Builder addMap(String value) {
      return addProperty(CoreConstants.PROPERTY_MAP, Text.of(value));
    }

    @Override
    public Park.Builder addMaps(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAPS, value);
    }

    @Override
    public Park.Builder addMaps(String value) {
      return addProperty(CoreConstants.PROPERTY_MAPS, Text.of(value));
    }

    @Override
    public Park.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Park.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Park.Builder addOpeningHours(Text value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS, value);
    }

    @Override
    public Park.Builder addOpeningHours(String value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS, Text.of(value));
    }

    @Override
    public Park.Builder addOpeningHoursSpecification(OpeningHoursSpecification value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, value);
    }

    @Override
    public Park.Builder addOpeningHoursSpecification(OpeningHoursSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, value.build());
    }

    @Override
    public Park.Builder addOpeningHoursSpecification(String value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, Text.of(value));
    }

    @Override
    public Park.Builder addPhoto(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value);
    }

    @Override
    public Park.Builder addPhoto(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value.build());
    }

    @Override
    public Park.Builder addPhoto(Photograph value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value);
    }

    @Override
    public Park.Builder addPhoto(Photograph.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value.build());
    }

    @Override
    public Park.Builder addPhoto(String value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, Text.of(value));
    }

    @Override
    public Park.Builder addPhotos(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value);
    }

    @Override
    public Park.Builder addPhotos(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value.build());
    }

    @Override
    public Park.Builder addPhotos(Photograph value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value);
    }

    @Override
    public Park.Builder addPhotos(Photograph.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value.build());
    }

    @Override
    public Park.Builder addPhotos(String value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, Text.of(value));
    }

    @Override
    public Park.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Park.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Park.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Park.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public Park.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public Park.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public Park.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public Park.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public Park.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public Park.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Park.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Park.Builder addTelephone(Text value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, value);
    }

    @Override
    public Park.Builder addTelephone(String value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, Text.of(value));
    }

    @Override
    public Park.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Park.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Park.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Park.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Park.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Park.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Park.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Park.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Park build() {
      return new ParkImpl(properties, reverseMap);
    }
  }

  public ParkImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PARK;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
