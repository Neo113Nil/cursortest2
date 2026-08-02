package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAd;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZB implements C6U {
    public final List<C1007bK> A00;
    public final /* synthetic */ ZA A01;

    public ZB(ZA za, List<C1007bK> list) {
        this.A01 = za;
        this.A00 = list;
    }

    private void A00() {
        C01785m c01785m;
        C01785m c01785m2;
        C01785m c01785m3;
        C0889Yn c0889Yn;
        C01785m c01785m4;
        C01785m c01785m5;
        C0889Yn c0889Yn2;
        c01785m = this.A01.A00;
        c01785m.A05(true);
        c01785m2 = this.A01.A00;
        c01785m2.A02();
        c01785m3 = this.A01.A00;
        c01785m3.A03(0);
        for (C1007bK c1007bK : this.A00) {
            c0889Yn = this.A01.A01;
            V5 A0K = V2.A0K();
            c01785m4 = this.A01.A00;
            V2 v2 = new V2(c0889Yn, c1007bK, null, A0K, c01785m4.A01());
            if (v2.A0y() != null && v2.A0y().A0F() != null) {
                ((AbstractC0968ah) v2.A0y().A0F()).A00(v2);
            }
            c01785m5 = this.A01.A00;
            c0889Yn2 = this.A01.A01;
            c01785m5.A04(new NativeAd(c0889Yn2, v2));
        }
        KK.A00(new ZC(this));
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        A00();
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A00();
    }
}
