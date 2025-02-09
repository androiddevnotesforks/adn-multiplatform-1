package com.example.multiplatform.presentation.app

import com.example.multiplatform.presentation.showcases.ShowcasesDestination
import shared.presentation.navigation.NavigationDestination

/**
 * Application navigation router.
 */
class AppNavigationRouter {

    /**
     * Returns the start destination based on the current application state.
     *
     * @return The start destination.
     */
    suspend fun getStartDestination(): NavigationDestination<*> {
        return ShowcasesDestination
    }

}