package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5053c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class n {
    public static /* synthetic */ l a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, i iVar, C5023e c5023e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, y yVar, MetricsRecorder metricsRecorder, int i, Object obj) {
        if ((i & 4) != 0) {
            iVar = null;
        }
        return a(context, aVar, iVar, c5023e, rVar, yVar, metricsRecorder);
    }

    @NotNull
    public static final l<g, h> a(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @Nullable i iVar, @NotNull C5023e bid, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull y watermark, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new C5053c(context, customUserEventBuilderService, iVar, bid, externalLinkHandler, watermark, metricsRecorder);
    }

    public static /* synthetic */ l a(Context context, String str, com.moloco.sdk.internal.services.s sVar, y yVar, MetricsRecorder metricsRecorder, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = true;
        }
        return a(context, str, sVar, yVar, metricsRecorder, z);
    }

    @NotNull
    public static final l<u, t> a(@NotNull Context context, @NotNull String adm, @NotNull com.moloco.sdk.internal.services.s clickthroughService, @NotNull y watermark, @NotNull MetricsRecorder metricsRecorder, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new J(context, adm, clickthroughService, watermark, a.h.a.f(), a.i.a.c(), metricsRecorder, z);
    }
}
