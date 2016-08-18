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
import com.google.common.collect.ImmutableMultimap;
import com.google.schemaorg.SchemaOrgException;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.ValueType;
import javax.annotation.Nullable;

/*
 * Enum values of <a href="http://schema.org/MedicalAudience">http://schema.org/MedicalAudience</a>.
 */
public enum MedicalAudienceEnum implements MedicalAudience {
  CLINICIAN(CoreConstants.NAMESPACE + "Clinician"),

  MEDICAL_RESEARCHER(CoreConstants.NAMESPACE + "MedicalResearcher"),

  PATIENT(CoreConstants.NAMESPACE + "Patient");

  private final String enumValue;

  MedicalAudienceEnum(String enumValue) {
    this.enumValue = enumValue;
  }

  @Override
  public String getFullEnumValue() {
    return enumValue;
  }

  @Override
  public boolean containsJsonLdId() {
    return false;
  }

  @Override
  public ImmutableList<ValueType> getJsonLdContextList() {
    return ImmutableList.of();
  }

  @Override
  @Nullable
  public String getJsonLdId() throws SchemaOrgException {
    return null;
  }

  @Override
  public ImmutableMultimap<String, Thing> getJsonLdReverseMap() {
    return ImmutableMultimap.of();
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_MEDICAL_AUDIENCE;
  }

  @Override
  public boolean includesProperty(String property) {
    return false;
  }

  @Override
  public boolean contentEquals(ValueType o) {
    return (o == this);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAdditionalTypeList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getAlternateNameList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getAudienceTypeList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getCodeList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getDescriptionList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getGeographicAreaList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getGuidelineList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getHealthConditionList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getImageList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getMainEntityOfPageList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getMedicineSystemList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getNameList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getPotentialActionList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getRecognizingAuthorityList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getRelevantSpecialtyList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getRequiredGenderList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getRequiredMaxAgeList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getRequiredMinAgeList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getSameAsList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getStudyList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getSuggestedGenderList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getSuggestedMaxAgeList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getSuggestedMinAgeList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getSupersededByList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getUrlList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getDetailedDescriptionList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getPopularityScoreList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getProperty(String name) {
    return ImmutableList.of();
  }
}
