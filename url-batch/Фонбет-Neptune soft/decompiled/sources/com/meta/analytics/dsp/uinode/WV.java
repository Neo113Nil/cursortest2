package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WV implements FB {
    public static String[] A03 = {"2iJQWlRsUDoPLtxxhE0wL9Cx9C7nOBrU", "oJgjoNY6hjjHJmelHDlI5xZuIY2b67h", "lPiJTezOZt4yDoox6bX3l7R6F2XzCVNN", "wrWzKGBonHGMzL1uPVOM3eUURFaMzKwB", "aBcbXNoo2m3wtFqQFSiOk3RFoevM7GVG", "GcCP7ZOQcwM7LeXwSBQclRy3S6aYmmD", "JUPsbTU3PQNYOt9vjPoPUzbQPtEFF22Q", "21kt6KXNgOdDUktVBInrV9GyhB6eLfYq"};
    public boolean A00;
    public final FB A01;
    public final /* synthetic */ CI A02;

    public WV(CI ci, FB fb) {
        this.A02 = ci;
        this.A01 = fb;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final boolean A9C() {
        return !this.A02.A03() && this.A01.A9C();
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final void AAM() throws IOException {
        this.A01.AAM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r0 != 0) goto L15;
     */
    @Override // com.meta.analytics.dsp.uinode.FB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEK(C02729p c02729p, C0867Xr c0867Xr, boolean z) {
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            c0867Xr.A02(4);
            return -4;
        }
        int AEK = this.A01.AEK(c02729p, c0867Xr, z);
        if (AEK == -5) {
            Format format = c02729p.A00;
            int result = format.A06;
            if (result == 0) {
                int result2 = format.A07;
            }
            int encoderPadding = this.A02.A01 != 0 ? 0 : format.A06;
            c02729p.A00 = format.A0G(encoderPadding, this.A02.A00 == Long.MIN_VALUE ? format.A07 : 0);
            return -5;
        }
        if (this.A02.A00 != Long.MIN_VALUE && ((AEK == -4 && c0867Xr.A00 >= this.A02.A00) || (AEK == -3 && this.A02.A6D() == Long.MIN_VALUE))) {
            c0867Xr.A07();
            c0867Xr.A02(4);
            this.A00 = true;
            return -4;
        }
        return AEK;
    }

    @Override // com.meta.analytics.dsp.uinode.FB
    public final int AGO(long j) {
        if (!this.A02.A03()) {
            return this.A01.AGO(j);
        }
        if (A03[7].charAt(6) == 'T') {
            throw new RuntimeException();
        }
        A03[0] = "I7Vle9theSHJs2vfg5SYnPGKFT8j8RVM";
        return -3;
    }
}
