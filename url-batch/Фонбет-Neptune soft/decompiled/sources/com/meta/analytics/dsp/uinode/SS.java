package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SS extends RD {
    public final /* synthetic */ C9P A00;

    public SS(C9P c9p) {
        this.A00 = c9p;
    }

    @Override // com.meta.analytics.dsp.uinode.RD
    public final void A03() {
        C0548Lg c0548Lg;
        C0548Lg c0548Lg2;
        String str;
        RE re;
        C0548Lg c0548Lg3;
        AbstractC0992b5 abstractC0992b5;
        J2 j2;
        String str2;
        AbstractC0992b5 abstractC0992b52;
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        AbstractC0992b5 abstractC0992b53;
        c0548Lg = this.A00.A0E;
        if (!c0548Lg.A07()) {
            C9P c9p = this.A00;
            c0548Lg2 = c9p.A0E;
            c9p.setImpressionRecordingFlag(c0548Lg2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C0602Ni c0602Ni = new C0602Ni();
                re = this.A00.A09;
                C0602Ni A03 = c0602Ni.A03(re);
                c0548Lg3 = this.A00.A0E;
                C0602Ni A02 = A03.A02(c0548Lg3);
                abstractC0992b5 = ((UL) ((UL) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC0992b5.A0O()).A05();
                j2 = ((UL) ((UL) this.A00)).A0C;
                str2 = this.A00.A0A;
                j2.A9g(str2, A05);
                abstractC0992b52 = ((UL) ((UL) this.A00)).A0A;
                C1U A0y = abstractC0992b52.A0y();
                c0889Yn = this.A00.A0D;
                C1U.A07(A0y, c0889Yn);
                c0889Yn2 = this.A00.A0D;
                c0889Yn2.A0E().A2k();
                abstractC0992b53 = this.A00.A03;
                C2O.A00(abstractC0992b53.A0N());
            }
        }
    }
}
