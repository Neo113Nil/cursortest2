package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ys, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0894Ys extends KT {
    public final /* synthetic */ C6U A00;
    public final /* synthetic */ C6V A01;
    public final /* synthetic */ C01946c A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C0894Ys(C01946c c01946c, ArrayList arrayList, C6V c6v, C6U c6u, ArrayList arrayList2) {
        this.A02 = c01946c;
        this.A03 = arrayList;
        this.A01 = c6v;
        this.A00 = c6u;
        this.A04 = arrayList2;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AtomicBoolean A0D;
        C02177f c02177f;
        Handler handler;
        C02177f c02177f2;
        long j;
        long j2;
        long j3;
        long j4;
        A0D = C01946c.A0D(this.A03);
        c02177f = this.A02.A04;
        if (c02177f instanceof C0889Yn) {
            c02177f2 = this.A02.A04;
            C0889Yn c0889Yn = (C0889Yn) c02177f2;
            if (this.A01.A00 == -1) {
                if (A0D.get()) {
                    C0S A0E = c0889Yn.A0E();
                    j4 = this.A02.A00;
                    A0E.A48(C0547Lf.A01(j4));
                } else {
                    C0S A0E2 = c0889Yn.A0E();
                    j3 = this.A02.A00;
                    A0E2.A46(C0547Lf.A01(j3));
                }
            } else if (A0D.get()) {
                C0S A0E3 = c0889Yn.A0E();
                j2 = this.A02.A00;
                A0E3.A49(C0547Lf.A01(j2), this.A01.A00);
            } else {
                C0S A0E4 = c0889Yn.A0E();
                j = this.A02.A00;
                A0E4.A47(C0547Lf.A01(j), this.A01.A00);
            }
        }
        handler = this.A02.A02;
        handler.post(new C0895Yt(this, A0D));
        C01946c.A0D(this.A04);
    }
}
