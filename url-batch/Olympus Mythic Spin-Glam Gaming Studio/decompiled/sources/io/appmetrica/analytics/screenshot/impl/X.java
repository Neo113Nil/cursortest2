package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes3.dex */
public final class X {
    public final boolean a;
    public final long b;

    public X(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        return "ServiceCaptorConfig(enabled=" + this.a + ", delaySeconds=" + this.b + ')';
    }

    public X() {
        this(new M().a, new M().b);
    }
}
