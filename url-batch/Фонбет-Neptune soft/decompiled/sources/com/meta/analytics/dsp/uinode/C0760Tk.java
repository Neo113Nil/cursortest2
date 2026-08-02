package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0760Tk extends KT {
    public final /* synthetic */ AbstractC0615Nv A00;

    public C0760Tk(AbstractC0615Nv abstractC0615Nv) {
        this.A00 = abstractC0615Nv;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC0615Nv abstractC0615Nv = this.A00;
            i = abstractC0615Nv.A07;
            abstractC0615Nv.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC0615Nv abstractC0615Nv2 = this.A00;
            runnable = abstractC0615Nv2.A09;
            abstractC0615Nv2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
