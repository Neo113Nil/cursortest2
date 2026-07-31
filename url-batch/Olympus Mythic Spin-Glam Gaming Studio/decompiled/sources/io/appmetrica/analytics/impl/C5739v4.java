package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5739v4 {
    public final SystemTimeProvider a;

    public C5739v4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.a.elapsedRealtime();
    }

    public C5739v4(SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }
}
