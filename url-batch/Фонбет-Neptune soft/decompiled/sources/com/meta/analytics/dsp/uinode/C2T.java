package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.2T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2T {
    public static C2S A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, Base64.padSymbol, 42, 119, Ascii.CAN, Ascii.GS, 6, Ascii.VT, Ascii.FS, 9, Ascii.SYN, Ascii.VT, Ascii.CR, 16, Ascii.ETB, Ascii.RS, 6, Ascii.SUB, Ascii.SYN, Ascii.ETB, Ascii.US, 16, Ascii.RS};
    }

    public static C2S A00(C0888Ym c0888Ym) {
        if (A00 == null) {
            synchronized (C2S.class) {
                if (A00 == null) {
                    A00 = new C2S(new C0937aC(c0888Ym.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), c0888Ym), 0)));
                }
            }
        }
        return A00;
    }
}
