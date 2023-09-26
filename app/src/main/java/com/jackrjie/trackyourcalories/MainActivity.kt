package com.jackrjie.trackyourcalories

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jackrjie.core.navigation.Route
import com.jackrjie.onboarding_presentation.activity.ActivityScreen
import com.jackrjie.onboarding_presentation.age.AgeScreen
import com.jackrjie.onboarding_presentation.gender.GenderScreen
import com.jackrjie.onboarding_presentation.goal.GoalScreen
import com.jackrjie.onboarding_presentation.height.HeightScreen
import com.jackrjie.onboarding_presentation.weight.WeightScreen
import com.jackrjie.onboarding_presentation.welcome.WelcomeScreen
import com.jackrjie.trackyourcalories.navigation.navigate
import com.jackrjie.trackyourcalories.ui.theme.TrackYourCaloriesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TrackYourCaloriesTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) { contentPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = contentPadding.calculateTopPadding())
                    ) {
                        NavHost(
                            navController = navController,
                            startDestination = Route.WELCOME
                        ) {
                            composable(Route.WELCOME) {
                                WelcomeScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.AGE) {
                                AgeScreen(
                                    scaffoldState = scaffoldState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.GENDER) {
                                GenderScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.HEIGHT) {
                                HeightScreen(
                                    scaffoldState = scaffoldState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.WEIGHT) {
                                WeightScreen(
                                    scaffoldState = scaffoldState,
                                    onNavigate = navController::navigate
                                )
                            }
                            composable(Route.NUTRIENT_GOAL) {

                            }
                            composable(Route.ACTIVITY) {
                                ActivityScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.GOAL) {
                                GoalScreen(onNavigate = navController::navigate)
                            }
                            composable(Route.TRACKER_OVERVIEW) {

                            }
                            composable(Route.SEARCH) {

                            }
                        }
                    }
                }
            }
        }
    }
}