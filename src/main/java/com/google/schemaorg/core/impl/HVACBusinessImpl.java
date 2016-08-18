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

/** Implementation of {@link HVACBusiness}. */
public class HVACBusinessImpl extends HomeAndConstructionBusinessImpl implements HVACBusiness {
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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<HVACBusiness.Builder>
      implements HVACBusiness.Builder {

    @Override
    public HVACBusiness.Builder addAdditionalProperty(PropertyValue value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value);
    }

    @Override
    public HVACBusiness.Builder addAdditionalProperty(PropertyValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, value.build());
    }

    @Override
    public HVACBusiness.Builder addAdditionalProperty(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_PROPERTY, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public HVACBusiness.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public HVACBusiness.Builder addAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value.build());
    }

    @Override
    public HVACBusiness.Builder addAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public HVACBusiness.Builder addAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAggregateRating(AggregateRating value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value);
    }

    @Override
    public HVACBusiness.Builder addAggregateRating(AggregateRating.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, value.build());
    }

    @Override
    public HVACBusiness.Builder addAggregateRating(String value) {
      return addProperty(CoreConstants.PROPERTY_AGGREGATE_RATING, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public HVACBusiness.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAlumni(Person value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, value);
    }

    @Override
    public HVACBusiness.Builder addAlumni(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, value.build());
    }

    @Override
    public HVACBusiness.Builder addAlumni(String value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public HVACBusiness.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public HVACBusiness.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public HVACBusiness.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public HVACBusiness.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public HVACBusiness.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public HVACBusiness.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public HVACBusiness.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public HVACBusiness.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public HVACBusiness.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addBranchCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_CODE, value);
    }

    @Override
    public HVACBusiness.Builder addBranchCode(String value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_CODE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addBranchOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_OF, value);
    }

    @Override
    public HVACBusiness.Builder addBranchOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_OF, value.build());
    }

    @Override
    public HVACBusiness.Builder addBranchOf(String value) {
      return addProperty(CoreConstants.PROPERTY_BRANCH_OF, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public HVACBusiness.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public HVACBusiness.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public HVACBusiness.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public HVACBusiness.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addContactPoint(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value);
    }

    @Override
    public HVACBusiness.Builder addContactPoint(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value.build());
    }

    @Override
    public HVACBusiness.Builder addContactPoint(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addContactPoints(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value);
    }

    @Override
    public HVACBusiness.Builder addContactPoints(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value.build());
    }

    @Override
    public HVACBusiness.Builder addContactPoints(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addContainedIn(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, value);
    }

    @Override
    public HVACBusiness.Builder addContainedIn(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, value.build());
    }

    @Override
    public HVACBusiness.Builder addContainedIn(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addContainedInPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, value);
    }

    @Override
    public HVACBusiness.Builder addContainedInPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, value.build());
    }

    @Override
    public HVACBusiness.Builder addContainedInPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINED_IN_PLACE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addContainsPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, value);
    }

    @Override
    public HVACBusiness.Builder addContainsPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, value.build());
    }

    @Override
    public HVACBusiness.Builder addContainsPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTAINS_PLACE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addCurrenciesAccepted(Text value) {
      return addProperty(CoreConstants.PROPERTY_CURRENCIES_ACCEPTED, value);
    }

    @Override
    public HVACBusiness.Builder addCurrenciesAccepted(String value) {
      return addProperty(CoreConstants.PROPERTY_CURRENCIES_ACCEPTED, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addDepartment(Organization value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, value);
    }

    @Override
    public HVACBusiness.Builder addDepartment(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, value.build());
    }

    @Override
    public HVACBusiness.Builder addDepartment(String value) {
      return addProperty(CoreConstants.PROPERTY_DEPARTMENT, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public HVACBusiness.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addDissolutionDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_DISSOLUTION_DATE, value);
    }

    @Override
    public HVACBusiness.Builder addDissolutionDate(String value) {
      return addProperty(CoreConstants.PROPERTY_DISSOLUTION_DATE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addDuns(Text value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, value);
    }

    @Override
    public HVACBusiness.Builder addDuns(String value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addEmail(Text value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, value);
    }

    @Override
    public HVACBusiness.Builder addEmail(String value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addEmployee(Person value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, value);
    }

    @Override
    public HVACBusiness.Builder addEmployee(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, value.build());
    }

    @Override
    public HVACBusiness.Builder addEmployee(String value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addEmployees(Person value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, value);
    }

    @Override
    public HVACBusiness.Builder addEmployees(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, value.build());
    }

    @Override
    public HVACBusiness.Builder addEmployees(String value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYEES, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addEvent(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value);
    }

    @Override
    public HVACBusiness.Builder addEvent(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, value.build());
    }

    @Override
    public HVACBusiness.Builder addEvent(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENT, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addEvents(Event value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value);
    }

    @Override
    public HVACBusiness.Builder addEvents(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, value.build());
    }

    @Override
    public HVACBusiness.Builder addEvents(String value) {
      return addProperty(CoreConstants.PROPERTY_EVENTS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addFaxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, value);
    }

    @Override
    public HVACBusiness.Builder addFaxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addFounder(Person value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, value);
    }

    @Override
    public HVACBusiness.Builder addFounder(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, value.build());
    }

    @Override
    public HVACBusiness.Builder addFounder(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDER, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addFounders(Person value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, value);
    }

    @Override
    public HVACBusiness.Builder addFounders(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, value.build());
    }

    @Override
    public HVACBusiness.Builder addFounders(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDERS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addFoundingDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_DATE, value);
    }

    @Override
    public HVACBusiness.Builder addFoundingDate(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_DATE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addFoundingLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, value);
    }

    @Override
    public HVACBusiness.Builder addFoundingLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, value.build());
    }

    @Override
    public HVACBusiness.Builder addFoundingLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_FOUNDING_LOCATION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addGeo(GeoCoordinates value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value);
    }

    @Override
    public HVACBusiness.Builder addGeo(GeoCoordinates.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value.build());
    }

    @Override
    public HVACBusiness.Builder addGeo(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value);
    }

    @Override
    public HVACBusiness.Builder addGeo(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GEO, value.build());
    }

    @Override
    public HVACBusiness.Builder addGeo(String value) {
      return addProperty(CoreConstants.PROPERTY_GEO, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addGlobalLocationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, value);
    }

    @Override
    public HVACBusiness.Builder addGlobalLocationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addHasMap(Map value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value);
    }

    @Override
    public HVACBusiness.Builder addHasMap(Map.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value.build());
    }

    @Override
    public HVACBusiness.Builder addHasMap(URL value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, value);
    }

    @Override
    public HVACBusiness.Builder addHasMap(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_MAP, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addHasOfferCatalog(OfferCatalog value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value);
    }

    @Override
    public HVACBusiness.Builder addHasOfferCatalog(OfferCatalog.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value.build());
    }

    @Override
    public HVACBusiness.Builder addHasOfferCatalog(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addHasPOS(Place value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value);
    }

    @Override
    public HVACBusiness.Builder addHasPOS(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value.build());
    }

    @Override
    public HVACBusiness.Builder addHasPOS(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public HVACBusiness.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public HVACBusiness.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public HVACBusiness.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addIsicV4(Text value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, value);
    }

    @Override
    public HVACBusiness.Builder addIsicV4(String value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addLegalName(Text value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_NAME, value);
    }

    @Override
    public HVACBusiness.Builder addLegalName(String value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_NAME, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public HVACBusiness.Builder addLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public HVACBusiness.Builder addLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public HVACBusiness.Builder addLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public HVACBusiness.Builder addLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public HVACBusiness.Builder addLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addLogo(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public HVACBusiness.Builder addLogo(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value.build());
    }

    @Override
    public HVACBusiness.Builder addLogo(URL value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, value);
    }

    @Override
    public HVACBusiness.Builder addLogo(String value) {
      return addProperty(CoreConstants.PROPERTY_LOGO, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public HVACBusiness.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public HVACBusiness.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public HVACBusiness.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addMakesOffer(Offer value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value);
    }

    @Override
    public HVACBusiness.Builder addMakesOffer(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value.build());
    }

    @Override
    public HVACBusiness.Builder addMakesOffer(String value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addMap(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAP, value);
    }

    @Override
    public HVACBusiness.Builder addMap(String value) {
      return addProperty(CoreConstants.PROPERTY_MAP, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addMaps(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAPS, value);
    }

    @Override
    public HVACBusiness.Builder addMaps(String value) {
      return addProperty(CoreConstants.PROPERTY_MAPS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addMember(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value);
    }

    @Override
    public HVACBusiness.Builder addMember(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value.build());
    }

    @Override
    public HVACBusiness.Builder addMember(Person value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value);
    }

    @Override
    public HVACBusiness.Builder addMember(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, value.build());
    }

    @Override
    public HVACBusiness.Builder addMember(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addMemberOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public HVACBusiness.Builder addMemberOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public HVACBusiness.Builder addMemberOf(ProgramMembership value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public HVACBusiness.Builder addMemberOf(ProgramMembership.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public HVACBusiness.Builder addMemberOf(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addMembers(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value);
    }

    @Override
    public HVACBusiness.Builder addMembers(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value.build());
    }

    @Override
    public HVACBusiness.Builder addMembers(Person value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value);
    }

    @Override
    public HVACBusiness.Builder addMembers(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, value.build());
    }

    @Override
    public HVACBusiness.Builder addMembers(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBERS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addNaics(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, value);
    }

    @Override
    public HVACBusiness.Builder addNaics(String value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public HVACBusiness.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addNumberOfEmployees(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, value);
    }

    @Override
    public HVACBusiness.Builder addNumberOfEmployees(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, value.build());
    }

    @Override
    public HVACBusiness.Builder addNumberOfEmployees(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBER_OF_EMPLOYEES, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addOpeningHours(Text value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS, value);
    }

    @Override
    public HVACBusiness.Builder addOpeningHours(String value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addOpeningHoursSpecification(OpeningHoursSpecification value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, value);
    }

    @Override
    public HVACBusiness.Builder addOpeningHoursSpecification(
        OpeningHoursSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, value.build());
    }

    @Override
    public HVACBusiness.Builder addOpeningHoursSpecification(String value) {
      return addProperty(CoreConstants.PROPERTY_OPENING_HOURS_SPECIFICATION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addOwns(OwnershipInfo value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public HVACBusiness.Builder addOwns(OwnershipInfo.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public HVACBusiness.Builder addOwns(Product value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public HVACBusiness.Builder addOwns(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public HVACBusiness.Builder addOwns(String value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addParentOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, value);
    }

    @Override
    public HVACBusiness.Builder addParentOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, value.build());
    }

    @Override
    public HVACBusiness.Builder addParentOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_PARENT_ORGANIZATION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addPaymentAccepted(Text value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_ACCEPTED, value);
    }

    @Override
    public HVACBusiness.Builder addPaymentAccepted(String value) {
      return addProperty(CoreConstants.PROPERTY_PAYMENT_ACCEPTED, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addPhoto(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value);
    }

    @Override
    public HVACBusiness.Builder addPhoto(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value.build());
    }

    @Override
    public HVACBusiness.Builder addPhoto(Photograph value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value);
    }

    @Override
    public HVACBusiness.Builder addPhoto(Photograph.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, value.build());
    }

    @Override
    public HVACBusiness.Builder addPhoto(String value) {
      return addProperty(CoreConstants.PROPERTY_PHOTO, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addPhotos(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value);
    }

    @Override
    public HVACBusiness.Builder addPhotos(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value.build());
    }

    @Override
    public HVACBusiness.Builder addPhotos(Photograph value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value);
    }

    @Override
    public HVACBusiness.Builder addPhotos(Photograph.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, value.build());
    }

    @Override
    public HVACBusiness.Builder addPhotos(String value) {
      return addProperty(CoreConstants.PROPERTY_PHOTOS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public HVACBusiness.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public HVACBusiness.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addPriceRange(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_RANGE, value);
    }

    @Override
    public HVACBusiness.Builder addPriceRange(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_RANGE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addReview(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value);
    }

    @Override
    public HVACBusiness.Builder addReview(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, value.build());
    }

    @Override
    public HVACBusiness.Builder addReview(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEW, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addReviews(Review value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value);
    }

    @Override
    public HVACBusiness.Builder addReviews(Review.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, value.build());
    }

    @Override
    public HVACBusiness.Builder addReviews(String value) {
      return addProperty(CoreConstants.PROPERTY_REVIEWS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public HVACBusiness.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addSeeks(Demand value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value);
    }

    @Override
    public HVACBusiness.Builder addSeeks(Demand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value.build());
    }

    @Override
    public HVACBusiness.Builder addSeeks(String value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addServiceArea(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public HVACBusiness.Builder addServiceArea(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public HVACBusiness.Builder addServiceArea(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public HVACBusiness.Builder addServiceArea(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public HVACBusiness.Builder addServiceArea(Place value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public HVACBusiness.Builder addServiceArea(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public HVACBusiness.Builder addServiceArea(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addSubOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, value);
    }

    @Override
    public HVACBusiness.Builder addSubOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, value.build());
    }

    @Override
    public HVACBusiness.Builder addSubOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_ORGANIZATION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addTaxID(Text value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, value);
    }

    @Override
    public HVACBusiness.Builder addTaxID(String value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addTelephone(Text value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, value);
    }

    @Override
    public HVACBusiness.Builder addTelephone(String value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public HVACBusiness.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addVatID(Text value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, value);
    }

    @Override
    public HVACBusiness.Builder addVatID(String value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public HVACBusiness.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public HVACBusiness.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public HVACBusiness.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public HVACBusiness.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public HVACBusiness.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public HVACBusiness build() {
      return new HVACBusinessImpl(properties, reverseMap);
    }
  }

  public HVACBusinessImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_HVAC_BUSINESS;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
