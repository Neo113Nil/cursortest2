package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum QH {
    A06(101),
    A09(102),
    A0A(103),
    A07(104),
    A08(105),
    A05(106),
    A04(107),
    A03(108);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, Ascii.RS, 1, Ascii.DC2, 5, Ascii.DC4, Ascii.SI, Ascii.US, 4, 9, Ascii.DC2, 2, 3, Ascii.DC2, 9, 8, Ascii.RS, Ascii.EM, Ascii.US, 2, Ascii.DC4, 8, Ascii.US, 0, 19, 4, Ascii.NAK, Ascii.SO, Ascii.RS, 5, 8, 19, Ascii.US, 7, 5, Ascii.FS, 38, 53, 44, 44, 51, 35, 50, 37, 37, 46, 63, 54, 41, 36, 37, 47, 63, 54, 41, 37, 55, 63, 47, 46, 63, 36, 37, 51, 52, 50, 47, 57, 89, 94, 68, 85, 66, 67, 68, 89, 68, 89, 81, 92, 79, 70, 89, 84, 85, 95, 79, 70, 89, 85, 71, 79, 84, 85, 67, 68, 66, 95, 73, Ascii.ETB, Ascii.FS, Ascii.SO, 6, Ascii.SI, 16, Ascii.GS, Ascii.FS, Ascii.SYN, 6, 16, Ascii.ETB, Ascii.CR, Ascii.FS, Ascii.VT, 10, Ascii.CR, 16, Ascii.CR, 16, Ascii.CAN, Ascii.NAK, 6, Ascii.ETB, Ascii.RS, Ascii.CR, 6, Ascii.ESC, Ascii.FF, Ascii.CR, Ascii.CR, Ascii.SYN, Ascii.ETB, 80, 91, 73, 65, 72, 87, 90, 91, 81, 65, 87, 80, 74, 91, 76, 77, 74, 87, 74, 87, 95, 82, 65, 74, 81, 81, 82, 92, 95, 76, 65, 93, 82, 81, 77, 91, 65, 93, 82, 87, 93, 85, 91, 90, 86, 65, 83, 69, 86, 64, 65, 64, 91, 82, 77, 64, 65, 75, 91, 80, 75, 75, 72, 70, 69, 86, 91, 71, 72, 75, 87, 65, 91, 71, 72, 77, 71, 79, 65, 64, 40, 48, 50, 43, 36, 43, 55, 46, 60, 50, 53};
    }

    static {
        A01();
    }

    QH(int i) {
        this.A00 = i;
    }

    public final int A02() {
        return this.A00;
    }
}
