package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yads.ad0;
import yads.ao;
import yads.bd0;
import yads.bn0;
import yads.cf2;
import yads.cl0;
import yads.cn0;
import yads.dc2;
import yads.dd0;
import yads.dg1;
import yads.e30;
import yads.ec2;
import yads.ee0;
import yads.ff2;
import yads.g23;
import yads.gg1;
import yads.gh1;
import yads.gm1;
import yads.go0;
import yads.h23;
import yads.h30;
import yads.h93;
import yads.hg1;
import yads.hu;
import yads.i23;
import yads.iy2;
import yads.j30;
import yads.jh1;
import yads.k30;
import yads.mo;
import yads.oo2;
import yads.p30;
import yads.pm1;
import yads.py2;
import yads.q30;
import yads.ql1;
import yads.rl1;
import yads.ro;
import yads.sb3;
import yads.sc2;
import yads.sm1;
import yads.ta;
import yads.ub0;
import yads.wf1;
import yads.wl1;
import yads.xc0;
import yads.xs2;
import yads.yk0;
import yads.yl1;

/* loaded from: classes4.dex */
public final class i extends ao {
    public gg1 A;
    public h93 B;
    public h30 C;
    public Handler D;
    public ql1 E;
    public Uri F;
    public final Uri G;
    public e30 H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public final wl1 h;
    public final boolean i;
    public final p30 j;
    public final ad0 k;
    public final xc0 l;
    public final cl0 m;
    public final ee0 n;
    public final mo o;
    public final long p;
    public final sm1 q;
    public final dc2 r;
    public final e s;
    public final Object t;
    public final SparseArray u;
    public final Runnable v;
    public final Runnable w;
    public final c x;
    public final hg1 y;
    public q30 z;

    static {
        go0.a("goog.exo.dash");
    }

    public i(wl1 wl1Var, p30 p30Var, dc2 dc2Var, ad0 ad0Var, xc0 xc0Var, cl0 cl0Var, ee0 ee0Var, long j) {
        this.h = wl1Var;
        this.E = wl1Var.d;
        rl1 rl1Var = wl1Var.c;
        rl1Var.getClass();
        this.F = rl1Var.a;
        this.G = wl1Var.c.a;
        this.H = null;
        this.j = p30Var;
        this.r = dc2Var;
        this.k = ad0Var;
        this.m = cl0Var;
        this.n = ee0Var;
        this.p = j;
        this.l = xc0Var;
        this.o = new mo();
        this.i = false;
        this.q = new sm1(this.c.c, 0, null, 0L);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new c(this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new e(this);
        this.y = new f(this);
        this.v = new Runnable() { // from class: com.monetization.ads.exo.source.dash.i$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i.this.h();
            }
        };
        this.w = new Runnable() { // from class: com.monetization.ads.exo.source.dash.i$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                i.this.f();
            }
        };
    }

    @Override // yads.ao
    public final void a(h93 h93Var) {
        this.B = h93Var;
        this.m.prepare();
        cl0 cl0Var = this.m;
        Looper myLooper = Looper.myLooper();
        ff2 ff2Var = this.g;
        if (ff2Var == null) {
            throw new IllegalStateException();
        }
        cl0Var.a(myLooper, ff2Var);
        if (this.i) {
            a(false);
            return;
        }
        this.z = this.j.a();
        this.A = new gg1(DashMediaSource.DEFAULT_MEDIA_ID);
        this.D = sb3.a((Handler.Callback) null);
        h();
    }

    @Override // yads.ao
    public final wl1 c() {
        return this.h;
    }

    @Override // yads.ao
    public final void d() {
        this.y.a();
    }

    @Override // yads.ao
    public final void e() {
        this.I = false;
        this.z = null;
        gg1 gg1Var = this.A;
        if (gg1Var != null) {
            gg1Var.a((dg1) null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.u.clear();
        mo moVar = this.o;
        moVar.a.clear();
        moVar.b.clear();
        moVar.c.clear();
        this.m.release();
    }

    public final /* synthetic */ void f() {
        a(false);
    }

    public final void g() {
        boolean z;
        gg1 gg1Var = this.A;
        a aVar = new a(this);
        synchronized (i23.b) {
            z = i23.c;
        }
        if (z) {
            aVar.a();
            return;
        }
        if (gg1Var == null) {
            gg1Var = new gg1("SntpClient");
        }
        gg1Var.a(new h23(), new g23(aVar), 1);
    }

    public final void h() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        gg1 gg1Var = this.A;
        if (gg1Var.c != null) {
            return;
        }
        if (gg1Var.b()) {
            this.I = true;
            return;
        }
        synchronized (this.t) {
            uri = this.F;
        }
        this.I = false;
        ec2 ec2Var = new ec2(this.z, uri, 4, this.r);
        e eVar = this.s;
        this.n.getClass();
        this.A.a(ec2Var, eVar, 3);
        sm1 sm1Var = this.q;
        sm1Var.c(new wf1(ec2Var.b), new yl1(ec2Var.c, -1, null, 0, null, sm1Var.a(-9223372036854775807L), sm1Var.a(-9223372036854775807L)));
    }

    @Override // yads.ao
    public final gm1 a(pm1 pm1Var, ub0 ub0Var, long j) {
        int intValue = ((Integer) pm1Var.a).intValue() - this.O;
        sm1 sm1Var = new sm1(this.c.c, 0, pm1Var, ((sc2) this.H.m.get(intValue)).b);
        yk0 yk0Var = new yk0(this.d.c, 0, pm1Var);
        int i = this.O + intValue;
        e30 e30Var = this.H;
        mo moVar = this.o;
        ad0 ad0Var = this.k;
        h93 h93Var = this.B;
        cl0 cl0Var = this.m;
        ee0 ee0Var = this.n;
        long j2 = this.L;
        hg1 hg1Var = this.y;
        xc0 xc0Var = this.l;
        c cVar = this.x;
        ff2 ff2Var = this.g;
        if (ff2Var != null) {
            j30 j30Var = new j30(i, e30Var, moVar, intValue, ad0Var, h93Var, cl0Var, yk0Var, ee0Var, sm1Var, j2, hg1Var, ub0Var, xc0Var, cVar, ff2Var);
            this.u.put(i, j30Var);
            return j30Var;
        }
        throw new IllegalStateException();
    }

    @Override // yads.ao
    public final void a(gm1 gm1Var) {
        j30 j30Var = (j30) gm1Var;
        cf2 cf2Var = j30Var.n;
        cf2Var.j = true;
        cf2Var.e.removeCallbacksAndMessages(null);
        for (hu huVar : j30Var.t) {
            huVar.s = j30Var;
            xs2 xs2Var = huVar.n;
            xs2Var.a();
            xs2Var.d();
            for (xs2 xs2Var2 : huVar.o) {
                xs2Var2.a();
                xs2Var2.d();
            }
            huVar.j.a(huVar);
        }
        j30Var.s = null;
        this.u.remove(j30Var.b);
    }

    public final void a(IOException iOException) {
        gh1.b(DashMediaSource.DEFAULT_MEDIA_ID, gh1.a("Failed to resolve time offset.", iOException));
        a(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024d, code lost:
    
        if (r11.b == 3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0587, code lost:
    
        if (r9 > 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x058a, code lost:
    
        if (r11 > 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x058d, code lost:
    
        if (r11 < 0) goto L266;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0453  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [int] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        long elapsedRealtime;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        e30 e30Var;
        long j2;
        long j3;
        long j4;
        long elapsedRealtime2;
        k30 d;
        long j5;
        float f;
        float f2;
        py2 py2Var;
        long j6;
        long j7;
        boolean z5 = false;
        int i = 0;
        while (i < this.u.size()) {
            int keyAt = this.u.keyAt(i);
            if (keyAt >= this.O) {
                j30 j30Var = (j30) this.u.valueAt(i);
                e30 e30Var2 = this.H;
                int i2 = keyAt - this.O;
                j30Var.w = e30Var2;
                j30Var.x = i2;
                cf2 cf2Var = j30Var.n;
                cf2Var.i = z5;
                cf2Var.g = e30Var2;
                Iterator it = cf2Var.f.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < cf2Var.g.h) {
                        it.remove();
                    }
                }
                hu[] huVarArr = j30Var.t;
                if (huVarArr != null) {
                    int length = huVarArr.length;
                    for (?? r10 = z5; r10 < length; r10++) {
                        dd0 dd0Var = huVarArr[r10].f;
                        try {
                            dd0Var.k = e30Var2;
                            dd0Var.l = i2;
                            long a = sb3.a(e30Var2.a(i2));
                            List list = ((sc2) dd0Var.k.m.get(dd0Var.l)).c;
                            ArrayList arrayList = new ArrayList();
                            int[] iArr = dd0Var.c;
                            int i3 = 0;
                            for (int length2 = iArr.length; i3 < length2; length2 = length2) {
                                arrayList.addAll(((ta) list.get(iArr[i3])).c);
                                i3++;
                            }
                            for (int i4 = 0; i4 < dd0Var.i.length; i4++) {
                                oo2 oo2Var = (oo2) arrayList.get(dd0Var.j.b(i4));
                                bd0[] bd0VarArr = dd0Var.i;
                                bd0VarArr[i4] = bd0VarArr[i4].a(a, oo2Var);
                            }
                        } catch (ro e) {
                            dd0Var.m = e;
                        }
                    }
                    j30Var.s.a((iy2) j30Var);
                }
                j30Var.y = ((sc2) e30Var2.m.get(i2)).d;
                for (bn0 bn0Var : j30Var.u) {
                    Iterator it2 = j30Var.y.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            cn0 cn0Var = (cn0) it2.next();
                            String str = cn0Var.c + "/" + cn0Var.d;
                            cn0 cn0Var2 = bn0Var.f;
                            if (str.equals(cn0Var2.c + "/" + cn0Var2.d)) {
                                bn0Var.a(cn0Var, e30Var2.d && i2 == e30Var2.m.size() - 1);
                            }
                        }
                    }
                }
            }
            i++;
            z5 = false;
        }
        sc2 sc2Var = (sc2) this.H.m.get(0);
        int size = this.H.m.size() - 1;
        sc2 sc2Var2 = (sc2) this.H.m.get(size);
        long a2 = sb3.a(this.H.a(size));
        long j8 = this.L;
        if (j8 == -9223372036854775807L) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j8 + SystemClock.elapsedRealtime();
        }
        long a3 = sb3.a(elapsedRealtime);
        long a4 = sb3.a(this.H.a(0));
        long a5 = sb3.a(sc2Var.b);
        for (int i5 = 0; i5 < sc2Var.c.size(); i5++) {
            int i6 = ((ta) sc2Var.c.get(i5)).b;
            if (i6 == 1 || i6 == 2) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        long j9 = a2;
        long j10 = a5;
        int i7 = 0;
        while (true) {
            if (i7 >= sc2Var.c.size()) {
                a5 = j10;
                break;
            }
            ta taVar = (ta) sc2Var.c.get(i7);
            List list2 = taVar.c;
            if ((!z2 || taVar.b != 3) && !list2.isEmpty()) {
                k30 d2 = ((oo2) list2.get(0)).d();
                if (d2 == null || d2.e(a4, a3) == 0) {
                    break;
                } else {
                    j10 = Math.max(j10, d2.a(d2.c(a4, a3)) + a5);
                }
            }
            i7++;
        }
        long a6 = sb3.a(sc2Var2.b);
        for (int i8 = 0; i8 < sc2Var2.c.size(); i8++) {
            int i9 = ((ta) sc2Var2.c.get(i8)).b;
            if (i9 == 1 || i9 == 2) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < sc2Var2.c.size()) {
            ta taVar2 = (ta) sc2Var2.c.get(i10);
            List list3 = taVar2.c;
            if (!z3) {
            }
            if (!list3.isEmpty()) {
                k30 d3 = ((oo2) list3.get(0)).d();
                if (d3 == null) {
                    a6 += j9;
                } else {
                    j6 = j9;
                    long e2 = d3.e(j6, a3);
                    if (e2 != 0) {
                        j7 = a3;
                        long c = (d3.c(j6, a3) + e2) - 1;
                        j11 = Math.min(j11, d3.b(c, j6) + d3.a(c) + a6);
                        i10++;
                        j9 = j6;
                        a3 = j7;
                    }
                }
                j = a3;
                break;
            }
            j7 = a3;
            j6 = j9;
            i10++;
            j9 = j6;
            a3 = j7;
        }
        j = a3;
        a6 = j11;
        if (this.H.d) {
            for (int i11 = 0; i11 < sc2Var2.c.size(); i11++) {
                k30 d4 = ((oo2) ((ta) sc2Var2.c.get(i11)).c.get(0)).d();
                if (d4 != null && !d4.a()) {
                }
            }
            z4 = true;
            if (z4) {
                long j12 = this.H.f;
                if (j12 != -9223372036854775807L) {
                    a5 = Math.max(a5, a6 - sb3.a(j12));
                }
            }
            long j13 = a6 - a5;
            e30Var = this.H;
            if (e30Var.d) {
                j2 = a5;
                j3 = -9223372036854775807L;
                j4 = 0;
            } else {
                long j14 = e30Var.a;
                if (j14 != -9223372036854775807L) {
                    long a7 = (j - sb3.a(j14)) - a5;
                    long b = sb3.b(a7);
                    long j15 = this.h.d.d;
                    if (j15 != -9223372036854775807L) {
                        j5 = Math.min(b, j15);
                    } else {
                        py2 py2Var2 = this.H.j;
                        if (py2Var2 != null) {
                            long j16 = py2Var2.c;
                            if (j16 != -9223372036854775807L) {
                                j5 = Math.min(b, j16);
                            }
                        }
                        j5 = b;
                    }
                    long b2 = sb3.b(a7 - j13);
                    if (b2 < 0 && j5 > 0) {
                        b2 = 0;
                    }
                    long j17 = this.H.c;
                    if (j17 != -9223372036854775807L) {
                        b2 = Math.min(b2 + j17, b);
                    }
                    long j18 = this.h.d.c;
                    if (j18 != -9223372036854775807L) {
                        b2 = Math.max(b2, Math.min(j18, b));
                    } else {
                        py2 py2Var3 = this.H.j;
                        if (py2Var3 != null) {
                            long j19 = py2Var3.b;
                            if (j19 != -9223372036854775807L) {
                                b2 = Math.max(b2, Math.min(j19, b));
                            }
                        }
                    }
                    if (b2 > j5) {
                        j5 = b2;
                    }
                    long j20 = this.E.b;
                    if (j20 != -9223372036854775807L) {
                        j2 = a5;
                    } else {
                        e30 e30Var3 = this.H;
                        py2 py2Var4 = e30Var3.j;
                        j2 = a5;
                        if (py2Var4 != null) {
                            long j21 = py2Var4.a;
                            if (j21 != -9223372036854775807L) {
                                j20 = j21;
                            }
                        }
                        j20 = e30Var3.g;
                        if (j20 == -9223372036854775807L) {
                            j20 = this.p;
                        }
                    }
                    if (j20 < b2) {
                        j20 = b2;
                    }
                    if (j20 > j5) {
                        j20 = Math.max(b2, Math.min(sb3.b(a7 - Math.min(DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US, j13 / 2)), j5));
                    }
                    long j22 = j20;
                    ql1 ql1Var = this.h.d;
                    float f3 = ql1Var.e;
                    if (f3 == -3.4028235E38f) {
                        py2 py2Var5 = this.H.j;
                        f3 = py2Var5 != null ? py2Var5.d : -3.4028235E38f;
                    }
                    float f4 = ql1Var.f;
                    if (f4 == -3.4028235E38f) {
                        py2 py2Var6 = this.H.j;
                        f4 = py2Var6 != null ? py2Var6.e : -3.4028235E38f;
                    }
                    if (f3 == -3.4028235E38f && f4 == -3.4028235E38f && ((py2Var = this.H.j) == null || py2Var.a == -9223372036854775807L)) {
                        f2 = 1.0f;
                        f = 1.0f;
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    this.E = new ql1(j22, b2, j5, f2, f);
                    long b3 = this.H.a + sb3.b(j2);
                    long a8 = a7 - sb3.a(this.E.b);
                    long min = Math.min(DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US, j13 / 2);
                    if (a8 < min) {
                        j3 = b3;
                        j4 = min;
                    } else {
                        j4 = a8;
                        j3 = b3;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            long a9 = j2 - sb3.a(sc2Var.b);
            e30 e30Var4 = this.H;
            a(new b(e30Var4.a, j3, this.L, this.O, a9, j13, j4, e30Var4, this.h, !e30Var4.d ? this.E : null));
            if (this.i) {
                this.D.removeCallbacks(this.w);
                if (z4) {
                    Handler handler = this.D;
                    Runnable runnable = this.w;
                    e30 e30Var5 = this.H;
                    long j23 = this.L;
                    if (j23 == -9223372036854775807L) {
                        elapsedRealtime2 = System.currentTimeMillis();
                    } else {
                        elapsedRealtime2 = j23 + SystemClock.elapsedRealtime();
                    }
                    int size2 = e30Var5.m.size() - 1;
                    sc2 sc2Var3 = (sc2) e30Var5.m.get(size2);
                    long a10 = sb3.a(sc2Var3.b);
                    long a11 = sb3.a(e30Var5.a(size2));
                    long a12 = sb3.a(elapsedRealtime2);
                    long a13 = sb3.a(e30Var5.a);
                    long a14 = sb3.a(5000L);
                    for (int i12 = 0; i12 < sc2Var3.c.size(); i12++) {
                        List list4 = ((ta) sc2Var3.c.get(i12)).c;
                        if (!list4.isEmpty() && (d = ((oo2) list4.get(0)).d()) != null) {
                            long d5 = (d.d(a11, a12) + (a13 + a10)) - a12;
                            if (d5 < a14 - 100000 || (d5 > a14 && d5 < a14 + 100000)) {
                                a14 = d5;
                            }
                        }
                    }
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    roundingMode.getClass();
                    long j24 = a14 / 1000;
                    long j25 = a14 - (j24 * 1000);
                    if (j25 != 0) {
                        int i13 = ((int) ((a14 ^ 1000) >> 63)) | 1;
                        switch (jh1.a[roundingMode.ordinal()]) {
                            case 1:
                                if (j25 != 0) {
                                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                                }
                                if (r3) {
                                    j24 += i13;
                                    break;
                                }
                                break;
                            case 2:
                                if (r3) {
                                }
                                break;
                            case 3:
                                break;
                            case 4:
                                r3 = true;
                                if (r3) {
                                }
                                break;
                            case 5:
                                break;
                            case 6:
                            case 7:
                            case 8:
                                long abs = Math.abs(j25);
                                long abs2 = abs - (Math.abs(1000L) - abs);
                                if (abs2 == 0) {
                                    r3 = (((1 & j24) != 0) & (roundingMode == RoundingMode.HALF_EVEN)) | (roundingMode == RoundingMode.HALF_UP);
                                }
                                if (r3) {
                                }
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    handler.postDelayed(runnable, j24);
                }
                if (this.I) {
                    h();
                    return;
                }
                if (z) {
                    e30 e30Var6 = this.H;
                    if (e30Var6.d) {
                        long j26 = e30Var6.e;
                        if (j26 != -9223372036854775807L) {
                            if (j26 == 0) {
                                j26 = 5000;
                            }
                            this.D.postDelayed(this.v, Math.max(0L, (this.J + j26) - SystemClock.elapsedRealtime()));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        z4 = false;
        if (z4) {
        }
        long j132 = a6 - a5;
        e30Var = this.H;
        if (e30Var.d) {
        }
        long a92 = j2 - sb3.a(sc2Var.b);
        e30 e30Var42 = this.H;
        a(new b(e30Var42.a, j3, this.L, this.O, a92, j132, j4, e30Var42, this.h, !e30Var42.d ? this.E : null));
        if (this.i) {
        }
    }
}
