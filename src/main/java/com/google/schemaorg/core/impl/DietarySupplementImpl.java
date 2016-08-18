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

/** Implementation of {@link DietarySupplement}. */
public class DietarySupplementImpl extends MedicalTherapyImpl implements DietarySupplement {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACTIVE_INGREDIENT);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADVERSE_OUTCOME);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BACKGROUND);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_CONTRAINDICATION);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DOSAGE_FORM);

    builder.add(CoreConstants.PROPERTY_DUPLICATE_THERAPY);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INDICATION);

    builder.add(CoreConstants.PROPERTY_IS_PROPRIETARY);

    builder.add(CoreConstants.PROPERTY_LEGAL_STATUS);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MANUFACTURER);

    builder.add(CoreConstants.PROPERTY_MAXIMUM_INTAKE);

    builder.add(CoreConstants.PROPERTY_MECHANISM_OF_ACTION);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NON_PROPRIETARY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RECOMMENDED_INTAKE);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAFETY_CONSIDERATION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_TARGET_POPULATION);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<DietarySupplement.Builder>
      implements DietarySupplement.Builder {

    @Override
    public DietarySupplement.Builder addActiveIngredient(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACTIVE_INGREDIENT, value);
    }

    @Override
    public DietarySupplement.Builder addActiveIngredient(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTIVE_INGREDIENT, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public DietarySupplement.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value);
    }

    @Override
    public DietarySupplement.Builder addAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public DietarySupplement.Builder addAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public DietarySupplement.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addBackground(Text value) {
      return addProperty(CoreConstants.PROPERTY_BACKGROUND, value);
    }

    @Override
    public DietarySupplement.Builder addBackground(String value) {
      return addProperty(CoreConstants.PROPERTY_BACKGROUND, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public DietarySupplement.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public DietarySupplement.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addContraindication(MedicalContraindication value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value);
    }

    @Override
    public DietarySupplement.Builder addContraindication(MedicalContraindication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value.build());
    }

    @Override
    public DietarySupplement.Builder addContraindication(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public DietarySupplement.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addDosageForm(Text value) {
      return addProperty(CoreConstants.PROPERTY_DOSAGE_FORM, value);
    }

    @Override
    public DietarySupplement.Builder addDosageForm(String value) {
      return addProperty(CoreConstants.PROPERTY_DOSAGE_FORM, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addDuplicateTherapy(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, value);
    }

    @Override
    public DietarySupplement.Builder addDuplicateTherapy(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, value.build());
    }

    @Override
    public DietarySupplement.Builder addDuplicateTherapy(String value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public DietarySupplement.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public DietarySupplement.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DietarySupplement.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public DietarySupplement.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public DietarySupplement.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addIndication(MedicalIndication value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value);
    }

    @Override
    public DietarySupplement.Builder addIndication(MedicalIndication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value.build());
    }

    @Override
    public DietarySupplement.Builder addIndication(String value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addIsProprietary(Boolean value) {
      return addProperty(CoreConstants.PROPERTY_IS_PROPRIETARY, value);
    }

    @Override
    public DietarySupplement.Builder addIsProprietary(String value) {
      return addProperty(CoreConstants.PROPERTY_IS_PROPRIETARY, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addLegalStatus(DrugLegalStatus value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_STATUS, value);
    }

    @Override
    public DietarySupplement.Builder addLegalStatus(DrugLegalStatus.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_STATUS, value.build());
    }

    @Override
    public DietarySupplement.Builder addLegalStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_LEGAL_STATUS, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DietarySupplement.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public DietarySupplement.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public DietarySupplement.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addManufacturer(Organization value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value);
    }

    @Override
    public DietarySupplement.Builder addManufacturer(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, value.build());
    }

    @Override
    public DietarySupplement.Builder addManufacturer(String value) {
      return addProperty(CoreConstants.PROPERTY_MANUFACTURER, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addMaximumIntake(MaximumDoseSchedule value) {
      return addProperty(CoreConstants.PROPERTY_MAXIMUM_INTAKE, value);
    }

    @Override
    public DietarySupplement.Builder addMaximumIntake(MaximumDoseSchedule.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAXIMUM_INTAKE, value.build());
    }

    @Override
    public DietarySupplement.Builder addMaximumIntake(String value) {
      return addProperty(CoreConstants.PROPERTY_MAXIMUM_INTAKE, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addMechanismOfAction(Text value) {
      return addProperty(CoreConstants.PROPERTY_MECHANISM_OF_ACTION, value);
    }

    @Override
    public DietarySupplement.Builder addMechanismOfAction(String value) {
      return addProperty(CoreConstants.PROPERTY_MECHANISM_OF_ACTION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public DietarySupplement.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public DietarySupplement.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addNonProprietaryName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NON_PROPRIETARY_NAME, value);
    }

    @Override
    public DietarySupplement.Builder addNonProprietaryName(String value) {
      return addProperty(CoreConstants.PROPERTY_NON_PROPRIETARY_NAME, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public DietarySupplement.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public DietarySupplement.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public DietarySupplement.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public DietarySupplement.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addRecommendedIntake(RecommendedDoseSchedule value) {
      return addProperty(CoreConstants.PROPERTY_RECOMMENDED_INTAKE, value);
    }

    @Override
    public DietarySupplement.Builder addRecommendedIntake(RecommendedDoseSchedule.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOMMENDED_INTAKE, value.build());
    }

    @Override
    public DietarySupplement.Builder addRecommendedIntake(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOMMENDED_INTAKE, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public DietarySupplement.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addSafetyConsideration(Text value) {
      return addProperty(CoreConstants.PROPERTY_SAFETY_CONSIDERATION, value);
    }

    @Override
    public DietarySupplement.Builder addSafetyConsideration(String value) {
      return addProperty(CoreConstants.PROPERTY_SAFETY_CONSIDERATION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public DietarySupplement.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addSeriousAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value);
    }

    @Override
    public DietarySupplement.Builder addSeriousAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public DietarySupplement.Builder addSeriousAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public DietarySupplement.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public DietarySupplement.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addTargetPopulation(Text value) {
      return addProperty(CoreConstants.PROPERTY_TARGET_POPULATION, value);
    }

    @Override
    public DietarySupplement.Builder addTargetPopulation(String value) {
      return addProperty(CoreConstants.PROPERTY_TARGET_POPULATION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public DietarySupplement.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public DietarySupplement.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public DietarySupplement.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public DietarySupplement.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public DietarySupplement.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public DietarySupplement.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public DietarySupplement build() {
      return new DietarySupplementImpl(properties, reverseMap);
    }
  }

  public DietarySupplementImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_DIETARY_SUPPLEMENT;
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
  public ImmutableList<SchemaOrgType> getBackgroundList() {
    return getProperty(CoreConstants.PROPERTY_BACKGROUND);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDosageFormList() {
    return getProperty(CoreConstants.PROPERTY_DOSAGE_FORM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIsProprietaryList() {
    return getProperty(CoreConstants.PROPERTY_IS_PROPRIETARY);
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
  public ImmutableList<SchemaOrgType> getMaximumIntakeList() {
    return getProperty(CoreConstants.PROPERTY_MAXIMUM_INTAKE);
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
  public ImmutableList<SchemaOrgType> getRecommendedIntakeList() {
    return getProperty(CoreConstants.PROPERTY_RECOMMENDED_INTAKE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSafetyConsiderationList() {
    return getProperty(CoreConstants.PROPERTY_SAFETY_CONSIDERATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTargetPopulationList() {
    return getProperty(CoreConstants.PROPERTY_TARGET_POPULATION);
  }
}
