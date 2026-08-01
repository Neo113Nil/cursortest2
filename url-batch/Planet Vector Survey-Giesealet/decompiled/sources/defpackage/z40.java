package defpackage;

import androidx.compose.foundation.c;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class z40 {
    static {
        new x10(gi.r);
    }

    public static final void a(ke keVar, uq0 uq0Var, dy0 dy0Var, qu quVar, ih ihVar, int i) {
        int i2;
        uq0 uq0Var2;
        dy0 dy0Var2;
        dy0 dy0Var3;
        qh qhVar = (qh) ihVar;
        qhVar.W(-2127166334);
        if ((i & 6) == 0) {
            i2 = (qhVar.f(keVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qhVar.h(quVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && qhVar.z()) {
            qhVar.Q();
            uq0Var2 = uq0Var;
            dy0Var3 = dy0Var;
        } else {
            qhVar.S();
            if ((i & 1) == 0 || qhVar.x()) {
                uq0Var2 = (uq0) qhVar.j(vq0.a);
                dy0Var2 = (dy0) qhVar.j(ey0.a);
            } else {
                qhVar.Q();
                uq0Var2 = uq0Var;
                dy0Var2 = dy0Var;
            }
            qhVar.r();
            rx a = nl0.a(0, qhVar, 7);
            long j = keVar.a;
            boolean e = qhVar.e(j);
            Object K = qhVar.K();
            if (e || K == hh.a) {
                K = new yv0(j, ge.b(j, 0.4f));
                qhVar.e0(K);
            }
            nz.c(new ki0[]{le.a.a(keVar), c.a.a(a), rl0.a.a(ef.b), vq0.a.a(uq0Var2), zv0.a.a((yv0) K), ey0.a.a(dy0Var2)}, a50.E(-1066563262, new w3(6, dy0Var2, quVar), qhVar), qhVar, 56);
            dy0Var3 = dy0Var2;
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new y40(keVar, uq0Var2, dy0Var3, quVar, i);
        }
    }
}
