package yads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class cr2 implements hx0 {
    public final Context a;
    public final yu2 b;

    public cr2(Context context, yu2 yu2Var) {
        this.a = context;
        this.b = yu2Var;
    }

    @Override // yads.hx0
    public final mx0 a(t8 t8Var, v3 v3Var, xw0 xw0Var) {
        return new br2(this.a, t8Var, v3Var, this.b, xw0Var);
    }
}
