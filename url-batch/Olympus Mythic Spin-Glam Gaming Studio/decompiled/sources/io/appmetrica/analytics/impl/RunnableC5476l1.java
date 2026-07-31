package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5476l1 implements Runnable {
    public final /* synthetic */ AnrListener a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5476l1(C5736v1 c5736v1, AnrListener anrListener) {
        this.b = c5736v1;
        this.a = anrListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).a(this.a);
    }
}
