package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1041bs {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{0, 4, 9, 1, -2, 3, -61, -1, Ascii.VT, 2, -61, -5, 10, 3, -8, 9, -2, 4, 3, 8, -61};
    }

    public final String A02(GL gl) {
        String obj = gl.getClass().getGenericInterfaces()[0].toString();
        String A002 = A00(0, 21, 47);
        return obj.startsWith(A002) ? obj.substring(A002.length()) : obj;
    }

    public final String A03(AbstractC02046o abstractC02046o) {
        return A02(abstractC02046o);
    }
}
