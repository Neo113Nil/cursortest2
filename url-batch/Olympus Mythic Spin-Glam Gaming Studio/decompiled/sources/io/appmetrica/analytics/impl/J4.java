package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public final class J4 extends W2 {
    public J4(@NonNull InterfaceC5763w2 interfaceC5763w2) {
        super(interfaceC5763w2);
    }

    @Override // io.appmetrica.analytics.impl.W2
    public final C5811xo a(@NonNull C5759vo c5759vo, @Nullable C5811xo c5811xo, @NonNull InterfaceC5737v2 interfaceC5737v2) {
        if (c5811xo == null || c5811xo.c.b) {
            return this.a.a(c5759vo, ((Ud) interfaceC5737v2).a());
        }
        c5811xo.c = new C5837yo();
        return c5811xo;
    }
}
