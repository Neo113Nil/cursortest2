package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C3214ge c3214ge) {
        if (A00 == null) {
            A00 = new OO(c3214ge);
        }
        return A00;
    }

    public static void A01(C3214ge c3214ge) {
        if (AbstractC2671Us.A0F(c3214ge)) {
            A03(c3214ge);
        }
    }

    public static void A02(C3214ge c3214ge) {
        if (AbstractC2671Us.A0E(c3214ge)) {
            A03(c3214ge);
        }
    }

    public static void A03(C3214ge c3214ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C3317iN(c3214ge));
        }
    }
}
