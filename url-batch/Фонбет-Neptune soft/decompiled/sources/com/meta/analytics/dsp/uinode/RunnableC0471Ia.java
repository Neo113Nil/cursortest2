package com.meta.analytics.dsp.uinode;

import android.view.Surface;

/* renamed from: com.facebook.ads.redexgen.X.Ia, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0471Ia implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C0473Ic A01;

    public RunnableC0471Ia(C0473Ic c0473Ic, Surface surface) {
        this.A01 = c0473Ic;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0474Id interfaceC0474Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0474Id = this.A01.A01;
            interfaceC0474Id.ACt(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
