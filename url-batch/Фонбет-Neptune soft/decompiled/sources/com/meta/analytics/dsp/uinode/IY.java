package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IY implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0473Ic A02;

    public IY(C0473Ic c0473Ic, int i, long j) {
        this.A02 = c0473Ic;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0474Id interfaceC0474Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0474Id = this.A02.A01;
            interfaceC0474Id.ABN(this.A00, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
