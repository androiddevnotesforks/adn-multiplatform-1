package com.example.multiplatform.di.presentation

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.multiplatform.presentation.app.AppNavigationRouter
import com.example.multiplatform.presentation.app.AppStore
import com.example.multiplatform.presentation.app.AppViewModel
import com.example.multiplatform.presentation.loader.LoaderViewModel
import com.example.multiplatform.presentation.showcases.ShowcasesViewModel
import com.example.multiplatform.presentation.showcases.dataflow.keyvalue.`object`.ObjectKeyValueViewModel
import com.example.multiplatform.presentation.showcases.dataflow.keyvalue.primitive.PrimitiveKeyValueViewModel
import com.example.multiplatform.presentation.showcases.userflow.loader.data.DataLoaderShowcaseViewModel
import com.example.multiplatform.presentation.showcases.userflow.navigation.args.from.ArgsNavigationFromViewModel
import com.example.multiplatform.presentation.showcases.userflow.navigation.args.to.ArgsNavigationToViewModel
import com.example.multiplatform.presentation.showcases.userflow.navigation.no_args.from.NoArgsNavigationFromViewModel
import com.example.multiplatform.presentation.showcases.userflow.navigation.no_args.to.NoArgsNavigationToViewModel
import com.example.multiplatform.presentation.template.screen_with_args.TemplateViewModel
import com.example.multiplatform.presentation.template.screen_without_args.TemplateNoArgsViewModel
import com.example.multiplatform.presentation.theme.AppThemePersistenceViewModel
import com.example.multiplatform.presentation.theme.change.ChangeThemeViewModel
import com.example.multiplatform.presentation.theme.toggle.ToggleThemeViewModel
import org.koin.dsl.module
import shared.design.component.AppSnackbarStore

val appModule = module {
    single { AppStore() }
    single { AppSnackbarStore() }
    single { AppNavigationRouter() }
    single {
        viewModelFactory {
            initializer { AppViewModel(get(), get(), get(), get()) }
            initializer { AppThemePersistenceViewModel(get(), get()) }
            initializer { TemplateNoArgsViewModel(get()) }
            initializer { TemplateViewModel(get()) }
            initializer { ShowcasesViewModel(get()) }
            initializer { ChangeThemeViewModel(get(), get()) }
            initializer { ToggleThemeViewModel(get()) }
            initializer { NoArgsNavigationFromViewModel(get()) }
            initializer { NoArgsNavigationToViewModel(get()) }
            initializer { ArgsNavigationFromViewModel(get()) }
            initializer { ArgsNavigationToViewModel(get()) }
            initializer { LoaderViewModel(get()) }
            initializer { DataLoaderShowcaseViewModel(get(), get()) }
            initializer { PrimitiveKeyValueViewModel(get(), get()) }
            initializer { ObjectKeyValueViewModel(get(), get()) }
        }
    }
}