package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class i7 implements hv {
    public final /* synthetic */ n7 f;

    public /* synthetic */ i7(n7 n7Var) {
        this.f = n7Var;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f.a(0);
    }

    @Override // defpackage.hv
    public db0 k(View view, db0 db0Var) {
        int a = db0Var.a();
        n7 n7Var = this.f;
        n7Var.l = a;
        n7Var.m = db0Var.b();
        n7Var.n = db0Var.c();
        n7Var.e();
        return db0Var;
    }
}
