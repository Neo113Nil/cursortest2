package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ta0 extends sa0 {
    public io r;

    public ta0(db0 db0Var, WindowInsets windowInsets) {
        super(db0Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.ab0
    public db0 b() {
        return db0.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.ab0
    public db0 c() {
        return db0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.ab0
    public final io k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = io.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.ab0
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.ab0
    public void w(io ioVar) {
        this.r = ioVar;
    }
}
