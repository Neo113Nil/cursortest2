package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02167e {
    public static final AtomicReference<C0888Ym> A00 = new AtomicReference<>();

    public static C0888Ym A00() {
        return A00.get();
    }

    public static void A01(C0888Ym c0888Ym) {
        if (c0888Ym == null) {
            return;
        }
        AbstractC02157d.A00(A00, null, c0888Ym);
    }
}
