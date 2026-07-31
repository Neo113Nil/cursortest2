package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes6.dex */
public final class Bl implements Ko {
    public final B0 a;

    public Bl(@NonNull B0 b0) {
        this.a = b0;
    }

    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable Void r3) {
        this.a.getClass();
        return B0.a() ? new Io(this, true, "") : new Io(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final Io a() {
        return a((Void) null);
    }
}
