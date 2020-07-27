package com.cmovva.hiltsample.ui.main.di

import com.cmovva.hiltsample.RemoteConfigService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {

    @Provides
    fun getRemoteConfigService(): RemoteConfigService {
        return RemoteConfigService()
    }
}