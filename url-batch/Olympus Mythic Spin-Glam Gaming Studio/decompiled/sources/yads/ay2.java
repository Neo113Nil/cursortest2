package yads;

/* loaded from: classes15.dex */
public final class ay2 implements nr {
    public final yj0 a;
    public final long b;
    public final int c;
    public long d;
    public int e;

    public ay2(yj0 yj0Var, long j, int i, long j2, int i2) {
        this.a = yj0Var;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = i2;
    }

    @Override // yads.nr
    public final void a(long j, long j2, long j3) {
        float f;
        float f2;
        long j4 = this.d + j3;
        this.d = j4;
        yj0 yj0Var = this.a;
        long j5 = this.b;
        if (j5 == -1 || j5 == 0) {
            int i = this.c;
            if (i != 0) {
                f2 = (this.e * 100.0f) / i;
                yj0Var.a(j5, j4, f2);
            }
            f = -1.0f;
        } else {
            f = (j4 * 100.0f) / j5;
        }
        f2 = f;
        yj0Var.a(j5, j4, f2);
    }
}
