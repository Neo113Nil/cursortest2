package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class Hc implements InterfaceC5791x4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5791x4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ic a(@NotNull Context context, @NotNull C5688t5 c5688t5, @NotNull C5350g4 c5350g4, @NotNull G4 g4) {
        Kg kg;
        Jc jc = new Jc(c5350g4.b, c5350g4.a);
        Lg lg = new Lg(new Lc());
        synchronized (c5688t5) {
            kg = (Kg) c5688t5.a(jc, g4, lg, c5688t5.a);
        }
        return new Ic(context, kg);
    }
}
