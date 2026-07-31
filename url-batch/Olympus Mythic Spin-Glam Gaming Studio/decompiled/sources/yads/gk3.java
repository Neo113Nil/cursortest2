package yads;

import android.content.Context;
import android.view.View;

/* loaded from: classes4.dex */
public final class gk3 implements bv {
    public final View a;

    public gk3(View view) {
        this.a = view;
    }

    @Override // yads.bv
    public final void a(kf1 kf1Var, dv dvVar) {
        Context context = this.a.getContext();
        a22 a22Var = dvVar.c;
        ev evVar = a22Var.a;
        ph phVar = dvVar.a;
        r3 r3Var = dvVar.b;
        mn2 mn2Var = dvVar.d;
        t41 t41Var = dvVar.e;
        evVar.getClass();
        y12 y12Var = new y12(context, new h02(phVar, r3Var, a22Var, mn2Var, kf1Var, t41Var));
        this.a.setOnTouchListener(y12Var);
        this.a.setOnClickListener(y12Var);
    }
}
