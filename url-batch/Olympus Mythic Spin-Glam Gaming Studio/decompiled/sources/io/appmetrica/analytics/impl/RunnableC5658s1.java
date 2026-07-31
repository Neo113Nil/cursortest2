package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC5658s1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C5736v1 c;

    public RunnableC5658s1(C5736v1 c5736v1, String str, Throwable th) {
        this.c = c5736v1;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.c).reportError(this.a, this.b);
    }
}
