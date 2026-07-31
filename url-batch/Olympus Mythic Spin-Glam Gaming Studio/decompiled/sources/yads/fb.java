package yads;

/* loaded from: classes5.dex */
public final class fb implements tp0 {
    public final xb2 c;
    public final wb2 d;
    public wp0 e;
    public long f;
    public boolean h;
    public boolean i;
    public final gb a = new gb(null, true);
    public final xb2 b = new xb2(2048);
    public long g = -1;

    static {
        new yp0() { // from class: yads.fb$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return fb.a();
            }
        };
    }

    public fb() {
        xb2 xb2Var = new xb2(10);
        this.c = xb2Var;
        this.d = new wb2(xb2Var.a);
    }

    public static tp0[] a() {
        return new tp0[]{new fb()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        pd0 pd0Var = (pd0) up0Var;
        int i = 0;
        while (true) {
            pd0Var.b(this.c.a, 0, 10, false);
            this.c.e(0);
            if (this.c.m() != 4801587) {
                break;
            }
            xb2 xb2Var = this.c;
            xb2Var.e(xb2Var.b + 3);
            int j = this.c.j();
            i += j + 10;
            pd0Var.a(false, j);
        }
        pd0Var.f = 0;
        pd0Var.a(false, i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            pd0Var.b(this.c.a, 0, 2, false);
            this.c.e(0);
            if ((this.c.p() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                pd0Var.b(this.c.a, 0, 4, false);
                this.d.b(14);
                int a = this.d.a(13);
                if (a <= 6) {
                    i4++;
                    pd0Var.f = 0;
                    pd0Var.a(false, i4);
                } else {
                    pd0Var.a(false, a - 6);
                    i3 += a;
                }
            } else {
                i4++;
                pd0Var.f = 0;
                pd0Var.a(false, i4);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        this.e = wp0Var;
        this.a.a(wp0Var, new z93(Integer.MIN_VALUE, 0, 1));
        wp0Var.a();
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.h = false;
        this.a.a();
        this.f = j2;
    }

    @Override // yads.tp0
    public final int a(up0 up0Var, dg2 dg2Var) {
        if (this.e != null) {
            pd0 pd0Var = (pd0) up0Var;
            long j = pd0Var.c;
            int c = pd0Var.c(this.b.a, 0, 2048);
            boolean z = c == -1;
            if (!this.i) {
                this.e.a(new lx2(-9223372036854775807L, 0L));
                this.i = true;
            }
            if (z) {
                return -1;
            }
            this.b.e(0);
            this.b.d(c);
            if (!this.h) {
                this.a.a(4, this.f);
                this.h = true;
            }
            this.a.a(this.b);
            return 0;
        }
        throw new IllegalStateException();
    }
}
