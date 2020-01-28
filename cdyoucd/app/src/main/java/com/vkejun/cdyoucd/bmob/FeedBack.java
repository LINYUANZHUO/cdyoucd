package com.vkejun.cdyoucd.bmob;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

public class FeedBack extends BmobObject {
    private String content;

    private String email;

    private BmobFile tp;

    private String tpUrl;

    private MyUser user;

    public String getContent() { return this.content; }

    public String getEmail() { return this.email; }

    public BmobFile getTp() { return this.tp; }

    public String getTpUrl() { return this.tpUrl; }

    public MyUser getUser() { return this.user; }

    public void setContent(String paramString) { this.content = paramString; }

    public void setEmail(String paramString) { this.email = paramString; }

    public void setTp(BmobFile paramBmobFile) { this.tp = paramBmobFile; }

    public void setTpUrl(String paramString) { this.tpUrl = paramString; }

    public void setUser(MyUser paramMyUser) { this.user = paramMyUser; }
}

