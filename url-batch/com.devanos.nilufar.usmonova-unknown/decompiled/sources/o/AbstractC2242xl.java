package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2242xl {
    public static C1589nr a(C1602o10 c1602o10, FoldingFeature foldingFeature) {
        C0457Rn c0457Rn;
        C0457Rn c0457Rn2;
        int type = foldingFeature.getType();
        if (type == 1) {
            c0457Rn = C0457Rn.n;
        } else {
            if (type != 2) {
                return null;
            }
            c0457Rn = C0457Rn.f99o;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0457Rn2 = C0457Rn.l;
        } else {
            if (state != 2) {
                return null;
            }
            c0457Rn2 = C0457Rn.m;
        }
        Rect bounds = foldingFeature.getBounds();
        AbstractC0048Bt.m(bounds, "oemFeature.bounds");
        int i = bounds.left;
        int i2 = bounds.top;
        int i3 = bounds.right;
        int i4 = bounds.bottom;
        if (i > i3) {
            throw new IllegalArgumentException(AbstractC1888sN.g(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(AbstractC1888sN.g(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
        Rect a = c1602o10.a.a();
        int i5 = i4 - i2;
        if (i5 == 0 && i3 - i == 0) {
            return null;
        }
        int i6 = i3 - i;
        if (i6 != a.width() && i5 != a.height()) {
            return null;
        }
        if (i6 < a.width() && i5 < a.height()) {
            return null;
        }
        if (i6 == a.width() && i5 == a.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        AbstractC0048Bt.m(bounds2, "oemFeature.bounds");
        return new C1589nr(new C2137w8(bounds2), c0457Rn, c0457Rn2);
    }

    public static C1470m10 b(Context context, WindowLayoutInfo windowLayoutInfo) {
        C1602o10 c1602o10;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        AbstractC0048Bt.n(windowLayoutInfo, "info");
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            if (i < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i2 = C1734q10.b;
            return c(C1734q10.a((Activity) context), windowLayoutInfo);
        }
        int i3 = C1734q10.b;
        if (i < 30) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                boolean z = context2 instanceof Activity;
                if (!z && !(context2 instanceof InputMethodService)) {
                    ContextWrapper contextWrapper = (ContextWrapper) context2;
                    if (contextWrapper.getBaseContext() != null) {
                        context2 = contextWrapper.getBaseContext();
                        AbstractC0048Bt.m(context2, "iterator.baseContext");
                    }
                }
                if (z) {
                    c1602o10 = C1734q10.a((Activity) context);
                } else {
                    if (!(context2 instanceof InputMethodService)) {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                    Object systemService = context.getSystemService("window");
                    AbstractC0048Bt.l(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    AbstractC0048Bt.m(defaultDisplay, "wm.defaultDisplay");
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Rect rect = new Rect(0, 0, point.x, point.y);
                    int i4 = Build.VERSION.SDK_INT;
                    C1142h10 b = (i4 >= 30 ? new Y00() : i4 >= 29 ? new X00() : new W00()).b();
                    AbstractC0048Bt.m(b, "Builder().build()");
                    c1602o10 = new C1602o10(new C2137w8(rect), b);
                }
            }
            throw new IllegalArgumentException("Context " + context + " is not a UiContext");
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        C1142h10 c = C1142h10.c(windowInsets, null);
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        AbstractC0048Bt.m(bounds, "wm.currentWindowMetrics.bounds");
        c1602o10 = new C1602o10(new C2137w8(bounds), c);
        return c(c1602o10, windowLayoutInfo);
    }

    public static C1470m10 c(C1602o10 c1602o10, WindowLayoutInfo windowLayoutInfo) {
        C1589nr c1589nr;
        AbstractC0048Bt.n(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        AbstractC0048Bt.m(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                AbstractC0048Bt.m(foldingFeature, "feature");
                c1589nr = a(c1602o10, foldingFeature);
            } else {
                c1589nr = null;
            }
            if (c1589nr != null) {
                arrayList.add(c1589nr);
            }
        }
        return new C1470m10(arrayList);
    }
}
