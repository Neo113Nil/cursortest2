package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes10.dex */
public final class Lg implements InterfaceC5354g8 {
    public final InterfaceC5558o5 a;

    public Lg(@NonNull InterfaceC5558o5 interfaceC5558o5) {
        this.a = interfaceC5558o5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5354g8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Kg a(@NonNull Context context, @NonNull C5351g5 c5351g5, @NonNull G4 g4) {
        return new Kg(context, c5351g5, g4, this.a, new C5377h5(), Yl.a());
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC5558o5 a() {
        return this.a;
    }
}
