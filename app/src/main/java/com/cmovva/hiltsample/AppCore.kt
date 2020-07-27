package com.cmovva.hiltsample

import android.app.Application
import com.google.android.play.core.splitcompat.SplitCompatApplication

open class AppCore: Application() {

    companion object{
        lateinit var instance:AppCore
        fun getSingleton(): AppCore{
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        var initializer = AppInitializer.getInstance()
    }
}