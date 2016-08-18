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
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link EntryPoint}. */
public class EntryPointImpl extends IntangibleImpl implements EntryPoint {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACTION_APPLICATION);

    builder.add(CoreConstants.PROPERTY_ACTION_PLATFORM);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_APPLICATION);

    builder.add(CoreConstants.PROPERTY_CONTENT_TYPE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_ENCODING_TYPE);

    builder.add(CoreConstants.PROPERTY_HTTP_METHOD);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_IN_LANGUAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_URL_TEMPLATE);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<EntryPoint.Builder>
      implements EntryPoint.Builder {

    @Override
    public EntryPoint.Builder addActionApplication(SoftwareApplication value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_APPLICATION, value);
    }

    @Override
    public EntryPoint.Builder addActionApplication(SoftwareApplication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_APPLICATION, value.build());
    }

    @Override
    public EntryPoint.Builder addActionApplication(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_APPLICATION, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addActionPlatform(Text value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_PLATFORM, value);
    }

    @Override
    public EntryPoint.Builder addActionPlatform(URL value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_PLATFORM, value);
    }

    @Override
    public EntryPoint.Builder addActionPlatform(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_PLATFORM, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public EntryPoint.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public EntryPoint.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addApplication(SoftwareApplication value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION, value);
    }

    @Override
    public EntryPoint.Builder addApplication(SoftwareApplication.Builder value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION, value.build());
    }

    @Override
    public EntryPoint.Builder addApplication(String value) {
      return addProperty(CoreConstants.PROPERTY_APPLICATION, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addContentType(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_TYPE, value);
    }

    @Override
    public EntryPoint.Builder addContentType(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTENT_TYPE, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public EntryPoint.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addEncodingType(Text value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING_TYPE, value);
    }

    @Override
    public EntryPoint.Builder addEncodingType(String value) {
      return addProperty(CoreConstants.PROPERTY_ENCODING_TYPE, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addHttpMethod(Text value) {
      return addProperty(CoreConstants.PROPERTY_HTTP_METHOD, value);
    }

    @Override
    public EntryPoint.Builder addHttpMethod(String value) {
      return addProperty(CoreConstants.PROPERTY_HTTP_METHOD, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public EntryPoint.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public EntryPoint.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public EntryPoint.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addInLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public EntryPoint.Builder addInLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value.build());
    }

    @Override
    public EntryPoint.Builder addInLanguage(Text value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, value);
    }

    @Override
    public EntryPoint.Builder addInLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_IN_LANGUAGE, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public EntryPoint.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public EntryPoint.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public EntryPoint.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public EntryPoint.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public EntryPoint.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public EntryPoint.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public EntryPoint.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public EntryPoint.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addUrlTemplate(Text value) {
      return addProperty(CoreConstants.PROPERTY_URL_TEMPLATE, value);
    }

    @Override
    public EntryPoint.Builder addUrlTemplate(String value) {
      return addProperty(CoreConstants.PROPERTY_URL_TEMPLATE, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public EntryPoint.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public EntryPoint.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public EntryPoint.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public EntryPoint.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public EntryPoint.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public EntryPoint build() {
      return new EntryPointImpl(properties, reverseMap);
    }
  }

  public EntryPointImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_ENTRY_POINT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getActionApplicationList() {
    return getProperty(CoreConstants.PROPERTY_ACTION_APPLICATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getActionPlatformList() {
    return getProperty(CoreConstants.PROPERTY_ACTION_PLATFORM);
  }

  @Override
  public ImmutableList<SchemaOrgType> getApplicationList() {
    return getProperty(CoreConstants.PROPERTY_APPLICATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getContentTypeList() {
    return getProperty(CoreConstants.PROPERTY_CONTENT_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEncodingTypeList() {
    return getProperty(CoreConstants.PROPERTY_ENCODING_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHttpMethodList() {
    return getProperty(CoreConstants.PROPERTY_HTTP_METHOD);
  }

  @Override
  public ImmutableList<SchemaOrgType> getInLanguageList() {
    return getProperty(CoreConstants.PROPERTY_IN_LANGUAGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUrlTemplateList() {
    return getProperty(CoreConstants.PROPERTY_URL_TEMPLATE);
  }
}
