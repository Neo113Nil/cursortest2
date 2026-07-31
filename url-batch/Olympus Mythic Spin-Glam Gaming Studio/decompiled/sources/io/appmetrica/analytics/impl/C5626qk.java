package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5626qk implements ServiceComponentModuleConfig {
    public final F4 a;

    public C5626qk(@NotNull F4 f4) {
        this.a = f4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.a.m, Boolean.TRUE)).booleanValue();
    }
}
