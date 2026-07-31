package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C2779Zb A00;

    public ZY(C2779Zb c2779Zb) {
        this.A00 = c2779Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC2783Zf interfaceC2783Zf;
        InterfaceC2783Zf interfaceC2783Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC2783Zf2 = this.A00.A04;
                interfaceC2783Zf2.A53();
            } else {
                interfaceC2783Zf = this.A00.A04;
                interfaceC2783Zf.A54();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
