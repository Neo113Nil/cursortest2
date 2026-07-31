package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.u1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC5710u1 implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5710u1(C5736v1 c5736v1, Throwable th) {
        this.b = c5736v1;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).reportUnhandledException(this.a);
    }
}
