package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class N5 implements Z8, InterfaceC5510m9 {
    public final C5250c7 a;
    public final AtomicLong b;

    public N5(@NotNull C5250c7 c5250c7) {
        this.a = c5250c7;
        this.b = new AtomicLong(c5250c7.a(AbstractC5707to.a()));
        c5250c7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5510m9
    public final void a() {
        this.b.set(this.a.a(AbstractC5707to.a));
    }

    @Override // io.appmetrica.analytics.impl.Z8
    public final boolean b() {
        return this.b.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5510m9
    public final void b(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC5707to.a.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.b.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5510m9
    public final void a(@NotNull List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC5707to.a.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        this.b.addAndGet(i);
    }
}
