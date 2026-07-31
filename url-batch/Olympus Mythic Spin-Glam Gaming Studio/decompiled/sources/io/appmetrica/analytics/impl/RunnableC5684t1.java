package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC5684t1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ C5736v1 d;

    public RunnableC5684t1(C5736v1 c5736v1, String str, String str2, Throwable th) {
        this.d = c5736v1;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.d).reportError(this.a, this.b, this.c);
    }
}
