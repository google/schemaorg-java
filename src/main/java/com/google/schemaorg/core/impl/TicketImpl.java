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

/** Implementation of {@link Ticket}. */
public class TicketImpl extends IntangibleImpl implements Ticket {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DATE_ISSUED);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ISSUED_BY);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_PRICE_CURRENCY);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_TICKETED_SEAT);

    builder.add(CoreConstants.PROPERTY_TICKET_NUMBER);

    builder.add(CoreConstants.PROPERTY_TICKET_TOKEN);

    builder.add(CoreConstants.PROPERTY_TOTAL_PRICE);

    builder.add(CoreConstants.PROPERTY_UNDER_NAME);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<Ticket.Builder>
      implements Ticket.Builder {

    @Override
    public Ticket.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public Ticket.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public Ticket.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public Ticket.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public Ticket.Builder addDateIssued(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_DATE_ISSUED, value);
    }

    @Override
    public Ticket.Builder addDateIssued(String value) {
      return addProperty(CoreConstants.PROPERTY_DATE_ISSUED, Text.of(value));
    }

    @Override
    public Ticket.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public Ticket.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public Ticket.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Ticket.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public Ticket.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public Ticket.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public Ticket.Builder addIssuedBy(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_BY, value);
    }

    @Override
    public Ticket.Builder addIssuedBy(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_BY, value.build());
    }

    @Override
    public Ticket.Builder addIssuedBy(String value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_BY, Text.of(value));
    }

    @Override
    public Ticket.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Ticket.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public Ticket.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public Ticket.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public Ticket.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public Ticket.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public Ticket.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public Ticket.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public Ticket.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public Ticket.Builder addPriceCurrency(Text value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, value);
    }

    @Override
    public Ticket.Builder addPriceCurrency(String value) {
      return addProperty(CoreConstants.PROPERTY_PRICE_CURRENCY, Text.of(value));
    }

    @Override
    public Ticket.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public Ticket.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public Ticket.Builder addTicketedSeat(Seat value) {
      return addProperty(CoreConstants.PROPERTY_TICKETED_SEAT, value);
    }

    @Override
    public Ticket.Builder addTicketedSeat(Seat.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TICKETED_SEAT, value.build());
    }

    @Override
    public Ticket.Builder addTicketedSeat(String value) {
      return addProperty(CoreConstants.PROPERTY_TICKETED_SEAT, Text.of(value));
    }

    @Override
    public Ticket.Builder addTicketNumber(Text value) {
      return addProperty(CoreConstants.PROPERTY_TICKET_NUMBER, value);
    }

    @Override
    public Ticket.Builder addTicketNumber(String value) {
      return addProperty(CoreConstants.PROPERTY_TICKET_NUMBER, Text.of(value));
    }

    @Override
    public Ticket.Builder addTicketToken(Text value) {
      return addProperty(CoreConstants.PROPERTY_TICKET_TOKEN, value);
    }

    @Override
    public Ticket.Builder addTicketToken(URL value) {
      return addProperty(CoreConstants.PROPERTY_TICKET_TOKEN, value);
    }

    @Override
    public Ticket.Builder addTicketToken(String value) {
      return addProperty(CoreConstants.PROPERTY_TICKET_TOKEN, Text.of(value));
    }

    @Override
    public Ticket.Builder addTotalPrice(Number value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public Ticket.Builder addTotalPrice(PriceSpecification value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public Ticket.Builder addTotalPrice(PriceSpecification.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value.build());
    }

    @Override
    public Ticket.Builder addTotalPrice(Text value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, value);
    }

    @Override
    public Ticket.Builder addTotalPrice(String value) {
      return addProperty(CoreConstants.PROPERTY_TOTAL_PRICE, Text.of(value));
    }

    @Override
    public Ticket.Builder addUnderName(Organization value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value);
    }

    @Override
    public Ticket.Builder addUnderName(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value.build());
    }

    @Override
    public Ticket.Builder addUnderName(Person value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value);
    }

    @Override
    public Ticket.Builder addUnderName(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, value.build());
    }

    @Override
    public Ticket.Builder addUnderName(String value) {
      return addProperty(CoreConstants.PROPERTY_UNDER_NAME, Text.of(value));
    }

    @Override
    public Ticket.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public Ticket.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public Ticket.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public Ticket.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public Ticket.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public Ticket.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public Ticket.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public Ticket.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public Ticket build() {
      return new TicketImpl(properties, reverseMap);
    }
  }

  public TicketImpl(Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_TICKET;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }

  @Override
  public ImmutableList<SchemaOrgType> getDateIssuedList() {
    return getProperty(CoreConstants.PROPERTY_DATE_ISSUED);
  }

  @Override
  public ImmutableList<SchemaOrgType> getIssuedByList() {
    return getProperty(CoreConstants.PROPERTY_ISSUED_BY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getPriceCurrencyList() {
    return getProperty(CoreConstants.PROPERTY_PRICE_CURRENCY);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTicketedSeatList() {
    return getProperty(CoreConstants.PROPERTY_TICKETED_SEAT);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTicketNumberList() {
    return getProperty(CoreConstants.PROPERTY_TICKET_NUMBER);
  }

  @Override
  public ImmutableList<SchemaOrgType> getTicketTokenList() {
    return getProperty(CoreConstants.PROPERTY_TICKET_TOKEN);
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
