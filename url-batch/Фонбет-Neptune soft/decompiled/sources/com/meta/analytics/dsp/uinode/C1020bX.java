package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1020bX extends AbstractC00460h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, Byte.MIN_VALUE, 50, 126, 123, Byte.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C1020bX.class.getSimpleName();
    }

    public C1020bX(C0889Yn c0889Yn, J2 j2, String str, Uri uri) {
        super(c0889Yn, j2, str);
        this.A00 = uri;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC00460h
    public final EnumC00450g A0C() {
        try {
            C0537Kv.A0D(new C0537Kv(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
        return EnumC00450g.A08;
    }
}
