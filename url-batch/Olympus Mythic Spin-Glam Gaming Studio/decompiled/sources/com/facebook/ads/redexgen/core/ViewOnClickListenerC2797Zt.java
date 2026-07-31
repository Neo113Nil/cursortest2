package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2797Zt implements View.OnClickListener {
    public final /* synthetic */ C2799Zv A00;

    public ViewOnClickListenerC2797Zt(C2799Zv c2799Zv) {
        this.A00 = c2799Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2783Zf interfaceC2783Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2783Zf = this.A00.A02;
            interfaceC2783Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
