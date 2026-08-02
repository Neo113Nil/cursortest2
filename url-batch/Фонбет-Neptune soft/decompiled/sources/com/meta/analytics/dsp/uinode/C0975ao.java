package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0975ao extends KT {
    public static byte[] A03;
    public InterfaceC00530p A00;
    public String A01;
    public final /* synthetic */ FR A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{105, -116, -119, -104, -100, -115, -102, 72, -100, -111, -107, -115, -105, -99, -100, 86};
    }

    public C0975ao(FR fr, InterfaceC00530p interfaceC00530p, String str) {
        this.A02 = fr;
        this.A00 = interfaceC00530p;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0N(this.A00);
        this.A02.ABR(new C0495Jb(AdErrorType.NETWORK_ERROR, A00(0, 16, 38)));
    }
}
