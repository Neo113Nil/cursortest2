package io.bidmachine.util.viewabilitytracker.model;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewabilityMeasurement.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/model/ViewabilityMeasurement;", "", "count", "", "intervalMs", "", "failureTimeoutMs", "(IJLjava/lang/Long;)V", "getCount", "()I", "getFailureTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getIntervalMs", "()J", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class ViewabilityMeasurement {
    private final int count;

    @Nullable
    private final Long failureTimeoutMs;
    private final long intervalMs;

    public ViewabilityMeasurement(int i, long j, @Nullable Long l) {
        this.count = i;
        this.intervalMs = j;
        this.failureTimeoutMs = l;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final Long getFailureTimeoutMs() {
        return this.failureTimeoutMs;
    }

    public final long getIntervalMs() {
        return this.intervalMs;
    }
}
