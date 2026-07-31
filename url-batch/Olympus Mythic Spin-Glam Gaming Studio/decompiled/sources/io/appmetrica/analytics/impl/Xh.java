package io.appmetrica.analytics.impl;

/* loaded from: classes12.dex */
public final class Xh implements Runnable {
    public final /* synthetic */ C5701ti a;

    public Xh(C5701ti c5701ti) {
        this.a = c5701ti;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.a;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).resumeSession();
    }
}
