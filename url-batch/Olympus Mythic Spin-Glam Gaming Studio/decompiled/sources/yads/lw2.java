package yads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class lw2 implements yw0 {
    public final yu2 a;
    public final Context b;

    public lw2(Context context, yu2 yu2Var) {
        this.a = yu2Var;
        this.b = pz.a(context);
    }

    @Override // yads.yw0
    public final xw0 a(tb1 tb1Var, km kmVar) {
        return new ow2(this.b, tb1Var, kmVar, this.a);
    }

    @Override // yads.yw0
    public final xw0 a(jg jgVar, km kmVar) {
        return new ow2(this.b, jgVar, kmVar, this.a);
    }

    @Override // yads.yw0
    public final xw0 a(er2 er2Var, km kmVar) {
        return new rw2(this.b, er2Var, kmVar, this.a);
    }
}
