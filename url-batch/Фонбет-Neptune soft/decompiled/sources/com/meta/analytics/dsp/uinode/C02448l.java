package com.meta.analytics.dsp.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8l, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02448l {
    public static C02448l A00 = new C02448l();

    public static C02448l A00() {
        return A00;
    }

    public final YI A01(C02177f c02177f, boolean z) {
        return new YI(c02177f, z, new C6S());
    }

    public final Map<String, String> A02(C02177f c02177f) {
        try {
            return A01(c02177f, false).A05();
        } catch (Throwable th) {
            c02177f.A07().A3c(th);
            return C02368d.A01(c02177f);
        }
    }
}
