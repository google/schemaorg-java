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
 * href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>.
 */
public interface DietarySupplement extends MedicalTherapy {

  /**
   * Builder interface of <a
   * href="http://schema.org/DietarySupplement">http://schema.org/DietarySupplement</a>.
   */
  public interface Builder extends MedicalTherapy.Builder {

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

    /** Add a value to property activeIngredient. */
    Builder addActiveIngredient(Text value);

    /** Add a value to property activeIngredient. */
    Builder addActiveIngredient(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property adverseOutcome. */
    Builder addAdverseOutcome(MedicalEntity value);

    /** Add a value to property adverseOutcome. */
    Builder addAdverseOutcome(MedicalEntity.Builder value);

    /** Add a value to property adverseOutcome. */
    Builder addAdverseOutcome(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property background. */
    Builder addBackground(Text value);

    /** Add a value to property background. */
    Builder addBackground(String value);

    /** Add a value to property code. */
    Builder addCode(MedicalCode value);

    /** Add a value to property code. */
    Builder addCode(MedicalCode.Builder value);

    /** Add a value to property code. */
    Builder addCode(String value);

    /** Add a value to property contraindication. */
    Builder addContraindication(MedicalContraindication value);

    /** Add a value to property contraindication. */
    Builder addContraindication(MedicalContraindication.Builder value);

    /** Add a value to property contraindication. */
    Builder addContraindication(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property dosageForm. */
    Builder addDosageForm(Text value);

    /** Add a value to property dosageForm. */
    Builder addDosageForm(String value);

    /** Add a value to property duplicateTherapy. */
    Builder addDuplicateTherapy(MedicalTherapy value);

    /** Add a value to property duplicateTherapy. */
    Builder addDuplicateTherapy(MedicalTherapy.Builder value);

    /** Add a value to property duplicateTherapy. */
    Builder addDuplicateTherapy(String value);

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

    /** Add a value to property indication. */
    Builder addIndication(MedicalIndication value);

    /** Add a value to property indication. */
    Builder addIndication(MedicalIndication.Builder value);

    /** Add a value to property indication. */
    Builder addIndication(String value);

    /** Add a value to property isProprietary. */
    Builder addIsProprietary(Boolean value);

    /** Add a value to property isProprietary. */
    Builder addIsProprietary(String value);

    /** Add a value to property legalStatus. */
    Builder addLegalStatus(DrugLegalStatus value);

    /** Add a value to property legalStatus. */
    Builder addLegalStatus(DrugLegalStatus.Builder value);

    /** Add a value to property legalStatus. */
    Builder addLegalStatus(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property manufacturer. */
    Builder addManufacturer(Organization value);

    /** Add a value to property manufacturer. */
    Builder addManufacturer(Organization.Builder value);

    /** Add a value to property manufacturer. */
    Builder addManufacturer(String value);

    /** Add a value to property maximumIntake. */
    Builder addMaximumIntake(MaximumDoseSchedule value);

    /** Add a value to property maximumIntake. */
    Builder addMaximumIntake(MaximumDoseSchedule.Builder value);

    /** Add a value to property maximumIntake. */
    Builder addMaximumIntake(String value);

    /** Add a value to property mechanismOfAction. */
    Builder addMechanismOfAction(Text value);

    /** Add a value to property mechanismOfAction. */
    Builder addMechanismOfAction(String value);

    /** Add a value to property medicineSystem. */
    Builder addMedicineSystem(MedicineSystem value);

    /** Add a value to property medicineSystem. */
    Builder addMedicineSystem(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property nonProprietaryName. */
    Builder addNonProprietaryName(Text value);

    /** Add a value to property nonProprietaryName. */
    Builder addNonProprietaryName(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization.Builder value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(String value);

    /** Add a value to property recommendedIntake. */
    Builder addRecommendedIntake(RecommendedDoseSchedule value);

    /** Add a value to property recommendedIntake. */
    Builder addRecommendedIntake(RecommendedDoseSchedule.Builder value);

    /** Add a value to property recommendedIntake. */
    Builder addRecommendedIntake(String value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(MedicalSpecialty value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(String value);

    /** Add a value to property safetyConsideration. */
    Builder addSafetyConsideration(Text value);

    /** Add a value to property safetyConsideration. */
    Builder addSafetyConsideration(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property seriousAdverseOutcome. */
    Builder addSeriousAdverseOutcome(MedicalEntity value);

    /** Add a value to property seriousAdverseOutcome. */
    Builder addSeriousAdverseOutcome(MedicalEntity.Builder value);

    /** Add a value to property seriousAdverseOutcome. */
    Builder addSeriousAdverseOutcome(String value);

    /** Add a value to property study. */
    Builder addStudy(MedicalStudy value);

    /** Add a value to property study. */
    Builder addStudy(MedicalStudy.Builder value);

    /** Add a value to property study. */
    Builder addStudy(String value);

    /** Add a value to property targetPopulation. */
    Builder addTargetPopulation(Text value);

    /** Add a value to property targetPopulation. */
    Builder addTargetPopulation(String value);

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

    /** Build a {@link DietarySupplement} object. */
    DietarySupplement build();
  }

  /**
   * Returns the value list of property activeIngredient. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getActiveIngredientList();

  /**
   * Returns the value list of property background. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getBackgroundList();

  /**
   * Returns the value list of property dosageForm. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDosageFormList();

  /**
   * Returns the value list of property isProprietary. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getIsProprietaryList();

  /**
   * Returns the value list of property legalStatus. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getLegalStatusList();

  /**
   * Returns the value list of property manufacturer. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getManufacturerList();

  /**
   * Returns the value list of property maximumIntake. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getMaximumIntakeList();

  /**
   * Returns the value list of property mechanismOfAction. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getMechanismOfActionList();

  /**
   * Returns the value list of property nonProprietaryName. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getNonProprietaryNameList();

  /**
   * Returns the value list of property recommendedIntake. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getRecommendedIntakeList();

  /**
   * Returns the value list of property safetyConsideration. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getSafetyConsiderationList();

  /**
   * Returns the value list of property targetPopulation. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getTargetPopulationList();
}
