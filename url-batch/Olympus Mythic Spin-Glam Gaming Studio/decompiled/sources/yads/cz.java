package yads;

/* loaded from: classes5.dex */
public final class cz implements qx2, mx2 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public cz(long j, long j2, cw1 cw1Var, boolean z) {
        int i = cw1Var.f;
        int i2 = cw1Var.c;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = a(i, j, j2);
        }
    }

    @Override // yads.qx2
    public final long a() {
        return -1L;
    }

    @Override // yads.mx2
    public final boolean b() {
        return this.d != -1 || this.g;
    }

    @Override // yads.mx2
    public final long c() {
        return this.f;
    }

    @Override // yads.qx2
    public final long a(long j) {
        return a(this.e, j, this.b);
    }

    @Override // yads.mx2
    public final kx2 b(long j) {
        long j2 = this.d;
        if (j2 == -1 && !this.g) {
            ox2 ox2Var = new ox2(0L, this.b);
            return new kx2(ox2Var, ox2Var);
        }
        long j3 = this.c;
        long j4 = (((this.e * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            j4 = Math.min(j4, j2 - j3);
        }
        long max = Math.max(j4, 0L);
        long j5 = this.b;
        long j6 = max + j5;
        long a = a(this.e, j6, j5);
        ox2 ox2Var2 = new ox2(a, j6);
        if (this.d != -1 && a < j) {
            long j7 = j6 + this.c;
            if (j7 < this.a) {
                return new kx2(ox2Var2, new ox2(a(this.e, j7, this.b), j7));
            }
        }
        return new kx2(ox2Var2, ox2Var2);
    }

    public static long a(int i, long j, long j2) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }
}
