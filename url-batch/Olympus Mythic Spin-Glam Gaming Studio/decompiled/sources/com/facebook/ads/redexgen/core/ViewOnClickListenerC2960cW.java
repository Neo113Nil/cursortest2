package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2960cW implements View.OnClickListener {
    public final /* synthetic */ KD A00;

    public ViewOnClickListenerC2960cW(KD kd) {
        this.A00 = kd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3048dx interfaceC3048dx;
        InterfaceC3048dx interfaceC3048dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC3048dx = this.A00.A02;
            if (interfaceC3048dx != null) {
                interfaceC3048dx2 = this.A00.A02;
                interfaceC3048dx2.AJz();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
