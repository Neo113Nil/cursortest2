package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class J8 implements InterfaceC0718Ru {
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0718Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0718Ru
    public final void AGQ(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
