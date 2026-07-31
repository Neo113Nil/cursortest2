package yads;

import android.content.Context;

/* loaded from: classes4.dex */
public final class i02 implements wm0 {
    public final k02 a;
    public final d1 b;

    public i02(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var) {
        k02 k02Var = new k02();
        d1 d1Var = new d1(context, v3Var, yu2Var, t8Var, k02Var);
        this.a = k02Var;
        this.b = d1Var;
    }

    @Override // yads.wm0
    public final void a() {
        this.a.a();
    }
}
