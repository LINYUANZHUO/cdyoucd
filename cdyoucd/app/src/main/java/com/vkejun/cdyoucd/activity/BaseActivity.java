package com.vkejun.cdyoucd.activity;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.vkejun.cdyoucd.R;
import com.vkejun.cdyoucd.config.ActivityCollector;
import com.vkejun.cdyoucd.config.ThemeConfig;

import java.util.HashMap;
import java.util.Map;

public class BaseActivity extends AppCompatActivity {
    SharedPreferences sp;
    ThemeConfig tconfig;

    private Map<String, ThemeConfig> getStyles() {
        HashMap hashMap = new HashMap();
        hashMap.put("sakura", new ThemeConfig(getcolor(R.color.sakura), getcolor(R.color.sakura_text), R.style.sakura, R.style.sakuradialog));
        hashMap.put("初然", new ThemeConfig(getcolor(R.color.初然), getcolor(R.color.初然_text), R.style.初然, R.style.初然dialog));
        return hashMap;
    }

    private int getcolor(int paramInt) {
        return ContextCompat.getColor(this, paramInt);
    }

    private void initTheme() {
        this.tconfig = (ThemeConfig)getStyles().get(getThemeKey());
        if (this.tconfig == null) {
            this.tconfig = (ThemeConfig)getStyles().get("初然");
            setThemeKey("初然");
        }
        setTheme(this.tconfig.getThemeid());
    }

    protected void onCreate(@Nullable Bundle paramBundle) {
        super.onCreate(paramBundle);
        ActivityCollector.addActivity(this);
        this.sp = getSharedPreferences("theme", 0);
        initTheme();
    }

    public void setThemeKey(String paramString) {
        this.sp.edit().putString("themekey", paramString).apply();
    }

    public String getThemeKey() {
        return this.sp.getString("themekey", "初然");
    }

}
