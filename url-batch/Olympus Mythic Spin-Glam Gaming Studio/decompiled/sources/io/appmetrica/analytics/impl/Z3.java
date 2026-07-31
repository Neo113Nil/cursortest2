package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class Z3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(@NotNull Context context) {
        C5269d0 b = C5661s4.l().b();
        b.c.a().executeDelayed(new C5243c0(b, context), b.d);
    }
}
