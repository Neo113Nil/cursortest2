package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class Aj implements InterfaceC5791x4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC5791x4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5780wj a(@NotNull Context context, @NotNull C5688t5 c5688t5, @NotNull C5350g4 c5350g4, @NotNull G4 g4) {
        Kg kg;
        C5351g5 c5351g5 = new C5351g5(c5350g4.b, c5350g4.a);
        synchronized (c5688t5) {
            kg = (Kg) c5688t5.a.get(c5351g5.toString());
        }
        return new C5780wj(kg);
    }
}
