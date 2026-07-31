package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class ViewUtils {
    private static final AtomicInteger nextGeneratedId = new AtomicInteger(1);

    public static void applyWindowInsets(final View view) {
        if (view != null) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: net.pubnative.lite.sdk.utils.ViewUtils$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsets lambda$applyWindowInsets$0;
                    lambda$applyWindowInsets$0 = ViewUtils.lambda$applyWindowInsets$0(view, view2, windowInsets);
                    return lambda$applyWindowInsets$0;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsets lambda$applyWindowInsets$0(View view, View view2, WindowInsets windowInsets) {
        view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
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
