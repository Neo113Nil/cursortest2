package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes14.dex */
public class qi {
    private final Context a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a {
        private static final DisplayMetrics a;
        private static final float b;
        private static final int c;

        static {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            a = displayMetrics;
            b = displayMetrics.density;
            c = displayMetrics.densityDpi;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class b extends View.AccessibilityDelegate {
        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setViewIdResourceName(this.a);
        }
    }

    private qi(Context context) {
        this.a = context;
    }

    public static float a() {
        return a.b;
    }

    public static int a(int i, int i2, int i3) {
        return i3 <= i ? i : i3 > i2 ? i2 : i3;
    }

    public static int b() {
        return a.c;
    }

    public static int c() {
        return View.generateViewId();
    }

    public static void d(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i2 - view.getMeasuredWidth(), i - view.getMeasuredHeight(), i2, i);
    }

    public static void e(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i2, i - view.getMeasuredHeight(), view.getMeasuredWidth() + i2, i);
    }

    public static qi g(Context context) {
        return new qi(context);
    }

    public static int a(int i, Context context) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static void b(View view, int i, int i2, int i3) {
        a(view, i, i2, 0, 0, i3);
    }

    public static void c(View view, int i, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.layout(i2, i, view.getMeasuredWidth() + i2, view.getMeasuredHeight() + i);
    }

    public static boolean f(Context context) {
        return ((Activity) context).isInMultiWindowMode();
    }

    public static void b(View view, String str) {
        view.setAccessibilityDelegate(new b(str));
    }

    public static boolean b(View view) {
        Window window;
        for (View view2 = view; view2.isHardwareAccelerated() && (view2.getLayerType() & 1) == 0; view2 = (View) view2.getParent()) {
            if (!(view2.getParent() instanceof View)) {
                Context context = view.getContext();
                return ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
        }
        return false;
    }

    public static boolean d() {
        try {
            Class.forName(RecyclerView.class.getName());
            return true;
        } catch (Throwable unused) {
            mi.a("UiUtils: RecyclerView doesn't exist, add RecyclerView dependency to show cards");
            return false;
        }
    }

    public boolean e() {
        return (this.a.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Point c(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                displayCutout = WindowInsets.Type.displayCutout();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
                i = insetsIgnoringVisibility.right;
                i2 = insetsIgnoringVisibility.left;
                int i5 = i + i2;
                i3 = insetsIgnoringVisibility.top;
                i4 = insetsIgnoringVisibility.bottom;
                bounds = currentWindowMetrics.getBounds();
                point.y = bounds.height() - (i3 + i4);
                point.x = bounds.width() - i5;
                return point;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getSize(point);
                return point;
            }
        }
        return point;
    }

    public static int a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    public static String e(Context context) {
        int d = d(context);
        if (d == 2) {
            return "landscape";
        }
        if (d == 1) {
            return "portrait";
        }
        return null;
    }

    public static void a(View view, int i, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        ColorDrawable colorDrawable2 = new ColorDrawable(i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, colorDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, colorDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, iArr}, new int[]{a(i2), a(i)}), stateListDrawable, null));
    }

    public static int d(Context context) {
        Configuration configuration;
        Resources resources = context.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public int d(int i) {
        return (int) TypedValue.applyDimension(2, i, this.a.getResources().getDisplayMetrics());
    }

    public static void b(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return;
        }
        view.layout(i2 - view.getMeasuredWidth(), i, i2, view.getMeasuredHeight() + i);
    }

    public static Point b(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        int statusBars;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                navigationBars = WindowInsets.Type.navigationBars();
                displayCutout = WindowInsets.Type.displayCutout();
                int i5 = navigationBars | displayCutout;
                statusBars = WindowInsets.Type.statusBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(i5 | statusBars);
                i = insetsIgnoringVisibility.right;
                i2 = insetsIgnoringVisibility.left;
                int i6 = i + i2;
                i3 = insetsIgnoringVisibility.top;
                i4 = insetsIgnoringVisibility.bottom;
                bounds = currentWindowMetrics.getBounds();
                point.y = bounds.height() - (i3 + i4);
                point.x = bounds.width() - i6;
                return point;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getSize(point);
                return point;
            }
        }
        return point;
    }

    public static void a(View view, int i, int i2, int i3, int i4, int i5) {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, i});
        float f = i5;
        gradientDrawable.setCornerRadius(f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i2, i2});
        gradientDrawable2.setCornerRadius(f);
        if (i3 != 0) {
            gradientDrawable.setStroke(i4, i3);
            gradientDrawable2.setStroke(i4, i3);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        int[] iArr = StateSet.WILD_CARD;
        stateListDrawable.addState(iArr, gradientDrawable);
        view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, iArr}, new int[]{a(i2), a(i)}), stateListDrawable, null));
    }

    public static int c(int i) {
        return Math.round(i / (b() / 160.0f));
    }

    public static boolean a(Activity activity, View view) {
        while (view.isHardwareAccelerated() && (view.getLayerType() & 1) == 0) {
            if (!(view.getParent() instanceof View)) {
                Window window = activity.getWindow();
                return (window == null || (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
            view = (View) view.getParent();
        }
        return false;
    }

    public int b(int i) {
        return a(i);
    }

    public static void a(int i, int i2, int i3, int i4, View... viewArr) {
        int i5 = i3 - i;
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                c(view, ((i5 - view.getMeasuredHeight()) / 2) + i, i2);
                if (view.getMeasuredWidth() > 0) {
                    i2 += view.getMeasuredWidth() + i4;
                }
            }
        }
    }

    public static int a(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i = Math.max(i2, i);
        }
        return i;
    }

    public static void a(View view, int i, int i2, int i3) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i3));
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        int measuredWidth = i + (((i3 - i) - view.getMeasuredWidth()) / 2);
        int measuredHeight = i2 + (((i4 - i2) - view.getMeasuredHeight()) / 2);
        view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
    }

    public static void a(View view, String str) {
        view.setContentDescription(str);
        b(view, str);
    }

    public static DisplayMetrics a(Context context) {
        Display display;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return displayMetrics;
        }
        display.getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        if (1 == i) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        mi.a("UiUtils: Unknown screen orientation. Defaulting to portrait");
        return 9;
    }

    public static float a(View view) {
        if (view != null && view.getParent() != null && view.getWindowVisibility() == 0 && view.getVisibility() == 0 && view.getAlpha() >= 0.5f) {
            int width = view.getWidth();
            if (view.getHeight() > 0 && width > 0) {
                if (view.getGlobalVisibleRect(new Rect())) {
                    return (r3.width() * r3.height()) / ((width * r2) / 100.0f);
                }
            }
        }
        return 0.0f;
    }

    public int a(float f) {
        return (int) TypedValue.applyDimension(1, f, this.a.getResources().getDisplayMetrics());
    }
}
