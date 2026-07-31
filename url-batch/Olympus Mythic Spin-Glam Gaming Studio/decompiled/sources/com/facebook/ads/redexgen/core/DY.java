package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class DY extends AbstractRunnableC2705Wc {
    public final /* synthetic */ DS A00;

    public DY(DS ds) {
        this.A00 = ds;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        View view;
        Drawable drawable;
        this.A00.A02 = EnumC3131fJ.A02;
        view = this.A00.A07;
        drawable = this.A00.A04;
        YB.A0V(view, drawable);
    }
}
