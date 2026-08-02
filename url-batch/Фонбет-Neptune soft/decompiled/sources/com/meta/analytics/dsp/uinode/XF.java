package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XF implements InterfaceC0327Bs {
    public static byte[] A03;
    public static final InterfaceC0330Bv A04;
    public InterfaceC0329Bu A00;
    public AbstractC0346Co A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new XG();
    }

    public static C0470Hz A00(C0470Hz c0470Hz) {
        c0470Hz.A0Y(0);
        return c0470Hz;
    }

    private boolean A03(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        C0342Ck c0342Ck = new C0342Ck();
        if (!c0342Ck.A03(interfaceC0328Bt, true) || (c0342Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0342Ck.A00, 8);
        C0470Hz c0470Hz = new C0470Hz(length);
        interfaceC0328Bt.ADv(c0470Hz.A00, 0, length);
        if (XH.A04(A00(c0470Hz))) {
            this.A01 = new XH();
        } else if (XC.A06(A00(c0470Hz))) {
            this.A01 = new XC();
        } else {
            if (!XE.A04(A00(c0470Hz))) {
                return false;
            }
            this.A01 = new XE();
        }
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final void A8o(InterfaceC0329Bu interfaceC0329Bu) {
        this.A00 = interfaceC0329Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final int AEH(InterfaceC0328Bt interfaceC0328Bt, C0332Bz c0332Bz) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC0328Bt)) {
                interfaceC0328Bt.AFM();
            } else {
                throw new C02789v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            C4 AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0328Bt, c0332Bz);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final void AFh(long j, long j2) {
        AbstractC0346Co abstractC0346Co = this.A01;
        if (abstractC0346Co != null) {
            abstractC0346Co.A05(j, j2);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0327Bs
    public final boolean AGR(InterfaceC0328Bt interfaceC0328Bt) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0328Bt);
        } catch (C02789v unused) {
            return false;
        }
    }
}
