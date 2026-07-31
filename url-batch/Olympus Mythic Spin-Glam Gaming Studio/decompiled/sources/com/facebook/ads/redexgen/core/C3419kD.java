package com.facebook.ads.redexgen.core;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.kD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3419kD extends AbstractRunnableC2705Wc {
    public final /* synthetic */ N8 A00;

    public C3419kD(N8 n8) {
        this.A00 = n8;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        N7 n7;
        CountDownLatch countDownLatch;
        this.A00.A07();
        n7 = this.A00.A02;
        n7.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
