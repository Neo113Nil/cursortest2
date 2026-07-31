package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ri, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC5649ri implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5701ti b;

    public RunnableC5649ri(C5701ti c5701ti, String str) {
        this.b = c5701ti;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.b;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).reportEvent(this.a);
    }
}
