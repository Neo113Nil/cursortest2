package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class pa2 {
    public final vw2 a;

    public pa2() {
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
        if (oa.a(context)) {
            bu2 a = this.a.a(context);
            if (!(a != null ? a.w : true)) {
                return true;
            }
        }
        return false;
    }
}
