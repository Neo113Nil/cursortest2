package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.fe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4649fe {
    private static final int o = 0;
    private ArrayList<C4684hd> a;
    private J1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private C4684hd l;
    private C4869s2 m;
    private boolean n;

    public C4649fe() {
        this.a = new ArrayList<>();
        this.b = new J1();
    }

    public void a(C4684hd c4684hd) {
        if (c4684hd != null) {
            this.a.add(c4684hd);
            if (this.l == null) {
                this.l = c4684hd;
            } else if (c4684hd.a(0)) {
                this.l = c4684hd;
            }
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.n;
    }

    public ArrayList<C4684hd> e() {
        return this.a;
    }

    public boolean f() {
        return this.i;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean j() {
        return this.d;
    }

    public C4869s2 k() {
        return this.m;
    }

    public long l() {
        return this.h;
    }

    public J1 m() {
        return this.b;
    }

    public boolean n() {
        return this.k;
    }

    public boolean o() {
        return this.j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }

    public C4649fe(int i, boolean z, int i2, int i3, J1 j1, C4869s2 c4869s2, int i4, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = j1;
        this.f = i3;
        this.m = c4869s2;
        this.g = i4;
        this.n = z2;
        this.h = j;
        this.i = z3;
        this.j = z4;
        this.k = z5;
    }

    public C4684hd a(String str) {
        Iterator<C4684hd> it = this.a.iterator();
        while (it.hasNext()) {
            C4684hd next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public C4684hd a() {
        Iterator<C4684hd> it = this.a.iterator();
        while (it.hasNext()) {
            C4684hd next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.l;
    }
}
