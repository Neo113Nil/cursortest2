package yads;

/* loaded from: classes15.dex */
public final class bd0 {
    public final cu a;
    public final oo2 b;
    public final lo c;
    public final k30 d;
    public final long e;
    public final long f;

    public bd0(long j, oo2 oo2Var, lo loVar, cu cuVar, long j2, k30 k30Var) {
        this.e = j;
        this.b = oo2Var;
        this.c = loVar;
        this.f = j2;
        this.a = cuVar;
        this.d = k30Var;
    }

    public final bd0 a(long j, oo2 oo2Var) {
        long a;
        k30 d = this.b.d();
        k30 d2 = oo2Var.d();
        if (d == null) {
            return new bd0(j, oo2Var, this.c, this.a, this.f, d);
        }
        if (!d.a()) {
            return new bd0(j, oo2Var, this.c, this.a, this.f, d2);
        }
        long c = d.c(j);
        if (c == 0) {
            return new bd0(j, oo2Var, this.c, this.a, this.f, d2);
        }
        long b = d.b();
        long a2 = d.a(b);
        long j2 = c + b;
        long j3 = j2 - 1;
        long b2 = d.b(j3, j) + d.a(j3);
        long b3 = d2.b();
        long a3 = d2.a(b3);
        long j4 = this.f;
        if (b2 == a3) {
            a = (j2 - b3) + j4;
        } else {
            if (b2 < a3) {
                throw new ro();
            }
            a = a3 < a2 ? j4 - (d2.a(a2, j) - b) : (d.a(a3, j) - b3) + j4;
        }
        return new bd0(j, oo2Var, this.c, this.a, a, d2);
    }

    public final long a(long j) {
        return this.d.b(j - this.f, this.e) + this.d.a(j - this.f);
    }
}
