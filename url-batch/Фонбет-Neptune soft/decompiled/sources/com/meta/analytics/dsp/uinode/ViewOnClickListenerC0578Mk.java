package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0578Mk implements View.OnClickListener {
    public final /* synthetic */ C0581Mn A00;

    public ViewOnClickListenerC0578Mk(C0581Mn c0581Mn) {
        this.A00 = c0581Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC0584Mq interfaceC0584Mq;
        InterfaceC0584Mq interfaceC0584Mq2;
        if (KL.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC0584Mq2 = this.A00.A04;
                interfaceC0584Mq2.A4L();
            } else {
                interfaceC0584Mq = this.A00.A04;
                interfaceC0584Mq.A4M();
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
