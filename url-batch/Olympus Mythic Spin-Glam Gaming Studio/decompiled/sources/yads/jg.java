package yads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class jg extends bx0 {
    public final uk2 F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jg(Context context, yu2 yu2Var, e5 e5Var, dx0 dx0Var, d8 d8Var) {
        super(context, r9, yu2Var, r13, r6, r7, r10);
        i5 i5Var = new i5();
        v3 v3Var = new v3(e00.i);
        x12 x12Var = new x12(v3Var);
        hg hgVar = new hg(context, yu2Var);
        uk2 uk2Var = new uk2(context, v3Var, yu2Var, i5Var, dx0Var);
        this.F = uk2Var;
        v3Var.e = d8Var;
        uk2Var.e = new ig(e5Var, this);
        uk2Var.b.f = x12Var;
        uk2Var.b.e = new g8(v3Var);
    }

    public final void a(g00 g00Var) {
        uk2 uk2Var = this.F;
        uk2Var.d = g00Var;
        uk2Var.b.a(g00Var);
    }

    @Override // yads.bx0
    public final xw0 a(yw0 yw0Var) {
        return yw0Var.a(this, this.x);
    }
}
