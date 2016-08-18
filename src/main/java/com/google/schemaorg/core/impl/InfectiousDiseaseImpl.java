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

/** Implementation of {@link InfectiousDisease}. */
public class InfectiousDiseaseImpl extends MedicalConditionImpl implements InfectiousDisease {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY);

    builder.add(CoreConstants.PROPERTY_CAUSE);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DIFFERENTIAL_DIAGNOSIS);

    builder.add(CoreConstants.PROPERTY_EPIDEMIOLOGY);

    builder.add(CoreConstants.PROPERTY_EXPECTED_PROGNOSIS);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INFECTIOUS_AGENT);

    builder.add(CoreConstants.PROPERTY_INFECTIOUS_AGENT_CLASS);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NATURAL_PROGRESSION);

    builder.add(CoreConstants.PROPERTY_PATHOPHYSIOLOGY);

    builder.add(CoreConstants.PROPERTY_POSSIBLE_COMPLICATION);

    builder.add(CoreConstants.PROPERTY_POSSIBLE_TREATMENT);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRIMARY_PREVENTION);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_RISK_FACTOR);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SECONDARY_PREVENTION);

    builder.add(CoreConstants.PROPERTY_SIGN_OR_SYMPTOM);

    builder.add(CoreConstants.PROPERTY_STAGE);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_SUBTYPE);

    builder.add(CoreConstants.PROPERTY_TRANSMISSION_METHOD);

    builder.add(CoreConstants.PROPERTY_TYPICAL_TEST);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<InfectiousDisease.Builder>
      implements InfectiousDisease.Builder {

    @Override
    public InfectiousDisease.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public InfectiousDisease.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public InfectiousDisease.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addAssociatedAnatomy(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY, value);
    }

    @Override
    public InfectiousDisease.Builder addAssociatedAnatomy(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY, value.build());
    }

    @Override
    public InfectiousDisease.Builder addAssociatedAnatomy(AnatomicalSystem value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY, value);
    }

    @Override
    public InfectiousDisease.Builder addAssociatedAnatomy(AnatomicalSystem.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY, value.build());
    }

    @Override
    public InfectiousDisease.Builder addAssociatedAnatomy(SuperficialAnatomy value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY, value);
    }

    @Override
    public InfectiousDisease.Builder addAssociatedAnatomy(SuperficialAnatomy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY, value.build());
    }

    @Override
    public InfectiousDisease.Builder addAssociatedAnatomy(String value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_ANATOMY, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addCause(MedicalCause value) {
      return addProperty(CoreConstants.PROPERTY_CAUSE, value);
    }

    @Override
    public InfectiousDisease.Builder addCause(MedicalCause.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CAUSE, value.build());
    }

    @Override
    public InfectiousDisease.Builder addCause(String value) {
      return addProperty(CoreConstants.PROPERTY_CAUSE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public InfectiousDisease.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public InfectiousDisease.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public InfectiousDisease.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addDifferentialDiagnosis(DDxElement value) {
      return addProperty(CoreConstants.PROPERTY_DIFFERENTIAL_DIAGNOSIS, value);
    }

    @Override
    public InfectiousDisease.Builder addDifferentialDiagnosis(DDxElement.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DIFFERENTIAL_DIAGNOSIS, value.build());
    }

    @Override
    public InfectiousDisease.Builder addDifferentialDiagnosis(String value) {
      return addProperty(CoreConstants.PROPERTY_DIFFERENTIAL_DIAGNOSIS, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addEpidemiology(Text value) {
      return addProperty(CoreConstants.PROPERTY_EPIDEMIOLOGY, value);
    }

    @Override
    public InfectiousDisease.Builder addEpidemiology(String value) {
      return addProperty(CoreConstants.PROPERTY_EPIDEMIOLOGY, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addExpectedPrognosis(Text value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTED_PROGNOSIS, value);
    }

    @Override
    public InfectiousDisease.Builder addExpectedPrognosis(String value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTED_PROGNOSIS, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public InfectiousDisease.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public InfectiousDisease.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public InfectiousDisease.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public InfectiousDisease.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public InfectiousDisease.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addInfectiousAgent(Text value) {
      return addProperty(CoreConstants.PROPERTY_INFECTIOUS_AGENT, value);
    }

    @Override
    public InfectiousDisease.Builder addInfectiousAgent(String value) {
      return addProperty(CoreConstants.PROPERTY_INFECTIOUS_AGENT, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addInfectiousAgentClass(InfectiousAgentClass value) {
      return addProperty(CoreConstants.PROPERTY_INFECTIOUS_AGENT_CLASS, value);
    }

    @Override
    public InfectiousDisease.Builder addInfectiousAgentClass(String value) {
      return addProperty(CoreConstants.PROPERTY_INFECTIOUS_AGENT_CLASS, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public InfectiousDisease.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public InfectiousDisease.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public InfectiousDisease.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public InfectiousDisease.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public InfectiousDisease.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addNaturalProgression(Text value) {
      return addProperty(CoreConstants.PROPERTY_NATURAL_PROGRESSION, value);
    }

    @Override
    public InfectiousDisease.Builder addNaturalProgression(String value) {
      return addProperty(CoreConstants.PROPERTY_NATURAL_PROGRESSION, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addPathophysiology(Text value) {
      return addProperty(CoreConstants.PROPERTY_PATHOPHYSIOLOGY, value);
    }

    @Override
    public InfectiousDisease.Builder addPathophysiology(String value) {
      return addProperty(CoreConstants.PROPERTY_PATHOPHYSIOLOGY, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addPossibleComplication(Text value) {
      return addProperty(CoreConstants.PROPERTY_POSSIBLE_COMPLICATION, value);
    }

    @Override
    public InfectiousDisease.Builder addPossibleComplication(String value) {
      return addProperty(CoreConstants.PROPERTY_POSSIBLE_COMPLICATION, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addPossibleTreatment(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_POSSIBLE_TREATMENT, value);
    }

    @Override
    public InfectiousDisease.Builder addPossibleTreatment(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POSSIBLE_TREATMENT, value.build());
    }

    @Override
    public InfectiousDisease.Builder addPossibleTreatment(String value) {
      return addProperty(CoreConstants.PROPERTY_POSSIBLE_TREATMENT, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public InfectiousDisease.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public InfectiousDisease.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addPrimaryPrevention(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_PRIMARY_PREVENTION, value);
    }

    @Override
    public InfectiousDisease.Builder addPrimaryPrevention(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRIMARY_PREVENTION, value.build());
    }

    @Override
    public InfectiousDisease.Builder addPrimaryPrevention(String value) {
      return addProperty(CoreConstants.PROPERTY_PRIMARY_PREVENTION, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public InfectiousDisease.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public InfectiousDisease.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public InfectiousDisease.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addRiskFactor(MedicalRiskFactor value) {
      return addProperty(CoreConstants.PROPERTY_RISK_FACTOR, value);
    }

    @Override
    public InfectiousDisease.Builder addRiskFactor(MedicalRiskFactor.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RISK_FACTOR, value.build());
    }

    @Override
    public InfectiousDisease.Builder addRiskFactor(String value) {
      return addProperty(CoreConstants.PROPERTY_RISK_FACTOR, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public InfectiousDisease.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addSecondaryPrevention(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_SECONDARY_PREVENTION, value);
    }

    @Override
    public InfectiousDisease.Builder addSecondaryPrevention(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SECONDARY_PREVENTION, value.build());
    }

    @Override
    public InfectiousDisease.Builder addSecondaryPrevention(String value) {
      return addProperty(CoreConstants.PROPERTY_SECONDARY_PREVENTION, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addSignOrSymptom(MedicalSignOrSymptom value) {
      return addProperty(CoreConstants.PROPERTY_SIGN_OR_SYMPTOM, value);
    }

    @Override
    public InfectiousDisease.Builder addSignOrSymptom(MedicalSignOrSymptom.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SIGN_OR_SYMPTOM, value.build());
    }

    @Override
    public InfectiousDisease.Builder addSignOrSymptom(String value) {
      return addProperty(CoreConstants.PROPERTY_SIGN_OR_SYMPTOM, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addStage(MedicalConditionStage value) {
      return addProperty(CoreConstants.PROPERTY_STAGE, value);
    }

    @Override
    public InfectiousDisease.Builder addStage(MedicalConditionStage.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STAGE, value.build());
    }

    @Override
    public InfectiousDisease.Builder addStage(String value) {
      return addProperty(CoreConstants.PROPERTY_STAGE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public InfectiousDisease.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public InfectiousDisease.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addSubtype(Text value) {
      return addProperty(CoreConstants.PROPERTY_SUBTYPE, value);
    }

    @Override
    public InfectiousDisease.Builder addSubtype(String value) {
      return addProperty(CoreConstants.PROPERTY_SUBTYPE, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addTransmissionMethod(Text value) {
      return addProperty(CoreConstants.PROPERTY_TRANSMISSION_METHOD, value);
    }

    @Override
    public InfectiousDisease.Builder addTransmissionMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_TRANSMISSION_METHOD, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addTypicalTest(MedicalTest value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_TEST, value);
    }

    @Override
    public InfectiousDisease.Builder addTypicalTest(MedicalTest.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_TEST, value.build());
    }

    @Override
    public InfectiousDisease.Builder addTypicalTest(String value) {
      return addProperty(CoreConstants.PROPERTY_TYPICAL_TEST, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public InfectiousDisease.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public InfectiousDisease.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public InfectiousDisease.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public InfectiousDisease.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public InfectiousDisease.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public InfectiousDisease.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public InfectiousDisease build() {
      return new InfectiousDiseaseImpl(properties, reverseMap);
    }
  }

  public InfectiousDiseaseImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_INFECTIOUS_DISEASE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInfectiousAgentList() {
    return getProperty(CoreConstants.PROPERTY_INFECTIOUS_AGENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInfectiousAgentClassList() {
    return getProperty(CoreConstants.PROPERTY_INFECTIOUS_AGENT_CLASS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTransmissionMethodList() {
    return getProperty(CoreConstants.PROPERTY_TRANSMISSION_METHOD);
  }
}
