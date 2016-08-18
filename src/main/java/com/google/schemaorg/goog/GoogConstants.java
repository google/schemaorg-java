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

package com.google.schemaorg.goog;

/** Constants of type and property names in http://schema.googleapis.com/. */
public final class GoogConstants {
  public static final String NAMESPACE = "http://schema.googleapis.com/";

  public static final String PROPERTY_APPLICABLE_KEYWORD_OR_GENRE =
      NAMESPACE + "applicableKeywordOrGenre";

  public static final String PROPERTY_DETAILED_DESCRIPTION = NAMESPACE + "detailedDescription";

  public static final String PROPERTY_POPULARITY_SCORE = NAMESPACE + "popularityScore";

  public static final String PROPERTY_RESULT_SCORE = NAMESPACE + "resultScore";

  public static final String TYPE_ENTITY_SEARCH_RESULT = NAMESPACE + "EntitySearchResult";

  public static final String TYPE_POPULARITY_SCORE_SPECIFICATION =
      NAMESPACE + "PopularityScoreSpecification";
}
