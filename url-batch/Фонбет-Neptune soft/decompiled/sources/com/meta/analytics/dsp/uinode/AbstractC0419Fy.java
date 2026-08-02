package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0419Fy {
    public static byte[] A00;
    public static String[] A01 = {"UAa0Z", "y84zlLC7EVblAi9s6IjzDwtWlv", "hWSmc3nAoC6lO20JdXQ8UQAJh4", "HAxIJdFwG2BHjJ6kBVBijNmfixc4v4eM", "sMFPtSIIwmEBUNkX5nfAspCddytOxG7k", "XuEZcwrwjFPAmN9wFCdffjeuCf3K5K0k", "0bJFkLVdjL4ExnLkyIfxNw93FYOhEgu9", "GtmYUKm65Uny9K5bn1TkELKUpeSnjSJ3"};
    public static final int A02;
    public static final int A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{56, Ascii.RS, Ascii.SUB, 46, Ascii.SI, Ascii.DC2, Ascii.ETB, 37, 53, 38, 80, 40, 46, 86, 91, 108, 84, 86, 79, 79, 86, 81, 88, Ascii.US, 77, 90, 82, 94, 86, 81, 91, 90, 77, Ascii.US, 80, 89, Ascii.US, 82, 94, 83, 89, 80, 77, 82, 90, 91, Ascii.US, 108, 122, 118, Ascii.US, 113, 126, 115, Ascii.US, 74, 81, 86, 75, 17};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A03(long j, C0470Hz c0470Hz, C4[] c4Arr) {
        while (c0470Hz.A04() > 1) {
            int A002 = A00(c0470Hz);
            int A003 = A00(c0470Hz);
            int A06 = c0470Hz.A06();
            if (A01[3].charAt(16) != 'B') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "sJRWMhzWyXWsYNwcYdMxu9waYeZJW4nD";
            strArr[5] = "JDck5DNLGL8VXNpOftdo1S17ghv9bSuy";
            int i = A06 + A003;
            if (A003 == -1 || A003 > c0470Hz.A04()) {
                Log.w(A01(0, 7, 76), A01(15, 45, 8));
                i = c0470Hz.A07();
            } else if (A002 == 4 && A003 >= 8) {
                int A0E = c0470Hz.A0E();
                int A0I = c0470Hz.A0I();
                int A08 = A0I == 49 ? c0470Hz.A08() : 0;
                int A0E2 = c0470Hz.A0E();
                if (A0I == 47) {
                    c0470Hz.A0Z(1);
                }
                boolean z = A0E == 181 && (A0I == 49 || A0I == 47) && A0E2 == 3;
                if (A0I == 49) {
                    z &= A08 == A03 || A08 == A02;
                }
                if (z) {
                    int A0E3 = c0470Hz.A0E() & 31;
                    c0470Hz.A0Z(1);
                    int i2 = A0E3 * 3;
                    int A062 = c0470Hz.A06();
                    for (C4 c4 : c4Arr) {
                        c0470Hz.A0Y(A062);
                        c4.AFR(c0470Hz, i2);
                        c4.AFS(j, 1, i2, 0, null);
                    }
                }
            }
            c0470Hz.A0Y(i);
        }
    }

    static {
        A02();
        A03 = IF.A08(A01(11, 4, 88));
        A02 = IF.A08(A01(7, 4, 86));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(C0470Hz c0470Hz) {
        int i = 0;
        while (value != 0) {
            int b = c0470Hz.A0E();
            i += b;
            if (b != 255) {
                return i;
            }
        }
        if (A01[0].length() != 5) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "XY7JbweA6fzPXsut6MPl2wkiFN";
        strArr[1] = "9Cope1RtGoIRUkWui2tRq11YR8";
        return -1;
    }
}
