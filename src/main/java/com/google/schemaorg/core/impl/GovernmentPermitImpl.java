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

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.schemaorg.SchemaOrgTypeImpl;
import com.google.schemaorg.ValueType;
import com.google.schemaorg.core.datatype.Date;
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link GovernmentPermit}. */
public class GovernmentPermitImpl extends PermitImpl implements GovernmentPermit {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_ISSUED_BY);

    builder.add(CoreConstants.PROPERTY_ISSUED_THROUGH);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_PERMIT_AUDIENCE);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(CoreConstants.PROPERTY_VALID_FOR);

    builder.add(CoreConstants.PROPERTY_VALID_FROM);

    builder.add(CoreConstants.PROPERTY_VALID_IN);

    builder.add(CoreConstants.PROPERTY_VALID_UNTIL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<GovernmentPermit.Builder>
      implements GovernmentPermit.Builder {

    @Override
    public GovernmentPermit.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public GovernmentPermit.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public GovernmentPermit.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public GovernmentPermit.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public GovernmentPermit.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public GovernmentPermit.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public GovernmentPermit.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addIssuedBy(Organization value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_BY, value);
    }

    @Override
    public GovernmentPermit.Builder addIssuedBy(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_BY, value.build());
    }

    @Override
    public GovernmentPermit.Builder addIssuedBy(String value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_BY, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addIssuedThrough(Service value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_THROUGH, value);
    }

    @Override
    public GovernmentPermit.Builder addIssuedThrough(Service.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_THROUGH, value.build());
    }

    @Override
    public GovernmentPermit.Builder addIssuedThrough(String value) {
      return addProperty(CoreConstants.PROPERTY_ISSUED_THROUGH, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public GovernmentPermit.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public GovernmentPermit.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public GovernmentPermit.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public GovernmentPermit.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addPermitAudience(Audience value) {
      return addProperty(CoreConstants.PROPERTY_PERMIT_AUDIENCE, value);
    }

    @Override
    public GovernmentPermit.Builder addPermitAudience(Audience.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PERMIT_AUDIENCE, value.build());
    }

    @Override
    public GovernmentPermit.Builder addPermitAudience(String value) {
      return addProperty(CoreConstants.PROPERTY_PERMIT_AUDIENCE, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public GovernmentPermit.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public GovernmentPermit.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public GovernmentPermit.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public GovernmentPermit.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addValidFor(Duration value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FOR, value);
    }

    @Override
    public GovernmentPermit.Builder addValidFor(Duration.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FOR, value.build());
    }

    @Override
    public GovernmentPermit.Builder addValidFor(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FOR, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addValidFrom(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, value);
    }

    @Override
    public GovernmentPermit.Builder addValidFrom(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_FROM, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addValidIn(AdministrativeArea value) {
      return addProperty(CoreConstants.PROPERTY_VALID_IN, value);
    }

    @Override
    public GovernmentPermit.Builder addValidIn(AdministrativeArea.Builder value) {
      return addProperty(CoreConstants.PROPERTY_VALID_IN, value.build());
    }

    @Override
    public GovernmentPermit.Builder addValidIn(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_IN, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addValidUntil(Date value) {
      return addProperty(CoreConstants.PROPERTY_VALID_UNTIL, value);
    }

    @Override
    public GovernmentPermit.Builder addValidUntil(String value) {
      return addProperty(CoreConstants.PROPERTY_VALID_UNTIL, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public GovernmentPermit.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public GovernmentPermit.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public GovernmentPermit.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public GovernmentPermit.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public GovernmentPermit.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public GovernmentPermit build() {
      return new GovernmentPermitImpl(properties, reverseMap);
    }
  }

  public GovernmentPermitImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_GOVERNMENT_PERMIT;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
