package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class MF implements InterfaceC2783Zf {
    public static byte[] A01;
    public static String[] A02 = {"8F1ylXiPLmOJlxHuSB0OfTD8ERnub0Jc", "S6BOYeNFrgFu99vNdASrFyo", "dJPilyeR7SZ6Rr21hdX", "myhsKKLHgmC4nogMMn1nxIO", "jSXY2xjzyKT8sDO", "m4o2VQ2UIP9pfbMg6FrqdCCZlyPN5tpn", "ArrKoNW9WxnAbKv8I1vfh8MoVmXkp7wv", "MU6Xe0UyfSgNRnTq3TqZG"};
    public final /* synthetic */ AbstractC2781Zd A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{1, 13, 15, 76, 4, 3, 1, 7, 0, 13, 13, 9, 76, 3, 6, 17, 76, 3, 6, 16, 7, 18, 13, 16, 22, 11, 12, 5, 76, 36, 43, 44, 43, 49, 42, 61, 35, 38, 61, 48, 39, 50, 45, 48, 54, 43, 44, 37, 61, 36, 46, 45, 53};
    }

    static {
        A01();
    }

    public MF(AbstractC2781Zd abstractC2781Zd) {
        this.A00 = abstractC2781Zd;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2783Zf
    public final void A53() {
        InterfaceC2759Yh interfaceC2759Yh;
        InterfaceC2759Yh interfaceC2759Yh2;
        interfaceC2759Yh = this.A00.A09;
        if (interfaceC2759Yh == null) {
            return;
        }
        interfaceC2759Yh2 = this.A00.A09;
        interfaceC2759Yh2.A4j(A00(0, 53, 115));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2783Zf
    public final void A54() {
        InterfaceC2760Yi interfaceC2760Yi;
        InterfaceC2780Zc interfaceC2780Zc;
        InterfaceC2780Zc interfaceC2780Zc2;
        InterfaceC2760Yi interfaceC2760Yi2;
        this.A00.A0P();
        interfaceC2760Yi = this.A00.A0A;
        if (interfaceC2760Yi != null) {
            interfaceC2760Yi2 = this.A00.A0A;
            interfaceC2760Yi2.AFi(true);
        }
        interfaceC2780Zc = this.A00.A05;
        if (interfaceC2780Zc != null) {
            interfaceC2780Zc2 = this.A00.A05;
            interfaceC2780Zc2.ACr();
        }
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2783Zf
    public final void A9c() {
        C2512Ok c2512Ok;
        C2512Ok c2512Ok2;
        C2512Ok c2512Ok3;
        C3218gi c3218gi;
        c2512Ok = this.A00.A04;
        if (c2512Ok == null) {
            A54();
            if (A02[0].charAt(15) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "E4Sw3glaT0j7tztglKcmJ4X";
            strArr[3] = "i6sG1P4DTWmVPFfNkRQLKmp";
            return;
        }
        AbstractC2781Zd.A03(this.A00);
        c2512Ok2 = this.A00.A04;
        if (c2512Ok2.A02() != null) {
            AbstractC2781Zd abstractC2781Zd = this.A00;
            c2512Ok3 = this.A00.A04;
            abstractC2781Zd.A0H(c2512Ok3.A02());
        } else {
            this.A00.A0F();
        }
        c3218gi = this.A00.A07;
        if (C2668Up.A2Z(c3218gi)) {
            this.A00.performAccessibilityAction(128, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2783Zf
    public final void AAp() {
        C2508Og c2508Og;
        C2511Oj c2511Oj;
        C3218gi c3218gi;
        C2508Og c2508Og2;
        String str;
        c2508Og = this.A00.A06;
        if (!TextUtils.isEmpty(c2508Og.A0I())) {
            X6 x6 = new X6();
            c3218gi = this.A00.A07;
            c2508Og2 = this.A00.A06;
            Uri A00 = XB.A00(c2508Og2.A0I());
            str = this.A00.A0B;
            X6.A0O(x6, c3218gi, A00, str);
        }
        c2511Oj = this.A00.A03;
        c2511Oj.A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2783Zf
    public final void AAq() {
        InterfaceC2760Yi interfaceC2760Yi;
        C2508Og c2508Og;
        C2511Oj c2511Oj;
        C3218gi c3218gi;
        C2508Og c2508Og2;
        String str;
        InterfaceC2760Yi interfaceC2760Yi2;
        this.A00.A0P();
        interfaceC2760Yi = this.A00.A0A;
        if (interfaceC2760Yi != null) {
            interfaceC2760Yi2 = this.A00.A0A;
            interfaceC2760Yi2.AFi(true);
        }
        c2508Og = this.A00.A06;
        if (!TextUtils.isEmpty(c2508Og.A0C())) {
            X6 x6 = new X6();
            c3218gi = this.A00.A07;
            c2508Og2 = this.A00.A06;
            Uri A00 = XB.A00(c2508Og2.A0C());
            str = this.A00.A0B;
            X6.A0O(x6, c3218gi, A00, str);
        }
        c2511Oj = this.A00.A03;
        c2511Oj.A06();
        this.A00.A0E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2783Zf
    public final void AEr(EnumC2510Oi enumC2510Oi) {
        EnumC2510Oi enumC2510Oi2;
        C2508Og c2508Og;
        C2512Ok A0B;
        C2508Og c2508Og2;
        C2508Og c2508Og3;
        AbstractC2781Zd.A02(this.A00);
        this.A00.A02 = enumC2510Oi;
        enumC2510Oi2 = this.A00.A02;
        if (enumC2510Oi2 != EnumC2510Oi.A04) {
            AbstractC2781Zd abstractC2781Zd = this.A00;
            if (A02[0].charAt(15) != 'S') {
                String[] strArr = A02;
                strArr[6] = "aVWWA7RlXQ4WxwD1lKH3adLgfY6YTeho";
                strArr[5] = "uW2I9G42iXHj1OU85KkNtz4HKFKkrOfh";
                c2508Og2 = abstractC2781Zd.A06;
                A0B = c2508Og2.A0B();
            } else {
                c2508Og = abstractC2781Zd.A06;
                A0B = c2508Og.A0B();
            }
        } else {
            c2508Og3 = this.A00.A06;
            A0B = c2508Og3.A0A();
        }
        AbstractC2781Zd abstractC2781Zd2 = this.A00;
        String[] strArr2 = A02;
        if (strArr2[6].charAt(11) == strArr2[5].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A02;
        strArr3[1] = "uGU0gkKbqe2rkd9hIKZj6BU";
        strArr3[3] = "Cw3GzUJKwEhWx9AKZcDfceI";
        abstractC2781Zd2.A0H(A0B);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2783Zf
    public final void AF4(C2512Ok c2512Ok) {
        C2511Oj c2511Oj;
        AbstractC2781Zd.A02(this.A00);
        c2511Oj = this.A00.A03;
        c2511Oj.A07(c2512Ok.A01());
        if (!c2512Ok.A05().isEmpty()) {
            AbstractC2781Zd abstractC2781Zd = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "wullz3k0Ma2cYDBinBI95xBWIfHYuzlI";
            strArr2[5] = "wkJ6jlNGXVBBqnzofRVuEUhlZdNAnE5y";
            abstractC2781Zd.A0H(c2512Ok);
            return;
        }
        this.A00.A0G(c2512Ok);
    }
}
