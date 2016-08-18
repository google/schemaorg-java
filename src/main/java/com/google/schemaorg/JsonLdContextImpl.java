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

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import com.google.schemaorg.core.datatype.Text;
import javax.annotation.Nullable;

/** Implementation of interface {@code JsonLdContext}. */
final class JsonLdContextImpl extends BaseTypeImpl implements JsonLdContext {

  static final class BuilderImpl extends BaseTypeImpl.BuilderImpl<JsonLdContext.Builder>
      implements JsonLdContext.Builder {
    @Override
    public JsonLdContext.Builder setBase(@Nullable String value) {
      return setTerm(JsonLdConstants.BASE, value);
    }

    JsonLdContext.Builder setUrl(String url) {
      Preconditions.checkNotNull(url, "context url is null");
      return setTerm(JsonLdConstants.CONTEXT_URL, url);
    }

    private JsonLdContext.Builder setTerm(String term, @Nullable String value) {
      Preconditions.checkNotNull(term, "term is null");
      if (value == null) {
        return setSingleValueProperty(term, null);
      }
      return setSingleValueProperty(term, Text.of(value));
    }

    @Override
    public JsonLdContext build() {
      return new JsonLdContextImpl(properties);
    }
  }

  protected JsonLdContextImpl(Multimap<String, ValueType> properties) {
    super(properties);
  }

  @Override
  public boolean isUrl() {
    return containsTerm(JsonLdConstants.CONTEXT_URL);
  }

  @Override
  public boolean containsBase() {
    return containsTerm(JsonLdConstants.BASE);
  }

  private boolean containsTerm(String term) {
    return containsProperty(term);
  }

  @Override
  public String getUrl() throws SchemaOrgException {
    String url = getTerm(JsonLdConstants.CONTEXT_URL);
    if (url == null) {
      throw new SchemaOrgException("@context URL is NULL");
    }
    return url;
  }

  @Override
  @Nullable
  public String getBase() throws SchemaOrgException {
    return getTerm(JsonLdConstants.BASE);
  }

  @Nullable
  private String getTerm(String term) throws SchemaOrgException {
    ValueType value = getSingleValueProperty(term);
    if (value == null) {
      return null;
    }
    return ((Text) value).getValue();
  }

  @Override
  public boolean contentEquals(ValueType that) {
    if (that == this) {
      return true;
    }
    if (that instanceof JsonLdContextImpl) {
      return getAllProperties().equals(((JsonLdContextImpl) that).getAllProperties());
    }
    return false;
  }
}
