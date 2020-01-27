package com.vkejun.cdyoucd.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.vkejun.cdyoucd.R;
import com.vkejun.cdyoucd.activity.SettingActivity;

public class F3 extends Fragment
{
    private Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_my_c, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        this.toolbar = ((Toolbar)getActivity().findViewById(R.id.toolbar));
        this.toolbar.setTitle("我的");
        setHasOptionsMenu(true);
        ((AppCompatActivity)getActivity()).setSupportActionBar(this.toolbar);

        //创建布局后，这里写代码逻辑
        //CardView c1=(CardView)getActivity().findViewById(R.id.fragment_mydataImageView);
        //Button b1=(Button)getActivity().findViewById(R.id.fragment_mydataButton);
        //LinearLayout l1=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout1);
        //LinearLayout l2=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout2);
        //LinearLayout l3=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout3);
        //LinearLayout l4=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout4);
        LinearLayout l5=(LinearLayout)getActivity().findViewById(R.id.fragmentmydatamainLinearLayout5);//声明实例
        //注意getActivity()方法
        /*
        c1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1){
                //你要的跳转设置的点击事件
                Intent qs = new Intent(getActivity(),
                        SettingActivity.class);//这个就是意图
                getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
            }});
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1){
                //你要的跳转设置的点击事件
                Intent qs = new Intent(getActivity(),
                        SettingActivity.class);//这个就是意图
                getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
            }});
        l1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1){
                //你要的跳转设置的点击事件
                Intent qs = new Intent(getActivity(),
                        SettingActivity.class);//这个就是意图
                getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
            }});
        l2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1){
                //你要的跳转设置的点击事件
                Intent qs = new Intent(getActivity(),
                        SettingActivity.class);//这个就是意图
                getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
            }});
        l3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1){
                //你要的跳转设置的点击事件
                Intent qs = new Intent(getActivity(),
                        SettingActivity.class);//这个就是意图
                getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
            }});l5.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View p1){
            //你要的跳转设置的点击事件
            Intent qs = new Intent(getActivity(),
                    SettingActivity.class);//这个就是意图
            getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
        }});
        l4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1){
                //你要的跳转设置的点击事件
                Intent qs = new Intent(getActivity(),
                        SettingActivity.class);//这个就是意图
                getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
            }});
         */
        l5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View p1){
                //你要的跳转设置的点击事件
                Intent qs = new Intent(getActivity(),
                        SettingActivity.class);//这个就是意图
                getActivity().startActivity(qs);//表示从当前布局跳转到SettingActivity这个意图
            }});
    }
}
