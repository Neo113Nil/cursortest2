package io.appmetrica.analytics.impl;

import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;

/* renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5444jl {
    public final Po a;

    public C5444jl(Po po) {
        this.a = po;
    }

    public final long a() {
        long optLong;
        Po po = this.a;
        synchronized (po) {
            optLong = po.a.a().optLong(SDKAnalyticsEvents.PARAMETER_SESSION_ID, -1L);
        }
        long j = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.a.b(j);
        return j;
    }
}
