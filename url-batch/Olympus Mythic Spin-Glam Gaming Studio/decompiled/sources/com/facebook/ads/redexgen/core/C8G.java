package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.chromium.net.NetError;

/* renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8G extends AbstractC3439kY<M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + NetError.ERR_PROXY_AUTH_UNSUPPORTED);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C8G(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3439kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C2450Lz A04(M5 m5) {
        return new C2450Lz(this, m5 == null ? A00(0, 4, 114) : m5.A03());
    }
}
