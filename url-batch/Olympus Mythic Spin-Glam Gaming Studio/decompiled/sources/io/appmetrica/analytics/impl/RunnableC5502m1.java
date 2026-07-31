package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC5502m1 implements Runnable {
    public final /* synthetic */ ExternalAttribution a;
    public final /* synthetic */ C5736v1 b;

    public RunnableC5502m1(C5736v1 c5736v1, ExternalAttribution externalAttribution) {
        this.b = c5736v1;
        this.a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.b).a(this.a);
    }
}
