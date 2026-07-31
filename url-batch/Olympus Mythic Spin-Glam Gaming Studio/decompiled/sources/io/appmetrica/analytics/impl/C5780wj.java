package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5780wj implements InterfaceC5765w4 {
    public final Kg a;

    public C5780wj(@Nullable Kg kg) {
        this.a = kg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5765w4
    public final void a() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5765w4
    public final void a(@NonNull C5326f6 c5326f6, @NonNull G4 g4) {
        Kg kg = this.a;
        if (kg != null) {
            kg.a(c5326f6, g4);
        }
    }
}
