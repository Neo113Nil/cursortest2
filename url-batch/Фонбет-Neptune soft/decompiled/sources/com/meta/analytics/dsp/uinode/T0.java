package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class T0 extends KT {
    public static byte[] A01;
    public final /* synthetic */ C0747Sx A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{35, 54, 49, 50, 60, -19, 68, 46, 64, -19, 59, 50, 67, 50, 63, -19, Base64.padSymbol, 63, 50, Base64.padSymbol, 46, 63, 50, 49};
    }

    public T0(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z;
        InterfaceC0649Pd interfaceC0649Pd;
        z = this.A00.A0S;
        if (!z) {
            interfaceC0649Pd = this.A00.A0X;
            interfaceC0649Pd.ADX(A00(0, 24, 79));
        }
    }
}
