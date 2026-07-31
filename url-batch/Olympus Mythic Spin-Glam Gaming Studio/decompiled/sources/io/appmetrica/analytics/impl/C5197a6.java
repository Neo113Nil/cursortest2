package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.a6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5197a6 implements Z5 {
    public final C5818y5 a;

    public C5197a6(@NotNull C5818y5 c5818y5) {
        this.a = c5818y5;
    }

    @Override // io.appmetrica.analytics.impl.Z5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final C5818y5 getAdRevenueProcessorsHolder() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.a;
    }
}
