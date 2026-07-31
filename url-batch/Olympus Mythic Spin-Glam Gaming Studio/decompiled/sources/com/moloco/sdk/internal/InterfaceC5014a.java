package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.publisher.C5025a;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5014a {
    @NotNull
    Banner a(@NotNull Context context, @NotNull InterfaceC5043f interfaceC5043f, @NotNull String str, @NotNull Q q, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull C5025a c5025a, @NotNull C c, @NotNull i iVar, @NotNull MetricsRecorder metricsRecorder);

    @NotNull
    InterstitialAd a(@NotNull Context context, @NotNull InterfaceC5043f interfaceC5043f, @NotNull String str, @NotNull Q q, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull C5025a c5025a, @NotNull MetricsRecorder metricsRecorder);

    @NotNull
    NativeAd a(@NotNull Context context, @NotNull InterfaceC5043f interfaceC5043f, @NotNull com.moloco.sdk.internal.services.n nVar, @NotNull String str, @NotNull Q q, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, @NotNull C c, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull C5025a c5025a, @NotNull I i, @NotNull MetricsRecorder metricsRecorder);

    @NotNull
    RewardedInterstitialAd a(@NotNull Context context, @NotNull InterfaceC5043f interfaceC5043f, @NotNull String str, @NotNull Q q, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i iVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull C5025a c5025a, @NotNull MetricsRecorder metricsRecorder, @NotNull com.moloco.sdk.internal.services.config.a aVar);

    @NotNull
    Banner b(@NotNull Context context, @NotNull InterfaceC5043f interfaceC5043f, @NotNull String str, @NotNull Q q, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull C5025a c5025a, @NotNull C c, @NotNull i iVar, @NotNull MetricsRecorder metricsRecorder);

    @NotNull
    Banner c(@NotNull Context context, @NotNull InterfaceC5043f interfaceC5043f, @NotNull String str, @NotNull Q q, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, @NotNull C5025a c5025a, @NotNull C c, @NotNull i iVar, @NotNull MetricsRecorder metricsRecorder);
}
