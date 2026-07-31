package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2843ad implements View.OnClickListener {
    public final /* synthetic */ M6 A00;

    public ViewOnClickListenerC2843ad(M6 m6) {
        this.A00 = m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3218gi c3218gi;
        InterfaceC2860au interfaceC2860au;
        InterfaceC2860au interfaceC2860au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c3218gi = this.A00.A09;
            c3218gi.A0F().A9w();
            interfaceC2860au = this.A00.A06;
            if (interfaceC2860au != null) {
                interfaceC2860au2 = this.A00.A06;
                interfaceC2860au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
