package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1042bt {
    public static byte[] A00;
    public static final C1041bs A01;
    public static final GK[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-2, 2, 7, -1, -4, 1, -63, 5, -8, -7, -1, -8, -10, 7, -63, -3, 9, 0, -63, -4, 1, 7, -8, 5, 1, -12, -1, -63, -27, -8, -7, -1, -8, -10, 7, -4, 2, 1, -39, -12, -10, 7, 2, 5, Ascii.FF, -36, 0, 3, -1};
    }

    static {
        C1041bs impl;
        try {
            A02();
            Class<?> implClass = Class.forName(A00(0, 49, 52));
            impl = (C1041bs) implClass.newInstance();
        } catch (ClassCastException unused) {
            impl = null;
        } catch (ClassNotFoundException unused2) {
            impl = null;
        } catch (IllegalAccessException unused3) {
            impl = null;
        } catch (InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new C1041bs();
        }
        A01 = impl;
        A02 = new GK[0];
    }

    public static String A01(AbstractC02046o abstractC02046o) {
        return A01.A03(abstractC02046o);
    }
}
