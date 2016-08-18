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

import javax.annotation.Nullable;

/**
 * Interface of JSON-LD context.
 */
public interface JsonLdContext extends ValueType {

  /**
   * Builder interface of JSON-LD context.
   */
  public static interface Builder extends ValueType.Builder {

    /**
     * Set the value of {@literal @base} in current JSON-LD context.
     */
    Builder setBase(@Nullable String value);

    /**
     * Build a {@link JsonLdContext} object.
     */
    JsonLdContext build();
  }

  /**
   * Whether current JSON-LD context is a URL.
   */
  boolean isUrl();

  /**
   * Whether current JSON-LD context contains {@literal @base} value.
   */
  boolean containsBase();

  /**
   * Returns the URL in current JSON-LD context.
   */
  String getUrl() throws SchemaOrgException;

  /**
   * Returns the value of {@literal @base}. Null value means either
   * {@literal @base} value is null or current JSON-LD node doesn't contain
   * {@literal @base} value.
   */
  @Nullable
  String getBase() throws SchemaOrgException;
}
