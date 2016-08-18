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
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link EmployeeRole}. */
public class EmployeeRoleImpl extends OrganizationRoleImpl implements EmployeeRole {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BASE_SALARY);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_END_DATE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NAMED_POSITION);

    builder.add(CoreConstants.PROPERTY_NUMBERED_POSITION);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_ROLE_NAME);

    builder.add(CoreConstants.PROPERTY_SALARY_CURRENCY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_START_DATE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<EmployeeRole.Builder>
      implements EmployeeRole.Builder {

    @Override
    public EmployeeRole.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public EmployeeRole.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public EmployeeRole.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addBaseSalary(Number value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, value);
    }

    @Override
    public EmployeeRole.Builder addBaseSalary(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, value);
    }

    @Override
    public EmployeeRole.Builder addBaseSalary(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, value.build());
    }

    @Override
    public EmployeeRole.Builder addBaseSalary(String value) {
      return addProperty(CoreConstants.PROPERTY_BASE_SALARY, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public EmployeeRole.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addEndDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_END_DATE, value);
    }

    @Override
    public EmployeeRole.Builder addEndDate(String value) {
      return addProperty(CoreConstants.PROPERTY_END_DATE, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public EmployeeRole.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public EmployeeRole.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public EmployeeRole.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public EmployeeRole.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public EmployeeRole.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public EmployeeRole.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public EmployeeRole.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addNamedPosition(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAMED_POSITION, value);
    }

    @Override
    public EmployeeRole.Builder addNamedPosition(URL value) {
      return addProperty(CoreConstants.PROPERTY_NAMED_POSITION, value);
    }

    @Override
    public EmployeeRole.Builder addNamedPosition(String value) {
      return addProperty(CoreConstants.PROPERTY_NAMED_POSITION, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addNumberedPosition(Number value) {
      return addProperty(CoreConstants.PROPERTY_NUMBERED_POSITION, value);
    }

    @Override
    public EmployeeRole.Builder addNumberedPosition(String value) {
      return addProperty(CoreConstants.PROPERTY_NUMBERED_POSITION, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public EmployeeRole.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public EmployeeRole.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addRoleName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ROLE_NAME, value);
    }

    @Override
    public EmployeeRole.Builder addRoleName(URL value) {
      return addProperty(CoreConstants.PROPERTY_ROLE_NAME, value);
    }

    @Override
    public EmployeeRole.Builder addRoleName(String value) {
      return addProperty(CoreConstants.PROPERTY_ROLE_NAME, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addSalaryCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_SALARY_CURRENCY, value);
    }

    @Override
    public EmployeeRole.Builder addSalaryCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_SALARY_CURRENCY, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public EmployeeRole.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addStartDate(Date value) {
      return addProperty(CoreConstants.PROPERTY_START_DATE, value);
    }

    @Override
    public EmployeeRole.Builder addStartDate(String value) {
      return addProperty(CoreConstants.PROPERTY_START_DATE, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public EmployeeRole.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public EmployeeRole.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public EmployeeRole.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public EmployeeRole.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public EmployeeRole.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public EmployeeRole.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public EmployeeRole build() {
      return new EmployeeRoleImpl(properties, reverseMap);
    }
  }

  public EmployeeRoleImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_EMPLOYEE_ROLE;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBaseSalaryList() {
    return getProperty(CoreConstants.PROPERTY_BASE_SALARY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getSalaryCurrencyList() {
    return getProperty(CoreConstants.PROPERTY_SALARY_CURRENCY);
  }
}
