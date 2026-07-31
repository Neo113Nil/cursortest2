package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ni, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5545ni implements Runnable {
    public final /* synthetic */ X a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5545ni(C5701ti c5701ti, X x) {
        this.b = c5701ti;
        this.a = x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).a(this.a);
    }
}
