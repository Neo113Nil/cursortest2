package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes6.dex */
public final class Dk {
    public final SystemTimeProvider a;
    public final long b;

    public Dk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.a = systemTimeProvider;
        this.b = systemTimeProvider.currentTimeMillis();
    }
}
