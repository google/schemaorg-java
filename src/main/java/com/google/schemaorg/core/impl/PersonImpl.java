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

/** Implementation of {@link Person}. */
public class PersonImpl extends ThingImpl implements Person {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_NAME);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADDRESS);

    builder.add(CoreConstants.PROPERTY_AFFILIATION);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ALUMNI_OF);

    builder.add(CoreConstants.PROPERTY_AWARD);

    builder.add(CoreConstants.PROPERTY_AWARDS);

    builder.add(CoreConstants.PROPERTY_BIRTH_DATE);

    builder.add(CoreConstants.PROPERTY_BIRTH_PLACE);

    builder.add(CoreConstants.PROPERTY_BRAND);

    builder.add(CoreConstants.PROPERTY_CHILDREN);

    builder.add(CoreConstants.PROPERTY_COLLEAGUE);

    builder.add(CoreConstants.PROPERTY_COLLEAGUES);

    builder.add(CoreConstants.PROPERTY_CONTACT_POINT);

    builder.add(CoreConstants.PROPERTY_CONTACT_POINTS);

    builder.add(CoreConstants.PROPERTY_DEATH_DATE);

    builder.add(CoreConstants.PROPERTY_DEATH_PLACE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DUNS);

    builder.add(CoreConstants.PROPERTY_EMAIL);

    builder.add(CoreConstants.PROPERTY_FAMILY_NAME);

    builder.add(CoreConstants.PROPERTY_FAX_NUMBER);

    builder.add(CoreConstants.PROPERTY_FOLLOWS);

    builder.add(CoreConstants.PROPERTY_GENDER);

    builder.add(CoreConstants.PROPERTY_GIVEN_NAME);

    builder.add(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER);

    builder.add(CoreConstants.PROPERTY_HAS_OFFER_CATALOG);

    builder.add(CoreConstants.PROPERTY_HAS_POS);

    builder.add(CoreConstants.PROPERTY_HEIGHT);

    builder.add(CoreConstants.PROPERTY_HOME_LOCATION);

    builder.add(CoreConstants.PROPERTY_HONORIFIC_PREFIX);

    builder.add(CoreConstants.PROPERTY_HONORIFIC_SUFFIX);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ISIC_V4);

    builder.add(CoreConstants.PROPERTY_JOB_TITLE);

    builder.add(CoreConstants.PROPERTY_KNOWS);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MAKES_OFFER);

    builder.add(CoreConstants.PROPERTY_MEMBER_OF);

    builder.add(CoreConstants.PROPERTY_NAICS);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NATIONALITY);

    builder.add(CoreConstants.PROPERTY_NET_WORTH);

    builder.add(CoreConstants.PROPERTY_OWNS);

    builder.add(CoreConstants.PROPERTY_PARENT);

    builder.add(CoreConstants.PROPERTY_PARENTS);

    builder.add(CoreConstants.PROPERTY_PERFORMER_IN);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RELATED_TO);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SEEKS);

    builder.add(CoreConstants.PROPERTY_SIBLING);

    builder.add(CoreConstants.PROPERTY_SIBLINGS);

    builder.add(CoreConstants.PROPERTY_SPOUSE);

    builder.add(CoreConstants.PROPERTY_TAX_ID);

    builder.add(CoreConstants.PROPERTY_TELEPHONE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VAT_ID);

    builder.add(CoreConstants.PROPERTY_WEIGHT);

    builder.add(CoreConstants.PROPERTY_WORK_LOCATION);

    builder.add(CoreConstants.PROPERTY_WORKS_FOR);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Person.Builder>
      implements Person.Builder {

    @Override
    public Person.Builder addAdditionalName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_NAME, value);
    }

    @Override
    public Person.Builder addAdditionalName(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_NAME, Text.of(value));
    }

    @Override
    public Person.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Person.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Person.Builder addAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Person.Builder addAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value.build());
    }

    @Override
    public Person.Builder addAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, value);
    }

    @Override
    public Person.Builder addAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS, Text.of(value));
    }

    @Override
    public Person.Builder addAffiliation(Organization value) {
      return addProperty(CoreConstants.PROPERTY_AFFILIATION, value);
    }

    @Override
    public Person.Builder addAffiliation(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AFFILIATION, value.build());
    }

    @Override
    public Person.Builder addAffiliation(String value) {
      return addProperty(CoreConstants.PROPERTY_AFFILIATION, Text.of(value));
    }

    @Override
    public Person.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Person.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Person.Builder addAlumniOf(EducationalOrganization value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI_OF, value);
    }

    @Override
    public Person.Builder addAlumniOf(EducationalOrganization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI_OF, value.build());
    }

    @Override
    public Person.Builder addAlumniOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI_OF, value);
    }

    @Override
    public Person.Builder addAlumniOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI_OF, value.build());
    }

    @Override
    public Person.Builder addAlumniOf(String value) {
      return addProperty(CoreConstants.PROPERTY_ALUMNI_OF, Text.of(value));
    }

    @Override
    public Person.Builder addAward(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, value);
    }

    @Override
    public Person.Builder addAward(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARD, Text.of(value));
    }

    @Override
    public Person.Builder addAwards(Text value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, value);
    }

    @Override
    public Person.Builder addAwards(String value) {
      return addProperty(CoreConstants.PROPERTY_AWARDS, Text.of(value));
    }

    @Override
    public Person.Builder addBirthDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_BIRTH_DATE, value);
    }

    @Override
    public Person.Builder addBirthDate(String value) {
      return addProperty(CoreConstants.PROPERTY_BIRTH_DATE, Text.of(value));
    }

    @Override
    public Person.Builder addBirthPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_BIRTH_PLACE, value);
    }

    @Override
    public Person.Builder addBirthPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BIRTH_PLACE, value.build());
    }

    @Override
    public Person.Builder addBirthPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_BIRTH_PLACE, Text.of(value));
    }

    @Override
    public Person.Builder addBrand(Brand value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Person.Builder addBrand(Brand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Person.Builder addBrand(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value);
    }

    @Override
    public Person.Builder addBrand(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, value.build());
    }

    @Override
    public Person.Builder addBrand(String value) {
      return addProperty(CoreConstants.PROPERTY_BRAND, Text.of(value));
    }

    @Override
    public Person.Builder addChildren(Person value) {
      return addProperty(CoreConstants.PROPERTY_CHILDREN, value);
    }

    @Override
    public Person.Builder addChildren(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CHILDREN, value.build());
    }

    @Override
    public Person.Builder addChildren(String value) {
      return addProperty(CoreConstants.PROPERTY_CHILDREN, Text.of(value));
    }

    @Override
    public Person.Builder addColleague(Person value) {
      return addProperty(CoreConstants.PROPERTY_COLLEAGUE, value);
    }

    @Override
    public Person.Builder addColleague(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COLLEAGUE, value.build());
    }

    @Override
    public Person.Builder addColleague(String value) {
      return addProperty(CoreConstants.PROPERTY_COLLEAGUE, Text.of(value));
    }

    @Override
    public Person.Builder addColleagues(Person value) {
      return addProperty(CoreConstants.PROPERTY_COLLEAGUES, value);
    }

    @Override
    public Person.Builder addColleagues(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COLLEAGUES, value.build());
    }

    @Override
    public Person.Builder addColleagues(String value) {
      return addProperty(CoreConstants.PROPERTY_COLLEAGUES, Text.of(value));
    }

    @Override
    public Person.Builder addContactPoint(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value);
    }

    @Override
    public Person.Builder addContactPoint(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, value.build());
    }

    @Override
    public Person.Builder addContactPoint(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINT, Text.of(value));
    }

    @Override
    public Person.Builder addContactPoints(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value);
    }

    @Override
    public Person.Builder addContactPoints(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, value.build());
    }

    @Override
    public Person.Builder addContactPoints(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_POINTS, Text.of(value));
    }

    @Override
    public Person.Builder addDeathDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_DEATH_DATE, value);
    }

    @Override
    public Person.Builder addDeathDate(String value) {
      return addProperty(CoreConstants.PROPERTY_DEATH_DATE, Text.of(value));
    }

    @Override
    public Person.Builder addDeathPlace(Place value) {
      return addProperty(CoreConstants.PROPERTY_DEATH_PLACE, value);
    }

    @Override
    public Person.Builder addDeathPlace(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DEATH_PLACE, value.build());
    }

    @Override
    public Person.Builder addDeathPlace(String value) {
      return addProperty(CoreConstants.PROPERTY_DEATH_PLACE, Text.of(value));
    }

    @Override
    public Person.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Person.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Person.Builder addDuns(Text value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, value);
    }

    @Override
    public Person.Builder addDuns(String value) {
      return addProperty(CoreConstants.PROPERTY_DUNS, Text.of(value));
    }

    @Override
    public Person.Builder addEmail(Text value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, value);
    }

    @Override
    public Person.Builder addEmail(String value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, Text.of(value));
    }

    @Override
    public Person.Builder addFamilyName(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAMILY_NAME, value);
    }

    @Override
    public Person.Builder addFamilyName(String value) {
      return addProperty(CoreConstants.PROPERTY_FAMILY_NAME, Text.of(value));
    }

    @Override
    public Person.Builder addFaxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, value);
    }

    @Override
    public Person.Builder addFaxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, Text.of(value));
    }

    @Override
    public Person.Builder addFollows(Person value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWS, value);
    }

    @Override
    public Person.Builder addFollows(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWS, value.build());
    }

    @Override
    public Person.Builder addFollows(String value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWS, Text.of(value));
    }

    @Override
    public Person.Builder addGender(Text value) {
      return addProperty(CoreConstants.PROPERTY_GENDER, value);
    }

    @Override
    public Person.Builder addGender(String value) {
      return addProperty(CoreConstants.PROPERTY_GENDER, Text.of(value));
    }

    @Override
    public Person.Builder addGivenName(Text value) {
      return addProperty(CoreConstants.PROPERTY_GIVEN_NAME, value);
    }

    @Override
    public Person.Builder addGivenName(String value) {
      return addProperty(CoreConstants.PROPERTY_GIVEN_NAME, Text.of(value));
    }

    @Override
    public Person.Builder addGlobalLocationNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, value);
    }

    @Override
    public Person.Builder addGlobalLocationNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER, Text.of(value));
    }

    @Override
    public Person.Builder addHasOfferCatalog(OfferCatalog value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value);
    }

    @Override
    public Person.Builder addHasOfferCatalog(OfferCatalog.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, value.build());
    }

    @Override
    public Person.Builder addHasOfferCatalog(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_OFFER_CATALOG, Text.of(value));
    }

    @Override
    public Person.Builder addHasPOS(Place value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value);
    }

    @Override
    public Person.Builder addHasPOS(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, value.build());
    }

    @Override
    public Person.Builder addHasPOS(String value) {
      return addProperty(CoreConstants.PROPERTY_HAS_POS, Text.of(value));
    }

    @Override
    public Person.Builder addHeight(Distance value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Person.Builder addHeight(Distance.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Person.Builder addHeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value);
    }

    @Override
    public Person.Builder addHeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, value.build());
    }

    @Override
    public Person.Builder addHeight(String value) {
      return addProperty(CoreConstants.PROPERTY_HEIGHT, Text.of(value));
    }

    @Override
    public Person.Builder addHomeLocation(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_HOME_LOCATION, value);
    }

    @Override
    public Person.Builder addHomeLocation(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HOME_LOCATION, value.build());
    }

    @Override
    public Person.Builder addHomeLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_HOME_LOCATION, value);
    }

    @Override
    public Person.Builder addHomeLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HOME_LOCATION, value.build());
    }

    @Override
    public Person.Builder addHomeLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_HOME_LOCATION, Text.of(value));
    }

    @Override
    public Person.Builder addHonorificPrefix(Text value) {
      return addProperty(CoreConstants.PROPERTY_HONORIFIC_PREFIX, value);
    }

    @Override
    public Person.Builder addHonorificPrefix(String value) {
      return addProperty(CoreConstants.PROPERTY_HONORIFIC_PREFIX, Text.of(value));
    }

    @Override
    public Person.Builder addHonorificSuffix(Text value) {
      return addProperty(CoreConstants.PROPERTY_HONORIFIC_SUFFIX, value);
    }

    @Override
    public Person.Builder addHonorificSuffix(String value) {
      return addProperty(CoreConstants.PROPERTY_HONORIFIC_SUFFIX, Text.of(value));
    }

    @Override
    public Person.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Person.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Person.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Person.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Person.Builder addIsicV4(Text value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, value);
    }

    @Override
    public Person.Builder addIsicV4(String value) {
      return addProperty(CoreConstants.PROPERTY_ISIC_V4, Text.of(value));
    }

    @Override
    public Person.Builder addJobTitle(Text value) {
      return addProperty(CoreConstants.PROPERTY_JOB_TITLE, value);
    }

    @Override
    public Person.Builder addJobTitle(String value) {
      return addProperty(CoreConstants.PROPERTY_JOB_TITLE, Text.of(value));
    }

    @Override
    public Person.Builder addKnows(Person value) {
      return addProperty(CoreConstants.PROPERTY_KNOWS, value);
    }

    @Override
    public Person.Builder addKnows(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_KNOWS, value.build());
    }

    @Override
    public Person.Builder addKnows(String value) {
      return addProperty(CoreConstants.PROPERTY_KNOWS, Text.of(value));
    }

    @Override
    public Person.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Person.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Person.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Person.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Person.Builder addMakesOffer(Offer value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value);
    }

    @Override
    public Person.Builder addMakesOffer(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, value.build());
    }

    @Override
    public Person.Builder addMakesOffer(String value) {
      return addProperty(CoreConstants.PROPERTY_MAKES_OFFER, Text.of(value));
    }

    @Override
    public Person.Builder addMemberOf(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public Person.Builder addMemberOf(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public Person.Builder addMemberOf(ProgramMembership value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value);
    }

    @Override
    public Person.Builder addMemberOf(ProgramMembership.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, value.build());
    }

    @Override
    public Person.Builder addMemberOf(String value) {
      return addProperty(CoreConstants.PROPERTY_MEMBER_OF, Text.of(value));
    }

    @Override
    public Person.Builder addNaics(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, value);
    }

    @Override
    public Person.Builder addNaics(String value) {
      return addProperty(CoreConstants.PROPERTY_NAICS, Text.of(value));
    }

    @Override
    public Person.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Person.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Person.Builder addNationality(Country value) {
      return addProperty(CoreConstants.PROPERTY_NATIONALITY, value);
    }

    @Override
    public Person.Builder addNationality(Country.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NATIONALITY, value.build());
    }

    @Override
    public Person.Builder addNationality(String value) {
      return addProperty(CoreConstants.PROPERTY_NATIONALITY, Text.of(value));
    }

    @Override
    public Person.Builder addNetWorth(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_NET_WORTH, value);
    }

    @Override
    public Person.Builder addNetWorth(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NET_WORTH, value.build());
    }

    @Override
    public Person.Builder addNetWorth(String value) {
      return addProperty(CoreConstants.PROPERTY_NET_WORTH, Text.of(value));
    }

    @Override
    public Person.Builder addOwns(OwnershipInfo value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public Person.Builder addOwns(OwnershipInfo.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public Person.Builder addOwns(Product value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value);
    }

    @Override
    public Person.Builder addOwns(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, value.build());
    }

    @Override
    public Person.Builder addOwns(String value) {
      return addProperty(CoreConstants.PROPERTY_OWNS, Text.of(value));
    }

    @Override
    public Person.Builder addParent(Person value) {
      return addProperty(CoreConstants.PROPERTY_PARENT, value);
    }

    @Override
    public Person.Builder addParent(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARENT, value.build());
    }

    @Override
    public Person.Builder addParent(String value) {
      return addProperty(CoreConstants.PROPERTY_PARENT, Text.of(value));
    }

    @Override
    public Person.Builder addParents(Person value) {
      return addProperty(CoreConstants.PROPERTY_PARENTS, value);
    }

    @Override
    public Person.Builder addParents(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARENTS, value.build());
    }

    @Override
    public Person.Builder addParents(String value) {
      return addProperty(CoreConstants.PROPERTY_PARENTS, Text.of(value));
    }

    @Override
    public Person.Builder addPerformerIn(Event value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER_IN, value);
    }

    @Override
    public Person.Builder addPerformerIn(Event.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER_IN, value.build());
    }

    @Override
    public Person.Builder addPerformerIn(String value) {
      return addProperty(CoreConstants.PROPERTY_PERFORMER_IN, Text.of(value));
    }

    @Override
    public Person.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Person.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Person.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Person.Builder addRelatedTo(Person value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_TO, value);
    }

    @Override
    public Person.Builder addRelatedTo(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_TO, value.build());
    }

    @Override
    public Person.Builder addRelatedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_TO, Text.of(value));
    }

    @Override
    public Person.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Person.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Person.Builder addSeeks(Demand value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value);
    }

    @Override
    public Person.Builder addSeeks(Demand.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, value.build());
    }

    @Override
    public Person.Builder addSeeks(String value) {
      return addProperty(CoreConstants.PROPERTY_SEEKS, Text.of(value));
    }

    @Override
    public Person.Builder addSibling(Person value) {
      return addProperty(CoreConstants.PROPERTY_SIBLING, value);
    }

    @Override
    public Person.Builder addSibling(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SIBLING, value.build());
    }

    @Override
    public Person.Builder addSibling(String value) {
      return addProperty(CoreConstants.PROPERTY_SIBLING, Text.of(value));
    }

    @Override
    public Person.Builder addSiblings(Person value) {
      return addProperty(CoreConstants.PROPERTY_SIBLINGS, value);
    }

    @Override
    public Person.Builder addSiblings(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SIBLINGS, value.build());
    }

    @Override
    public Person.Builder addSiblings(String value) {
      return addProperty(CoreConstants.PROPERTY_SIBLINGS, Text.of(value));
    }

    @Override
    public Person.Builder addSpouse(Person value) {
      return addProperty(CoreConstants.PROPERTY_SPOUSE, value);
    }

    @Override
    public Person.Builder addSpouse(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SPOUSE, value.build());
    }

    @Override
    public Person.Builder addSpouse(String value) {
      return addProperty(CoreConstants.PROPERTY_SPOUSE, Text.of(value));
    }

    @Override
    public Person.Builder addTaxID(Text value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, value);
    }

    @Override
    public Person.Builder addTaxID(String value) {
      return addProperty(CoreConstants.PROPERTY_TAX_ID, Text.of(value));
    }

    @Override
    public Person.Builder addTelephone(Text value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, value);
    }

    @Override
    public Person.Builder addTelephone(String value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, Text.of(value));
    }

    @Override
    public Person.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Person.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Person.Builder addVatID(Text value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, value);
    }

    @Override
    public Person.Builder addVatID(String value) {
      return addProperty(CoreConstants.PROPERTY_VAT_ID, Text.of(value));
    }

    @Override
    public Person.Builder addWeight(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value);
    }

    @Override
    public Person.Builder addWeight(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, value.build());
    }

    @Override
    public Person.Builder addWeight(String value) {
      return addProperty(CoreConstants.PROPERTY_WEIGHT, Text.of(value));
    }

    @Override
    public Person.Builder addWorkLocation(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_WORK_LOCATION, value);
    }

    @Override
    public Person.Builder addWorkLocation(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_LOCATION, value.build());
    }

    @Override
    public Person.Builder addWorkLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_WORK_LOCATION, value);
    }

    @Override
    public Person.Builder addWorkLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORK_LOCATION, value.build());
    }

    @Override
    public Person.Builder addWorkLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_LOCATION, Text.of(value));
    }

    @Override
    public Person.Builder addWorksFor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_WORKS_FOR, value);
    }

    @Override
    public Person.Builder addWorksFor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_WORKS_FOR, value.build());
    }

    @Override
    public Person.Builder addWorksFor(String value) {
      return addProperty(CoreConstants.PROPERTY_WORKS_FOR, Text.of(value));
    }

    @Override
    public Person.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Person.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Person.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Person.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Person.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Person.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Person build() {
      return new PersonImpl(properties, reverseMap);
    }
  }

  public PersonImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_PERSON;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAdditionalNameList() {
    return getProperty(CoreConstants.PROPERTY_ADDITIONAL_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAddressList() {
    return getProperty(CoreConstants.PROPERTY_ADDRESS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAffiliationList() {
    return getProperty(CoreConstants.PROPERTY_AFFILIATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAlumniOfList() {
    return getProperty(CoreConstants.PROPERTY_ALUMNI_OF);
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
  public ImmutableList<SchemaOrgType> getBirthDateList() {
    return getProperty(CoreConstants.PROPERTY_BIRTH_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBirthPlaceList() {
    return getProperty(CoreConstants.PROPERTY_BIRTH_PLACE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBrandList() {
    return getProperty(CoreConstants.PROPERTY_BRAND);
  }

  @Override
  public ImmutableList<SchemaOrgType> getChildrenList() {
    return getProperty(CoreConstants.PROPERTY_CHILDREN);
  }

  @Override
  public ImmutableList<SchemaOrgType> getColleagueList() {
    return getProperty(CoreConstants.PROPERTY_COLLEAGUE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getColleaguesList() {
    return getProperty(CoreConstants.PROPERTY_COLLEAGUES);
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
  public ImmutableList<SchemaOrgType> getDeathDateList() {
    return getProperty(CoreConstants.PROPERTY_DEATH_DATE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDeathPlaceList() {
    return getProperty(CoreConstants.PROPERTY_DEATH_PLACE);
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
  public ImmutableList<SchemaOrgType> getFamilyNameList() {
    return getProperty(CoreConstants.PROPERTY_FAMILY_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFaxNumberList() {
    return getProperty(CoreConstants.PROPERTY_FAX_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFollowsList() {
    return getProperty(CoreConstants.PROPERTY_FOLLOWS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGenderList() {
    return getProperty(CoreConstants.PROPERTY_GENDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGivenNameList() {
    return getProperty(CoreConstants.PROPERTY_GIVEN_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getGlobalLocationNumberList() {
    return getProperty(CoreConstants.PROPERTY_GLOBAL_LOCATION_NUMBER);
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
  public ImmutableList<SchemaOrgType> getHeightList() {
    return getProperty(CoreConstants.PROPERTY_HEIGHT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHomeLocationList() {
    return getProperty(CoreConstants.PROPERTY_HOME_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHonorificPrefixList() {
    return getProperty(CoreConstants.PROPERTY_HONORIFIC_PREFIX);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHonorificSuffixList() {
    return getProperty(CoreConstants.PROPERTY_HONORIFIC_SUFFIX);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsicV4List() {
    return getProperty(CoreConstants.PROPERTY_ISIC_V4);
  }

  @Override
  public ImmutableList<SchemaOrgType> getJobTitleList() {
    return getProperty(CoreConstants.PROPERTY_JOB_TITLE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getKnowsList() {
    return getProperty(CoreConstants.PROPERTY_KNOWS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMakesOfferList() {
    return getProperty(CoreConstants.PROPERTY_MAKES_OFFER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMemberOfList() {
    return getProperty(CoreConstants.PROPERTY_MEMBER_OF);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNaicsList() {
    return getProperty(CoreConstants.PROPERTY_NAICS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNationalityList() {
    return getProperty(CoreConstants.PROPERTY_NATIONALITY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNetWorthList() {
    return getProperty(CoreConstants.PROPERTY_NET_WORTH);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOwnsList() {
    return getProperty(CoreConstants.PROPERTY_OWNS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getParentList() {
    return getProperty(CoreConstants.PROPERTY_PARENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getParentsList() {
    return getProperty(CoreConstants.PROPERTY_PARENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPerformerInList() {
    return getProperty(CoreConstants.PROPERTY_PERFORMER_IN);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRelatedToList() {
    return getProperty(CoreConstants.PROPERTY_RELATED_TO);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSeeksList() {
    return getProperty(CoreConstants.PROPERTY_SEEKS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSiblingList() {
    return getProperty(CoreConstants.PROPERTY_SIBLING);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSiblingsList() {
    return getProperty(CoreConstants.PROPERTY_SIBLINGS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSpouseList() {
    return getProperty(CoreConstants.PROPERTY_SPOUSE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTaxIDList() {
    return getProperty(CoreConstants.PROPERTY_TAX_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTelephoneList() {
    return getProperty(CoreConstants.PROPERTY_TELEPHONE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getVatIDList() {
    return getProperty(CoreConstants.PROPERTY_VAT_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWeightList() {
    return getProperty(CoreConstants.PROPERTY_WEIGHT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWorkLocationList() {
    return getProperty(CoreConstants.PROPERTY_WORK_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWorksForList() {
    return getProperty(CoreConstants.PROPERTY_WORKS_FOR);
  }
}
