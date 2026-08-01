package K;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class I {
    public static x0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        x0 g2 = x0.g(null, rootWindowInsets);
        v0 v0Var = g2.f468a;
        v0Var.p(g2);
        v0Var.d(view.getRootView());
        return g2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
