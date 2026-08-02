package com.meta.analytics.dsp.uinode;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0326Br extends AbstractC0866Xq implements InterfaceC0409Fo {
    public long A00;
    public InterfaceC0409Fo A01;

    public abstract void A08();

    @Override // com.meta.analytics.dsp.uinode.B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j, InterfaceC0409Fo interfaceC0409Fo, long j2) {
        super.A01 = j;
        this.A01 = interfaceC0409Fo;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final List<C0408Fn> A6Z(long j) {
        return this.A01.A6Z(j - this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final long A70(int i) {
        return this.A01.A70(i) + this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0409Fo
    public final int A7T(long j) {
        return this.A01.A7T(j - this.A00);
    }
}
