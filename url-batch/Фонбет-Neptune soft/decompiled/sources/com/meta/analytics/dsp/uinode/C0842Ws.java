package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0842Ws implements D6 {
    public static byte[] A03;
    public C4 A00;
    public IB A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, Ascii.DC4, 67, Ascii.SYN, 72, 88, 79, 94, 8, Ascii.SO};
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A4R(C0470Hz c0470Hz) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5n(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = c0470Hz.A04();
        this.A00.AFR(c0470Hz, A04);
        this.A00.AFS(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib, InterfaceC0329Bu interfaceC0329Bu, DC dc) {
        this.A01 = ib;
        dc.A05();
        C4 AGi = interfaceC0329Bu.AGi(dc.A03(), 4);
        this.A00 = AGi;
        AGi.A5n(Format.A0B(dc.A04(), A00(0, 20, 99), null, -1, null));
    }
}
