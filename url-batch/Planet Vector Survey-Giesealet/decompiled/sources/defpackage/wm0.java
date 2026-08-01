package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wm0 {
    public static final j3 e = new j3(12, new ze(11), new sj(6));
    public final Map a;
    public final a70 b;
    public xm0 c;
    public final h d;

    public wm0(Map map) {
        this.a = map;
        long[] jArr = vn0.a;
        this.b = new a70();
        this.d = new h(6, this);
    }

    public final void a(Object obj, eg egVar, ih ihVar, int i) {
        int i2;
        qh qhVar = (qh) ihVar;
        qhVar.W(533563200);
        if ((i & 6) == 0) {
            i2 = (qhVar.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qhVar.h(egVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qhVar.h(this) ? 256 : 128;
        }
        int i3 = 1;
        if (qhVar.N(i2 & 1, (i2 & 147) != 146)) {
            if (!qhVar.Q && qhVar.F.g() == 207 && !nz.l(qhVar.F.f(), obj) && qhVar.y < 0) {
                qhVar.y = qhVar.F.g;
                qhVar.x = true;
            }
            qhVar.R(207, 0, null, obj);
            Object K = qhVar.K();
            y7 y7Var = hh.a;
            if (K == y7Var) {
                h hVar = this.d;
                if (!((Boolean) hVar.c(obj)).booleanValue()) {
                    g8.o("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.a.get(obj);
                lt0 lt0Var = zm0.a;
                an0 an0Var = new an0(new ym0(map, hVar));
                qhVar.e0(an0Var);
                K = an0Var;
            }
            an0 an0Var2 = (an0) K;
            nz.c(new ki0[]{zm0.a.a(an0Var2), q30.a.a(an0Var2)}, egVar, qhVar, (i2 & 112) | 8);
            boolean h = qhVar.h(this) | qhVar.h(obj) | qhVar.h(an0Var2);
            Object K2 = qhVar.K();
            if (h || K2 == y7Var) {
                K2 = new j20(this, obj, an0Var2, i3);
                qhVar.e0(K2);
            }
            mz.h(ky0.a, (mu) K2, qhVar);
            if (qhVar.x && qhVar.F.i == qhVar.y) {
                qhVar.y = -1;
                qhVar.x = false;
            }
            qhVar.q(false);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new cg(this, obj, egVar, i);
        }
    }
}
