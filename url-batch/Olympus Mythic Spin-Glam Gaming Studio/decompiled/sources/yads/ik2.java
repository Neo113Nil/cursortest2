package yads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class ik2 implements gm1, wp0, zf1, dg1 {
    public static final Map N;
    public static final jw0 O;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public final Uri b;
    public final q30 c;
    public final cl0 d;
    public final ee0 e;
    public final sm1 f;
    public final yk0 g;
    public final lk2 h;
    public final ub0 i;
    public final String j;
    public final long k;
    public final rq m;
    public fm1 r;
    public t11 s;
    public boolean v;
    public boolean w;
    public boolean x;
    public hk2 y;
    public mx2 z;
    public final gg1 l = new gg1("ProgressiveMediaPeriod");
    public final ry n = new ry();
    public final Runnable o = new Runnable() { // from class: yads.ik2$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            ik2.this.g();
        }
    };
    public final Runnable p = new Runnable() { // from class: yads.ik2$$ExternalSyntheticLambda1
        @Override // java.lang.Runnable
        public final void run() {
            ik2.this.e();
        }
    };
    public final Handler q = sb3.a((Handler.Callback) null);
    public gk2[] u = new gk2[0];
    public xs2[] t = new xs2[0];
    public long I = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public int C = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(hashMap);
        iw0 iw0Var = new iw0();
        iw0Var.a = "icy";
        iw0Var.k = "application/x-icy";
        O = new jw0(iw0Var);
    }

    public ik2(Uri uri, q30 q30Var, rq rqVar, cl0 cl0Var, yk0 yk0Var, ee0 ee0Var, sm1 sm1Var, lk2 lk2Var, ub0 ub0Var, String str, int i) {
        this.b = uri;
        this.c = q30Var;
        this.d = cl0Var;
        this.g = yk0Var;
        this.e = ee0Var;
        this.f = sm1Var;
        this.h = lk2Var;
        this.i = ub0Var;
        this.j = str;
        this.k = i;
        this.m = rqVar;
    }

    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2, boolean z) {
        ek2 ek2Var = (ek2) cg1Var;
        Uri uri = ek2Var.b.c;
        wf1 wf1Var = new wf1();
        this.e.getClass();
        sm1 sm1Var = this.f;
        sm1Var.a(wf1Var, new yl1(1, -1, null, 0, null, sm1Var.a(ek2Var.i), sm1Var.a(this.A)));
        if (z) {
            return;
        }
        for (xs2 xs2Var : this.t) {
            xs2Var.b(false);
        }
        if (this.F > 0) {
            fm1 fm1Var = this.r;
            fm1Var.getClass();
            fm1Var.a((iy2) this);
        }
    }

    @Override // yads.dg1
    public final void b() {
        for (xs2 xs2Var : this.t) {
            xs2Var.b(true);
            xs2Var.d();
        }
        rq rqVar = this.m;
        tp0 tp0Var = rqVar.b;
        if (tp0Var != null) {
            tp0Var.release();
            rqVar.b = null;
        }
        rqVar.c = null;
    }

    @Override // yads.iy2
    public final boolean c(long j) {
        if (this.L || this.l.c != null || this.J) {
            return false;
        }
        if (this.w && this.F == 0) {
            return false;
        }
        boolean d = this.n.d();
        if (this.l.b()) {
            return d;
        }
        i();
        return true;
    }

    public final int d() {
        int i = 0;
        for (xs2 xs2Var : this.t) {
            i += xs2Var.q + xs2Var.p;
        }
        return i;
    }

    public final void e() {
        if (this.M) {
            return;
        }
        fm1 fm1Var = this.r;
        fm1Var.getClass();
        fm1Var.a((iy2) this);
    }

    public final /* synthetic */ void f() {
        this.G = true;
    }

    public final void g() {
        if (this.M || this.w || !this.v || this.z == null) {
            return;
        }
        for (xs2 xs2Var : this.t) {
            if (xs2Var.c() == null) {
                return;
            }
        }
        ry ryVar = this.n;
        synchronized (ryVar) {
            ryVar.a = false;
        }
        int length = this.t.length;
        x73[] x73VarArr = new x73[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            jw0 c = this.t[i].c();
            c.getClass();
            String str = c.m;
            boolean equals = "audio".equals(vt1.c(str));
            boolean z = equals || "video".equals(vt1.c(str));
            zArr[i] = z;
            this.x = z | this.x;
            t11 t11Var = this.s;
            if (t11Var != null) {
                if (equals || this.u[i].b) {
                    ht1 ht1Var = c.k;
                    ht1 ht1Var2 = ht1Var == null ? new ht1(t11Var) : new ht1((gt1[]) sb3.a((Object[]) ht1Var.b, (Object[]) new gt1[]{t11Var}));
                    iw0 iw0Var = new iw0(c);
                    iw0Var.i = ht1Var2;
                    c = new jw0(iw0Var);
                }
                if (equals && c.g == -1 && c.h == -1 && t11Var.b != -1) {
                    iw0 iw0Var2 = new iw0(c);
                    iw0Var2.f = t11Var.b;
                    c = new jw0(iw0Var2);
                }
            }
            int a = this.d.a(c);
            iw0 iw0Var3 = new iw0(c);
            iw0Var3.D = a;
            x73VarArr[i] = new x73(Integer.toString(i), new jw0(iw0Var3));
        }
        this.y = new hk2(new y73(x73VarArr), zArr);
        this.w = true;
        fm1 fm1Var = this.r;
        fm1Var.getClass();
        fm1Var.a((gm1) this);
    }

    @Override // yads.iy2
    public final long getBufferedPositionUs() {
        long j;
        boolean z;
        c();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        long j2 = this.I;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        if (this.x) {
            int length = this.t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                hk2 hk2Var = this.y;
                if (hk2Var.b[i] && hk2Var.c[i]) {
                    xs2 xs2Var = this.t[i];
                    synchronized (xs2Var) {
                        z = xs2Var.w;
                    }
                    if (!z) {
                        j = Math.min(j, this.t[i].b());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = a(false);
        }
        return j == Long.MIN_VALUE ? this.H : j;
    }

    @Override // yads.iy2
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // yads.gm1
    public final y73 getTrackGroups() {
        c();
        return this.y.a;
    }

    public final void h() {
        this.q.post(new Runnable() { // from class: yads.ik2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                ik2.this.f();
            }
        });
    }

    public final void i() {
        ek2 ek2Var = new ek2(this, this.b, this.c, this.m, this, this.n);
        if (this.w) {
            long j = this.I;
            if (j == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j2 = this.A;
            if (j2 != -9223372036854775807L && j > j2) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            mx2 mx2Var = this.z;
            mx2Var.getClass();
            long j3 = mx2Var.b(this.I).a.b;
            long j4 = this.I;
            ek2Var.f.a = j3;
            ek2Var.i = j4;
            ek2Var.h = true;
            ek2Var.l = false;
            for (xs2 xs2Var : this.t) {
                xs2Var.t = this.I;
            }
            this.I = -9223372036854775807L;
        }
        this.K = d();
        this.l.a(ek2Var, this, this.e.a(this.C));
        v30 v30Var = ek2Var.j;
        sm1 sm1Var = this.f;
        sm1Var.c(new wf1(v30Var), new yl1(1, -1, null, 0, null, sm1Var.a(ek2Var.i), sm1Var.a(this.A)));
    }

    @Override // yads.iy2
    public final boolean isLoading() {
        boolean z;
        if (this.l.b()) {
            ry ryVar = this.n;
            synchronized (ryVar) {
                z = ryVar.a;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.gm1
    public final void maybeThrowPrepareError() {
        this.l.a(this.e.a(this.C));
        if (this.L && !this.w) {
            throw new cc2("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // yads.gm1
    public final long readDiscontinuity() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && d() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    @Override // yads.iy2
    public final void reevaluateBuffer(long j) {
    }

    @Override // yads.gm1
    public final long seekToUs(long j) {
        int i;
        c();
        boolean[] zArr = this.y.b;
        if (!this.z.b()) {
            j = 0;
        }
        this.E = false;
        this.H = j;
        if (this.I != -9223372036854775807L) {
            this.I = j;
            return j;
        }
        if (this.C != 7) {
            int length = this.t.length;
            for (0; i < length; i + 1) {
                i = (this.t[i].c(j, false) || (!zArr[i] && this.x)) ? i + 1 : 0;
            }
            return j;
        }
        this.J = false;
        this.I = j;
        this.L = false;
        if (this.l.b()) {
            for (xs2 xs2Var : this.t) {
                xs2Var.a();
            }
            bg1 bg1Var = this.l.b;
            if (bg1Var == null) {
                throw new IllegalStateException();
            }
            bg1Var.a(false);
        } else {
            this.l.c = null;
            for (xs2 xs2Var2 : this.t) {
                xs2Var2.b(false);
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [yads.jk2] */
    public final void b(mx2 mx2Var) {
        this.z = this.s == null ? mx2Var : new lx2(-9223372036854775807L, 0L);
        this.A = mx2Var.c();
        boolean z = !this.G && mx2Var.c() == -9223372036854775807L;
        this.B = z;
        this.C = z ? 7 : 1;
        lk2 lk2Var = this.h;
        long j = this.A;
        boolean b = mx2Var.b();
        boolean z2 = this.B;
        if (j == -9223372036854775807L) {
            j = lk2Var.p;
        }
        if (lk2Var.o || lk2Var.p != j || lk2Var.q != b || lk2Var.r != z2) {
            lk2Var.p = j;
            lk2Var.q = b;
            lk2Var.r = z2;
            lk2Var.o = false;
            e03 e03Var = new e03(lk2Var.p, lk2Var.q, lk2Var.r, lk2Var.h);
            if (lk2Var.o) {
                e03Var = new jk2(e03Var);
            }
            lk2Var.a(e03Var);
        }
        if (this.w) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.w) {
            this.y.getClass();
            this.z.getClass();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [yads.jk2] */
    @Override // yads.zf1
    public final void a(cg1 cg1Var, long j, long j2) {
        mx2 mx2Var;
        ek2 ek2Var = (ek2) cg1Var;
        if (this.A == -9223372036854775807L && (mx2Var = this.z) != null) {
            boolean b = mx2Var.b();
            long a = a(true);
            long j3 = a == Long.MIN_VALUE ? 0L : a + 10000;
            this.A = j3;
            lk2 lk2Var = this.h;
            boolean z = this.B;
            if (j3 == -9223372036854775807L) {
                j3 = lk2Var.p;
            }
            if (lk2Var.o || lk2Var.p != j3 || lk2Var.q != b || lk2Var.r != z) {
                lk2Var.p = j3;
                lk2Var.q = b;
                lk2Var.r = z;
                lk2Var.o = false;
                e03 e03Var = new e03(lk2Var.p, lk2Var.q, lk2Var.r, lk2Var.h);
                if (lk2Var.o) {
                    e03Var = new jk2(e03Var);
                }
                lk2Var.a(e03Var);
            }
        }
        Uri uri = ek2Var.b.c;
        wf1 wf1Var = new wf1();
        this.e.getClass();
        sm1 sm1Var = this.f;
        sm1Var.b(wf1Var, new yl1(1, -1, null, 0, null, sm1Var.a(ek2Var.i), sm1Var.a(this.A)));
        this.L = true;
        fm1 fm1Var = this.r;
        fm1Var.getClass();
        fm1Var.a((iy2) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    @Override // yads.zf1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ag1 a(cg1 cg1Var, long j, long j2, IOException iOException, int i) {
        long j3;
        ag1 ag1Var;
        mx2 mx2Var;
        boolean z;
        ek2 ek2Var = (ek2) cg1Var;
        Uri uri = ek2Var.b.c;
        wf1 wf1Var = new wf1();
        int i2 = sb3.a;
        this.e.getClass();
        if (!(iOException instanceof cc2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof u01) && !(iOException instanceof fg1)) {
            int i3 = r30.c;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof r30) || ((r30) th).b != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != -9223372036854775807L) {
                ag1Var = gg1.e;
            } else {
                int d = d();
                int i4 = d > this.K ? 1 : 0;
                if (!this.G && ((mx2Var = this.z) == null || mx2Var.c() == -9223372036854775807L)) {
                    boolean z2 = this.w;
                    if (z2 && !this.E && this.I == -9223372036854775807L) {
                        this.J = true;
                        ag1Var = gg1.d;
                    } else {
                        this.E = z2;
                        this.H = 0L;
                        this.K = 0;
                        for (xs2 xs2Var : this.t) {
                            xs2Var.b(false);
                        }
                        ek2Var.f.a = 0L;
                        ek2Var.i = 0L;
                        ek2Var.h = true;
                        ek2Var.l = false;
                    }
                } else {
                    this.K = d;
                }
                ag1Var = new ag1(i4, j3);
            }
            int i5 = ag1Var.a;
            z = i5 != 0 || i5 == 1;
            sm1 sm1Var = this.f;
            sm1Var.a(wf1Var, new yl1(1, -1, null, 0, null, sm1Var.a(ek2Var.i), sm1Var.a(this.A)), iOException, !z);
            if (!z) {
                this.e.getClass();
            }
            return ag1Var;
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
        }
        int i52 = ag1Var.a;
        if (i52 != 0) {
        }
        sm1 sm1Var2 = this.f;
        sm1Var2.a(wf1Var, new yl1(1, -1, null, 0, null, sm1Var2.a(ek2Var.i), sm1Var2.a(this.A)), iOException, !z);
        if (!z) {
        }
        return ag1Var;
    }

    @Override // yads.gm1
    public final void a(fm1 fm1Var, long j) {
        this.r = fm1Var;
        this.n.d();
        i();
    }

    @Override // yads.gm1
    public final long a(xo0[] xo0VarArr, boolean[] zArr, ys2[] ys2VarArr, boolean[] zArr2, long j) {
        xo0 xo0Var;
        c();
        hk2 hk2Var = this.y;
        y73 y73Var = hk2Var.a;
        boolean[] zArr3 = hk2Var.c;
        int i = this.F;
        for (int i2 = 0; i2 < xo0VarArr.length; i2++) {
            ys2 ys2Var = ys2VarArr[i2];
            if (ys2Var != null && (xo0VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((fk2) ys2Var).b;
                if (zArr3[i3]) {
                    this.F--;
                    zArr3[i3] = false;
                    ys2VarArr[i2] = null;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        boolean z = !this.D ? j == 0 : i != 0;
        for (int i4 = 0; i4 < xo0VarArr.length; i4++) {
            if (ys2VarArr[i4] == null && (xo0Var = xo0VarArr[i4]) != null) {
                if (xo0Var.g() == 1) {
                    if (xo0Var.b(0) == 0) {
                        int indexOf = y73Var.c.indexOf(xo0Var.c());
                        if (indexOf < 0) {
                            indexOf = -1;
                        }
                        if (!zArr3[indexOf]) {
                            this.F++;
                            zArr3[indexOf] = true;
                            ys2VarArr[i4] = new fk2(this, indexOf);
                            zArr2[i4] = true;
                            if (!z) {
                                xs2 xs2Var = this.t[indexOf];
                                z = (xs2Var.c(j, true) || xs2Var.q + xs2Var.s == 0) ? false : true;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.l.b()) {
                for (xs2 xs2Var2 : this.t) {
                    xs2Var2.a();
                }
                bg1 bg1Var = this.l.b;
                if (bg1Var != null) {
                    bg1Var.a(false);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                for (xs2 xs2Var3 : this.t) {
                    xs2Var3.b(false);
                }
            }
        } else if (z) {
            j = seekToUs(j);
            for (int i5 = 0; i5 < ys2VarArr.length; i5++) {
                if (ys2VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.D = true;
        return j;
    }

    @Override // yads.gm1
    public final void a(long j) {
        c();
        if (this.I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.y.c;
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            this.t[i].a(j, zArr[i]);
        }
    }

    @Override // yads.gm1
    public final long a(long j, nx2 nx2Var) {
        c();
        if (!this.z.b()) {
            return 0L;
        }
        kx2 b = this.z.b(j);
        return nx2Var.a(j, b.a.a, b.b.a);
    }

    public final void a(int i) {
        c();
        boolean[] zArr = this.y.b;
        if (this.J && zArr[i] && !this.t[i].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (xs2 xs2Var : this.t) {
                xs2Var.b(false);
            }
            fm1 fm1Var = this.r;
            fm1Var.getClass();
            fm1Var.a((iy2) this);
        }
    }

    @Override // yads.wp0
    public final c83 a(int i, int i2) {
        return a(new gk2(false, i));
    }

    @Override // yads.wp0
    public final void a() {
        this.v = true;
        this.q.post(this.o);
    }

    @Override // yads.wp0
    public final void a(final mx2 mx2Var) {
        this.q.post(new Runnable() { // from class: yads.ik2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ik2.this.b(mx2Var);
            }
        });
    }

    public final xs2 a(gk2 gk2Var) {
        int length = this.t.length;
        for (int i = 0; i < length; i++) {
            if (gk2Var.equals(this.u[i])) {
                return this.t[i];
            }
        }
        ub0 ub0Var = this.i;
        cl0 cl0Var = this.d;
        yk0 yk0Var = this.g;
        cl0Var.getClass();
        xs2 xs2Var = new xs2(ub0Var, cl0Var, yk0Var);
        xs2Var.f = this;
        int i2 = length + 1;
        gk2[] gk2VarArr = (gk2[]) Arrays.copyOf(this.u, i2);
        gk2VarArr[length] = gk2Var;
        this.u = gk2VarArr;
        xs2[] xs2VarArr = (xs2[]) Arrays.copyOf(this.t, i2);
        xs2VarArr[length] = xs2Var;
        this.t = xs2VarArr;
        return xs2Var;
    }

    public final long a(boolean z) {
        long j;
        long j2 = Long.MIN_VALUE;
        for (int i = 0; i < this.t.length; i++) {
            if (!z) {
                hk2 hk2Var = this.y;
                hk2Var.getClass();
                if (!hk2Var.c[i]) {
                    continue;
                }
            }
            xs2 xs2Var = this.t[i];
            synchronized (xs2Var) {
                j = xs2Var.v;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }
}
