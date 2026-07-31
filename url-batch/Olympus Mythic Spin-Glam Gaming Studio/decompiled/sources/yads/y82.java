package yads;

import android.content.Context;

/* loaded from: classes15.dex */
public abstract class y82 {
    public static final int a(Context context) {
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
        if (a != null && (num = a.v0) != null) {
            if (num.intValue() == 0) {
                num = null;
            }
            if (num != null) {
                return num.intValue();
            }
        }
        return 1;
    }
}
