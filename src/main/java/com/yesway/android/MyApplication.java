package com.yesway.android;

import android.app.Application;

import com.yesway.android.net.ApiManager;
import com.yesway.android.net.util.EnvironmentUtils;

/**
 * Description: <><br>
 * Author:      mxdl<br>
 * Date:        2018/6/6<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApiManager.getInstance().setAppKey("androida-3e1d-45c0-9353-46a12984f0d4");
        ApiManager.getInstance().setVersionName(EnvironmentUtils.getAppVersionName(getApplicationContext()));
        ApiManager.getInstance().setVersionCode(EnvironmentUtils.getAppVersionCode(getApplicationContext()));
    }
}
