package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3362jB implements SM {
    public final /* synthetic */ C2496Nu A00;

    public C3362jB(C2496Nu c2496Nu) {
        this.A00 = c2496Nu;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        InterfaceC2495Nt interfaceC2495Nt;
        interfaceC2495Nt = this.A00.A04;
        interfaceC2495Nt.ACp();
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        InterfaceC2495Nt interfaceC2495Nt;
        interfaceC2495Nt = this.A00.A04;
        interfaceC2495Nt.ACo(AdError.CACHE_ERROR);
    }
}
