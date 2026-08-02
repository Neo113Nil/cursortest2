package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8N extends MX {
    public final /* synthetic */ LX A00;

    public C8N(LX lx) {
        this.A00 = lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MY my) {
        SA sa;
        boolean z;
        Handler handler;
        boolean A0D;
        boolean z2;
        Handler handler2;
        int i;
        sa = this.A00.A01;
        if (sa == null) {
            return;
        }
        z = this.A00.A03;
        if (z || my.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A05;
        handler.removeCallbacksAndMessages(null);
        A0D = this.A00.A0D(EnumC0680Qi.A05);
        if (A0D) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        handler2 = this.A00.A05;
        C0549Lh c0549Lh = new C0549Lh(this);
        i = this.A00.A00;
        handler2.postDelayed(c0549Lh, i);
    }
}
