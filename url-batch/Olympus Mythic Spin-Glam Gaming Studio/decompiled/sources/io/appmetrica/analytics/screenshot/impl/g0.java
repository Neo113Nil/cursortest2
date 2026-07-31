package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.internal.config.RemoteScreenshotConfig;

/* loaded from: classes4.dex */
public final class g0 {
    public final boolean a;
    public final h0 b;

    public g0(boolean z, h0 h0Var) {
        this.a = z;
        this.b = h0Var;
    }

    public final h0 a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        return "ServiceSideRemoteScreenshotConfig(enabled=" + this.a + ", config=" + this.b + ')';
    }

    public g0() {
        this(new RemoteScreenshotConfig());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(RemoteScreenshotConfig remoteScreenshotConfig) {
        this(r0, r3 != null ? new h0(r3) : null);
        boolean enabled = remoteScreenshotConfig.getEnabled();
        T config = remoteScreenshotConfig.getConfig();
    }
}
