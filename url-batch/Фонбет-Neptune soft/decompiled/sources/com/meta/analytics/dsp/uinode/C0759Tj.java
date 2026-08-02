package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0759Tj extends KT {
    public final /* synthetic */ AbstractC0615Nv A00;

    public C0759Tj(AbstractC0615Nv abstractC0615Nv) {
        this.A00 = abstractC0615Nv;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC0615Nv abstractC0615Nv = this.A00;
        runnable = abstractC0615Nv.A08;
        i = this.A00.A07;
        abstractC0615Nv.postOnAnimationDelayed(runnable, i);
    }
}
