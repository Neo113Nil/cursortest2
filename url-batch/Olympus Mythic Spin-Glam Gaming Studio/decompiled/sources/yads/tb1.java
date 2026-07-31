package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class tb1 extends bx0 {
    public final wk2 F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tb1(Context context, yu2 yu2Var, e5 e5Var, dx0 dx0Var, d8 d8Var) {
        super(context, r8, yu2Var, r14, r6, r7, r9);
        i5 i5Var = new i5();
        v3 v3Var = new v3(e00.e);
        x12 x12Var = new x12(v3Var);
        rb1 rb1Var = new rb1(context, yu2Var);
        wk2 wk2Var = new wk2(context, v3Var, yu2Var, i5Var, new ac1(context, dx0Var));
        this.F = wk2Var;
        v3Var.e = d8Var;
        wk2Var.e = new sb1(e5Var, this);
        g8 g8Var = new g8(v3Var);
        k5 k5Var = wk2Var.c;
        k5Var.e = g8Var;
        k5Var.f = x12Var;
    }

    public final void a(u00 u00Var) {
        wk2 wk2Var = this.F;
        wk2Var.d = u00Var;
        wk2Var.c.a(u00Var);
    }

    @Override // yads.bx0
    public final xw0 a(yw0 yw0Var) {
        return yw0Var.a(this, this.x);
    }
}
