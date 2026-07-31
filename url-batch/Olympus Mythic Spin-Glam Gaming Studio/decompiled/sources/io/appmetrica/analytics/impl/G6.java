package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class G6 implements InterfaceC5437je {
    public final SystemTimeProvider a = new SystemTimeProvider();

    public final long a(@NotNull I0 i0) {
        long j = i0.e;
        return j > 0 ? j : this.a.currentTimeMillis();
    }
}
