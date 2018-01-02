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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/JobPosting">http://schema.org/JobPosting</a>. */
public interface JobPosting extends Intangible {

  /**
   * Builder interface of <a href="http://schema.org/JobPosting">http://schema.org/JobPosting</a>.
   */
  public interface Builder extends Intangible.Builder {

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

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property baseSalary. */
    Builder addBaseSalary(Number value);

    /** Add a value to property baseSalary. */
    Builder addBaseSalary(PriceSpecification value);

    /** Add a value to property baseSalary. */
    Builder addBaseSalary(PriceSpecification.Builder value);

    /** Add a value to property baseSalary. */
    Builder addBaseSalary(String value);

    /** Add a value to property benefits. */
    Builder addBenefits(Text value);

    /** Add a value to property benefits. */
    Builder addBenefits(String value);

    /** Add a value to property datePosted. */
    Builder addDatePosted(Date value);

    /** Add a value to property datePosted. */
    Builder addDatePosted(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property educationRequirements. */
    Builder addEducationRequirements(Text value);

    /** Add a value to property educationRequirements. */
    Builder addEducationRequirements(String value);

    /** Add a value to property employmentType. */
    Builder addEmploymentType(Text value);

    /** Add a value to property employmentType. */
    Builder addEmploymentType(String value);

    /** Add a value to property experienceRequirements. */
    Builder addExperienceRequirements(Text value);

    /** Add a value to property experienceRequirements. */
    Builder addExperienceRequirements(String value);

    /** Add a value to property hiringOrganization. */
    Builder addHiringOrganization(Organization value);

    /** Add a value to property hiringOrganization. */
    Builder addHiringOrganization(Organization.Builder value);

    /** Add a value to property hiringOrganization. */
    Builder addHiringOrganization(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property incentiveCompensation. */
    Builder addIncentiveCompensation(Text value);

    /** Add a value to property incentiveCompensation. */
    Builder addIncentiveCompensation(String value);

    /** Add a value to property incentives. */
    Builder addIncentives(Text value);

    /** Add a value to property incentives. */
    Builder addIncentives(String value);

    /** Add a value to property industry. */
    Builder addIndustry(Text value);

    /** Add a value to property industry. */
    Builder addIndustry(String value);

    /** Add a value to property jobBenefits. */
    Builder addJobBenefits(Text value);

    /** Add a value to property jobBenefits. */
    Builder addJobBenefits(String value);

    /** Add a value to property jobLocation. */
    Builder addJobLocation(Place value);

    /** Add a value to property jobLocation. */
    Builder addJobLocation(Place.Builder value);

    /** Add a value to property jobLocation. */
    Builder addJobLocation(String value);

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

    /** Add a value to property occupationalCategory. */
    Builder addOccupationalCategory(Text value);

    /** Add a value to property occupationalCategory. */
    Builder addOccupationalCategory(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property qualifications. */
    Builder addQualifications(Text value);

    /** Add a value to property qualifications. */
    Builder addQualifications(String value);

    /** Add a value to property responsibilities. */
    Builder addResponsibilities(Text value);

    /** Add a value to property responsibilities. */
    Builder addResponsibilities(String value);

    /** Add a value to property salaryCurrency. */
    Builder addSalaryCurrency(Text value);

    /** Add a value to property salaryCurrency. */
    Builder addSalaryCurrency(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property skills. */
    Builder addSkills(Text value);

    /** Add a value to property skills. */
    Builder addSkills(String value);

    /** Add a value to property specialCommitments. */
    Builder addSpecialCommitments(Text value);

    /** Add a value to property specialCommitments. */
    Builder addSpecialCommitments(String value);

    /** Add a value to property title. */
    Builder addTitle(Text value);

    /** Add a value to property title. */
    Builder addTitle(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property workHours. */
    Builder addWorkHours(Text value);

    /** Add a value to property workHours. */
    Builder addWorkHours(String value);

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

    /** Build a {@link JobPosting} object. */
    JobPosting build();
  }

  /**
   * Returns the value list of property baseSalary. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getBaseSalaryList();

  /**
   * Returns the value list of property benefits. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getBenefitsList();

  /**
   * Returns the value list of property datePosted. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDatePostedList();

  /**
   * Returns the value list of property educationRequirements. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getEducationRequirementsList();

  /**
   * Returns the value list of property employmentType. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getEmploymentTypeList();

  /**
   * Returns the value list of property experienceRequirements. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getExperienceRequirementsList();

  /**
   * Returns the value list of property hiringOrganization. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getHiringOrganizationList();

  /**
   * Returns the value list of property incentiveCompensation. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getIncentiveCompensationList();

  /**
   * Returns the value list of property incentives. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getIncentivesList();

  /**
   * Returns the value list of property industry. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getIndustryList();

  /**
   * Returns the value list of property jobBenefits. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getJobBenefitsList();

  /**
   * Returns the value list of property jobLocation. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getJobLocationList();

  /**
   * Returns the value list of property occupationalCategory. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getOccupationalCategoryList();

  /**
   * Returns the value list of property qualifications. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getQualificationsList();

  /**
   * Returns the value list of property responsibilities. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getResponsibilitiesList();

  /**
   * Returns the value list of property salaryCurrency. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getSalaryCurrencyList();

  /**
   * Returns the value list of property skills. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getSkillsList();

  /**
   * Returns the value list of property specialCommitments. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getSpecialCommitmentsList();

  /**
   * Returns the value list of property title. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getTitleList();

  /**
   * Returns the value list of property workHours. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getWorkHoursList();
}
