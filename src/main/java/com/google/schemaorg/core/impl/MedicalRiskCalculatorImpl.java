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

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link MedicalRiskCalculator}. */
public class MedicalRiskCalculatorImpl extends MedicalRiskEstimatorImpl
    implements MedicalRiskCalculator {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ESTIMATES_RISK_OF);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INCLUDED_RISK_FACTOR);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl
      extends SchemaOrgTypeImpl.BuilderImpl<MedicalRiskCalculator.Builder>
      implements MedicalRiskCalculator.Builder {

    @Override
    public MedicalRiskCalculator.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addEstimatesRiskOf(MedicalEntity value) {
      return addProperty(CoreConstants.PROPERTY_ESTIMATES_RISK_OF, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addEstimatesRiskOf(MedicalEntity.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ESTIMATES_RISK_OF, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addEstimatesRiskOf(String value) {
      return addProperty(CoreConstants.PROPERTY_ESTIMATES_RISK_OF, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addIncludedRiskFactor(MedicalRiskFactor value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDED_RISK_FACTOR, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addIncludedRiskFactor(MedicalRiskFactor.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDED_RISK_FACTOR, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addIncludedRiskFactor(String value) {
      return addProperty(CoreConstants.PROPERTY_INCLUDED_RISK_FACTOR, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public MedicalRiskCalculator.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public MedicalRiskCalculator.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public MedicalRiskCalculator build() {
      return new MedicalRiskCalculatorImpl(properties, reverseMap);
    }
  }

  public MedicalRiskCalculatorImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_MEDICAL_RISK_CALCULATOR;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
