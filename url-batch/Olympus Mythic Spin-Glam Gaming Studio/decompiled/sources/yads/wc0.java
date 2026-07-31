package yads;

import android.view.View;

/* loaded from: classes.dex */
public final class wc0 implements zv {
    public final View a;
    public final pl3 b;
    public final z30 c;
    public final long d;
    public final gw e;
    public final oc2 f;

    public wc0(View view, pl3 pl3Var, z30 z30Var, long j, gw gwVar) {
        oc2 a = lc2.a(true);
        this.a = view;
        this.b = pl3Var;
        this.c = z30Var;
        this.d = j;
        this.e = gwVar;
        this.f = a;
        pl3Var.getClass();
        view.setVisibility(8);
    }

    @Override // yads.zv
    public final void a() {
        this.f.d();
    }

    @Override // yads.zv
    public final void b() {
        this.f.b();
    }

    @Override // yads.zv
    public final void invalidate() {
        this.f.a();
    }

    @Override // yads.zv
    public final void onAdDisplayed() {
        vc0 vc0Var = new vc0(this.a, this.b, this.c);
        long max = (long) Math.max(0.0d, this.d - this.e.a);
        if (max == 0) {
            pl3 pl3Var = this.b;
            View view = this.a;
            pl3Var.getClass();
            view.setVisibility(0);
            return;
        }
        oc2 oc2Var = this.f;
        oc2Var.e = this.e;
        oc2Var.a(max, vc0Var);
        this.c.a(y30.f);
    }
}
