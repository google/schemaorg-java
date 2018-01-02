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

/** Interface of <a href="http://schema.org/Drug">http://schema.org/Drug</a>. */
public interface Drug extends MedicalTherapy {

  /** Builder interface of <a href="http://schema.org/Drug">http://schema.org/Drug</a>. */
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

    /** Add a value to property administrationRoute. */
    Builder addAdministrationRoute(Text value);

    /** Add a value to property administrationRoute. */
    Builder addAdministrationRoute(String value);

    /** Add a value to property adverseOutcome. */
    Builder addAdverseOutcome(MedicalEntity value);

    /** Add a value to property adverseOutcome. */
    Builder addAdverseOutcome(MedicalEntity.Builder value);

    /** Add a value to property adverseOutcome. */
    Builder addAdverseOutcome(String value);

    /** Add a value to property alcoholWarning. */
    Builder addAlcoholWarning(Text value);

    /** Add a value to property alcoholWarning. */
    Builder addAlcoholWarning(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property availableStrength. */
    Builder addAvailableStrength(DrugStrength value);

    /** Add a value to property availableStrength. */
    Builder addAvailableStrength(DrugStrength.Builder value);

    /** Add a value to property availableStrength. */
    Builder addAvailableStrength(String value);

    /** Add a value to property breastfeedingWarning. */
    Builder addBreastfeedingWarning(Text value);

    /** Add a value to property breastfeedingWarning. */
    Builder addBreastfeedingWarning(String value);

    /** Add a value to property clincalPharmacology. */
    Builder addClincalPharmacology(Text value);

    /** Add a value to property clincalPharmacology. */
    Builder addClincalPharmacology(String value);

    /** Add a value to property clinicalPharmacology. */
    Builder addClinicalPharmacology(Text value);

    /** Add a value to property clinicalPharmacology. */
    Builder addClinicalPharmacology(String value);

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

    /** Add a value to property cost. */
    Builder addCost(DrugCost value);

    /** Add a value to property cost. */
    Builder addCost(DrugCost.Builder value);

    /** Add a value to property cost. */
    Builder addCost(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property dosageForm. */
    Builder addDosageForm(Text value);

    /** Add a value to property dosageForm. */
    Builder addDosageForm(String value);

    /** Add a value to property doseSchedule. */
    Builder addDoseSchedule(DoseSchedule value);

    /** Add a value to property doseSchedule. */
    Builder addDoseSchedule(DoseSchedule.Builder value);

    /** Add a value to property doseSchedule. */
    Builder addDoseSchedule(String value);

    /** Add a value to property drugClass. */
    Builder addDrugClass(DrugClass value);

    /** Add a value to property drugClass. */
    Builder addDrugClass(DrugClass.Builder value);

    /** Add a value to property drugClass. */
    Builder addDrugClass(String value);

    /** Add a value to property duplicateTherapy. */
    Builder addDuplicateTherapy(MedicalTherapy value);

    /** Add a value to property duplicateTherapy. */
    Builder addDuplicateTherapy(MedicalTherapy.Builder value);

    /** Add a value to property duplicateTherapy. */
    Builder addDuplicateTherapy(String value);

    /** Add a value to property foodWarning. */
    Builder addFoodWarning(Text value);

    /** Add a value to property foodWarning. */
    Builder addFoodWarning(String value);

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

    /** Add a value to property interactingDrug. */
    Builder addInteractingDrug(Drug value);

    /** Add a value to property interactingDrug. */
    Builder addInteractingDrug(Drug.Builder value);

    /** Add a value to property interactingDrug. */
    Builder addInteractingDrug(String value);

    /** Add a value to property isAvailableGenerically. */
    Builder addIsAvailableGenerically(Boolean value);

    /** Add a value to property isAvailableGenerically. */
    Builder addIsAvailableGenerically(String value);

    /** Add a value to property isProprietary. */
    Builder addIsProprietary(Boolean value);

    /** Add a value to property isProprietary. */
    Builder addIsProprietary(String value);

    /** Add a value to property labelDetails. */
    Builder addLabelDetails(URL value);

    /** Add a value to property labelDetails. */
    Builder addLabelDetails(String value);

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

    /** Add a value to property overdosage. */
    Builder addOverdosage(Text value);

    /** Add a value to property overdosage. */
    Builder addOverdosage(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property pregnancyCategory. */
    Builder addPregnancyCategory(DrugPregnancyCategory value);

    /** Add a value to property pregnancyCategory. */
    Builder addPregnancyCategory(String value);

    /** Add a value to property pregnancyWarning. */
    Builder addPregnancyWarning(Text value);

    /** Add a value to property pregnancyWarning. */
    Builder addPregnancyWarning(String value);

    /** Add a value to property prescribingInfo. */
    Builder addPrescribingInfo(URL value);

    /** Add a value to property prescribingInfo. */
    Builder addPrescribingInfo(String value);

    /** Add a value to property prescriptionStatus. */
    Builder addPrescriptionStatus(DrugPrescriptionStatus value);

    /** Add a value to property prescriptionStatus. */
    Builder addPrescriptionStatus(String value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(Organization.Builder value);

    /** Add a value to property recognizingAuthority. */
    Builder addRecognizingAuthority(String value);

    /** Add a value to property relatedDrug. */
    Builder addRelatedDrug(Drug value);

    /** Add a value to property relatedDrug. */
    Builder addRelatedDrug(Drug.Builder value);

    /** Add a value to property relatedDrug. */
    Builder addRelatedDrug(String value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(MedicalSpecialty value);

    /** Add a value to property relevantSpecialty. */
    Builder addRelevantSpecialty(String value);

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

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property warning. */
    Builder addWarning(Text value);

    /** Add a value to property warning. */
    Builder addWarning(URL value);

    /** Add a value to property warning. */
    Builder addWarning(String value);

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

    /** Build a {@link Drug} object. */
    Drug build();
  }

  /**
   * Returns the value list of property activeIngredient. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getActiveIngredientList();

  /**
   * Returns the value list of property administrationRoute. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getAdministrationRouteList();

  /**
   * Returns the value list of property alcoholWarning. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getAlcoholWarningList();

  /**
   * Returns the value list of property availableStrength. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getAvailableStrengthList();

  /**
   * Returns the value list of property breastfeedingWarning. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getBreastfeedingWarningList();

  /**
   * Returns the value list of property clincalPharmacology. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getClincalPharmacologyList();

  /**
   * Returns the value list of property clinicalPharmacology. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getClinicalPharmacologyList();

  /**
   * Returns the value list of property cost. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getCostList();

  /**
   * Returns the value list of property dosageForm. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDosageFormList();

  /**
   * Returns the value list of property doseSchedule. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDoseScheduleList();

  /**
   * Returns the value list of property drugClass. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getDrugClassList();

  /**
   * Returns the value list of property foodWarning. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getFoodWarningList();

  /**
   * Returns the value list of property interactingDrug. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getInteractingDrugList();

  /**
   * Returns the value list of property isAvailableGenerically. Empty list is returned if the
   * property not set in current object.
   */
  ImmutableList<SchemaOrgType> getIsAvailableGenericallyList();

  /**
   * Returns the value list of property isProprietary. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getIsProprietaryList();

  /**
   * Returns the value list of property labelDetails. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getLabelDetailsList();

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
   * Returns the value list of property overdosage. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getOverdosageList();

  /**
   * Returns the value list of property pregnancyCategory. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getPregnancyCategoryList();

  /**
   * Returns the value list of property pregnancyWarning. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPregnancyWarningList();

  /**
   * Returns the value list of property prescribingInfo. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getPrescribingInfoList();

  /**
   * Returns the value list of property prescriptionStatus. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getPrescriptionStatusList();

  /**
   * Returns the value list of property relatedDrug. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getRelatedDrugList();

  /**
   * Returns the value list of property warning. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getWarningList();
}
