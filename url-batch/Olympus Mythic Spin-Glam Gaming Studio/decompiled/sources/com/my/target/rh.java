package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class rh {
    private final String a;
    private final String b;
    private String c;
    private boolean d;
    private boolean e = true;

    protected rh(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.d = z;
    }

    public static rh a(String str, String str2, boolean z) {
        return new rh(str, str2, z);
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public void f() {
        this.d = true;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }
}
