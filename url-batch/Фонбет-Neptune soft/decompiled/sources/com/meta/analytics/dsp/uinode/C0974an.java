package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0974an extends KT {
    public final /* synthetic */ AbstractC0973am A00;
    public final /* synthetic */ C0495Jb A01;

    public C0974an(AbstractC0973am abstractC0973am, C0495Jb c0495Jb) {
        this.A00 = abstractC0973am;
        this.A01 = c0495Jb;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A00.A0B.A0E().A4t(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
