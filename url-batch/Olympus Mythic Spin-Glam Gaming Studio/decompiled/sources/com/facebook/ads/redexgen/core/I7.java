package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class I7 extends AbstractRunnableC2705Wc {
    public static byte[] A02;
    public static String[] A03 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ C5S A00;
    public final /* synthetic */ C4A A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{51, 4, 23, 23, 20, 3, 24, 31, 22, 81, 24, 31, 21, 20, 23, 24, 31, 24, 5, 20, 29, 8};
    }

    static {
        A01();
    }

    public I7(C5S c5s, C4A c4a) {
        this.A00 = c5s;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C2255Ek c2255Ek;
        C2255Ek c2255Ek2;
        c2255Ek = this.A00.A0S;
        if (c2255Ek.getState() == EnumC3160fm.A02) {
            c2255Ek2 = this.A00.A0S;
            int currentPositionInMillis = c2255Ek2.getCurrentPositionInMillis();
            if (A03[2].length() != 8) {
                throw new RuntimeException();
            }
            A03[7] = "iv52OwD8pgB4ao6bV3eWAeQD9PjHFRbz";
            if (currentPositionInMillis == A00()) {
                this.A00.A0S(A00(0, 22, 57));
            }
        }
    }
}
