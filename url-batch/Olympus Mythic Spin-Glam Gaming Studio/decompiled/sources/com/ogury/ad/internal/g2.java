package com.ogury.ad.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class g2 {
    public static final g2 b;
    public static final g2 c;
    public static final g2 d;
    public static final g2 e;
    public static final g2 f;
    public static final g2 g;
    public static final g2 h;
    public static final g2 i;
    public static final g2 j;
    public static final g2 k;
    public static final g2 l;
    public static final g2 m;
    public static final g2 n;
    public static final g2 o;
    public static final g2 p;
    public static final g2 q;
    public static final g2 r;
    public static final /* synthetic */ g2[] s;
    public final int a;

    static {
        g2 g2Var = new g2("DEVICE_ID", 0, 0);
        b = g2Var;
        g2 g2Var2 = new g2("AD_TRACKING_SETTING", 1, 1);
        c = g2Var2;
        g2 g2Var3 = new g2("INSTANCE_TOKEN", 2, 2);
        d = g2Var3;
        g2 g2Var4 = new g2("DEVICE_NAME", 3, 3);
        e = g2Var4;
        g2 g2Var5 = new g2("DEVICE_SIZE", 4, 4);
        f = g2Var5;
        g2 g2Var6 = new g2("DEVICE_ORIENTATION", 5, 5);
        g = g2Var6;
        g2 g2Var7 = new g2("LAYOUT_SIZE", 6, 6);
        h = g2Var7;
        g2 g2Var8 = new g2("UI_MODE", 7, 7);
        i = g2Var8;
        g2 g2Var9 = new g2("TIMEZONE", 8, 8);
        j = g2Var9;
        g2 g2Var10 = new g2("LOCALE_LANGUAGE", 9, 9);
        k = g2Var10;
        g2 g2Var11 = new g2("LOCALE_COUNTRY", 10, 10);
        l = g2Var11;
        g2 g2Var12 = new g2("MOBILE_COUNTRY", 11, 11);
        m = g2Var12;
        g2 g2Var13 = new g2("CONNECTIVITY", 12, 12);
        n = g2Var13;
        g2 g2Var14 = new g2("WEBVIEW_USER_AGENT", 13, 13);
        o = g2Var14;
        g2 g2Var15 = new g2("FRAMEWORK_NAME", 14, 15);
        p = g2Var15;
        g2 g2Var16 = new g2("ARCHITECTURE", 15, 16);
        q = g2Var16;
        g2 g2Var17 = new g2("HPE_EXPERIENCE", 16, 17);
        r = g2Var17;
        g2[] g2VarArr = {g2Var, g2Var2, g2Var3, g2Var4, g2Var5, g2Var6, g2Var7, g2Var8, g2Var9, g2Var10, g2Var11, g2Var12, g2Var13, g2Var14, g2Var15, g2Var16, g2Var17};
        s = g2VarArr;
        EnumEntriesKt.enumEntries(g2VarArr);
    }

    public g2(String str, int i2, int i3) {
        this.a = i3;
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) s.clone();
    }
}
