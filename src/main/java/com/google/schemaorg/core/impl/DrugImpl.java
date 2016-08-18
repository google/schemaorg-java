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

/** Implementation of {@link Drug}. */
public class DrugImpl extends MedicalTherapyImpl implements Drug {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACTIVE_INGREDIENT);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADMINISTRATION_ROUTE);

    builder.add(CoreConstants.PROPERTY_ADVERSE_OUTCOME);

    builder.add(CoreConstants.PROPERTY_ALCOHOL_WARNING);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_STRENGTH);

    builder.add(CoreConstants.PROPERTY_BREASTFEEDING_WARNING);

    builder.add(CoreConstants.PROPERTY_CLINCAL_PHARMACOLOGY);

    builder.add(CoreConstants.PROPERTY_CLINICAL_PHARMACOLOGY);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_CONTRAINDICATION);

    builder.add(CoreConstants.PROPERTY_COST);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DOSAGE_FORM);

    builder.add(CoreConstants.PROPERTY_DOSE_SCHEDULE);

    builder.add(CoreConstants.PROPERTY_DRUG_CLASS);

    builder.add(CoreConstants.PROPERTY_DUPLICATE_THERAPY);

    builder.add(CoreConstants.PROPERTY_FOOD_WARNING);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INDICATION);

    builder.add(CoreConstants.PROPERTY_INTERACTING_DRUG);

    builder.add(CoreConstants.PROPERTY_IS_AVAILABLE_GENERICALLY);

    builder.add(CoreConstants.PROPERTY_IS_PROPRIETARY);

    builder.add(CoreConstants.PROPERTY_LABEL_DETAILS);

    builder.add(CoreConstants.PROPERTY_LEGAL_STATUS);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MANUFACTURER);

    builder.add(CoreConstants.PROPERTY_MECHANISM_OF_ACTION);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NON_PROPRIETARY_NAME);

    builder.add(CoreConstants.PROPERTY_OVERDOSAGE);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PREGNANCY_CATEGORY);

    builder.add(CoreConstants.PROPERTY_PREGNANCY_WARNING);

    builder.add(CoreConstants.PROPERTY_PRESCRIBING_INFO);

    builder.add(CoreConstants.PROPERTY_PRESCRIPTION_STATUS);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELATED_DRUG);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_WARNING);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Drug.Builder>
      implements Drug.Builder {

    @Override
    public Drug.Builder addActiveIngredient(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACTIVE_INGREDIENT, value);
    }

    @Override
    public Drug.Builder addActiveIngredient(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTIVE_INGREDIENT, Text.of(value));
    }

    @Override
    public Drug.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Drug.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Drug.Builder addAdministrationRoute(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADMINISTRATION_ROUTE, value);
    }

    @Override
    public Drug.Builder addAdministrationRoute(String value) {
      return addProperty(CoreConstants.PROPERTY_ADMINISTRATION_ROUTE, Text.of(value));
    }

    @Override
    public Drug.Builder addAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value);
    }

    @Override
    public Drug.Builder addAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public Drug.Builder addAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public Drug.Builder addAlcoholWarning(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALCOHOL_WARNING, value);
    }

    @Override
    public Drug.Builder addAlcoholWarning(String value) {
      return addProperty(CoreConstants.PROPERTY_ALCOHOL_WARNING, Text.of(value));
    }

    @Override
    public Drug.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Drug.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Drug.Builder addAvailableStrength(DrugStrength value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_STRENGTH, value);
    }

    @Override
    public Drug.Builder addAvailableStrength(DrugStrength.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_STRENGTH, value.build());
    }

    @Override
    public Drug.Builder addAvailableStrength(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_STRENGTH, Text.of(value));
    }

    @Override
    public Drug.Builder addBreastfeedingWarning(Text value) {
      return addProperty(CoreConstants.PROPERTY_BREASTFEEDING_WARNING, value);
    }

    @Override
    public Drug.Builder addBreastfeedingWarning(String value) {
      return addProperty(CoreConstants.PROPERTY_BREASTFEEDING_WARNING, Text.of(value));
    }

    @Override
    public Drug.Builder addClincalPharmacology(Text value) {
      return addProperty(CoreConstants.PROPERTY_CLINCAL_PHARMACOLOGY, value);
    }

    @Override
    public Drug.Builder addClincalPharmacology(String value) {
      return addProperty(CoreConstants.PROPERTY_CLINCAL_PHARMACOLOGY, Text.of(value));
    }

    @Override
    public Drug.Builder addClinicalPharmacology(Text value) {
      return addProperty(CoreConstants.PROPERTY_CLINICAL_PHARMACOLOGY, value);
    }

    @Override
    public Drug.Builder addClinicalPharmacology(String value) {
      return addProperty(CoreConstants.PROPERTY_CLINICAL_PHARMACOLOGY, Text.of(value));
    }

    @Override
    public Drug.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public Drug.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public Drug.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public Drug.Builder addContraindication(MedicalContraindication value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value);
    }

    @Override
    public Drug.Builder addContraindication(MedicalContraindication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value.build());
    }

    @Override
    public Drug.Builder addContraindication(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, Text.of(value));
    }

    @Override
    public Drug.Builder addCost(DrugCost value) {
      return addProperty(CoreConstants.PROPERTY_COST, value);
    }

    @Override
    public Drug.Builder addCost(DrugCost.Builder value) {
      return addProperty(CoreConstants.PROPERTY_COST, value.build());
    }

    @Override
    public Drug.Builder addCost(String value) {
      return addProperty(CoreConstants.PROPERTY_COST, Text.of(value));
    }

    @Override
    public Drug.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Drug.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Drug.Builder addDosageForm(Text value) {
      return addProperty(CoreConstants.PROPERTY_DOSAGE_FORM, value);
    }

    @Override
    public Drug.Builder addDosageForm(String value) {
      return addProperty(CoreConstants.PROPERTY_DOSAGE_FORM, Text.of(value));
    }

    @Override
    public Drug.Builder addDoseSchedule(DoseSchedule value) {
      return addProperty(CoreConstants.PROPERTY_DOSE_SCHEDULE, value);
    }

    @Override
    public Drug.Builder addDoseSchedule(DoseSchedule.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DOSE_SCHEDULE, value.build());
    }

    @Override
    public Drug.Builder addDoseSchedule(String value) {
      return addProperty(CoreConstants.PROPERTY_DOSE_SCHEDULE, Text.of(value));
    }

    @Override
    public Drug.Builder addDrugClass(DrugClass value) {
      return addProperty(CoreConstants.PROPERTY_DRUG_CLASS, value);
    }

    @Override
    public Drug.Builder addDrugClass(DrugClass.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DRUG_CLASS, value.build());
    }

    @Override
    public Drug.Builder addDrugClass(String value) {
      return addProperty(CoreConstants.PROPERTY_DRUG_CLASS, Text.of(value));
    }

    @Override
    public Drug.Builder addDuplicateTherapy(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, value);
    }

    @Override
    public Drug.Builder addDuplicateTherapy(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, value.build());
    }

    @Override
    public Drug.Builder addDuplicateTherapy(String value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, Text.of(value));
    }

    @Override
    public Drug.Builder addFoodWarning(Text value) {
      return addProperty(CoreConstants.PROPERTY_FOOD_WARNING, value);
    }

    @Override
    public Drug.Builder addFoodWarning(String value) {
      return addProperty(CoreConstants.PROPERTY_FOOD_WARNING, Text.of(value));
    }

    @Override
    public Drug.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public Drug.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public Drug.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public Drug.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Drug.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Drug.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Drug.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Drug.Builder addIndication(MedicalIndication value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value);
    }

    @Override
    public Drug.Builder addIndication(MedicalIndication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value.build());
    }

    @Override
    public Drug.Builder addIndication(String value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, Text.of(value));
    }

    @Override
    public Drug.Builder addInteractingDrug(Drug value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTING_DRUG, value);
    }

    @Override
    public Drug.Builder addInteractingDrug(Drug.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTING_DRUG, value.build());
    }

    @Override
    public Drug.Builder addInteractingDrug(String value) {
      return addProperty(CoreConstants.PROPERTY_INTERACTING_DRUG, Text.of(value));
    }

    @Override
    public Drug.Builder addIsAvailableGenerically(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_AVAILABLE_GENERICALLY, value);
    }

    @Override
    public Drug.Builder addIsAvailableGenerically(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_AVAILABLE_GENERICALLY, Text.of(value));
    }

    @Override
    public Drug.Builder addIsProprietary(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_PROPRIETARY, value);
    }

    @Override
    public Drug.Builder addIsProprietary(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_PROPRIETARY, Text.of(value));
    }

    @Override
    public Drug.Builder addLabelDetails(URL value) {
      return addProperty(CoreConstants.PROPERTY_LABEL_DETAILS, value);
    }

    @Override
    public Drug.Builder addLabelDetails(String value) {
      return addProperty(CoreConstants.PROPERTY_LABEL_DETAILS, Text.of(value));
    }

    @Override
    public Drug.Builder addLegalStatus(DrugLegalStatus value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_STATUS, value);
    }

    @Override
    public Drug.Builder addLegalStatus(DrugLegalStatus.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_STATUS, value.build());
    }

    @Override
    public Drug.Builder addLegalStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_STATUS, Text.of(value));
    }

    @Override
    public Drug.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Drug.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Drug.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Drug.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Drug.Builder addManufacturer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value);
    }

    @Override
    public Drug.Builder addManufacturer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value.build());
    }

    @Override
    public Drug.Builder addManufacturer(String value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, Text.of(value));
    }

    @Override
    public Drug.Builder addMechanismOfAction(Text value) {
      return addProperty(CoreConstants.PROPERTY_MECHANISM_OF_ACTION, value);
    }

    @Override
    public Drug.Builder addMechanismOfAction(String value) {
      return addProperty(CoreConstants.PROPERTY_MECHANISM_OF_ACTION, Text.of(value));
    }

    @Override
    public Drug.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public Drug.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public Drug.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Drug.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Drug.Builder addNonProprietaryName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NON_PROPRIETARY_NAME, value);
    }

    @Override
    public Drug.Builder addNonProprietaryName(String value) {
      return addProperty(CoreConstants.PROPERTY_NON_PROPRIETARY_NAME, Text.of(value));
    }

    @Override
    public Drug.Builder addOverdosage(Text value) {
      return addProperty(CoreConstants.PROPERTY_OVERDOSAGE, value);
    }

    @Override
    public Drug.Builder addOverdosage(String value) {
      return addProperty(CoreConstants.PROPERTY_OVERDOSAGE, Text.of(value));
    }

    @Override
    public Drug.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Drug.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Drug.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Drug.Builder addPregnancyCategory(DrugPregnancyCategory value) {
      return addProperty(CoreConstants.PROPERTY_PREGNANCY_CATEGORY, value);
    }

    @Override
    public Drug.Builder addPregnancyCategory(String value) {
      return addProperty(CoreConstants.PROPERTY_PREGNANCY_CATEGORY, Text.of(value));
    }

    @Override
    public Drug.Builder addPregnancyWarning(Text value) {
      return addProperty(CoreConstants.PROPERTY_PREGNANCY_WARNING, value);
    }

    @Override
    public Drug.Builder addPregnancyWarning(String value) {
      return addProperty(CoreConstants.PROPERTY_PREGNANCY_WARNING, Text.of(value));
    }

    @Override
    public Drug.Builder addPrescribingInfo(URL value) {
      return addProperty(CoreConstants.PROPERTY_PRESCRIBING_INFO, value);
    }

    @Override
    public Drug.Builder addPrescribingInfo(String value) {
      return addProperty(CoreConstants.PROPERTY_PRESCRIBING_INFO, Text.of(value));
    }

    @Override
    public Drug.Builder addPrescriptionStatus(DrugPrescriptionStatus value) {
      return addProperty(CoreConstants.PROPERTY_PRESCRIPTION_STATUS, value);
    }

    @Override
    public Drug.Builder addPrescriptionStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_PRESCRIPTION_STATUS, Text.of(value));
    }

    @Override
    public Drug.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public Drug.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public Drug.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public Drug.Builder addRelatedDrug(Drug value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_DRUG, value);
    }

    @Override
    public Drug.Builder addRelatedDrug(Drug.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_DRUG, value.build());
    }

    @Override
    public Drug.Builder addRelatedDrug(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_DRUG, Text.of(value));
    }

    @Override
    public Drug.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public Drug.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public Drug.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Drug.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Drug.Builder addSeriousAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value);
    }

    @Override
    public Drug.Builder addSeriousAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public Drug.Builder addSeriousAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public Drug.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public Drug.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public Drug.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public Drug.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Drug.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Drug.Builder addWarning(Text value) {
      return addProperty(CoreConstants.PROPERTY_WARNING, value);
    }

    @Override
    public Drug.Builder addWarning(URL value) {
      return addProperty(CoreConstants.PROPERTY_WARNING, value);
    }

    @Override
    public Drug.Builder addWarning(String value) {
      return addProperty(CoreConstants.PROPERTY_WARNING, Text.of(value));
    }

    @Override
    public Drug.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Drug.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Drug.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Drug.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Drug.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Drug.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Drug build() {
      return new DrugImpl(properties, reverseMap);
    }
  }

  public DrugImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_DRUG;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getActiveIngredientList() {
    return getProperty(CoreConstants.PROPERTY_ACTIVE_INGREDIENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAdministrationRouteList() {
    return getProperty(CoreConstants.PROPERTY_ADMINISTRATION_ROUTE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAlcoholWarningList() {
    return getProperty(CoreConstants.PROPERTY_ALCOHOL_WARNING);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailableStrengthList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABLE_STRENGTH);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBreastfeedingWarningList() {
    return getProperty(CoreConstants.PROPERTY_BREASTFEEDING_WARNING);
  }

  @Override
  public ImmutableList<SchemaOrgType> getClincalPharmacologyList() {
    return getProperty(CoreConstants.PROPERTY_CLINCAL_PHARMACOLOGY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getClinicalPharmacologyList() {
    return getProperty(CoreConstants.PROPERTY_CLINICAL_PHARMACOLOGY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCostList() {
    return getProperty(CoreConstants.PROPERTY_COST);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDosageFormList() {
    return getProperty(CoreConstants.PROPERTY_DOSAGE_FORM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDoseScheduleList() {
    return getProperty(CoreConstants.PROPERTY_DOSE_SCHEDULE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDrugClassList() {
    return getProperty(CoreConstants.PROPERTY_DRUG_CLASS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFoodWarningList() {
    return getProperty(CoreConstants.PROPERTY_FOOD_WARNING);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInteractingDrugList() {
    return getProperty(CoreConstants.PROPERTY_INTERACTING_DRUG);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsAvailableGenericallyList() {
    return getProperty(CoreConstants.PROPERTY_IS_AVAILABLE_GENERICALLY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsProprietaryList() {
    return getProperty(CoreConstants.PROPERTY_IS_PROPRIETARY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLabelDetailsList() {
    return getProperty(CoreConstants.PROPERTY_LABEL_DETAILS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLegalStatusList() {
    return getProperty(CoreConstants.PROPERTY_LEGAL_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getManufacturerList() {
    return getProperty(CoreConstants.PROPERTY_MANUFACTURER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getMechanismOfActionList() {
    return getProperty(CoreConstants.PROPERTY_MECHANISM_OF_ACTION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNonProprietaryNameList() {
    return getProperty(CoreConstants.PROPERTY_NON_PROPRIETARY_NAME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getOverdosageList() {
    return getProperty(CoreConstants.PROPERTY_OVERDOSAGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPregnancyCategoryList() {
    return getProperty(CoreConstants.PROPERTY_PREGNANCY_CATEGORY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPregnancyWarningList() {
    return getProperty(CoreConstants.PROPERTY_PREGNANCY_WARNING);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPrescribingInfoList() {
    return getProperty(CoreConstants.PROPERTY_PRESCRIBING_INFO);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPrescriptionStatusList() {
    return getProperty(CoreConstants.PROPERTY_PRESCRIPTION_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRelatedDrugList() {
    return getProperty(CoreConstants.PROPERTY_RELATED_DRUG);
  }

  @Override
  public ImmutableList<SchemaOrgType> getWarningList() {
    return getProperty(CoreConstants.PROPERTY_WARNING);
  }
}
