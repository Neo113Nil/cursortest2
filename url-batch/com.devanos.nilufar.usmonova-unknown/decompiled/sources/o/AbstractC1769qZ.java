package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.qZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1769qZ {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static C1142h10 b(View view, C1142h10 c1142h10, Rect rect) {
        WindowInsets b = c1142h10.b();
        if (b != null) {
            return C1142h10.c(view.computeSystemWindowInsets(b, rect), view);
        }
        rect.setEmpty();
        return c1142h10;
    }

    public static boolean c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean d(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static C1142h10 j(View view) {
        if (V00.d && view.isAttachedToWindow()) {
            try {
                Object obj = V00.a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) V00.b.get(obj);
                    Rect rect2 = (Rect) V00.c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        Z00 y00 = i >= 30 ? new Y00() : i >= 29 ? new X00() : new W00();
                        y00.c(C0644Ys.a(rect.left, rect.top, rect.right, rect.bottom));
                        y00.d(C0644Ys.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C1142h10 b = y00.b();
                        b.a.p(b);
                        b.a.d(view.getRootView());
                        return b;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            }
        }
        return null;
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f) {
        view.setElevation(f);
    }

    public static void t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void u(View view, QF qf) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, qf);
        }
        if (qf == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1703pZ(view, qf));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(View view, float f) {
        view.setZ(f);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
