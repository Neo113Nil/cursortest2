package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Pj implements InterfaceC5486lb {
    public final /* synthetic */ AdRevenue a;

    public Pj(AdRevenue adRevenue) {
        this.a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportAdRevenue(this.a);
    }
}
