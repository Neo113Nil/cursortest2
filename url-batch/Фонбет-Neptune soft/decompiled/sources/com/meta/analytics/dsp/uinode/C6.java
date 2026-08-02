package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class C6 {
    public final C4 A00;

    public abstract void A0B(C0470Hz c0470Hz, long j) throws C02789v;

    public abstract boolean A0C(C0470Hz c0470Hz) throws C02789v;

    public C6(C4 c4) {
        this.A00 = c4;
    }

    public final void A00(C0470Hz c0470Hz, long j) throws C02789v {
        if (A0C(c0470Hz)) {
            A0B(c0470Hz, j);
        }
    }
}
