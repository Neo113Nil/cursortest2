package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class Z4 {

    @NotNull
    public static final Z4 a = new Z4();

    private Z4() {
    }

    private final int a(Context context, int i) {
        return MathKt.roundToInt(i / context.getResources().getDisplayMetrics().density);
    }

    public final int b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    public final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
