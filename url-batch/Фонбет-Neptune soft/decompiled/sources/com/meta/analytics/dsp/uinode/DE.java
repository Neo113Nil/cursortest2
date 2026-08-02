package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DE {
    public final int A00;
    public final long A01;

    public DE(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static DE A00(InterfaceC0328Bt interfaceC0328Bt, C0470Hz c0470Hz) throws IOException, InterruptedException {
        interfaceC0328Bt.ADv(c0470Hz.A00, 0, 8);
        c0470Hz.A0Y(0);
        int A08 = c0470Hz.A08();
        long size = c0470Hz.A0K();
        return new DE(A08, size);
    }
}
