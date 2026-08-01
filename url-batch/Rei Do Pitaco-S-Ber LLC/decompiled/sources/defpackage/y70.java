package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class y70 {
    public static db0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        db0 g = db0.g(null, rootWindowInsets);
        ab0 ab0Var = g.a;
        ab0Var.v(g);
        View rootView = view.getRootView();
        ab0Var.d(rootView);
        ab0Var.o(rootView);
        ab0Var.p();
        return g;
    }
}
