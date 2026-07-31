package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class Oi {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Oi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return Oi.a();
        }
    });

    public static final JSONObject a(String str, int i) {
        JSONObject a2 = AbstractC4318rj.a(str, "targetViewId", "id", str);
        a2.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        return a2;
    }

    public static final Uo b(WindowInsets windowInsets) {
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Uo e = e(windowInsets);
        Uo c = c(windowInsets);
        Uo d = d(windowInsets);
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        insets = windowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return a(e, c, d, new Uo(i, i2, i3, i4));
    }

    public static final Uo c(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        DisplayCutout displayCutout2;
        DisplayCutout displayCutout3;
        DisplayCutout displayCutout4;
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        F5.a.getClass();
        if (F5.t()) {
            insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            i = insets.left;
            i2 = insets.top;
            i3 = insets.right;
            i4 = insets.bottom;
            return new Uo(i, i2, i3, i4);
        }
        if (!F5.r()) {
            return (Uo) a.getValue();
        }
        displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        displayCutout4 = windowInsets.getDisplayCutout();
        return new Uo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final Uo d(WindowInsets windowInsets) {
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        int i;
        int i2;
        int i3;
        int radius;
        int radius2;
        int radius3;
        int radius4;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        F5.a.getClass();
        if (!F5.u()) {
            return (Uo) a.getValue();
        }
        roundedCorner = windowInsets.getRoundedCorner(3);
        int i4 = 0;
        roundedCorner2 = windowInsets.getRoundedCorner(0);
        roundedCorner3 = windowInsets.getRoundedCorner(1);
        roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            radius4 = roundedCorner.getRadius();
            i = (int) (Math.sin(Math.toRadians(45.0d)) * radius4);
        } else {
            i = 0;
        }
        if (roundedCorner2 != null) {
            radius3 = roundedCorner2.getRadius();
            i2 = (int) (Math.sin(Math.toRadians(45.0d)) * radius3);
        } else {
            i2 = 0;
        }
        if (roundedCorner3 != null) {
            radius2 = roundedCorner3.getRadius();
            i3 = (int) (Math.sin(Math.toRadians(45.0d)) * radius2);
        } else {
            i3 = 0;
        }
        if (roundedCorner4 != null) {
            radius = roundedCorner4.getRadius();
            i4 = (int) (Math.sin(Math.toRadians(45.0d)) * radius);
        }
        return new Uo(Math.max(i, i2), Math.max(i2, i3), Math.max(i4, i3), Math.max(i, i4));
    }

    public static final Uo e(WindowInsets windowInsets) {
        Insets systemGestureInsets;
        int i;
        Insets systemGestureInsets2;
        int i2;
        Insets systemGestureInsets3;
        int i3;
        Insets systemGestureInsets4;
        int i4;
        Insets insets;
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        F5.a.getClass();
        if (F5.t()) {
            insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemGestures());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            i5 = insets.left;
            i6 = insets.top;
            i7 = insets.right;
            i8 = insets.bottom;
            return new Uo(i5, i6, i7, i8);
        }
        if (!F5.s()) {
            return (Uo) a.getValue();
        }
        systemGestureInsets = windowInsets.getSystemGestureInsets();
        i = systemGestureInsets.left;
        systemGestureInsets2 = windowInsets.getSystemGestureInsets();
        i2 = systemGestureInsets2.top;
        systemGestureInsets3 = windowInsets.getSystemGestureInsets();
        i3 = systemGestureInsets3.right;
        systemGestureInsets4 = windowInsets.getSystemGestureInsets();
        i4 = systemGestureInsets4.bottom;
        return new Uo(i, i2, i3, i4);
    }

    public static final void c(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        F5.a.getClass();
        if (F5.t()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            insetsController.show(WindowInsetsCompat.Type.systemBars());
            insetsController.show(WindowInsetsCompat.Type.displayCutout());
            return;
        }
        if (F5.w()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            window.getDecorView().setSystemUiVisibility(0);
        }
    }

    public static final void b(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        F5.a.getClass();
        if (F5.r()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 0;
            window.setAttributes(attributes);
            WindowCompat.setDecorFitsSystemWindows(window, true);
        }
    }

    public static final Uo a() {
        return new Uo(0, 0, 0, 0);
    }

    public static final Uo a(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (Uo) a.getValue());
    }

    public static final Uo a(Uo area, Uo display, Uo roundedCorner, Uo navigationBar) {
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(roundedCorner, "roundedCorner");
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        return new Uo(ComparisonsKt.maxOf(area.a, display.a, roundedCorner.a, navigationBar.a), ComparisonsKt.maxOf(area.b, display.b, roundedCorner.b, navigationBar.b), ComparisonsKt.maxOf(area.c, display.c, roundedCorner.c, navigationBar.c), ComparisonsKt.maxOf(area.d, display.d, roundedCorner.d, navigationBar.d));
    }

    public static final void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        F5.a.getClass();
        if (F5.t()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.systemBars());
            insetsController.hide(WindowInsetsCompat.Type.displayCutout());
            return;
        }
        if (F5.w()) {
            Intrinsics.checkNotNullParameter(window, "<this>");
            window.getDecorView().setSystemUiVisibility(5638);
        }
    }

    public static final void a(Window window, int i) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = i;
        window.setAttributes(attributes);
        WindowCompat.setDecorFitsSystemWindows(window, false);
    }
}
