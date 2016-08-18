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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Organization}. */
public class OrganizationImpl extends PlaceOrganizationCommonImpl implements Organization {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADDRESS);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ALUMNI);

    builder.add(CoreConstants.PROPERTY_AREA_SERVED);

    builder.add(CoreConstants.PROPERTY_AWARD);

    builder.add(CoreConstants.PROPERTY_AWARDS);

    builder.add(CoreConstants.PROPERTY_BRAND);

    builder.add(CoreConstants.PROPERTY_CONTACT_POINT);

    builder.add(CoreConstants.PROPERTY_CONTACT_POINTS);

    builder.add(CoreConstants.PROPERTY_DEPARTMENT);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DISSOLUTION_DATE);

    builder.add(CoreConstants.PROPERTY_DUNS);

    builder.add(CoreConstants.PROPERTY_EMAIL);

    builder.add(CoreConstants.PROPERTY_EMPLOYEE);

    builder.add(CoreConstants.PROPERTY_EMPLOYEES);

    builder.add(CoreConstants.PROPERTY_EVENT);

    builder.add(CoreConstants.PROPERTY_EVENTS);

    builder.add(CoreConstants.PROPERTY_FAX_NUMBER);

    builder.add(CoreConstants.PROPERTY_FOUNDER);

    builder.add(CoreConstants.PROPERTY_FOUNDERS);

    builder.add(CoreConstants.PROPERTY_FOUNDING_DATE);

    builder.add(CoreConstants.PROPERTY_FOUNDING_LOCATION);

    builder.add(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_HAS_OFFER_CATALOG);

    builder.add(CoreConstants.PROPERTY_HAS_POS);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ISIC_V4);

    builder.add(CoreConstants.PROPERTY_LEGAL_NAME);

    builder.add(CoreConstants.PROPERTY_LOCATION);

    builder.add(CoreConstants.PROPERTY_LOGO);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MAKES_OFFER);

    builder.add(CoreConstants.PROPERTY_MEMBER);

    builder.add(CoreConstants.PROPERTY_MEMBER_OF);

    builder.add(CoreConstants.PROPERTY_MEMBERS);

    builder.add(CoreConstants.PROPERTY_NAICS);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES);

    builder.add(CoreConstants.PROPERTY_OWNS);

    builder.add(CoreConstants.PROPERTY_PARENT_ORGANIZATION);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_REVIEW);

    builder.add(CoreConstants.PROPERTY_REVIEWS);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SEEKS);

    builder.add(CoreConstants.PROPERTY_SERVICE_AREA);

    builder.add(CoreConstants.PROPERTY_SUB_ORGANIZATION);

    builder.add(CoreConstants.PROPERTY_TAX_ID);

    builder.add(CoreConstants.PROPERTY_TELEPHONE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VAT_ID);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Organization.Builder>
      implements Organization.Builder {

    @Override
    public Organization.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Organization.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Organization.Builder addAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Organization.Builder addAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value.build());
    }

    @Override
    public Organization.Builder addAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Organization.Builder addAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, Text.of(value));
    }

    @Override
    public Organization.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public Organization.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public Organization.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public Organization.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Organization.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Organization.Builder addAlumni(Person value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, value);
    }

    @Override
    public Organization.Builder addAlumni(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, value.build());
    }

    @Override
    public Organization.Builder addAlumni(String value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, Text.of(value));
    }

    @Override
    public Organization.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Organization.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Organization.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Organization.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Organization.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Organization.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Organization.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Organization.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public Organization.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public Organization.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public Organization.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public Organization.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public Organization.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Organization.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Organization.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Organization.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Organization.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public Organization.Builder addContactPoint(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value);
    }

    @Override
    public Organization.Builder addContactPoint(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value.build());
    }

    @Override
    public Organization.Builder addContactPoint(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, Text.of(value));
    }

    @Override
    public Organization.Builder addContactPoints(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value);
    }

    @Override
    public Organization.Builder addContactPoints(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value.build());
    }

    @Override
    public Organization.Builder addContactPoints(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, Text.of(value));
    }

    @Override
    public Organization.Builder addDepartment(Organization value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, value);
    }

    @Override
    public Organization.Builder addDepartment(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, value.build());
    }

    @Override
    public Organization.Builder addDepartment(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, Text.of(value));
    }

    @Override
    public Organization.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Organization.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Organization.Builder addDissolutionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_DISSOLUTION_DATE, value);
    }

    @Override
    public Organization.Builder addDissolutionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_DISSOLUTION_DATE, Text.of(value));
    }

    @Override
    public Organization.Builder addDuns(Text value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, value);
    }

    @Override
    public Organization.Builder addDuns(String value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, Text.of(value));
    }

    @Override
    public Organization.Builder addEmail(Text value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, value);
    }

    @Override
    public Organization.Builder addEmail(String value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, Text.of(value));
    }

    @Override
    public Organization.Builder addEmployee(Person value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, value);
    }

    @Override
    public Organization.Builder addEmployee(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, value.build());
    }

    @Override
    public Organization.Builder addEmployee(String value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, Text.of(value));
    }

    @Override
    public Organization.Builder addEmployees(Person value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, value);
    }

    @Override
    public Organization.Builder addEmployees(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, value.build());
    }

    @Override
    public Organization.Builder addEmployees(String value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, Text.of(value));
    }

    @Override
    public Organization.Builder addEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value);
    }

    @Override
    public Organization.Builder addEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value.build());
    }

    @Override
    public Organization.Builder addEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, Text.of(value));
    }

    @Override
    public Organization.Builder addEvents(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value);
    }

    @Override
    public Organization.Builder addEvents(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value.build());
    }

    @Override
    public Organization.Builder addEvents(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, Text.of(value));
    }

    @Override
    public Organization.Builder addFaxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, value);
    }

    @Override
    public Organization.Builder addFaxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, Text.of(value));
    }

    @Override
    public Organization.Builder addFounder(Person value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, value);
    }

    @Override
    public Organization.Builder addFounder(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, value.build());
    }

    @Override
    public Organization.Builder addFounder(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, Text.of(value));
    }

    @Override
    public Organization.Builder addFounders(Person value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, value);
    }

    @Override
    public Organization.Builder addFounders(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, value.build());
    }

    @Override
    public Organization.Builder addFounders(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, Text.of(value));
    }

    @Override
    public Organization.Builder addFoundingDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_DATE, value);
    }

    @Override
    public Organization.Builder addFoundingDate(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_DATE, Text.of(value));
    }

    @Override
    public Organization.Builder addFoundingLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, value);
    }

    @Override
    public Organization.Builder addFoundingLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, value.build());
    }

    @Override
    public Organization.Builder addFoundingLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, Text.of(value));
    }

    @Override
    public Organization.Builder addGlobalLocationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, value);
    }

    @Override
    public Organization.Builder addGlobalLocationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, Text.of(value));
    }

    @Override
    public Organization.Builder addHasOfferCatalog(OfferCatalog value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value);
    }

    @Override
    public Organization.Builder addHasOfferCatalog(OfferCatalog.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value.build());
    }

    @Override
    public Organization.Builder addHasOfferCatalog(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, Text.of(value));
    }

    @Override
    public Organization.Builder addHasPOS(Place value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value);
    }

    @Override
    public Organization.Builder addHasPOS(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value.build());
    }

    @Override
    public Organization.Builder addHasPOS(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, Text.of(value));
    }

    @Override
    public Organization.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Organization.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Organization.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Organization.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Organization.Builder addIsicV4(Text value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, value);
    }

    @Override
    public Organization.Builder addIsicV4(String value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, Text.of(value));
    }

    @Override
    public Organization.Builder addLegalName(Text value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_NAME, value);
    }

    @Override
    public Organization.Builder addLegalName(String value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_NAME, Text.of(value));
    }

    @Override
    public Organization.Builder addLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public Organization.Builder addLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public Organization.Builder addLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public Organization.Builder addLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public Organization.Builder addLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public Organization.Builder addLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, Text.of(value));
    }

    @Override
    public Organization.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Organization.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public Organization.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Organization.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public Organization.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Organization.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Organization.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Organization.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Organization.Builder addMakesOffer(Offer value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value);
    }

    @Override
    public Organization.Builder addMakesOffer(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value.build());
    }

    @Override
    public Organization.Builder addMakesOffer(String value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, Text.of(value));
    }

    @Override
    public Organization.Builder addMember(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value);
    }

    @Override
    public Organization.Builder addMember(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value.build());
    }

    @Override
    public Organization.Builder addMember(Person value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value);
    }

    @Override
    public Organization.Builder addMember(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value.build());
    }

    @Override
    public Organization.Builder addMember(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, Text.of(value));
    }

    @Override
    public Organization.Builder addMemberOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public Organization.Builder addMemberOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public Organization.Builder addMemberOf(ProgramMembership value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public Organization.Builder addMemberOf(ProgramMembership.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public Organization.Builder addMemberOf(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, Text.of(value));
    }

    @Override
    public Organization.Builder addMembers(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value);
    }

    @Override
    public Organization.Builder addMembers(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value.build());
    }

    @Override
    public Organization.Builder addMembers(Person value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value);
    }

    @Override
    public Organization.Builder addMembers(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value.build());
    }

    @Override
    public Organization.Builder addMembers(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, Text.of(value));
    }

    @Override
    public Organization.Builder addNaics(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, value);
    }

    @Override
    public Organization.Builder addNaics(String value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, Text.of(value));
    }

    @Override
    public Organization.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Organization.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Organization.Builder addNumberOfEmployees(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, value);
    }

    @Override
    public Organization.Builder addNumberOfEmployees(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, value.build());
    }

    @Override
    public Organization.Builder addNumberOfEmployees(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, Text.of(value));
    }

    @Override
    public Organization.Builder addOwns(OwnershipInfo value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public Organization.Builder addOwns(OwnershipInfo.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public Organization.Builder addOwns(Product value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public Organization.Builder addOwns(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public Organization.Builder addOwns(String value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, Text.of(value));
    }

    @Override
    public Organization.Builder addParentOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, value);
    }

    @Override
    public Organization.Builder addParentOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, value.build());
    }

    @Override
    public Organization.Builder addParentOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, Text.of(value));
    }

    @Override
    public Organization.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Organization.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Organization.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Organization.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public Organization.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public Organization.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public Organization.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public Organization.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public Organization.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public Organization.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Organization.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Organization.Builder addSeeks(Demand value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value);
    }

    @Override
    public Organization.Builder addSeeks(Demand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value.build());
    }

    @Override
    public Organization.Builder addSeeks(String value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, Text.of(value));
    }

    @Override
    public Organization.Builder addServiceArea(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public Organization.Builder addServiceArea(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public Organization.Builder addServiceArea(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public Organization.Builder addServiceArea(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public Organization.Builder addServiceArea(Place value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public Organization.Builder addServiceArea(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public Organization.Builder addServiceArea(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, Text.of(value));
    }

    @Override
    public Organization.Builder addSubOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, value);
    }

    @Override
    public Organization.Builder addSubOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, value.build());
    }

    @Override
    public Organization.Builder addSubOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, Text.of(value));
    }

    @Override
    public Organization.Builder addTaxID(Text value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, value);
    }

    @Override
    public Organization.Builder addTaxID(String value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, Text.of(value));
    }

    @Override
    public Organization.Builder addTelephone(Text value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, value);
    }

    @Override
    public Organization.Builder addTelephone(String value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, Text.of(value));
    }

    @Override
    public Organization.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Organization.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Organization.Builder addVatID(Text value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, value);
    }

    @Override
    public Organization.Builder addVatID(String value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, Text.of(value));
    }

    @Override
    public Organization.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Organization.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Organization.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Organization.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Organization.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Organization.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Organization build() {
      return new OrganizationImpl(properties, reverseMap);
    }
  }

  public OrganizationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_ORGANIZATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAlumniList() {
    return getProperty(CoreConstants.PROPERTY_ALUMNI);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAreaServedList() {
    return getProperty(CoreConstants.PROPERTY_AREA_SERVED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAwardList() {
    return getProperty(CoreConstants.PROPERTY_AWARD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAwardsList() {
    return getProperty(CoreConstants.PROPERTY_AWARDS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBrandList() {
    return getProperty(CoreConstants.PROPERTY_BRAND);
  }

  @Override
  public ImmutableList<SchemaOrgType> getContactPointList() {
    return getProperty(CoreConstants.PROPERTY_CONTACT_POINT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getContactPointsList() {
    return getProperty(CoreConstants.PROPERTY_CONTACT_POINTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDepartmentList() {
    return getProperty(CoreConstants.PROPERTY_DEPARTMENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDissolutionDateList() {
    return getProperty(CoreConstants.PROPERTY_DISSOLUTION_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDunsList() {
    return getProperty(CoreConstants.PROPERTY_DUNS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEmailList() {
    return getProperty(CoreConstants.PROPERTY_EMAIL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEmployeeList() {
    return getProperty(CoreConstants.PROPERTY_EMPLOYEE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEmployeesList() {
    return getProperty(CoreConstants.PROPERTY_EMPLOYEES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFounderList() {
    return getProperty(CoreConstants.PROPERTY_FOUNDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFoundersList() {
    return getProperty(CoreConstants.PROPERTY_FOUNDERS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFoundingDateList() {
    return getProperty(CoreConstants.PROPERTY_FOUNDING_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFoundingLocationList() {
    return getProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHasOfferCatalogList() {
    return getProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHasPOSList() {
    return getProperty(CoreConstants.PROPERTY_HAS_POS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLegalNameList() {
    return getProperty(CoreConstants.PROPERTY_LEGAL_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLocationList() {
    return getProperty(CoreConstants.PROPERTY_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMakesOfferList() {
    return getProperty(CoreConstants.PROPERTY_MAKES_OFFER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMemberList() {
    return getProperty(CoreConstants.PROPERTY_MEMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMemberOfList() {
    return getProperty(CoreConstants.PROPERTY_MEMBER_OF);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMembersList() {
    return getProperty(CoreConstants.PROPERTY_MEMBERS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNaicsList() {
    return getProperty(CoreConstants.PROPERTY_NAICS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumberOfEmployeesList() {
    return getProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOwnsList() {
    return getProperty(CoreConstants.PROPERTY_OWNS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getParentOrganizationList() {
    return getProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSeeksList() {
    return getProperty(CoreConstants.PROPERTY_SEEKS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServiceAreaList() {
    return getProperty(CoreConstants.PROPERTY_SERVICE_AREA);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSubOrganizationList() {
    return getProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTaxIDList() {
    return getProperty(CoreConstants.PROPERTY_TAX_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVatIDList() {
    return getProperty(CoreConstants.PROPERTY_VAT_ID);
  }
}
