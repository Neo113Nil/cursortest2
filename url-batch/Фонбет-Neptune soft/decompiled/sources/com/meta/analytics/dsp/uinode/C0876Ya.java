package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0876Ya extends KT {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C0888Ym A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{91, 108, 99, 40, 123, 125, 107, 107, 109, 123, 123, 110, 125, 100, 100, 113, 40, 97, 102, 97, 124, 97, 105, 100, 97, 114, 109, 108, 41};
    }

    public C0876Ya(C0888Ym c0888Ym, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c0888Ym;
        this.A00 = initListener;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        try {
            YL.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A07().A3c(th);
        }
        C8Y.A0C(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            C8Y.A04(initListener, new C8X(true, A00(0, 29, 0)));
        }
    }
}
