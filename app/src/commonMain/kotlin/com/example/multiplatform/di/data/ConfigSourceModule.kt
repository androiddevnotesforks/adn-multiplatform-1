package com.example.multiplatform.di.data

import com.example.multiplatform.data.source.config.AppConfigSource
import shared.data.source.config.ConfigSource
import org.koin.dsl.bind
import org.koin.dsl.module

val configSourceModule = module {
    single { AppConfigSource() }.bind(ConfigSource::class)
}