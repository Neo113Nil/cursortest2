package yads;

import com.inmobi.media.core.config.models.AdConfig;

/* loaded from: classes3.dex */
public final class nu0 implements lp {
    public final xu0 a;
    public final int b;
    public final qu0 c = new qu0();

    public nu0(xu0 xu0Var, int i) {
        this.a = xu0Var;
        this.b = i;
    }

    public final long a(pd0 pd0Var) {
        boolean a;
        int d;
        while (true) {
            long j = pd0Var.d + pd0Var.f;
            if (j >= pd0Var.c - 6) {
                break;
            }
            xu0 xu0Var = this.a;
            int i = this.b;
            qu0 qu0Var = this.c;
            byte[] bArr = new byte[2];
            pd0Var.b(bArr, 0, 2, false);
            if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != i) {
                pd0Var.f = 0;
                pd0Var.a(false, (int) (j - pd0Var.d));
                a = false;
            } else {
                xb2 xb2Var = new xb2(16);
                System.arraycopy(bArr, 0, xb2Var.a, 0, 2);
                byte[] bArr2 = xb2Var.a;
                int i2 = 0;
                for (int i3 = 2; i2 < 14 && (d = pd0Var.d(bArr2, i3 + i2, 14 - i2)) != -1; i3 = 2) {
                    i2 += d;
                }
                xb2Var.d(i2);
                pd0Var.f = 0;
                pd0Var.a(false, (int) (j - pd0Var.d));
                a = ru0.a(xb2Var, xu0Var, i, qu0Var);
            }
            if (a) {
                break;
            }
            pd0Var.a(false, 1);
        }
        long j2 = pd0Var.d + pd0Var.f;
        long j3 = pd0Var.c;
        if (j2 < j3 - 6) {
            return this.c.a;
        }
        pd0Var.a(false, (int) (j3 - j2));
        return this.a.j;
    }

    @Override // yads.lp
    public final kp a(pd0 pd0Var, long j) {
        long j2 = pd0Var.d;
        long a = a(pd0Var);
        long j3 = pd0Var.d + pd0Var.f;
        pd0Var.a(false, Math.max(6, this.a.c));
        long a2 = a(pd0Var);
        long j4 = pd0Var.d + pd0Var.f;
        if (a <= j && a2 > j) {
            return new kp(0, -9223372036854775807L, j3);
        }
        if (a2 <= j) {
            return new kp(-2, a2, j4);
        }
        return new kp(-1, a, j2);
    }
}
