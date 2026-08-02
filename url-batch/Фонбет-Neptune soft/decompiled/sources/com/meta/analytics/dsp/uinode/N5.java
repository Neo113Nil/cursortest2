package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N5 implements View.OnClickListener {
    public final /* synthetic */ C2W A00;
    public final /* synthetic */ C0586Ms A01;
    public final /* synthetic */ N6 A02;

    public N5(N6 n6, C0586Ms c0586Ms, C2W c2w) {
        this.A02 = n6;
        this.A01 = c0586Ms;
        this.A00 = c2w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0584Mq interfaceC0584Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC0584Mq = this.A02.A02;
            interfaceC0584Mq.ACS(this.A00);
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
