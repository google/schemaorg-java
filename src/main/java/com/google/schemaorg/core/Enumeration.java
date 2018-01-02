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

/** Interface of <a href="http://schema.org/Enumeration">http://schema.org/Enumeration</a>. */
public interface Enumeration extends Intangible {

  /**
   * Returns the value list of property supersededBy. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getSupersededByList();

  /** Returns the full enum value name. */
  String getFullEnumValue();
}
