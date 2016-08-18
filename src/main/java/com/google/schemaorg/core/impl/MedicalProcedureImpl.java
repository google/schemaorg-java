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

/** Implementation of {@link MedicalProcedure}. */
public class MedicalProcedureImpl extends MedicalEntityImpl implements MedicalProcedure {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_FOLLOWUP);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_HOW_PERFORMED);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PREPARATION);

    builder.add(CoreConstants.PROPERTY_PROCEDURE_TYPE);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<MedicalProcedure.Builder>
      implements MedicalProcedure.Builder {

    @Override
    public MedicalProcedure.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public MedicalProcedure.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public MedicalProcedure.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public MedicalProcedure.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public MedicalProcedure.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public MedicalProcedure.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addFollowup(Text value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWUP, value);
    }

    @Override
    public MedicalProcedure.Builder addFollowup(String value) {
      return addProperty(CoreConstants.PROPERTY_FOLLOWUP, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public MedicalProcedure.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public MedicalProcedure.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addHowPerformed(Text value) {
      return addProperty(CoreConstants.PROPERTY_HOW_PERFORMED, value);
    }

    @Override
    public MedicalProcedure.Builder addHowPerformed(String value) {
      return addProperty(CoreConstants.PROPERTY_HOW_PERFORMED, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalProcedure.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public MedicalProcedure.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalProcedure.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalProcedure.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public MedicalProcedure.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalProcedure.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public MedicalProcedure.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public MedicalProcedure.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public MedicalProcedure.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public MedicalProcedure.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addPreparation(Text value) {
      return addProperty(CoreConstants.PROPERTY_PREPARATION, value);
    }

    @Override
    public MedicalProcedure.Builder addPreparation(String value) {
      return addProperty(CoreConstants.PROPERTY_PREPARATION, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addProcedureType(MedicalProcedureType value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE_TYPE, value);
    }

    @Override
    public MedicalProcedure.Builder addProcedureType(String value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE_TYPE, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public MedicalProcedure.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public MedicalProcedure.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public MedicalProcedure.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public MedicalProcedure.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public MedicalProcedure.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public MedicalProcedure.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public MedicalProcedure.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public MedicalProcedure.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public MedicalProcedure.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalProcedure.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public MedicalProcedure.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public MedicalProcedure.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public MedicalProcedure build() {
      return new MedicalProcedureImpl(properties, reverseMap);
    }
  }

  public MedicalProcedureImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_MEDICAL_PROCEDURE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFollowupList() {
    return getProperty(CoreConstants.PROPERTY_FOLLOWUP);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHowPerformedList() {
    return getProperty(CoreConstants.PROPERTY_HOW_PERFORMED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPreparationList() {
    return getProperty(CoreConstants.PROPERTY_PREPARATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProcedureTypeList() {
    return getProperty(CoreConstants.PROPERTY_PROCEDURE_TYPE);
  }
}
