package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TP extends RD {
    public final /* synthetic */ B3 A00;

    public TP(B3 b3) {
        this.A00 = b3;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        C0548Lg c0548Lg;
        C0548Lg c0548Lg2;
        RE re;
        C0548Lg c0548Lg3;
        J2 j2;
        AbstractC0992b5 abstractC0992b5;
        AbstractC0992b5 abstractC0992b52;
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        AbstractC0992b5 abstractC0992b53;
        MC mc;
        MC mc2;
        InterfaceC0577Mj interfaceC0577Mj;
        c0548Lg = this.A00.A0B;
        if (!c0548Lg.A07()) {
            c0548Lg2 = this.A00.A0B;
            c0548Lg2.A05();
            C0602Ni c0602Ni = new C0602Ni();
            re = this.A00.A0H;
            C0602Ni A03 = c0602Ni.A03(re);
            c0548Lg3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(c0548Lg3).A05();
            j2 = this.A00.A08;
            abstractC0992b5 = this.A00.A06;
            j2.A9g(abstractC0992b5.A12(), A05);
            abstractC0992b52 = this.A00.A06;
            C1U A0y = abstractC0992b52.A0y();
            c0889Yn = this.A00.A07;
            C1U.A07(A0y, c0889Yn);
            c0889Yn2 = this.A00.A07;
            c0889Yn2.A0E().A2k();
            abstractC0992b53 = this.A00.A06;
            C2O.A00(abstractC0992b53.A0N());
            mc = this.A00.A0C;
            if (mc != null) {
                mc2 = this.A00.A0C;
                interfaceC0577Mj = this.A00.A0D;
                mc2.A43(interfaceC0577Mj.A7B());
            }
        }
    }
}
