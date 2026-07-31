package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2769Yr implements View.OnClickListener {
    public final /* synthetic */ PU A00;

    public ViewOnClickListenerC2769Yr(PU pu) {
        this.A00 = pu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2752Ya interfaceC2752Ya;
        ZM zm;
        InterfaceC2752Ya interfaceC2752Ya2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2752Ya = this.A00.A01;
            if (interfaceC2752Ya != null) {
                zm = this.A00.A02;
                if (zm.A03()) {
                    interfaceC2752Ya2 = this.A00.A01;
                    interfaceC2752Ya2.ACl(this.A00);
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
