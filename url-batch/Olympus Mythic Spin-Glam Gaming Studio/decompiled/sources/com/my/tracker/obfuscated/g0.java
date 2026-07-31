package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;

/* loaded from: classes15.dex */
public final class g0 {
    private static volatile g0 l;
    private final h a = new h();
    private final y0 b = new y0();
    private final a0 c = new a0();
    private final l0 d = new l0();
    private final u0 e = new u0();
    private final i1 f = new i1();
    private final a1 g = new a1();
    private final k h = new k();
    private final d0 i = new d0();
    private final p j = new p();
    private final i0 k = new i0();

    private g0() {
    }

    public static g0 a() {
        g0 g0Var;
        g0 g0Var2 = l;
        if (g0Var2 != null) {
            return g0Var2;
        }
        synchronized (g0.class) {
            try {
                g0Var = l;
                if (g0Var == null) {
                    g0Var = new g0();
                    l = g0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g0Var;
    }

    public f0 a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z, int i, boolean z2, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        c0 c0Var;
        z0 a;
        c0 c0Var2;
        h0 h0Var;
        x0 x0Var;
        t0 t0Var;
        k0 k0Var;
        g a2 = this.a.a(context);
        z a3 = this.c.a(context);
        h1 a4 = this.f.a(context);
        j a5 = this.h.a(installedPackagesProvider, context);
        if (z2) {
            x0Var = null;
            c0Var2 = c0.c;
            a = z0.g;
            k0Var = null;
            t0Var = null;
            h0Var = null;
        } else {
            t0 a6 = this.e.a(context);
            k0 a7 = this.d.a(context);
            if (z) {
                c0Var = this.i.b(context);
            } else {
                c0Var = c0.c;
            }
            h0 a8 = this.k.a(context);
            x0 a9 = this.b.a(str, okHttpClientProvider);
            a = this.g.a(i, context);
            c0Var2 = c0Var;
            h0Var = a8;
            x0Var = a9;
            t0Var = a6;
            k0Var = a7;
        }
        return new f0(a2, x0Var, a3, k0Var, t0Var, a4, a, a5, c0Var2, this.j.a(context), h0Var);
    }
}
