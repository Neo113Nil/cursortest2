package yads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class wo3 {
    public static gh0 a(Context context) {
        DisplayCutout displayCutout;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        int displayCutout2;
        Insets insetsIgnoringVisibility2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!pa.a(30)) {
            if (!pa.a(28)) {
                return gh0.g;
            }
            Activity a = h1.a();
            if (a == null) {
                return gh0.g;
            }
            WindowInsets rootWindowInsets = a.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets == null) {
                return gh0.g;
            }
            tl3 tl3Var = hl3.a;
            float f = context.getResources().getDisplayMetrics().density;
            displayCutout = rootWindowInsets.getDisplayCutout();
            return new gh0(hl3.b(rootWindowInsets.getSystemWindowInsetLeft(), f), hl3.b(rootWindowInsets.getSystemWindowInsetTop(), f), hl3.b(rootWindowInsets.getSystemWindowInsetRight(), f), hl3.b(rootWindowInsets.getSystemWindowInsetBottom(), f), hl3.b(displayCutout != null ? displayCutout.getSafeInsetTop() : 0, f), hl3.b(displayCutout != null ? displayCutout.getSafeInsetBottom() : 0, f));
        }
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        systemBars = WindowInsets.Type.systemBars();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
        displayCutout2 = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(displayCutout2);
        tl3 tl3Var2 = hl3.a;
        float f2 = context.getResources().getDisplayMetrics().density;
        i = insetsIgnoringVisibility.left;
        float b = hl3.b(i, f2);
        i2 = insetsIgnoringVisibility.top;
        float b2 = hl3.b(i2, f2);
        i3 = insetsIgnoringVisibility.right;
        float b3 = hl3.b(i3, f2);
        i4 = insetsIgnoringVisibility.bottom;
        float b4 = hl3.b(i4, f2);
        i5 = insetsIgnoringVisibility2.top;
        float b5 = hl3.b(i5, f2);
        i6 = insetsIgnoringVisibility2.bottom;
        return new gh0(b, b2, b3, b4, b5, hl3.b(i6, f2));
    }
}
