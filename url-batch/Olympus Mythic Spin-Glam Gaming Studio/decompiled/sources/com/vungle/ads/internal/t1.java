package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t1 extends n2 {
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    @Override // com.vungle.ads.internal.n2
    public final void d() {
        if (this.d == null) {
            super.d();
        }
    }

    @Override // com.vungle.ads.internal.n2
    public final void e() {
        if (this.c == null) {
            super.e();
        }
    }

    public final boolean f() {
        return this.e;
    }

    public final void g() {
        this.e = true;
    }
}
