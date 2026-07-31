package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5418il implements InterfaceC5590pb {
    public final C5532n5 a;
    public final C5444jl b;
    public final C5574ol c;
    public final C5393hl d = C5393hl.a(EnumC5600pl.BACKGROUND).b().a();

    public C5418il(@NotNull C5532n5 c5532n5, @NotNull C5444jl c5444jl) {
        this.a = c5532n5;
        this.b = c5444jl;
        this.c = new C5574ol(c5532n5.h(), M2.g);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590pb
    @Nullable
    public final Uk a() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5590pb
    @NotNull
    public final Uk a(@NotNull Vk vk) {
        String a;
        boolean b;
        long a2 = this.b.a();
        C5574ol c5574ol = this.c;
        c5574ol.a(C5574ol.f, Long.valueOf(a2));
        c5574ol.a(C5574ol.d, Long.valueOf(vk.a));
        c5574ol.a(C5574ol.h, Long.valueOf(vk.a));
        c5574ol.a(C5574ol.i, Long.valueOf(vk.b));
        c5574ol.a(C5574ol.g, 0L);
        c5574ol.a(C5574ol.j, Boolean.FALSE);
        c5574ol.a();
        C5250c7 c5250c7 = this.a.e;
        EnumC5600pl enumC5600pl = EnumC5600pl.BACKGROUND;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(vk.b);
        C5496ll c5496ll = vk.c;
        c5250c7.getClass();
        K7 k7 = new K7(null, 1, null);
        C5804xh c5804xh = (C5804xh) c5250c7.e.k.a();
        Long valueOf = Long.valueOf(a2);
        Long valueOf2 = Long.valueOf(seconds);
        if (c5496ll == null || (a = c5496ll.a) == null) {
            a = L7.a(c5804xh);
        }
        Long valueOf3 = Long.valueOf(AbstractC5215ao.a());
        C5573ok c5573ok = AbstractC5547nk.a;
        synchronized (c5573ok) {
            b = c5573ok.b.b(true);
        }
        c5250c7.a(k7.fromModel(new J7(valueOf, enumC5600pl, a, new I7(valueOf2, valueOf3, Boolean.valueOf(b)))));
        Wk wk = new Wk(this.d);
        wk.h = this.c.c.a(C5574ol.j);
        wk.g = this.c.c.b(C5574ol.g);
        wk.d = this.c.c.b(C5574ol.h);
        wk.e = this.c.c.b(C5574ol.i);
        wk.c = this.c.c.b(C5574ol.f);
        wk.i = this.c.c.b(C5574ol.d);
        wk.a = this.c.c.b(C5574ol.e);
        return new Uk(this.a, this.c, new Xk(wk), new SystemTimeProvider());
    }
}
