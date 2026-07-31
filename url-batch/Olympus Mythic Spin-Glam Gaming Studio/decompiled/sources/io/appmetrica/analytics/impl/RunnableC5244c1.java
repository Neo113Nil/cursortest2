package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC5244c1 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkListener a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5244c1(C5736v1 c5736v1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.b = c5736v1;
        this.a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        A0 a0 = A0.e;
        a0.f().a(this.a);
    }
}
