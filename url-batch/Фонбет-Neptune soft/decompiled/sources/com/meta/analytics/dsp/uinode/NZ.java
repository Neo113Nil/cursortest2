package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class NZ implements Runnable {
    public final /* synthetic */ C0594Na A00;
    public final /* synthetic */ InterfaceC0595Nb A01;

    public NZ(C0594Na c0594Na, InterfaceC0595Nb interfaceC0595Nb) {
        this.A00 = c0594Na;
        this.A01 = interfaceC0595Nb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.AAn();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
