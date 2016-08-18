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
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Locksmith}. */
public class LocksmithImpl extends HomeAndConstructionBusinessImpl implements Locksmith {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADDRESS);

    builder.add(CoreConstants.PROPERTY_AGGREGATE_RATING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ALUMNI);

    builder.add(CoreConstants.PROPERTY_AREA_SERVED);

    builder.add(CoreConstants.PROPERTY_AWARD);

    builder.add(CoreConstants.PROPERTY_AWARDS);

    builder.add(CoreConstants.PROPERTY_BRANCH_CODE);

    builder.add(CoreConstants.PROPERTY_BRANCH_OF);

    builder.add(CoreConstants.PROPERTY_BRAND);

    builder.add(CoreConstants.PROPERTY_CONTACT_POINT);

    builder.add(CoreConstants.PROPERTY_CONTACT_POINTS);

    builder.add(CoreConstants.PROPERTY_CONTAINED_IN);

    builder.add(CoreConstants.PROPERTY_CONTAINED_IN_PLACE);

    builder.add(CoreConstants.PROPERTY_CONTAINS_PLACE);

    builder.add(CoreConstants.PROPERTY_CURRENCIES_ACCEPTED);

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

    builder.add(CoreConstants.PROPERTY_GEO);

    builder.add(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_HAS_MAP);

    builder.add(CoreConstants.PROPERTY_HAS_OFFER_CATALOG);

    builder.add(CoreConstants.PROPERTY_HAS_POS);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ISIC_V4);

    builder.add(CoreConstants.PROPERTY_LEGAL_NAME);

    builder.add(CoreConstants.PROPERTY_LOCATION);

    builder.add(CoreConstants.PROPERTY_LOGO);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MAKES_OFFER);

    builder.add(CoreConstants.PROPERTY_MAP);

    builder.add(CoreConstants.PROPERTY_MAPS);

    builder.add(CoreConstants.PROPERTY_MEMBER);

    builder.add(CoreConstants.PROPERTY_MEMBER_OF);

    builder.add(CoreConstants.PROPERTY_MEMBERS);

    builder.add(CoreConstants.PROPERTY_NAICS);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES);

    builder.add(CoreConstants.PROPERTY_OPENING_HOURS);

    builder.add(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION);

    builder.add(CoreConstants.PROPERTY_OWNS);

    builder.add(CoreConstants.PROPERTY_PARENT_ORGANIZATION);

    builder.add(CoreConstants.PROPERTY_PAYMENT_ACCEPTED);

    builder.add(CoreConstants.PROPERTY_PHOTO);

    builder.add(CoreConstants.PROPERTY_PHOTOS);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRICE_RANGE);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Locksmith.Builder>
      implements Locksmith.Builder {

    @Override
    public Locksmith.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public Locksmith.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public Locksmith.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Locksmith.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Locksmith.Builder addAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value.build());
    }

    @Override
    public Locksmith.Builder addAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Locksmith.Builder addAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public Locksmith.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public Locksmith.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Locksmith.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAlumni(Person value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, value);
    }

    @Override
    public Locksmith.Builder addAlumni(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, value.build());
    }

    @Override
    public Locksmith.Builder addAlumni(String value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Locksmith.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Locksmith.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Locksmith.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Locksmith.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Locksmith.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public Locksmith.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public Locksmith.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public Locksmith.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public Locksmith.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public Locksmith.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addBranchCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_CODE, value);
    }

    @Override
    public Locksmith.Builder addBranchCode(String value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_CODE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addBranchOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_OF, value);
    }

    @Override
    public Locksmith.Builder addBranchOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_OF, value.build());
    }

    @Override
    public Locksmith.Builder addBranchOf(String value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_OF, Text.of(value));
    }

    @Override
    public Locksmith.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Locksmith.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Locksmith.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Locksmith.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Locksmith.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public Locksmith.Builder addContactPoint(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value);
    }

    @Override
    public Locksmith.Builder addContactPoint(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value.build());
    }

    @Override
    public Locksmith.Builder addContactPoint(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, Text.of(value));
    }

    @Override
    public Locksmith.Builder addContactPoints(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value);
    }

    @Override
    public Locksmith.Builder addContactPoints(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value.build());
    }

    @Override
    public Locksmith.Builder addContactPoints(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addContainedIn(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, value);
    }

    @Override
    public Locksmith.Builder addContainedIn(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, value.build());
    }

    @Override
    public Locksmith.Builder addContainedIn(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, Text.of(value));
    }

    @Override
    public Locksmith.Builder addContainedInPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, value);
    }

    @Override
    public Locksmith.Builder addContainedInPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, value.build());
    }

    @Override
    public Locksmith.Builder addContainedInPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addContainsPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, value);
    }

    @Override
    public Locksmith.Builder addContainsPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, value.build());
    }

    @Override
    public Locksmith.Builder addContainsPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addCurrenciesAccepted(Text value) {
      return addProperty(CoreConstants.PROPERTY_CURRENCIES_ACCEPTED, value);
    }

    @Override
    public Locksmith.Builder addCurrenciesAccepted(String value) {
      return addProperty(CoreConstants.PROPERTY_CURRENCIES_ACCEPTED, Text.of(value));
    }

    @Override
    public Locksmith.Builder addDepartment(Organization value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, value);
    }

    @Override
    public Locksmith.Builder addDepartment(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, value.build());
    }

    @Override
    public Locksmith.Builder addDepartment(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, Text.of(value));
    }

    @Override
    public Locksmith.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Locksmith.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addDissolutionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_DISSOLUTION_DATE, value);
    }

    @Override
    public Locksmith.Builder addDissolutionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_DISSOLUTION_DATE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addDuns(Text value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, value);
    }

    @Override
    public Locksmith.Builder addDuns(String value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addEmail(Text value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, value);
    }

    @Override
    public Locksmith.Builder addEmail(String value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, Text.of(value));
    }

    @Override
    public Locksmith.Builder addEmployee(Person value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, value);
    }

    @Override
    public Locksmith.Builder addEmployee(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, value.build());
    }

    @Override
    public Locksmith.Builder addEmployee(String value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addEmployees(Person value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, value);
    }

    @Override
    public Locksmith.Builder addEmployees(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, value.build());
    }

    @Override
    public Locksmith.Builder addEmployees(String value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, Text.of(value));
    }

    @Override
    public Locksmith.Builder addEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value);
    }

    @Override
    public Locksmith.Builder addEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value.build());
    }

    @Override
    public Locksmith.Builder addEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, Text.of(value));
    }

    @Override
    public Locksmith.Builder addEvents(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value);
    }

    @Override
    public Locksmith.Builder addEvents(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value.build());
    }

    @Override
    public Locksmith.Builder addEvents(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addFaxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, value);
    }

    @Override
    public Locksmith.Builder addFaxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, Text.of(value));
    }

    @Override
    public Locksmith.Builder addFounder(Person value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, value);
    }

    @Override
    public Locksmith.Builder addFounder(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, value.build());
    }

    @Override
    public Locksmith.Builder addFounder(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, Text.of(value));
    }

    @Override
    public Locksmith.Builder addFounders(Person value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, value);
    }

    @Override
    public Locksmith.Builder addFounders(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, value.build());
    }

    @Override
    public Locksmith.Builder addFounders(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addFoundingDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_DATE, value);
    }

    @Override
    public Locksmith.Builder addFoundingDate(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_DATE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addFoundingLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, value);
    }

    @Override
    public Locksmith.Builder addFoundingLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, value.build());
    }

    @Override
    public Locksmith.Builder addFoundingLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addGeo(GeoCoordinates value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value);
    }

    @Override
    public Locksmith.Builder addGeo(GeoCoordinates.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value.build());
    }

    @Override
    public Locksmith.Builder addGeo(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value);
    }

    @Override
    public Locksmith.Builder addGeo(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value.build());
    }

    @Override
    public Locksmith.Builder addGeo(String value) {
      return addProperty(CoreConstants.PROPERTY_GEO, Text.of(value));
    }

    @Override
    public Locksmith.Builder addGlobalLocationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, value);
    }

    @Override
    public Locksmith.Builder addGlobalLocationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, Text.of(value));
    }

    @Override
    public Locksmith.Builder addHasMap(Map value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value);
    }

    @Override
    public Locksmith.Builder addHasMap(Map.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value.build());
    }

    @Override
    public Locksmith.Builder addHasMap(URL value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value);
    }

    @Override
    public Locksmith.Builder addHasMap(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, Text.of(value));
    }

    @Override
    public Locksmith.Builder addHasOfferCatalog(OfferCatalog value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value);
    }

    @Override
    public Locksmith.Builder addHasOfferCatalog(OfferCatalog.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value.build());
    }

    @Override
    public Locksmith.Builder addHasOfferCatalog(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, Text.of(value));
    }

    @Override
    public Locksmith.Builder addHasPOS(Place value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value);
    }

    @Override
    public Locksmith.Builder addHasPOS(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value.build());
    }

    @Override
    public Locksmith.Builder addHasPOS(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Locksmith.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Locksmith.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Locksmith.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addIsicV4(Text value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, value);
    }

    @Override
    public Locksmith.Builder addIsicV4(String value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, Text.of(value));
    }

    @Override
    public Locksmith.Builder addLegalName(Text value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_NAME, value);
    }

    @Override
    public Locksmith.Builder addLegalName(String value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_NAME, Text.of(value));
    }

    @Override
    public Locksmith.Builder addLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public Locksmith.Builder addLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public Locksmith.Builder addLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public Locksmith.Builder addLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public Locksmith.Builder addLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public Locksmith.Builder addLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Locksmith.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public Locksmith.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public Locksmith.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public Locksmith.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Locksmith.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Locksmith.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Locksmith.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addMakesOffer(Offer value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value);
    }

    @Override
    public Locksmith.Builder addMakesOffer(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value.build());
    }

    @Override
    public Locksmith.Builder addMakesOffer(String value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, Text.of(value));
    }

    @Override
    public Locksmith.Builder addMap(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAP, value);
    }

    @Override
    public Locksmith.Builder addMap(String value) {
      return addProperty(CoreConstants.PROPERTY_MAP, Text.of(value));
    }

    @Override
    public Locksmith.Builder addMaps(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAPS, value);
    }

    @Override
    public Locksmith.Builder addMaps(String value) {
      return addProperty(CoreConstants.PROPERTY_MAPS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addMember(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value);
    }

    @Override
    public Locksmith.Builder addMember(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value.build());
    }

    @Override
    public Locksmith.Builder addMember(Person value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value);
    }

    @Override
    public Locksmith.Builder addMember(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value.build());
    }

    @Override
    public Locksmith.Builder addMember(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, Text.of(value));
    }

    @Override
    public Locksmith.Builder addMemberOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public Locksmith.Builder addMemberOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public Locksmith.Builder addMemberOf(ProgramMembership value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public Locksmith.Builder addMemberOf(ProgramMembership.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public Locksmith.Builder addMemberOf(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, Text.of(value));
    }

    @Override
    public Locksmith.Builder addMembers(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value);
    }

    @Override
    public Locksmith.Builder addMembers(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value.build());
    }

    @Override
    public Locksmith.Builder addMembers(Person value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value);
    }

    @Override
    public Locksmith.Builder addMembers(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value.build());
    }

    @Override
    public Locksmith.Builder addMembers(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addNaics(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, value);
    }

    @Override
    public Locksmith.Builder addNaics(String value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Locksmith.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Locksmith.Builder addNumberOfEmployees(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, value);
    }

    @Override
    public Locksmith.Builder addNumberOfEmployees(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, value.build());
    }

    @Override
    public Locksmith.Builder addNumberOfEmployees(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, Text.of(value));
    }

    @Override
    public Locksmith.Builder addOpeningHours(Text value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS, value);
    }

    @Override
    public Locksmith.Builder addOpeningHours(String value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addOpeningHoursSpecification(OpeningHoursSpecification value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, value);
    }

    @Override
    public Locksmith.Builder addOpeningHoursSpecification(OpeningHoursSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, value.build());
    }

    @Override
    public Locksmith.Builder addOpeningHoursSpecification(String value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addOwns(OwnershipInfo value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public Locksmith.Builder addOwns(OwnershipInfo.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public Locksmith.Builder addOwns(Product value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public Locksmith.Builder addOwns(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public Locksmith.Builder addOwns(String value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addParentOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, value);
    }

    @Override
    public Locksmith.Builder addParentOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, value.build());
    }

    @Override
    public Locksmith.Builder addParentOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addPaymentAccepted(Text value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_ACCEPTED, value);
    }

    @Override
    public Locksmith.Builder addPaymentAccepted(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_ACCEPTED, Text.of(value));
    }

    @Override
    public Locksmith.Builder addPhoto(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value);
    }

    @Override
    public Locksmith.Builder addPhoto(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value.build());
    }

    @Override
    public Locksmith.Builder addPhoto(Photograph value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value);
    }

    @Override
    public Locksmith.Builder addPhoto(Photograph.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value.build());
    }

    @Override
    public Locksmith.Builder addPhoto(String value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, Text.of(value));
    }

    @Override
    public Locksmith.Builder addPhotos(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value);
    }

    @Override
    public Locksmith.Builder addPhotos(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value.build());
    }

    @Override
    public Locksmith.Builder addPhotos(Photograph value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value);
    }

    @Override
    public Locksmith.Builder addPhotos(Photograph.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value.build());
    }

    @Override
    public Locksmith.Builder addPhotos(String value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Locksmith.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Locksmith.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addPriceRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_RANGE, value);
    }

    @Override
    public Locksmith.Builder addPriceRange(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_RANGE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public Locksmith.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public Locksmith.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public Locksmith.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public Locksmith.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public Locksmith.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Locksmith.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addSeeks(Demand value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value);
    }

    @Override
    public Locksmith.Builder addSeeks(Demand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value.build());
    }

    @Override
    public Locksmith.Builder addSeeks(String value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, Text.of(value));
    }

    @Override
    public Locksmith.Builder addServiceArea(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public Locksmith.Builder addServiceArea(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public Locksmith.Builder addServiceArea(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public Locksmith.Builder addServiceArea(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public Locksmith.Builder addServiceArea(Place value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public Locksmith.Builder addServiceArea(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public Locksmith.Builder addServiceArea(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, Text.of(value));
    }

    @Override
    public Locksmith.Builder addSubOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, value);
    }

    @Override
    public Locksmith.Builder addSubOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, value.build());
    }

    @Override
    public Locksmith.Builder addSubOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addTaxID(Text value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, value);
    }

    @Override
    public Locksmith.Builder addTaxID(String value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, Text.of(value));
    }

    @Override
    public Locksmith.Builder addTelephone(Text value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, value);
    }

    @Override
    public Locksmith.Builder addTelephone(String value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, Text.of(value));
    }

    @Override
    public Locksmith.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Locksmith.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Locksmith.Builder addVatID(Text value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, value);
    }

    @Override
    public Locksmith.Builder addVatID(String value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, Text.of(value));
    }

    @Override
    public Locksmith.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Locksmith.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Locksmith.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Locksmith.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Locksmith.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Locksmith.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Locksmith build() {
      return new LocksmithImpl(properties, reverseMap);
    }
  }

  public LocksmithImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_LOCKSMITH;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
