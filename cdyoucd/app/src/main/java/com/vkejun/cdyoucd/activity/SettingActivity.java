package com.vkejun.cdyoucd.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import com.vkejun.cdyoucd.R;
import com.vkejun.cdyoucd.fragment.SettingFragment;

public class SettingActivity extends BaseActivity {
    private Toolbar toolbar;

    private void initData() {
        this.toolbar.setTitle("设置");
        setSupportActionBar(this.toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(true);
        //getFragmentManager().beginTransaction().add(R.id.setting_Content, new SettingFragment()).commit();
    }

    private void initView() { this.toolbar = (Toolbar)findViewById(R.id.toolbar); }

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_setting);
        initView();
        initData();
    }

    public boolean onOptionsItemSelected(MenuItem paramMenuItem) {
        if (paramMenuItem.getItemId() == 16908332)
            finish();
        return super.onOptionsItemSelected(paramMenuItem);
    }
}
