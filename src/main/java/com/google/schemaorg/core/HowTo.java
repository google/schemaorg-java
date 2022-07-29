package com.google.schemaorg.core;


import com.google.common.collect.ImmutableList;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Text;

public interface HowTo extends CreativeWork {
    ImmutableList<SchemaOrgType> getEstimatedCostList();

    ImmutableList<SchemaOrgType> getPerformTimeList();

    ImmutableList<SchemaOrgType> getPrepTimeList();

    ImmutableList<SchemaOrgType> getStepList();

    ImmutableList<SchemaOrgType> getSupplyList();

    ImmutableList<SchemaOrgType> getToolList();

    ImmutableList<SchemaOrgType> getTotalTimeList();

    ImmutableList<SchemaOrgType> getYieldList();

    public interface Builder extends CreativeWork.Builder {
        Builder addEstimatedCost(Text value);

        Builder addEstimatedCost(String value);

        Builder addPerformTime(Duration value);

        Builder addPrepTime(Duration value);

        Builder addStep(Text value);

        Builder addStep(CreativeWork value);

        Builder addStep(HowToSection value);

        Builder addStep(HowToStep value);

        Builder addStep(CreativeWork.Builder value);

        Builder addStep(HowToSection.Builder value);

        Builder addStep(HowToStep.Builder value);

        Builder addSupply(Text value);

        Builder addTool(Text value);

        Builder addTotalTime(Duration value);

        Builder addYield(Text value);

        Builder addYield(QuantitativeValue value);

        Builder addProperty(String name, Thing.Builder builder);

        Builder addProperty(String name, SchemaOrgType value);

        Builder addProperty(String name, String value);

        HowTo build();
    }


}
