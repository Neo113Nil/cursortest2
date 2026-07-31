package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.publisher.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5029e {
    @NotNull
    public static final AdLoad a(@NotNull CoroutineScope scope, @NotNull Function1 timeout, @NotNull String adUnitId, @NotNull Function1 recreateXenossAdLoader, @NotNull AdFormatType adFormatType, @NotNull com.moloco.sdk.internal.services.K webViewChecker, @NotNull MetricsRecorder metricsRecorder, @Nullable Function0 function0) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new C5028d(scope, timeout, adUnitId, recreateXenossAdLoader, com.moloco.sdk.internal.ortb.d.a(), r.a(), adFormatType, webViewChecker, metricsRecorder, function0);
    }
}
