package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC5345g implements InterfaceC5590pb {
    public final C5532n5 a;
    public final C5444jl b;
    public final C5574ol c;
    public final C5393hl d;
    public final InterfaceC5512mb e;
    public final SystemTimeProvider f;

    public AbstractC5345g(@NonNull C5532n5 c5532n5, @NonNull C5444jl c5444jl, @NonNull C5574ol c5574ol, @NonNull C5393hl c5393hl, @NonNull InterfaceC5512mb interfaceC5512mb, @NonNull SystemTimeProvider systemTimeProvider) {
        this.a = c5532n5;
        this.b = c5444jl;
        this.c = c5574ol;
        this.d = c5393hl;
        this.e = interfaceC5512mb;
        this.f = systemTimeProvider;
    }

    public final Xk b() {
        Wk wk = new Wk(this.d);
        wk.h = this.c.c.a(C5574ol.j);
        wk.g = this.c.c.b(C5574ol.g);
        wk.d = this.c.c.b(C5574ol.h);
        wk.e = this.c.c.b(C5574ol.i);
        wk.c = this.c.c.b(C5574ol.f);
        wk.i = this.c.c.b(C5574ol.d);
        wk.a = this.c.c.b(C5574ol.e);
        wk.j = this.c.c.a(C5574ol.k);
        return new Xk(wk);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590pb
    @Nullable
    public final Uk a() {
        if (this.c.i()) {
            return new Uk(this.a, this.c, b(), this.f);
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590pb
    @NonNull
    public final Uk a(@NonNull Vk vk) {
        boolean b;
        if (this.c.i()) {
            this.e.reportEvent("create session with non-empty storage");
        }
        C5532n5 c5532n5 = this.a;
        C5574ol c5574ol = this.c;
        long a = this.b.a();
        C5574ol c5574ol2 = this.c;
        c5574ol2.a(C5574ol.f, Long.valueOf(a));
        c5574ol2.a(C5574ol.d, Long.valueOf(vk.a));
        c5574ol2.a(C5574ol.h, Long.valueOf(vk.a));
        c5574ol2.a(C5574ol.i, Long.valueOf(vk.b));
        c5574ol2.a(C5574ol.g, 0L);
        c5574ol2.a(C5574ol.j, Boolean.TRUE);
        c5574ol2.a();
        C5250c7 c5250c7 = this.a.e;
        EnumC5600pl enumC5600pl = this.d.a;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(vk.b);
        c5250c7.getClass();
        K7 k7 = new K7(null, 1, null);
        C5804xh c5804xh = (C5804xh) c5250c7.e.k.a();
        Long valueOf = Long.valueOf(a);
        Long valueOf2 = Long.valueOf(seconds);
        String a2 = L7.a(c5804xh);
        Long valueOf3 = Long.valueOf(AbstractC5215ao.a());
        C5573ok c5573ok = AbstractC5547nk.a;
        synchronized (c5573ok) {
            b = c5573ok.b.b(true);
        }
        c5250c7.a(k7.fromModel(new J7(valueOf, enumC5600pl, a2, new I7(valueOf2, valueOf3, Boolean.valueOf(b)))));
        return new Uk(c5532n5, c5574ol, b(), new SystemTimeProvider());
    }
}
