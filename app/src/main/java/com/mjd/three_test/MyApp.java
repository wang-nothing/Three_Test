package com.mjd.three_test;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by admin on 2018-8-20.
 */

public class MyApp extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
