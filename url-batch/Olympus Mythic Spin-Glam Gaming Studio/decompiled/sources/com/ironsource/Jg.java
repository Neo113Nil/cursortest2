package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Jg {
    public static final boolean a(@NotNull View view, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
