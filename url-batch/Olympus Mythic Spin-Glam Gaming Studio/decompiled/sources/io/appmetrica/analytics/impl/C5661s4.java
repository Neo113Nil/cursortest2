package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.s4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5661s4 {
    public static volatile C5661s4 y;
    public final J6 a;
    public final V7 b;
    public final C5402i4 c;
    public final S1 d;
    public final C5552o e;
    public final C5627ql f;
    public final U5 g;
    public final C5500m h;
    public final Cn i;
    public Pd j;
    public final C5683t0 k;
    public volatile C5583p4 l;
    public final C5514md m;
    public volatile C5594pf n;
    public volatile C5594pf o;
    public C5650rj p;
    public final B0 q;
    public final X1 r;
    public final C5849za s;
    public volatile C5269d0 t;
    public volatile C5382ha u;
    public volatile Y7 v;
    public volatile C5687t4 w;
    public volatile C5549nm x;

    public C5661s4(J6 j6, C5552o c5552o, C5402i4 c5402i4) {
        this(j6, c5552o, c5402i4, new C5500m(c5552o));
    }

    public static C5661s4 l() {
        if (y == null) {
            synchronized (C5661s4.class) {
                try {
                    if (y == null) {
                        y = new C5661s4(new J6(), new C5552o(), new C5402i4());
                    }
                } finally {
                }
            }
        }
        return y;
    }

    public final C5552o a() {
        return this.e;
    }

    public final C5594pf b(Context context) {
        C5594pf c5594pf = this.n;
        if (c5594pf == null) {
            synchronized (this) {
                try {
                    c5594pf = this.n;
                    if (c5594pf == null) {
                        C5687t4 e = e(context);
                        new C5505m4(c(context)).a(context);
                        C5594pf c5594pf2 = new C5594pf(e.a(context));
                        this.n = c5594pf2;
                        c5594pf = c5594pf2;
                    }
                } finally {
                }
            }
        }
        return c5594pf;
    }

    public final C5683t0 c() {
        return this.k;
    }

    public final C5549nm d(Context context) {
        C5549nm c5549nm = this.x;
        if (c5549nm == null) {
            synchronized (this) {
                try {
                    c5549nm = this.x;
                    if (c5549nm == null) {
                        c5549nm = new C5549nm(context, b(context));
                        this.x = c5549nm;
                    }
                } finally {
                }
            }
        }
        return c5549nm;
    }

    public final S1 e() {
        return this.d;
    }

    public final X1 f() {
        return this.r;
    }

    public final C5402i4 g() {
        return this.c;
    }

    public final U5 h() {
        return this.g;
    }

    public final J6 i() {
        return this.a;
    }

    public final V7 j() {
        return this.b;
    }

    public final C5849za k() {
        return this.s;
    }

    public final C5583p4 m() {
        C5583p4 c5583p4 = this.l;
        if (c5583p4 == null) {
            synchronized (this) {
                try {
                    c5583p4 = this.l;
                    if (c5583p4 == null) {
                        c5583p4 = new C5583p4();
                        this.l = c5583p4;
                    }
                } finally {
                }
            }
        }
        return c5583p4;
    }

    public final J6 n() {
        return this.a;
    }

    public final C5627ql o() {
        return this.f;
    }

    public C5661s4(J6 j6, C5552o c5552o, C5402i4 c5402i4, C5500m c5500m) {
        this(j6, new V7(), c5402i4, c5500m, new S1(), c5552o, new C5627ql(c5552o, c5500m), new U5(c5552o), new Cn(), new C5683t0());
    }

    public final synchronized Pd a(Context context) {
        try {
            if (this.j == null) {
                this.j = new Pd(context, new Eo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final C5594pf c(Context context) {
        C5594pf c5594pf = this.o;
        if (c5594pf == null) {
            synchronized (this) {
                try {
                    c5594pf = this.o;
                    if (c5594pf == null) {
                        C5594pf c5594pf2 = new C5594pf(e(context).b(context));
                        this.o = c5594pf2;
                        c5594pf = c5594pf2;
                    }
                } finally {
                }
            }
        }
        return c5594pf;
    }

    public final C5687t4 e(Context context) {
        File file;
        C5687t4 c5687t4 = this.w;
        if (c5687t4 == null) {
            synchronized (this) {
                c5687t4 = this.w;
                if (c5687t4 == null) {
                    String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                    String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                    if (StringsKt.isBlank(readSystemProperty)) {
                        readSystemProperty = readSystemProperty2;
                    }
                    if (!StringsKt.isBlank(readSystemProperty)) {
                        file = new File(readSystemProperty, context.getPackageName());
                        try {
                            file.mkdirs();
                        } catch (Exception unused) {
                        }
                        c5687t4 = new C5687t4(file);
                        this.w = c5687t4;
                    }
                    file = null;
                    c5687t4 = new C5687t4(file);
                    this.w = c5687t4;
                }
            }
        }
        return c5687t4;
    }

    public C5661s4(J6 j6, V7 v7, C5402i4 c5402i4, C5500m c5500m, S1 s1, C5552o c5552o, C5627ql c5627ql, U5 u5, Cn cn, C5683t0 c5683t0) {
        this.m = new C5514md();
        this.q = new B0();
        this.r = new X1();
        this.s = new C5849za();
        new U7();
        this.v = new Y7();
        this.a = j6;
        this.b = v7;
        this.c = c5402i4;
        this.h = c5500m;
        this.d = s1;
        this.e = c5552o;
        this.f = c5627ql;
        this.g = u5;
        this.i = cn;
        this.k = c5683t0;
    }

    public final B0 d() {
        return this.q;
    }

    public final C5269d0 b() {
        C5269d0 c5269d0 = this.t;
        if (c5269d0 == null) {
            synchronized (this) {
                try {
                    c5269d0 = this.t;
                    if (c5269d0 == null) {
                        c5269d0 = new C5269d0(this.q, this.f, this.c);
                        this.t = c5269d0;
                    }
                } finally {
                }
            }
        }
        return c5269d0;
    }
}
