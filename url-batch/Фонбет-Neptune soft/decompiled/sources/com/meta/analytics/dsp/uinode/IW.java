package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IW implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0473Ic A02;
    public final /* synthetic */ String A03;

    public IW(C0473Ic c0473Ic, String str, long j, long j2) {
        this.A02 = c0473Ic;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0474Id interfaceC0474Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0474Id = this.A02.A01;
            interfaceC0474Id.ADU(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
