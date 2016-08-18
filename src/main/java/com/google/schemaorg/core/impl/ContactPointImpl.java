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

/** Implementation of {@link ContactPoint}. */
public class ContactPointImpl extends StructuredValueImpl implements ContactPoint {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AREA_SERVED);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE);

    builder.add(CoreConstants.PROPERTY_CONTACT_OPTION);

    builder.add(CoreConstants.PROPERTY_CONTACT_TYPE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_EMAIL);

    builder.add(CoreConstants.PROPERTY_FAX_NUMBER);

    builder.add(CoreConstants.PROPERTY_HOURS_AVAILABLE);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRODUCT_SUPPORTED);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SERVICE_AREA);

    builder.add(CoreConstants.PROPERTY_TELEPHONE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<ContactPoint.Builder>
      implements ContactPoint.Builder {

    @Override
    public ContactPoint.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public ContactPoint.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public ContactPoint.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public ContactPoint.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public ContactPoint.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public ContactPoint.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public ContactPoint.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public ContactPoint.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public ContactPoint.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public ContactPoint.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addAvailableLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, value);
    }

    @Override
    public ContactPoint.Builder addAvailableLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, value.build());
    }

    @Override
    public ContactPoint.Builder addAvailableLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addContactOption(ContactPointOption value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_OPTION, value);
    }

    @Override
    public ContactPoint.Builder addContactOption(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_OPTION, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addContactType(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_TYPE, value);
    }

    @Override
    public ContactPoint.Builder addContactType(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_TYPE, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public ContactPoint.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addEmail(Text value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, value);
    }

    @Override
    public ContactPoint.Builder addEmail(String value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addFaxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, value);
    }

    @Override
    public ContactPoint.Builder addFaxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addHoursAvailable(OpeningHoursSpecification value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, value);
    }

    @Override
    public ContactPoint.Builder addHoursAvailable(OpeningHoursSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, value.build());
    }

    @Override
    public ContactPoint.Builder addHoursAvailable(String value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ContactPoint.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public ContactPoint.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ContactPoint.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ContactPoint.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public ContactPoint.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ContactPoint.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public ContactPoint.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public ContactPoint.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public ContactPoint.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addProductSupported(Product value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, value);
    }

    @Override
    public ContactPoint.Builder addProductSupported(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, value.build());
    }

    @Override
    public ContactPoint.Builder addProductSupported(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, value);
    }

    @Override
    public ContactPoint.Builder addProductSupported(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public ContactPoint.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addServiceArea(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public ContactPoint.Builder addServiceArea(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public ContactPoint.Builder addServiceArea(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public ContactPoint.Builder addServiceArea(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public ContactPoint.Builder addServiceArea(Place value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public ContactPoint.Builder addServiceArea(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public ContactPoint.Builder addServiceArea(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addTelephone(Text value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, value);
    }

    @Override
    public ContactPoint.Builder addTelephone(String value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public ContactPoint.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public ContactPoint.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public ContactPoint.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public ContactPoint.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public ContactPoint.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public ContactPoint.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public ContactPoint build() {
      return new ContactPointImpl(properties, reverseMap);
    }
  }

  public ContactPointImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_CONTACT_POINT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAreaServedList() {
    return getProperty(CoreConstants.PROPERTY_AREA_SERVED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailableLanguageList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getContactOptionList() {
    return getProperty(CoreConstants.PROPERTY_CONTACT_OPTION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getContactTypeList() {
    return getProperty(CoreConstants.PROPERTY_CONTACT_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getEmailList() {
    return getProperty(CoreConstants.PROPERTY_EMAIL);
  }

  @Override
  public ImmutableList<SchemaOrgType> getFaxNumberList() {
    return getProperty(CoreConstants.PROPERTY_FAX_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getHoursAvailableList() {
    return getProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProductSupportedList() {
    return getProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServiceAreaList() {
    return getProperty(CoreConstants.PROPERTY_SERVICE_AREA);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTelephoneList() {
    return getProperty(CoreConstants.PROPERTY_TELEPHONE);
  }
}
