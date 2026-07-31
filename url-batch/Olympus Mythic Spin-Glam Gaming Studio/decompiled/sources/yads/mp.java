package yads;

/* loaded from: classes3.dex */
public abstract class mp {
    public final gp a;
    public final lp b;
    public ip c;
    public final int d;

    public mp(jp jpVar, lp lpVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = lpVar;
        this.d = i;
        this.a = new gp(jpVar, j, j2, j3, j4, j5);
    }

    public final void a(long j) {
        ip ipVar = this.c;
        if (ipVar == null || ipVar.a != j) {
            long a = this.a.a.a(j);
            gp gpVar = this.a;
            this.c = new ip(j, a, gpVar.c, gpVar.d, gpVar.e, gpVar.f);
        }
    }

    public final int a(pd0 pd0Var, dg2 dg2Var) {
        long j;
        long j2;
        while (true) {
            ip ipVar = this.c;
            if (ipVar != null) {
                long j3 = ipVar.f;
                long j4 = ipVar.g;
                j = ipVar.h;
                if (j4 - j3 <= this.d) {
                    this.c = null;
                    this.b.a();
                    if (j3 == pd0Var.d) {
                        return 0;
                    }
                    dg2Var.a = j3;
                    return 1;
                }
                j2 = pd0Var.d;
                long j5 = j - j2;
                if (j5 < 0 || j5 > 262144) {
                    break;
                }
                pd0Var.a((int) j5);
                pd0Var.f = 0;
                kp a = this.b.a(pd0Var, ipVar.b);
                int i = a.a;
                if (i == -3) {
                    this.c = null;
                    this.b.a();
                    if (j == pd0Var.d) {
                        return 0;
                    }
                    dg2Var.a = j;
                    return 1;
                }
                if (i == -2) {
                    long j6 = a.b;
                    long j7 = a.c;
                    ipVar.d = j6;
                    ipVar.f = j7;
                    ipVar.h = ip.a(ipVar.b, j6, ipVar.e, j7, ipVar.g, ipVar.c);
                } else {
                    if (i != -1) {
                        if (i != 0) {
                            throw new IllegalStateException("Invalid case");
                        }
                        long j8 = a.c - pd0Var.d;
                        if (j8 >= 0 && j8 <= 262144) {
                            pd0Var.a((int) j8);
                        }
                        this.c = null;
                        this.b.a();
                        long j9 = a.c;
                        if (j9 == pd0Var.d) {
                            return 0;
                        }
                        dg2Var.a = j9;
                        return 1;
                    }
                    long j10 = a.b;
                    long j11 = a.c;
                    ipVar.e = j10;
                    ipVar.g = j11;
                    ipVar.h = ip.a(ipVar.b, ipVar.d, j10, ipVar.f, j11, ipVar.c);
                }
            } else {
                throw new IllegalStateException();
            }
        }
        if (j == j2) {
            return 0;
        }
        dg2Var.a = j;
        return 1;
    }
}
