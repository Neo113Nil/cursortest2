package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class SD extends KT {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SA A02;
    public final /* synthetic */ RB A03;

    public SD(SA sa, RB rb, int i, int i2) {
        this.A02 = sa;
        this.A03 = rb;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C0889Yn c0889Yn;
        Handler handler;
        C02508r c02508r;
        C0889Yn c0889Yn2;
        C02508r c02508r2;
        C0568Ma c0568Ma;
        Handler handler2;
        C0889Yn c0889Yn3;
        C02508r c02508r3;
        Handler handler3;
        C0889Yn c0889Yn4;
        C0889Yn c0889Yn5;
        C02508r c02508r4;
        O8 o8;
        Handler handler4;
        C0889Yn c0889Yn6;
        C0889Yn c0889Yn7;
        Handler handler5;
        C02508r c02508r5;
        C02508r c02508r6;
        C0665Pt c0665Pt;
        C0889Yn c0889Yn8;
        C02508r c02508r7;
        if (this.A03 == RB.A07) {
            this.A02.A0L(J9.A0q);
            c0889Yn8 = this.A02.A0A;
            c0889Yn8.A0E().A38();
            c02508r7 = this.A02.A0B;
            c02508r7.A02(SA.A0C());
            return;
        }
        if (this.A03 == RB.A03) {
            this.A02.A0L(J9.A0l);
            this.A02.A03 = true;
            c02508r6 = this.A02.A0B;
            c0665Pt = SA.A0G;
            c02508r6.A02(c0665Pt);
            this.A02.A0K(this.A00);
            return;
        }
        RB rb = this.A03;
        RB rb2 = RB.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (rb == rb2) {
            this.A02.A0L(J9.A0k);
            c0889Yn7 = this.A02.A0A;
            c0889Yn7.A0E().A30();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c02508r5 = this.A02.A0B;
            int i = this.A01;
            c02508r5.A02(new C9H(i, i));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == RB.A0A) {
            c0889Yn4 = this.A02.A0A;
            if (C0478Ih.A1W(c0889Yn4)) {
                c0889Yn6 = this.A02.A0A;
                c0889Yn6.A0A().ADg();
            }
            this.A02.A0L(J9.A0o);
            c0889Yn5 = this.A02.A0A;
            c0889Yn5.A0E().A3F();
            c02508r4 = this.A02.A0B;
            o8 = SA.A0H;
            c02508r4.A02(o8);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == RB.A05) {
            this.A02.A0L(J9.A0n);
            c0889Yn3 = this.A02.A0A;
            c0889Yn3.A0E().A34();
            c02508r3 = this.A02.A0B;
            final int i2 = this.A00;
            c02508r3.A02(new AbstractC0667Pv(i2) { // from class: com.facebook.ads.redexgen.X.98
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == RB.A04) {
            this.A02.A0L(J9.A0m);
            c0889Yn2 = this.A02.A0A;
            c0889Yn2.A0E().A31();
            c02508r2 = this.A02.A0B;
            c0568Ma = SA.A0K;
            c02508r2.A02(c0568Ma);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == RB.A09) {
            this.A02.A0L(J9.A0k);
            c0889Yn = this.A02.A0A;
            c0889Yn.A0E().A3A();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c02508r = this.A02.A0B;
            c02508r.A02(new C9H(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
