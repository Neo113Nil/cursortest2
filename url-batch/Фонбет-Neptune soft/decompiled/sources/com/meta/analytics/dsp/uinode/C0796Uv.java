package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0796Uv extends KT {
    public static byte[] A01;
    public static String[] A02 = {"HdBP5Xz", "1x1Spdd4leaR6rMyIqz7jDuVALPBafGP", "axXL5TnL0HBMXsVKsrA9GDOWQxSG9OY6", "1dEgnVHIT0m43fI6JYH9hpNhfyiBWS6N", "iEi5yE", "UjLwzpYsoJIrFySVWBkKISpV5tCrd9dB", "Qbq65yz", "qKKFep347IAmJ8sue1lLg6VgEBnKG6W3"};
    public final /* synthetic */ K4 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A02[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{Ascii.EM, Ascii.FS, 16, Ascii.SO, Ascii.EM, Ascii.FF, 33, Ascii.NAK, Ascii.US, Ascii.FS, 33, 33, Ascii.EM, Ascii.DC2};
    }

    static {
        A02();
    }

    public C0796Uv(K4 k4) {
        this.A00 = k4;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C0889Yn c0889Yn;
        c0889Yn = this.A00.A04;
        c0889Yn.A07().A8l(A00(0, 14, 84));
    }
}
