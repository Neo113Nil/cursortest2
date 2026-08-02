package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0289Ag implements Runnable {
    public final /* synthetic */ C0291Ai A00;
    public final /* synthetic */ BC A01;

    public RunnableC0289Ag(C0291Ai c0291Ai, BC bc) {
        this.A00 = c0291Ai;
        this.A01 = bc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0292Aj interfaceC0292Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            interfaceC0292Aj = this.A00.A01;
            interfaceC0292Aj.AAp(this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
