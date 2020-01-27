package com.vkejun.cdyoucd.config;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activitys = new ArrayList();

    public static void addActivity(Activity paramActivity) { activitys.add(paramActivity); }

    public static void finishAll() {
        for (Activity activity : activitys) {
            if (!activity.isFinishing())
                activity.finish();
        }
        activitys.clear();
    }

    public static void removeActivity(Activity paramActivity) { activitys.remove(paramActivity); }
}
