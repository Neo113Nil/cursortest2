package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5696td implements ModuleSelfReporter {
    public final C5340fk a = AbstractC5840z1.a();
    public final int b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable Throwable th) {
        C5340fk c5340fk = this.a;
        c5340fk.getClass();
        c5340fk.a(new Ej(str, th));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str) {
        C5340fk c5340fk = this.a;
        ModuleEvent build = ModuleEvent.newBuilder(this.b).withName(str).build();
        c5340fk.getClass();
        c5340fk.a(new Uj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable String str2) {
        this.a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        C5340fk c5340fk = this.a;
        ModuleEvent build = ModuleEvent.newBuilder(this.b).withName(str).withAttributes(map).build();
        c5340fk.getClass();
        c5340fk.a(new Uj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable String str2) {
        C5340fk c5340fk = this.a;
        ModuleEvent build = ModuleEvent.newBuilder(this.b).withName(str).withValue(str2).build();
        c5340fk.getClass();
        c5340fk.a(new Uj(build));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i, @NotNull String str, @Nullable String str2) {
        C5340fk c5340fk = this.a;
        ModuleEvent build = ModuleEvent.newBuilder(i).withName(str).withValue(str2).build();
        c5340fk.getClass();
        c5340fk.a(new Uj(build));
    }
}
