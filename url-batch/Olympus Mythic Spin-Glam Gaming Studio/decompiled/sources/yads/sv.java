package yads;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class sv extends my {
    public final ao k;
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final f73 r;
    public qv s;
    public rv t;
    public long u;
    public long v;

    public sv(ao aoVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        aoVar.getClass();
        this.k = aoVar;
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new f73();
    }

    @Override // yads.ao
    public final void a(h93 h93Var) {
        this.j = h93Var;
        this.i = sb3.a((Handler.Callback) null);
        a((Object) null, this.k);
    }

    @Override // yads.my
    /* renamed from: b */
    public final void a(Object obj, ao aoVar, g73 g73Var) {
        if (this.t != null) {
            return;
        }
        b(g73Var);
    }

    @Override // yads.ao
    public final wl1 c() {
        return this.k.c();
    }

    @Override // yads.my, yads.ao
    public final void d() {
        rv rvVar = this.t;
        if (rvVar != null) {
            throw rvVar;
        }
        super.d();
    }

    @Override // yads.my, yads.ao
    public final void e() {
        super.e();
        this.t = null;
        this.s = null;
    }

    @Override // yads.ao
    public final gm1 a(pm1 pm1Var, ub0 ub0Var, long j) {
        pv pvVar = new pv(this.k.a(pm1Var, ub0Var, j), this.n, this.u, this.v);
        this.q.add(pvVar);
        return pvVar;
    }

    public final void b(g73 g73Var) {
        long j;
        long j2;
        long j3;
        g73Var.a(0, this.r, 0L);
        long j4 = this.r.r;
        if (this.s != null && !this.q.isEmpty() && !this.o) {
            long j5 = this.u - j4;
            j2 = j5;
            j3 = this.m != Long.MIN_VALUE ? this.v - j4 : Long.MIN_VALUE;
        } else {
            long j6 = this.l;
            long j7 = this.m;
            if (this.p) {
                long j8 = this.r.n;
                j6 += j8;
                j = j8 + j7;
            } else {
                j = j7;
            }
            this.u = j4 + j6;
            this.v = j7 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                pv pvVar = (pv) this.q.get(i);
                long j9 = this.u;
                long j10 = this.v;
                pvVar.f = j9;
                pvVar.g = j10;
            }
            j2 = j6;
            j3 = j;
        }
        try {
            qv qvVar = new qv(g73Var, j2, j3);
            this.s = qvVar;
            a(qvVar);
        } catch (rv e) {
            this.t = e;
            for (int i2 = 0; i2 < this.q.size(); i2++) {
                ((pv) this.q.get(i2)).h = this.t;
            }
        }
    }

    @Override // yads.ao
    public final void a(gm1 gm1Var) {
        if (this.q.remove(gm1Var)) {
            this.k.a(((pv) gm1Var).b);
            if (!this.q.isEmpty() || this.o) {
                return;
            }
            qv qvVar = this.s;
            qvVar.getClass();
            b(qvVar.c);
            return;
        }
        throw new IllegalStateException();
    }
}
