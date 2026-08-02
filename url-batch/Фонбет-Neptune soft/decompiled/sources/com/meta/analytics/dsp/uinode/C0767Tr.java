package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Tr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0767Tr extends KT {
    public final /* synthetic */ C0600Ng A00;

    public C0767Tr(C0600Ng c0600Ng) {
        this.A00 = c0600Ng;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (z) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
