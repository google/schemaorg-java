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

/** Implementation of {@link MedicalDevice}. */
public class MedicalDeviceImpl extends MedicalEntityImpl implements MedicalDevice {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADVERSE_OUTCOME);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_CONTRAINDICATION);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INDICATION);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POST_OP);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRE_OP);

    builder.add(CoreConstants.PROPERTY_PROCEDURE);

    builder.add(CoreConstants.PROPERTY_PURPOSE);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<MedicalDevice.Builder>
      implements MedicalDevice.Builder {

    @Override
    public MedicalDevice.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public MedicalDevice.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value);
    }

    @Override
    public MedicalDevice.Builder addAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public MedicalDevice.Builder addAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public MedicalDevice.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public MedicalDevice.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public MedicalDevice.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addContraindication(MedicalContraindication value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value);
    }

    @Override
    public MedicalDevice.Builder addContraindication(MedicalContraindication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, value.build());
    }

    @Override
    public MedicalDevice.Builder addContraindication(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTRAINDICATION, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public MedicalDevice.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public MedicalDevice.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public MedicalDevice.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalDevice.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public MedicalDevice.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalDevice.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addIndication(MedicalIndication value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value);
    }

    @Override
    public MedicalDevice.Builder addIndication(MedicalIndication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, value.build());
    }

    @Override
    public MedicalDevice.Builder addIndication(String value) {
      return addProperty(CoreConstants.PROPERTY_INDICATION, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalDevice.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public MedicalDevice.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalDevice.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public MedicalDevice.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public MedicalDevice.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addPostOp(Text value) {
      return addProperty(CoreConstants.PROPERTY_POST_OP, value);
    }

    @Override
    public MedicalDevice.Builder addPostOp(String value) {
      return addProperty(CoreConstants.PROPERTY_POST_OP, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public MedicalDevice.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public MedicalDevice.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addPreOp(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRE_OP, value);
    }

    @Override
    public MedicalDevice.Builder addPreOp(String value) {
      return addProperty(CoreConstants.PROPERTY_PRE_OP, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addProcedure(Text value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE, value);
    }

    @Override
    public MedicalDevice.Builder addProcedure(String value) {
      return addProperty(CoreConstants.PROPERTY_PROCEDURE, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addPurpose(MedicalDevicePurpose value) {
      return addProperty(CoreConstants.PROPERTY_PURPOSE, value);
    }

    @Override
    public MedicalDevice.Builder addPurpose(Thing value) {
      return addProperty(CoreConstants.PROPERTY_PURPOSE, value);
    }

    @Override
    public MedicalDevice.Builder addPurpose(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PURPOSE, value.build());
    }

    @Override
    public MedicalDevice.Builder addPurpose(String value) {
      return addProperty(CoreConstants.PROPERTY_PURPOSE, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public MedicalDevice.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public MedicalDevice.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public MedicalDevice.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public MedicalDevice.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addSeriousAdverseOutcome(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value);
    }

    @Override
    public MedicalDevice.Builder addSeriousAdverseOutcome(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, value.build());
    }

    @Override
    public MedicalDevice.Builder addSeriousAdverseOutcome(String value) {
      return addProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public MedicalDevice.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public MedicalDevice.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public MedicalDevice.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public MedicalDevice.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public MedicalDevice.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalDevice.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public MedicalDevice.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public MedicalDevice.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public MedicalDevice build() {
      return new MedicalDeviceImpl(properties, reverseMap);
    }
  }

  public MedicalDeviceImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_MEDICAL_DEVICE;
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
  public ImmutableList<SchemaOrgType> getIndicationList() {
    return getProperty(CoreConstants.PROPERTY_INDICATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPostOpList() {
    return getProperty(CoreConstants.PROPERTY_POST_OP);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPreOpList() {
    return getProperty(CoreConstants.PROPERTY_PRE_OP);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProcedureList() {
    return getProperty(CoreConstants.PROPERTY_PROCEDURE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPurposeList() {
    return getProperty(CoreConstants.PROPERTY_PURPOSE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSeriousAdverseOutcomeList() {
    return getProperty(CoreConstants.PROPERTY_SERIOUS_ADVERSE_OUTCOME);
  }
}
