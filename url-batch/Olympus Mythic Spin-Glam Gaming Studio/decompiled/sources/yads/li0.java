package yads;

import android.view.View;

/* loaded from: classes4.dex */
public final class li0 implements View.OnClickListener {
    public final ki0 a;
    public final ni0 b;

    public li0(ki0 ki0Var, ni0 ni0Var) {
        this.a = ki0Var;
        this.b = ni0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            this.a.a(this.b.a, view);
        }
    }
}
