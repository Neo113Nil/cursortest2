package yads;

import android.content.Context;

/* loaded from: classes15.dex */
public final class sn0 {
    public final v3 a;
    public final yu2 b;
    public final t8 c;
    public final tf1 d;
    public final bu2 e;
    public final Context f;

    public sn0(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var) {
        vw2 vw2Var;
        tf1 tf1Var = new tf1();
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
        this.a = v3Var;
        this.b = yu2Var;
        this.c = t8Var;
        this.d = tf1Var;
        this.e = a;
        this.f = context.getApplicationContext();
    }
}
