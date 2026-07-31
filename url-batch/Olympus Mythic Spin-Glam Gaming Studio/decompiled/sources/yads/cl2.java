package yads;

/* loaded from: classes3.dex */
public final class cl2 implements lp {
    public final m73 a;
    public final xb2 b = new xb2();

    public cl2(m73 m73Var) {
        this.a = m73Var;
    }

    @Override // yads.lp
    public final void a() {
        this.b.a(sb3.f);
    }

    @Override // yads.lp
    public final kp a(pd0 pd0Var, long j) {
        int a;
        long j2 = pd0Var.d;
        int min = (int) Math.min(20000L, pd0Var.c - j2);
        this.b.c(min);
        pd0Var.b(this.b.a, 0, min, false);
        xb2 xb2Var = this.b;
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (true) {
            int i3 = xb2Var.c;
            int i4 = xb2Var.b;
            if (i3 - i4 < 4) {
                return j3 != -9223372036854775807L ? new kp(-2, j3, j2 + i) : kp.d;
            }
            if (dl2.a(xb2Var.a, i4) != 442) {
                xb2Var.e(xb2Var.b + 1);
            } else {
                xb2Var.e(xb2Var.b + 4);
                long a2 = el2.a(xb2Var);
                if (a2 != -9223372036854775807L) {
                    long b = this.a.b(a2);
                    if (b > j) {
                        return j3 == -9223372036854775807L ? new kp(-1, b, j2) : new kp(0, -9223372036854775807L, j2 + i2);
                    }
                    if (100000 + b > j) {
                        return new kp(0, -9223372036854775807L, j2 + xb2Var.b);
                    }
                    i2 = xb2Var.b;
                    j3 = b;
                }
                int i5 = xb2Var.c;
                int i6 = xb2Var.b;
                if (i5 - i6 >= 10) {
                    xb2Var.e(i6 + 9);
                    int k = xb2Var.k() & 7;
                    int i7 = xb2Var.c;
                    int i8 = xb2Var.b;
                    if (i7 - i8 >= k) {
                        xb2Var.e(i8 + k);
                        int i9 = xb2Var.c;
                        int i10 = xb2Var.b;
                        if (i9 - i10 >= 4) {
                            if (dl2.a(xb2Var.a, i10) == 443) {
                                xb2Var.e(xb2Var.b + 4);
                                int p = xb2Var.p();
                                int i11 = xb2Var.c;
                                int i12 = xb2Var.b;
                                if (i11 - i12 < p) {
                                    xb2Var.e(i5);
                                } else {
                                    xb2Var.e(i12 + p);
                                }
                            }
                            while (true) {
                                int i13 = xb2Var.c;
                                int i14 = xb2Var.b;
                                if (i13 - i14 < 4 || (a = dl2.a(xb2Var.a, i14)) == 442 || a == 441 || (a >>> 8) != 1) {
                                    break;
                                }
                                xb2Var.e(xb2Var.b + 4);
                                if (xb2Var.c - xb2Var.b < 2) {
                                    xb2Var.e(i5);
                                    break;
                                }
                                xb2Var.e(Math.min(xb2Var.c, xb2Var.b + xb2Var.p()));
                            }
                        } else {
                            xb2Var.e(i5);
                        }
                    } else {
                        xb2Var.e(i5);
                    }
                } else {
                    xb2Var.e(i5);
                }
                i = xb2Var.b;
            }
        }
    }
}
