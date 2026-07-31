package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5255cc implements InterfaceC5763w2 {
    public final D4 a;

    public C5255cc(@NonNull D4 d4) {
        this.a = d4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5763w2
    @Nullable
    public final C5811xo a(@NonNull C5759vo c5759vo, @NonNull C5811xo c5811xo) {
        int i = c5759vo.b;
        int i2 = this.a.a;
        if (i == i2) {
            if (((C5811xo) ((HashMap) c5759vo.a.get(c5811xo.b)).get(new String(c5811xo.a))) != null) {
                ((HashMap) c5759vo.a.get(c5811xo.b)).put(new String(c5811xo.a), c5811xo);
            }
        } else if (i < i2) {
            ((HashMap) c5759vo.a.get(c5811xo.b)).put(new String(c5811xo.a), c5811xo);
            c5759vo.b++;
        }
        return c5811xo;
    }
}
