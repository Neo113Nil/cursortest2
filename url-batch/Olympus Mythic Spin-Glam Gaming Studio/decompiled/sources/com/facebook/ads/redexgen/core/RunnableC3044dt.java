package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC3044dt implements Runnable {
    public final /* synthetic */ C4V A00;

    public RunnableC3044dt(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            ((AbstractC2305Gj) this.A00).A0A.A4j(((AbstractC2305Gj) this.A00).A0B.A7w());
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
