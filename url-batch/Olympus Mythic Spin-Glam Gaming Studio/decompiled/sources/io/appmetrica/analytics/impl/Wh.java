package io.appmetrica.analytics.impl;

/* loaded from: classes13.dex */
public final class Wh implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ C5701ti b;

    public Wh(C5701ti c5701ti, Throwable th) {
        this.b = c5701ti;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportUnhandledException(this.a);
    }
}
