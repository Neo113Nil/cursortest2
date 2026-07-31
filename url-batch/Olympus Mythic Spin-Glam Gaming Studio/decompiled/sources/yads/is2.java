package yads;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class is2 implements hg0 {
    public final z1 a;
    public final l73 b;
    public final h52 c;
    public final hs2 d;

    public is2(z1 z1Var, l73 l73Var, p42 p42Var, x63 x63Var) {
        h52 h52Var = new h52(l73Var, p42Var, x63Var);
        hs2 hs2Var = new hs2(h52Var);
        this.a = z1Var;
        this.b = l73Var;
        this.c = h52Var;
        this.d = hs2Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        z1 z1Var = this.a;
        z1Var.b.add(this.d);
        this.b.getClass();
        View findViewWithTag = viewGroup.findViewWithTag("timer_container");
        if (findViewWithTag == null) {
            findViewWithTag = null;
        }
        h52 h52Var = this.c;
        h52Var.c = findViewWithTag;
        ww0 ww0Var = h52Var.b;
        if (ww0Var != null) {
            ww0Var.start();
        }
    }

    @Override // yads.hg0
    public final void c() {
        z1 z1Var = this.a;
        z1Var.b.remove(this.d);
        h52 h52Var = this.c;
        h52Var.c = null;
        ww0 ww0Var = h52Var.b;
        if (ww0Var != null) {
            ww0Var.invalidate();
        }
    }
}
