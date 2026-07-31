package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C3218gi c3218gi, AbstractC3383jd abstractC3383jd, boolean z, O3 o3) {
        if (!C2668Up.A2E(c3218gi)) {
            C2624Sx c2624Sx = new C2624Sx(c3218gi);
            C2490No A07 = abstractC3383jd.A29().A0H().A07();
            c2624Sx.A0e(new VI(abstractC3383jd.A2E(), c3218gi.A0A()));
            if (A07 == null) {
                o3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (A07.A0Y()) {
                o3.AFG();
                return;
            }
            C2620St c2620St = new C2620St(A07.A0L(), abstractC3383jd.A1D(), abstractC3383jd.A10());
            c2620St.A04 = true;
            c2620St.A03 = A00(0, 5, 86);
            switch (O2.A00[A07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c2624Sx.A0Y(c2620St);
                    break;
            }
            c2624Sx.A0c(new C2622Sv(abstractC3383jd.A2C().A01(), -1, -1, abstractC3383jd.A1D(), abstractC3383jd.A10()));
            c2624Sx.A0c(new C2622Sv(A07.A0K(), -1, -1, abstractC3383jd.A1D(), abstractC3383jd.A10()));
            O0.A00(abstractC3383jd, c2624Sx, A00(5, 12, 71));
            c2624Sx.A0X(new C3361jA(c3218gi, o3, c2624Sx, A07, z), new C2617Sq(abstractC3383jd.A1D(), abstractC3383jd.A10()));
            return;
        }
        o3.AFG();
    }
}
