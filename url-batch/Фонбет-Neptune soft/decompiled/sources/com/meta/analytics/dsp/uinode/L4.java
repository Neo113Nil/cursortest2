package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class L4 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-60, -52, 8, Ascii.CR, Ascii.ETB, Ascii.DC4, 16, 5, Ascii.GS, 9, 8, -60, 10, 19, Ascii.SYN, -60, Ascii.CAN, 9, Ascii.ETB, Ascii.CAN, -60, 5, 8, Ascii.ETB, -60, 19, Ascii.DC2, 16, Ascii.GS, -51};
    }

    public static void A02(Context context, String str) {
        if (AdInternalSettings.isTestMode(context)) {
            String str2 = str + A00(0, 30, 46);
        }
    }
}
