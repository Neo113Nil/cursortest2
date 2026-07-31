package yads;

import android.view.View;

/* loaded from: classes4.dex */
public final class jw implements View.OnClickListener {
    public final d2 a;
    public final z30 b;

    public jw(d2 d2Var, z30 z30Var) {
        this.a = d2Var;
        this.b = z30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e();
        this.b.a(y30.c);
    }
}
