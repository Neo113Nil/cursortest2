package io.appmetrica.analytics.adrevenue.ironsource.v9.internal;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class a implements AdRevenueCollector {
    public final /* synthetic */ IronSourceV9ClientModuleEntryPoint a;

    public a(IronSourceV9ClientModuleEntryPoint ironSourceV9ClientModuleEntryPoint) {
        this.a = ironSourceV9ClientModuleEntryPoint;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final boolean getEnabled() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.b;
        return atomicBoolean.get();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final String getSourceIdentifier() {
        return "ironsource";
    }
}
