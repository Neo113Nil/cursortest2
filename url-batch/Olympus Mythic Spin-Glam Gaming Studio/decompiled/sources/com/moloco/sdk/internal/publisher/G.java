package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.C5017d;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class G {

    public static final class a implements InterstitialAdShowListener, AdShowListener {
        public final /* synthetic */ AdShowListener a;

        public a(InterstitialAdShowListener interstitialAdShowListener) {
            this.a = C5034j.a(interstitialAdShowListener);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.a.onAdClicked(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.a.onAdHidden(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.a.onAdShowFailed(molocoAdError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.a.onAdShowSuccess(molocoAd);
        }
    }

    @NotNull
    public static final InterstitialAd a(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull String adUnitId, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, @NotNull u<InterstitialAdShowListener> adDataHolder, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull MetricsRecorder metricsRecorder) {
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
        return new F(new v(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new Function1() { // from class: com.moloco.sdk.internal.publisher.G$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.a((com.moloco.sdk.internal.ortb.model.z) obj);
            }
        }, adDataHolder, AdFormatType.INTERSTITIAL, watermark, adCreateLoadTimeoutManager, metricsRecorder));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h c;
        return (zVar == null || (c = C5017d.c(zVar)) == null) ? C5017d.c() : c;
    }

    @NotNull
    public static final InterstitialAdShowListener a(@Nullable InterstitialAdShowListener interstitialAdShowListener) {
        return new a(interstitialAdShowListener);
    }
}
