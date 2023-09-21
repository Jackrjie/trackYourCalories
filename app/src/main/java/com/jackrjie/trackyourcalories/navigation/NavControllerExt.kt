package com.jackrjie.trackyourcalories.navigation

import androidx.navigation.NavController
import com.jackrjie.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}