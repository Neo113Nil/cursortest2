package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y8 implements InterfaceC0461Hq {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", "l", "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    public Y5 A00;
    public InterfaceC0461Hq A01;
    public final C9Z A02;
    public final C0805Ve A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, Byte.MAX_VALUE, -47, -60, -51, -61, -60, -47, -60, -47, Byte.MAX_VALUE, -52, -60, -61, -56, -64, Byte.MAX_VALUE, -62, -53, -50, -62, -54, -46, Byte.MAX_VALUE, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public Y8(C9Z c9z, InterfaceC0448Hd interfaceC0448Hd) {
        this.A02 = c9z;
        this.A03 = new C0805Ve(interfaceC0448Hd);
    }

    private void A01() {
        this.A03.A02(this.A01.A7k());
        C02809x A7h = this.A01.A7h();
        if (!A7h.equals(this.A03.A7h())) {
            this.A03.AGA(A7h);
            this.A02.ACb(A7h);
        }
    }

    private boolean A03() {
        Y5 y5 = this.A00;
        if (y5 != null && !y5.A91()) {
            boolean A9C = this.A00.A9C();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (A9C || !this.A00.A8a()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long A7k = this.A01.A7k();
            if (A05[7].length() == 18) {
                throw new RuntimeException();
            }
            A05[7] = "L098bBK7xK";
            return A7k;
        }
        return this.A03.A7k();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j) {
        this.A03.A02(j);
    }

    public final void A08(Y5 y5) {
        if (y5 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(Y5 y5) throws C02609c {
        InterfaceC0461Hq A7N = y5.A7N();
        if (A7N != null) {
            InterfaceC0461Hq interfaceC0461Hq = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (A7N != interfaceC0461Hq) {
                if (interfaceC0461Hq == null) {
                    this.A01 = A7N;
                    this.A00 = y5;
                    InterfaceC0461Hq rendererMediaClock = this.A03;
                    A7N.AGA(rendererMediaClock.A7h());
                    A01();
                    return;
                }
                throw C02609c.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final C02809x A7h() {
        InterfaceC0461Hq interfaceC0461Hq = this.A01;
        if (interfaceC0461Hq != null) {
            return interfaceC0461Hq.A7h();
        }
        return this.A03.A7h();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final long A7k() {
        if (A03()) {
            return this.A01.A7k();
        }
        return this.A03.A7k();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0461Hq
    public final C02809x AGA(C02809x c02809x) {
        InterfaceC0461Hq interfaceC0461Hq = this.A01;
        if (interfaceC0461Hq != null) {
            c02809x = interfaceC0461Hq.AGA(c02809x);
        }
        this.A03.AGA(c02809x);
        this.A02.ACb(c02809x);
        return c02809x;
    }
}
