package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.common_adapter_internal.ScreenData;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class q implements p {

    @NotNull
    public final Context a;

    public q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    @RequiresApi
    public final DisplayMetrics b(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        Rect bounds2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.density = this.a.getResources().getDisplayMetrics().density;
        displayMetrics.densityDpi = this.a.getResources().getDisplayMetrics().densityDpi;
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        displayMetrics.widthPixels = bounds.width();
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds2 = currentWindowMetrics2.getBounds();
        displayMetrics.heightPixels = bounds2.height();
        return displayMetrics;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    @NotNull
    public ScreenData invoke() {
        WindowManager windowManager = (WindowManager) ContextCompat.getSystemService(this.a, WindowManager.class);
        if (windowManager == null) {
            return new ScreenData(0, 0, 0.0f, 0.0f, 0, 0.0f);
        }
        DisplayMetrics b = Build.VERSION.SDK_INT >= 30 ? b(windowManager) : a(windowManager);
        int i = b.widthPixels;
        return new ScreenData(i, b.heightPixels, C.b(i, b.density), C.b(b.heightPixels, b.density), b.densityDpi, b.density);
    }
}
