package yads;

/* loaded from: classes10.dex */
public final class rn3 implements mx2 {
    public final on3 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public rn3(on3 on3Var, int i, long j, long j2) {
        this.a = on3Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / on3Var.c;
        this.d = j3;
        this.e = sb3.a(j3 * i, 1000000L, on3Var.b);
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        return this.e;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        long j2 = this.d - 1;
        int i = sb3.a;
        long max = Math.max(0L, Math.min((this.a.b * j) / (this.b * 1000000), j2));
        long j3 = this.c;
        on3 on3Var = this.a;
        long j4 = (on3Var.c * max) + j3;
        long a = sb3.a(max * this.b, 1000000L, on3Var.b);
        ox2 ox2Var = new ox2(a, j4);
        if (a >= j || max == this.d - 1) {
            return new kx2(ox2Var, ox2Var);
        }
        long j5 = max + 1;
        long j6 = this.c;
        on3 on3Var2 = this.a;
        return new kx2(ox2Var, new ox2(sb3.a(j5 * this.b, 1000000L, on3Var2.b), (on3Var2.c * j5) + j6));
    }
}
