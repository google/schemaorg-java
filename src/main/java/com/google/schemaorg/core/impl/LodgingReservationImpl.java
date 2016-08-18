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
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Integer;
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link LodgingReservation}. */
public class LodgingReservationImpl extends ReservationImpl implements LodgingReservation {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BOOKING_AGENT);

    builder.add(CoreConstants.PROPERTY_BOOKING_TIME);

    builder.add(CoreConstants.PROPERTY_BROKER);

    builder.add(CoreConstants.PROPERTY_CHECKIN_TIME);

    builder.add(CoreConstants.PROPERTY_CHECKOUT_TIME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_LODGING_UNIT_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_LODGING_UNIT_TYPE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MODIFIED_TIME);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_NUM_ADULTS);

    builder.add(CoreConstants.PROPERTY_NUM_CHILDREN);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRICE_CURRENCY);

    builder.add(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED);

    builder.add(CoreConstants.PROPERTY_PROVIDER);

    builder.add(CoreConstants.PROPERTY_RESERVATION_FOR);

    builder.add(CoreConstants.PROPERTY_RESERVATION_ID);

    builder.add(CoreConstants.PROPERTY_RESERVATION_STATUS);

    builder.add(CoreConstants.PROPERTY_RESERVED_TICKET);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_TOTAL_PRICE);

    builder.add(CoreConstants.PROPERTY_UNDER_NAME);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<LodgingReservation.Builder>
      implements LodgingReservation.Builder {

    @Override
    public LodgingReservation.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public LodgingReservation.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public LodgingReservation.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addBookingAgent(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value);
    }

    @Override
    public LodgingReservation.Builder addBookingAgent(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value.build());
    }

    @Override
    public LodgingReservation.Builder addBookingAgent(Person value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value);
    }

    @Override
    public LodgingReservation.Builder addBookingAgent(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value.build());
    }

    @Override
    public LodgingReservation.Builder addBookingAgent(String value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addBookingTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_TIME, value);
    }

    @Override
    public LodgingReservation.Builder addBookingTime(String value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_TIME, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addBroker(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public LodgingReservation.Builder addBroker(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public LodgingReservation.Builder addBroker(Person value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public LodgingReservation.Builder addBroker(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public LodgingReservation.Builder addBroker(String value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addCheckinTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_CHECKIN_TIME, value);
    }

    @Override
    public LodgingReservation.Builder addCheckinTime(String value) {
      return addProperty(CoreConstants.PROPERTY_CHECKIN_TIME, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addCheckoutTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_CHECKOUT_TIME, value);
    }

    @Override
    public LodgingReservation.Builder addCheckoutTime(String value) {
      return addProperty(CoreConstants.PROPERTY_CHECKOUT_TIME, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public LodgingReservation.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public LodgingReservation.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public LodgingReservation.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public LodgingReservation.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addLodgingUnitDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_LODGING_UNIT_DESCRIPTION, value);
    }

    @Override
    public LodgingReservation.Builder addLodgingUnitDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_LODGING_UNIT_DESCRIPTION, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addLodgingUnitType(QualitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_LODGING_UNIT_TYPE, value);
    }

    @Override
    public LodgingReservation.Builder addLodgingUnitType(Text value) {
      return addProperty(CoreConstants.PROPERTY_LODGING_UNIT_TYPE, value);
    }

    @Override
    public LodgingReservation.Builder addLodgingUnitType(String value) {
      return addProperty(CoreConstants.PROPERTY_LODGING_UNIT_TYPE, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public LodgingReservation.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public LodgingReservation.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public LodgingReservation.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addModifiedTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_MODIFIED_TIME, value);
    }

    @Override
    public LodgingReservation.Builder addModifiedTime(String value) {
      return addProperty(CoreConstants.PROPERTY_MODIFIED_TIME, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public LodgingReservation.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addNumAdults(Integer value) {
      return addProperty(CoreConstants.PROPERTY_NUM_ADULTS, value);
    }

    @Override
    public LodgingReservation.Builder addNumAdults(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUM_ADULTS, value);
    }

    @Override
    public LodgingReservation.Builder addNumAdults(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUM_ADULTS, value.build());
    }

    @Override
    public LodgingReservation.Builder addNumAdults(String value) {
      return addProperty(CoreConstants.PROPERTY_NUM_ADULTS, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addNumChildren(Integer value) {
      return addProperty(CoreConstants.PROPERTY_NUM_CHILDREN, value);
    }

    @Override
    public LodgingReservation.Builder addNumChildren(QuantitativeValue value) {
      return addProperty(CoreConstants.PROPERTY_NUM_CHILDREN, value);
    }

    @Override
    public LodgingReservation.Builder addNumChildren(QuantitativeValue.Builder value) {
      return addProperty(CoreConstants.PROPERTY_NUM_CHILDREN, value.build());
    }

    @Override
    public LodgingReservation.Builder addNumChildren(String value) {
      return addProperty(CoreConstants.PROPERTY_NUM_CHILDREN, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public LodgingReservation.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public LodgingReservation.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public LodgingReservation.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addProgramMembershipUsed(ProgramMembership value) {
      return addProperty(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED, value);
    }

    @Override
    public LodgingReservation.Builder addProgramMembershipUsed(ProgramMembership.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED, value.build());
    }

    @Override
    public LodgingReservation.Builder addProgramMembershipUsed(String value) {
      return addProperty(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public LodgingReservation.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public LodgingReservation.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public LodgingReservation.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public LodgingReservation.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addReservationFor(Thing value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_FOR, value);
    }

    @Override
    public LodgingReservation.Builder addReservationFor(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_FOR, value.build());
    }

    @Override
    public LodgingReservation.Builder addReservationFor(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_FOR, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addReservationId(Text value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_ID, value);
    }

    @Override
    public LodgingReservation.Builder addReservationId(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_ID, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addReservationStatus(ReservationStatusType value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_STATUS, value);
    }

    @Override
    public LodgingReservation.Builder addReservationStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_STATUS, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addReservedTicket(Ticket value) {
      return addProperty(CoreConstants.PROPERTY_RESERVED_TICKET, value);
    }

    @Override
    public LodgingReservation.Builder addReservedTicket(Ticket.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RESERVED_TICKET, value.build());
    }

    @Override
    public LodgingReservation.Builder addReservedTicket(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVED_TICKET, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public LodgingReservation.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addTotalPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public LodgingReservation.Builder addTotalPrice(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public LodgingReservation.Builder addTotalPrice(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value.build());
    }

    @Override
    public LodgingReservation.Builder addTotalPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public LodgingReservation.Builder addTotalPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addUnderName(Organization value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value);
    }

    @Override
    public LodgingReservation.Builder addUnderName(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value.build());
    }

    @Override
    public LodgingReservation.Builder addUnderName(Person value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value);
    }

    @Override
    public LodgingReservation.Builder addUnderName(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value.build());
    }

    @Override
    public LodgingReservation.Builder addUnderName(String value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public LodgingReservation.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public LodgingReservation.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public LodgingReservation.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public LodgingReservation.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public LodgingReservation.Builder addPopularityScore(
        PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public LodgingReservation.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public LodgingReservation build() {
      return new LodgingReservationImpl(properties, reverseMap);
    }
  }

  public LodgingReservationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_LODGING_RESERVATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCheckinTimeList() {
    return getProperty(CoreConstants.PROPERTY_CHECKIN_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getCheckoutTimeList() {
    return getProperty(CoreConstants.PROPERTY_CHECKOUT_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLodgingUnitDescriptionList() {
    return getProperty(CoreConstants.PROPERTY_LODGING_UNIT_DESCRIPTION);
  }

  @Override
  public ImmutableList<SchemaOrgType> getLodgingUnitTypeList() {
    return getProperty(CoreConstants.PROPERTY_LODGING_UNIT_TYPE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumAdultsList() {
    return getProperty(CoreConstants.PROPERTY_NUM_ADULTS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getNumChildrenList() {
    return getProperty(CoreConstants.PROPERTY_NUM_CHILDREN);
  }
}
