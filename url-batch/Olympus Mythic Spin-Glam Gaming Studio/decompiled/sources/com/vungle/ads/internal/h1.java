package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class h1 {
    public Sdk.SDKMetric.SDKMetricType a;
    public String b;

    public h1(Sdk.SDKMetric.SDKMetricType metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.a = metricType;
    }

    public final void a(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        Intrinsics.checkNotNullParameter(sDKMetricType, "<set-?>");
        this.a = sDKMetricType;
    }

    public final Sdk.SDKMetric.SDKMetricType b() {
        return this.a;
    }

    public final String a() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }
}
