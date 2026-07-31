package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class qf0 {
    public final l41 a;

    public qf0() {
        i41 i41Var = l41.c;
        this.a = um2.f;
    }

    public final aa3 a(int i, y93 y93Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new vc2(new bw1(y93Var.a));
            }
            if (i == 21) {
                return new vc2(new b21());
            }
            if (i == 27) {
                return new vc2(new lz0(new ey2(a(y93Var)), false, false));
            }
            if (i == 36) {
                return new vc2(new nz0(new ey2(a(y93Var))));
            }
            if (i == 89) {
                return new vc2(new wl0(y93Var.b));
            }
            if (i == 138) {
                return new vc2(new dl0(y93Var.a));
            }
            if (i == 172) {
                return new vc2(new g0(y93Var.a));
            }
            if (i == 257) {
                return new jx2(new ic2("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new jx2(new ic2("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new vc2(new gb(y93Var.a, false));
                            case 16:
                                return new vc2(new iz0(new qb3(a(y93Var))));
                            case 17:
                                return new vc2(new ld1(y93Var.a));
                            default:
                                return null;
                        }
                    }
                }
                return new vc2(new d0(y93Var.a));
            }
        }
        return new vc2(new fz0(new qb3(a(y93Var))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final List a(y93 y93Var) {
        String str;
        int i;
        List list;
        xb2 xb2Var = new xb2(y93Var.c);
        ArrayList arrayList = this.a;
        while (xb2Var.c - xb2Var.b > 0) {
            int k = xb2Var.k();
            int k2 = xb2Var.b + xb2Var.k();
            if (k == 134) {
                arrayList = new ArrayList();
                int k3 = xb2Var.k() & 31;
                for (int i2 = 0; i2 < k3; i2++) {
                    String a = xb2Var.a(3, zt.c);
                    int k4 = xb2Var.k();
                    boolean z = (k4 & 128) != 0;
                    if (z) {
                        i = k4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte k5 = (byte) xb2Var.k();
                    xb2Var.e(xb2Var.b + 1);
                    if (z) {
                        list = Collections.singletonList((k5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    iw0 iw0Var = new iw0();
                    iw0Var.k = str;
                    iw0Var.c = a;
                    iw0Var.C = i;
                    iw0Var.m = list;
                    arrayList.add(new jw0(iw0Var));
                }
            }
            xb2Var.e(k2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
