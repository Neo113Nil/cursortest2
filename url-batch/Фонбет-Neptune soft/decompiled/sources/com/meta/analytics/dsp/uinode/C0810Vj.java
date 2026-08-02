package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0810Vj implements InterfaceC0439Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC0437Gr A01;
    public final InterfaceC0439Gt A02;
    public final InterfaceC0439Gt A03;
    public final HK A04;
    public final HM A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{106, 123, 108, 104, 125, 108, 77, 104, 125, 104, 90, 96, 103, 98};
    }

    public C0810Vj(HK hk, InterfaceC0439Gt interfaceC0439Gt, InterfaceC0439Gt interfaceC0439Gt2, InterfaceC0437Gr interfaceC0437Gr, int i, HM hm) {
        this.A04 = hk;
        this.A03 = interfaceC0439Gt;
        this.A02 = interfaceC0439Gt2;
        this.A01 = interfaceC0437Gr;
        this.A00 = i;
        this.A05 = hm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0439Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0811Vk A4X() {
        HK hk = this.A04;
        InterfaceC0440Gu A4X = this.A03.A4X();
        InterfaceC0440Gu A4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C0811Vk(hk, A4X, A4X2, null, this.A00, null);
    }
}
