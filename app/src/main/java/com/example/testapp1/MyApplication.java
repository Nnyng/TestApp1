package com.example.testapp1;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }

    private void initFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/pridiregular")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

}
