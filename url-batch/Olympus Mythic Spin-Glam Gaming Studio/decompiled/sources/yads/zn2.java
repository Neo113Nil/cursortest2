package yads;

import android.view.View;

/* loaded from: classes5.dex */
public final class zn2 implements View.OnClickListener {
    public final ak3 a;
    public final x62 b;
    public final xn2 c;

    public zn2(ak3 ak3Var, x62 x62Var, xn2 xn2Var) {
        this.a = ak3Var;
        this.b = x62Var;
        this.c = xn2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q72 q72Var = (q72) this.a.b();
        if (q72Var != null) {
            wn2 wn2Var = q72Var.c.a;
            this.c.getClass();
            xn2.a(wn2Var);
            y62 y62Var = this.b.a;
            y62Var.a(y62Var.i);
        }
    }
}
