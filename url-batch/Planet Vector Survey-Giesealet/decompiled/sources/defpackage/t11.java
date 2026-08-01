package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class t11 extends s11 {
    public oy n;

    public t11(d21 d21Var, WindowInsets windowInsets) {
        super(d21Var, windowInsets);
        this.n = null;
    }

    @Override // defpackage.z11
    public d21 b() {
        return d21.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.z11
    public d21 c() {
        return d21.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.z11
    public final oy i() {
        if (this.n == null) {
            WindowInsets windowInsets = this.c;
            this.n = oy.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.n;
    }

    @Override // defpackage.z11
    public boolean n() {
        return this.c.isConsumed();
    }

    @Override // defpackage.z11
    public void s(oy oyVar) {
        this.n = oyVar;
    }
}
