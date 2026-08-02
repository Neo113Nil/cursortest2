package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0729Sf extends KT {
    public static byte[] A01;
    public final /* synthetic */ C9Q A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, Ascii.DC2, 69, 83, 65, Ascii.DC2, 92, 87, 68, 87, 64, Ascii.DC2, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public C0729Sf(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z;
        z = this.A00.A07;
        if (!z) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
