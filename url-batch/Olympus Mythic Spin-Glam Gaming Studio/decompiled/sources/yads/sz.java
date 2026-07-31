package yads;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class sz implements View.OnClickListener {
    public final qx1 a;
    public final kx1 b;

    public sz(qx1 qx1Var, kx1 kx1Var) {
        this.a = qx1Var;
        this.b = kx1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        kx1 kx1Var = this.b;
        if (kx1Var != null) {
            kx1Var.a();
            kx1Var.e = false;
        }
        qx1 qx1Var = this.a;
        if (qx1Var.c) {
            qx1Var.a("first_click_on_controls");
            qx1Var.c = false;
        }
    }
}
