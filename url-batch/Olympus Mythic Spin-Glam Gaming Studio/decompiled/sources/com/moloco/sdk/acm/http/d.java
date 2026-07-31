package com.moloco.sdk.acm.http;

import com.moloco.sdk.MetricsRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d {

    @NotNull
    public final List<MetricsRequest.PostMetricsRequest.CountEvent> a;

    @NotNull
    public final List<MetricsRequest.PostMetricsRequest.TimerEvent> b;

    public d(@NotNull List<MetricsRequest.PostMetricsRequest.CountEvent> counts, @NotNull List<MetricsRequest.PostMetricsRequest.TimerEvent> timers) {
        Intrinsics.checkNotNullParameter(counts, "counts");
        Intrinsics.checkNotNullParameter(timers, "timers");
        this.a = counts;
        this.b = timers;
    }

    @NotNull
    public final List<MetricsRequest.PostMetricsRequest.CountEvent> a() {
        return this.a;
    }

    @NotNull
    public final List<MetricsRequest.PostMetricsRequest.TimerEvent> b() {
        return this.b;
    }
}
