package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static LO A00(InterfaceC3569ms interfaceC3569ms, C20254v c20254v) throws IOException {
        interfaceC3569ms.AGt(c20254v.A0l(), 0, 8);
        c20254v.A0f(0);
        int A0C = c20254v.A0C();
        long size = c20254v.A0O();
        return new LO(A0C, size);
    }
}
