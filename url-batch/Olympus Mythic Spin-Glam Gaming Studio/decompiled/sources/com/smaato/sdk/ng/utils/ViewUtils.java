package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public class ViewUtils {
    private static final AtomicInteger a = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets a(View view, View view2, WindowInsets windowInsets) {
        view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }

    public static void applyWindowInsets(final View view) {
        if (view != null) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.smaato.sdk.ng.utils.ViewUtils$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsets a2;
                    a2 = ViewUtils.a(view, view2, windowInsets);
                    return a2;
                }
            });
            view.setSystemUiVisibility(768);
        }
    }

    public static float asFloatPixels(float f, Context context) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int asIntPixels(float f, Context context) {
        return (int) (asFloatPixels(f, context) + 0.5f);
    }

    public static float convertDpToPixel(float f, Context context) {
        return f * (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static float convertPixelsToDp(float f, Context context) {
        return f / (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static void removeFromParent(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }
}
