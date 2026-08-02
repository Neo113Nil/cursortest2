package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0288Af implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C0291Ai A03;

    public RunnableC0288Af(C0291Ai c0291Ai, int i, long j, long j2) {
        this.A03 = c0291Ai;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0292Aj interfaceC0292Aj;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0292Aj = this.A03.A01;
            interfaceC0292Aj.AAt(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
