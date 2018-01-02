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

import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/Waterfall">http://schema.org/Waterfall</a>. */
public interface Waterfall extends BodyOfWater {

  /**
   * Builder interface of <a href="http://schema.org/Waterfall">http://schema.org/Waterfall</a>.
   */
  public interface Builder extends BodyOfWater.Builder {

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

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(PropertyValue value);

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(PropertyValue.Builder value);

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property address. */
    Builder addAddress(PostalAddress value);

    /** Add a value to property address. */
    Builder addAddress(PostalAddress.Builder value);

    /** Add a value to property address. */
    Builder addAddress(Text value);

    /** Add a value to property address. */
    Builder addAddress(String value);

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

    /** Add a value to property branchCode. */
    Builder addBranchCode(Text value);

    /** Add a value to property branchCode. */
    Builder addBranchCode(String value);

    /** Add a value to property containedIn. */
    Builder addContainedIn(Place value);

    /** Add a value to property containedIn. */
    Builder addContainedIn(Place.Builder value);

    /** Add a value to property containedIn. */
    Builder addContainedIn(String value);

    /** Add a value to property containedInPlace. */
    Builder addContainedInPlace(Place value);

    /** Add a value to property containedInPlace. */
    Builder addContainedInPlace(Place.Builder value);

    /** Add a value to property containedInPlace. */
    Builder addContainedInPlace(String value);

    /** Add a value to property containsPlace. */
    Builder addContainsPlace(Place value);

    /** Add a value to property containsPlace. */
    Builder addContainsPlace(Place.Builder value);

    /** Add a value to property containsPlace. */
    Builder addContainsPlace(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property event. */
    Builder addEvent(Event value);

    /** Add a value to property event. */
    Builder addEvent(Event.Builder value);

    /** Add a value to property event. */
    Builder addEvent(String value);

    /** Add a value to property events. */
    Builder addEvents(Event value);

    /** Add a value to property events. */
    Builder addEvents(Event.Builder value);

    /** Add a value to property events. */
    Builder addEvents(String value);

    /** Add a value to property faxNumber. */
    Builder addFaxNumber(Text value);

    /** Add a value to property faxNumber. */
    Builder addFaxNumber(String value);

    /** Add a value to property geo. */
    Builder addGeo(GeoCoordinates value);

    /** Add a value to property geo. */
    Builder addGeo(GeoCoordinates.Builder value);

    /** Add a value to property geo. */
    Builder addGeo(GeoShape value);

    /** Add a value to property geo. */
    Builder addGeo(GeoShape.Builder value);

    /** Add a value to property geo. */
    Builder addGeo(String value);

    /** Add a value to property globalLocationNumber. */
    Builder addGlobalLocationNumber(Text value);

    /** Add a value to property globalLocationNumber. */
    Builder addGlobalLocationNumber(String value);

    /** Add a value to property hasMap. */
    Builder addHasMap(Map value);

    /** Add a value to property hasMap. */
    Builder addHasMap(Map.Builder value);

    /** Add a value to property hasMap. */
    Builder addHasMap(URL value);

    /** Add a value to property hasMap. */
    Builder addHasMap(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property isicV4. */
    Builder addIsicV4(Text value);

    /** Add a value to property isicV4. */
    Builder addIsicV4(String value);

    /** Add a value to property logo. */
    Builder addLogo(ImageObject value);

    /** Add a value to property logo. */
    Builder addLogo(ImageObject.Builder value);

    /** Add a value to property logo. */
    Builder addLogo(URL value);

    /** Add a value to property logo. */
    Builder addLogo(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property map. */
    Builder addMap(URL value);

    /** Add a value to property map. */
    Builder addMap(String value);

    /** Add a value to property maps. */
    Builder addMaps(URL value);

    /** Add a value to property maps. */
    Builder addMaps(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property openingHoursSpecification. */
    Builder addOpeningHoursSpecification(OpeningHoursSpecification value);

    /** Add a value to property openingHoursSpecification. */
    Builder addOpeningHoursSpecification(OpeningHoursSpecification.Builder value);

    /** Add a value to property openingHoursSpecification. */
    Builder addOpeningHoursSpecification(String value);

    /** Add a value to property photo. */
    Builder addPhoto(ImageObject value);

    /** Add a value to property photo. */
    Builder addPhoto(ImageObject.Builder value);

    /** Add a value to property photo. */
    Builder addPhoto(Photograph value);

    /** Add a value to property photo. */
    Builder addPhoto(Photograph.Builder value);

    /** Add a value to property photo. */
    Builder addPhoto(String value);

    /** Add a value to property photos. */
    Builder addPhotos(ImageObject value);

    /** Add a value to property photos. */
    Builder addPhotos(ImageObject.Builder value);

    /** Add a value to property photos. */
    Builder addPhotos(Photograph value);

    /** Add a value to property photos. */
    Builder addPhotos(Photograph.Builder value);

    /** Add a value to property photos. */
    Builder addPhotos(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property review. */
    Builder addReview(Review value);

    /** Add a value to property review. */
    Builder addReview(Review.Builder value);

    /** Add a value to property review. */
    Builder addReview(String value);

    /** Add a value to property reviews. */
    Builder addReviews(Review value);

    /** Add a value to property reviews. */
    Builder addReviews(Review.Builder value);

    /** Add a value to property reviews. */
    Builder addReviews(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property telephone. */
    Builder addTelephone(Text value);

    /** Add a value to property telephone. */
    Builder addTelephone(String value);

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

    /** Build a {@link Waterfall} object. */
    Waterfall build();
  }
}
