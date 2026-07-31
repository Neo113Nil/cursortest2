package yads;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class lk2 extends ao {
    public final wl1 h;
    public final rl1 i;
    public final p30 j;
    public final dk2 k;
    public final cl0 l;
    public final ee0 m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public h93 s;

    public lk2(wl1 wl1Var, p30 p30Var, dk2 dk2Var, cl0 cl0Var, ee0 ee0Var, int i) {
        rl1 rl1Var = wl1Var.c;
        rl1Var.getClass();
        this.i = rl1Var;
        this.h = wl1Var;
        this.j = p30Var;
        this.k = dk2Var;
        this.l = cl0Var;
        this.m = ee0Var;
        this.n = i;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [yads.jk2] */
    /* JADX WARN: Type inference failed for: r8v0, types: [yads.ao, yads.lk2] */
    @Override // yads.ao
    public final void a(h93 h93Var) {
        this.s = h93Var;
        this.l.prepare();
        cl0 cl0Var = this.l;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        ff2 ff2Var = this.g;
        if (ff2Var == null) {
            throw new IllegalStateException();
        }
        cl0Var.a(myLooper, ff2Var);
        e03 e03Var = new e03(this.p, this.q, this.r, this.h);
        if (this.o) {
            e03Var = new jk2(e03Var);
        }
        a(e03Var);
    }

    @Override // yads.ao
    public final wl1 c() {
        return this.h;
    }

    @Override // yads.ao
    public final void d() {
    }

    @Override // yads.ao
    public final void e() {
        this.l.release();
    }

    @Override // yads.ao
    public final gm1 a(pm1 pm1Var, ub0 ub0Var, long j) {
        q30 a = this.j.a();
        h93 h93Var = this.s;
        if (h93Var != null) {
            a.a(h93Var);
        }
        Uri uri = this.i.a;
        dk2 dk2Var = this.k;
        ff2 ff2Var = this.g;
        if (ff2Var != null) {
            return new ik2(uri, a, dk2Var.a(ff2Var), this.l, new yk0(this.d.c, 0, pm1Var), this.m, new sm1(this.c.c, 0, pm1Var, 0L), this, ub0Var, this.i.c, this.n);
        }
        throw new IllegalStateException();
    }

    @Override // yads.ao
    public final void a(gm1 gm1Var) {
        ik2 ik2Var = (ik2) gm1Var;
        if (ik2Var.w) {
            for (xs2 xs2Var : ik2Var.t) {
                xs2Var.a();
                xs2Var.d();
            }
        }
        ik2Var.l.a(ik2Var);
        ik2Var.q.removeCallbacksAndMessages(null);
        ik2Var.r = null;
        ik2Var.M = true;
    }
}
