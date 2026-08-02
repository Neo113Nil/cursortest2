package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UG implements MA {
    public final /* synthetic */ UD A00;

    public UG(UD ud) {
        this.A00 = ud;
    }

    @Override // com.meta.analytics.dsp.uinode.MA
    public final void AB6() {
        boolean A0W;
        boolean z;
        JA ja;
        MC mc;
        InterfaceC0577Mj interfaceC0577Mj;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        O1 o1;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0S;
            if (!atomicBoolean2.get()) {
                o1 = this.A00.A0Q;
                o1.A07(this.A00);
                return;
            }
        }
        z = this.A00.A0U;
        if (z) {
            atomicBoolean = this.A00.A0S;
            if (!atomicBoolean.get()) {
                A0V = this.A00.A0V();
                if (A0V) {
                    this.A00.A0W.setToolbarActionMode(0);
                    this.A00.A0L();
                    return;
                }
            }
        }
        ja = this.A00.A0K;
        ja.A04(J9.A07, null);
        mc = this.A00.A0N;
        interfaceC0577Mj = this.A00.A0O;
        mc.A43(interfaceC0577Mj.A6u());
    }
}
