package com.mobilefuse.sdk.ad.rendering.omniad;

import android.app.Activity;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetWindowRect.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getWindowRect", "Landroid/graphics/Rect;", "activity", "Landroid/app/Activity;", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final class WindowUtils {
    @NotNull
    public static final Rect getWindowRect(@NotNull Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = activity.getWindowManager();
            Intrinsics.checkNotNullExpressionValue(windowManager, "activity.windowManager");
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "activity.windowManager.currentWindowMetrics");
            bounds = currentWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
            windowInsets = currentWindowMetrics.getWindowInsets();
            systemBars = WindowInsets.Type.systemBars();
            insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowMetrics.windowInse…pe.systemBars()\n        )");
            int i5 = bounds.left;
            i = insetsIgnoringVisibility.left;
            int i6 = i5 + i;
            int i7 = bounds.top;
            i2 = insetsIgnoringVisibility.top;
            int i8 = i7 + i2;
            int i9 = bounds.right;
            i3 = insetsIgnoringVisibility.right;
            int i10 = bounds.bottom;
            i4 = insetsIgnoringVisibility.bottom;
            return new Rect(i6, i8, i9 - i3, i10 - i4);
        }
        Rect rect = new Rect();
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "activity.window");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }
}
