package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5493li implements Runnable {
    public final /* synthetic */ C5421io a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5493li(C5701ti c5701ti, C5421io c5421io) {
        this.b = c5701ti;
        this.a = c5421io;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).a(this.a);
    }
}
