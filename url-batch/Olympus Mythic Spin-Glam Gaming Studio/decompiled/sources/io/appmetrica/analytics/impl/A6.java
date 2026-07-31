package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class A6 implements InterfaceC5305eb {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC5305eb
    public final void a(@Nullable Throwable th, @NotNull X x) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5305eb) it.next()).a(th, x);
        }
    }

    public final void a(@NotNull InterfaceC5305eb... interfaceC5305ebArr) {
        CollectionsKt.addAll(this.a, interfaceC5305ebArr);
    }

    public final void a(@NotNull List<? extends InterfaceC5305eb> list) {
        this.a.addAll(list);
    }

    public final void a() {
        this.a.clear();
    }
}
