package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class xi {
    public final String a;
    public final String b;
    public final String c;

    private xi(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static xi a(String str) {
        return new xi(str, null, null);
    }

    public static xi a(String str, String str2, String str3) {
        return new xi(str, str2, str3);
    }
}
