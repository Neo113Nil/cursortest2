package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class l8 {
    public final we0 a(Context context, int i) {
        Integer num;
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
        return new we0(1.0f, i, (a == null || (num = a.L) == null) ? 0 : num.intValue());
    }
}
