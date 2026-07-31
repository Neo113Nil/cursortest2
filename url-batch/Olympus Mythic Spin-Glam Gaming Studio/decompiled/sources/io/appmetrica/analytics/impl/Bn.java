package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class Bn implements Ck, P9 {
    public final InterfaceC5280db a;
    public final InterfaceC5239bm b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public Bn(@NotNull InterfaceC5280db interfaceC5280db, @NotNull InterfaceC5239bm interfaceC5239bm) {
        this.a = interfaceC5280db;
        this.b = interfaceC5239bm;
        Objects.toString(interfaceC5280db.a());
    }

    public void a() {
    }

    public final void b() {
        if (this.c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.c.get()) {
            return;
        }
        f();
        a();
    }

    @NotNull
    public final InterfaceC5280db d() {
        return this.a;
    }

    public final boolean e() {
        return this.c.get();
    }

    public void f() {
        this.b.a();
    }

    public void g() {
    }

    @Override // io.appmetrica.analytics.impl.Ck
    public final void onCreate() {
        this.c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.Ck
    public final void onDestroy() {
        if (this.c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(@NotNull NetworkTask networkTask) {
        Ka.I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }
}
