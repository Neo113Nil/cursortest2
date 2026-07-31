package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class v00 {
    public final vb1 a;

    public v00(Context context, nt3 nt3Var) {
        vw2 vw2Var;
        Context applicationContext = context.getApplicationContext();
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
        bu2 a = vw2Var2.a(applicationContext);
        this.a = a != null ? a.H : false ? new ls(applicationContext, nt3Var) : new wn(applicationContext, nt3Var);
        h1.a(context);
    }
}
