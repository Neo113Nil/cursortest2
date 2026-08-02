package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0861Xl implements C4 {
    @Override // com.meta.analytics.dsp.uinode.C4
    public final void A5n(Format format) {
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final int AFQ(InterfaceC0328Bt interfaceC0328Bt, int i, boolean z) throws IOException, InterruptedException {
        int AGM = interfaceC0328Bt.AGM(i);
        if (AGM == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AGM;
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFR(C0470Hz c0470Hz, int i) {
        c0470Hz.A0Z(i);
    }

    @Override // com.meta.analytics.dsp.uinode.C4
    public final void AFS(long j, int i, int i2, int i3, C3 c3) {
    }
}
