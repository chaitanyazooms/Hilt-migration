package com.cmovva.hiltsample

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ApplicationComponent

class AppInitializer private constructor(){
init {
    val entryPoint = EntryPointAccessors.fromApplication(
        AppCore.getSingleton(),
        AppInitializerEntryPoint::class.java
    )
    var remoteConfigService = entryPoint.remoteConfig
}
    companion object{
        fun getInstance(): AppInitializer{
            return AppInitializer()
        }
    }
    @InstallIn(ApplicationComponent::class)
    @EntryPoint
    internal interface AppInitializerEntryPoint {
        val remoteConfig: RemoteConfigService
    }
}