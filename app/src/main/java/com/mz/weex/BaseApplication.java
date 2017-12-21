package com.mz.weex;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by MZ on 2017/12/21.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this, config);
    }
}
