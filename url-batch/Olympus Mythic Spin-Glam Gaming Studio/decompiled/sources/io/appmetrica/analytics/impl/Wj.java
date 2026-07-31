package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes13.dex */
public final class Wj implements InterfaceC5486lb {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;

    public Wj(AdRevenue adRevenue, boolean z) {
        this.a = adRevenue;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5486lb
    public final void a(InterfaceC5512mb interfaceC5512mb) {
        interfaceC5512mb.reportAdRevenue(this.a, this.b);
    }
}
