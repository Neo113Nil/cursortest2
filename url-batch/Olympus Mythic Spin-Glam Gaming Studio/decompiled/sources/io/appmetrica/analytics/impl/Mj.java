package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes8.dex */
public final class Mj implements InterfaceC5486lb {
    public final /* synthetic */ ECommerceEvent a;

    public Mj(ECommerceEvent eCommerceEvent) {
        this.a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportECommerce(this.a);
    }
}
