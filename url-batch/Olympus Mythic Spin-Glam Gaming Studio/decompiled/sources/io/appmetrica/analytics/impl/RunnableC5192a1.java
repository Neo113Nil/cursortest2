package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC5192a1 implements Runnable {
    public final /* synthetic */ ECommerceEvent a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5192a1(C5736v1 c5736v1, ECommerceEvent eCommerceEvent) {
        this.b = c5736v1;
        this.a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).reportECommerce(this.a);
    }
}
