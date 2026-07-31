package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5579p0 implements Runnable {
    public final /* synthetic */ C5631r0 a;

    public RunnableC5579p0(C5631r0 c5631r0) {
        this.a = c5631r0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5631r0 c5631r0 = this.a;
        synchronized (c5631r0) {
            if (c5631r0.a != null && c5631r0.a()) {
                try {
                    c5631r0.d = null;
                    c5631r0.a.unbindService(c5631r0.j);
                } catch (Throwable unused) {
                }
            }
            c5631r0.d = null;
        }
    }
}
