package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3363jC implements O3 {
    public final /* synthetic */ C2496Nu A00;

    public C3363jC(C2496Nu c2496Nu) {
        this.A00 = c2496Nu;
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFF(AdError adError) {
        InterfaceC2495Nt interfaceC2495Nt;
        interfaceC2495Nt = this.A00.A04;
        interfaceC2495Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFG() {
        InterfaceC2495Nt interfaceC2495Nt;
        interfaceC2495Nt = this.A00.A04;
        interfaceC2495Nt.ACp();
    }
}
