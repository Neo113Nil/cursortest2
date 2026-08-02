package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0816Vp implements InterfaceC0440Gu {
    public final int A00;
    public final InterfaceC0440Gu A01;
    public final I3 A02;

    public C0816Vp(InterfaceC0440Gu interfaceC0440Gu, I3 i3, int i) {
        this.A01 = (InterfaceC0440Gu) AbstractC0445Ha.A01(interfaceC0440Gu);
        this.A02 = (I3) AbstractC0445Ha.A01(i3);
        this.A00 = i;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final Uri A8E() {
        return this.A01.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final long ADl(C0444Gy c0444Gy) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ADl(c0444Gy);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
