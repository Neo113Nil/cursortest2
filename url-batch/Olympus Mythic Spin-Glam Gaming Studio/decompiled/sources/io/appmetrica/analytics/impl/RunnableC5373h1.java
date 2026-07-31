package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC5373h1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5736v1 c;

    public RunnableC5373h1(C5736v1 c5736v1, String str, String str2) {
        this.c = c5736v1;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0 b0 = this.c.a;
        String str = this.a;
        String str2 = this.b;
        b0.getClass();
        A0.c().putAppEnvironmentValue(str, str2);
    }
}
