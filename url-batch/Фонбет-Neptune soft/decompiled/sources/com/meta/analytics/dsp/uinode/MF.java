package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class MF implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ ViewOnClickListenerC0317Bi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{62, 56, 46, 57, Ascii.DC4, 41, 62, 45, 45, 46, 57, 46, 47, Ascii.DC4, 40, 39, 34, 40, 32, Ascii.DC4, 42, 45, 63, 46, 57, Ascii.DC4, 47, 46, 39, 42, 50};
    }

    public MF(ViewOnClickListenerC0317Bi viewOnClickListenerC0317Bi) {
        this.A00 = viewOnClickListenerC0317Bi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 125));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
