package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.animation.TimeInterpolator;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes14.dex */
public final class t {
    public static /* synthetic */ void a(View view, boolean z, long j, TimeInterpolator timeInterpolator, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            function0 = null;
        }
        a(view, z, j, timeInterpolator, function0);
    }

    public static final void a(@NotNull final View view, boolean z, long j, @NotNull TimeInterpolator interpolator, @Nullable final Function0 function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        view.animate().cancel();
        if (!z) {
            view.animate().alpha(0.0f).setDuration(j).setInterpolator(interpolator).withEndAction(new Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    t.a(view, function0);
                }
            }).start();
        } else {
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(j).setInterpolator(interpolator).withEndAction(new Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    t.a(Function0.this);
                }
            }).start();
        }
    }

    public static final void a(Function0 function0) {
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }

    public static final void a(View view, Function0 function0) {
        view.setVisibility(8);
        if (function0 != null) {
            function0.mo4828invoke();
        }
    }
}
