package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02609c extends Exception {
    public final int A00;
    public final int A01;

    public C02609c(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.A01 = i;
        this.A00 = i2;
    }

    public static C02609c A00(IOException iOException) {
        return new C02609c(0, null, iOException, -1);
    }

    public static C02609c A01(Exception exc, int i) {
        return new C02609c(1, null, exc, i);
    }

    public static C02609c A02(RuntimeException runtimeException) {
        return new C02609c(2, null, runtimeException, -1);
    }
}
