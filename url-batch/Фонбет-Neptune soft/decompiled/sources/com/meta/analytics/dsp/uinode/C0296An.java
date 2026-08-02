package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.An, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0296An extends Exception {
    public static byte[] A01;
    public static String[] A02 = {"9U3wPdJIU", "2LGp", "pJySrIerQ92A61C", "DThvYGttjE9j20qDJ6yVSrG4WY8ID38s", "4d1rNabt9wBbosJplZDA5yWTcQ5bg7DE", "S2Er", "uH", "phkxp1nklLcjNUB8"};
    public final int A00;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[0].length() == 2) {
                break;
            }
            A02[2] = "mthCjCtxSYf9ojX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
            if (A02[6].length() == 24) {
                break;
            }
            A02[0] = "k";
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{76, 120, 105, 100, 98, 89, Byte.MAX_VALUE, 108, 110, 102, 45, 122, Byte.MAX_VALUE, 100, 121, 104, 45, 107, 108, 100, 97, 104, 105, 55, 45};
    }

    static {
        A01();
    }

    public C0296An(int i) {
        super(A00(0, 25, 65) + i);
        this.A00 = i;
    }
}
