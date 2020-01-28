package com.vkejun.cdyoucd.bmob;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

public class MyUser extends BmobUser {
    private String deviceID;

    private boolean fengHao;

    private BmobFile icon;

    private boolean loginQQ;

    private String qq;

    private String txUrl;

    public String getDeviceID() { return this.deviceID; }

    public BmobFile getIcon() { return this.icon; }

    public String getQq() { return this.qq; }

    public String getTxUrl() { return this.txUrl; }

    public boolean isFengHao() { return this.fengHao; }

    public boolean isloginQQ() { return this.loginQQ; }

    public void setDeviceID(String paramString) { this.deviceID = paramString; }

    public void setFengHao(boolean paramBoolean) { this.fengHao = paramBoolean; }

    public void setIcon(BmobFile paramBmobFile) { this.icon = paramBmobFile; }

    public void setQq(String paramString) { this.qq = paramString; }

    public void setTxUrl(String paramString) { this.txUrl = paramString; }

    public void setloginQQ(boolean paramBoolean) { this.loginQQ = paramBoolean; }
}
