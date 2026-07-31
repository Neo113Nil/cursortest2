package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5234bh implements InterfaceC5689t6 {
    public final Context a;
    public final C5635r4 b;
    public final IHandlerExecutor c = Ka.k().w().f();

    public C5234bh(@NotNull Context context, @NotNull C5635r4 c5635r4) {
        this.a = context;
        this.b = c5635r4;
    }

    public final void a(@NotNull C5326f6 c5326f6, @Nullable Bundle bundle) {
        if (c5326f6.m()) {
            return;
        }
        this.c.execute(new RunnableC5830yh(this.a, c5326f6, bundle, this.b));
    }

    public final void a(@NotNull C5350g4 c5350g4, @NotNull C5326f6 c5326f6, @NotNull G4 g4) {
        this.b.a(c5350g4, g4).a(c5326f6, g4);
        this.b.a(c5350g4.b, c5350g4.c, c5350g4.d);
    }
}
