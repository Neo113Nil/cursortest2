package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0758Ti implements InterfaceC0601Nh {
    public final WeakReference<BK> A00;

    public C0758Ti(BK bk) {
        this.A00 = new WeakReference<>(bk);
    }

    public /* synthetic */ C0758Ti(BK bk, BP bp) {
        this(bk);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0601Nh
    public final void ABh(boolean z) {
        BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z;
            cardLayout.A04();
        }
    }
}
