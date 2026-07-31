package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C2541Pp A00;
    public final YU A01;

    public YS(C3218gi c3218gi, Executor executor, C2649Tw c2649Tw) {
        this.A01 = new YU(c3218gi);
        this.A00 = new C2541Pp(executor, c2649Tw, c3218gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C3218gi c3218gi, Executor executor, C2649Tw c2649Tw) {
        if (!C2668Up.A1c(c3218gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c3218gi, executor, c2649Tw);
            A02.A00();
        } else {
            A02.A02(c2649Tw);
        }
    }

    private void A02(C2649Tw c2649Tw) {
        this.A00.A07(c2649Tw);
    }
}
