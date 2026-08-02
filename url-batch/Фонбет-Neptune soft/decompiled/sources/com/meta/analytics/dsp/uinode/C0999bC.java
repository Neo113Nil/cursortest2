package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0999bC extends KT {
    public static byte[] A01;
    public final /* synthetic */ C0998bB A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C0999bC(C0998bB c0998bB) {
        this.A00 = c0998bB;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C0889Yn c0889Yn;
        NY ny;
        C1000bD c1000bD;
        c0889Yn = this.A00.A02;
        c0889Yn.A0E().AH4();
        ny = this.A00.A04;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 35));
        c1000bD = this.A00.A00;
        ny.loadUrl(append.append(c1000bD.A03()).toString());
    }
}
