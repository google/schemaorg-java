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

/** Implementation of {@link PostalAddress}. */
public class PostalAddressImpl extends ContactPointImpl implements PostalAddress {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ADDRESS_COUNTRY);

    builder.add(CoreConstants.PROPERTY_ADDRESS_LOCALITY);

    builder.add(CoreConstants.PROPERTY_ADDRESS_REGION);

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

    builder.add(CoreConstants.PROPERTY_POSTAL_CODE);

    builder.add(CoreConstants.PROPERTY_POST_OFFICE_BOX_NUMBER);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRODUCT_SUPPORTED);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SERVICE_AREA);

    builder.add(CoreConstants.PROPERTY_STREET_ADDRESS);

    builder.add(CoreConstants.PROPERTY_TELEPHONE);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<PostalAddress.Builder>
      implements PostalAddress.Builder {

    @Override
    public PostalAddress.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public PostalAddress.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addAddressCountry(Country value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value);
    }

    @Override
    public PostalAddress.Builder addAddressCountry(Country.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value.build());
    }

    @Override
    public PostalAddress.Builder addAddressCountry(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, value);
    }

    @Override
    public PostalAddress.Builder addAddressCountry(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addAddressLocality(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_LOCALITY, value);
    }

    @Override
    public PostalAddress.Builder addAddressLocality(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_LOCALITY, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addAddressRegion(Text value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_REGION, value);
    }

    @Override
    public PostalAddress.Builder addAddressRegion(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDRESS_REGION, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public PostalAddress.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addAreaServed(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public PostalAddress.Builder addAreaServed(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public PostalAddress.Builder addAreaServed(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public PostalAddress.Builder addAreaServed(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public PostalAddress.Builder addAreaServed(Place value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public PostalAddress.Builder addAreaServed(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value.build());
    }

    @Override
    public PostalAddress.Builder addAreaServed(Text value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, value);
    }

    @Override
    public PostalAddress.Builder addAreaServed(String value) {
      return addProperty(CoreConstants.PROPERTY_AREA_SERVED, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addAvailableLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, value);
    }

    @Override
    public PostalAddress.Builder addAvailableLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, value.build());
    }

    @Override
    public PostalAddress.Builder addAvailableLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addContactOption(ContactPointOption value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_OPTION, value);
    }

    @Override
    public PostalAddress.Builder addContactOption(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_OPTION, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addContactType(Text value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_TYPE, value);
    }

    @Override
    public PostalAddress.Builder addContactType(String value) {
      return addProperty(CoreConstants.PROPERTY_CONTACT_TYPE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public PostalAddress.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addEmail(Text value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, value);
    }

    @Override
    public PostalAddress.Builder addEmail(String value) {
      return addProperty(CoreConstants.PROPERTY_EMAIL, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addFaxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, value);
    }

    @Override
    public PostalAddress.Builder addFaxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_FAX_NUMBER, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addHoursAvailable(OpeningHoursSpecification value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, value);
    }

    @Override
    public PostalAddress.Builder addHoursAvailable(OpeningHoursSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, value.build());
    }

    @Override
    public PostalAddress.Builder addHoursAvailable(String value) {
      return addProperty(CoreConstants.PROPERTY_HOURS_AVAILABLE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PostalAddress.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public PostalAddress.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public PostalAddress.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PostalAddress.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public PostalAddress.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public PostalAddress.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public PostalAddress.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addPostalCode(Text value) {
      return addProperty(CoreConstants.PROPERTY_POSTAL_CODE, value);
    }

    @Override
    public PostalAddress.Builder addPostalCode(String value) {
      return addProperty(CoreConstants.PROPERTY_POSTAL_CODE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addPostOfficeBoxNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_POST_OFFICE_BOX_NUMBER, value);
    }

    @Override
    public PostalAddress.Builder addPostOfficeBoxNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_POST_OFFICE_BOX_NUMBER, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public PostalAddress.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public PostalAddress.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addProductSupported(Product value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, value);
    }

    @Override
    public PostalAddress.Builder addProductSupported(Product.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, value.build());
    }

    @Override
    public PostalAddress.Builder addProductSupported(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, value);
    }

    @Override
    public PostalAddress.Builder addProductSupported(String value) {
      return addProperty(CoreConstants.PROPERTY_PRODUCT_SUPPORTED, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public PostalAddress.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addServiceArea(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public PostalAddress.Builder addServiceArea(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public PostalAddress.Builder addServiceArea(GeoShape value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public PostalAddress.Builder addServiceArea(GeoShape.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public PostalAddress.Builder addServiceArea(Place value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value);
    }

    @Override
    public PostalAddress.Builder addServiceArea(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, value.build());
    }

    @Override
    public PostalAddress.Builder addServiceArea(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_AREA, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addStreetAddress(Text value) {
      return addProperty(CoreConstants.PROPERTY_STREET_ADDRESS, value);
    }

    @Override
    public PostalAddress.Builder addStreetAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_STREET_ADDRESS, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addTelephone(Text value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, value);
    }

    @Override
    public PostalAddress.Builder addTelephone(String value) {
      return addProperty(CoreConstants.PROPERTY_TELEPHONE, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public PostalAddress.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public PostalAddress.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public PostalAddress.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public PostalAddress.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public PostalAddress.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public PostalAddress.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public PostalAddress build() {
      return new PostalAddressImpl(properties, reverseMap);
    }
  }

  public PostalAddressImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_POSTAL_ADDRESS;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAddressCountryList() {
    return getProperty(CoreConstants.PROPERTY_ADDRESS_COUNTRY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAddressLocalityList() {
    return getProperty(CoreConstants.PROPERTY_ADDRESS_LOCALITY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAddressRegionList() {
    return getProperty(CoreConstants.PROPERTY_ADDRESS_REGION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPostalCodeList() {
    return getProperty(CoreConstants.PROPERTY_POSTAL_CODE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPostOfficeBoxNumberList() {
    return getProperty(CoreConstants.PROPERTY_POST_OFFICE_BOX_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getStreetAddressList() {
    return getProperty(CoreConstants.PROPERTY_STREET_ADDRESS);
  }
}
