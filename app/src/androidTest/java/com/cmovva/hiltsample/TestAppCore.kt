package com.cmovva.hiltsample

import dagger.hilt.android.testing.OnComponentReadyRunner

open class TestAppCore : AppCore(){
    override fun onCreate() {
        OnComponentReadyRunner.addListener(
            this,
            Object::class.java
        ) { super.onCreate()}

    }
}