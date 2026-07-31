package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes4.dex */
public final class i0 {
    public final boolean a;
    public final long b;

    public i0(boolean z, long j) {
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
        return "ServiceSideServiceCaptorConfig(enabled=" + this.a + ", delaySeconds=" + this.b + ')';
    }

    public i0(X x) {
        this(x.b(), x.a());
    }
}
