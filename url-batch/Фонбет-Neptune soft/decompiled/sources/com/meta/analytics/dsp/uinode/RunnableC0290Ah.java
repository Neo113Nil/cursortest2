package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0290Ah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0291Ai A01;

    public RunnableC0290Ah(C0291Ai c0291Ai, int i) {
        this.A01 = c0291Ai;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0292Aj interfaceC0292Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0292Aj = this.A01.A01;
            interfaceC0292Aj.AAs(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
