package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class hx1 {
    public final ix1 a(Context context) {
        ix1 ix1Var = ix1.d;
        if (ix1Var == null) {
            synchronized (this) {
                try {
                    ix1Var = ix1.d;
                    if (ix1Var == null) {
                        bu2 a = uw2.a().a(context);
                        ix1Var = new ix1(a != null ? a.b : 0);
                        ix1.d = ix1Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ix1Var;
    }
}
