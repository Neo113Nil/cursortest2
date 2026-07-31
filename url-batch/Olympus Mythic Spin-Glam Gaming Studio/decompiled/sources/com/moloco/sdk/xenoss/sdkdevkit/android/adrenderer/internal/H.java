package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class H {
    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull String adm, @NotNull r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new G(context, customUserEventBuilderService, adm, externalLinkHandler, watermark, metricsRecorder);
    }
}
