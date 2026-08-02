package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T2 implements NS {
    public static byte[] A01;
    public final /* synthetic */ C0747Sx A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-36, -38, -52, -39, -58, -43, -56, -35, -48, -50, -56, -37, -48, -42, -43, -58, -48, -56, -55};
    }

    public T2(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACT(String str) {
        NK nk;
        NK nk2;
        this.A00.A0Q = false;
        nk = this.A00.A0F;
        nk.setProgress(100);
        nk2 = this.A00.A0F;
        AbstractC0556Lo.A0N(nk2, 8);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACV(String str) {
        NK nk;
        NJ nj;
        boolean z;
        int i;
        this.A00.A0Q = true;
        nk = this.A00.A0F;
        AbstractC0556Lo.A0N(nk, 0);
        nj = this.A00.A0E;
        nj.setUrl(str);
        z = this.A00.A0P;
        if (!z) {
            i = this.A00.A02;
            if (i > 1) {
                this.A00.A0P = true;
                this.A00.A0j(A00(0, 19, 97));
            }
        }
        C0747Sx.A08(this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACn(int i) {
        boolean z;
        NK nk;
        z = this.A00.A0Q;
        if (z) {
            nk = this.A00.A0F;
            nk.setProgress(i);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACq(String str) {
        NJ nj;
        nj = this.A00.A0E;
        nj.setTitle(str);
    }

    @Override // com.meta.analytics.dsp.uinode.NS
    public final void ACs() {
        ((PQ) this.A00).A09.AB0(14);
    }
}
