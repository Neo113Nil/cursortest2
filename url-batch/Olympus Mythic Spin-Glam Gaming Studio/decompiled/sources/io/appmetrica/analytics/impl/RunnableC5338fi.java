package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC5338fi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5338fi(C5701ti c5701ti, boolean z) {
        this.b = c5701ti;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).setDataSendingEnabled(this.a);
    }
}
