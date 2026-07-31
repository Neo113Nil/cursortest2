package yads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class zi0 {
    public final vw2 a;

    public zi0() {
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
        this.a = vw2Var2;
    }

    public final boolean a(Context context) {
        bu2 a = this.a.a(context);
        return (a == null || a.v) ? false : true;
    }
}
