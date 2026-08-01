package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o9 extends a60 {
    public boolean a = false;
    public final ViewGroup b;

    public o9(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.a60, defpackage.w50
    public final void b() {
        k80.b(this.b, false);
    }

    @Override // defpackage.a60, defpackage.w50
    public final void c() {
        k80.b(this.b, true);
    }

    @Override // defpackage.w50
    public final void d(z50 z50Var) {
        if (!this.a) {
            k80.b(this.b, false);
        }
        z50Var.y(this);
    }

    @Override // defpackage.a60, defpackage.w50
    public final void f(z50 z50Var) {
        k80.b(this.b, false);
        this.a = true;
    }
}
