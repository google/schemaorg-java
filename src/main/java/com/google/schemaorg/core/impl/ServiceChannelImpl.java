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

/** Implementation of {@link ServiceChannel}. */
public class ServiceChannelImpl extends IntangibleImpl implements ServiceChannel {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PROCESSING_TIME);

    builder.add(CoreConstants.PROPERTY_PROVIDES_SERVICE);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_SERVICE_LOCATION);

    builder.add(CoreConstants.PROPERTY_SERVICE_PHONE);

    builder.add(CoreConstants.PROPERTY_SERVICE_POSTAL_ADDRESS);

    builder.add(CoreConstants.PROPERTY_SERVICE_SMS_NUMBER);

    builder.add(CoreConstants.PROPERTY_SERVICE_URL);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<ServiceChannel.Builder>
      implements ServiceChannel.Builder {

    @Override
    public ServiceChannel.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public ServiceChannel.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public ServiceChannel.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addAvailableLanguage(Language value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, value);
    }

    @Override
    public ServiceChannel.Builder addAvailableLanguage(Language.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, value.build());
    }

    @Override
    public ServiceChannel.Builder addAvailableLanguage(String value) {
      return addProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public ServiceChannel.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ServiceChannel.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public ServiceChannel.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public ServiceChannel.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ServiceChannel.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public ServiceChannel.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public ServiceChannel.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public ServiceChannel.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public ServiceChannel.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public ServiceChannel.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addProcessingTime(Duration value) {
      return addProperty(CoreConstants.PROPERTY_PROCESSING_TIME, value);
    }

    @Override
    public ServiceChannel.Builder addProcessingTime(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROCESSING_TIME, value.build());
    }

    @Override
    public ServiceChannel.Builder addProcessingTime(String value) {
      return addProperty(CoreConstants.PROPERTY_PROCESSING_TIME, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addProvidesService(Service value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDES_SERVICE, value);
    }

    @Override
    public ServiceChannel.Builder addProvidesService(Service.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDES_SERVICE, value.build());
    }

    @Override
    public ServiceChannel.Builder addProvidesService(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDES_SERVICE, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public ServiceChannel.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addServiceLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_LOCATION, value);
    }

    @Override
    public ServiceChannel.Builder addServiceLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_LOCATION, value.build());
    }

    @Override
    public ServiceChannel.Builder addServiceLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_LOCATION, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addServicePhone(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_PHONE, value);
    }

    @Override
    public ServiceChannel.Builder addServicePhone(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_PHONE, value.build());
    }

    @Override
    public ServiceChannel.Builder addServicePhone(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_PHONE, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addServicePostalAddress(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_POSTAL_ADDRESS, value);
    }

    @Override
    public ServiceChannel.Builder addServicePostalAddress(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_POSTAL_ADDRESS, value.build());
    }

    @Override
    public ServiceChannel.Builder addServicePostalAddress(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_POSTAL_ADDRESS, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addServiceSmsNumber(ContactPoint value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_SMS_NUMBER, value);
    }

    @Override
    public ServiceChannel.Builder addServiceSmsNumber(ContactPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_SMS_NUMBER, value.build());
    }

    @Override
    public ServiceChannel.Builder addServiceSmsNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_SMS_NUMBER, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addServiceUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_URL, value);
    }

    @Override
    public ServiceChannel.Builder addServiceUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_SERVICE_URL, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public ServiceChannel.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public ServiceChannel.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public ServiceChannel.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public ServiceChannel.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public ServiceChannel.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public ServiceChannel.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public ServiceChannel build() {
      return new ServiceChannelImpl(properties, reverseMap);
    }
  }

  public ServiceChannelImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_SERVICE_CHANNEL;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getAvailableLanguageList() {
    return getProperty(CoreConstants.PROPERTY_AVAILABLE_LANGUAGE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProcessingTimeList() {
    return getProperty(CoreConstants.PROPERTY_PROCESSING_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProvidesServiceList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDES_SERVICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServiceLocationList() {
    return getProperty(CoreConstants.PROPERTY_SERVICE_LOCATION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServicePhoneList() {
    return getProperty(CoreConstants.PROPERTY_SERVICE_PHONE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServicePostalAddressList() {
    return getProperty(CoreConstants.PROPERTY_SERVICE_POSTAL_ADDRESS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServiceSmsNumberList() {
    return getProperty(CoreConstants.PROPERTY_SERVICE_SMS_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getServiceUrlList() {
    return getProperty(CoreConstants.PROPERTY_SERVICE_URL);
  }
}
