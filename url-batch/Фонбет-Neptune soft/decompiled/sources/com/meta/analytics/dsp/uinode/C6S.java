package com.meta.analytics.dsp.uinode;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.6S, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6S {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{45, 59, 16, 42, 55, 59, Base64.padSymbol, 46, 60, 43, 39, 37, 102, 46, 41, 43, 45, 42, 39, 39, 35, 102, 41, 44, 59, 102, 33, 38, 60, 45, 58, 38, 41, 36, 102, 42, 60, 45, 48, 60, 58, 41, 59};
    }

    public static SharedPreferences A00(C02177f c02177f) {
        return c02177f.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(9, 34, 105), c02177f), 0);
    }

    public final String A03(C02177f c02177f) {
        return A00(c02177f).getString(A01(0, 9, 110), null);
    }

    public final void A04(C02177f c02177f, String str) {
        SharedPreferences btSP = A00(c02177f);
        btSP.edit().putString(A01(0, 9, 110), str).apply();
    }
}
