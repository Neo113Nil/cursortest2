package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public interface y {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public final y a() {
            z c;
            c = A.c();
            return c;
        }
    }

    @Nullable
    Object a(@NotNull MetricsRecorder metricsRecorder, @NotNull Continuation continuation);
}
