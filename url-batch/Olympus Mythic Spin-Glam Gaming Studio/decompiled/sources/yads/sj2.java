package yads;

import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes15.dex */
public final class sj2 implements zv {
    public final View a;
    public final ProgressBar b;
    public final fm0 c;
    public final z30 d;
    public final yj2 e;
    public final long f;
    public final oc2 g = lc2.a(true);
    public final rj2 h;
    public final qj2 i;

    public sj2(View view, ProgressBar progressBar, fm0 fm0Var, fw fwVar, z30 z30Var, yj2 yj2Var, long j) {
        this.a = view;
        this.b = progressBar;
        this.c = fm0Var;
        this.d = z30Var;
        this.e = yj2Var;
        this.f = j;
        this.h = new rj2(view, fm0Var, z30Var);
        this.i = new qj2(progressBar, fwVar, j);
    }

    @Override // yads.zv
    public final void a() {
        this.g.d();
    }

    @Override // yads.zv
    public final void b() {
        this.g.b();
    }

    @Override // yads.zv
    public final void invalidate() {
        this.g.a();
    }

    @Override // yads.zv
    public final void onAdDisplayed() {
        ProgressBar progressBar = this.b;
        int i = (int) this.f;
        int i2 = (int) this.e.a;
        progressBar.setMax(i);
        progressBar.setVisibility(0);
        progressBar.setProgress(i2);
        long max = Math.max(0L, this.f - this.e.a);
        if (max != 0) {
            this.c.a(this.a);
            oc2 oc2Var = this.g;
            oc2Var.e = this.i;
            oc2Var.a(max, this.h);
            this.d.a(y30.f);
        }
    }
}
