package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5619qd implements ModuleEventServiceHandlerContext {
    public final ModulePreferences a;
    public final ModulePreferences b;
    public final ModuleEventServiceHandlerReporter c;

    public C5619qd(@NotNull ModulePreferences modulePreferences, @NotNull ModulePreferences modulePreferences2, @NotNull ModuleEventServiceHandlerReporter moduleEventServiceHandlerReporter) {
        this.a = modulePreferences;
        this.b = modulePreferences2;
        this.c = moduleEventServiceHandlerReporter;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModuleEventServiceHandlerReporter getEventReporter() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getLegacyModulePreferences() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext
    @NotNull
    public final ModulePreferences getModulePreferences() {
        return this.a;
    }
}
