package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes13.dex */
public final class X0 implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ C5736v1 b;

    public X0(C5736v1 c5736v1, Revenue revenue) {
        this.b = c5736v1;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).reportRevenue(this.a);
    }
}
