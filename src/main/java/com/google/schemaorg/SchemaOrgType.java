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

package com.google.schemaorg;

import com.google.common.collect.ImmutableList;

/** Interface of schema.org type. */
public interface SchemaOrgType extends ValueType {

  /** Builder interface of schema.org type. */
  public interface Builder extends ValueType.Builder {}

  /** Returns the full name of this schema.org type. For example, http://schema.org/Thing. */
  String getFullTypeName();

  /**
   * Whether the property can be set in this type.
   *
   * @param property The name of property which can be short property name or full property name.
   */
  boolean includesProperty(String property);

  /**
   * Returns the list of values of a specified property.
   *
   * @param name The property name.
   */
  ImmutableList<SchemaOrgType> getProperty(String name);
}
