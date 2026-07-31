package yads;

import android.net.Uri;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class hu implements ys2, iy2, zf1, dg1 {
    public final int b;
    public final int[] c;
    public final jw0[] d;
    public final boolean[] e;
    public final dd0 f;
    public final j30 g;
    public final sm1 h;
    public final ee0 i;
    public final gg1 j = new gg1("ChunkSampleStream");
    public final du k = new du();
    public final ArrayList l;
    public final List m;
    public final xs2 n;
    public final xs2[] o;
    public final zn p;
    public au q;
    public jw0 r;
    public j30 s;
    public long t;
    public long u;
    public int v;
    public xn w;
    public boolean x;

    public hu(int i, int[] iArr, jw0[] jw0VarArr, dd0 dd0Var, j30 j30Var, ub0 ub0Var, long j, cl0 cl0Var, yk0 yk0Var, ee0 ee0Var, sm1 sm1Var) {
        this.b = i;
        this.c = iArr;
        this.d = jw0VarArr;
        this.f = dd0Var;
        this.g = j30Var;
        this.h = sm1Var;
        this.i = ee0Var;
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        this.m = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.o = new xs2[length];
        this.e = new boolean[length];
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        xs2[] xs2VarArr = new xs2[i2];
        cl0Var.getClass();
        xs2 xs2Var = new xs2(ub0Var, cl0Var, yk0Var);
        this.n = xs2Var;
        int i3 = 0;
        iArr2[0] = i;
        xs2VarArr[0] = xs2Var;
        while (i3 < length) {
            xs2 xs2Var2 = new xs2(ub0Var, null, null);
            this.o[i3] = xs2Var2;
            int i4 = i3 + 1;
            xs2VarArr[i4] = xs2Var2;
            iArr2[i4] = this.c[i3];
            i3 = i4;
        }
        this.p = new zn(iArr2, xs2VarArr);
        this.t = j;
        this.u = j;
    }

    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2, boolean z) {
        au auVar = (au) cg1Var;
        this.q = null;
        this.w = null;
        long j3 = auVar.a;
        Uri uri = auVar.i.c;
        wf1 wf1Var = new wf1();
        this.i.getClass();
        sm1 sm1Var = this.h;
        sm1Var.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var.a(auVar.g), sm1Var.a(auVar.h)));
        if (z) {
            return;
        }
        if (d()) {
            this.n.b(false);
            for (xs2 xs2Var : this.o) {
                xs2Var.b(false);
            }
        } else if (auVar instanceof xn) {
            a(this.l.size() - 1);
            if (this.l.isEmpty()) {
                this.t = this.u;
            }
        }
        j30 j30Var = this.g;
        j30Var.s.a((iy2) j30Var);
    }

    @Override // yads.dg1
    public final void b() {
        xs2 xs2Var = this.n;
        xs2Var.b(true);
        xs2Var.d();
        for (xs2 xs2Var2 : this.o) {
            xs2Var2.b(true);
            xs2Var2.d();
        }
        for (bd0 bd0Var : this.f.i) {
            cu cuVar = bd0Var.a;
            if (cuVar != null) {
                ((qq) cuVar).b.release();
            }
        }
        j30 j30Var = this.s;
        if (j30Var != null) {
            synchronized (j30Var) {
                bf2 bf2Var = (bf2) j30Var.o.remove(this);
                if (bf2Var != null) {
                    xs2 xs2Var3 = bf2Var.a;
                    xs2Var3.b(true);
                    xs2Var3.d();
                }
            }
        }
    }

    @Override // yads.ys2
    public final boolean c() {
        return !d() && this.n.a(this.x);
    }

    public final boolean d() {
        return this.t != -9223372036854775807L;
    }

    public final void e() {
        xs2 xs2Var = this.n;
        int a = a(xs2Var.q + xs2Var.s, this.v - 1);
        while (true) {
            int i = this.v;
            if (i > a) {
                return;
            }
            this.v = i + 1;
            xn xnVar = (xn) this.l.get(i);
            jw0 jw0Var = xnVar.d;
            if (!jw0Var.equals(this.r)) {
                sm1 sm1Var = this.h;
                sm1Var.a(new yl1(1, this.b, jw0Var, xnVar.e, xnVar.f, sm1Var.a(xnVar.g), -9223372036854775807L));
            }
            this.r = jw0Var;
        }
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        long j;
        if (this.x) {
            return Long.MIN_VALUE;
        }
        if (d()) {
            return this.t;
        }
        long j2 = this.u;
        ArrayList arrayList = this.l;
        xn xnVar = (xn) arrayList.get(arrayList.size() - 1);
        if (!xnVar.d()) {
            if (this.l.size() > 1) {
                xnVar = (xn) this.l.get(r2.size() - 2);
            } else {
                xnVar = null;
            }
        }
        if (xnVar != null) {
            j2 = Math.max(j2, xnVar.h);
        }
        xs2 xs2Var = this.n;
        synchronized (xs2Var) {
            j = xs2Var.v;
        }
        return Math.max(j2, j);
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        if (d()) {
            return this.t;
        }
        if (this.x) {
            return Long.MIN_VALUE;
        }
        return ((xn) this.l.get(r0.size() - 1)).h;
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        return this.j.b();
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
        if (this.j.c == null && !d()) {
            if (this.j.b()) {
                au auVar = this.q;
                auVar.getClass();
                boolean z = auVar instanceof xn;
                if (z && b(this.l.size() - 1)) {
                    return;
                }
                dd0 dd0Var = this.f;
                if (dd0Var.m != null ? false : dd0Var.j.a(j, auVar, this.m)) {
                    bg1 bg1Var = this.j.b;
                    if (bg1Var == null) {
                        throw new IllegalStateException();
                    }
                    bg1Var.a(false);
                    if (z) {
                        this.w = (xn) auVar;
                        return;
                    }
                    return;
                }
                return;
            }
            dd0 dd0Var2 = this.f;
            List list = this.m;
            int size = (dd0Var2.m != null || dd0Var2.j.g() < 2) ? list.size() : dd0Var2.j.a(j, list);
            if (size < this.l.size()) {
                if (this.j.b()) {
                    throw new IllegalStateException();
                }
                int size2 = this.l.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!b(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j2 = ((xn) this.l.get(r2.size() - 1)).h;
                xn a = a(size);
                if (this.l.isEmpty()) {
                    this.t = this.u;
                }
                this.x = false;
                sm1 sm1Var = this.h;
                sm1Var.b(new yl1(1, this.b, null, 3, null, sm1Var.a(a.g), sm1Var.a(j2)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0494  */
    @Override // yads.iy2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(long j) {
        List list;
        long j2;
        boolean z;
        long j3;
        long j4;
        long max;
        long max2;
        long j5;
        au ezVar;
        boolean z2;
        long j6;
        long j7;
        long max3;
        int i;
        long j8;
        bd0 bd0Var;
        int i2;
        boolean z3;
        hu huVar = this;
        int i3 = 1;
        if (huVar.x || huVar.j.b() || huVar.j.c != null) {
            return false;
        }
        boolean d = d();
        if (d) {
            list = Collections.emptyList();
            j2 = huVar.t;
        } else {
            list = huVar.m;
            ArrayList arrayList = huVar.l;
            j2 = ((xn) arrayList.get(arrayList.size() - 1)).h;
        }
        List list2 = list;
        long j9 = j2;
        dd0 dd0Var = huVar.f;
        du duVar = huVar.k;
        if (dd0Var.m == null) {
            long j10 = j9 - j;
            long a = sb3.a(((sc2) dd0Var.k.m.get(dd0Var.l)).b) + sb3.a(dd0Var.k.a) + j9;
            bf2 bf2Var = dd0Var.h;
            if (bf2Var == null || !bf2Var.e.a(a)) {
                long j11 = dd0Var.f;
                long a2 = sb3.a(j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime());
                e30 e30Var = dd0Var.k;
                long j12 = e30Var.a;
                long a3 = j12 == -9223372036854775807L ? -9223372036854775807L : a2 - sb3.a(j12 + ((sc2) e30Var.m.get(dd0Var.l)).b);
                xn xnVar = list2.isEmpty() ? null : (xn) list2.get(list2.size() - 1);
                int g = dd0Var.j.g();
                sj1[] sj1VarArr = new sj1[g];
                int i4 = 0;
                while (i4 < g) {
                    bd0 bd0Var2 = dd0Var.i[i4];
                    k30 k30Var = bd0Var2.d;
                    if (k30Var == null) {
                        sj1VarArr[i4] = sj1.a;
                        i = g;
                        j8 = a2;
                        i2 = i3;
                        z2 = d;
                        j6 = j9;
                    } else {
                        z2 = d;
                        long c = k30Var.c(bd0Var2.e, a2);
                        int i5 = g;
                        long j13 = c + bd0Var2.f;
                        long e = (bd0Var2.d.e(bd0Var2.e, a2) + (bd0Var2.d.c(bd0Var2.e, a2) + bd0Var2.f)) - 1;
                        if (xnVar != null) {
                            max3 = xnVar.c();
                            j6 = j9;
                            j7 = j13;
                        } else {
                            j6 = j9;
                            long a4 = bd0Var2.d.a(j9, bd0Var2.e) + bd0Var2.f;
                            int i6 = sb3.a;
                            j7 = j13;
                            max3 = Math.max(j7, Math.min(a4, e));
                        }
                        if (max3 < j7) {
                            sj1VarArr[i4] = sj1.a;
                            i = i5;
                            j8 = a2;
                        } else {
                            bd0 bd0Var3 = dd0Var.i[i4];
                            lo b = dd0Var.b.b(bd0Var3.b.b);
                            if (b == null || b.equals(bd0Var3.c)) {
                                i = i5;
                                j8 = a2;
                                bd0Var = bd0Var3;
                            } else {
                                i = i5;
                                j8 = a2;
                                bd0 bd0Var4 = new bd0(bd0Var3.e, bd0Var3.b, b, bd0Var3.a, bd0Var3.f, bd0Var3.d);
                                dd0Var.i[i4] = bd0Var4;
                                bd0Var = bd0Var4;
                            }
                            sj1VarArr[i4] = new cd0(bd0Var, max3, e);
                        }
                        i2 = 1;
                    }
                    i4 += i2;
                    i3 = i2;
                    d = z2;
                    g = i;
                    j9 = j6;
                    a2 = j8;
                }
                long j14 = a2;
                z = d;
                long j15 = j9;
                if (dd0Var.k.d) {
                    bd0 bd0Var5 = dd0Var.i[0];
                    j3 = j14;
                    long a5 = dd0Var.i[0].a((bd0Var5.d.e(bd0Var5.e, j3) + (bd0Var5.d.c(bd0Var5.e, j3) + bd0Var5.f)) - 1);
                    e30 e30Var2 = dd0Var.k;
                    long j16 = e30Var2.a;
                    j4 = -9223372036854775807L;
                    max = Math.max(0L, Math.min(j16 == -9223372036854775807L ? -9223372036854775807L : j3 - sb3.a(j16 + ((sc2) e30Var2.m.get(dd0Var.l)).b), a5) - j);
                } else {
                    j3 = j14;
                    max = -9223372036854775807L;
                    j4 = -9223372036854775807L;
                }
                long j17 = j4;
                long j18 = j3;
                dd0Var.j.a(j, j10, max, list2, sj1VarArr);
                int f = dd0Var.j.f();
                bd0 bd0Var6 = dd0Var.i[f];
                lo b2 = dd0Var.b.b(bd0Var6.b.b);
                if (b2 != null && !b2.equals(bd0Var6.c)) {
                    bd0 bd0Var7 = new bd0(bd0Var6.e, bd0Var6.b, b2, bd0Var6.a, bd0Var6.f, bd0Var6.d);
                    dd0Var.i[f] = bd0Var7;
                    bd0Var6 = bd0Var7;
                }
                cu cuVar = bd0Var6.a;
                if (cuVar != null) {
                    oo2 oo2Var = bd0Var6.b;
                    tl2 tl2Var = ((qq) cuVar).j == null ? oo2Var.e : null;
                    tl2 e2 = bd0Var6.d == null ? oo2Var.e() : null;
                    if (tl2Var != null || e2 != null) {
                        q30 q30Var = dd0Var.e;
                        jw0 d2 = dd0Var.j.d();
                        int e3 = dd0Var.j.e();
                        Object h = dd0Var.j.h();
                        oo2 oo2Var2 = bd0Var6.b;
                        if (tl2Var == null || (e2 = tl2Var.a(e2, bd0Var6.c.a)) != null) {
                            tl2Var = e2;
                        }
                        duVar.a = new l51(q30Var, l30.a(oo2Var2, bd0Var6.c.a, tl2Var, 0), d2, e3, h, bd0Var6.a);
                        huVar = this;
                        du duVar2 = huVar.k;
                        z3 = duVar2.b;
                        au auVar = duVar2.a;
                        duVar2.a = null;
                        duVar2.b = false;
                        if (z3) {
                            huVar.t = -9223372036854775807L;
                            huVar.x = true;
                            return true;
                        }
                        if (auVar == null) {
                            return false;
                        }
                        huVar.q = auVar;
                        if (auVar instanceof xn) {
                            xn xnVar2 = (xn) auVar;
                            if (z) {
                                long j19 = xnVar2.g;
                                long j20 = huVar.t;
                                if (j19 != j20) {
                                    huVar.n.t = j20;
                                    for (xs2 xs2Var : huVar.o) {
                                        xs2Var.t = huVar.t;
                                    }
                                }
                                huVar.t = -9223372036854775807L;
                            }
                            zn znVar = huVar.p;
                            xnVar2.m = znVar;
                            int[] iArr = new int[znVar.b.length];
                            int i7 = 0;
                            while (true) {
                                xs2[] xs2VarArr = znVar.b;
                                if (i7 >= xs2VarArr.length) {
                                    break;
                                }
                                xs2 xs2Var2 = xs2VarArr[i7];
                                iArr[i7] = xs2Var2.q + xs2Var2.p;
                                i7++;
                            }
                            xnVar2.n = iArr;
                            huVar.l.add(xnVar2);
                        } else if (auVar instanceof l51) {
                            ((l51) auVar).k = huVar.p;
                        }
                        huVar.j.a(auVar, huVar, huVar.i.a(auVar.c));
                        sm1 sm1Var = huVar.h;
                        sm1Var.c(new wf1(auVar.b), new yl1(auVar.c, huVar.b, auVar.d, auVar.e, auVar.f, sm1Var.a(auVar.g), sm1Var.a(auVar.h)));
                        return true;
                    }
                }
                long j21 = bd0Var6.e;
                boolean z4 = j21 != j17;
                if (bd0Var6.d.c(j21) == 0) {
                    duVar.b = z4;
                } else {
                    long c2 = bd0Var6.d.c(bd0Var6.e, j18) + bd0Var6.f;
                    long e4 = (bd0Var6.d.e(bd0Var6.e, j18) + (bd0Var6.d.c(bd0Var6.e, j18) + bd0Var6.f)) - 1;
                    if (xnVar != null) {
                        max2 = xnVar.c();
                    } else {
                        long a6 = bd0Var6.d.a(j15, bd0Var6.e) + bd0Var6.f;
                        int i8 = sb3.a;
                        max2 = Math.max(c2, Math.min(a6, e4));
                    }
                    if (max2 < c2) {
                        dd0Var.m = new ro();
                    } else if (max2 > e4 || (dd0Var.n && max2 >= e4)) {
                        duVar.b = z4;
                    } else if (!z4 || bd0Var6.d.a(max2 - bd0Var6.f) < j21) {
                        int min = (int) Math.min(dd0Var.g, (e4 - max2) + 1);
                        if (j21 != j17) {
                            while (min > 1 && bd0Var6.d.a(((min + max2) - 1) - bd0Var6.f) >= j21) {
                                min--;
                            }
                        }
                        long j22 = list2.isEmpty() ? j15 : -9223372036854775807L;
                        q30 q30Var2 = dd0Var.e;
                        int i9 = dd0Var.d;
                        jw0 d3 = dd0Var.j.d();
                        int e5 = dd0Var.j.e();
                        Object h2 = dd0Var.j.h();
                        oo2 oo2Var3 = bd0Var6.b;
                        long a7 = bd0Var6.d.a(max2 - bd0Var6.f);
                        tl2 b3 = bd0Var6.d.b(max2 - bd0Var6.f);
                        if (bd0Var6.a == null) {
                            ezVar = new f03(q30Var2, l30.a(oo2Var3, bd0Var6.c.a, b3, (bd0Var6.d.a() || a3 == -9223372036854775807L || bd0Var6.a(max2) <= a3) ? 0 : 8), d3, e5, h2, a7, bd0Var6.a(max2), max2, i9, d3);
                        } else {
                            int i10 = 1;
                            int i11 = 1;
                            while (true) {
                                if (i10 >= min) {
                                    j5 = max2;
                                    break;
                                }
                                j5 = max2;
                                tl2 a8 = b3.a(bd0Var6.d.b((i10 + max2) - bd0Var6.f), bd0Var6.c.a);
                                if (a8 == null) {
                                    break;
                                }
                                i11++;
                                i10++;
                                max2 = j5;
                                b3 = a8;
                            }
                            long j23 = j5;
                            long j24 = (i11 + j23) - 1;
                            long a9 = bd0Var6.a(j24);
                            long j25 = bd0Var6.e;
                            ezVar = new ez(q30Var2, l30.a(oo2Var3, bd0Var6.c.a, b3, (bd0Var6.d.a() || a3 == -9223372036854775807L || bd0Var6.a(j24) <= a3) ? 0 : 8), d3, e5, h2, a7, a9, j22, (j25 == -9223372036854775807L || j25 > a9) ? -9223372036854775807L : j25, j23, i11, -oo2Var3.c, bd0Var6.a);
                        }
                        duVar.a = ezVar;
                    } else {
                        duVar.b = true;
                    }
                }
                huVar = this;
                du duVar22 = huVar.k;
                z3 = duVar22.b;
                au auVar2 = duVar22.a;
                duVar22.a = null;
                duVar22.b = false;
                if (z3) {
                }
            }
        }
        z = d;
        du duVar222 = huVar.k;
        z3 = duVar222.b;
        au auVar22 = duVar222.a;
        duVar222.a = null;
        duVar222.b = false;
        if (z3) {
        }
    }

    @Override // yads.ys2
    public final int b(long j) {
        if (d()) {
            return 0;
        }
        int b = this.n.b(j, this.x);
        xn xnVar = this.w;
        if (xnVar != null) {
            int a = xnVar.a(0);
            xs2 xs2Var = this.n;
            b = Math.min(b, a - (xs2Var.q + xs2Var.s));
        }
        xs2 xs2Var2 = this.n;
        synchronized (xs2Var2) {
            if (b >= 0) {
                int i = xs2Var2.s + b;
                if (i <= xs2Var2.p) {
                    xs2Var2.s = i;
                }
            }
            throw new IllegalArgumentException();
        }
        e();
        return b;
    }

    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2) {
        eu b;
        au auVar = (au) cg1Var;
        this.q = null;
        dd0 dd0Var = this.f;
        if (auVar instanceof l51) {
            int a = dd0Var.j.a(((l51) auVar).d);
            bd0 bd0Var = dd0Var.i[a];
            if (bd0Var.d == null && (b = ((qq) bd0Var.a).b()) != null) {
                bd0[] bd0VarArr = dd0Var.i;
                oo2 oo2Var = bd0Var.b;
                bd0VarArr[a] = new bd0(bd0Var.e, oo2Var, bd0Var.c, bd0Var.a, bd0Var.f, new m30(b, oo2Var.c));
            }
        }
        bf2 bf2Var = dd0Var.h;
        if (bf2Var != null) {
            long j3 = bf2Var.d;
            if (j3 == -9223372036854775807L || auVar.h > j3) {
                bf2Var.d = auVar.h;
            }
            bf2Var.e.h = true;
        }
        long j4 = auVar.a;
        Uri uri = auVar.i.c;
        wf1 wf1Var = new wf1();
        this.i.getClass();
        sm1 sm1Var = this.h;
        sm1Var.b(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var.a(auVar.g), sm1Var.a(auVar.h)));
        j30 j30Var = this.g;
        j30Var.s.a((iy2) j30Var);
    }

    public final boolean b(int i) {
        xs2 xs2Var;
        xn xnVar = (xn) this.l.get(i);
        xs2 xs2Var2 = this.n;
        if (xs2Var2.q + xs2Var2.s > xnVar.a(0)) {
            return true;
        }
        int i2 = 0;
        do {
            xs2[] xs2VarArr = this.o;
            if (i2 >= xs2VarArr.length) {
                return false;
            }
            xs2Var = xs2VarArr[i2];
            i2++;
        } while (xs2Var.q + xs2Var.s <= xnVar.a(i2));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c7  */
    @Override // yads.zf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ag1 a(cg1 cg1Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        wf1 wf1Var;
        vf1 vf1Var;
        int i2;
        long j3;
        boolean a;
        int i3;
        ag1 ag1Var;
        boolean z2;
        boolean z3;
        long j4;
        au auVar = (au) cg1Var;
        long j5 = auVar.i.b;
        boolean z4 = auVar instanceof xn;
        int size = this.l.size() - 1;
        boolean z5 = (j5 != 0 && z4 && b(size)) ? false : true;
        Uri uri = auVar.i.c;
        wf1 wf1Var2 = new wf1();
        long j6 = auVar.g;
        int i4 = sb3.a;
        dd0 dd0Var = this.f;
        ee0 ee0Var = this.i;
        if (z5) {
            bf2 bf2Var = dd0Var.h;
            z = z4;
            if (bf2Var != null) {
                long j7 = bf2Var.d;
                boolean z6 = j7 != -9223372036854775807L && j7 < j6;
                cf2 cf2Var = bf2Var.e;
                if (cf2Var.g.d) {
                    if (!cf2Var.i) {
                        if (z6) {
                            if (cf2Var.h) {
                                cf2Var.i = true;
                                cf2Var.h = false;
                                com.monetization.ads.exo.source.dash.i iVar = cf2Var.c.a;
                                iVar.D.removeCallbacks(iVar.w);
                                iVar.h();
                            }
                        }
                    }
                    wf1Var = wf1Var2;
                    a = true;
                    if (a) {
                        if (z5) {
                            ag1Var = gg1.d;
                            if (z) {
                                if (a(size) == auVar) {
                                    if (this.l.isEmpty()) {
                                        this.t = this.u;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            if (ag1Var == null) {
                                this.i.getClass();
                                if (!(iOException instanceof cc2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof u01) && !(iOException instanceof fg1)) {
                                    int i5 = r30.c;
                                    for (Throwable th = iOException; th != null; th = th.getCause()) {
                                        if (!(th instanceof r30) || ((r30) th).b != 2008) {
                                        }
                                    }
                                    j4 = Math.min((i - 1) * 1000, 5000);
                                    if (j4 == -9223372036854775807L) {
                                        z2 = false;
                                        ag1Var = new ag1(0, j4);
                                    } else {
                                        z2 = false;
                                        ag1Var = gg1.e;
                                    }
                                }
                                j4 = -9223372036854775807L;
                                if (j4 == -9223372036854775807L) {
                                }
                            } else {
                                z2 = false;
                            }
                            int i6 = ag1Var.a;
                            z3 = (i6 != 0 || i6 == 1) ? true : z2;
                            sm1 sm1Var = this.h;
                            ag1 ag1Var2 = ag1Var;
                            sm1Var.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var.a(auVar.g), sm1Var.a(auVar.h)), iOException, true ^ z3);
                            if (!z3) {
                                this.q = null;
                                this.i.getClass();
                                j30 j30Var = this.g;
                                j30Var.s.a((iy2) j30Var);
                            }
                            return ag1Var2;
                        }
                        gh1.d("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    ag1Var = null;
                    if (ag1Var == null) {
                    }
                    int i62 = ag1Var.a;
                    if (i62 != 0) {
                    }
                    sm1 sm1Var2 = this.h;
                    ag1 ag1Var22 = ag1Var;
                    sm1Var2.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var2.a(auVar.g), sm1Var2.a(auVar.h)), iOException, true ^ z3);
                    if (!z3) {
                    }
                    return ag1Var22;
                }
            }
            if (!dd0Var.k.d && z && (iOException instanceof x01) && ((x01) iOException).e == 404) {
                bd0 bd0Var = dd0Var.i[dd0Var.j.a(auVar.d)];
                long c = bd0Var.d.c(bd0Var.e);
                if (c != -1 && c != 0) {
                    if (((xn) auVar).c() > ((bd0Var.d.b() + bd0Var.f) + c) - 1) {
                        dd0Var.n = true;
                        a = true;
                        wf1Var = wf1Var2;
                        if (a) {
                        }
                        ag1Var = null;
                        if (ag1Var == null) {
                        }
                        int i622 = ag1Var.a;
                        if (i622 != 0) {
                        }
                        sm1 sm1Var22 = this.h;
                        ag1 ag1Var222 = ag1Var;
                        sm1Var22.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var22.a(auVar.g), sm1Var22.a(auVar.h)), iOException, true ^ z3);
                        if (!z3) {
                        }
                        return ag1Var222;
                    }
                }
            }
            bd0 bd0Var2 = dd0Var.i[dd0Var.j.a(auVar.d)];
            lo b = dd0Var.b.b(bd0Var2.b.b);
            if (b == null || bd0Var2.c.equals(b)) {
                xo0 xo0Var = dd0Var.j;
                l41 l41Var = bd0Var2.b.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int g = xo0Var.g();
                wf1Var = wf1Var2;
                int i7 = 0;
                for (int i8 = 0; i8 < g; i8++) {
                    if (xo0Var.b(i8, elapsedRealtime)) {
                        i7++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i9 = 0; i9 < l41Var.size(); i9++) {
                    hashSet.add(Integer.valueOf(((lo) l41Var.get(i9)).c));
                }
                int size2 = hashSet.size();
                mo moVar = dd0Var.b;
                moVar.getClass();
                HashSet hashSet2 = new HashSet();
                ArrayList a2 = moVar.a(l41Var);
                for (int i10 = 0; i10 < a2.size(); i10++) {
                    hashSet2.add(Integer.valueOf(((lo) a2.get(i10)).c));
                }
                uf1 uf1Var = new uf1(size2, size2 - hashSet2.size(), g, i7);
                if (uf1Var.a(2) || uf1Var.a(1)) {
                    ee0Var.getClass();
                    if ((iOException instanceof x01) && ((i3 = ((x01) iOException).e) == 403 || i3 == 404 || i3 == 410 || i3 == 416 || i3 == 500 || i3 == 503)) {
                        if (uf1Var.a(1)) {
                            vf1Var = new vf1(1, 300000L);
                        } else if (uf1Var.a(2)) {
                            vf1Var = new vf1(2, 60000L);
                        }
                        if (vf1Var != null && uf1Var.a(vf1Var.a)) {
                            i2 = vf1Var.a;
                            if (i2 != 2) {
                                xo0 xo0Var2 = dd0Var.j;
                                a = xo0Var2.a(xo0Var2.a(auVar.d), vf1Var.b);
                                if (a) {
                                }
                                ag1Var = null;
                                if (ag1Var == null) {
                                }
                                int i6222 = ag1Var.a;
                                if (i6222 != 0) {
                                }
                                sm1 sm1Var222 = this.h;
                                ag1 ag1Var2222 = ag1Var;
                                sm1Var222.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var222.a(auVar.g), sm1Var222.a(auVar.h)), iOException, true ^ z3);
                                if (!z3) {
                                }
                                return ag1Var2222;
                            }
                            if (i2 == 1) {
                                mo moVar2 = dd0Var.b;
                                lo loVar = bd0Var2.c;
                                long j8 = vf1Var.b;
                                moVar2.getClass();
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j8;
                                String str = loVar.b;
                                HashMap hashMap = moVar2.a;
                                if (hashMap.containsKey(str)) {
                                    Long l = (Long) hashMap.get(str);
                                    int i11 = sb3.a;
                                    j3 = Math.max(elapsedRealtime2, l.longValue());
                                } else {
                                    j3 = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j3));
                                int i12 = loVar.c;
                                if (i12 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i12);
                                    HashMap hashMap2 = moVar2.b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l2 = (Long) hashMap2.get(valueOf);
                                        int i13 = sb3.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                a = true;
                                if (a) {
                                }
                                ag1Var = null;
                                if (ag1Var == null) {
                                }
                                int i62222 = ag1Var.a;
                                if (i62222 != 0) {
                                }
                                sm1 sm1Var2222 = this.h;
                                ag1 ag1Var22222 = ag1Var;
                                sm1Var2222.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var2222.a(auVar.g), sm1Var2222.a(auVar.h)), iOException, true ^ z3);
                                if (!z3) {
                                }
                                return ag1Var22222;
                            }
                        }
                    }
                    vf1Var = null;
                    if (vf1Var != null) {
                        i2 = vf1Var.a;
                        if (i2 != 2) {
                        }
                    }
                }
            }
            wf1Var = wf1Var2;
            a = true;
            if (a) {
            }
            ag1Var = null;
            if (ag1Var == null) {
            }
            int i622222 = ag1Var.a;
            if (i622222 != 0) {
            }
            sm1 sm1Var22222 = this.h;
            ag1 ag1Var222222 = ag1Var;
            sm1Var22222.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var22222.a(auVar.g), sm1Var22222.a(auVar.h)), iOException, true ^ z3);
            if (!z3) {
            }
            return ag1Var222222;
        }
        z = z4;
        wf1Var = wf1Var2;
        a = false;
        if (a) {
        }
        ag1Var = null;
        if (ag1Var == null) {
        }
        int i6222222 = ag1Var.a;
        if (i6222222 != 0) {
        }
        sm1 sm1Var222222 = this.h;
        ag1 ag1Var2222222 = ag1Var;
        sm1Var222222.a(wf1Var, new yl1(auVar.c, this.b, auVar.d, auVar.e, auVar.f, sm1Var222222.a(auVar.g), sm1Var222222.a(auVar.h)), iOException, true ^ z3);
        if (!z3) {
        }
        return ag1Var2222222;
    }

    @Override // yads.ys2
    public final void a() {
        this.j.a(Integer.MIN_VALUE);
        xs2 xs2Var = this.n;
        um0 um0Var = xs2Var.h;
        if (um0Var != null && um0Var.c() == 1) {
            wk0 a = xs2Var.h.a();
            a.getClass();
            throw a;
        }
        if (this.j.b()) {
            return;
        }
        dd0 dd0Var = this.f;
        ro roVar = dd0Var.m;
        if (roVar == null) {
            dd0Var.a.a();
            return;
        }
        throw roVar;
    }

    @Override // yads.ys2
    public final int a(kw0 kw0Var, fb0 fb0Var, int i) {
        if (d()) {
            return -3;
        }
        xn xnVar = this.w;
        if (xnVar != null) {
            int a = xnVar.a(0);
            xs2 xs2Var = this.n;
            if (a <= xs2Var.q + xs2Var.s) {
                return -3;
            }
        }
        e();
        return this.n.a(kw0Var, fb0Var, i, this.x);
    }

    public final int a(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.l.size()) {
                return this.l.size() - 1;
            }
        } while (((xn) this.l.get(i2)).a(0) <= i);
        return i2 - 1;
    }

    public final xn a(int i) {
        xn xnVar = (xn) this.l.get(i);
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i2 = sb3.a;
        if (i >= 0 && size <= arrayList.size() && i <= size) {
            if (i != size) {
                arrayList.subList(i, size).clear();
            }
            this.v = Math.max(this.v, this.l.size());
            int i3 = 0;
            this.n.b(xnVar.a(0));
            while (true) {
                xs2[] xs2VarArr = this.o;
                if (i3 >= xs2VarArr.length) {
                    return xnVar;
                }
                xs2 xs2Var = xs2VarArr[i3];
                i3++;
                xs2Var.b(xnVar.a(i3));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
