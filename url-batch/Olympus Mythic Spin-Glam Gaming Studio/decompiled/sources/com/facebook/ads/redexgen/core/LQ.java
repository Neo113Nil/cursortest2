package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* loaded from: assets/audience_network/classes2.dex */
public class LQ extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C2872b6 A00;

    public LQ(C2872b6 c2872b6) {
        this.A00 = c2872b6;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (!z) {
            return;
        }
        handler = this.A00.A0D;
        runnable = this.A00.A0F;
        handler.postDelayed(runnable, 250L);
    }
}
