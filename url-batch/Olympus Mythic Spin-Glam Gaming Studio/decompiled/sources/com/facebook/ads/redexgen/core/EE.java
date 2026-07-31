package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC3103er {
    public final View A00;
    public final C3218gi A01;

    public EE(C3218gi c3218gi, View view) {
        this.A01 = c3218gi;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3103er
    public final double A9V() {
        C3164fq result = C3163fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
