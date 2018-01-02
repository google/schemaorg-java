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
 * href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>.
 */
public interface QuantitativeValue extends StructuredValue {

  /**
   * Builder interface of <a
   * href="http://schema.org/QuantitativeValue">http://schema.org/QuantitativeValue</a>.
   */
  public interface Builder extends StructuredValue.Builder {

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

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(PropertyValue value);

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(PropertyValue.Builder value);

    /** Add a value to property additionalProperty. */
    Builder addAdditionalProperty(String value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(URL value);

    /** Add a value to property additionalType. */
    Builder addAdditionalType(String value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(Text value);

    /** Add a value to property alternateName. */
    Builder addAlternateName(String value);

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

    /** Add a value to property sameAs. */
    Builder addSameAs(URL value);

    /** Add a value to property sameAs. */
    Builder addSameAs(String value);

    /** Add a value to property unitCode. */
    Builder addUnitCode(Text value);

    /** Add a value to property unitCode. */
    Builder addUnitCode(URL value);

    /** Add a value to property unitCode. */
    Builder addUnitCode(String value);

    /** Add a value to property unitText. */
    Builder addUnitText(Text value);

    /** Add a value to property unitText. */
    Builder addUnitText(String value);

    /** Add a value to property url. */
    Builder addUrl(URL value);

    /** Add a value to property url. */
    Builder addUrl(String value);

    /** Add a value to property value. */
    Builder addValue(Boolean value);

    /** Add a value to property value. */
    Builder addValue(Number value);

    /** Add a value to property value. */
    Builder addValue(StructuredValue value);

    /** Add a value to property value. */
    Builder addValue(StructuredValue.Builder value);

    /** Add a value to property value. */
    Builder addValue(Text value);

    /** Add a value to property value. */
    Builder addValue(String value);

    /** Add a value to property valueReference. */
    Builder addValueReference(Enumeration value);

    /** Add a value to property valueReference. */
    Builder addValueReference(PropertyValue value);

    /** Add a value to property valueReference. */
    Builder addValueReference(PropertyValue.Builder value);

    /** Add a value to property valueReference. */
    Builder addValueReference(QualitativeValue value);

    /** Add a value to property valueReference. */
    Builder addValueReference(QuantitativeValue value);

    /** Add a value to property valueReference. */
    Builder addValueReference(QuantitativeValue.Builder value);

    /** Add a value to property valueReference. */
    Builder addValueReference(StructuredValue value);

    /** Add a value to property valueReference. */
    Builder addValueReference(StructuredValue.Builder value);

    /** Add a value to property valueReference. */
    Builder addValueReference(String value);

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

    /** Build a {@link QuantitativeValue} object. */
    QuantitativeValue build();
  }

  /**
   * Returns the value list of property additionalProperty. Empty list is returned if the property
   * not set in current object.
   */
  ImmutableList<SchemaOrgType> getAdditionalPropertyList();

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
   * Returns the value list of property unitCode. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getUnitCodeList();

  /**
   * Returns the value list of property unitText. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getUnitTextList();

  /**
   * Returns the value list of property value. Empty list is returned if the property not set in
   * current object.
   */
  ImmutableList<SchemaOrgType> getValueList();

  /**
   * Returns the value list of property valueReference. Empty list is returned if the property not
   * set in current object.
   */
  ImmutableList<SchemaOrgType> getValueReferenceList();
}
