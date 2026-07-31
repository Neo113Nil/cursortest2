package yads;

import android.content.Context;

/* loaded from: classes15.dex */
public final class oa2 {
    public final ca2 a;
    public final da2 b;
    public final pa2 c;
    public final Context d;

    public oa2(Context context, xt3 xt3Var) {
        da2 da2Var;
        ca2 ca2Var = new ca2(context, xt3Var);
        da2 da2Var2 = da2.d;
        if (da2Var2 == null) {
            synchronized (da2.c) {
                da2Var = da2.d;
                if (da2Var == null) {
                    da2Var = new da2();
                    da2.d = da2Var;
                }
            }
            da2Var2 = da2Var;
        }
        pa2 pa2Var = new pa2();
        this.a = ca2Var;
        this.b = da2Var2;
        this.c = pa2Var;
        this.d = context.getApplicationContext();
    }
}
