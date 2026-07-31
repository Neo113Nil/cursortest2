package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class b8 {
    public final t8 a;
    public final v3 b;
    public final x12 c;
    public final mt1 d;
    public final a8 e;
    public final bu2 f;

    public b8(Context context, t8 t8Var, v3 v3Var, i5 i5Var, x12 x12Var, mt1 mt1Var) {
        vw2 vw2Var;
        a8 a8Var = new a8(i5Var);
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
        this.a = t8Var;
        this.b = v3Var;
        this.c = x12Var;
        this.d = mt1Var;
        this.e = a8Var;
        this.f = a;
    }
}
