package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class Gz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ W1 A03;

    public Gz(W1 w1, int i, long j, long j2) {
        this.A03 = w1;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0434Go interfaceC0434Go;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0434Go = this.A03.A07;
            interfaceC0434Go.AAw(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
