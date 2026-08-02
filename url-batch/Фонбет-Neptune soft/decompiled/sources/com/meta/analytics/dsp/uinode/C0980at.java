package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0980at implements AnonymousClass61 {
    public final /* synthetic */ C00721i A00;

    public C0980at(C00721i c00721i) {
        this.A00 = c00721i;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        InterfaceC00711h interfaceC00711h;
        interfaceC00711h = this.A00.A04;
        interfaceC00711h.AAf();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC00711h interfaceC00711h;
        interfaceC00711h = this.A00.A04;
        interfaceC00711h.AAe(AdError.CACHE_ERROR);
    }
}
