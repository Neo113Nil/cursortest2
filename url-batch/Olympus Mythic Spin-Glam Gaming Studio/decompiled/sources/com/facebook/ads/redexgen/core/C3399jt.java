package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3399jt implements InterfaceC2616Sp {
    public final /* synthetic */ C21047w A00;

    public C3399jt(C21047w c21047w) {
        this.A00 = c21047w;
    }

    private void A00(boolean z) {
        NJ nj;
        AtomicBoolean atomicBoolean;
        NJ nj2;
        if (!z) {
            nj = this.A00.A01;
            nj.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj2 = this.A00.A01;
            nj2.AFm(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2616Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2616Sp
    public final void ADT() {
        A00(true);
    }
}
