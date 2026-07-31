package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Ph implements InterfaceC5791x4 {
    public final InterfaceC5558o5 a;

    public Ph(@NotNull InterfaceC5558o5 interfaceC5558o5) {
        this.a = interfaceC5558o5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5791x4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Jg a(@NotNull Context context, @NotNull C5688t5 c5688t5, @NotNull C5350g4 c5350g4, @NotNull G4 g4) {
        Kg kg;
        C5351g5 c5351g5 = new C5351g5(c5350g4.b, c5350g4.a);
        Lg lg = new Lg(this.a);
        synchronized (c5688t5) {
            kg = (Kg) c5688t5.a(c5351g5, g4, lg, c5688t5.a);
        }
        return new Jg(context, kg);
    }
}
