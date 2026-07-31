package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC3106eu {
    public C2255Ek A00;

    public ED(C3218gi c3218gi) {
        super(c3218gi);
    }

    public ED(C3218gi c3218gi, AttributeSet attributeSet, int i) {
        super(c3218gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3106eu
    public final void AAv(C2255Ek c2255Ek) {
        this.A00 = c2255Ek;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3106eu
    public final void AKV(C2255Ek c2255Ek) {
        A08();
        this.A00 = null;
    }

    public C2255Ek getVideoView() {
        return this.A00;
    }
}
