package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ca {
    public static final HashMap a = c(true);
    public static final HashMap b = c(false);
    public static final k4 c = k4.c;

    public static final void a(u50 u50Var, ih ihVar, int i) {
        int i2;
        qh qhVar = (qh) ihVar;
        qhVar.W(-211209833);
        if ((i & 6) == 0) {
            i2 = (qhVar.f(u50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && qhVar.z()) {
            qhVar.Q();
        } else {
            int A = px0.A(qhVar);
            u50 D = nk.D(qhVar, u50Var);
            gf0 l = qhVar.l();
            eh.b.getClass();
            gi giVar = dh.b;
            qhVar.X();
            if (qhVar.Q) {
                qhVar.k(giVar);
            } else {
                qhVar.h0();
            }
            ld0.r(qhVar, dh.e, c);
            ld0.r(qhVar, dh.d, l);
            ld0.r(qhVar, dh.c, D);
            h6 h6Var = dh.f;
            if (qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                y6.y(A, qhVar, A, h6Var);
            }
            qhVar.q(true);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new ba(u50Var, i);
        }
    }

    public static final void b(xf0 xf0Var, yf0 yf0Var, b50 b50Var, c10 c10Var, int i, int i2, o9 o9Var) {
        o9 o9Var2;
        Object f = b50Var.f();
        aa aaVar = f instanceof aa ? (aa) f : null;
        xf0.i(xf0Var, yf0Var, ((aaVar == null || (o9Var2 = aaVar.r) == null) ? o9Var : o9Var2).a(px0.c(yf0Var.d, yf0Var.e), px0.c(i, i2), c10Var));
    }

    public static final HashMap c(boolean z) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z, b2.e);
        d(hashMap, z, b2.f);
        d(hashMap, z, b2.g);
        d(hashMap, z, b2.h);
        d(hashMap, z, b2.i);
        d(hashMap, z, b2.j);
        d(hashMap, z, b2.k);
        d(hashMap, z, b2.l);
        d(hashMap, z, b2.m);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z, o9 o9Var) {
        hashMap.put(o9Var, new fa(o9Var, z));
    }

    public static final g50 e(o9 o9Var, boolean z) {
        g50 g50Var = (g50) (z ? a : b).get(o9Var);
        return g50Var == null ? new fa(o9Var, z) : g50Var;
    }
}
