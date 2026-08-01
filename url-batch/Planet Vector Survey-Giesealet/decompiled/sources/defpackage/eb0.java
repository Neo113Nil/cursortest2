package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class eb0 {
    public final Runnable a;
    public final lu0 b = new lu0(new ab0(0, this));

    public eb0(Runnable runnable) {
        this.a = runnable;
    }

    public final f90 a() {
        return ((cb0) this.b.getValue()).c;
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().c(new va0(onBackInvokedDispatcher, 0), 1);
        a().c(new va0(onBackInvokedDispatcher, 1000000), 0);
    }
}
