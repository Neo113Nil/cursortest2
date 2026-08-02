package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1054cH {
    public static C1054cH A02 = null;
    public final C1066cT A00;
    public final C1064cR A01;

    public C1054cH(AbstractC1070cY abstractC1070cY, C1064cR c1064cR, C1066cT c1066cT) {
        this.A00 = c1066cT;
        this.A01 = c1064cR;
        abstractC1070cY.A02(new H2(c1064cR));
    }

    public static C1054cH A00(AbstractC1070cY abstractC1070cY, InterfaceC1074cc interfaceC1074cc, HB hb) {
        C1054cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C1066cT c1066cT = new C1066cT();
        return new C1054cH(abstractC1070cY, new C1064cR(interfaceC1074cc, new HL(), hb, c1066cT, new Handler(Looper.getMainLooper())), c1066cT);
    }

    public final void A01(cX cXVar) {
        this.A01.A09(cXVar);
    }

    public final void A02(InterfaceC1068cV interfaceC1068cV) {
        this.A01.A0A(interfaceC1068cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C1072ca c1072ca) {
        this.A00.A02(dspViewableNode, c1072ca);
    }
}
