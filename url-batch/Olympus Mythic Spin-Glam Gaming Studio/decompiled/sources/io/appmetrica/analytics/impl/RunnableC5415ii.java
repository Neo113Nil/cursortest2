package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5415ii implements Runnable {
    public final /* synthetic */ ModuleEvent a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5415ii(C5701ti c5701ti, ModuleEvent moduleEvent) {
        this.b = c5701ti;
        this.a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportEvent(this.a);
    }
}
