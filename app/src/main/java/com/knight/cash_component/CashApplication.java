package com.knight.cash_component;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * description:
 * author: Knight
 * new date: 2024/8/4 on 13:53
 * e-mail: 37442216knight@gmail.com
 * update: 2024/8/4 on 13:53
 * version: v 1.0
 */
public class CashApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        Router.getInstance().register("/main/MainActivity", MainActivity.class);
//        Router.getInstance().register("/login/LoginActivity", LoginActivity.class);
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);
    }
}

