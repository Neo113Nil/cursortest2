package com.my.target;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
final class vf implements wb {
    private long e;
    private long f;
    private final zf a = zf.a(o0.h, 15000);
    private final Runnable b = new Runnable() { // from class: com.my.target.vf$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            vf.this.b();
        }
    };
    private final xb c = new xb();
    private u3 d = new u3();
    private volatile Map g = new HashMap();
    private final Map h = new WeakHashMap();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class a {
        public final List a = new ArrayList();
        public final Map b = new HashMap();

        a() {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class b {
        public final List a = new ArrayList();

        b() {
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class c {
        public final long a;
        public final int b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;

        public c(long j, int i, int i2, int i3, String str, String str2) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = str;
            this.f = str2;
        }
    }

    vf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Map map;
        synchronized (this) {
            map = this.g;
            this.g = new HashMap();
        }
        this.c.a(this.d, map);
    }

    @Override // com.my.target.wb
    public void a(u3 u3Var) {
        this.d = u3Var;
        this.e = System.currentTimeMillis();
        this.f = SystemClock.elapsedRealtime();
        this.a.a(this.b);
    }

    @Override // com.my.target.wb
    public void a(t tVar, boolean z, Runnable runnable) {
        synchronized (this) {
            try {
                runnable.run();
                a aVar = (a) this.h.remove(tVar);
                if (z && aVar != null) {
                    this.g.put(tVar, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.my.target.wb
    public void a(t tVar, int i, int i2, int i3, String str, String str2) {
        Map map;
        long a2 = a();
        if (tVar.a() == 2) {
            return;
        }
        c cVar = new c(a2, i, i2, i3, str, str2);
        synchronized (this) {
            try {
                int a3 = tVar.a();
                if (a3 == 0) {
                    map = this.h;
                } else if (a3 != 1) {
                    return;
                } else {
                    map = this.g;
                }
                a aVar = (a) map.get(tVar);
                if (aVar == null) {
                    aVar = new a();
                    map.put(tVar, aVar);
                }
                aVar.a.add(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.my.target.wb
    public void a(w0 w0Var, int i, int i2, int i3, String str, String str2) {
        Map map;
        long a2 = a();
        t a3 = w0Var.a();
        if (a3.a() == 2) {
            return;
        }
        c cVar = new c(a2, i, i2, i3, str, str2);
        synchronized (this) {
            try {
                int a4 = a3.a();
                if (a4 == 0) {
                    map = this.h;
                } else if (a4 != 1) {
                    return;
                } else {
                    map = this.g;
                }
                a aVar = (a) map.get(a3);
                if (aVar == null) {
                    aVar = new a();
                    map.put(a3, aVar);
                }
                b bVar = (b) aVar.b.get(w0Var);
                if (bVar == null) {
                    bVar = new b();
                    aVar.b.put(w0Var, bVar);
                }
                bVar.a.add(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long a() {
        return this.e + (SystemClock.elapsedRealtime() - this.f);
    }
}
