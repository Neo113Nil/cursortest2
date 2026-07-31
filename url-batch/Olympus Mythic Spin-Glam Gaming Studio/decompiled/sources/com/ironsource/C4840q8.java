package com.ironsource;

/* renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4840q8 {
    public static final int c = 1001;
    private String a;
    private int b;

    public C4840q8(int i, String str) {
        this.b = i;
        this.a = str == null ? "" : str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "error - code:" + this.b + ", message:" + this.a;
    }
}
