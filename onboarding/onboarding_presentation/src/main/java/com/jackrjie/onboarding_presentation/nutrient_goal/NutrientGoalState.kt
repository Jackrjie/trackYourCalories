package com.jackrjie.onboarding_presentation.nutrient_goal

data class NutrientGoalState(
    val carbsRatio: String = DEFAULT_CARBS_RATIO,
    val proteinRatio: String = DEFAULT_PROTEIN_RATIO,
    val fatRatio: String = DEFAULT_FAT_RATIO
)

private const val DEFAULT_CARBS_RATIO = "40"
private const val DEFAULT_PROTEIN_RATIO = "30"
private const val DEFAULT_FAT_RATIO = "30"