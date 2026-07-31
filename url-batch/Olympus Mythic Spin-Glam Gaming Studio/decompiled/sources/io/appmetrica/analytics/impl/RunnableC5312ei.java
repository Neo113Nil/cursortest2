package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC5312ei implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5312ei(C5701ti c5701ti, ECommerceEvent eCommerceEvent) {
        this.b = c5701ti;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportECommerce(this.a);
    }
}
