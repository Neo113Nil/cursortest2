package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class bo1 implements j02 {
    public final ao1 a;
    public final yu2 b;

    public bo1(ao1 ao1Var, yu2 yu2Var) {
        this.a = ao1Var;
        this.b = yu2Var;
    }

    @Override // yads.j02
    public final i02 a(Context context, v3 v3Var, t8 t8Var) {
        i02 i02Var = new i02(context, v3Var, this.b, t8Var);
        this.a.a(i02Var);
        return i02Var;
    }
}
