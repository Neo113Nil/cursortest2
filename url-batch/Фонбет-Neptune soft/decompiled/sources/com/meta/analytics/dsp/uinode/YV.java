package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class YV implements RI {
    public static byte[] A01;
    public final C0888Ym A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, Ascii.NAK, Ascii.NAK, Ascii.DC2, -45, -8, Ascii.NAK, Ascii.ESC, Ascii.SUB, Ascii.SI, Ascii.DC4, Ascii.CR, -45, -6, Ascii.NAK, 17, Ascii.VT, Ascii.DC4, 102, 100, 86, 99, Ascii.RS, 82, 88, 86, 95, 101};
    }

    public YV(C0888Ym c0888Ym) {
        this.A00 = c0888Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.RI
    public final Map<String, String> A5o(boolean z) {
        HashMap hashMap = new HashMap();
        if (!C6E.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C02448l.A00().A01(this.A00, true).A03());
        }
        hashMap.put(A00(23, 10, 114), AbstractC02478o.A06(new C8K(this.A00), this.A00, z));
        return hashMap;
    }
}
