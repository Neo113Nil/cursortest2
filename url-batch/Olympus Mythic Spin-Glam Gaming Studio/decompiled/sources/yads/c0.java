package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes5.dex */
public final class c0 implements tp0 {
    public final d0 a = new d0(null);
    public final xb2 b = new xb2(2786);
    public boolean c;

    static {
        new yp0() { // from class: yads.c0$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return c0.a();
            }
        };
    }

    public static /* synthetic */ tp0[] a() {
        return new tp0[]{new c0()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        pd0 pd0Var;
        int a;
        xb2 xb2Var = new xb2(10);
        int i = 0;
        while (true) {
            pd0Var = (pd0) up0Var;
            pd0Var.b(xb2Var.a, 0, 10, false);
            xb2Var.e(0);
            if (xb2Var.m() != 4801587) {
                break;
            }
            xb2Var.e(xb2Var.b + 3);
            int j = xb2Var.j();
            i += j + 10;
            pd0Var.a(false, j);
        }
        pd0Var.f = 0;
        pd0Var.a(false, i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            pd0Var.b(xb2Var.a, 0, 6, false);
            xb2Var.e(0);
            if (xb2Var.p() != 2935) {
                pd0Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                pd0Var.a(false, i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = xb2Var.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a = ((((bArr[2] & 7) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    a = e0.a((b & 192) >> 6, b & 63);
                }
                if (a == -1) {
                    return false;
                }
                pd0Var.a(false, a - 6);
            }
        }
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        d0 d0Var = this.a;
        d0Var.getClass();
        d0Var.d = "0";
        d0Var.e = wp0Var.a(0, 1);
        wp0Var.a();
        wp0Var.a(new lx2(-9223372036854775807L, 0L));
    }

    @Override // yads.tp0
    public final void a(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // yads.tp0
    public final int a(up0 up0Var, dg2 dg2Var) {
        int c = ((pd0) up0Var).c(this.b.a, 0, 2786);
        if (c == -1) {
            return -1;
        }
        this.b.e(0);
        this.b.d(c);
        if (!this.c) {
            this.a.a(4, 0L);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }
}
