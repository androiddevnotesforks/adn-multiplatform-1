package com.example.multiplatform.di

import com.example.multiplatform.di.data.configSourceModule
import com.example.multiplatform.di.data.keyValueSourceModule
import com.example.multiplatform.di.presentation.appModule
import com.example.multiplatform.di.presentation.navigationModule
import com.example.multiplatform.di.presentation.themeModule
import com.example.multiplatform.platform.configureKoin
import org.koin.core.context.startKoin

val koinApp = startKoin {
    printLogger()
    modules(
        configSourceModule,
        keyValueSourceModule,
        navigationModule,
        themeModule,
        appModule,
    )
    configureKoin(this)
}

inline fun <reified T : Any> get(): T = koinApp.koin.get<T>()