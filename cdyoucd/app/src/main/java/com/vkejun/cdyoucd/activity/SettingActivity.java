package com.vkejun.cdyoucd.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.vkejun.cdyoucd.R;
import com.vkejun.cdyoucd.config.StatusBarUtils;

public class SettingActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    private Button mBtn;
    private Toolbar toolbar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
//        this.toolbar.setTitle("设置");
//        setSupportActionBar(this.toolbar);
//        ActionBar actionBar = getSupportActionBar();
        //调用设置状态栏颜色
        StatusBarUtils.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
        Log.i(TAG,"onCreate");
        mBtn=(Button)findViewById(R.id.activitysettingLinearLayout1);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SettingActivity.this,CoupleActivity.class);
                startActivity(intent);
            }
        });

    }
}

/*
public class SettingActivity extends BaseActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private LinearLayout theme1;

    private void initData() {
        this.toolbar.setTitle("设置");
        setSupportActionBar(this.toolbar);
        ActionBar actionBar = getSupportActionBar();
        //调用设置状态栏颜色
        StatusBarUtils.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
//        if (actionBar != null)
//            actionBar.setDisplayHomeAsUpEnabled(true);
//        //getFragmentManager().beginTransaction().add(R.id.setting_Content, new SettingFragment()).commit();
//        new ArcBg.ShaderView(this);

    }

    private void initView() {
        this.toolbar = (Toolbar)findViewById(R.id.toolbar);
        this.theme1 = (LinearLayout)findViewById(R.id.activitysettingLinearLayout1);
        this.theme1.setOnClickListener(this);
    }

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layou  t.activity_setting);
        initView();
        initData();
    }

    public boolean onOptionsItemSelected(MenuItem paramMenuItem) {
        if (paramMenuItem.getItemId() == 16908332)
            finish();
        return super.onOptionsItemSelected(paramMenuItem);
    }

    @Override
    public void onClick(View paramView) {
        switch (paramView.getId()) {
            default:
                return;
            case 0:
                setThemeKey("1123");
                recreate();
                return;
            case 1:
                break;
        }
        setThemeKey("sakura");
        recreate();
    }
}
*/
