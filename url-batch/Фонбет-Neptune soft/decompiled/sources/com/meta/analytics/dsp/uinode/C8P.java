package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8P extends O7 {
    public final /* synthetic */ LX A00;

    public C8P(LX lx) {
        this.A00 = lx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o8) {
        boolean z;
        boolean z2;
        boolean A0D;
        Handler handler;
        int i;
        boolean z3;
        boolean A0D2;
        z = this.A00.A03;
        if (!z) {
            return;
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        this.A00.A03 = false;
        A0D = this.A00.A0D(EnumC0680Qi.A04);
        if (!A0D) {
            z3 = this.A00.A04;
            if (!z3) {
                A0D2 = this.A00.A0D(EnumC0680Qi.A03);
                if (!A0D2) {
                    return;
                }
                this.A00.A03();
                this.A00.A06(true, true);
                return;
            }
        }
        this.A00.A04 = false;
        handler = this.A00.A05;
        C0554Lm c0554Lm = new C0554Lm(this);
        i = this.A00.A00;
        handler.postDelayed(c0554Lm, i);
    }
}
