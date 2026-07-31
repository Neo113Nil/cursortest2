package io.appmetrica.analytics.impl;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5843z4 {
    public static InterfaceC5791x4 a(C5350g4 c5350g4) {
        switch (AbstractC5817y4.a[c5350g4.e.ordinal()]) {
            case 1:
                return new C5773wc();
            case 2:
                return new C5806xj();
            case 3:
                return new Aj();
            case 4:
                return new Ph(new Rh());
            case 5:
                return new Ph(new C5443jk());
            case 6:
                return new Hc();
            case 7:
                return new Hc();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
