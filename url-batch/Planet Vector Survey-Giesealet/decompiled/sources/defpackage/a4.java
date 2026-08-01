package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a4 implements ComponentCallbacks2 {
    public final /* synthetic */ rk0 d;

    public a4(rk0 rk0Var) {
        this.d = rk0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        rk0 rk0Var = this.d;
        synchronized (rk0Var) {
            rk0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        rk0 rk0Var = this.d;
        synchronized (rk0Var) {
            rk0Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        rk0 rk0Var = this.d;
        synchronized (rk0Var) {
            rk0Var.a.c();
        }
    }
}
