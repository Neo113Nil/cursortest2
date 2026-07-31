package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes14.dex */
public final class c {
    public static final int a(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }
}
