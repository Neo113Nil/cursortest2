package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class J5 extends AbstractRunnableC2705Wc {
    public static byte[] A02;
    public final /* synthetic */ C2994d4 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public J5(C2994d4 c2994d4, C4A c4a) {
        this.A00 = c2994d4;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C2255Ek c2255Ek;
        C2255Ek c2255Ek2;
        c2255Ek = this.A00.A0D;
        if (c2255Ek.getState() != EnumC3160fm.A02) {
            return;
        }
        c2255Ek2 = this.A00.A0D;
        if (c2255Ek2.getCurrentPositionInMillis() != A00()) {
            return;
        }
        this.A00.A0I(A00(0, 22, 47));
    }
}
