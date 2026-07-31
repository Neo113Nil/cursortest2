package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3605nT implements InterfaceC2382Jj {
    public final long A00;
    public final BP<C3728pT> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.text.Cue> */
    public C3605nT(long j, BP<C3728pT> bp) {
        this.A00 = j;
        this.A01 = bp;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final List<C3728pT> A7X(long j) {
        return j >= this.A00 ? this.A01 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final long A83(int i) {
        AbstractC20023y.A07(i == 0);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final int A8a(long j) {
        return this.A00 > j ? 0 : -1;
    }
}
