package com.safedk.android.analytics.brandsafety;

/* loaded from: classes12.dex */
public class u {
    private String a;
    private String b;
    private long c;

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public long b() {
        return this.c;
    }

    public void a(long j) {
        this.c = j;
    }

    private u() {
        this.c = 0L;
    }

    public u(String str, String str2, long j) {
        this.c = 0L;
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public String c() {
        return a(this.a, this.c);
    }

    public static String a(String str, long j) {
        return str + "_" + j;
    }
}
