package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C5023e;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC5071u {
    @NotNull
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> a(@NotNull Context context, @NotNull C5023e c5023e, boolean z, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull MetricsRecorder metricsRecorder);

    @NotNull
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(@NotNull Context context, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull String str, @NotNull r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull MetricsRecorder metricsRecorder);

    @NotNull
    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull C5023e c5023e, @NotNull r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull MutableStateFlow mutableStateFlow, boolean z, @NotNull MetricsRecorder metricsRecorder);
}
