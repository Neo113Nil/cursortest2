package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5580p1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5580p1(C5736v1 c5736v1, String str) {
        this.b = c5736v1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).reportEvent(this.a);
    }
}
