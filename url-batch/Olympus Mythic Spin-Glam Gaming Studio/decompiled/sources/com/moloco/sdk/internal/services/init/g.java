package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface g {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public final g a(@NotNull SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            return new h(sharedPreferences, com.moloco.sdk.internal.scheduling.b.a().getIo());
        }
    }

    @Nullable
    Object a(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull MetricsRecorder metricsRecorder, @NotNull Init.SDKInitResponse sDKInitResponse, @NotNull Continuation continuation);

    @Nullable
    Object a(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull MetricsRecorder metricsRecorder, @NotNull Continuation continuation);

    @VisibleForTesting
    @Nullable
    Object a(@NotNull Continuation continuation);

    @Nullable
    Object b(@NotNull com.moloco.sdk.internal.services.init.a aVar, @NotNull MetricsRecorder metricsRecorder, @NotNull Continuation continuation);
}
