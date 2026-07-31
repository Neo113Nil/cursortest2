package com.mobilefuse.sdk.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DimConversions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"dpToPx", "Landroid/graphics/Point;", "context", "Landroid/content/Context;", "", "", "pxToDp", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final class DimConversionsKt {
    public static final int dpToPx(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public static final int dpToPx(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return dpToPx(i, context);
    }

    public static final float pxToDp(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return i / resources.getDisplayMetrics().density;
    }

    public static final float pxToDp(float f, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return pxToDp((int) f, context);
    }

    @NotNull
    public static final Point dpToPx(@NotNull Point dpToPx, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(dpToPx, "$this$dpToPx");
        Intrinsics.checkNotNullParameter(context, "context");
        return new Point(dpToPx(dpToPx.x, context), dpToPx(dpToPx.y, context));
    }
}
