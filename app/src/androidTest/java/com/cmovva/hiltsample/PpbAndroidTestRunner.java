package com.cmovva.hiltsample;

import android.app.Application;
import android.content.Context;
import androidx.test.runner.AndroidJUnitRunner;

/**
 * Custom Test runner for running functional tests and override with TestAppCore instead of AppCore.
 * This allows ApplicationTestInitialization to load test modules.
 */

public final class PpbAndroidTestRunner extends AndroidJUnitRunner {

    @Override
    public void onStart() {

        super.onStart();
    }

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, HiltTestApplication_Application.class.getName(), context);
    }

    @Override
    public void onDestroy() {

        super.onDestroy();
    }
}
