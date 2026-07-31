package io.appmetrica.analytics.impl;

/* loaded from: classes13.dex */
public final class Vh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ C5701ti d;

    public Vh(C5701ti c5701ti, String str, String str2, Throwable th) {
        this.d = c5701ti;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.d;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportError(this.a, this.b, this.c);
    }
}
