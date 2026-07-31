package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5839z0 implements Runnable {
    public final /* synthetic */ A0 a;

    public RunnableC5839z0(A0 a0) {
        this.a = a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5661s4.l().c.a().executeDelayed(new RunnableC5788x1(this.a.a), TimeUnit.SECONDS.toMillis(5L));
    }
}
