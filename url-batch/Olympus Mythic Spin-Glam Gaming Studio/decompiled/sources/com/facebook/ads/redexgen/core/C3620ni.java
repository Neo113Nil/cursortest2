package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3620ni implements InterfaceC2270Ez {
    public long A00;
    public long A01;
    public C3620ni A02;
    public C2269Ey A03;

    public C3620ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C3620ni A01() {
        this.A03 = null;
        C3620ni c3620ni = this.A02;
        this.A02 = null;
        return c3620ni;
    }

    public final void A02(long j, int i) {
        AbstractC20023y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(C2269Ey c2269Ey, C3620ni c3620ni) {
        this.A03 = c2269Ey;
        this.A02 = c3620ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2270Ez
    public final C2269Ey A6u() {
        return (C2269Ey) AbstractC20023y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2270Ez
    public final C3620ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
