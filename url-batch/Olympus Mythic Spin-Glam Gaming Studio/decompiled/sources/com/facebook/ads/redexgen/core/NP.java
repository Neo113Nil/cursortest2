package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class NP implements InterfaceC3067eG {
    public static byte[] A01;
    public static String[] A02 = {"BHXiYjXxfgjD7yDB", "kPfw5HKETqo8dV", "SlBKzsC69frNfTspgJs5v90302jxH173", "0t7u2eeKUCj5gcxeWZIOCTpidMAeGJtt", "hTXrvsDVbOi3Q9xrUBZOJj7T", "iLbLRTjnBQIJ87KFXaIFUijyWt7EPIGc", "0utayShxEdwMeaV3UZeoWviAuyaBWRmj", "gyVOCm6F1v6TZALkbG"};
    public final /* synthetic */ NO A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A01();
    }

    public NP(NO no) {
        this.A00 = no;
    }

    public /* synthetic */ NP(NO no, OV ov) {
        this(no);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3067eG
    public final void ADX() {
        this.A00.A0W(true, A00(0, 9, 106));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3067eG
    public final void AEA() {
        boolean z;
        AbstractC3383jd abstractC3383jd;
        InterfaceC2759Yh interfaceC2759Yh;
        ZU zu;
        VA va;
        AbstractC3383jd abstractC3383jd2;
        C3069eI c3069eI;
        C3069eI c3069eI2;
        C3218gi c3218gi;
        ZU zu2;
        AbstractC3383jd abstractC3383jd3;
        AbstractC3383jd abstractC3383jd4;
        C3218gi c3218gi2;
        AbstractC3383jd abstractC3383jd5;
        AbstractC3383jd abstractC3383jd6;
        C3218gi c3218gi3;
        C2490No c2490No;
        C3218gi c3218gi4;
        C3218gi c3218gi5;
        z = this.A00.A0f;
        if (!z) {
            abstractC3383jd = this.A00.A0O;
            if (!TextUtils.isEmpty(abstractC3383jd.A2E())) {
                va = this.A00.A0S;
                abstractC3383jd2 = this.A00.A0O;
                String A2E = abstractC3383jd2.A2E();
                C2875b9 c2875b9 = new C2875b9();
                c3069eI = this.A00.A0B;
                C2875b9 A03 = c2875b9.A03(c3069eI.getViewabilityChecker());
                c3069eI2 = this.A00.A0B;
                va.ABJ(A2E, A03.A02(c3069eI2.getTouchDataRecorder()).A05());
                c3218gi = this.A00.A0R;
                C2714Wl A00 = C2714Wl.A00(c3218gi);
                zu2 = this.A00.A0X;
                String A8l = zu2.A8l();
                abstractC3383jd3 = this.A00.A0O;
                A00.A0E(A8l, abstractC3383jd3.A2E());
                abstractC3383jd4 = this.A00.A0O;
                C2482Ng A2A = abstractC3383jd4.A2A();
                c3218gi2 = this.A00.A0R;
                C2482Ng.A07(A2A, c3218gi2);
                abstractC3383jd5 = this.A00.A0O;
                String A0y = abstractC3383jd5.A0y();
                abstractC3383jd6 = this.A00.A0O;
                AbstractC2502Oa.A02(A0y, AbstractC2738Xm.A00(abstractC3383jd6.A10()));
                c3218gi3 = this.A00.A0R;
                c3218gi3.A0F().A3L();
                c2490No = this.A00.A0P;
                if (c2490No.A0c()) {
                    c3218gi4 = this.A00.A0R;
                    c3218gi4.A0F().AES();
                }
            }
            NO no = this.A00;
            String[] strArr = A02;
            if (strArr[5].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            A02[4] = "GzK3XL6hk7idJD";
            interfaceC2759Yh = no.A0W;
            zu = this.A00.A0X;
            interfaceC2759Yh.A4j(zu.A8G());
            return;
        }
        c3218gi5 = this.A00.A0R;
        c3218gi5.A0F().AET();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3067eG
    public final void AEh() {
        InterfaceC2759Yh interfaceC2759Yh;
        ZU zu;
        interfaceC2759Yh = this.A00.A0W;
        zu = this.A00.A0X;
        interfaceC2759Yh.A4j(zu.A81());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3067eG
    public final void AFQ() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3067eG
    public final void AGg() {
        InterfaceC2759Yh interfaceC2759Yh;
        interfaceC2759Yh = this.A00.A0W;
        interfaceC2759Yh.ADJ(15);
    }
}
