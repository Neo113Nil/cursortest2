package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UI implements InterfaceC0651Pf {
    public final /* synthetic */ UD A00;

    public UI(UD ud) {
        this.A00 = ud;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0651Pf
    public final void ABu() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A0T;
        atomicBoolean.set(true);
        this.A00.A0M();
    }
}
