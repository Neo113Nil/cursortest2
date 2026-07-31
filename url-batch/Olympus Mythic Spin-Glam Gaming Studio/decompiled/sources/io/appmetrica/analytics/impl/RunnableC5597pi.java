package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5597pi implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5701ti c;

    public RunnableC5597pi(C5701ti c5701ti, String str, String str2) {
        this.c = c5701ti;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5701ti c5701ti = this.c;
        C5701ti.a(c5701ti.a, c5701ti.d, c5701ti.e).putAppEnvironmentValue(this.a, this.b);
    }
}
