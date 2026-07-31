package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC3032dg implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC3032dg(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3038dm interfaceC3038dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0B = true;
            interfaceC3038dm = this.A00.A0Z;
            interfaceC3038dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
