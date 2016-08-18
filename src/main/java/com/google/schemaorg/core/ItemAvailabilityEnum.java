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
 * Enum values of <a href="http://schema.org/ItemAvailability">http://schema.org/ItemAvailability</a>.
 */
public enum ItemAvailabilityEnum implements ItemAvailability {
  DISCONTINUED(CoreConstants.NAMESPACE + "Discontinued"),

  IN_STOCK(CoreConstants.NAMESPACE + "InStock"),

  IN_STORE_ONLY(CoreConstants.NAMESPACE + "InStoreOnly"),

  LIMITED_AVAILABILITY(CoreConstants.NAMESPACE + "LimitedAvailability"),

  ONLINE_ONLY(CoreConstants.NAMESPACE + "OnlineOnly"),

  OUT_OF_STOCK(CoreConstants.NAMESPACE + "OutOfStock"),

  PRE_ORDER(CoreConstants.NAMESPACE + "PreOrder"),

  SOLD_OUT(CoreConstants.NAMESPACE + "SoldOut");

  private final String enumValue;

  ItemAvailabilityEnum(String enumValue) {
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
    return CoreConstants.TYPE_ITEM_AVAILABILITY;
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
  public ImmutableList<SchemaOrgType> getDescriptionList() {
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
  public ImmutableList<SchemaOrgType> getNameList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getPotentialActionList() {
    return ImmutableList.of();
  }

  @Override
  public ImmutableList<SchemaOrgType> getSameAsList() {
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
