package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class yz0 {
    public static d21 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        d21 c = d21.c(rootWindowInsets, null);
        z11 z11Var = c.a;
        z11Var.r(c);
        z11Var.d(view.getRootView());
        return c;
    }
}
