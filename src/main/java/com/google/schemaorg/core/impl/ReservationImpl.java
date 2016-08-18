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
import com.google.schemaorg.core.datatype.Number;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link Reservation}. */
public class ReservationImpl extends IntangibleImpl implements Reservation {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_BOOKING_AGENT);

    builder.add(CoreConstants.PROPERTY_BOOKING_TIME);

    builder.add(CoreConstants.PROPERTY_BROKER);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_MODIFIED_TIME);

    builder.add(CoreConstants.PROPERTY_NAME);

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

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Reservation.Builder>
      implements Reservation.Builder {

    @Override
    public Reservation.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Reservation.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Reservation.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Reservation.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Reservation.Builder addBookingAgent(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value);
    }

    @Override
    public Reservation.Builder addBookingAgent(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value.build());
    }

    @Override
    public Reservation.Builder addBookingAgent(Person value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value);
    }

    @Override
    public Reservation.Builder addBookingAgent(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, value.build());
    }

    @Override
    public Reservation.Builder addBookingAgent(String value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_AGENT, Text.of(value));
    }

    @Override
    public Reservation.Builder addBookingTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_TIME, value);
    }

    @Override
    public Reservation.Builder addBookingTime(String value) {
      return addProperty(CoreConstants.PROPERTY_BOOKING_TIME, Text.of(value));
    }

    @Override
    public Reservation.Builder addBroker(Organization value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public Reservation.Builder addBroker(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public Reservation.Builder addBroker(Person value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value);
    }

    @Override
    public Reservation.Builder addBroker(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, value.build());
    }

    @Override
    public Reservation.Builder addBroker(String value) {
      return addProperty(CoreConstants.PROPERTY_BROKER, Text.of(value));
    }

    @Override
    public Reservation.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Reservation.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Reservation.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Reservation.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Reservation.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Reservation.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Reservation.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Reservation.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Reservation.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Reservation.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Reservation.Builder addModifiedTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_MODIFIED_TIME, value);
    }

    @Override
    public Reservation.Builder addModifiedTime(String value) {
      return addProperty(CoreConstants.PROPERTY_MODIFIED_TIME, Text.of(value));
    }

    @Override
    public Reservation.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Reservation.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Reservation.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Reservation.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Reservation.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Reservation.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public Reservation.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public Reservation.Builder addProgramMembershipUsed(ProgramMembership value) {
      return addProperty(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED, value);
    }

    @Override
    public Reservation.Builder addProgramMembershipUsed(ProgramMembership.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED, value.build());
    }

    @Override
    public Reservation.Builder addProgramMembershipUsed(String value) {
      return addProperty(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED, Text.of(value));
    }

    @Override
    public Reservation.Builder addProvider(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public Reservation.Builder addProvider(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public Reservation.Builder addProvider(Person value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value);
    }

    @Override
    public Reservation.Builder addProvider(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, value.build());
    }

    @Override
    public Reservation.Builder addProvider(String value) {
      return addProperty(CoreConstants.PROPERTY_PROVIDER, Text.of(value));
    }

    @Override
    public Reservation.Builder addReservationFor(Thing value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_FOR, value);
    }

    @Override
    public Reservation.Builder addReservationFor(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_FOR, value.build());
    }

    @Override
    public Reservation.Builder addReservationFor(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_FOR, Text.of(value));
    }

    @Override
    public Reservation.Builder addReservationId(Text value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_ID, value);
    }

    @Override
    public Reservation.Builder addReservationId(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_ID, Text.of(value));
    }

    @Override
    public Reservation.Builder addReservationStatus(ReservationStatusType value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_STATUS, value);
    }

    @Override
    public Reservation.Builder addReservationStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVATION_STATUS, Text.of(value));
    }

    @Override
    public Reservation.Builder addReservedTicket(Ticket value) {
      return addProperty(CoreConstants.PROPERTY_RESERVED_TICKET, value);
    }

    @Override
    public Reservation.Builder addReservedTicket(Ticket.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RESERVED_TICKET, value.build());
    }

    @Override
    public Reservation.Builder addReservedTicket(String value) {
      return addProperty(CoreConstants.PROPERTY_RESERVED_TICKET, Text.of(value));
    }

    @Override
    public Reservation.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Reservation.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Reservation.Builder addTotalPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public Reservation.Builder addTotalPrice(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public Reservation.Builder addTotalPrice(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value.build());
    }

    @Override
    public Reservation.Builder addTotalPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public Reservation.Builder addTotalPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, Text.of(value));
    }

    @Override
    public Reservation.Builder addUnderName(Organization value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value);
    }

    @Override
    public Reservation.Builder addUnderName(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value.build());
    }

    @Override
    public Reservation.Builder addUnderName(Person value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value);
    }

    @Override
    public Reservation.Builder addUnderName(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value.build());
    }

    @Override
    public Reservation.Builder addUnderName(String value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, Text.of(value));
    }

    @Override
    public Reservation.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Reservation.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Reservation.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Reservation.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Reservation.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Reservation.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Reservation.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Reservation.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Reservation build() {
      return new ReservationImpl(properties, reverseMap);
    }
  }

  public ReservationImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_RESERVATION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBookingAgentList() {
    return getProperty(CoreConstants.PROPERTY_BOOKING_AGENT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBookingTimeList() {
    return getProperty(CoreConstants.PROPERTY_BOOKING_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getBrokerList() {
    return getProperty(CoreConstants.PROPERTY_BROKER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getModifiedTimeList() {
    return getProperty(CoreConstants.PROPERTY_MODIFIED_TIME);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPriceCurrencyList() {
    return getProperty(CoreConstants.PROPERTY_PRICE_CURRENCY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProgramMembershipUsedList() {
    return getProperty(CoreConstants.PROPERTY_PROGRAM_MEMBERSHIP_USED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getProviderList() {
    return getProperty(CoreConstants.PROPERTY_PROVIDER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReservationForList() {
    return getProperty(CoreConstants.PROPERTY_RESERVATION_FOR);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReservationIdList() {
    return getProperty(CoreConstants.PROPERTY_RESERVATION_ID);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReservationStatusList() {
    return getProperty(CoreConstants.PROPERTY_RESERVATION_STATUS);
  }

  @Override
  public ImmutableList<SchemaOrgType> getReservedTicketList() {
    return getProperty(CoreConstants.PROPERTY_RESERVED_TICKET);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTotalPriceList() {
    return getProperty(CoreConstants.PROPERTY_TOTAL_PRICE);
  }

  @Override
  public ImmutableList<SchemaOrgType> getUnderNameList() {
    return getProperty(CoreConstants.PROPERTY_UNDER_NAME);
  }
}
