package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class pv {
    public final Runnable a;
    public final e40 b = new e40(new qb(2, this));

    public pv(Runnable runnable) {
        this.a = runnable;
    }

    public final oe a() {
        return ((nv) this.b.a()).c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        e40 e40Var = this.b;
        ((nv) e40Var.a()).c.c(new iv(onBackInvokedDispatcher, 0), 1);
        ((nv) e40Var.a()).c.c(new iv(onBackInvokedDispatcher, 1000000), 0);
    }
}
