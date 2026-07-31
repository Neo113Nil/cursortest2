package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class P0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5736v1 b;

    public P0(C5736v1 c5736v1, String str) {
        this.b = c5736v1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c().b.a(this.a, false);
    }
}
