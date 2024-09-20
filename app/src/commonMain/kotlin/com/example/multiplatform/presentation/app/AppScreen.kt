package com.example.multiplatform.presentation.app

import androidx.compose.runtime.Composable
import com.example.multiplatform.presentation.loader.LoaderProvider
import shared.design.container.AppScaffold
import shared.presentation.navigation.rememberNavigationContext
import shared.presentation.viewmodel.provideViewModel

/**
 * The main screen of the application.
 */
@Composable
fun AppScreen() {
    val viewModel: AppViewModel = provideViewModel()
    val navigationState = viewModel.navigationStore
    val navigationContext = rememberNavigationContext(navigationState)
    AppScaffold(
        snackbarState = viewModel.snackbarStore,
        navigationContext = navigationContext,
    )
    LoaderProvider(viewModel.appStore)
}