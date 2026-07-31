package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class bz1 {
    public final yu2 a;

    public bz1(yu2 yu2Var) {
        this.a = yu2Var;
    }

    public final np a(Context context, dz1 dz1Var, x72 x72Var, v72 v72Var, l02 l02Var, gw0 gw0Var, ry1 ry1Var, r9 r9Var) {
        v22 v22Var = v22.b;
        if (v22Var == null) {
            synchronized (v22.a) {
                v22Var = v22.b;
                if (v22Var == null) {
                    v22Var = new v22();
                    v22.b = v22Var;
                }
            }
        }
        zy1 zy1Var = new zy1(x72Var.a, v22Var);
        return new np(dz1Var, new z12(zy1Var, dz1Var.b), x72Var, v72Var, l02Var, new m5(gw0Var), new i22(context, zy1Var, v22Var), this.a, ry1Var, r9Var);
    }
}
