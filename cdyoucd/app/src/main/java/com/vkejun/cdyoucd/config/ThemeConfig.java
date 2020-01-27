package com.vkejun.cdyoucd.config;

public class ThemeConfig {
    private int color_bar;

    private int color_text;

    private int themedialogid;

    private int themeid;

    public ThemeConfig(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        this.color_bar = paramInt1;
        this.color_text = paramInt2;
        this.themeid = paramInt3;
        this.themedialogid = paramInt4;
    }

    public int getColor_bar() { return this.color_bar; }

    public int getColor_text() { return this.color_text; }

    public int getThemedialogid() { return this.themedialogid; }

    public int getThemeid() { return this.themeid; }
}
