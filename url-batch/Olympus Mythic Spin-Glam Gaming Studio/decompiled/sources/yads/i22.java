package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class i22 {
    public final Context a;
    public final zy1 b;
    public final vw2 c;

    public i22(Context context, zy1 zy1Var, v22 v22Var) {
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
        this.a = context;
        this.b = zy1Var;
        this.c = vw2Var2;
    }
}
