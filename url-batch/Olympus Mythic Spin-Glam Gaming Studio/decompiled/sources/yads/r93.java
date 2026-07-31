package yads;

/* loaded from: classes6.dex */
public final class r93 implements lp {
    public final m73 a;
    public final xb2 b = new xb2();
    public final int c;
    public final int d;

    public r93(int i, m73 m73Var, int i2) {
        this.c = i;
        this.a = m73Var;
        this.d = i2;
    }

    @Override // yads.lp
    public final void a() {
        this.b.a(sb3.f);
    }

    @Override // yads.lp
    public final kp a(pd0 pd0Var, long j) {
        kp kpVar;
        long j2 = pd0Var.d;
        int min = (int) Math.min(this.d, pd0Var.c - j2);
        this.b.c(min);
        pd0Var.b(this.b.a, 0, min, false);
        xb2 xb2Var = this.b;
        int i = xb2Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            int i2 = xb2Var.c;
            int i3 = xb2Var.b;
            if (i2 - i3 < 188) {
                break;
            }
            byte[] bArr = xb2Var.a;
            while (i3 < i && bArr[i3] != 71) {
                i3++;
            }
            int i4 = i3 + 188;
            if (i4 > i) {
                break;
            }
            long a = ba3.a(xb2Var, i3, this.c);
            if (a != -9223372036854775807L) {
                long b = this.a.b(a);
                if (b > j) {
                    if (j5 == -9223372036854775807L) {
                        return new kp(-1, b, j2);
                    }
                    kpVar = new kp(0, -9223372036854775807L, j2 + j4);
                } else {
                    if (100000 + b > j) {
                        return new kp(0, -9223372036854775807L, j2 + i3);
                    }
                    j5 = b;
                    j4 = i3;
                }
            }
            xb2Var.e(i4);
            j3 = i4;
        }
        if (j5 == -9223372036854775807L) {
            return kp.d;
        }
        kpVar = new kp(-2, j5, j2 + j3);
        return kpVar;
    }
}
