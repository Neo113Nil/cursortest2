package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02689k {
    public int A00;
    public int A01;
    public C02799w A02;
    public boolean A03;

    public C02689k() {
    }

    public final void A03(int i) {
        this.A01 += i;
    }

    public final void A04(int i) {
        if (this.A03 && this.A00 != 4) {
            AbstractC0445Ha.A03(i == 4);
        } else {
            this.A03 = true;
            this.A00 = i;
        }
    }

    public final void A05(C02799w c02799w) {
        this.A02 = c02799w;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C02799w c02799w) {
        return c02799w != this.A02 || this.A01 > 0 || this.A03;
    }
}
