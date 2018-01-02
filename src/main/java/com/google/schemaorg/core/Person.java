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
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/Person">http://schema.org/Person</a>. */
public interface Person extends Thing {

  /** Builder interface of <a href="http://schema.org/Person">http://schema.org/Person</a>. */
  public interface Builder extends Thing.Builder {

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

    /** Add a value to property additionalName. */
    Builder addAdditionalName(Text value);

    /** Add a value to property additionalName. */
    Builder addAdditionalName(String value);

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

    /** Add a value to property affiliation. */
    Builder addAffiliation(Organization value);

    /** Add a value to property affiliation. */
    Builder addAffiliation(Organization.Builder value);

    /** Add a value to property affiliation. */
    Builder addAffiliation(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property alumniOf. */
    Builder addAlumniOf(EducationalOrganization value);

    /** Add a value to property alumniOf. */
    Builder addAlumniOf(EducationalOrganization.Builder value);

    /** Add a value to property alumniOf. */
    Builder addAlumniOf(Organization value);

    /** Add a value to property alumniOf. */
    Builder addAlumniOf(Organization.Builder value);

    /** Add a value to property alumniOf. */
    Builder addAlumniOf(String value);

    /** Add a value to property award. */
    Builder addAward(Text value);

    /** Add a value to property award. */
    Builder addAward(String value);

    /** Add a value to property awards. */
    Builder addAwards(Text value);

    /** Add a value to property awards. */
    Builder addAwards(String value);

    /** Add a value to property birthDate. */
    Builder addBirthDate(Date value);

    /** Add a value to property birthDate. */
    Builder addBirthDate(String value);

    /** Add a value to property birthPlace. */
    Builder addBirthPlace(Place value);

    /** Add a value to property birthPlace. */
    Builder addBirthPlace(Place.Builder value);

    /** Add a value to property birthPlace. */
    Builder addBirthPlace(String value);

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

    /** Add a value to property children. */
    Builder addChildren(Person value);

    /** Add a value to property children. */
    Builder addChildren(Person.Builder value);

    /** Add a value to property children. */
    Builder addChildren(String value);

    /** Add a value to property colleague. */
    Builder addColleague(Person value);

    /** Add a value to property colleague. */
    Builder addColleague(Person.Builder value);

    /** Add a value to property colleague. */
    Builder addColleague(String value);

    /** Add a value to property colleagues. */
    Builder addColleagues(Person value);

    /** Add a value to property colleagues. */
    Builder addColleagues(Person.Builder value);

    /** Add a value to property colleagues. */
    Builder addColleagues(String value);

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

    /** Add a value to property deathDate. */
    Builder addDeathDate(Date value);

    /** Add a value to property deathDate. */
    Builder addDeathDate(String value);

    /** Add a value to property deathPlace. */
    Builder addDeathPlace(Place value);

    /** Add a value to property deathPlace. */
    Builder addDeathPlace(Place.Builder value);

    /** Add a value to property deathPlace. */
    Builder addDeathPlace(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property duns. */
    Builder addDuns(Text value);

    /** Add a value to property duns. */
    Builder addDuns(String value);

    /** Add a value to property email. */
    Builder addEmail(Text value);

    /** Add a value to property email. */
    Builder addEmail(String value);

    /** Add a value to property familyName. */
    Builder addFamilyName(Text value);

    /** Add a value to property familyName. */
    Builder addFamilyName(String value);

    /** Add a value to property faxNumber. */
    Builder addFaxNumber(Text value);

    /** Add a value to property faxNumber. */
    Builder addFaxNumber(String value);

    /** Add a value to property follows. */
    Builder addFollows(Person value);

    /** Add a value to property follows. */
    Builder addFollows(Person.Builder value);

    /** Add a value to property follows. */
    Builder addFollows(String value);

    /** Add a value to property gender. */
    Builder addGender(Text value);

    /** Add a value to property gender. */
    Builder addGender(String value);

    /** Add a value to property givenName. */
    Builder addGivenName(Text value);

    /** Add a value to property givenName. */
    Builder addGivenName(String value);

    /** Add a value to property globalLocationNumber. */
    Builder addGlobalLocationNumber(Text value);

    /** Add a value to property globalLocationNumber. */
    Builder addGlobalLocationNumber(String value);

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

    /** Add a value to property height. */
    Builder addHeight(Distance value);

    /** Add a value to property height. */
    Builder addHeight(Distance.Builder value);

    /** Add a value to property height. */
    Builder addHeight(QuantitativeValue value);

    /** Add a value to property height. */
    Builder addHeight(QuantitativeValue.Builder value);

    /** Add a value to property height. */
    Builder addHeight(String value);

    /** Add a value to property homeLocation. */
    Builder addHomeLocation(ContactPoint value);

    /** Add a value to property homeLocation. */
    Builder addHomeLocation(ContactPoint.Builder value);

    /** Add a value to property homeLocation. */
    Builder addHomeLocation(Place value);

    /** Add a value to property homeLocation. */
    Builder addHomeLocation(Place.Builder value);

    /** Add a value to property homeLocation. */
    Builder addHomeLocation(String value);

    /** Add a value to property honorificPrefix. */
    Builder addHonorificPrefix(Text value);

    /** Add a value to property honorificPrefix. */
    Builder addHonorificPrefix(String value);

    /** Add a value to property honorificSuffix. */
    Builder addHonorificSuffix(Text value);

    /** Add a value to property honorificSuffix. */
    Builder addHonorificSuffix(String value);

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

    /** Add a value to property jobTitle. */
    Builder addJobTitle(Text value);

    /** Add a value to property jobTitle. */
    Builder addJobTitle(String value);

    /** Add a value to property knows. */
    Builder addKnows(Person value);

    /** Add a value to property knows. */
    Builder addKnows(Person.Builder value);

    /** Add a value to property knows. */
    Builder addKnows(String value);

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

    /** Add a value to property naics. */
    Builder addNaics(Text value);

    /** Add a value to property naics. */
    Builder addNaics(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property nationality. */
    Builder addNationality(Country value);

    /** Add a value to property nationality. */
    Builder addNationality(Country.Builder value);

    /** Add a value to property nationality. */
    Builder addNationality(String value);

    /** Add a value to property netWorth. */
    Builder addNetWorth(PriceSpecification value);

    /** Add a value to property netWorth. */
    Builder addNetWorth(PriceSpecification.Builder value);

    /** Add a value to property netWorth. */
    Builder addNetWorth(String value);

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

    /** Add a value to property parent. */
    Builder addParent(Person value);

    /** Add a value to property parent. */
    Builder addParent(Person.Builder value);

    /** Add a value to property parent. */
    Builder addParent(String value);

    /** Add a value to property parents. */
    Builder addParents(Person value);

    /** Add a value to property parents. */
    Builder addParents(Person.Builder value);

    /** Add a value to property parents. */
    Builder addParents(String value);

    /** Add a value to property performerIn. */
    Builder addPerformerIn(Event value);

    /** Add a value to property performerIn. */
    Builder addPerformerIn(Event.Builder value);

    /** Add a value to property performerIn. */
    Builder addPerformerIn(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property relatedTo. */
    Builder addRelatedTo(Person value);

    /** Add a value to property relatedTo. */
    Builder addRelatedTo(Person.Builder value);

    /** Add a value to property relatedTo. */
    Builder addRelatedTo(String value);

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

    /** Add a value to property sibling. */
    Builder addSibling(Person value);

    /** Add a value to property sibling. */
    Builder addSibling(Person.Builder value);

    /** Add a value to property sibling. */
    Builder addSibling(String value);

    /** Add a value to property siblings. */
    Builder addSiblings(Person value);

    /** Add a value to property siblings. */
    Builder addSiblings(Person.Builder value);

    /** Add a value to property siblings. */
    Builder addSiblings(String value);

    /** Add a value to property spouse. */
    Builder addSpouse(Person value);

    /** Add a value to property spouse. */
    Builder addSpouse(Person.Builder value);

    /** Add a value to property spouse. */
    Builder addSpouse(String value);

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

    /** Add a value to property weight. */
    Builder addWeight(QuantitativeValue value);

    /** Add a value to property weight. */
    Builder addWeight(QuantitativeValue.Builder value);

    /** Add a value to property weight. */
    Builder addWeight(String value);

    /** Add a value to property workLocation. */
    Builder addWorkLocation(ContactPoint value);

    /** Add a value to property workLocation. */
    Builder addWorkLocation(ContactPoint.Builder value);

    /** Add a value to property workLocation. */
    Builder addWorkLocation(Place value);

    /** Add a value to property workLocation. */
    Builder addWorkLocation(Place.Builder value);

    /** Add a value to property workLocation. */
    Builder addWorkLocation(String value);

    /** Add a value to property worksFor. */
    Builder addWorksFor(Organization value);

    /** Add a value to property worksFor. */
    Builder addWorksFor(Organization.Builder value);

    /** Add a value to property worksFor. */
    Builder addWorksFor(String value);

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

    /** Build a {@link Person} object. */
    Person build();
  }

  /**
   * Returns the value list of property additionalName. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAdditionalNameList();

  /**
   * Returns the value list of property address. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAddressList();

  /**
   * Returns the value list of property affiliation. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getAffiliationList();

  /**
   * Returns the value list of property alumniOf. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAlumniOfList();

  /**
   * Returns the value list of property award. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAwardList();

  /**
   * Returns the value list of property awards. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getAwardsList();

  /**
   * Returns the value list of property birthDate. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBirthDateList();

  /**
   * Returns the value list of property birthPlace. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getBirthPlaceList();

  /**
   * Returns the value list of property brand. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBrandList();

  /**
   * Returns the value list of property children. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getChildrenList();

  /**
   * Returns the value list of property colleague. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getColleagueList();

  /**
   * Returns the value list of property colleagues. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getColleaguesList();

  /**
   * Returns the value list of property contactPoint. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getContactPointList();

  /**
   * Returns the value list of property contactPoints. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getContactPointsList();

  /**
   * Returns the value list of property deathDate. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getDeathDateList();

  /**
   * Returns the value list of property deathPlace. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDeathPlaceList();

  /**
   * Returns the value list of property duns. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getDunsList();

  /**
   * Returns the value list of property email. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getEmailList();

  /**
   * Returns the value list of property familyName. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getFamilyNameList();

  /**
   * Returns the value list of property faxNumber. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getFaxNumberList();

  /**
   * Returns the value list of property follows. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getFollowsList();

  /**
   * Returns the value list of property gender. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getGenderList();

  /**
   * Returns the value list of property givenName. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getGivenNameList();

  /**
   * Returns the value list of property globalLocationNumber. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getGlobalLocationNumberList();

  /**
   * Returns the value list of property hasOfferCatalog. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getHasOfferCatalogList();

  /**
   * Returns the value list of property hasPOS. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getHasPOSList();

  /**
   * Returns the value list of property height. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getHeightList();

  /**
   * Returns the value list of property homeLocation. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getHomeLocationList();

  /**
   * Returns the value list of property honorificPrefix. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getHonorificPrefixList();

  /**
   * Returns the value list of property honorificSuffix. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getHonorificSuffixList();

  /**
   * Returns the value list of property isicV4. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getIsicV4List();

  /**
   * Returns the value list of property jobTitle. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getJobTitleList();

  /**
   * Returns the value list of property knows. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getKnowsList();

  /**
   * Returns the value list of property makesOffer. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getMakesOfferList();

  /**
   * Returns the value list of property memberOf. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getMemberOfList();

  /**
   * Returns the value list of property naics. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getNaicsList();

  /**
   * Returns the value list of property nationality. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getNationalityList();

  /**
   * Returns the value list of property netWorth. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getNetWorthList();

  /**
   * Returns the value list of property owns. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getOwnsList();

  /**
   * Returns the value list of property parent. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getParentList();

  /**
   * Returns the value list of property parents. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getParentsList();

  /**
   * Returns the value list of property performerIn. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getPerformerInList();

  /**
   * Returns the value list of property relatedTo. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getRelatedToList();

  /**
   * Returns the value list of property seeks. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSeeksList();

  /**
   * Returns the value list of property sibling. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSiblingList();

  /**
   * Returns the value list of property siblings. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSiblingsList();

  /**
   * Returns the value list of property spouse. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSpouseList();

  /**
   * Returns the value list of property taxID. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getTaxIDList();

  /**
   * Returns the value list of property telephone. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getTelephoneList();

  /**
   * Returns the value list of property vatID. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getVatIDList();

  /**
   * Returns the value list of property weight. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getWeightList();

  /**
   * Returns the value list of property workLocation. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getWorkLocationList();

  /**
   * Returns the value list of property worksFor. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getWorksForList();
}
