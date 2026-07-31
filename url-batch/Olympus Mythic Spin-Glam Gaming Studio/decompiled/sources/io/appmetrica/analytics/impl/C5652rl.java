package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5652rl extends W2 {
    public C5652rl(@NonNull InterfaceC5763w2 interfaceC5763w2) {
        super(interfaceC5763w2);
    }

    @Override // io.appmetrica.analytics.impl.W2
    public final C5811xo a(@NonNull C5759vo c5759vo, @Nullable C5811xo c5811xo, @NonNull InterfaceC5737v2 interfaceC5737v2) {
        if (c5811xo != null && !c5811xo.c.b) {
            return null;
        }
        C5811xo a = ((Ud) interfaceC5737v2).a();
        a.c.a = true;
        return this.a.a(c5759vo, a);
    }
}
