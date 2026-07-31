package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5607q1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5736v1 c;

    public RunnableC5607q1(C5736v1 c5736v1, String str, String str2) {
        this.c = c5736v1;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.c).reportEvent(this.a, this.b);
    }
}
