package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC5235bi implements Runnable {
    public final /* synthetic */ Revenue a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5235bi(C5701ti c5701ti, Revenue revenue) {
        this.b = c5701ti;
        this.a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportRevenue(this.a);
    }
}
