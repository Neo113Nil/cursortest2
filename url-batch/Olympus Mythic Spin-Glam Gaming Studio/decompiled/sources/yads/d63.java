package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class d63 {
    public final c63 a(Context context, yu2 yu2Var, v3 v3Var, t8 t8Var, x8 x8Var, boolean z) {
        vw2 vw2Var;
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
        bu2 a = vw2Var2.a(context);
        if (a != null) {
            boolean z2 = a.f;
        }
        return new qb0(context, yu2Var, v3Var, t8Var, x8Var, z);
    }
}
