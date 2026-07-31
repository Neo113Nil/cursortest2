package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Pl implements InterfaceC5763w2 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5763w2
    @Nullable
    public final C5811xo a(@NonNull C5759vo c5759vo, @NonNull C5811xo c5811xo) {
        ((HashMap) c5759vo.a.get(c5811xo.b)).put(new String(c5811xo.a), c5811xo);
        return c5811xo;
    }
}
