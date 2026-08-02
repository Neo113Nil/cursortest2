package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1012bP extends RD {
    public final /* synthetic */ C1010bN A00;

    public C1012bP(C1010bN c1010bN) {
        this.A00 = c1010bN;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        C0548Lg c0548Lg;
        C0548Lg c0548Lg2;
        EQ eq;
        C0998bB c0998bB;
        EQ eq2;
        FV fv;
        RE re;
        C0548Lg c0548Lg3;
        FV fv2;
        J2 j2;
        FV fv3;
        FV fv4;
        FV fv5;
        C1U A0y;
        EQ eq3;
        RE re2;
        c0548Lg = this.A00.A06;
        if (!c0548Lg.A07()) {
            c0548Lg2 = this.A00.A06;
            c0548Lg2.A05();
            eq = this.A00.A04;
            InterfaceC1029bg A0E = eq.A0E();
            c0998bB = this.A00.A02;
            A0E.A3k(c0998bB != null);
            eq2 = this.A00.A04;
            eq2.A0E().A2k();
            fv = this.A00.A03;
            C2O.A00(fv.A0N());
            C0602Ni c0602Ni = new C0602Ni();
            re = this.A00.A0B;
            C0602Ni A03 = c0602Ni.A03(re);
            c0548Lg3 = this.A00.A06;
            C0602Ni A02 = A03.A02(c0548Lg3);
            fv2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(fv2.A0O()).A05();
            j2 = this.A00.A05;
            fv3 = this.A00.A03;
            j2.A9g(fv3.A12(), A05);
            fv4 = this.A00.A03;
            if (fv4 == null) {
                A0y = null;
            } else {
                fv5 = this.A00.A03;
                A0y = fv5.A0y();
            }
            eq3 = this.A00.A04;
            C1U.A07(A0y, eq3);
            re2 = this.A00.A0B;
            re2.A0V();
        }
    }
}
