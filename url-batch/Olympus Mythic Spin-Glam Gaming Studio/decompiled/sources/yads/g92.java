package yads;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class g92 {
    public static final Object a = new Object();
    public static volatile ep2 b;

    public static final ep2 a(Context context) {
        ep2 ep2Var;
        ep2 ep2Var2 = b;
        if (ep2Var2 != null) {
            return ep2Var2;
        }
        synchronized (a) {
            ep2 ep2Var3 = b;
            if (ep2Var3 == null) {
                ep2Var = fp2.a(context, y82.a(context));
                b = ep2Var;
                ep2Var.a();
            } else {
                ep2Var = ep2Var3;
            }
        }
        return ep2Var;
    }
}
