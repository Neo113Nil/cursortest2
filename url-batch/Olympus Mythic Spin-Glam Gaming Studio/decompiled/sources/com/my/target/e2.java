package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class e2 {
    public static final e2 p = new e2(4096);
    public static final e2 q = new e2(64);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    private final int o;

    private e2(int i) {
        this.o = i;
        this.a = (i & 1) == 1;
        this.b = (i & 2) == 2;
        this.c = (i & 4) == 4;
        this.d = (i & 8) == 8;
        this.e = (i & 16) == 16;
        this.f = (i & 32) == 32;
        this.g = (i & 64) == 64;
        this.h = (i & 128) == 128;
        this.i = (i & 256) == 256;
        this.j = (i & 512) == 512;
        this.k = (i & 1024) == 1024;
        this.l = (i & 2048) == 2048;
        this.m = (i & 4096) == 4096;
        this.n = (i & 8192) == 8192;
    }

    public static e2 a(int i) {
        return new e2(i);
    }

    public int a() {
        return this.o;
    }
}
