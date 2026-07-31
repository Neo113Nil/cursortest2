package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.wc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5773wc implements InterfaceC5791x4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5791x4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final L4 a(@NotNull Context context, @NotNull C5688t5 c5688t5, @NotNull C5350g4 c5350g4, @NotNull G4 g4) {
        N4 n4;
        M4 m4 = new M4(c5350g4.b);
        O4 o4 = new O4();
        synchronized (c5688t5) {
            n4 = (N4) c5688t5.a(m4, g4, o4, c5688t5.b);
        }
        return new L4(context, n4, g4);
    }
}
