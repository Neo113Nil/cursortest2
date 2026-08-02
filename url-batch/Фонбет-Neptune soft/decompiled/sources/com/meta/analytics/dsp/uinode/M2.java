package com.meta.analytics.dsp.uinode;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class M2 {
    public static M2 A02;
    public final UY A00;
    public final M4 A01;

    public M2(C0889Yn c0889Yn, Executor executor, C8S c8s) {
        this.A01 = new M4(c0889Yn);
        this.A00 = new UY(executor, c8s, c0889Yn);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C0889Yn c0889Yn, Executor executor, C8S c8s) {
        if (!C0478Ih.A1C(c0889Yn)) {
            return;
        }
        M2 m2 = A02;
        if (m2 == null) {
            M2 m22 = new M2(c0889Yn, executor, c8s);
            A02 = m22;
            m22.A00();
            return;
        }
        m2.A02(c8s);
    }

    private void A02(C8S c8s) {
        this.A00.A07(c8s);
    }
}
