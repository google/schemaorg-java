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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link JobPosting}. */
public class JobPostingImpl extends IntangibleImpl implements JobPosting {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BASE_SALARY);

    builder.add(CoreConstants.PROPERTY_BENEFITS);

    builder.add(CoreConstants.PROPERTY_DATE_POSTED);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_EDUCATION_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_EMPLOYMENT_TYPE);

    builder.add(CoreConstants.PROPERTY_EXPERIENCE_REQUIREMENTS);

    builder.add(CoreConstants.PROPERTY_HIRING_ORGANIZATION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INCENTIVE_COMPENSATION);

    builder.add(CoreConstants.PROPERTY_INCENTIVES);

    builder.add(CoreConstants.PROPERTY_INDUSTRY);

    builder.add(CoreConstants.PROPERTY_JOB_BENEFITS);

    builder.add(CoreConstants.PROPERTY_JOB_LOCATION);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OCCUPATIONAL_CATEGORY);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_QUALIFICATIONS);

    builder.add(CoreConstants.PROPERTY_RESPONSIBILITIES);

    builder.add(CoreConstants.PROPERTY_SALARY_CURRENCY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SKILLS);

    builder.add(CoreConstants.PROPERTY_SPECIAL_COMMITMENTS);

    builder.add(CoreConstants.PROPERTY_TITLE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_WORK_HOURS);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<JobPosting.Builder>
      implements JobPosting.Builder {

    @Override
    public JobPosting.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public JobPosting.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public JobPosting.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public JobPosting.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public JobPosting.Builder addBaseSalary(Number value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, value);
    }

    @Override
    public JobPosting.Builder addBaseSalary(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, value);
    }

    @Override
    public JobPosting.Builder addBaseSalary(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, value.build());
    }

    @Override
    public JobPosting.Builder addBaseSalary(String value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, Text.of(value));
    }

    @Override
    public JobPosting.Builder addBenefits(Text value) {
      return addProperty(CoreConstants.PROPERTY_BENEFITS, value);
    }

    @Override
    public JobPosting.Builder addBenefits(String value) {
      return addProperty(CoreConstants.PROPERTY_BENEFITS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addDatePosted(Date value) {
      return addProperty(CoreConstants.PROPERTY_DATE_POSTED, value);
    }

    @Override
    public JobPosting.Builder addDatePosted(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_POSTED, Text.of(value));
    }

    @Override
    public JobPosting.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public JobPosting.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public JobPosting.Builder addEducationRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATION_REQUIREMENTS, value);
    }

    @Override
    public JobPosting.Builder addEducationRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_EDUCATION_REQUIREMENTS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addEmploymentType(Text value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYMENT_TYPE, value);
    }

    @Override
    public JobPosting.Builder addEmploymentType(String value) {
      return addProperty(CoreConstants.PROPERTY_EMPLOYMENT_TYPE, Text.of(value));
    }

    @Override
    public JobPosting.Builder addExperienceRequirements(Text value) {
      return addProperty(CoreConstants.PROPERTY_EXPERIENCE_REQUIREMENTS, value);
    }

    @Override
    public JobPosting.Builder addExperienceRequirements(String value) {
      return addProperty(CoreConstants.PROPERTY_EXPERIENCE_REQUIREMENTS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addHiringOrganization(Organization value) {
      return addProperty(CoreConstants.PROPERTY_HIRING_ORGANIZATION, value);
    }

    @Override
    public JobPosting.Builder addHiringOrganization(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HIRING_ORGANIZATION, value.build());
    }

    @Override
    public JobPosting.Builder addHiringOrganization(String value) {
      return addProperty(CoreConstants.PROPERTY_HIRING_ORGANIZATION, Text.of(value));
    }

    @Override
    public JobPosting.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public JobPosting.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public JobPosting.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public JobPosting.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public JobPosting.Builder addIncentiveCompensation(Text value) {
      return addProperty(CoreConstants.PROPERTY_INCENTIVE_COMPENSATION, value);
    }

    @Override
    public JobPosting.Builder addIncentiveCompensation(String value) {
      return addProperty(CoreConstants.PROPERTY_INCENTIVE_COMPENSATION, Text.of(value));
    }

    @Override
    public JobPosting.Builder addIncentives(Text value) {
      return addProperty(CoreConstants.PROPERTY_INCENTIVES, value);
    }

    @Override
    public JobPosting.Builder addIncentives(String value) {
      return addProperty(CoreConstants.PROPERTY_INCENTIVES, Text.of(value));
    }

    @Override
    public JobPosting.Builder addIndustry(Text value) {
      return addProperty(CoreConstants.PROPERTY_INDUSTRY, value);
    }

    @Override
    public JobPosting.Builder addIndustry(String value) {
      return addProperty(CoreConstants.PROPERTY_INDUSTRY, Text.of(value));
    }

    @Override
    public JobPosting.Builder addJobBenefits(Text value) {
      return addProperty(CoreConstants.PROPERTY_JOB_BENEFITS, value);
    }

    @Override
    public JobPosting.Builder addJobBenefits(String value) {
      return addProperty(CoreConstants.PROPERTY_JOB_BENEFITS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addJobLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_JOB_LOCATION, value);
    }

    @Override
    public JobPosting.Builder addJobLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_JOB_LOCATION, value.build());
    }

    @Override
    public JobPosting.Builder addJobLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_JOB_LOCATION, Text.of(value));
    }

    @Override
    public JobPosting.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public JobPosting.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public JobPosting.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public JobPosting.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public JobPosting.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public JobPosting.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public JobPosting.Builder addOccupationalCategory(Text value) {
      return addProperty(CoreConstants.PROPERTY_OCCUPATIONAL_CATEGORY, value);
    }

    @Override
    public JobPosting.Builder addOccupationalCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_OCCUPATIONAL_CATEGORY, Text.of(value));
    }

    @Override
    public JobPosting.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public JobPosting.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public JobPosting.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public JobPosting.Builder addQualifications(Text value) {
      return addProperty(CoreConstants.PROPERTY_QUALIFICATIONS, value);
    }

    @Override
    public JobPosting.Builder addQualifications(String value) {
      return addProperty(CoreConstants.PROPERTY_QUALIFICATIONS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addResponsibilities(Text value) {
      return addProperty(CoreConstants.PROPERTY_RESPONSIBILITIES, value);
    }

    @Override
    public JobPosting.Builder addResponsibilities(String value) {
      return addProperty(CoreConstants.PROPERTY_RESPONSIBILITIES, Text.of(value));
    }

    @Override
    public JobPosting.Builder addSalaryCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_SALARY_CURRENCY, value);
    }

    @Override
    public JobPosting.Builder addSalaryCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_SALARY_CURRENCY, Text.of(value));
    }

    @Override
    public JobPosting.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public JobPosting.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addSkills(Text value) {
      return addProperty(CoreConstants.PROPERTY_SKILLS, value);
    }

    @Override
    public JobPosting.Builder addSkills(String value) {
      return addProperty(CoreConstants.PROPERTY_SKILLS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addSpecialCommitments(Text value) {
      return addProperty(CoreConstants.PROPERTY_SPECIAL_COMMITMENTS, value);
    }

    @Override
    public JobPosting.Builder addSpecialCommitments(String value) {
      return addProperty(CoreConstants.PROPERTY_SPECIAL_COMMITMENTS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addTitle(Text value) {
      return addProperty(CoreConstants.PROPERTY_TITLE, value);
    }

    @Override
    public JobPosting.Builder addTitle(String value) {
      return addProperty(CoreConstants.PROPERTY_TITLE, Text.of(value));
    }

    @Override
    public JobPosting.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public JobPosting.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public JobPosting.Builder addWorkHours(Text value) {
      return addProperty(CoreConstants.PROPERTY_WORK_HOURS, value);
    }

    @Override
    public JobPosting.Builder addWorkHours(String value) {
      return addProperty(CoreConstants.PROPERTY_WORK_HOURS, Text.of(value));
    }

    @Override
    public JobPosting.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public JobPosting.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public JobPosting.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public JobPosting.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public JobPosting.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public JobPosting.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public JobPosting build() {
      return new JobPostingImpl(properties, reverseMap);
    }
  }

  public JobPostingImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_JOB_POSTING;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBaseSalaryList() {
    return getProperty(CoreConstants.PROPERTY_BASE_SALARY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBenefitsList() {
    return getProperty(CoreConstants.PROPERTY_BENEFITS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDatePostedList() {
    return getProperty(CoreConstants.PROPERTY_DATE_POSTED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEducationRequirementsList() {
    return getProperty(CoreConstants.PROPERTY_EDUCATION_REQUIREMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEmploymentTypeList() {
    return getProperty(CoreConstants.PROPERTY_EMPLOYMENT_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getExperienceRequirementsList() {
    return getProperty(CoreConstants.PROPERTY_EXPERIENCE_REQUIREMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHiringOrganizationList() {
    return getProperty(CoreConstants.PROPERTY_HIRING_ORGANIZATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIncentiveCompensationList() {
    return getProperty(CoreConstants.PROPERTY_INCENTIVE_COMPENSATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIncentivesList() {
    return getProperty(CoreConstants.PROPERTY_INCENTIVES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIndustryList() {
    return getProperty(CoreConstants.PROPERTY_INDUSTRY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getJobBenefitsList() {
    return getProperty(CoreConstants.PROPERTY_JOB_BENEFITS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getJobLocationList() {
    return getProperty(CoreConstants.PROPERTY_JOB_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOccupationalCategoryList() {
    return getProperty(CoreConstants.PROPERTY_OCCUPATIONAL_CATEGORY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getQualificationsList() {
    return getProperty(CoreConstants.PROPERTY_QUALIFICATIONS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getResponsibilitiesList() {
    return getProperty(CoreConstants.PROPERTY_RESPONSIBILITIES);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSalaryCurrencyList() {
    return getProperty(CoreConstants.PROPERTY_SALARY_CURRENCY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSkillsList() {
    return getProperty(CoreConstants.PROPERTY_SKILLS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSpecialCommitmentsList() {
    return getProperty(CoreConstants.PROPERTY_SPECIAL_COMMITMENTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTitleList() {
    return getProperty(CoreConstants.PROPERTY_TITLE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWorkHoursList() {
    return getProperty(CoreConstants.PROPERTY_WORK_HOURS);
  }
}
