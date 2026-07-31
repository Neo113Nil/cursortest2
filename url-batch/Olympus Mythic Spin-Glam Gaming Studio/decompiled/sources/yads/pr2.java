package yads;

import android.app.Activity;

/* loaded from: classes3.dex */
public final class pr2 implements fz {
    public final Activity a;
    public final pi0 b;
    public final d2 c;
    public boolean d;

    public pr2(Activity activity, pi0 pi0Var, d2 d2Var) {
        this.a = activity;
        this.b = pi0Var;
        this.c = d2Var;
    }

    @Override // yads.fz
    public final void e() {
        if (this.d) {
            this.c.e();
        } else {
            this.b.a(this.a);
        }
    }
}
