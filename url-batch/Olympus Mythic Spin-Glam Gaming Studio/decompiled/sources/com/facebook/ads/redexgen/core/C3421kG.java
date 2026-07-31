package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.kG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3421kG extends AbstractC2470Mt {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, 61, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C3421kG.class.getSimpleName();
    }

    public C3421kG(C3218gi c3218gi, VA va, String str, Uri uri, Map<String, String> mExtraData) {
        super(c3218gi, va, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2470Mt
    public final EnumC2467Mq A0G(String str) {
        VC vc = VC.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                vc = VC.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.A02.ABq(this.A03, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), vc);
        return EnumC2467Mq.A09;
    }
}
