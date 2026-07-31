package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class km0 {
    public final q43 a = new q43();

    public final String a(Context context, String str) {
        String a;
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
        bu2 a2 = vw2Var2.a(context);
        return (a2 == null || !a2.B || (a = this.a.a(context, str)) == null) ? str : a;
    }
}
