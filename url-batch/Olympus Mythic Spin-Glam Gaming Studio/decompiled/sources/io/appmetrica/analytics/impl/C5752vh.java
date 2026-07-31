package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5752vh extends AbstractC5249c6 {
    public final C5532n5 b;
    public final InterfaceC5726uh c;
    public final T3 d;

    public C5752vh(@NonNull C5532n5 c5532n5, @NonNull InterfaceC5726uh interfaceC5726uh) {
        this(c5532n5, interfaceC5726uh, new T3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC5249c6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5804xh load(@NonNull C5223b6 c5223b6) {
        C5804xh c5804xh = (C5804xh) super.load(c5223b6);
        c5804xh.m = ((C5674sh) c5223b6.componentArguments).a;
        c5804xh.r = this.b.t.a();
        c5804xh.w = this.b.q.a();
        C5674sh c5674sh = (C5674sh) c5223b6.componentArguments;
        c5804xh.d = c5674sh.b;
        c5804xh.e = c5674sh.c;
        c5804xh.f = c5674sh.d;
        c5804xh.i = c5674sh.e;
        c5804xh.g = c5674sh.f;
        c5804xh.h = c5674sh.g;
        Boolean valueOf = Boolean.valueOf(c5674sh.h);
        InterfaceC5726uh interfaceC5726uh = this.c;
        c5804xh.j = valueOf;
        c5804xh.k = interfaceC5726uh;
        C5674sh c5674sh2 = (C5674sh) c5223b6.componentArguments;
        c5804xh.v = c5674sh2.j;
        C5783wm c5783wm = c5223b6.a;
        C4 c4 = c5783wm.n;
        c5804xh.n = c4.a;
        Se se = c5783wm.s;
        if (se != null) {
            c5804xh.s = se.a;
            c5804xh.t = se.b;
        }
        c5804xh.o = c4.b;
        c5804xh.q = c5783wm.e;
        c5804xh.p = c5783wm.k;
        T3 t3 = this.d;
        Map<String, String> map = c5674sh2.i;
        Q3 f = Ka.I.f();
        t3.getClass();
        c5804xh.u = T3.a(map, c5783wm, f);
        c5804xh.x = this.b.v.e.keySet();
        return c5804xh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C5804xh(this.b);
    }

    public C5752vh(C5532n5 c5532n5, InterfaceC5726uh interfaceC5726uh, T3 t3) {
        super(c5532n5.getContext(), c5532n5.a().c());
        this.b = c5532n5;
        this.c = interfaceC5726uh;
        this.d = t3;
    }

    @NonNull
    public final C5804xh a() {
        return new C5804xh(this.b);
    }
}
