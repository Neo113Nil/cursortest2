package com.moloco.sdk.acm.services;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h {

    @NotNull
    public final i a;

    @NotNull
    public final AtomicLong b;

    public h(@NotNull i timeProviderService) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.a = timeProviderService;
        this.b = new AtomicLong(0L);
    }

    public final long a() {
        return this.a.invoke() - this.b.get();
    }

    @NotNull
    public final AtomicLong b() {
        return this.b;
    }

    public final void c() {
        this.b.set(this.a.invoke());
    }
}
