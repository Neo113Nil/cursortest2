package yads;

import android.content.Context;

/* loaded from: classes14.dex */
public final class h92 {
    public final k92 a(Context context) {
        k92 k92Var = k92.e;
        if (k92Var == null) {
            synchronized (this) {
                k92Var = k92.e;
                if (k92Var == null) {
                    k92Var = new k92(context);
                    k92.e = k92Var;
                }
            }
        }
        return k92Var;
    }
}
