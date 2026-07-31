package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class dg extends rh {
    private int f;
    private int g;
    private int h;

    private dg(String str) {
        super("playheadTimerValue", str, false);
        this.h = 1;
    }

    public static dg b(String str) {
        return new dg(str);
    }

    public void a(int i) {
        this.g = i;
    }

    public void c(int i) {
        this.f = i;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.f;
    }

    public void b(int i) {
        this.h = i;
    }
}
