package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class SE extends KT {
    public final /* synthetic */ SA A00;

    public SE(SA sa) {
        this.A00 = sa;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z;
        C02508r c02508r;
        Handler handler;
        int i;
        z = this.A00.A03;
        if (!z) {
            c02508r = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c02508r.A02(new AbstractC0667Pv(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.93
            });
            handler = this.A00.A07;
            i = this.A00.A00;
            handler.postDelayed(this, i);
        }
    }
}
