package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class V0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5736v1 b;

    public V0(C5736v1 c5736v1, String str) {
        this.b = c5736v1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0 b0 = this.b.a;
        String str = this.a;
        b0.getClass();
        A0.c().setUserProfileID(str);
    }
}
