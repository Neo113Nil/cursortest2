package com.moloco.sdk.internal;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.publisher.C5025a;
import com.moloco.sdk.internal.publisher.G;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* renamed from: com.moloco.sdk.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5015b implements InterfaceC5014a {
    public static final int e = 8;

    @NotNull
    public final Init.SDKInitResponse a;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;

    @NotNull
    public final com.moloco.sdk.internal.services.s c;

    @NotNull
    public final Lazy d;

    /* renamed from: com.moloco.sdk.internal.b$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Context context) {
            super(1, Intrinsics.Kotlin.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
            this.b = rVar;
            this.c = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C5015b.b(C5015b.this, this.b, this.c, p0);
        }
    }

    public C5015b(@NotNull Init.SDKInitResponse initResponse, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull com.moloco.sdk.internal.services.s clickthroughService) {
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        this.a = initResponse;
        this.b = customUserEventBuilderService;
        this.c = clickthroughService;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return Boolean.valueOf(C5015b.a(C5015b.this));
            }
        });
    }

    @Override // com.moloco.sdk.internal.InterfaceC5014a
    @NotNull
    public Banner b(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull String adUnitId, @NotNull Q viewVisibilityTracker, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull C viewLifecycleOwnerSingleton, @NotNull i bannerSize, @NotNull MetricsRecorder metricsRecorder) {
        Banner a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? AdFormatType.BANNER : null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC5014a
    @NotNull
    public Banner c(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull String adUnitId, @NotNull Q viewVisibilityTracker, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull C viewLifecycleOwnerSingleton, @NotNull i bannerSize, @NotNull MetricsRecorder metricsRecorder) {
        Banner a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? AdFormatType.BANNER : null);
        return a2;
    }

    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public static final boolean a(C5015b c5015b) {
        return c5015b.a.getVerifyBannerVisible();
    }

    @Override // com.moloco.sdk.internal.InterfaceC5014a
    @NotNull
    public Banner a(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull String adUnitId, @NotNull Q viewVisibilityTracker, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull C viewLifecycleOwnerSingleton, @NotNull i bannerSize, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, AdFormatType.MREC);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b(C5015b c5015b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, rVar, context, c5015b.b, true, Boolean.FALSE, 0, 0, 0, false, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(false, false, false, false, null, null, null).a(rVar, null));
    }

    @Override // com.moloco.sdk.internal.InterfaceC5014a
    @NotNull
    public NativeAd a(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.internal.services.n audioService, @NotNull String adUnitId, @NotNull Q viewVisibilityTracker, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, @NotNull C viewLifecycleOwnerSingleton, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull I timeProvider, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(audioService, "audioService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.nativead.b(adUnitId, new com.moloco.sdk.internal.publisher.nativead.c(context, adUnitId, new com.moloco.sdk.internal.publisher.p(com.moloco.sdk.internal.ortb.d.a(), com.moloco.sdk.internal.publisher.r.a()), new com.moloco.sdk.internal.publisher.nativead.parser.a(), adCreateLoadTimeoutManager, metricsRecorder, timeProvider), new com.moloco.sdk.internal.publisher.nativead.a(context, viewVisibilityTracker, viewLifecycleOwnerSingleton, watermark, new a(externalLinkHandler, context), metricsRecorder), appLifecycleTrackerService, this.b, externalLinkHandler, persistentHttpRequest, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.InterfaceC5014a
    @NotNull
    public InterstitialAd a(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull String adUnitId, @NotNull Q viewVisibilityTracker, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull MetricsRecorder metricsRecorder) {
        InterstitialAd a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = G.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r29 & 64) != 0 ? new com.moloco.sdk.internal.publisher.u(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC5014a
    @NotNull
    public RewardedInterstitialAd a(@NotNull Context context, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull String adUnitId, @NotNull Q viewVisibilityTracker, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, @NotNull C5025a adCreateLoadTimeoutManager, @NotNull MetricsRecorder metricsRecorder, @NotNull com.moloco.sdk.internal.services.config.a configService) {
        RewardedInterstitialAd a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(configService, "configService");
        a2 = com.moloco.sdk.internal.publisher.I.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r31 & 64) != 0 ? new com.moloco.sdk.internal.publisher.u(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder, configService);
        return a2;
    }
}
