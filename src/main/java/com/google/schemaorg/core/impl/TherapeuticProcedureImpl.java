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

/** Implementation of {@link TherapeuticProcedure}. */
public class TherapeuticProcedureImpl extends MedicalProcedureImpl implements TherapeuticProcedure {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADVERSE_OUTCOME);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_CONTRAINDICATION);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DUPLICATE_THERAPY);

    builder.add(CoreConstants.PROPERTY_FOLLOWUP);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_HOW_PERFORMED);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INDICATION);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PREPARATION);

    builder.add(CoreConstants.PROPERTY_PROCEDURE_TYPE);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<TherapeuticProcedure.Builder>
      implements TherapeuticProcedure.Builder {

    @Override
    public TherapeuticProcedure.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value);
    }

    @Override
    public TherapeuticProcedure.Builder addAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public TherapeuticProcedure.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addContraindication(MedicalContraindication value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value);
    }

    @Override
    public TherapeuticProcedure.Builder addContraindication(MedicalContraindication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addContraindication(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public TherapeuticProcedure.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addDuplicateTherapy(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, value);
    }

    @Override
    public TherapeuticProcedure.Builder addDuplicateTherapy(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addDuplicateTherapy(String value) {
      return addProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addFollowup(Text value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWUP, value);
    }

    @Override
    public TherapeuticProcedure.Builder addFollowup(String value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWUP, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addHowPerformed(Text value) {
      return addProperty(CoreConstants.PROPERTY_HOW_PERFORMED, value);
    }

    @Override
    public TherapeuticProcedure.Builder addHowPerformed(String value) {
      return addProperty(CoreConstants.PROPERTY_HOW_PERFORMED, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addIndication(MedicalIndication value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value);
    }

    @Override
    public TherapeuticProcedure.Builder addIndication(MedicalIndication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addIndication(String value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public TherapeuticProcedure.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public TherapeuticProcedure.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public TherapeuticProcedure.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addPreparation(Text value) {
      return addProperty(CoreConstants.PROPERTY_PREPARATION, value);
    }

    @Override
    public TherapeuticProcedure.Builder addPreparation(String value) {
      return addProperty(CoreConstants.PROPERTY_PREPARATION, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addProcedureType(MedicalProcedureType value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE_TYPE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addProcedureType(String value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE_TYPE, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public TherapeuticProcedure.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public TherapeuticProcedure.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public TherapeuticProcedure.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addSeriousAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value);
    }

    @Override
    public TherapeuticProcedure.Builder addSeriousAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addSeriousAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public TherapeuticProcedure.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public TherapeuticProcedure.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public TherapeuticProcedure.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public TherapeuticProcedure.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public TherapeuticProcedure.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public TherapeuticProcedure.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public TherapeuticProcedure build() {
      return new TherapeuticProcedureImpl(properties, reverseMap);
    }
  }

  public TherapeuticProcedureImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_THERAPEUTIC_PROCEDURE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAdverseOutcomeList() {
    return getProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getContraindicationList() {
    return getProperty(CoreConstants.PROPERTY_CONTRAINDICATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDuplicateTherapyList() {
    return getProperty(CoreConstants.PROPERTY_DUPLICATE_THERAPY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIndicationList() {
    return getProperty(CoreConstants.PROPERTY_INDICATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSeriousAdverseOutcomeList() {
    return getProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME);
  }
}
