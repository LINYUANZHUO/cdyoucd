package com.vkejun.cdyoucd.bmob;

import com.vkejun.cdyoucd.activity.CoupleActivity;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.listener.SaveListener;

/*
反馈
 */
public class Couple extends BmobObject
{
    private String fankuineirong;
    private String lianxiQQ;

    public String getName()
    {
        return fankuineirong;
    }
    public void setName(String name)
    {
        this.fankuineirong= name;
    }
    public String getAddress()
    {
        return lianxiQQ;
    }
    public void setAddress(String address)
    {
        this.lianxiQQ= address;
    }

    public void save(CoupleActivity coupleActivity, SaveListener 反馈成功) {

    }
}
