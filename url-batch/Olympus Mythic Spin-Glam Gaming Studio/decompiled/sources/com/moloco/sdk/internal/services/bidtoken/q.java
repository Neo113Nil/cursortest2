package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public interface q {

    @NotNull
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        @NotNull
        public final q a() {
            return new r(a.h.a.i(), o.a.a(), com.moloco.sdk.internal.services.encryption.a.a.a(), com.moloco.sdk.internal.services.bidtoken.providers.l.a.a());
        }
    }

    @Nullable
    Object a(@NotNull MetricsRecorder metricsRecorder, @NotNull String str, @NotNull f fVar, @NotNull Continuation continuation);
}
