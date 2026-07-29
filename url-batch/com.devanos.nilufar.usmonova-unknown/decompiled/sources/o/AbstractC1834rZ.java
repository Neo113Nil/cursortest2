package o;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: o.rZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1834rZ {
    public static C1142h10 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1142h10 c = C1142h10.c(rootWindowInsets, null);
        C1010f10 c1010f10 = c.a;
        c1010f10.p(c);
        c1010f10.d(view.getRootView());
        return c;
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
