package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes13.dex */
public final class a {

    @NotNull
    public static final a a = new a();
    public static final int b = 0;

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final int b(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (a(f, context) + 0.5f);
    }

    public final float c(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f * a(context);
    }

    public final int d(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (c(f, context) + 0.5f);
    }

    public final float e(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f / a(context);
    }

    public final int f(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (e(f, context) + 0.5f);
    }

    public final float a(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public final int b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(context.getResources().getDisplayMetrics().heightPixels, context);
    }

    public final int c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return f(context.getResources().getDisplayMetrics().widthPixels, context);
    }
}
