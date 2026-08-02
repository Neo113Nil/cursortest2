package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0859Xj implements C1 {
    public final long A00;
    public final C0 A01;

    public C0859Xj(long j) {
        this(j, 0L);
    }

    public C0859Xj(long j, long j2) {
        this.A00 = j;
        this.A01 = new C0(j2 == 0 ? C2.A03 : new C2(0L, j2));
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j) {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return false;
    }
}
