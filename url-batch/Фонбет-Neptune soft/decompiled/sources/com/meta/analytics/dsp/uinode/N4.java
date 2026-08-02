package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N4 implements View.OnClickListener {
    public final /* synthetic */ N6 A00;

    public N4(N6 n6) {
        this.A00 = n6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0584Mq interfaceC0584Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0584Mq = this.A00.A02;
            interfaceC0584Mq.A8P();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
