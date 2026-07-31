package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.ColorInt;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class b {
    @ColorInt
    public static final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.mlcColorPrimary});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        if (hasValue) {
            return color;
        }
        TypedArray obtainStyledAttributes2 = new ContextThemeWrapper(context, R.style.Theme_Moloco).obtainStyledAttributes(new int[]{R.attr.mlcColorPrimary});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        boolean hasValue2 = obtainStyledAttributes2.hasValue(0);
        int color2 = obtainStyledAttributes2.getColor(0, 0);
        obtainStyledAttributes2.recycle();
        return hasValue2 ? color2 : ContextCompat.getColor(context, R.color.moloco_primary);
    }
}
