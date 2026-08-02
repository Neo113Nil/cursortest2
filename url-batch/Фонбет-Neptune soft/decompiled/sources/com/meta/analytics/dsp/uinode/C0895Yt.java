package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0895Yt extends KT {
    public static byte[] A02;
    public final /* synthetic */ C0894Ys A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, Ascii.SYN, 80, 87, 95, 90, Ascii.CAN, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C0895Yt(C0894Ys c0894Ys, AtomicBoolean atomicBoolean) {
        this.A00 = c0894Ys;
        this.A01 = atomicBoolean;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C02177f c02177f;
        long j;
        C02177f c02177f2;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(J9.A0H);
                c02177f2 = this.A00.A02.A04;
                C6V c6v = this.A00.A01;
                int i = C01976f.A00;
                String A00 = A00(11, 14, 17);
                j2 = this.A00.A02.A00;
                C01976f.A02(c02177f2, c6v, i, A00, j2);
                this.A00.A02.A0T();
                this.A00.A00.ABB();
                return;
            }
            this.A00.A02.A0I(J9.A0G);
            c02177f = this.A00.A02.A04;
            C6V c6v2 = this.A00.A01;
            int i2 = C01976f.A04;
            String A002 = A00(0, 11, 41);
            j = this.A00.A02.A00;
            C01976f.A02(c02177f, c6v2, i2, A002, j);
            this.A00.A02.A0U();
            this.A00.A00.AB2();
        }
    }
}
