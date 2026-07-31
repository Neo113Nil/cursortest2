package yads;

import android.content.Context;

/* loaded from: classes8.dex */
public final class er2 extends bx0 {
    public final yk2 F;
    public final uq2 G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public er2(Context context, yu2 yu2Var, e5 e5Var, dx0 dx0Var, d8 d8Var) {
        super(context, r9, yu2Var, r13, r7, r11, r10);
        v3 v3Var = new v3(e00.f);
        i5 i5Var = new i5();
        x12 x12Var = new x12(v3Var);
        cr2 cr2Var = new cr2(context, yu2Var);
        yk2 yk2Var = new yk2(context, v3Var, yu2Var, i5Var, new lr2(context, dx0Var));
        uq2 uq2Var = new uq2();
        this.F = yk2Var;
        this.G = uq2Var;
        v3Var.e = d8Var;
        yk2Var.f = new dr2(e5Var, this);
        g8 g8Var = new g8(v3Var);
        k5 k5Var = yk2Var.c;
        k5Var.e = g8Var;
        k5Var.f = x12Var;
    }

    @Override // yads.bx0, yads.wp2
    public final void a(t8 t8Var) {
        sq2 sq2Var = t8Var.r;
        this.G.getClass();
        if (sq2Var == null || (!sq2Var.b ? sq2Var.c != null : sq2Var.d != null)) {
            b(e8.c);
        } else {
            super.a(t8Var);
        }
    }

    public final void a(o10 o10Var) {
        yk2 yk2Var = this.F;
        yk2Var.e = o10Var;
        yk2Var.c.a(o10Var);
    }

    @Override // yads.bx0
    public final xw0 a(yw0 yw0Var) {
        return yw0Var.a(this, this.x);
    }
}
