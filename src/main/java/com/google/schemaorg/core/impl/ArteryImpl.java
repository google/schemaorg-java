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

/** Implementation of {@link Artery}. */
public class ArteryImpl extends VesselImpl implements Artery {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_ARTERIAL_BRANCH);

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

    builder.add(CoreConstants.PROPERTY_SOURCE);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_SUB_STRUCTURE);

    builder.add(CoreConstants.PROPERTY_SUPPLY_TO);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Artery.Builder>
      implements Artery.Builder {

    @Override
    public Artery.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Artery.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Artery.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Artery.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Artery.Builder addArterialBranch(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_ARTERIAL_BRANCH, value);
    }

    @Override
    public Artery.Builder addArterialBranch(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ARTERIAL_BRANCH, value.build());
    }

    @Override
    public Artery.Builder addArterialBranch(String value) {
      return addProperty(CoreConstants.PROPERTY_ARTERIAL_BRANCH, Text.of(value));
    }

    @Override
    public Artery.Builder addAssociatedPathophysiology(Text value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_PATHOPHYSIOLOGY, value);
    }

    @Override
    public Artery.Builder addAssociatedPathophysiology(String value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_PATHOPHYSIOLOGY, Text.of(value));
    }

    @Override
    public Artery.Builder addBodyLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_BODY_LOCATION, value);
    }

    @Override
    public Artery.Builder addBodyLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_BODY_LOCATION, Text.of(value));
    }

    @Override
    public Artery.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public Artery.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public Artery.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public Artery.Builder addConnectedTo(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, value);
    }

    @Override
    public Artery.Builder addConnectedTo(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, value.build());
    }

    @Override
    public Artery.Builder addConnectedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, Text.of(value));
    }

    @Override
    public Artery.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Artery.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Artery.Builder addDiagram(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, value);
    }

    @Override
    public Artery.Builder addDiagram(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, value.build());
    }

    @Override
    public Artery.Builder addDiagram(String value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, Text.of(value));
    }

    @Override
    public Artery.Builder addFunction(Text value) {
      return addProperty(CoreConstants.PROPERTY_FUNCTION, value);
    }

    @Override
    public Artery.Builder addFunction(String value) {
      return addProperty(CoreConstants.PROPERTY_FUNCTION, Text.of(value));
    }

    @Override
    public Artery.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public Artery.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public Artery.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public Artery.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Artery.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Artery.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Artery.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Artery.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Artery.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Artery.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Artery.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Artery.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public Artery.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public Artery.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Artery.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Artery.Builder addPartOfSystem(AnatomicalSystem value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, value);
    }

    @Override
    public Artery.Builder addPartOfSystem(AnatomicalSystem.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, value.build());
    }

    @Override
    public Artery.Builder addPartOfSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, Text.of(value));
    }

    @Override
    public Artery.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Artery.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Artery.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Artery.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public Artery.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public Artery.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public Artery.Builder addRelatedCondition(MedicalCondition value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, value);
    }

    @Override
    public Artery.Builder addRelatedCondition(MedicalCondition.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, value.build());
    }

    @Override
    public Artery.Builder addRelatedCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, Text.of(value));
    }

    @Override
    public Artery.Builder addRelatedTherapy(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, value);
    }

    @Override
    public Artery.Builder addRelatedTherapy(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, value.build());
    }

    @Override
    public Artery.Builder addRelatedTherapy(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, Text.of(value));
    }

    @Override
    public Artery.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public Artery.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public Artery.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Artery.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Artery.Builder addSource(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE, value);
    }

    @Override
    public Artery.Builder addSource(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE, value.build());
    }

    @Override
    public Artery.Builder addSource(String value) {
      return addProperty(CoreConstants.PROPERTY_SOURCE, Text.of(value));
    }

    @Override
    public Artery.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public Artery.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public Artery.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public Artery.Builder addSubStructure(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, value);
    }

    @Override
    public Artery.Builder addSubStructure(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, value.build());
    }

    @Override
    public Artery.Builder addSubStructure(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, Text.of(value));
    }

    @Override
    public Artery.Builder addSupplyTo(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_SUPPLY_TO, value);
    }

    @Override
    public Artery.Builder addSupplyTo(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUPPLY_TO, value.build());
    }

    @Override
    public Artery.Builder addSupplyTo(String value) {
      return addProperty(CoreConstants.PROPERTY_SUPPLY_TO, Text.of(value));
    }

    @Override
    public Artery.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Artery.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Artery.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Artery.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Artery.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Artery.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Artery.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Artery.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Artery build() {
      return new ArteryImpl(properties, reverseMap);
    }
  }

  public ArteryImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_ARTERY;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getArterialBranchList() {
    return getProperty(CoreConstants.PROPERTY_ARTERIAL_BRANCH);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSourceList() {
    return getProperty(CoreConstants.PROPERTY_SOURCE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSupplyToList() {
    return getProperty(CoreConstants.PROPERTY_SUPPLY_TO);
  }
}
