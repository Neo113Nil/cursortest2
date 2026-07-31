package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2964ca implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC2964ca(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3048dx interfaceC3048dx;
        InterfaceC3048dx interfaceC3048dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC3048dx = this.A00.A08;
            if (interfaceC3048dx != null) {
                interfaceC3048dx2 = this.A00.A08;
                interfaceC3048dx2.AJz();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
