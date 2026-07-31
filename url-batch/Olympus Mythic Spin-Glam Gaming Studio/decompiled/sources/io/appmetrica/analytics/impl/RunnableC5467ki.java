package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5467ki implements Runnable {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C5701ti c;

    public RunnableC5467ki(C5701ti c5701ti, AdRevenue adRevenue, boolean z) {
        this.c = c5701ti;
        this.a = adRevenue;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.c;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportAdRevenue(this.a, this.b);
    }
}
