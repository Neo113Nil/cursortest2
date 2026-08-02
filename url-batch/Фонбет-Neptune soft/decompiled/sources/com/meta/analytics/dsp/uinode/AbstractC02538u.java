package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02538u {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static C8w A00(C0888Ym c0888Ym) {
        try {
            return new YD(c0888Ym);
        } catch (IOException e) {
            c0888Ym.A07().A9a(A02(0, 15, 89), C8A.A2K, new C8B(e));
            return new YG();
        }
    }

    public static EN A01(C0888Ym c0888Ym) {
        return new EN(c0888Ym);
    }
}
