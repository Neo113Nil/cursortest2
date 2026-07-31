package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public class E9 {
    private static final int n = 0;
    private ArrayList<I9> a;
    private J1 b;
    private int c;
    private boolean d;
    private int e;
    private int f;
    private C4869s2 g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private I9 m;

    public E9() {
        this.a = new ArrayList<>();
        this.b = new J1();
        this.g = new C4869s2();
    }

    public void a(I9 i9) {
        if (i9 != null) {
            this.a.add(i9);
            if (this.m == null) {
                this.m = i9;
            } else if (i9.a(0)) {
                this.m = i9;
            }
        }
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.e);
    }

    public boolean f() {
        return this.d;
    }

    public C4869s2 g() {
        return this.g;
    }

    public long h() {
        return this.i;
    }

    public J1 i() {
        return this.b;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.l;
    }

    public boolean m() {
        return this.k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.c + ", bidderExclusive=" + this.d + '}';
    }

    public E9(int i, boolean z, int i2, J1 j1, C4869s2 c4869s2, int i3, boolean z2, long j, boolean z3, boolean z4, boolean z5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = j1;
        this.g = c4869s2;
        this.j = z3;
        this.k = z4;
        this.f = i3;
        this.h = z2;
        this.i = j;
        this.l = z5;
    }

    public I9 a(String str) {
        Iterator<I9> it = this.a.iterator();
        while (it.hasNext()) {
            I9 next = it.next();
            if (next.c().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public I9 a() {
        Iterator<I9> it = this.a.iterator();
        while (it.hasNext()) {
            I9 next = it.next();
            if (next.d()) {
                return next;
            }
        }
        return this.m;
    }
}
