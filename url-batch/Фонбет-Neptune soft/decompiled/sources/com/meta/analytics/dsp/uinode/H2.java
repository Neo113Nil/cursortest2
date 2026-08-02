package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public class H2 implements InterfaceC1071cZ {
    public final C1064cR A00;

    public H2(C1064cR c1064cR) {
        this.A00 = c1064cR;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1071cZ
    public final void onStart() {
        this.A00.A08();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1071cZ
    public final void onStop() {
        this.A00.A07();
    }
}
