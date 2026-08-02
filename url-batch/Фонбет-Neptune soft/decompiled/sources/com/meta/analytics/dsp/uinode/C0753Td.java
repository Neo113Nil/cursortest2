package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0753Td implements L8 {
    public final /* synthetic */ BI A00;

    public C0753Td(BI bi) {
        this.A00 = bi;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        MB mb;
        MB mb2;
        this.A00.A07 = false;
        mb = this.A00.A04;
        if (mb != null) {
            mb2 = this.A00.A04;
            mb2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f) {
        MB mb;
        MB mb2;
        mb = this.A00.A04;
        if (mb != null) {
            mb2 = this.A00.A04;
            mb2.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0G().A00())));
        }
    }
}
