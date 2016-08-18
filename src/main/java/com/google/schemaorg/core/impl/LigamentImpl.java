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

/** Implementation of {@link Ligament}. */
public class LigamentImpl extends AnatomicalStructureImpl implements Ligament {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ASSOCIATED_PATHOPHYSIOLOGY);

    builder.add(CoreConstants.PROPERTY_BODY_LOCATION);

    builder.add(CoreConstants.PROPERTY_CODE);

    builder.add(CoreConstants.PROPERTY_CONNECTED_TO);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_DIAGRAM);

    builder.add(CoreConstants.PROPERTY_FUNCTION);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_PART_OF_SYSTEM);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_RELATED_CONDITION);

    builder.add(CoreConstants.PROPERTY_RELATED_THERAPY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_SUB_STRUCTURE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Ligament.Builder>
      implements Ligament.Builder {

    @Override
    public Ligament.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Ligament.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Ligament.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Ligament.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Ligament.Builder addAssociatedPathophysiology(Text value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_PATHOPHYSIOLOGY, value);
    }

    @Override
    public Ligament.Builder addAssociatedPathophysiology(String value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_PATHOPHYSIOLOGY, Text.of(value));
    }

    @Override
    public Ligament.Builder addBodyLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_BODY_LOCATION, value);
    }

    @Override
    public Ligament.Builder addBodyLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_BODY_LOCATION, Text.of(value));
    }

    @Override
    public Ligament.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public Ligament.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public Ligament.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public Ligament.Builder addConnectedTo(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, value);
    }

    @Override
    public Ligament.Builder addConnectedTo(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, value.build());
    }

    @Override
    public Ligament.Builder addConnectedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, Text.of(value));
    }

    @Override
    public Ligament.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Ligament.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Ligament.Builder addDiagram(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, value);
    }

    @Override
    public Ligament.Builder addDiagram(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, value.build());
    }

    @Override
    public Ligament.Builder addDiagram(String value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, Text.of(value));
    }

    @Override
    public Ligament.Builder addFunction(Text value) {
      return addProperty(CoreConstants.PROPERTY_FUNCTION, value);
    }

    @Override
    public Ligament.Builder addFunction(String value) {
      return addProperty(CoreConstants.PROPERTY_FUNCTION, Text.of(value));
    }

    @Override
    public Ligament.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public Ligament.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public Ligament.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public Ligament.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Ligament.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Ligament.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Ligament.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Ligament.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Ligament.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Ligament.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Ligament.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Ligament.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public Ligament.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public Ligament.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Ligament.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Ligament.Builder addPartOfSystem(AnatomicalSystem value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, value);
    }

    @Override
    public Ligament.Builder addPartOfSystem(AnatomicalSystem.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, value.build());
    }

    @Override
    public Ligament.Builder addPartOfSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, Text.of(value));
    }

    @Override
    public Ligament.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Ligament.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Ligament.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Ligament.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public Ligament.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public Ligament.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public Ligament.Builder addRelatedCondition(MedicalCondition value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, value);
    }

    @Override
    public Ligament.Builder addRelatedCondition(MedicalCondition.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, value.build());
    }

    @Override
    public Ligament.Builder addRelatedCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, Text.of(value));
    }

    @Override
    public Ligament.Builder addRelatedTherapy(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, value);
    }

    @Override
    public Ligament.Builder addRelatedTherapy(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, value.build());
    }

    @Override
    public Ligament.Builder addRelatedTherapy(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, Text.of(value));
    }

    @Override
    public Ligament.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public Ligament.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public Ligament.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Ligament.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Ligament.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public Ligament.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public Ligament.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public Ligament.Builder addSubStructure(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, value);
    }

    @Override
    public Ligament.Builder addSubStructure(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, value.build());
    }

    @Override
    public Ligament.Builder addSubStructure(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, Text.of(value));
    }

    @Override
    public Ligament.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Ligament.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Ligament.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Ligament.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Ligament.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Ligament.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Ligament.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Ligament.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Ligament build() {
      return new LigamentImpl(properties, reverseMap);
    }
  }

  public LigamentImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_LIGAMENT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
