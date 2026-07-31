package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5693ta implements D6 {
    public final SystemTimeProvider a = new SystemTimeProvider();

    public final long a(@NotNull Fb fb) {
        long j = fb.k;
        return j > 0 ? j : this.a.currentTimeMillis();
    }
}
