package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ml, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0579Ml implements View.OnClickListener {
    public final /* synthetic */ C0581Mn A00;

    public ViewOnClickListenerC0579Ml(C0581Mn c0581Mn) {
        this.A00 = c0581Mn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0584Mq interfaceC0584Mq;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0584Mq = this.A00.A04;
            interfaceC0584Mq.A9N();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
