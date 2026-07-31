package io.appmetrica.analytics.impl;

/* loaded from: classes13.dex */
public final class Y0 implements Runnable {
    public final /* synthetic */ C5736v1 a;

    public Y0(C5736v1 c5736v1) {
        this.a = c5736v1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5736v1.a(this.a).sendEventsBuffer();
    }
}
