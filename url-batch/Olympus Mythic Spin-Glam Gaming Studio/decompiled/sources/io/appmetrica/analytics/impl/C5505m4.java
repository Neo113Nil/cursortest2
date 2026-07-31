package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.m4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5505m4 extends AbstractC5307ed {
    public final C5594pf a;

    public C5505m4(@NotNull C5594pf c5594pf) {
        this.a = c5594pf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5307ed
    public final void a(int i) {
        this.a.c(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5307ed
    public final int b() {
        return (int) this.a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5307ed
    @NotNull
    public final SparseArray<InterfaceC5282dd> c() {
        return new SparseArray<>();
    }
}
