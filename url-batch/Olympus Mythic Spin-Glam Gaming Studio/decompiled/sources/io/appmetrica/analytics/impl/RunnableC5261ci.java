package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC5261ci implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5261ci(C5701ti c5701ti, AdRevenue adRevenue) {
        this.b = c5701ti;
        this.a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportAdRevenue(this.a);
    }
}
