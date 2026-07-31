package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ C5736v1 b;

    public S0(C5736v1 c5736v1, boolean z) {
        this.b = c5736v1;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0 b0 = this.b.a;
        boolean z = this.a;
        b0.getClass();
        A0.c().a(z);
    }
}
