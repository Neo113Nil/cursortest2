package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface d {

    @NotNull
    public static final a a = a.a;
    public static final long b = 3000;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final long b = 3000;
    }

    @Nullable
    Object a(@NotNull String str, @Nullable MediationInfo mediationInfo, @NotNull MetricsRecorder metricsRecorder, @NotNull Continuation continuation);
}
