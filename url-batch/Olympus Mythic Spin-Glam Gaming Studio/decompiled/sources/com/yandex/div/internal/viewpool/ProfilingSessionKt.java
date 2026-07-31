package com.yandex.div.internal.viewpool;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;

/* compiled from: ProfilingSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0004\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0001¨\u0006\u0004"}, d2 = {"floorTo", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "roundRoughly", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProfilingSessionKt {
    @VisibleForTesting
    public static final long roundRoughly(long j) {
        if (j < 0) {
            return 0L;
        }
        if (j < 100) {
            return floorTo(j, 20L);
        }
        if (j < 1000) {
            return floorTo(j, 100L);
        }
        if (j < 2000) {
            return floorTo(j, 200L);
        }
        if (j < 5000) {
            return floorTo(j, 500L);
        }
        if (j < 10000) {
            return floorTo(j, 1000L);
        }
        if (j < 20000) {
            return floorTo(j, 2000L);
        }
        if (j < 50000) {
            return floorTo(j, 5000L);
        }
        return 50000L;
    }

    private static final long floorTo(long j, long j2) {
        return (j / j2) * j2;
    }
}
