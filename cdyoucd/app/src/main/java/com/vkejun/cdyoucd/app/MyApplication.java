package com.vkejun.cdyoucd.app;

import android.app.Application;
import android.util.Base64;

import cn.bmob.v3.Bmob;
//bea552b8866c81213fc45126b4fcd1ff
//YmVhNTUyYjg4NjZjODEyMTNmYzQ1MTI2YjRmY2QxZmYK
public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this, new String(Base64.decode((new String(Base64.decode("WW1WaE5UVXlZamc0Tmpaak9ERXlNVE5tWXpRMU1USTJZalJtWTJReFptWUsK".getBytes(), 0))).getBytes(), 0)));
        //Bugly.init(getApplicationContext(), "3222489be8", false);
    }
}
