package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC5218b1 implements Runnable {
    public final /* synthetic */ DeferredDeeplinkParametersListener a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5218b1(C5736v1 c5736v1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.b = c5736v1;
        this.a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.getClass();
        A0 a0 = A0.e;
        a0.f().a(this.a);
    }
}
