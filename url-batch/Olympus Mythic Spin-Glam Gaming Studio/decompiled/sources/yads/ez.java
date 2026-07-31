package yads;

/* loaded from: classes5.dex */
public final class ez extends xn {
    public final int o;
    public final long p;
    public final cu q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public ez(q30 q30Var, v30 v30Var, jw0 jw0Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, cu cuVar) {
        super(q30Var, v30Var, jw0Var, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = cuVar;
    }

    @Override // yads.cg1
    public final void a() {
        int a;
        if (this.r == 0) {
            zn znVar = this.m;
            if (znVar == null) {
                throw new IllegalStateException();
            }
            long j = this.p;
            for (xs2 xs2Var : znVar.b) {
                if (xs2Var.E != j) {
                    xs2Var.E = j;
                    xs2Var.z = true;
                }
            }
            cu cuVar = this.q;
            long j2 = this.k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.l;
            ((qq) cuVar).a(znVar, j3, j4 != -9223372036854775807L ? j4 - this.p : -9223372036854775807L);
        }
        try {
            v30 v30Var = this.b;
            long j5 = this.r;
            long j6 = v30Var.g;
            long j7 = -1;
            if (j6 != -1) {
                j7 = j6 - j5;
            }
            v30 a2 = v30Var.a(j5, j7);
            c43 c43Var = this.i;
            pd0 pd0Var = new pd0(c43Var, a2.f, c43Var.a(a2));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                    a = ((qq) this.q).b.a(pd0Var, qq.l);
                    if (a == 1) {
                        throw new IllegalStateException();
                    }
                } finally {
                    this.r = pd0Var.d - this.b.f;
                }
            } while (a == 0);
            t30.a(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            t30.a(this.i);
            throw th;
        }
    }

    @Override // yads.cg1
    public final void b() {
        this.s = true;
    }

    @Override // yads.xn
    public final long c() {
        return this.j + this.o;
    }

    @Override // yads.xn
    public final boolean d() {
        return this.t;
    }
}
