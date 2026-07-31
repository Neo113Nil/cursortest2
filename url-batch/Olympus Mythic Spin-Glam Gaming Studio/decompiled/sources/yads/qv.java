package yads;

/* loaded from: classes3.dex */
public final class qv extends mw0 {
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;

    public qv(g73 g73Var, long j, long j2) {
        super(g73Var);
        boolean z = false;
        if (g73Var.a() != 1) {
            throw new rv(0);
        }
        f73 a = g73Var.a(0, new f73(), 0L);
        long max = Math.max(0L, j);
        if (!a.m && max != 0 && !a.i) {
            throw new rv(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? a.o : Math.max(0L, j2);
        long j3 = a.o;
        if (j3 != -9223372036854775807L) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                throw new rv(2);
            }
        }
        this.d = max;
        this.e = max2;
        this.f = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (a.j && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
            z = true;
        }
        this.g = z;
    }

    @Override // yads.mw0, yads.g73
    public final f73 a(int i, f73 f73Var, long j) {
        this.c.a(0, f73Var, 0L);
        long j2 = f73Var.r;
        long j3 = this.d;
        f73Var.r = j2 + j3;
        f73Var.o = this.f;
        f73Var.j = this.g;
        long j4 = f73Var.n;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            f73Var.n = max;
            long j5 = this.e;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            f73Var.n = max - this.d;
        }
        long b = sb3.b(this.d);
        long j6 = f73Var.f;
        if (j6 != -9223372036854775807L) {
            f73Var.f = j6 + b;
        }
        long j7 = f73Var.g;
        if (j7 != -9223372036854775807L) {
            f73Var.g = j7 + b;
        }
        return f73Var;
    }

    @Override // yads.g73
    public final d73 a(int i, d73 d73Var, boolean z) {
        this.c.a(0, d73Var, z);
        long j = d73Var.f - this.d;
        long j2 = this.f;
        return d73Var.a(d73Var.b, d73Var.c, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, p5.g, false);
    }
}
