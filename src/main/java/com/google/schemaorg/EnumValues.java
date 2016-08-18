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

package com.google.schemaorg;

import com.google.common.collect.ImmutableMap;
import com.google.schemaorg.core.ActionStatusTypeEnum;
import com.google.schemaorg.core.BoardingPolicyTypeEnum;
import com.google.schemaorg.core.BookFormatTypeEnum;
import com.google.schemaorg.core.BooleanEnum;
import com.google.schemaorg.core.CarUsageTypeEnum;
import com.google.schemaorg.core.ContactPointOptionEnum;
import com.google.schemaorg.core.DeliveryMethodEnum;
import com.google.schemaorg.core.DriveWheelConfigurationValueEnum;
import com.google.schemaorg.core.DrugCostCategoryEnum;
import com.google.schemaorg.core.DrugPregnancyCategoryEnum;
import com.google.schemaorg.core.DrugPrescriptionStatusEnum;
import com.google.schemaorg.core.Enumeration;
import com.google.schemaorg.core.EventStatusTypeEnum;
import com.google.schemaorg.core.GamePlayModeEnum;
import com.google.schemaorg.core.GameServerStatusEnum;
import com.google.schemaorg.core.InfectiousAgentClassEnum;
import com.google.schemaorg.core.ItemAvailabilityEnum;
import com.google.schemaorg.core.ItemListOrderTypeEnum;
import com.google.schemaorg.core.MapCategoryTypeEnum;
import com.google.schemaorg.core.MedicalAudienceEnum;
import com.google.schemaorg.core.MedicalDevicePurposeEnum;
import com.google.schemaorg.core.MedicalEvidenceLevelEnum;
import com.google.schemaorg.core.MedicalImagingTechniqueEnum;
import com.google.schemaorg.core.MedicalObservationalStudyDesignEnum;
import com.google.schemaorg.core.MedicalProcedureTypeEnum;
import com.google.schemaorg.core.MedicalSpecialtyEnum;
import com.google.schemaorg.core.MedicalStudyStatusEnum;
import com.google.schemaorg.core.MedicalTrialDesignEnum;
import com.google.schemaorg.core.MedicineSystemEnum;
import com.google.schemaorg.core.MusicAlbumProductionTypeEnum;
import com.google.schemaorg.core.MusicAlbumReleaseTypeEnum;
import com.google.schemaorg.core.MusicReleaseFormatTypeEnum;
import com.google.schemaorg.core.OfferItemConditionEnum;
import com.google.schemaorg.core.OrderStatusEnum;
import com.google.schemaorg.core.PaymentStatusTypeEnum;
import com.google.schemaorg.core.PhysicalActivityCategoryEnum;
import com.google.schemaorg.core.PhysicalExamEnum;
import com.google.schemaorg.core.ReservationStatusTypeEnum;
import com.google.schemaorg.core.RsvpResponseTypeEnum;
import com.google.schemaorg.core.SteeringPositionValueEnum;
import javax.annotation.Nullable;

/** Track the mapping between concrete enum full name and enum value. */
final class EnumValues {
  private static final ImmutableMap<String, Enumeration> ENUM_VALUE_MAP = initializeMap();

  private static ImmutableMap<String, Enumeration> initializeMap() {
    ImmutableMap.Builder<String, Enumeration> builder = ImmutableMap.builder();

    builder.put(
        ActionStatusTypeEnum.ACTIVE_ACTION_STATUS.getFullEnumValue(),
        ActionStatusTypeEnum.ACTIVE_ACTION_STATUS);

    builder.put(
        ActionStatusTypeEnum.COMPLETED_ACTION_STATUS.getFullEnumValue(),
        ActionStatusTypeEnum.COMPLETED_ACTION_STATUS);

    builder.put(
        ActionStatusTypeEnum.FAILED_ACTION_STATUS.getFullEnumValue(),
        ActionStatusTypeEnum.FAILED_ACTION_STATUS);

    builder.put(
        ActionStatusTypeEnum.POTENTIAL_ACTION_STATUS.getFullEnumValue(),
        ActionStatusTypeEnum.POTENTIAL_ACTION_STATUS);

    builder.put(
        BoardingPolicyTypeEnum.GROUP_BOARDING_POLICY.getFullEnumValue(),
        BoardingPolicyTypeEnum.GROUP_BOARDING_POLICY);

    builder.put(
        BoardingPolicyTypeEnum.ZONE_BOARDING_POLICY.getFullEnumValue(),
        BoardingPolicyTypeEnum.ZONE_BOARDING_POLICY);

    builder.put(BookFormatTypeEnum.E_BOOK.getFullEnumValue(), BookFormatTypeEnum.E_BOOK);

    builder.put(BookFormatTypeEnum.HARDCOVER.getFullEnumValue(), BookFormatTypeEnum.HARDCOVER);

    builder.put(BookFormatTypeEnum.PAPERBACK.getFullEnumValue(), BookFormatTypeEnum.PAPERBACK);

    builder.put(BooleanEnum.FALSE.getFullEnumValue(), BooleanEnum.FALSE);

    builder.put(BooleanEnum.TRUE.getFullEnumValue(), BooleanEnum.TRUE);

    builder.put(
        CarUsageTypeEnum.DRIVING_SCHOOL_VEHICLE_USAGE.getFullEnumValue(),
        CarUsageTypeEnum.DRIVING_SCHOOL_VEHICLE_USAGE);

    builder.put(
        CarUsageTypeEnum.RENTAL_VEHICLE_USAGE.getFullEnumValue(),
        CarUsageTypeEnum.RENTAL_VEHICLE_USAGE);

    builder.put(
        CarUsageTypeEnum.TAXI_VEHICLE_USAGE.getFullEnumValue(),
        CarUsageTypeEnum.TAXI_VEHICLE_USAGE);

    builder.put(
        ContactPointOptionEnum.HEARING_IMPAIRED_SUPPORTED.getFullEnumValue(),
        ContactPointOptionEnum.HEARING_IMPAIRED_SUPPORTED);

    builder.put(
        ContactPointOptionEnum.TOLL_FREE.getFullEnumValue(), ContactPointOptionEnum.TOLL_FREE);

    builder.put(
        DeliveryMethodEnum.ON_SITE_PICKUP.getFullEnumValue(), DeliveryMethodEnum.ON_SITE_PICKUP);

    builder.put(
        DriveWheelConfigurationValueEnum.ALL_WHEEL_DRIVE_CONFIGURATION.getFullEnumValue(),
        DriveWheelConfigurationValueEnum.ALL_WHEEL_DRIVE_CONFIGURATION);

    builder.put(
        DriveWheelConfigurationValueEnum.FOUR_WHEEL_DRIVE_CONFIGURATION.getFullEnumValue(),
        DriveWheelConfigurationValueEnum.FOUR_WHEEL_DRIVE_CONFIGURATION);

    builder.put(
        DriveWheelConfigurationValueEnum.FRONT_WHEEL_DRIVE_CONFIGURATION.getFullEnumValue(),
        DriveWheelConfigurationValueEnum.FRONT_WHEEL_DRIVE_CONFIGURATION);

    builder.put(
        DriveWheelConfigurationValueEnum.REAR_WHEEL_DRIVE_CONFIGURATION.getFullEnumValue(),
        DriveWheelConfigurationValueEnum.REAR_WHEEL_DRIVE_CONFIGURATION);

    builder.put(
        DrugCostCategoryEnum.REIMBURSEMENT_CAP.getFullEnumValue(),
        DrugCostCategoryEnum.REIMBURSEMENT_CAP);

    builder.put(DrugCostCategoryEnum.RETAIL.getFullEnumValue(), DrugCostCategoryEnum.RETAIL);

    builder.put(DrugCostCategoryEnum.WHOLESALE.getFullEnumValue(), DrugCostCategoryEnum.WHOLESALE);

    builder.put(
        DrugPregnancyCategoryEnum.FD_ACATEGORY_A.getFullEnumValue(),
        DrugPregnancyCategoryEnum.FD_ACATEGORY_A);

    builder.put(
        DrugPregnancyCategoryEnum.FD_ACATEGORY_B.getFullEnumValue(),
        DrugPregnancyCategoryEnum.FD_ACATEGORY_B);

    builder.put(
        DrugPregnancyCategoryEnum.FD_ACATEGORY_C.getFullEnumValue(),
        DrugPregnancyCategoryEnum.FD_ACATEGORY_C);

    builder.put(
        DrugPregnancyCategoryEnum.FD_ACATEGORY_D.getFullEnumValue(),
        DrugPregnancyCategoryEnum.FD_ACATEGORY_D);

    builder.put(
        DrugPregnancyCategoryEnum.FD_ACATEGORY_X.getFullEnumValue(),
        DrugPregnancyCategoryEnum.FD_ACATEGORY_X);

    builder.put(
        DrugPregnancyCategoryEnum.FD_ANOT_EVALUATED.getFullEnumValue(),
        DrugPregnancyCategoryEnum.FD_ANOT_EVALUATED);

    builder.put(DrugPrescriptionStatusEnum.OTC.getFullEnumValue(), DrugPrescriptionStatusEnum.OTC);

    builder.put(
        DrugPrescriptionStatusEnum.PRESCRIPTION_ONLY.getFullEnumValue(),
        DrugPrescriptionStatusEnum.PRESCRIPTION_ONLY);

    builder.put(
        EventStatusTypeEnum.EVENT_CANCELLED.getFullEnumValue(),
        EventStatusTypeEnum.EVENT_CANCELLED);

    builder.put(
        EventStatusTypeEnum.EVENT_POSTPONED.getFullEnumValue(),
        EventStatusTypeEnum.EVENT_POSTPONED);

    builder.put(
        EventStatusTypeEnum.EVENT_RESCHEDULED.getFullEnumValue(),
        EventStatusTypeEnum.EVENT_RESCHEDULED);

    builder.put(
        EventStatusTypeEnum.EVENT_SCHEDULED.getFullEnumValue(),
        EventStatusTypeEnum.EVENT_SCHEDULED);

    builder.put(GamePlayModeEnum.CO_OP.getFullEnumValue(), GamePlayModeEnum.CO_OP);

    builder.put(GamePlayModeEnum.MULTI_PLAYER.getFullEnumValue(), GamePlayModeEnum.MULTI_PLAYER);

    builder.put(GamePlayModeEnum.SINGLE_PLAYER.getFullEnumValue(), GamePlayModeEnum.SINGLE_PLAYER);

    builder.put(
        GameServerStatusEnum.OFFLINE_PERMANENTLY.getFullEnumValue(),
        GameServerStatusEnum.OFFLINE_PERMANENTLY);

    builder.put(
        GameServerStatusEnum.OFFLINE_TEMPORARILY.getFullEnumValue(),
        GameServerStatusEnum.OFFLINE_TEMPORARILY);

    builder.put(GameServerStatusEnum.ONLINE.getFullEnumValue(), GameServerStatusEnum.ONLINE);

    builder.put(
        GameServerStatusEnum.ONLINE_FULL.getFullEnumValue(), GameServerStatusEnum.ONLINE_FULL);

    builder.put(
        InfectiousAgentClassEnum.BACTERIA.getFullEnumValue(), InfectiousAgentClassEnum.BACTERIA);

    builder.put(
        InfectiousAgentClassEnum.FUNGUS.getFullEnumValue(), InfectiousAgentClassEnum.FUNGUS);

    builder.put(
        InfectiousAgentClassEnum.MULTICELLULAR_PARASITE.getFullEnumValue(),
        InfectiousAgentClassEnum.MULTICELLULAR_PARASITE);

    builder.put(InfectiousAgentClassEnum.PRION.getFullEnumValue(), InfectiousAgentClassEnum.PRION);

    builder.put(
        InfectiousAgentClassEnum.PROTOZOA.getFullEnumValue(), InfectiousAgentClassEnum.PROTOZOA);

    builder.put(InfectiousAgentClassEnum.VIRUS.getFullEnumValue(), InfectiousAgentClassEnum.VIRUS);

    builder.put(
        ItemAvailabilityEnum.DISCONTINUED.getFullEnumValue(), ItemAvailabilityEnum.DISCONTINUED);

    builder.put(ItemAvailabilityEnum.IN_STOCK.getFullEnumValue(), ItemAvailabilityEnum.IN_STOCK);

    builder.put(
        ItemAvailabilityEnum.IN_STORE_ONLY.getFullEnumValue(), ItemAvailabilityEnum.IN_STORE_ONLY);

    builder.put(
        ItemAvailabilityEnum.LIMITED_AVAILABILITY.getFullEnumValue(),
        ItemAvailabilityEnum.LIMITED_AVAILABILITY);

    builder.put(
        ItemAvailabilityEnum.ONLINE_ONLY.getFullEnumValue(), ItemAvailabilityEnum.ONLINE_ONLY);

    builder.put(
        ItemAvailabilityEnum.OUT_OF_STOCK.getFullEnumValue(), ItemAvailabilityEnum.OUT_OF_STOCK);

    builder.put(ItemAvailabilityEnum.PRE_ORDER.getFullEnumValue(), ItemAvailabilityEnum.PRE_ORDER);

    builder.put(ItemAvailabilityEnum.SOLD_OUT.getFullEnumValue(), ItemAvailabilityEnum.SOLD_OUT);

    builder.put(
        ItemListOrderTypeEnum.ITEM_LIST_ORDER_ASCENDING.getFullEnumValue(),
        ItemListOrderTypeEnum.ITEM_LIST_ORDER_ASCENDING);

    builder.put(
        ItemListOrderTypeEnum.ITEM_LIST_ORDER_DESCENDING.getFullEnumValue(),
        ItemListOrderTypeEnum.ITEM_LIST_ORDER_DESCENDING);

    builder.put(
        ItemListOrderTypeEnum.ITEM_LIST_UNORDERED.getFullEnumValue(),
        ItemListOrderTypeEnum.ITEM_LIST_UNORDERED);

    builder.put(
        MapCategoryTypeEnum.PARKING_MAP.getFullEnumValue(), MapCategoryTypeEnum.PARKING_MAP);

    builder.put(
        MapCategoryTypeEnum.SEATING_MAP.getFullEnumValue(), MapCategoryTypeEnum.SEATING_MAP);

    builder.put(
        MapCategoryTypeEnum.TRANSIT_MAP.getFullEnumValue(), MapCategoryTypeEnum.TRANSIT_MAP);

    builder.put(MapCategoryTypeEnum.VENUE_MAP.getFullEnumValue(), MapCategoryTypeEnum.VENUE_MAP);

    builder.put(MedicalAudienceEnum.CLINICIAN.getFullEnumValue(), MedicalAudienceEnum.CLINICIAN);

    builder.put(
        MedicalAudienceEnum.MEDICAL_RESEARCHER.getFullEnumValue(),
        MedicalAudienceEnum.MEDICAL_RESEARCHER);

    builder.put(MedicalAudienceEnum.PATIENT.getFullEnumValue(), MedicalAudienceEnum.PATIENT);

    builder.put(
        MedicalDevicePurposeEnum.DIAGNOSTIC.getFullEnumValue(),
        MedicalDevicePurposeEnum.DIAGNOSTIC);

    builder.put(
        MedicalDevicePurposeEnum.THERAPEUTIC.getFullEnumValue(),
        MedicalDevicePurposeEnum.THERAPEUTIC);

    builder.put(
        MedicalEvidenceLevelEnum.EVIDENCE_LEVEL_A.getFullEnumValue(),
        MedicalEvidenceLevelEnum.EVIDENCE_LEVEL_A);

    builder.put(
        MedicalEvidenceLevelEnum.EVIDENCE_LEVEL_B.getFullEnumValue(),
        MedicalEvidenceLevelEnum.EVIDENCE_LEVEL_B);

    builder.put(
        MedicalEvidenceLevelEnum.EVIDENCE_LEVEL_C.getFullEnumValue(),
        MedicalEvidenceLevelEnum.EVIDENCE_LEVEL_C);

    builder.put(MedicalImagingTechniqueEnum.CT.getFullEnumValue(), MedicalImagingTechniqueEnum.CT);

    builder.put(
        MedicalImagingTechniqueEnum.MRI.getFullEnumValue(), MedicalImagingTechniqueEnum.MRI);

    builder.put(
        MedicalImagingTechniqueEnum.PET.getFullEnumValue(), MedicalImagingTechniqueEnum.PET);

    builder.put(
        MedicalImagingTechniqueEnum.ULTRASOUND.getFullEnumValue(),
        MedicalImagingTechniqueEnum.ULTRASOUND);

    builder.put(
        MedicalImagingTechniqueEnum.X_RAY.getFullEnumValue(), MedicalImagingTechniqueEnum.X_RAY);

    builder.put(
        MedicalObservationalStudyDesignEnum.CASE_SERIES.getFullEnumValue(),
        MedicalObservationalStudyDesignEnum.CASE_SERIES);

    builder.put(
        MedicalObservationalStudyDesignEnum.COHORT_STUDY.getFullEnumValue(),
        MedicalObservationalStudyDesignEnum.COHORT_STUDY);

    builder.put(
        MedicalObservationalStudyDesignEnum.CROSS_SECTIONAL.getFullEnumValue(),
        MedicalObservationalStudyDesignEnum.CROSS_SECTIONAL);

    builder.put(
        MedicalObservationalStudyDesignEnum.LONGITUDINAL.getFullEnumValue(),
        MedicalObservationalStudyDesignEnum.LONGITUDINAL);

    builder.put(
        MedicalObservationalStudyDesignEnum.OBSERVATIONAL.getFullEnumValue(),
        MedicalObservationalStudyDesignEnum.OBSERVATIONAL);

    builder.put(
        MedicalObservationalStudyDesignEnum.REGISTRY.getFullEnumValue(),
        MedicalObservationalStudyDesignEnum.REGISTRY);

    builder.put(
        MedicalProcedureTypeEnum.NONINVASIVE_PROCEDURE.getFullEnumValue(),
        MedicalProcedureTypeEnum.NONINVASIVE_PROCEDURE);

    builder.put(
        MedicalProcedureTypeEnum.PERCUTANEOUS_PROCEDURE.getFullEnumValue(),
        MedicalProcedureTypeEnum.PERCUTANEOUS_PROCEDURE);

    builder.put(
        MedicalProcedureTypeEnum.SURGICAL_PROCEDURE.getFullEnumValue(),
        MedicalProcedureTypeEnum.SURGICAL_PROCEDURE);

    builder.put(
        MedicalSpecialtyEnum.ANESTHESIA.getFullEnumValue(), MedicalSpecialtyEnum.ANESTHESIA);

    builder.put(
        MedicalSpecialtyEnum.CARDIOVASCULAR.getFullEnumValue(),
        MedicalSpecialtyEnum.CARDIOVASCULAR);

    builder.put(
        MedicalSpecialtyEnum.COMMUNITY_HEALTH.getFullEnumValue(),
        MedicalSpecialtyEnum.COMMUNITY_HEALTH);

    builder.put(MedicalSpecialtyEnum.DENTISTRY.getFullEnumValue(), MedicalSpecialtyEnum.DENTISTRY);

    builder.put(
        MedicalSpecialtyEnum.DERMATOLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.DERMATOLOGIC);

    builder.put(
        MedicalSpecialtyEnum.DIET_NUTRITION.getFullEnumValue(),
        MedicalSpecialtyEnum.DIET_NUTRITION);

    builder.put(MedicalSpecialtyEnum.EMERGENCY.getFullEnumValue(), MedicalSpecialtyEnum.EMERGENCY);

    builder.put(MedicalSpecialtyEnum.ENDOCRINE.getFullEnumValue(), MedicalSpecialtyEnum.ENDOCRINE);

    builder.put(
        MedicalSpecialtyEnum.GASTROENTEROLOGIC.getFullEnumValue(),
        MedicalSpecialtyEnum.GASTROENTEROLOGIC);

    builder.put(MedicalSpecialtyEnum.GENETIC.getFullEnumValue(), MedicalSpecialtyEnum.GENETIC);

    builder.put(MedicalSpecialtyEnum.GERIATRIC.getFullEnumValue(), MedicalSpecialtyEnum.GERIATRIC);

    builder.put(
        MedicalSpecialtyEnum.GYNECOLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.GYNECOLOGIC);

    builder.put(
        MedicalSpecialtyEnum.HEMATOLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.HEMATOLOGIC);

    builder.put(
        MedicalSpecialtyEnum.INFECTIOUS.getFullEnumValue(), MedicalSpecialtyEnum.INFECTIOUS);

    builder.put(
        MedicalSpecialtyEnum.LABORATORY_SCIENCE.getFullEnumValue(),
        MedicalSpecialtyEnum.LABORATORY_SCIENCE);

    builder.put(MedicalSpecialtyEnum.MIDWIFERY.getFullEnumValue(), MedicalSpecialtyEnum.MIDWIFERY);

    builder.put(
        MedicalSpecialtyEnum.MUSCULOSKELETAL.getFullEnumValue(),
        MedicalSpecialtyEnum.MUSCULOSKELETAL);

    builder.put(
        MedicalSpecialtyEnum.NEUROLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.NEUROLOGIC);

    builder.put(MedicalSpecialtyEnum.NURSING.getFullEnumValue(), MedicalSpecialtyEnum.NURSING);

    builder.put(MedicalSpecialtyEnum.OBSTETRIC.getFullEnumValue(), MedicalSpecialtyEnum.OBSTETRIC);

    builder.put(
        MedicalSpecialtyEnum.OCCUPATIONAL_THERAPY.getFullEnumValue(),
        MedicalSpecialtyEnum.OCCUPATIONAL_THERAPY);

    builder.put(MedicalSpecialtyEnum.ONCOLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.ONCOLOGIC);

    builder.put(MedicalSpecialtyEnum.OPTOMETIC.getFullEnumValue(), MedicalSpecialtyEnum.OPTOMETIC);

    builder.put(
        MedicalSpecialtyEnum.OTOLARYNGOLOGIC.getFullEnumValue(),
        MedicalSpecialtyEnum.OTOLARYNGOLOGIC);

    builder.put(MedicalSpecialtyEnum.PATHOLOGY.getFullEnumValue(), MedicalSpecialtyEnum.PATHOLOGY);

    builder.put(MedicalSpecialtyEnum.PEDIATRIC.getFullEnumValue(), MedicalSpecialtyEnum.PEDIATRIC);

    builder.put(
        MedicalSpecialtyEnum.PHARMACY_SPECIALTY.getFullEnumValue(),
        MedicalSpecialtyEnum.PHARMACY_SPECIALTY);

    builder.put(
        MedicalSpecialtyEnum.PHYSIOTHERAPY.getFullEnumValue(), MedicalSpecialtyEnum.PHYSIOTHERAPY);

    builder.put(
        MedicalSpecialtyEnum.PLASTIC_SURGERY.getFullEnumValue(),
        MedicalSpecialtyEnum.PLASTIC_SURGERY);

    builder.put(MedicalSpecialtyEnum.PODIATRIC.getFullEnumValue(), MedicalSpecialtyEnum.PODIATRIC);

    builder.put(
        MedicalSpecialtyEnum.PRIMARY_CARE.getFullEnumValue(), MedicalSpecialtyEnum.PRIMARY_CARE);

    builder.put(
        MedicalSpecialtyEnum.PSYCHIATRIC.getFullEnumValue(), MedicalSpecialtyEnum.PSYCHIATRIC);

    builder.put(
        MedicalSpecialtyEnum.PUBLIC_HEALTH.getFullEnumValue(), MedicalSpecialtyEnum.PUBLIC_HEALTH);

    builder.put(MedicalSpecialtyEnum.PULMONARY.getFullEnumValue(), MedicalSpecialtyEnum.PULMONARY);

    builder.put(
        MedicalSpecialtyEnum.RADIOGRAPY.getFullEnumValue(), MedicalSpecialtyEnum.RADIOGRAPY);

    builder.put(MedicalSpecialtyEnum.RENAL.getFullEnumValue(), MedicalSpecialtyEnum.RENAL);

    builder.put(
        MedicalSpecialtyEnum.RESPIRATORY_THERAPY.getFullEnumValue(),
        MedicalSpecialtyEnum.RESPIRATORY_THERAPY);

    builder.put(
        MedicalSpecialtyEnum.RHEUMATOLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.RHEUMATOLOGIC);

    builder.put(
        MedicalSpecialtyEnum.SPEECH_PATHOLOGY.getFullEnumValue(),
        MedicalSpecialtyEnum.SPEECH_PATHOLOGY);

    builder.put(MedicalSpecialtyEnum.SURGICAL.getFullEnumValue(), MedicalSpecialtyEnum.SURGICAL);

    builder.put(
        MedicalSpecialtyEnum.TOXICOLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.TOXICOLOGIC);

    builder.put(MedicalSpecialtyEnum.UROLOGIC.getFullEnumValue(), MedicalSpecialtyEnum.UROLOGIC);

    builder.put(
        MedicalStudyStatusEnum.ACTIVE_NOT_RECRUITING.getFullEnumValue(),
        MedicalStudyStatusEnum.ACTIVE_NOT_RECRUITING);

    builder.put(
        MedicalStudyStatusEnum.COMPLETED.getFullEnumValue(), MedicalStudyStatusEnum.COMPLETED);

    builder.put(
        MedicalStudyStatusEnum.ENROLLING_BY_INVITATION.getFullEnumValue(),
        MedicalStudyStatusEnum.ENROLLING_BY_INVITATION);

    builder.put(
        MedicalStudyStatusEnum.NOT_YET_RECRUITING.getFullEnumValue(),
        MedicalStudyStatusEnum.NOT_YET_RECRUITING);

    builder.put(
        MedicalStudyStatusEnum.RECRUITING.getFullEnumValue(), MedicalStudyStatusEnum.RECRUITING);

    builder.put(
        MedicalStudyStatusEnum.RESULTS_AVAILABLE.getFullEnumValue(),
        MedicalStudyStatusEnum.RESULTS_AVAILABLE);

    builder.put(
        MedicalStudyStatusEnum.RESULTS_NOT_AVAILABLE.getFullEnumValue(),
        MedicalStudyStatusEnum.RESULTS_NOT_AVAILABLE);

    builder.put(
        MedicalStudyStatusEnum.SUSPENDED.getFullEnumValue(), MedicalStudyStatusEnum.SUSPENDED);

    builder.put(
        MedicalStudyStatusEnum.TERMINATED.getFullEnumValue(), MedicalStudyStatusEnum.TERMINATED);

    builder.put(
        MedicalStudyStatusEnum.WITHDRAWN.getFullEnumValue(), MedicalStudyStatusEnum.WITHDRAWN);

    builder.put(
        MedicalTrialDesignEnum.DOUBLE_BLINDED_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.DOUBLE_BLINDED_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.INTERNATIONAL_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.INTERNATIONAL_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.MULTI_CENTER_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.MULTI_CENTER_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.OPEN_TRIAL.getFullEnumValue(), MedicalTrialDesignEnum.OPEN_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.PLACEBO_CONTROLLED_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.PLACEBO_CONTROLLED_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.RANDOMIZED_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.RANDOMIZED_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.SINGLE_BLINDED_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.SINGLE_BLINDED_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.SINGLE_CENTER_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.SINGLE_CENTER_TRIAL);

    builder.put(
        MedicalTrialDesignEnum.TRIPLE_BLINDED_TRIAL.getFullEnumValue(),
        MedicalTrialDesignEnum.TRIPLE_BLINDED_TRIAL);

    builder.put(MedicineSystemEnum.AYURVEDIC.getFullEnumValue(), MedicineSystemEnum.AYURVEDIC);

    builder.put(
        MedicineSystemEnum.CHIROPRACTIC.getFullEnumValue(), MedicineSystemEnum.CHIROPRACTIC);

    builder.put(MedicineSystemEnum.HOMEOPATHIC.getFullEnumValue(), MedicineSystemEnum.HOMEOPATHIC);

    builder.put(MedicineSystemEnum.OSTEOPATHIC.getFullEnumValue(), MedicineSystemEnum.OSTEOPATHIC);

    builder.put(
        MedicineSystemEnum.TRADITIONAL_CHINESE.getFullEnumValue(),
        MedicineSystemEnum.TRADITIONAL_CHINESE);

    builder.put(
        MedicineSystemEnum.WESTERN_CONVENTIONAL.getFullEnumValue(),
        MedicineSystemEnum.WESTERN_CONVENTIONAL);

    builder.put(
        MusicAlbumProductionTypeEnum.COMPILATION_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.COMPILATION_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.DJ_MIX_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.DJ_MIX_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.DEMO_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.DEMO_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.LIVE_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.LIVE_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.MIXTAPE_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.MIXTAPE_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.REMIX_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.REMIX_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.SOUNDTRACK_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.SOUNDTRACK_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.SPOKEN_WORD_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.SPOKEN_WORD_ALBUM);

    builder.put(
        MusicAlbumProductionTypeEnum.STUDIO_ALBUM.getFullEnumValue(),
        MusicAlbumProductionTypeEnum.STUDIO_ALBUM);

    builder.put(
        MusicAlbumReleaseTypeEnum.ALBUM_RELEASE.getFullEnumValue(),
        MusicAlbumReleaseTypeEnum.ALBUM_RELEASE);

    builder.put(
        MusicAlbumReleaseTypeEnum.BROADCAST_RELEASE.getFullEnumValue(),
        MusicAlbumReleaseTypeEnum.BROADCAST_RELEASE);

    builder.put(
        MusicAlbumReleaseTypeEnum.EP_RELEASE.getFullEnumValue(),
        MusicAlbumReleaseTypeEnum.EP_RELEASE);

    builder.put(
        MusicAlbumReleaseTypeEnum.SINGLE_RELEASE.getFullEnumValue(),
        MusicAlbumReleaseTypeEnum.SINGLE_RELEASE);

    builder.put(
        MusicReleaseFormatTypeEnum.CD_FORMAT.getFullEnumValue(),
        MusicReleaseFormatTypeEnum.CD_FORMAT);

    builder.put(
        MusicReleaseFormatTypeEnum.CASSETTE_FORMAT.getFullEnumValue(),
        MusicReleaseFormatTypeEnum.CASSETTE_FORMAT);

    builder.put(
        MusicReleaseFormatTypeEnum.DVD_FORMAT.getFullEnumValue(),
        MusicReleaseFormatTypeEnum.DVD_FORMAT);

    builder.put(
        MusicReleaseFormatTypeEnum.DIGITAL_AUDIO_TAPE_FORMAT.getFullEnumValue(),
        MusicReleaseFormatTypeEnum.DIGITAL_AUDIO_TAPE_FORMAT);

    builder.put(
        MusicReleaseFormatTypeEnum.DIGITAL_FORMAT.getFullEnumValue(),
        MusicReleaseFormatTypeEnum.DIGITAL_FORMAT);

    builder.put(
        MusicReleaseFormatTypeEnum.LASER_DISC_FORMAT.getFullEnumValue(),
        MusicReleaseFormatTypeEnum.LASER_DISC_FORMAT);

    builder.put(
        MusicReleaseFormatTypeEnum.VINYL_FORMAT.getFullEnumValue(),
        MusicReleaseFormatTypeEnum.VINYL_FORMAT);

    builder.put(
        OfferItemConditionEnum.DAMAGED_CONDITION.getFullEnumValue(),
        OfferItemConditionEnum.DAMAGED_CONDITION);

    builder.put(
        OfferItemConditionEnum.NEW_CONDITION.getFullEnumValue(),
        OfferItemConditionEnum.NEW_CONDITION);

    builder.put(
        OfferItemConditionEnum.REFURBISHED_CONDITION.getFullEnumValue(),
        OfferItemConditionEnum.REFURBISHED_CONDITION);

    builder.put(
        OfferItemConditionEnum.USED_CONDITION.getFullEnumValue(),
        OfferItemConditionEnum.USED_CONDITION);

    builder.put(
        OrderStatusEnum.ORDER_CANCELLED.getFullEnumValue(), OrderStatusEnum.ORDER_CANCELLED);

    builder.put(
        OrderStatusEnum.ORDER_DELIVERED.getFullEnumValue(), OrderStatusEnum.ORDER_DELIVERED);

    builder.put(
        OrderStatusEnum.ORDER_IN_TRANSIT.getFullEnumValue(), OrderStatusEnum.ORDER_IN_TRANSIT);

    builder.put(
        OrderStatusEnum.ORDER_PAYMENT_DUE.getFullEnumValue(), OrderStatusEnum.ORDER_PAYMENT_DUE);

    builder.put(
        OrderStatusEnum.ORDER_PICKUP_AVAILABLE.getFullEnumValue(),
        OrderStatusEnum.ORDER_PICKUP_AVAILABLE);

    builder.put(OrderStatusEnum.ORDER_PROBLEM.getFullEnumValue(), OrderStatusEnum.ORDER_PROBLEM);

    builder.put(
        OrderStatusEnum.ORDER_PROCESSING.getFullEnumValue(), OrderStatusEnum.ORDER_PROCESSING);

    builder.put(OrderStatusEnum.ORDER_RETURNED.getFullEnumValue(), OrderStatusEnum.ORDER_RETURNED);

    builder.put(
        PaymentStatusTypeEnum.PAYMENT_AUTOMATICALLY_APPLIED.getFullEnumValue(),
        PaymentStatusTypeEnum.PAYMENT_AUTOMATICALLY_APPLIED);

    builder.put(
        PaymentStatusTypeEnum.PAYMENT_COMPLETE.getFullEnumValue(),
        PaymentStatusTypeEnum.PAYMENT_COMPLETE);

    builder.put(
        PaymentStatusTypeEnum.PAYMENT_DECLINED.getFullEnumValue(),
        PaymentStatusTypeEnum.PAYMENT_DECLINED);

    builder.put(
        PaymentStatusTypeEnum.PAYMENT_DUE.getFullEnumValue(), PaymentStatusTypeEnum.PAYMENT_DUE);

    builder.put(
        PaymentStatusTypeEnum.PAYMENT_PAST_DUE.getFullEnumValue(),
        PaymentStatusTypeEnum.PAYMENT_PAST_DUE);

    builder.put(
        PhysicalActivityCategoryEnum.AEROBIC_ACTIVITY.getFullEnumValue(),
        PhysicalActivityCategoryEnum.AEROBIC_ACTIVITY);

    builder.put(
        PhysicalActivityCategoryEnum.ANAEROBIC_ACTIVITY.getFullEnumValue(),
        PhysicalActivityCategoryEnum.ANAEROBIC_ACTIVITY);

    builder.put(
        PhysicalActivityCategoryEnum.BALANCE.getFullEnumValue(),
        PhysicalActivityCategoryEnum.BALANCE);

    builder.put(
        PhysicalActivityCategoryEnum.FLEXIBILITY.getFullEnumValue(),
        PhysicalActivityCategoryEnum.FLEXIBILITY);

    builder.put(
        PhysicalActivityCategoryEnum.LEISURE_TIME_ACTIVITY.getFullEnumValue(),
        PhysicalActivityCategoryEnum.LEISURE_TIME_ACTIVITY);

    builder.put(
        PhysicalActivityCategoryEnum.OCCUPATIONAL_ACTIVITY.getFullEnumValue(),
        PhysicalActivityCategoryEnum.OCCUPATIONAL_ACTIVITY);

    builder.put(
        PhysicalActivityCategoryEnum.STRENGTH_TRAINING.getFullEnumValue(),
        PhysicalActivityCategoryEnum.STRENGTH_TRAINING);

    builder.put(PhysicalExamEnum.ABDOMEN.getFullEnumValue(), PhysicalExamEnum.ABDOMEN);

    builder.put(PhysicalExamEnum.APPEARANCE.getFullEnumValue(), PhysicalExamEnum.APPEARANCE);

    builder.put(
        PhysicalExamEnum.CARDIOVASCULAR_EXAM.getFullEnumValue(),
        PhysicalExamEnum.CARDIOVASCULAR_EXAM);

    builder.put(PhysicalExamEnum.EAR.getFullEnumValue(), PhysicalExamEnum.EAR);

    builder.put(PhysicalExamEnum.EYE.getFullEnumValue(), PhysicalExamEnum.EYE);

    builder.put(PhysicalExamEnum.GENITOURINARY.getFullEnumValue(), PhysicalExamEnum.GENITOURINARY);

    builder.put(PhysicalExamEnum.HEAD.getFullEnumValue(), PhysicalExamEnum.HEAD);

    builder.put(PhysicalExamEnum.LUNG.getFullEnumValue(), PhysicalExamEnum.LUNG);

    builder.put(
        PhysicalExamEnum.MUSCULOSKELETAL_EXAM.getFullEnumValue(),
        PhysicalExamEnum.MUSCULOSKELETAL_EXAM);

    builder.put(PhysicalExamEnum.NECK.getFullEnumValue(), PhysicalExamEnum.NECK);

    builder.put(PhysicalExamEnum.NEURO.getFullEnumValue(), PhysicalExamEnum.NEURO);

    builder.put(PhysicalExamEnum.NOSE.getFullEnumValue(), PhysicalExamEnum.NOSE);

    builder.put(PhysicalExamEnum.SKIN.getFullEnumValue(), PhysicalExamEnum.SKIN);

    builder.put(PhysicalExamEnum.THROAT.getFullEnumValue(), PhysicalExamEnum.THROAT);

    builder.put(PhysicalExamEnum.VITAL_SIGN.getFullEnumValue(), PhysicalExamEnum.VITAL_SIGN);

    builder.put(
        ReservationStatusTypeEnum.RESERVATION_CANCELLED.getFullEnumValue(),
        ReservationStatusTypeEnum.RESERVATION_CANCELLED);

    builder.put(
        ReservationStatusTypeEnum.RESERVATION_CONFIRMED.getFullEnumValue(),
        ReservationStatusTypeEnum.RESERVATION_CONFIRMED);

    builder.put(
        ReservationStatusTypeEnum.RESERVATION_HOLD.getFullEnumValue(),
        ReservationStatusTypeEnum.RESERVATION_HOLD);

    builder.put(
        ReservationStatusTypeEnum.RESERVATION_PENDING.getFullEnumValue(),
        ReservationStatusTypeEnum.RESERVATION_PENDING);

    builder.put(
        RsvpResponseTypeEnum.RSVP_RESPONSE_MAYBE.getFullEnumValue(),
        RsvpResponseTypeEnum.RSVP_RESPONSE_MAYBE);

    builder.put(
        RsvpResponseTypeEnum.RSVP_RESPONSE_NO.getFullEnumValue(),
        RsvpResponseTypeEnum.RSVP_RESPONSE_NO);

    builder.put(
        RsvpResponseTypeEnum.RSVP_RESPONSE_YES.getFullEnumValue(),
        RsvpResponseTypeEnum.RSVP_RESPONSE_YES);

    builder.put(
        SteeringPositionValueEnum.LEFT_HAND_DRIVING.getFullEnumValue(),
        SteeringPositionValueEnum.LEFT_HAND_DRIVING);

    builder.put(
        SteeringPositionValueEnum.RIGHT_HAND_DRIVING.getFullEnumValue(),
        SteeringPositionValueEnum.RIGHT_HAND_DRIVING);

    return builder.build();
  }

  @Nullable
  static Enumeration valueOf(String enumValue) {
    return ENUM_VALUE_MAP.get(enumValue);
  }
}
