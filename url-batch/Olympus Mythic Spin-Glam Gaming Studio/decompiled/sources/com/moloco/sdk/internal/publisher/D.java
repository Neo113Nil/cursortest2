package com.moloco.sdk.internal.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class D<T extends AdShowListener> implements z {
    public static final int g = 8;
    public final /* synthetic */ z a;

    @NotNull
    public final T b;

    @NotNull
    public final InterfaceC5043f c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;

    @NotNull
    public final AdFormatType e;

    @NotNull
    public final MetricsRecorder f;

    public D(@NotNull T adShowListener, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull Function0 provideSdkEvents, @NotNull Function0 provideBUrlData, @NotNull AdFormatType adFormatType, @NotNull MetricsRecorder metricsRecorder, @NotNull Function0 getCreativeType) {
        z a;
        Intrinsics.checkNotNullParameter(adShowListener, "adShowListener");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(getCreativeType, "getCreativeType");
        a = B.a(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, (r24 & 32) != 0 ? com.moloco.sdk.internal.A.b() : null, (r24 & 64) != 0 ? com.moloco.sdk.internal.h.a() : null, adFormatType, metricsRecorder, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(metricsRecorder) : null, (r24 & 1024) != 0 ? null : getCreativeType);
        this.a = a;
        this.b = adShowListener;
        this.c = appLifecycleTrackerService;
        this.d = customUserEventBuilderService;
        this.e = adFormatType;
        this.f = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(@NotNull com.moloco.sdk.internal.t internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.a.a(internalError);
    }

    @NotNull
    public final T b() {
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
}
