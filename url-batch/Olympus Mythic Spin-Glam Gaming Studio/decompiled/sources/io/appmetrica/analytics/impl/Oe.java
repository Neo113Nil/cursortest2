package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Oe implements InterfaceC5510m9, Pe {
    public final C5250c7 a;
    public final AtomicLong b;

    public Oe(@NotNull C5250c7 c5250c7) {
        this.a = c5250c7;
        this.b = new AtomicLong(c5250c7.a());
        c5250c7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5510m9
    public final void a(@NotNull List<Integer> list) {
        this.b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5510m9
    public final void b(@NotNull List<Integer> list) {
        this.b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5510m9
    public final void a() {
        this.b.set(this.a.a());
    }

    public final long b() {
        return this.b.get();
    }
}
