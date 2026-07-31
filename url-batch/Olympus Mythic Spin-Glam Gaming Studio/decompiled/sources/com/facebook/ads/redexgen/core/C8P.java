package com.facebook.ads.redexgen.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC3698oz implements InterfaceC2382Jj {
    public long A00;
    public InterfaceC2382Jj A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3698oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC20505u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC2382Jj interfaceC2382Jj, long j2) {
        super.A01 = j;
        this.A01 = interfaceC2382Jj;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final List<C3728pT> A7X(long j) {
        return ((InterfaceC2382Jj) AbstractC20023y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final long A83(int i) {
        return ((InterfaceC2382Jj) AbstractC20023y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final int A84() {
        return ((InterfaceC2382Jj) AbstractC20023y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final int A8a(long j) {
        return ((InterfaceC2382Jj) AbstractC20023y.A01(this.A01)).A8a(j - this.A00);
    }
}
