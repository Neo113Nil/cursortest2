package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class Uh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C5701ti c;

    public Uh(C5701ti c5701ti, String str, Throwable th) {
        this.c = c5701ti;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.c;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportError(this.a, this.b);
    }
}
