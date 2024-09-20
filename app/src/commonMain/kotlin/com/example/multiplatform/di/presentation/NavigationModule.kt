package com.example.multiplatform.di.presentation

import com.example.multiplatform.presentation.showcases.ShowcasesDestination
import com.example.multiplatform.presentation.template.screen_with_args.TemplateDestination
import com.example.multiplatform.presentation.template.screen_without_args.TemplateNoArgsDestination
import com.example.multiplatform.presentation.theme.change.ChangeThemeDestination
import com.example.multiplatform.presentation.theme.change.ChangeThemeDialogDestination
import org.koin.dsl.module
import shared.presentation.navigation.NavigationStore

val navigationModule = module {
    single {
        NavigationStore(
            destinations = listOf(
                ShowcasesDestination,
                TemplateDestination,
                TemplateNoArgsDestination,
                ChangeThemeDestination,
                ChangeThemeDialogDestination,
            )
        )
    }
}