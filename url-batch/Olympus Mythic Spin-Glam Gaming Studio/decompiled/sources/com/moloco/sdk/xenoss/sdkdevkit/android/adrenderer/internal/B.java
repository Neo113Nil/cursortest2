package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class B {
    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull y mraidAdLoader, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e mraidBaseAd, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j mraidFullscreenController, @NotNull MraidActivity.Companion mraidAdActivity, @Nullable String str, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        Intrinsics.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        Intrinsics.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        Intrinsics.checkNotNullParameter(mraidAdActivity, "mraidAdActivity");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new A(context, watermark, mraidAdLoader, mraidBaseAd, mraidFullscreenController, mraidAdActivity, str, metricsRecorder);
    }
}
