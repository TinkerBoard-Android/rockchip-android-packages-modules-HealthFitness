package com.android.healthconnect.controller.permissions.data

import androidx.annotation.StringRes
import com.android.healthconnect.controller.R
import com.google.common.collect.ImmutableMap

data class HealthPermissionStrings(
    @StringRes val uppercaseLabel: Int,
    @StringRes val lowercaseLabel: Int,
    @StringRes val readContentDescription: Int,
    @StringRes val writeContentDescription: Int
) {
    companion object {
        fun fromPermissionType(
            healthPermissionType: HealthPermissionType
        ): HealthPermissionStrings {
            return PERMISSION_TYPE_STRINGS[healthPermissionType]
                ?: throw IllegalArgumentException(
                    "No strings for permission group " + healthPermissionType.name)
        }
    }
}

private val PERMISSION_TYPE_STRINGS: ImmutableMap<HealthPermissionType, HealthPermissionStrings> =
    ImmutableMap.Builder<HealthPermissionType, HealthPermissionStrings>()
        .put(
            HealthPermissionType.ACTIVE_CALORIES_BURNED,
            HealthPermissionStrings(
                R.string.active_calories_burned_uppercase_label,
                R.string.active_calories_burned_lowercase_label,
                R.string.active_calories_burned_read_content_description,
                R.string.active_calories_burned_write_content_description))
        .put(
            HealthPermissionType.DISTANCE,
            HealthPermissionStrings(
                R.string.distance_uppercase_label,
                R.string.distance_lowercase_label,
                R.string.distance_read_content_description,
                R.string.distance_write_content_description))
        .put(
            HealthPermissionType.ELEVATION_GAINED,
            HealthPermissionStrings(
                R.string.elevation_gained_uppercase_label,
                R.string.elevation_gained_lowercase_label,
                R.string.elevation_gained_read_content_description,
                R.string.elevation_gained_write_content_description))
        .put(
            HealthPermissionType.EXERCISE,
            HealthPermissionStrings(
                R.string.exercise_uppercase_label,
                R.string.exercise_lowercase_label,
                R.string.exercise_read_content_description,
                R.string.exercise_write_content_description))
        .put(
            HealthPermissionType.SPEED,
            HealthPermissionStrings(
                R.string.speed_uppercase_label,
                R.string.speed_lowercase_label,
                R.string.speed_read_content_description,
                R.string.speed_write_content_description))
        .put(
            HealthPermissionType.POWER,
            HealthPermissionStrings(
                R.string.power_uppercase_label,
                R.string.power_lowercase_label,
                R.string.power_read_content_description,
                R.string.power_write_content_description))
        .put(
            HealthPermissionType.FLOORS_CLIMBED,
            HealthPermissionStrings(
                R.string.floors_climbed_uppercase_label,
                R.string.floors_climbed_lowercase_label,
                R.string.floors_climbed_read_content_description,
                R.string.floors_climbed_write_content_description))
        .put(
            HealthPermissionType.INTERMENSTRUAL_BLEEDING,
            HealthPermissionStrings(
                R.string.spotting_uppercase_label,
                R.string.spotting_lowercase_label,
                R.string.spotting_read_content_description,
                R.string.spotting_write_content_description))
        .put(
            HealthPermissionType.STEPS,
            HealthPermissionStrings(
                R.string.steps_uppercase_label,
                R.string.steps_lowercase_label,
                R.string.steps_read_content_description,
                R.string.steps_write_content_description))
        .put(
            HealthPermissionType.TOTAL_CALORIES_BURNED,
            HealthPermissionStrings(
                R.string.total_calories_burned_uppercase_label,
                R.string.total_calories_burned_lowercase_label,
                R.string.total_calories_burned_read_content_description,
                R.string.total_calories_burned_write_content_description))
        .put(
            HealthPermissionType.VO2_MAX,
            HealthPermissionStrings(
                R.string.vo2_max_uppercase_label,
                R.string.vo2_max_lowercase_label,
                R.string.vo2_max_read_content_description,
                R.string.vo2_max_write_content_description))
        .put(
            HealthPermissionType.WHEELCHAIR_PUSHES,
            HealthPermissionStrings(
                R.string.wheelchair_pushes_uppercase_label,
                R.string.wheelchair_pushes_lowercase_label,
                R.string.wheelchair_pushes_read_content_description,
                R.string.wheelchair_pushes_write_content_description))
        .put(
            HealthPermissionType.BASAL_METABOLIC_RATE,
            HealthPermissionStrings(
                R.string.basal_metabolic_rate_uppercase_label,
                R.string.basal_metabolic_rate_lowercase_label,
                R.string.basal_metabolic_rate_read_content_description,
                R.string.basal_metabolic_rate_write_content_description))
        .put(
            HealthPermissionType.BODY_FAT,
            HealthPermissionStrings(
                R.string.body_fat_uppercase_label,
                R.string.body_fat_lowercase_label,
                R.string.body_fat_read_content_description,
                R.string.body_fat_write_content_description))
        .put(
            HealthPermissionType.BODY_WATER_MASS,
            HealthPermissionStrings(
                R.string.body_water_mass_uppercase_label,
                R.string.body_water_mass_lowercase_label,
                R.string.body_water_mass_read_content_description,
                R.string.body_water_mass_write_content_description))
        .put(
            HealthPermissionType.BONE_MASS,
            HealthPermissionStrings(
                R.string.bone_mass_uppercase_label,
                R.string.bone_mass_lowercase_label,
                R.string.bone_mass_read_content_description,
                R.string.bone_mass_write_content_description))
        .put(
            HealthPermissionType.HEIGHT,
            HealthPermissionStrings(
                R.string.height_uppercase_label,
                R.string.height_lowercase_label,
                R.string.height_read_content_description,
                R.string.height_write_content_description))
        .put(
            HealthPermissionType.LEAN_BODY_MASS,
            HealthPermissionStrings(
                R.string.lean_body_mass_uppercase_label,
                R.string.lean_body_mass_lowercase_label,
                R.string.lean_body_mass_read_content_description,
                R.string.lean_body_mass_write_content_description))
        .put(
            HealthPermissionType.WEIGHT,
            HealthPermissionStrings(
                R.string.weight_uppercase_label,
                R.string.weight_lowercase_label,
                R.string.weight_read_content_description,
                R.string.weight_write_content_description))
        .put(
            HealthPermissionType.CERVICAL_MUCUS,
            HealthPermissionStrings(
                R.string.cervical_mucus_uppercase_label,
                R.string.cervical_mucus_lowercase_label,
                R.string.cervical_mucus_read_content_description,
                R.string.cervical_mucus_write_content_description))
        .put(
            HealthPermissionType.MENSTRUATION,
            HealthPermissionStrings(
                R.string.menstruation_uppercase_label,
                R.string.menstruation_lowercase_label,
                R.string.menstruation_read_content_description,
                R.string.menstruation_write_content_description))
        .put(
            HealthPermissionType.OVULATION_TEST,
            HealthPermissionStrings(
                R.string.ovulation_test_uppercase_label,
                R.string.ovulation_test_lowercase_label,
                R.string.ovulation_test_read_content_description,
                R.string.ovulation_test_write_content_description))
        .put(
            HealthPermissionType.SEXUAL_ACTIVITY,
            HealthPermissionStrings(
                R.string.sexual_activity_uppercase_label,
                R.string.sexual_activity_lowercase_label,
                R.string.sexual_activity_read_content_description,
                R.string.sexual_activity_write_content_description))
        .put(
            HealthPermissionType.HYDRATION,
            HealthPermissionStrings(
                R.string.hydration_uppercase_label,
                R.string.hydration_lowercase_label,
                R.string.hydration_read_content_description,
                R.string.hydration_write_content_description))
        .put(
            HealthPermissionType.NUTRITION,
            HealthPermissionStrings(
                R.string.nutrition_uppercase_label,
                R.string.nutrition_lowercase_label,
                R.string.nutrition_read_content_description,
                R.string.nutrition_write_content_description))
        .put(
            HealthPermissionType.SLEEP,
            HealthPermissionStrings(
                R.string.sleep_uppercase_label,
                R.string.sleep_lowercase_label,
                R.string.sleep_read_content_description,
                R.string.sleep_write_content_description))
        .put(
            HealthPermissionType.BASAL_BODY_TEMPERATURE,
            HealthPermissionStrings(
                R.string.basal_body_temperature_uppercase_label,
                R.string.basal_body_temperature_lowercase_label,
                R.string.basal_body_temperature_read_content_description,
                R.string.basal_body_temperature_write_content_description))
        .put(
            HealthPermissionType.BLOOD_GLUCOSE,
            HealthPermissionStrings(
                R.string.blood_glucose_uppercase_label,
                R.string.blood_glucose_lowercase_label,
                R.string.blood_glucose_read_content_description,
                R.string.blood_glucose_write_content_description))
        .put(
            HealthPermissionType.BLOOD_PRESSURE,
            HealthPermissionStrings(
                R.string.blood_pressure_uppercase_label,
                R.string.blood_pressure_lowercase_label,
                R.string.blood_pressure_read_content_description,
                R.string.blood_pressure_write_content_description))
        .put(
            HealthPermissionType.BODY_TEMPERATURE,
            HealthPermissionStrings(
                R.string.body_temperature_uppercase_label,
                R.string.body_temperature_lowercase_label,
                R.string.body_temperature_read_content_description,
                R.string.body_temperature_write_content_description))
        .put(
            HealthPermissionType.HEART_RATE,
            HealthPermissionStrings(
                R.string.heart_rate_uppercase_label,
                R.string.heart_rate_lowercase_label,
                R.string.heart_rate_read_content_description,
                R.string.heart_rate_write_content_description))
        .put(
            HealthPermissionType.HEART_RATE_VARIABILITY,
            HealthPermissionStrings(
                R.string.heart_rate_variability_uppercase_label,
                R.string.heart_rate_variability_lowercase_label,
                R.string.heart_rate_variability_read_content_description,
                R.string.heart_rate_variability_write_content_description))
        .put(
            HealthPermissionType.OXYGEN_SATURATION,
            HealthPermissionStrings(
                R.string.oxygen_saturation_uppercase_label,
                R.string.oxygen_saturation_lowercase_label,
                R.string.oxygen_saturation_read_content_description,
                R.string.oxygen_saturation_write_content_description))
        .put(
            HealthPermissionType.RESPIRATORY_RATE,
            HealthPermissionStrings(
                R.string.respiratory_rate_uppercase_label,
                R.string.respiratory_rate_lowercase_label,
                R.string.respiratory_rate_read_content_description,
                R.string.respiratory_rate_write_content_description))
        .put(
            HealthPermissionType.RESTING_HEART_RATE,
            HealthPermissionStrings(
                R.string.resting_heart_rate_uppercase_label,
                R.string.resting_heart_rate_lowercase_label,
                R.string.resting_heart_rate_read_content_description,
                R.string.resting_heart_rate_write_content_description))
        .put(
            HealthPermissionType.EXERCISE_ROUTE,
            HealthPermissionStrings(
                R.string.exercise_route_uppercase_label,
                R.string.exercise_route_lowercase_label,
                R.string.exercise_route_read_content_description,
                R.string.exercise_route_write_content_description,
            )
        )
        .buildOrThrow()
