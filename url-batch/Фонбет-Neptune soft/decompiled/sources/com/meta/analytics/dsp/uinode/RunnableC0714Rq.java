package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Rq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0714Rq implements Runnable {
    public final /* synthetic */ C0456Hl A00;

    public RunnableC0714Rq(C0456Hl c0456Hl) {
        this.A00 = c0456Hl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            C0456Hl.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
