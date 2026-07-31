package yads;

import android.content.Context;

/* loaded from: classes13.dex */
public abstract class bf3 {
    public static cf3 a(Context context) {
        cf3 cf3Var;
        cf3 cf3Var2 = cf3.c;
        if (cf3Var2 != null) {
            return cf3Var2;
        }
        synchronized (cf3.b) {
            cf3Var = cf3.c;
            if (cf3Var == null) {
                ep2 a = up3.a(context, 1);
                a.a(new to2());
                cf3Var = new cf3(a);
                cf3.c = cf3Var;
            }
        }
        return cf3Var;
    }
}
