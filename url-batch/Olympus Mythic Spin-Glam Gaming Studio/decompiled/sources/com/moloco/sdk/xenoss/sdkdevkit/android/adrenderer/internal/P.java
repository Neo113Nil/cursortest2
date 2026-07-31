package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.service_locator.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class P {
    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l a(Context context, C5023e c5023e, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, InterfaceC5064m interfaceC5064m, int i, Object obj) {
        if ((i & 32) != 0) {
            dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(context);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = dVar;
        if ((i & 64) != 0) {
            interfaceC5064m = a.C1563a.a.a();
        }
        return a(context, c5023e, z, yVar, metricsRecorder, dVar2, interfaceC5064m);
    }

    @NotNull
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> a(@NotNull Context context, @NotNull C5023e bid, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull MetricsRecorder metricsRecorder, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, @NotNull InterfaceC5064m decLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        return new O(context, bid, loadVast, decLoader, z, watermark, metricsRecorder);
    }
}
