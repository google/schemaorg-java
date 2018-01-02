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
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/**
 * Interface of <a
 * href="http://schema.org/PropertyValueSpecification">http://schema.org/PropertyValueSpecification</a>.
 */
public interface PropertyValueSpecification extends Intangible {

  /**
   * Builder interface of <a
   * href="http://schema.org/PropertyValueSpecification">http://schema.org/PropertyValueSpecification</a>.
   */
  public interface Builder extends Intangible.Builder {

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

    @Override
    Builder setJsonLdId(@Nullable String value);

    @Override
    Builder setJsonLdReverse(String property, Thing obj);

    @Override
    Builder setJsonLdReverse(String property, Thing.Builder builder);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

    /** Add a value to property defaultValue. */
    Builder addDefaultValue(Text value);

    /** Add a value to property defaultValue. */
    Builder addDefaultValue(Thing value);

    /** Add a value to property defaultValue. */
    Builder addDefaultValue(Thing.Builder value);

    /** Add a value to property defaultValue. */
    Builder addDefaultValue(String value);

    /** Add a value to property description. */
    Builder addDescription(Text value);

    /** Add a value to property description. */
    Builder addDescription(String value);

    /** Add a value to property image. */
    Builder addImage(ImageObject value);

    /** Add a value to property image. */
    Builder addImage(ImageObject.Builder value);

    /** Add a value to property image. */
    Builder addImage(URL value);

    /** Add a value to property image. */
    Builder addImage(String value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(CreativeWork.Builder value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(URL value);

    /** Add a value to property mainEntityOfPage. */
    Builder addMainEntityOfPage(String value);

    /** Add a value to property maxValue. */
    Builder addMaxValue(Number value);

    /** Add a value to property maxValue. */
    Builder addMaxValue(String value);

    /** Add a value to property minValue. */
    Builder addMinValue(Number value);

    /** Add a value to property minValue. */
    Builder addMinValue(String value);

    /** Add a value to property multipleValues. */
    Builder addMultipleValues(Boolean value);

    /** Add a value to property multipleValues. */
    Builder addMultipleValues(String value);

    /** Add a value to property name. */
    Builder addName(Text value);

    /** Add a value to property name. */
    Builder addName(String value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(Action.Builder value);

    /** Add a value to property potentialAction. */
    Builder addPotentialAction(String value);

    /** Add a value to property readonlyValue. */
    Builder addReadonlyValue(Boolean value);

    /** Add a value to property readonlyValue. */
    Builder addReadonlyValue(String value);

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property stepValue. */
    Builder addStepValue(Number value);

    /** Add a value to property stepValue. */
    Builder addStepValue(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property valueMaxLength. */
    Builder addValueMaxLength(Number value);

    /** Add a value to property valueMaxLength. */
    Builder addValueMaxLength(String value);

    /** Add a value to property valueMinLength. */
    Builder addValueMinLength(Number value);

    /** Add a value to property valueMinLength. */
    Builder addValueMinLength(String value);

    /** Add a value to property valueName. */
    Builder addValueName(Text value);

    /** Add a value to property valueName. */
    Builder addValueName(String value);

    /** Add a value to property valuePattern. */
    Builder addValuePattern(Text value);

    /** Add a value to property valuePattern. */
    Builder addValuePattern(String value);

    /** Add a value to property valueRequired. */
    Builder addValueRequired(Boolean value);

    /** Add a value to property valueRequired. */
    Builder addValueRequired(String value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(Article.Builder value);

    /** Add a value to property detailedDescription. */
    Builder addDetailedDescription(String value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(PopularityScoreSpecification.Builder value);

    /** Add a value to property popularityScore. */
    Builder addPopularityScore(String value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The value of the property.
     */
    Builder addProperty(String name, SchemaOrgType value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param builder The schema.org object builder for the property value.
     */
    Builder addProperty(String name, Thing.Builder builder);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The string value of the property.
     */
    Builder addProperty(String name, String value);

    /** Build a {@link PropertyValueSpecification} object. */
    PropertyValueSpecification build();
  }

  /**
   * Returns the value list of property defaultValue. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getDefaultValueList();

  /**
   * Returns the value list of property maxValue. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getMaxValueList();

  /**
   * Returns the value list of property minValue. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getMinValueList();

  /**
   * Returns the value list of property multipleValues. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getMultipleValuesList();

  /**
   * Returns the value list of property readonlyValue. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getReadonlyValueList();

  /**
   * Returns the value list of property stepValue. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getStepValueList();

  /**
   * Returns the value list of property valueMaxLength. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getValueMaxLengthList();

  /**
   * Returns the value list of property valueMinLength. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getValueMinLengthList();

  /**
   * Returns the value list of property valueName. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getValueNameList();

  /**
   * Returns the value list of property valuePattern. Empty list is returned if the property not set
   * in current object.
   */
  ImmutableList<SchemaOrgType> getValuePatternList();

  /**
   * Returns the value list of property valueRequired. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getValueRequiredList();
}
