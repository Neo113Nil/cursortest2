package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s1 extends m2 {
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final boolean d() {
        return this.d;
    }

    public final void e() {
        this.d = true;
    }
}
