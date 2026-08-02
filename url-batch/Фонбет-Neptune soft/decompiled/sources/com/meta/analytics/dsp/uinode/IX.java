package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public class IX implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0473Ic A01;

    public IX(C0473Ic c0473Ic, Format format) {
        this.A01 = c0473Ic;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0474Id interfaceC0474Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0474Id = this.A01.A01;
            interfaceC0474Id.ADa(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
