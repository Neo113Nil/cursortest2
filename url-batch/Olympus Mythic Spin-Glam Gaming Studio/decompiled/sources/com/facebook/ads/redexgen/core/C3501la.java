package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.la, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3501la implements InterfaceC2382Jj {
    public final List<C3728pT> A00;

    public C3501la(List<C3728pT> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final List<C3728pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final long A83(int i) {
        AbstractC20023y.A07(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2382Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
