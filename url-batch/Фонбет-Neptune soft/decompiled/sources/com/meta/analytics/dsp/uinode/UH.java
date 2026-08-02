package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UH implements L8 {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, 120, 121, 98, 110, 97, 100, 110, 102};
    }

    public UH(UD ud) {
        this.A00 = ud;
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ABA() {
        boolean z;
        boolean z2;
        z = this.A00.A0A;
        if (!z) {
            z2 = this.A00.A09;
            if (!z2) {
                this.A00.A0U(false, A00(0, 9, 108));
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.L8
    public final void ACm(float f) {
    }
}
