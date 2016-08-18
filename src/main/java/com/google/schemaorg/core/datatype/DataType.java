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

package com.google.schemaorg.core.datatype;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.CoreConstants;
import java.util.Objects;

/** Represents <a href="http://schema.org/DataType">http://schema.org/DataType</a>. */
public abstract class DataType implements SchemaOrgType {
  private final String value;

  DataType(String value) {
    this.value = Preconditions.checkNotNull(value, "value is null");
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean contentEquals(ValueType o) {
    return this.equals(o);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.NAMESPACE + "DataType";
  }

  @Override
  public boolean includesProperty(String property) {
    return false;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DataType) {
      DataType that = (DataType) o;
      return this.getClass() == o.getClass() && this.value.equals(that.getValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, getClass());
  }

  @Override
  public ImmutableList<SchemaOrgType> getProperty(String name) {
    return ImmutableList.of();
  }
}
