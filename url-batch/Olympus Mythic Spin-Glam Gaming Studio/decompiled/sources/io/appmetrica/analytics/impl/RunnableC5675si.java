package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.si, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC5675si implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5701ti c;

    public RunnableC5675si(C5701ti c5701ti, String str, String str2) {
        this.c = c5701ti;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.c;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportEvent(this.a, this.b);
    }
}
