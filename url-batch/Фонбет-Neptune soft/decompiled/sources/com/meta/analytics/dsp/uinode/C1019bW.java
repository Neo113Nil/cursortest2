package com.meta.analytics.dsp.uinode;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1019bW extends KT {
    public final /* synthetic */ C00600w A00;

    public C1019bW(C00600w c00600w) {
        this.A00 = c00600w;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C00590v c00590v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c00590v = this.A00.A02;
        c00590v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
