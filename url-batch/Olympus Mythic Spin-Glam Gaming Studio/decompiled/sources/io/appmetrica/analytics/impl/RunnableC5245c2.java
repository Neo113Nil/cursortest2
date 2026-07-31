package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC5245c2 implements Runnable {
    public final /* synthetic */ InterfaceC5749ve a;
    public final /* synthetic */ Q7 b;

    public RunnableC5245c2(C5296e2 c5296e2, Q7 q7) {
        this.a = c5296e2;
        this.b = q7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.consume(this.b);
    }
}
