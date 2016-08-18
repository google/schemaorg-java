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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link MedicalStudy}. */
public class MedicalStudyImpl extends MedicalEntityImpl implements MedicalStudy {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OUTCOME);

    builder.add(CoreConstants.PROPERTY_POPULATION);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SPONSOR);

    builder.add(CoreConstants.PROPERTY_STATUS);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_STUDY_LOCATION);

    builder.add(CoreConstants.PROPERTY_STUDY_SUBJECT);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<MedicalStudy.Builder>
      implements MedicalStudy.Builder {

    @Override
    public MedicalStudy.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public MedicalStudy.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public MedicalStudy.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public MedicalStudy.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public MedicalStudy.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public MedicalStudy.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public MedicalStudy.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public MedicalStudy.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalStudy.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public MedicalStudy.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalStudy.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalStudy.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public MedicalStudy.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalStudy.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public MedicalStudy.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public MedicalStudy.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addOutcome(Text value) {
      return addProperty(CoreConstants.PROPERTY_OUTCOME, value);
    }

    @Override
    public MedicalStudy.Builder addOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_OUTCOME, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addPopulation(Text value) {
      return addProperty(CoreConstants.PROPERTY_POPULATION, value);
    }

    @Override
    public MedicalStudy.Builder addPopulation(String value) {
      return addProperty(CoreConstants.PROPERTY_POPULATION, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public MedicalStudy.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public MedicalStudy.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public MedicalStudy.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public MedicalStudy.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public MedicalStudy.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public MedicalStudy.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addSponsor(Organization value) {
      return addProperty(CoreConstants.PROPERTY_SPONSOR, value);
    }

    @Override
    public MedicalStudy.Builder addSponsor(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SPONSOR, value.build());
    }

    @Override
    public MedicalStudy.Builder addSponsor(String value) {
      return addProperty(CoreConstants.PROPERTY_SPONSOR, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addStatus(MedicalStudyStatus value) {
      return addProperty(CoreConstants.PROPERTY_STATUS, value);
    }

    @Override
    public MedicalStudy.Builder addStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_STATUS, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public MedicalStudy.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public MedicalStudy.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addStudyLocation(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_STUDY_LOCATION, value);
    }

    @Override
    public MedicalStudy.Builder addStudyLocation(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY_LOCATION, value.build());
    }

    @Override
    public MedicalStudy.Builder addStudyLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY_LOCATION, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addStudySubject(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_STUDY_SUBJECT, value);
    }

    @Override
    public MedicalStudy.Builder addStudySubject(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY_SUBJECT, value.build());
    }

    @Override
    public MedicalStudy.Builder addStudySubject(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY_SUBJECT, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public MedicalStudy.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public MedicalStudy.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public MedicalStudy.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalStudy.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public MedicalStudy.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public MedicalStudy.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public MedicalStudy build() {
      return new MedicalStudyImpl(properties, reverseMap);
    }
  }

  public MedicalStudyImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_MEDICAL_STUDY;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOutcomeList() {
    return getProperty(CoreConstants.PROPERTY_OUTCOME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPopulationList() {
    return getProperty(CoreConstants.PROPERTY_POPULATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSponsorList() {
    return getProperty(CoreConstants.PROPERTY_SPONSOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getStatusList() {
    return getProperty(CoreConstants.PROPERTY_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getStudyLocationList() {
    return getProperty(CoreConstants.PROPERTY_STUDY_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getStudySubjectList() {
    return getProperty(CoreConstants.PROPERTY_STUDY_SUBJECT);
  }
}
