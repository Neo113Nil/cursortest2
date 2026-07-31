package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC3014dO implements Runnable {
    public final /* synthetic */ C5S A00;

    public RunnableC3014dO(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3038dm interfaceC3038dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08 = true;
            interfaceC3038dm = this.A00.A0P;
            interfaceC3038dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
