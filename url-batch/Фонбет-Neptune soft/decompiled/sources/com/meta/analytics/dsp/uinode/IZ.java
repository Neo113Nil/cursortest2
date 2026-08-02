package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class IZ implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C0473Ic A04;

    public IZ(C0473Ic c0473Ic, int i, int i2, int i3, float f) {
        this.A04 = c0473Ic;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0474Id interfaceC0474Id;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0474Id = this.A04.A01;
            interfaceC0474Id.ADf(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
