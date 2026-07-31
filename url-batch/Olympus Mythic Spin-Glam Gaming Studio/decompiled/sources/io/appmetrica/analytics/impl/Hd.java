package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Hd {
    public final B0 a;
    public final C5852zd b;
    public final Od c;
    public final IHandlerExecutor d;

    public Hd() {
        B0 d = C5661s4.l().d();
        this.a = d;
        this.b = new C5852zd(d);
        this.c = new Od();
        this.d = C5661s4.l().g().a();
    }

    public static final InterfaceC5383hb a(Hd hd) {
        hd.a.getClass();
        A0 a0 = A0.e;
        Intrinsics.checkNotNull(a0);
        Fc i = a0.f().i();
        Intrinsics.checkNotNull(i);
        return i.a;
    }
}
