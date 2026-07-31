package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3397jr implements SM {
    public final /* synthetic */ C21047w A00;
    public final /* synthetic */ boolean A01;

    public C3397jr(C21047w c21047w, boolean z) {
        this.A00 = c21047w;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        C3218gi c3218gi;
        AtomicBoolean atomicBoolean;
        NJ nj;
        C3218gi c3218gi2;
        NQ nq;
        c3218gi = this.A00.A04;
        if (!C2668Up.A1t(c3218gi) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj = this.A00.A01;
            nj.AFm(this.A00);
            return;
        }
        C21047w c21047w = this.A00;
        c3218gi2 = this.A00.A04;
        nq = this.A00.A03;
        c21047w.A06 = AbstractC3003dD.A01(c3218gi2, (C20937l) nq, 0, new C3398js(this));
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        NJ nj;
        nj = this.A00.A01;
        nj.AFp(this.A00, AdError.CACHE_ERROR);
    }
}
