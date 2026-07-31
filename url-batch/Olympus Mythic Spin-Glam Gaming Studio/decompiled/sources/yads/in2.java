package yads;

import android.content.Context;

/* loaded from: classes12.dex */
public final class in2 {
    public final v3 a;
    public final t8 b;
    public final r9 c;
    public final mt1 d;
    public final bu2 e;
    public final lx f;
    public v42 g;

    public in2(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var, r9 r9Var) {
        vw2 vw2Var;
        yu2Var.getClass();
        mt1 a = ud.a(context, new dq3(((nt3) yu2Var).a));
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a2 = vw2Var2.a(context);
        lx lxVar = new lx();
        this.a = v3Var;
        this.b = t8Var;
        this.c = r9Var;
        this.d = a;
        this.e = a2;
        this.f = lxVar;
    }
}
