package yads;

import android.view.View;

/* loaded from: classes3.dex */
public final class lh3 implements View.OnClickListener {
    public final kf1 a;
    public final dv b;
    public final d20 c;

    public lh3(kf1 kf1Var, dv dvVar, d20 d20Var) {
        this.a = kf1Var;
        this.b = dvVar;
        this.c = d20Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d20 d20Var = this.c;
        kf1 kf1Var = this.a;
        kf1 kf1Var2 = new kf1(kf1Var.a, kf1Var.b, kf1Var.c, d20Var.f, kf1Var.e, false);
        dv dvVar = this.b;
        a22 a22Var = dvVar.c;
        ev evVar = a22Var.a;
        ph phVar = dvVar.a;
        r3 r3Var = dvVar.b;
        mn2 mn2Var = dvVar.d;
        t41 t41Var = dvVar.e;
        evVar.getClass();
        new h02(phVar, r3Var, a22Var, mn2Var, kf1Var2, t41Var).onClick(view);
    }
}
