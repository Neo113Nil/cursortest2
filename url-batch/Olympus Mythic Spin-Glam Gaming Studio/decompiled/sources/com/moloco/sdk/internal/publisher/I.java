package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.C5017d;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class I {
    @NotNull
    public static final RewardedInterstitialAd a(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull String adUnitId, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, @NotNull u<RewardedInterstitialAdShowListener> adDataHolder, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull MetricsRecorder metricsRecorder, @NotNull com.moloco.sdk.internal.services.config.a configService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(adDataHolder, "adDataHolder");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(configService, "configService");
        return new H(new v(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new Function1() { // from class: com.moloco.sdk.internal.publisher.I$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.a((com.moloco.sdk.internal.ortb.model.z) obj);
            }
        }, adDataHolder, AdFormatType.REWARDED, watermark, adCreateLoadTimeoutManager, metricsRecorder), adUnitId, configService, metricsRecorder);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h c;
        return (zVar == null || (c = C5017d.c(zVar)) == null) ? C5017d.c() : c;
    }
}
