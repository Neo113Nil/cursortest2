package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5441ji implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ C5701ti c;

    public RunnableC5441ji(C5701ti c5701ti, String str, byte[] bArr) {
        this.c = c5701ti;
        this.a = str;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.c;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).setSessionExtra(this.a, this.b);
    }
}
