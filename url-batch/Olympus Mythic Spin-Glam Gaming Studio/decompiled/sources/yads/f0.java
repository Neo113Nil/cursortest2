package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes5.dex */
public final class f0 implements tp0 {
    public final g0 a = new g0(null);
    public final xb2 b = new xb2(16384);
    public boolean c;

    static {
        new yp0() { // from class: yads.f0$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return f0.a();
            }
        };
    }

    public static /* synthetic */ tp0[] a() {
        return new tp0[]{new f0()};
    }

    @Override // yads.tp0
    public final void release() {
    }

    @Override // yads.tp0
    public final boolean a(up0 up0Var) {
        pd0 pd0Var;
        int i;
        xb2 xb2Var = new xb2(10);
        int i2 = 0;
        while (true) {
            pd0Var = (pd0) up0Var;
            pd0Var.b(xb2Var.a, 0, 10, false);
            xb2Var.e(0);
            if (xb2Var.m() != 4801587) {
                break;
            }
            xb2Var.e(xb2Var.b + 3);
            int j = xb2Var.j();
            i2 += j + 10;
            pd0Var.a(false, j);
        }
        pd0Var.f = 0;
        pd0Var.a(false, i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            pd0Var.b(xb2Var.a, 0, 7, false);
            xb2Var.e(0);
            int p = xb2Var.p();
            if (p == 44096 || p == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = xb2Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i5 = 4;
                    }
                    if (p == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                pd0Var.a(false, i - 7);
            } else {
                pd0Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                pd0Var.a(false, i4);
                i3 = 0;
            }
        }
    }

    @Override // yads.tp0
    public final void a(wp0 wp0Var) {
        g0 g0Var = this.a;
        g0Var.getClass();
        g0Var.d = "0";
        g0Var.e = wp0Var.a(0, 1);
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
        int c = ((pd0) up0Var).c(this.b.a, 0, 16384);
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
