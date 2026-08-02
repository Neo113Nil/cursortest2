package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0749Sz extends KT {
    public static byte[] A02;
    public final /* synthetic */ C0747Sx A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Byte.MAX_VALUE, -78, -93, -93, -94, -81, -90, -85, -92, 93, -90, -85, -95, -94, -93, -90, -85, -90, -79, -94, -87, -74};
    }

    public C0749Sz(C0747Sx c0747Sx, AnonymousClass93 anonymousClass93) {
        this.A00 = c0747Sx;
        this.A01 = anonymousClass93;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        SA sa;
        SA sa2;
        InterfaceC0649Pd interfaceC0649Pd;
        sa = this.A00.A0Z;
        if (sa.getState() == RB.A02) {
            sa2 = this.A00.A0Z;
            if (sa2.getCurrentPositionInMillis() == A00()) {
                interfaceC0649Pd = this.A00.A0X;
                interfaceC0649Pd.ADX(A00(0, 22, 43));
            }
        }
    }
}
