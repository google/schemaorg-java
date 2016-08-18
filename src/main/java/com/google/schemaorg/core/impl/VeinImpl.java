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

/** Implementation of {@link Vein}. */
public class VeinImpl extends VesselImpl implements Vein {
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

    builder.add(CoreConstants.PROPERTY_DRAINS_TO);

    builder.add(CoreConstants.PROPERTY_FUNCTION);

    builder.add(CoreConstants.PROPERTY_GUIDELINE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MEDICINE_SYSTEM);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_PART_OF_SYSTEM);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY);

    builder.add(CoreConstants.PROPERTY_REGION_DRAINED);

    builder.add(CoreConstants.PROPERTY_RELATED_CONDITION);

    builder.add(CoreConstants.PROPERTY_RELATED_THERAPY);

    builder.add(CoreConstants.PROPERTY_RELEVANT_SPECIALTY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_STUDY);

    builder.add(CoreConstants.PROPERTY_SUB_STRUCTURE);

    builder.add(CoreConstants.PROPERTY_TRIBUTARY);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Vein.Builder>
      implements Vein.Builder {

    @Override
    public Vein.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Vein.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Vein.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Vein.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Vein.Builder addAssociatedPathophysiology(Text value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_PATHOPHYSIOLOGY, value);
    }

    @Override
    public Vein.Builder addAssociatedPathophysiology(String value) {
      return addProperty(CoreConstants.PROPERTY_ASSOCIATED_PATHOPHYSIOLOGY, Text.of(value));
    }

    @Override
    public Vein.Builder addBodyLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_BODY_LOCATION, value);
    }

    @Override
    public Vein.Builder addBodyLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_BODY_LOCATION, Text.of(value));
    }

    @Override
    public Vein.Builder addCode(MedicalCode value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value);
    }

    @Override
    public Vein.Builder addCode(MedicalCode.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CODE, value.build());
    }

    @Override
    public Vein.Builder addCode(String value) {
      return addProperty(CoreConstants.PROPERTY_CODE, Text.of(value));
    }

    @Override
    public Vein.Builder addConnectedTo(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, value);
    }

    @Override
    public Vein.Builder addConnectedTo(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, value.build());
    }

    @Override
    public Vein.Builder addConnectedTo(String value) {
      return addProperty(CoreConstants.PROPERTY_CONNECTED_TO, Text.of(value));
    }

    @Override
    public Vein.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Vein.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Vein.Builder addDiagram(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, value);
    }

    @Override
    public Vein.Builder addDiagram(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, value.build());
    }

    @Override
    public Vein.Builder addDiagram(String value) {
      return addProperty(CoreConstants.PROPERTY_DIAGRAM, Text.of(value));
    }

    @Override
    public Vein.Builder addDrainsTo(Vessel value) {
      return addProperty(CoreConstants.PROPERTY_DRAINS_TO, value);
    }

    @Override
    public Vein.Builder addDrainsTo(Vessel.Builder value) {
      return addProperty(CoreConstants.PROPERTY_DRAINS_TO, value.build());
    }

    @Override
    public Vein.Builder addDrainsTo(String value) {
      return addProperty(CoreConstants.PROPERTY_DRAINS_TO, Text.of(value));
    }

    @Override
    public Vein.Builder addFunction(Text value) {
      return addProperty(CoreConstants.PROPERTY_FUNCTION, value);
    }

    @Override
    public Vein.Builder addFunction(String value) {
      return addProperty(CoreConstants.PROPERTY_FUNCTION, Text.of(value));
    }

    @Override
    public Vein.Builder addGuideline(MedicalGuideline value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value);
    }

    @Override
    public Vein.Builder addGuideline(MedicalGuideline.Builder value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, value.build());
    }

    @Override
    public Vein.Builder addGuideline(String value) {
      return addProperty(CoreConstants.PROPERTY_GUIDELINE, Text.of(value));
    }

    @Override
    public Vein.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Vein.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Vein.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Vein.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Vein.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Vein.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Vein.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Vein.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Vein.Builder addMedicineSystem(MedicineSystem value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, value);
    }

    @Override
    public Vein.Builder addMedicineSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_MEDICINE_SYSTEM, Text.of(value));
    }

    @Override
    public Vein.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Vein.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Vein.Builder addPartOfSystem(AnatomicalSystem value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, value);
    }

    @Override
    public Vein.Builder addPartOfSystem(AnatomicalSystem.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, value.build());
    }

    @Override
    public Vein.Builder addPartOfSystem(String value) {
      return addProperty(CoreConstants.PROPERTY_PART_OF_SYSTEM, Text.of(value));
    }

    @Override
    public Vein.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Vein.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Vein.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Vein.Builder addRecognizingAuthority(Organization value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value);
    }

    @Override
    public Vein.Builder addRecognizingAuthority(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, value.build());
    }

    @Override
    public Vein.Builder addRecognizingAuthority(String value) {
      return addProperty(CoreConstants.PROPERTY_RECOGNIZING_AUTHORITY, Text.of(value));
    }

    @Override
    public Vein.Builder addRegionDrained(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_REGION_DRAINED, value);
    }

    @Override
    public Vein.Builder addRegionDrained(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REGION_DRAINED, value.build());
    }

    @Override
    public Vein.Builder addRegionDrained(AnatomicalSystem value) {
      return addProperty(CoreConstants.PROPERTY_REGION_DRAINED, value);
    }

    @Override
    public Vein.Builder addRegionDrained(AnatomicalSystem.Builder value) {
      return addProperty(CoreConstants.PROPERTY_REGION_DRAINED, value.build());
    }

    @Override
    public Vein.Builder addRegionDrained(String value) {
      return addProperty(CoreConstants.PROPERTY_REGION_DRAINED, Text.of(value));
    }

    @Override
    public Vein.Builder addRelatedCondition(MedicalCondition value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, value);
    }

    @Override
    public Vein.Builder addRelatedCondition(MedicalCondition.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, value.build());
    }

    @Override
    public Vein.Builder addRelatedCondition(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_CONDITION, Text.of(value));
    }

    @Override
    public Vein.Builder addRelatedTherapy(MedicalTherapy value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, value);
    }

    @Override
    public Vein.Builder addRelatedTherapy(MedicalTherapy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, value.build());
    }

    @Override
    public Vein.Builder addRelatedTherapy(String value) {
      return addProperty(CoreConstants.PROPERTY_RELATED_THERAPY, Text.of(value));
    }

    @Override
    public Vein.Builder addRelevantSpecialty(MedicalSpecialty value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, value);
    }

    @Override
    public Vein.Builder addRelevantSpecialty(String value) {
      return addProperty(CoreConstants.PROPERTY_RELEVANT_SPECIALTY, Text.of(value));
    }

    @Override
    public Vein.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Vein.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Vein.Builder addStudy(MedicalStudy value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value);
    }

    @Override
    public Vein.Builder addStudy(MedicalStudy.Builder value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, value.build());
    }

    @Override
    public Vein.Builder addStudy(String value) {
      return addProperty(CoreConstants.PROPERTY_STUDY, Text.of(value));
    }

    @Override
    public Vein.Builder addSubStructure(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, value);
    }

    @Override
    public Vein.Builder addSubStructure(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, value.build());
    }

    @Override
    public Vein.Builder addSubStructure(String value) {
      return addProperty(CoreConstants.PROPERTY_SUB_STRUCTURE, Text.of(value));
    }

    @Override
    public Vein.Builder addTributary(AnatomicalStructure value) {
      return addProperty(CoreConstants.PROPERTY_TRIBUTARY, value);
    }

    @Override
    public Vein.Builder addTributary(AnatomicalStructure.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TRIBUTARY, value.build());
    }

    @Override
    public Vein.Builder addTributary(String value) {
      return addProperty(CoreConstants.PROPERTY_TRIBUTARY, Text.of(value));
    }

    @Override
    public Vein.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Vein.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Vein.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Vein.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Vein.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Vein.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Vein.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Vein.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Vein build() {
      return new VeinImpl(properties, reverseMap);
    }
  }

  public VeinImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_VEIN;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDrainsToList() {
    return getProperty(CoreConstants.PROPERTY_DRAINS_TO);
  }

  @Override
  public ImmutableList<SchemaOrgType> getRegionDrainedList() {
    return getProperty(CoreConstants.PROPERTY_REGION_DRAINED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTributaryList() {
    return getProperty(CoreConstants.PROPERTY_TRIBUTARY);
  }
}
