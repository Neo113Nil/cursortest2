package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class C implements z {
    public final /* synthetic */ z a;

    @Nullable
    public final BannerAdShowListener b;

    public C(@Nullable BannerAdShowListener bannerAdShowListener, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull Function0 provideSdkEvents, @NotNull Function0 provideBUrlData, @NotNull AdFormatType adType, @NotNull MetricsRecorder metricsRecorder, @Nullable Function0 function0) {
        z a;
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a = B.a(bannerAdShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, (r24 & 32) != 0 ? com.moloco.sdk.internal.A.b() : null, (r24 & 64) != 0 ? com.moloco.sdk.internal.h.a() : null, adType, metricsRecorder, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(metricsRecorder) : null, (r24 & 1024) != 0 ? null : function0);
        this.a = a;
        this.b = bannerAdShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(@NotNull com.moloco.sdk.internal.t internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.a.a(internalError);
    }

    @Nullable
    public final BannerAdShowListener b() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(@NotNull MolocoAd molocoAd, @Nullable String str) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.a.a(molocoAd, str);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a() {
        this.a.a();
    }

    public /* synthetic */ C(BannerAdShowListener bannerAdShowListener, InterfaceC5043f interfaceC5043f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, Function0 function0, Function0 function02, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdShowListener, interfaceC5043f, aVar, function0, function02, adFormatType, metricsRecorder, (i & 128) != 0 ? null : function03);
    }
}
