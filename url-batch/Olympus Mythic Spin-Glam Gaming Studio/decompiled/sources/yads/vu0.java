package yads;

/* loaded from: classes12.dex */
public final class vu0 implements mx2 {
    public final xu0 a;
    public final long b;

    public vu0(xu0 xu0Var, long j) {
        this.a = xu0Var;
        this.b = j;
    }

    @Override // yads.mx2
    public final boolean b() {
        return true;
    }

    @Override // yads.mx2
    public final long c() {
        long j = this.a.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / r0.e;
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        xu0 xu0Var = this.a;
        wu0 wu0Var = xu0Var.k;
        if (wu0Var == null) {
            throw new IllegalStateException();
        }
        long[] jArr = wu0Var.a;
        long[] jArr2 = wu0Var.b;
        int b = sb3.b(jArr, xu0Var.a(j), false);
        long j2 = b == -1 ? 0L : jArr[b];
        long j3 = b != -1 ? jArr2[b] : 0L;
        long j4 = this.a.e;
        long j5 = (j2 * 1000000) / j4;
        long j6 = this.b;
        ox2 ox2Var = new ox2(j5, j3 + j6);
        if (j5 == j || b == jArr.length - 1) {
            return new kx2(ox2Var, ox2Var);
        }
        int i = b + 1;
        return new kx2(ox2Var, new ox2((jArr[i] * 1000000) / j4, j6 + jArr2[i]));
    }
}
