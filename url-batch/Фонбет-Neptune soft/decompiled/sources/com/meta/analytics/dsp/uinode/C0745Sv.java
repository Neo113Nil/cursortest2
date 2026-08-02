package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0745Sv implements L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KT A01;
    public final /* synthetic */ AbstractC0742Ss A02;

    public C0745Sv(AbstractC0742Ss abstractC0742Ss, int i, KT kt) {
        this.A02 = abstractC0742Ss;
        this.A00 = i;
        this.A01 = kt;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        this.A01.run();
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
