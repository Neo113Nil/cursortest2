package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0570Mc implements View.OnClickListener {
    public final /* synthetic */ UA A00;

    public ViewOnClickListenerC0570Mc(UA ua) {
        this.A00 = ua;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0572Me interfaceC0572Me;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0572Me = this.A00.A07;
            interfaceC0572Me.ABX();
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
