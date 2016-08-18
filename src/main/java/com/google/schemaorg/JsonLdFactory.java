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
 * Factory to create JSON-LD related objects.
 */
public final class JsonLdFactory {
  public static JsonLdContext.Builder newContextBuilder() {
    return new JsonLdContextImpl.BuilderImpl();
  }

  static JsonLdContext newContextUrl(String url) {
    return new JsonLdContextImpl.BuilderImpl().setUrl(url).build();
  }
}
