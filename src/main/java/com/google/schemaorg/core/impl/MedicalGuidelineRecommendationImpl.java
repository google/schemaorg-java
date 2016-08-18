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
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link MedicalGuidelineRecommendation}. */
public class MedicalGuidelineRecommendationImpl extends MedicalGuidelineImpl
    implements MedicalGuidelineRecommendation {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_EVIDENCE_LEVEL);

    builder.add(CoreConstants.PROPERTY_EVIDENCE_ORIGIN);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_GUIDELINE_DATE);

    builder.add(CoreConstants.PROPERTY_GUIDELINE_SUBJECT);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RECOMMENDATION_STRENGTH);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl
      extends SchemaOrgTypeImpl.BuilderImpl<MedicalGuidelineRecommendation.Builder>
      implements MedicalGuidelineRecommendation.Builder {

    @Override
    public MedicalGuidelineRecommendation.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addEvidenceLevel(MedicalEvidenceLevel value) {
      return addProperty(CoreConstants.PROPERTY_EVIDENCE_LEVEL, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addEvidenceLevel(String value) {
      return addProperty(CoreConstants.PROPERTY_EVIDENCE_LEVEL, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addEvidenceOrigin(Text value) {
      return addProperty(CoreConstants.PROPERTY_EVIDENCE_ORIGIN, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addEvidenceOrigin(String value) {
      return addProperty(CoreConstants.PROPERTY_EVIDENCE_ORIGIN, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuidelineDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE_DATE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuidelineDate(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE_DATE, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuidelineSubject(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE_SUBJECT, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuidelineSubject(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE_SUBJECT, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addGuidelineSubject(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE_SUBJECT, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addRecognizingAuthority(
        Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addRecommendationStrength(Text value) {
      return addProperty(CoreConstants.PROPERTY_RECOMMENDATION_STRENGTH, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addRecommendationStrength(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOMMENDATION_STRENGTH, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addPopularityScore(
        PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public MedicalGuidelineRecommendation.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public MedicalGuidelineRecommendation build() {
      return new MedicalGuidelineRecommendationImpl(properties, reverseMap);
    }
  }

  public MedicalGuidelineRecommendationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_MEDICAL_GUIDELINE_RECOMMENDATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRecommendationStrengthList() {
    return getProperty(CoreConstants.PROPERTY_RECOMMENDATION_STRENGTH);
  }
}
