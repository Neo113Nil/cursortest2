package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class B {
    @NotNull
    public static final z a(@Nullable AdShowListener adShowListener, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull Function0 provideSdkEvents, @NotNull Function0 provideBUrlData, @NotNull com.moloco.sdk.internal.y sdkEventUrlTracker, @NotNull com.moloco.sdk.internal.f bUrlTracker, @NotNull AdFormatType adType, @NotNull MetricsRecorder metricsRecorder, @NotNull com.moloco.sdk.internal.client_metrics_data.a acmClickDeduper, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        Intrinsics.checkNotNullParameter(bUrlTracker, "bUrlTracker");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(acmClickDeduper, "acmClickDeduper");
        return new A(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, sdkEventUrlTracker, bUrlTracker, adType, metricsRecorder, acmClickDeduper, function0);
    }
}
