package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PS implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ A2 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{116, 75, 70, 71, 77, 114, 78, 67, 91, 64, 67, 65, 73, 103, 80, 80, 77, 80};
    }

    public PS(A2 a2) {
        this.A00 = a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0649Pd interfaceC0649Pd;
        if (KL.A02(this)) {
            return;
        }
        try {
            interfaceC0649Pd = this.A00.A00.A0F;
            interfaceC0649Pd.ADX(A00(0, 18, 116));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
