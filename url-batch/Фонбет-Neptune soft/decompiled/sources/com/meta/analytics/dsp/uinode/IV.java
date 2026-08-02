package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IV implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0473Ic A01;

    public IV(C0473Ic c0473Ic, BC bc) {
        this.A01 = c0473Ic;
        this.A00 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0474Id interfaceC0474Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0474Id = this.A01.A01;
            interfaceC0474Id.ADW(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
