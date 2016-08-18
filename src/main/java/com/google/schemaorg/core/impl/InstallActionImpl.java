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
import com.google.schemaorg.core.datatype.DateTime;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.GoogConstants;
import com.google.schemaorg.goog.PopularityScoreSpecification;

/** Implementation of {@link InstallAction}. */
public class InstallActionImpl extends ConsumeActionImpl implements InstallAction {
  private static final ImmutableSet<String> PROPERTY_SET = initializePropertySet();

  private static ImmutableSet<String> initializePropertySet() {
    ImmutableSet.Builder<String> builder = ImmutableSet.builder();

    builder.add(CoreConstants.PROPERTY_ACTION_STATUS);

    builder.add(CoreConstants.PROPERTY_ADDITIONAL_TYPE);

    builder.add(CoreConstants.PROPERTY_AGENT);

    builder.add(CoreConstants.PROPERTY_ALTERNATE_NAME);

    builder.add(CoreConstants.PROPERTY_DESCRIPTION);

    builder.add(CoreConstants.PROPERTY_END_TIME);

    builder.add(CoreConstants.PROPERTY_ERROR);

    builder.add(CoreConstants.PROPERTY_EXPECTS_ACCEPTANCE_OF);

    builder.add(CoreConstants.PROPERTY_IMAGE);

    builder.add(CoreConstants.PROPERTY_INSTRUMENT);

    builder.add(CoreConstants.PROPERTY_LOCATION);

    builder.add(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE);

    builder.add(CoreConstants.PROPERTY_NAME);

    builder.add(CoreConstants.PROPERTY_OBJECT);

    builder.add(CoreConstants.PROPERTY_PARTICIPANT);

    builder.add(CoreConstants.PROPERTY_POTENTIAL_ACTION);

    builder.add(CoreConstants.PROPERTY_RESULT);

    builder.add(CoreConstants.PROPERTY_SAME_AS);

    builder.add(CoreConstants.PROPERTY_START_TIME);

    builder.add(CoreConstants.PROPERTY_TARGET);

    builder.add(CoreConstants.PROPERTY_URL);

    builder.add(GoogConstants.PROPERTY_DETAILED_DESCRIPTION);

    builder.add(GoogConstants.PROPERTY_POPULARITY_SCORE);

    return builder.build();
  }

  static final class BuilderImpl extends SchemaOrgTypeImpl.BuilderImpl<InstallAction.Builder>
      implements InstallAction.Builder {

    @Override
    public InstallAction.Builder addActionStatus(ActionStatusType value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_STATUS, value);
    }

    @Override
    public InstallAction.Builder addActionStatus(String value) {
      return addProperty(CoreConstants.PROPERTY_ACTION_STATUS, Text.of(value));
    }

    @Override
    public InstallAction.Builder addAdditionalType(URL value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, value);
    }

    @Override
    public InstallAction.Builder addAdditionalType(String value) {
      return addProperty(CoreConstants.PROPERTY_ADDITIONAL_TYPE, Text.of(value));
    }

    @Override
    public InstallAction.Builder addAgent(Organization value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value);
    }

    @Override
    public InstallAction.Builder addAgent(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value.build());
    }

    @Override
    public InstallAction.Builder addAgent(Person value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value);
    }

    @Override
    public InstallAction.Builder addAgent(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, value.build());
    }

    @Override
    public InstallAction.Builder addAgent(String value) {
      return addProperty(CoreConstants.PROPERTY_AGENT, Text.of(value));
    }

    @Override
    public InstallAction.Builder addAlternateName(Text value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, value);
    }

    @Override
    public InstallAction.Builder addAlternateName(String value) {
      return addProperty(CoreConstants.PROPERTY_ALTERNATE_NAME, Text.of(value));
    }

    @Override
    public InstallAction.Builder addDescription(Text value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, value);
    }

    @Override
    public InstallAction.Builder addDescription(String value) {
      return addProperty(CoreConstants.PROPERTY_DESCRIPTION, Text.of(value));
    }

    @Override
    public InstallAction.Builder addEndTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_END_TIME, value);
    }

    @Override
    public InstallAction.Builder addEndTime(String value) {
      return addProperty(CoreConstants.PROPERTY_END_TIME, Text.of(value));
    }

    @Override
    public InstallAction.Builder addError(Thing value) {
      return addProperty(CoreConstants.PROPERTY_ERROR, value);
    }

    @Override
    public InstallAction.Builder addError(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_ERROR, value.build());
    }

    @Override
    public InstallAction.Builder addError(String value) {
      return addProperty(CoreConstants.PROPERTY_ERROR, Text.of(value));
    }

    @Override
    public InstallAction.Builder addExpectsAcceptanceOf(Offer value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTS_ACCEPTANCE_OF, value);
    }

    @Override
    public InstallAction.Builder addExpectsAcceptanceOf(Offer.Builder value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTS_ACCEPTANCE_OF, value.build());
    }

    @Override
    public InstallAction.Builder addExpectsAcceptanceOf(String value) {
      return addProperty(CoreConstants.PROPERTY_EXPECTS_ACCEPTANCE_OF, Text.of(value));
    }

    @Override
    public InstallAction.Builder addImage(ImageObject value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public InstallAction.Builder addImage(ImageObject.Builder value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value.build());
    }

    @Override
    public InstallAction.Builder addImage(URL value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, value);
    }

    @Override
    public InstallAction.Builder addImage(String value) {
      return addProperty(CoreConstants.PROPERTY_IMAGE, Text.of(value));
    }

    @Override
    public InstallAction.Builder addInstrument(Thing value) {
      return addProperty(CoreConstants.PROPERTY_INSTRUMENT, value);
    }

    @Override
    public InstallAction.Builder addInstrument(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_INSTRUMENT, value.build());
    }

    @Override
    public InstallAction.Builder addInstrument(String value) {
      return addProperty(CoreConstants.PROPERTY_INSTRUMENT, Text.of(value));
    }

    @Override
    public InstallAction.Builder addLocation(Place value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public InstallAction.Builder addLocation(Place.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public InstallAction.Builder addLocation(PostalAddress value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public InstallAction.Builder addLocation(PostalAddress.Builder value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value.build());
    }

    @Override
    public InstallAction.Builder addLocation(Text value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, value);
    }

    @Override
    public InstallAction.Builder addLocation(String value) {
      return addProperty(CoreConstants.PROPERTY_LOCATION, Text.of(value));
    }

    @Override
    public InstallAction.Builder addMainEntityOfPage(CreativeWork value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public InstallAction.Builder addMainEntityOfPage(CreativeWork.Builder value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value.build());
    }

    @Override
    public InstallAction.Builder addMainEntityOfPage(URL value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, value);
    }

    @Override
    public InstallAction.Builder addMainEntityOfPage(String value) {
      return addProperty(CoreConstants.PROPERTY_MAIN_ENTITY_OF_PAGE, Text.of(value));
    }

    @Override
    public InstallAction.Builder addName(Text value) {
      return addProperty(CoreConstants.PROPERTY_NAME, value);
    }

    @Override
    public InstallAction.Builder addName(String value) {
      return addProperty(CoreConstants.PROPERTY_NAME, Text.of(value));
    }

    @Override
    public InstallAction.Builder addObject(Thing value) {
      return addProperty(CoreConstants.PROPERTY_OBJECT, value);
    }

    @Override
    public InstallAction.Builder addObject(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_OBJECT, value.build());
    }

    @Override
    public InstallAction.Builder addObject(String value) {
      return addProperty(CoreConstants.PROPERTY_OBJECT, Text.of(value));
    }

    @Override
    public InstallAction.Builder addParticipant(Organization value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value);
    }

    @Override
    public InstallAction.Builder addParticipant(Organization.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value.build());
    }

    @Override
    public InstallAction.Builder addParticipant(Person value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value);
    }

    @Override
    public InstallAction.Builder addParticipant(Person.Builder value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, value.build());
    }

    @Override
    public InstallAction.Builder addParticipant(String value) {
      return addProperty(CoreConstants.PROPERTY_PARTICIPANT, Text.of(value));
    }

    @Override
    public InstallAction.Builder addPotentialAction(Action value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value);
    }

    @Override
    public InstallAction.Builder addPotentialAction(Action.Builder value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, value.build());
    }

    @Override
    public InstallAction.Builder addPotentialAction(String value) {
      return addProperty(CoreConstants.PROPERTY_POTENTIAL_ACTION, Text.of(value));
    }

    @Override
    public InstallAction.Builder addResult(Thing value) {
      return addProperty(CoreConstants.PROPERTY_RESULT, value);
    }

    @Override
    public InstallAction.Builder addResult(Thing.Builder value) {
      return addProperty(CoreConstants.PROPERTY_RESULT, value.build());
    }

    @Override
    public InstallAction.Builder addResult(String value) {
      return addProperty(CoreConstants.PROPERTY_RESULT, Text.of(value));
    }

    @Override
    public InstallAction.Builder addSameAs(URL value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, value);
    }

    @Override
    public InstallAction.Builder addSameAs(String value) {
      return addProperty(CoreConstants.PROPERTY_SAME_AS, Text.of(value));
    }

    @Override
    public InstallAction.Builder addStartTime(DateTime value) {
      return addProperty(CoreConstants.PROPERTY_START_TIME, value);
    }

    @Override
    public InstallAction.Builder addStartTime(String value) {
      return addProperty(CoreConstants.PROPERTY_START_TIME, Text.of(value));
    }

    @Override
    public InstallAction.Builder addTarget(EntryPoint value) {
      return addProperty(CoreConstants.PROPERTY_TARGET, value);
    }

    @Override
    public InstallAction.Builder addTarget(EntryPoint.Builder value) {
      return addProperty(CoreConstants.PROPERTY_TARGET, value.build());
    }

    @Override
    public InstallAction.Builder addTarget(String value) {
      return addProperty(CoreConstants.PROPERTY_TARGET, Text.of(value));
    }

    @Override
    public InstallAction.Builder addUrl(URL value) {
      return addProperty(CoreConstants.PROPERTY_URL, value);
    }

    @Override
    public InstallAction.Builder addUrl(String value) {
      return addProperty(CoreConstants.PROPERTY_URL, Text.of(value));
    }

    @Override
    public InstallAction.Builder addDetailedDescription(Article value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value);
    }

    @Override
    public InstallAction.Builder addDetailedDescription(Article.Builder value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, value.build());
    }

    @Override
    public InstallAction.Builder addDetailedDescription(String value) {
      return addProperty(GoogConstants.PROPERTY_DETAILED_DESCRIPTION, Text.of(value));
    }

    @Override
    public InstallAction.Builder addPopularityScore(PopularityScoreSpecification value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value);
    }

    @Override
    public InstallAction.Builder addPopularityScore(PopularityScoreSpecification.Builder value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, value.build());
    }

    @Override
    public InstallAction.Builder addPopularityScore(String value) {
      return addProperty(GoogConstants.PROPERTY_POPULARITY_SCORE, Text.of(value));
    }

    @Override
    public InstallAction build() {
      return new InstallActionImpl(properties, reverseMap);
    }
  }

  public InstallActionImpl(
      Multimap<String, ValueType> properties, Multimap<String, Thing> reverseMap) {
    super(properties, reverseMap);
  }

  @Override
  public String getFullTypeName() {
    return CoreConstants.TYPE_INSTALL_ACTION;
  }

  @Override
  public boolean includesProperty(String property) {
    return PROPERTY_SET.contains(CoreConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(GoogConstants.NAMESPACE + property)
        || PROPERTY_SET.contains(property);
  }
}
