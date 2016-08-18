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
import com.google.common.collect.ImmutableMultimap;
import com.google.schemaorg.core.Thing;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Interface of JSON-LD node.
 */
public interface JsonLdNode extends ValueType {

  /**
   * Builder interface of JSON-LD node.
   */
  public interface Builder extends ValueType.Builder {

    /**
     * Add a value to {@literal @context} in current JSON-LD node.
     */
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    /**
     * Add a value to {@literal @context} in current JSON-LD node.
     */
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder builder);

    /**
     * Set value to {@literal @id} in current JSON-LD node.
     */
    Builder setJsonLdId(@Nullable String value);

    /**
     * Add value to {@literal @reverse} in current JSON-LD node.
     * @param property The full or short name of the property.
     * @param obj The object that the property is set in.
     */
    Builder setJsonLdReverse(String property, Thing obj) throws SchemaOrgException;

    /**
     * Add value to {@literal @reverse} in current JSON-LD node.
     * @param property The full or short name of the property.
     * @param builder The object builder that the property is set in.
     */
    Builder setJsonLdReverse(String property, Thing.Builder builder) throws SchemaOrgException;
  }

  /**
   * Whether current JSON-LD node contains {@literal @id} value.
   */
  boolean containsJsonLdId();

  /**
   * Returns the list of JSON-LD context. Empty list is returned if
   * {@literal @context} is not set in current JSON-LD node.
   */
  ImmutableList<ValueType> getJsonLdContextList();

  /**
   * Returns the value of {@literal @id}. Null value means either
   * {@literal @id} value is null or current JSON-LD node doesn't contain
   * {@literal @id} value.
   */
  @Nullable
  String getJsonLdId() throws SchemaOrgException;

  /**
   * Returns the value of {@literal @reverse}. Empty multimap is returned if
   * {@literal @reverse} is not set in current JSON-LD node.
   */
  ImmutableMultimap<String, Thing> getJsonLdReverseMap();
}
