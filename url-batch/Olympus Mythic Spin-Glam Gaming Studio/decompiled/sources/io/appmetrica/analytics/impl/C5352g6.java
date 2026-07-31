package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.g6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5352g6 extends K4 {
    public C5352g6(@NonNull String str, double d) {
        super(2, str, Double.valueOf(d), new Mb(), new J4(new C5255cc(new D4(100))));
    }

    @Override // io.appmetrica.analytics.impl.K4
    public final void a(@NonNull C5811xo c5811xo) {
        C5863zo c5863zo = c5811xo.d;
        c5863zo.c = ((Double) this.f).doubleValue() + c5863zo.c;
    }
}
