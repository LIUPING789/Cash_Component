package com.knight.librouter;

import android.app.Activity;
import android.content.Intent;

import java.util.HashMap;
import java.util.Map;

/**
 * description:
 * author: Knight
 * new date: 2024/8/4 on 13:35
 * e-mail: 37442216knight@gmail.com
 * update: 2024/8/4 on 13:35
 * version: v 1.0
 */
public class Router {

    static Map<String, Map<String, Class<?>>> groupMap = new HashMap<>();

    Map<String, Class<?>> routerMap = new HashMap<>();

    Router() {

    }

    public final static class Holder {
        static Router instance = new Router();
    }

    public static Router getInstance() {
        return Holder.instance;
    }

    /**
     * @param path   /main/MainActivity
     * @param zClass
     */
    public void register(String path, Class<?> zClass) {

        String[] strArray = path.split("/");

        if (strArray.length > 2) {
            String groupName = strArray[1];
            String routerName = path;
            Map<String, Class<?>> group = null;
            if (groupMap.containsKey(groupName)) {
                group = groupMap.get(groupName);
            }

            if (group == null) {
                group = new HashMap<>();
                groupMap.put(groupName, group);
            }
            if (group != null) {
                group.put(routerName, zClass);
            }
        }
    }


    public void startActivity(Activity activity, String path) {

        String[] strArray = path.split("/");

        if (strArray.length > 2) {
            String groupName = strArray[1];
            String routerName = path;
            Map<String, Class<?>> group = null;
            if (groupMap.containsKey(groupName)) {
                group = groupMap.get(groupName);
            }

            if (group != null && group.containsKey(routerName)) {
                Class<?> zClass = group.get(routerName);
                activity.startActivity(new Intent(activity, zClass));
            }
        }
    }

}
