package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC3124fC implements View.OnClickListener {
    public final /* synthetic */ C2222Dd A00;

    public ViewOnClickListenerC3124fC(C2222Dd c2222Dd) {
        this.A00 = c2222Dd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VI vi;
        C3218gi c3218gi;
        C2255Ek c2255Ek;
        boolean A07;
        C2255Ek c2255Ek2;
        C2255Ek c2255Ek3;
        if (WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A03;
            vi.A04(VH.A0l, null);
            c3218gi = this.A00.A02;
            c3218gi.A0F().A3m();
            c2255Ek = this.A00.A00;
            if (c2255Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c2255Ek3 = this.A00.A00;
                    c2255Ek3.setVolume(1.0f);
                } else {
                    c2255Ek2 = this.A00.A00;
                    c2255Ek2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
