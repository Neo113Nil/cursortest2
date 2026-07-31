package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class T {
    public final C5868e a;
    public final X b;
    public final C5879p c;

    public T(C5868e c5868e, X x, C5879p c5879p) {
        this.a = c5868e;
        this.b = x;
        this.c = c5879p;
    }

    public final C5868e a() {
        return this.a;
    }

    public final C5879p b() {
        return this.c;
    }

    public final X c() {
        return this.b;
    }

    public final String toString() {
        return "ScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    public T() {
        this(new C5868e(), new X(), new C5879p());
    }
}
