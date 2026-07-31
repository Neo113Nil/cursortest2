package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes10.dex */
public final class Lj implements InterfaceC5486lb {
    public final /* synthetic */ Revenue a;

    public Lj(Revenue revenue) {
        this.a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportRevenue(this.a);
    }
}
