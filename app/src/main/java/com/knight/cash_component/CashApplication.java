package com.knight.cash_component;

import android.app.Application;

import com.knight.librouter.Router;
import com.knight.login.LoginActivity;
import com.knight.module.main.MainActivity;

/**
 * description:
 * author: Knight
 * new date: 2024/8/4 on 13:53
 * e-mail: 37442216knight@gmail.com
 * update: 2024/8/4 on 13:53
 * version: v 1.0
 */
class CashApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Router.getInstance().register("/main/MainActivity", MainActivity.class);
        Router.getInstance().register("/main/MainActivity", LoginActivity.class);
    }
}

