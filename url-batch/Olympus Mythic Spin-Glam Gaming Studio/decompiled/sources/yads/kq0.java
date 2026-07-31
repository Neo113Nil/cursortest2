package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public abstract class kq0 {
    public static lq0 a;

    public static final synchronized lq0 a(Context context) {
        lq0 lq0Var;
        synchronized (kq0.class) {
            lq0Var = a;
            if (lq0Var == null) {
                lq0Var = new lq0(context);
                a = lq0Var;
            }
        }
        return lq0Var;
    }
}
