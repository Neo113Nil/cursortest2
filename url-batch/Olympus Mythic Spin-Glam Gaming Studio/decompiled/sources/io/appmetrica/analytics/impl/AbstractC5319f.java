package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC5319f implements InterfaceC5765w4 {
    public final Context a;
    public final Kg b;

    public AbstractC5319f(@NonNull Context context, @NonNull Kg kg) {
        this.a = context.getApplicationContext();
        this.b = kg;
        kg.a(this);
        Ka.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5765w4
    public final void a(@NonNull C5326f6 c5326f6, @NonNull G4 g4) {
        b(c5326f6, g4);
    }

    @NonNull
    public final Kg b() {
        return this.b;
    }

    public abstract void b(@NonNull C5326f6 c5326f6, @NonNull G4 g4);

    @NonNull
    public final Context c() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5765w4
    public final void a() {
        this.b.b(this);
        Ka.I.m().a(this);
    }
}
