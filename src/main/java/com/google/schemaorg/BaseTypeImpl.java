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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import javax.annotation.Nullable;

/** Superclass to be extended by any concrete {@code ValueType}. */
abstract class BaseTypeImpl implements ValueType {
  protected final ImmutableListMultimap<String, ValueType> properties;

  abstract static class BuilderImpl<T extends ValueType.Builder> implements ValueType.Builder {
    protected final Multimap<String, ValueType> properties;

    BuilderImpl() {
      properties = LinkedListMultimap.create();
    }

    protected T addPropertyValue(String name, @Nullable ValueType value) {
      Preconditions.checkNotNull(name, "property name is null");
      properties.put(name, value == null ? NullValue.VALUE : value);
      return (T) this;
    }

    protected T setSingleValueProperty(String name, @Nullable ValueType value) {
      Preconditions.checkNotNull(name, "property name is null");
      properties.removeAll(name);
      properties.put(name, value == null ? NullValue.VALUE : value);
      return (T) this;
    }
  }

  BaseTypeImpl(Multimap<String, ValueType> properties) {
    this.properties = ImmutableListMultimap.copyOf(properties);
  }

  protected boolean containsProperty(String name) {
    return properties.containsKey(name);
  }

  @Nullable
  protected ValueType getSingleValueProperty(String name) throws SchemaOrgException {
    List<ValueType> list = getPropertyList(name);
    if (list.size() == 0) {
      return null;
    }
    if (list.size() > 1) {
      throw new SchemaOrgException(
          String.format("Multiple value found in the single-value property %s", name));
    }
    ValueType res = list.get(0);
    return res == NullValue.VALUE ? null : res;
  }

  protected ImmutableList<ValueType> getPropertyList(String property) {
    return properties.get(property);
  }

  ImmutableListMultimap<String, ValueType> getAllProperties() {
    return properties;
  }
}
