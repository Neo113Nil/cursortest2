package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0981au implements InterfaceC00801q {
    public final /* synthetic */ C00721i A00;

    public C0981au(C00721i c00721i) {
        this.A00 = c00721i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00801q
    public final void ACZ(AdError adError) {
        InterfaceC00711h interfaceC00711h;
        interfaceC00711h = this.A00.A04;
        interfaceC00711h.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00801q
    public final void ACa() {
        InterfaceC00711h interfaceC00711h;
        interfaceC00711h = this.A00.A04;
        interfaceC00711h.AAf();
    }
}
