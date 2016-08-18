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
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a
 * href="http://schema.org/MotorcycleDealer}">http://schema.org/MotorcycleDealer}</a>.
 */
public interface MotorcycleDealer extends AutomotiveBusiness {

  /**
   * Builder interface of <a
   * href="http://schema.org/MotorcycleDealer}">http://schema.org/MotorcycleDealer}</a>.
   */
  public interface Builder extends AutomotiveBusiness.Builder {

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

    /** Add a value to property alumni. */
    Builder addAlumni(Person value);

    /** Add a value to property alumni. */
    Builder addAlumni(Person.Builder value);

    /** Add a value to property alumni. */
    Builder addAlumni(String value);

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

    /** Add a value to property award. */
    Builder addAward(Text value);

    /** Add a value to property award. */
    Builder addAward(String value);

    /** Add a value to property awards. */
    Builder addAwards(Text value);

    /** Add a value to property awards. */
    Builder addAwards(String value);

    /** Add a value to property branchCode. */
    Builder addBranchCode(Text value);

    /** Add a value to property branchCode. */
    Builder addBranchCode(String value);

    /** Add a value to property branchOf. */
    Builder addBranchOf(Organization value);

    /** Add a value to property branchOf. */
    Builder addBranchOf(Organization.Builder value);

    /** Add a value to property branchOf. */
    Builder addBranchOf(String value);

    /** Add a value to property brand. */
    Builder addBrand(Brand value);

    /** Add a value to property brand. */
    Builder addBrand(Brand.Builder value);

    /** Add a value to property brand. */
    Builder addBrand(Organization value);

    /** Add a value to property brand. */
    Builder addBrand(Organization.Builder value);

    /** Add a value to property brand. */
    Builder addBrand(String value);

    /** Add a value to property contactPoint. */
    Builder addContactPoint(ContactPoint value);

    /** Add a value to property contactPoint. */
    Builder addContactPoint(ContactPoint.Builder value);

    /** Add a value to property contactPoint. */
    Builder addContactPoint(String value);

    /** Add a value to property contactPoints. */
    Builder addContactPoints(ContactPoint value);

    /** Add a value to property contactPoints. */
    Builder addContactPoints(ContactPoint.Builder value);

    /** Add a value to property contactPoints. */
    Builder addContactPoints(String value);

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

    /** Add a value to property currenciesAccepted. */
    Builder addCurrenciesAccepted(Text value);

    /** Add a value to property currenciesAccepted. */
    Builder addCurrenciesAccepted(String value);

    /** Add a value to property department. */
    Builder addDepartment(Organization value);

    /** Add a value to property department. */
    Builder addDepartment(Organization.Builder value);

    /** Add a value to property department. */
    Builder addDepartment(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property dissolutionDate. */
    Builder addDissolutionDate(Date value);

    /** Add a value to property dissolutionDate. */
    Builder addDissolutionDate(String value);

    /** Add a value to property duns. */
    Builder addDuns(Text value);

    /** Add a value to property duns. */
    Builder addDuns(String value);

    /** Add a value to property email. */
    Builder addEmail(Text value);

    /** Add a value to property email. */
    Builder addEmail(String value);

    /** Add a value to property employee. */
    Builder addEmployee(Person value);

    /** Add a value to property employee. */
    Builder addEmployee(Person.Builder value);

    /** Add a value to property employee. */
    Builder addEmployee(String value);

    /** Add a value to property employees. */
    Builder addEmployees(Person value);

    /** Add a value to property employees. */
    Builder addEmployees(Person.Builder value);

    /** Add a value to property employees. */
    Builder addEmployees(String value);

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

    /** Add a value to property founder. */
    Builder addFounder(Person value);

    /** Add a value to property founder. */
    Builder addFounder(Person.Builder value);

    /** Add a value to property founder. */
    Builder addFounder(String value);

    /** Add a value to property founders. */
    Builder addFounders(Person value);

    /** Add a value to property founders. */
    Builder addFounders(Person.Builder value);

    /** Add a value to property founders. */
    Builder addFounders(String value);

    /** Add a value to property foundingDate. */
    Builder addFoundingDate(Date value);

    /** Add a value to property foundingDate. */
    Builder addFoundingDate(String value);

    /** Add a value to property foundingLocation. */
    Builder addFoundingLocation(Place value);

    /** Add a value to property foundingLocation. */
    Builder addFoundingLocation(Place.Builder value);

    /** Add a value to property foundingLocation. */
    Builder addFoundingLocation(String value);

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

    /** Add a value to property hasOfferCatalog. */
    Builder addHasOfferCatalog(OfferCatalog value);

    /** Add a value to property hasOfferCatalog. */
    Builder addHasOfferCatalog(OfferCatalog.Builder value);

    /** Add a value to property hasOfferCatalog. */
    Builder addHasOfferCatalog(String value);

    /** Add a value to property hasPOS. */
    Builder addHasPOS(Place value);

    /** Add a value to property hasPOS. */
    Builder addHasPOS(Place.Builder value);

    /** Add a value to property hasPOS. */
    Builder addHasPOS(String value);

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

    /** Add a value to property legalName. */
    Builder addLegalName(Text value);

    /** Add a value to property legalName. */
    Builder addLegalName(String value);

    /** Add a value to property location. */
    Builder addLocation(Place value);

    /** Add a value to property location. */
    Builder addLocation(Place.Builder value);

    /** Add a value to property location. */
    Builder addLocation(PostalAddress value);

    /** Add a value to property location. */
    Builder addLocation(PostalAddress.Builder value);

    /** Add a value to property location. */
    Builder addLocation(Text value);

    /** Add a value to property location. */
    Builder addLocation(String value);

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

    /** Add a value to property makesOffer. */
    Builder addMakesOffer(Offer value);

    /** Add a value to property makesOffer. */
    Builder addMakesOffer(Offer.Builder value);

    /** Add a value to property makesOffer. */
    Builder addMakesOffer(String value);

    /** Add a value to property map. */
    Builder addMap(URL value);

    /** Add a value to property map. */
    Builder addMap(String value);

    /** Add a value to property maps. */
    Builder addMaps(URL value);

    /** Add a value to property maps. */
    Builder addMaps(String value);

    /** Add a value to property member. */
    Builder addMember(Organization value);

    /** Add a value to property member. */
    Builder addMember(Organization.Builder value);

    /** Add a value to property member. */
    Builder addMember(Person value);

    /** Add a value to property member. */
    Builder addMember(Person.Builder value);

    /** Add a value to property member. */
    Builder addMember(String value);

    /** Add a value to property memberOf. */
    Builder addMemberOf(Organization value);

    /** Add a value to property memberOf. */
    Builder addMemberOf(Organization.Builder value);

    /** Add a value to property memberOf. */
    Builder addMemberOf(ProgramMembership value);

    /** Add a value to property memberOf. */
    Builder addMemberOf(ProgramMembership.Builder value);

    /** Add a value to property memberOf. */
    Builder addMemberOf(String value);

    /** Add a value to property members. */
    Builder addMembers(Organization value);

    /** Add a value to property members. */
    Builder addMembers(Organization.Builder value);

    /** Add a value to property members. */
    Builder addMembers(Person value);

    /** Add a value to property members. */
    Builder addMembers(Person.Builder value);

    /** Add a value to property members. */
    Builder addMembers(String value);

    /** Add a value to property naics. */
    Builder addNaics(Text value);

    /** Add a value to property naics. */
    Builder addNaics(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property numberOfEmployees. */
    Builder addNumberOfEmployees(QuantitativeValue value);

    /** Add a value to property numberOfEmployees. */
    Builder addNumberOfEmployees(QuantitativeValue.Builder value);

    /** Add a value to property numberOfEmployees. */
    Builder addNumberOfEmployees(String value);

    /** Add a value to property openingHours. */
    Builder addOpeningHours(Text value);

    /** Add a value to property openingHours. */
    Builder addOpeningHours(String value);

    /** Add a value to property openingHoursSpecification. */
    Builder addOpeningHoursSpecification(OpeningHoursSpecification value);

    /** Add a value to property openingHoursSpecification. */
    Builder addOpeningHoursSpecification(OpeningHoursSpecification.Builder value);

    /** Add a value to property openingHoursSpecification. */
    Builder addOpeningHoursSpecification(String value);

    /** Add a value to property owns. */
    Builder addOwns(OwnershipInfo value);

    /** Add a value to property owns. */
    Builder addOwns(OwnershipInfo.Builder value);

    /** Add a value to property owns. */
    Builder addOwns(Product value);

    /** Add a value to property owns. */
    Builder addOwns(Product.Builder value);

    /** Add a value to property owns. */
    Builder addOwns(String value);

    /** Add a value to property parentOrganization. */
    Builder addParentOrganization(Organization value);

    /** Add a value to property parentOrganization. */
    Builder addParentOrganization(Organization.Builder value);

    /** Add a value to property parentOrganization. */
    Builder addParentOrganization(String value);

    /** Add a value to property paymentAccepted. */
    Builder addPaymentAccepted(Text value);

    /** Add a value to property paymentAccepted. */
    Builder addPaymentAccepted(String value);

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

    /** Add a value to property priceRange. */
    Builder addPriceRange(Text value);

    /** Add a value to property priceRange. */
    Builder addPriceRange(String value);

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

    /** Add a value to property seeks. */
    Builder addSeeks(Demand value);

    /** Add a value to property seeks. */
    Builder addSeeks(Demand.Builder value);

    /** Add a value to property seeks. */
    Builder addSeeks(String value);

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

    /** Add a value to property subOrganization. */
    Builder addSubOrganization(Organization value);

    /** Add a value to property subOrganization. */
    Builder addSubOrganization(Organization.Builder value);

    /** Add a value to property subOrganization. */
    Builder addSubOrganization(String value);

    /** Add a value to property taxID. */
    Builder addTaxID(Text value);

    /** Add a value to property taxID. */
    Builder addTaxID(String value);

    /** Add a value to property telephone. */
    Builder addTelephone(Text value);

    /** Add a value to property telephone. */
    Builder addTelephone(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property vatID. */
    Builder addVatID(Text value);

    /** Add a value to property vatID. */
    Builder addVatID(String value);

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

    /** Build a {@link MotorcycleDealer} object. */
    MotorcycleDealer build();
  }
}
