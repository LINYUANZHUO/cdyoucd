package com.vkejun.cdyoucd.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.vkejun.cdyoucd.R;
import com.vkejun.cdyoucd.config.MToast;
import com.vkejun.cdyoucd.config.StatusBarUtils;
import com.vkejun.cdyoucd.config.StatusbarColorUtils;
import com.vkejun.cdyoucd.fragment.F1;
import com.vkejun.cdyoucd.fragment.F2;
import com.vkejun.cdyoucd.fragment.F3;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener{
    private BottomNavigationBar bottomNavigationBar;
    private F1 f1q;
    private F2 f2q;
    private F3 f3q;
    private long firstTime;
    private int paramInt;

    @Override
    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main);
        initBottomNavBar(paramInt);
        initTab();
        this.bottomNavigationBar.setTabSelectedListener(this);
        //StatusbarColorUtils.setStatusBarDarkIcon(this,false);  //参数 false 白色 true 黑色  无效。。。
        //调用设置状态栏颜色
        StatusBarUtils.setColor(this, getResources().getColor(R.color.colorPrimaryDark));
        //图片置顶
        //StatusBarUtils.setTransparent(this);
    }
    //白底黑字--安卓6.0及以上进行适配
//    private static void darkModeForM(Window window, boolean dark) {
//
//        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
//        if (dark) {
//            systemUiVisibility |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
//        } else {
//            systemUiVisibility &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
//        }
//        window.getDecorView().setSystemUiVisibility(systemUiVisibility);
//    }
    /**
     * 状态栏透明
     * @param activity
     */
    @TargetApi(19)
    public static void transparencyBar(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
            );
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = activity.getWindow();
            window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
    private void initBottomNavBar(int paramInt){
        /*1.首先进行fvb*/
        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_nav_bar);
        /*2.进行必要的设置*/
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);//适应大小
        bottomNavigationBar.setBarBackgroundColor(R.color.di)  //背景
                .setActiveColor(R.color.xx)  //选中
                .setInActiveColor(R.color.ww);  //未选中

        /*3.添加Tab*/
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.home,R.string.f1))
                .addItem(new BottomNavigationItem(R.drawable.gj,R.string.f2))
                .addItem(new BottomNavigationItem(R.drawable.my,R.string.f3))
                .setFirstSelectedPosition(paramInt)//默认显示面板
                .initialise();
    }
    private void initTab(){
        f1q = new F1();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_content,f1q);
        transaction.commit();
    }
//判断底部点击
    @Override
    public void onTabSelected(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (position){
            case 0:
                if(f1q== null){
                    f1q= new F1();
                }

                transaction.replace(R.id.frame_content,f1q);
                break;
            case 1:
                if(f2q == null){
                    f2q = new F2();
                }                transaction.replace(R.id.frame_content,f2q);
                break;
            case 2:
                if(f3q == null){
                    f3q = new F3();
                }
                transaction.replace(R.id.frame_content,f3q);
                break;
        }
        transaction.commit();
    }

    //双击返回键退出程序判断
    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
        if (paramInt == 4 && paramKeyEvent.getAction() == 0) {
            long l = System.currentTimeMillis();
            if (l - this.firstTime > 2000L) {
                MToast.show(this, "再按一次退出程序");
                this.firstTime = l;
                return true;
            }
            finish();
        }
        return onKeyUp(paramInt, paramKeyEvent);
    }



    @Override
    public void onTabUnselected(int position) {}
    @Override
    public void onTabReselected(int position) {}
}
