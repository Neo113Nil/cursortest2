package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3260hO extends WP {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C3258hM A00;

    public C3260hO(C3258hM c3258hM) {
        this.A00 = c3258hM;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        C2579Rd c2579Rd;
        C2579Rd c2579Rd2;
        C2579Rd c2579Rd3;
        c2579Rd = this.A00.A01;
        if (c2579Rd.A06() != null) {
            c2579Rd2 = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            AdListener A06 = c2579Rd2.A06();
            c2579Rd3 = this.A00.A01;
            A06.onAdClicked(c2579Rd3.A07());
        }
    }
}
