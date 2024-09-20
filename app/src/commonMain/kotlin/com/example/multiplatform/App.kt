package com.example.multiplatform

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.multiplatform.di.get
import com.example.multiplatform.presentation.app.AppScreen
import com.example.multiplatform.presentation.theme.AppThemeProvider
import shared.presentation.viewmodel.ViewModelProvider

/**
 * Root of the application.
 */
@Composable
fun App() = ViewModelProvider(remember(::get)) {
    AppThemeProvider {
        AppScreen()
    }
}