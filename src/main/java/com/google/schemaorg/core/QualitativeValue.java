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
import com.google.schemaorg.SchemaOrgType;

/**
 * Interface of <a
 * href="http://schema.org/QualitativeValue">http://schema.org/QualitativeValue</a>.
 */
public interface QualitativeValue extends Enumeration {

  /**
   * Returns the value list of property additionalProperty. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getAdditionalPropertyList();

  /**
   * Returns the value list of property equal. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getEqualList();

  /**
   * Returns the value list of property greater. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getGreaterList();

  /**
   * Returns the value list of property greaterOrEqual. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getGreaterOrEqualList();

  /**
   * Returns the value list of property lesser. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getLesserList();

  /**
   * Returns the value list of property lesserOrEqual. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getLesserOrEqualList();

  /**
   * Returns the value list of property nonEqual. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getNonEqualList();

  /**
   * Returns the value list of property valueReference. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getValueReferenceList();
}
