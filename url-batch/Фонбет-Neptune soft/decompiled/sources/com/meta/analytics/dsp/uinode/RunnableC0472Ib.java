package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0472Ib implements Runnable {
    public final /* synthetic */ BC A00;
    public final /* synthetic */ C0473Ic A01;

    public RunnableC0472Ib(C0473Ic c0473Ic, BC bc) {
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
            this.A00.A00();
            interfaceC0474Id = this.A01.A01;
            interfaceC0474Id.ADV(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
