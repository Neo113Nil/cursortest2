package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC5624qi implements Runnable {
    public final /* synthetic */ C5701ti a;

    public RunnableC5624qi(C5701ti c5701ti) {
        this.a = c5701ti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.a;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).clearAppEnvironment();
    }
}
