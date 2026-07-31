package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Mk implements ServiceModuleReporterComponentContext {
    public final C5651rk a;
    public final C5626qk b;

    public Mk(@NotNull C5532n5 c5532n5, @NotNull F4 f4) {
        this.a = new C5651rk(c5532n5, null, 2, null);
        this.b = new C5626qk(f4);
    }

    @NotNull
    public final C5626qk a() {
        return this.b;
    }

    @NotNull
    public final C5651rk b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.a;
    }
}
