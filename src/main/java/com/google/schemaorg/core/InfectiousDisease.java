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
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a
 * href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>.
 */
public interface InfectiousDisease extends MedicalCondition {

  /**
   * Builder interface of <a
   * href="http://schema.org/InfectiousDisease">http://schema.org/InfectiousDisease</a>.
   */
  public interface Builder extends MedicalCondition.Builder {

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

    /** Add a value to property associatedAnatomy. */
    Builder addAssociatedAnatomy(AnatomicalStructure value);

    /** Add a value to property associatedAnatomy. */
    Builder addAssociatedAnatomy(AnatomicalStructure.Builder value);

    /** Add a value to property associatedAnatomy. */
    Builder addAssociatedAnatomy(AnatomicalSystem value);

    /** Add a value to property associatedAnatomy. */
    Builder addAssociatedAnatomy(AnatomicalSystem.Builder value);

    /** Add a value to property associatedAnatomy. */
    Builder addAssociatedAnatomy(SuperficialAnatomy value);

    /** Add a value to property associatedAnatomy. */
    Builder addAssociatedAnatomy(SuperficialAnatomy.Builder value);

    /** Add a value to property associatedAnatomy. */
    Builder addAssociatedAnatomy(String value);

    /** Add a value to property cause. */
    Builder addCause(MedicalCause value);

    /** Add a value to property cause. */
    Builder addCause(MedicalCause.Builder value);

    /** Add a value to property cause. */
    Builder addCause(String value);

    /** Add a value to property code. */
    Builder addCode(MedicalCode value);

    /** Add a value to property code. */
    Builder addCode(MedicalCode.Builder value);

    /** Add a value to property code. */
    Builder addCode(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property differentialDiagnosis. */
    Builder addDifferentialDiagnosis(DDxElement value);

    /** Add a value to property differentialDiagnosis. */
    Builder addDifferentialDiagnosis(DDxElement.Builder value);

    /** Add a value to property differentialDiagnosis. */
    Builder addDifferentialDiagnosis(String value);

    /** Add a value to property epidemiology. */
    Builder addEpidemiology(Text value);

    /** Add a value to property epidemiology. */
    Builder addEpidemiology(String value);

    /** Add a value to property expectedPrognosis. */
    Builder addExpectedPrognosis(Text value);

    /** Add a value to property expectedPrognosis. */
    Builder addExpectedPrognosis(String value);

    /** Add a value to property guideline. */
    Builder addGuideline(MedicalGuideline value);

    /** Add a value to property guideline. */
    Builder addGuideline(MedicalGuideline.Builder value);

    /** Add a value to property guideline. */
    Builder addGuideline(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property infectiousAgent. */
    Builder addInfectiousAgent(Text value);

    /** Add a value to property infectiousAgent. */
    Builder addInfectiousAgent(String value);

    /** Add a value to property infectiousAgentClass. */
    Builder addInfectiousAgentClass(InfectiousAgentClass value);

    /** Add a value to property infectiousAgentClass. */
    Builder addInfectiousAgentClass(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property medicineSystem. */
    Builder addMedicineSystem(MedicineSystem value);

    /** Add a value to property medicineSystem. */
    Builder addMedicineSystem(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property naturalProgression. */
    Builder addNaturalProgression(Text value);

    /** Add a value to property naturalProgression. */
    Builder addNaturalProgression(String value);

    /** Add a value to property pathophysiology. */
    Builder addPathophysiology(Text value);

    /** Add a value to property pathophysiology. */
    Builder addPathophysiology(String value);

    /** Add a value to property possibleComplication. */
    Builder addPossibleComplication(Text value);

    /** Add a value to property possibleComplication. */
    Builder addPossibleComplication(String value);

    /** Add a value to property possibleTreatment. */
    Builder addPossibleTreatment(MedicalTherapy value);

    /** Add a value to property possibleTreatment. */
    Builder addPossibleTreatment(MedicalTherapy.Builder value);

    /** Add a value to property possibleTreatment. */
    Builder addPossibleTreatment(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property primaryPrevention. */
    Builder addPrimaryPrevention(MedicalTherapy value);

    /** Add a value to property primaryPrevention. */
    Builder addPrimaryPrevention(MedicalTherapy.Builder value);

    /** Add a value to property primaryPrevention. */
    Builder addPrimaryPrevention(String value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization.Builder value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(String value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(MedicalSpecialty value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(String value);

    /** Add a value to property riskFactor. */
    Builder addRiskFactor(MedicalRiskFactor value);

    /** Add a value to property riskFactor. */
    Builder addRiskFactor(MedicalRiskFactor.Builder value);

    /** Add a value to property riskFactor. */
    Builder addRiskFactor(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property secondaryPrevention. */
    Builder addSecondaryPrevention(MedicalTherapy value);

    /** Add a value to property secondaryPrevention. */
    Builder addSecondaryPrevention(MedicalTherapy.Builder value);

    /** Add a value to property secondaryPrevention. */
    Builder addSecondaryPrevention(String value);

    /** Add a value to property signOrSymptom. */
    Builder addSignOrSymptom(MedicalSignOrSymptom value);

    /** Add a value to property signOrSymptom. */
    Builder addSignOrSymptom(MedicalSignOrSymptom.Builder value);

    /** Add a value to property signOrSymptom. */
    Builder addSignOrSymptom(String value);

    /** Add a value to property stage. */
    Builder addStage(MedicalConditionStage value);

    /** Add a value to property stage. */
    Builder addStage(MedicalConditionStage.Builder value);

    /** Add a value to property stage. */
    Builder addStage(String value);

    /** Add a value to property study. */
    Builder addStudy(MedicalStudy value);

    /** Add a value to property study. */
    Builder addStudy(MedicalStudy.Builder value);

    /** Add a value to property study. */
    Builder addStudy(String value);

    /** Add a value to property subtype. */
    Builder addSubtype(Text value);

    /** Add a value to property subtype. */
    Builder addSubtype(String value);

    /** Add a value to property transmissionMethod. */
    Builder addTransmissionMethod(Text value);

    /** Add a value to property transmissionMethod. */
    Builder addTransmissionMethod(String value);

    /** Add a value to property typicalTest. */
    Builder addTypicalTest(MedicalTest value);

    /** Add a value to property typicalTest. */
    Builder addTypicalTest(MedicalTest.Builder value);

    /** Add a value to property typicalTest. */
    Builder addTypicalTest(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

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

    /** Build a {@link InfectiousDisease} object. */
    InfectiousDisease build();
  }

  /**
   * Returns the value list of property infectiousAgent. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getInfectiousAgentList();

  /**
   * Returns the value list of property infectiousAgentClass. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getInfectiousAgentClassList();

  /**
   * Returns the value list of property transmissionMethod. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getTransmissionMethodList();
}
