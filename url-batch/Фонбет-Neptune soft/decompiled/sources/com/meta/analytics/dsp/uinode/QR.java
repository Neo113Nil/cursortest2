package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class QR implements QK {
    public final View A00;
    public final C0889Yn A01;

    public QR(C0889Yn c0889Yn, View view) {
        this.A01 = c0889Yn;
        this.A00 = view;
    }

    @Override // com.meta.analytics.dsp.uinode.QK
    public final double A8K() {
        RF result = RE.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
