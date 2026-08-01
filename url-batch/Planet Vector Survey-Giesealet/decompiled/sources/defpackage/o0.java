package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o0 extends m0 {
    public static o0 e;
    public static final qk0 f = qk0.e;
    public static final qk0 g = qk0.d;
    public sv0 c;
    public rp0 d;

    @Override // defpackage.m0
    public final int[] a(int i) {
        int i2;
        if (c().length() > 0 && i < c().length()) {
            try {
                rp0 rp0Var = this.d;
                if (rp0Var == null) {
                    nz.f0("node");
                    throw null;
                }
                zi0 g2 = rp0Var.g();
                int round = Math.round(g2.d - g2.b);
                if (i <= 0) {
                    i = 0;
                }
                sv0 sv0Var = this.c;
                if (sv0Var == null) {
                    nz.f0("layoutResult");
                    throw null;
                }
                int a = sv0Var.a(i);
                sv0 sv0Var2 = this.c;
                if (sv0Var2 == null) {
                    nz.f0("layoutResult");
                    throw null;
                }
                float d = sv0Var2.d(a) + round;
                sv0 sv0Var3 = this.c;
                if (sv0Var3 == null) {
                    nz.f0("layoutResult");
                    throw null;
                }
                float d2 = sv0Var3.d(sv0Var3.b.b - 1);
                sv0 sv0Var4 = this.c;
                if (d < d2) {
                    if (sv0Var4 == null) {
                        nz.f0("layoutResult");
                        throw null;
                    }
                    i2 = sv0Var4.b(d);
                } else {
                    if (sv0Var4 == null) {
                        nz.f0("layoutResult");
                        throw null;
                    }
                    i2 = sv0Var4.b.b;
                }
                return b(i, e(i2 - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.m0
    public final int[] d(int i) {
        int i2;
        if (c().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            rp0 rp0Var = this.d;
            if (rp0Var == null) {
                nz.f0("node");
                throw null;
            }
            zi0 g2 = rp0Var.g();
            int round = Math.round(g2.d - g2.b);
            int length = c().length();
            if (length <= i) {
                i = length;
            }
            sv0 sv0Var = this.c;
            if (sv0Var == null) {
                nz.f0("layoutResult");
                throw null;
            }
            int a = sv0Var.a(i);
            sv0 sv0Var2 = this.c;
            if (sv0Var2 == null) {
                nz.f0("layoutResult");
                throw null;
            }
            float d = sv0Var2.d(a) - round;
            if (d > 0.0f) {
                sv0 sv0Var3 = this.c;
                if (sv0Var3 == null) {
                    nz.f0("layoutResult");
                    throw null;
                }
                i2 = sv0Var3.b(d);
            } else {
                i2 = 0;
            }
            if (i == c().length() && i2 < a) {
                i2++;
            }
            return b(e(i2, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i, qk0 qk0Var) {
        sv0 sv0Var = this.c;
        if (sv0Var == null) {
            nz.f0("layoutResult");
            throw null;
        }
        int c = sv0Var.c(i);
        sv0 sv0Var2 = this.c;
        if (sv0Var2 == null) {
            nz.f0("layoutResult");
            throw null;
        }
        qk0 e2 = sv0Var2.e(c);
        sv0 sv0Var3 = this.c;
        if (qk0Var != e2) {
            if (sv0Var3 != null) {
                return sv0Var3.c(i);
            }
            nz.f0("layoutResult");
            throw null;
        }
        if (sv0Var3 == null) {
            nz.f0("layoutResult");
            throw null;
        }
        j60 j60Var = sv0Var3.b;
        j60Var.b(i);
        ArrayList arrayList = (ArrayList) j60Var.e;
        a5 a5Var = ((rd0) arrayList.get(nk.s(arrayList, i))).a;
        return (a5Var.d.e(i - r4.d) + r4.b) - 1;
    }
}
