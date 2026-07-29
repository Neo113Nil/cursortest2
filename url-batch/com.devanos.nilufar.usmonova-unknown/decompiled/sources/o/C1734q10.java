package o;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.q10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1734q10 implements InterfaceC1668p10 {
    public static final /* synthetic */ int b = 0;

    static {
        AbstractC0868ct.f(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public static C1602o10 a(Activity activity) {
        Rect rect;
        C1142h10 b2;
        WindowMetrics currentWindowMetrics;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            AbstractC0048Bt.m(rect, "wm.currentWindowMetrics.bounds");
        } else if (i >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e) {
                Log.w("q10", e);
                rect = b(activity);
            } catch (NoSuchFieldException e2) {
                Log.w("q10", e2);
                rect = b(activity);
            } catch (NoSuchMethodException e3) {
                Log.w("q10", e3);
                rect = b(activity);
            } catch (InvocationTargetException e4) {
                Log.w("q10", e4);
                rect = b(activity);
            }
        } else if (i >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i2 = rect.bottom + dimensionPixelSize;
                if (i2 == point.y) {
                    rect.bottom = i2;
                } else {
                    int i3 = rect.right + dimensionPixelSize;
                    if (i3 == point.x) {
                        rect.right = i3;
                    }
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            b2 = (i4 >= 30 ? new Y00() : i4 >= 29 ? new X00() : new W00()).b();
            AbstractC0048Bt.m(b2, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i4 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b2 = C2037ue.a.a(activity);
        }
        return new C1602o10(new C2137w8(rect), b2);
    }

    public static Rect b(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                AbstractC0048Bt.l(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e) {
            Log.w("q10", e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e2) {
            Log.w("q10", e2);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e3) {
            Log.w("q10", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e4) {
            Log.w("q10", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        AbstractC0048Bt.m(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (OI.k(obj2)) {
                    displayCutout = OI.d(obj2);
                }
            } catch (ClassNotFoundException e5) {
                Log.w("q10", e5);
            } catch (IllegalAccessException e6) {
                Log.w("q10", e6);
            } catch (InstantiationException e7) {
                Log.w("q10", e7);
            } catch (NoSuchFieldException e8) {
                Log.w("q10", e8);
            } catch (NoSuchMethodException e9) {
                Log.w("q10", e9);
            } catch (InvocationTargetException e10) {
                Log.w("q10", e10);
            }
            if (displayCutout != null) {
                int i3 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i3 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i4 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i4 == safeInsetRight) {
                    int i5 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i5;
                }
                int i6 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i6 == safeInsetTop) {
                    rect.top = 0;
                }
                int i7 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i7 == safeInsetBottom) {
                    int i8 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i8;
                }
            }
        }
        return rect;
    }
}
