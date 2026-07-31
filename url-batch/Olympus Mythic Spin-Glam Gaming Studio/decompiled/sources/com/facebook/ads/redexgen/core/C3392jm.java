package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3392jm extends AbstractRunnableC2705Wc {
    public static byte[] A01;
    public final /* synthetic */ C3391jl A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C3392jm(C3391jl c3391jl) {
        this.A00 = c3391jl;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C3218gi c3218gi;
        AbstractC2864ay abstractC2864ay;
        C3393jn c3393jn;
        c3218gi = this.A00.A03;
        c3218gi.A0F().AKw();
        abstractC2864ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c3393jn = this.A00.A00;
        abstractC2864ay.loadUrl(append.append(c3393jn.A03()).toString());
    }
}
