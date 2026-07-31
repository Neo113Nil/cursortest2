package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C2779Zb A00;

    public ZZ(C2779Zb c2779Zb) {
        this.A00 = c2779Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2783Zf interfaceC2783Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2783Zf = this.A00.A04;
            interfaceC2783Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
