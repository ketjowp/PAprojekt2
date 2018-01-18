package com.example.wojtek.nauka_pa;

/**
 * Created by Wojtek on 12.01.2018.
 */

import android.app.Application;
import android.content.Context;

public class app extends Application {

    private static Application sApplication;

    public static Application getApplication() {
        return sApplication;
    }

    public static Context getContext() {
        return getApplication().getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
    }
}