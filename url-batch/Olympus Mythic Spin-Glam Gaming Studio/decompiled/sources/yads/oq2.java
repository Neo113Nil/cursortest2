package yads;

import android.app.Dialog;

/* loaded from: classes14.dex */
public final class oq2 implements r2 {
    public final pr2 a;
    public final pq2 b;

    public oq2(o2 o2Var, pr2 pr2Var) {
        pq2 pq2Var = new pq2(o2Var);
        this.a = pr2Var;
        this.b = pq2Var;
    }

    @Override // yads.r2
    public final void b() {
        pr2 pr2Var = this.a;
        pr2Var.d = true;
        Dialog dialog = pr2Var.b.d;
        if (dialog != null) {
            vg0.a(dialog);
        }
        this.b.a.a(13, null);
    }
}
