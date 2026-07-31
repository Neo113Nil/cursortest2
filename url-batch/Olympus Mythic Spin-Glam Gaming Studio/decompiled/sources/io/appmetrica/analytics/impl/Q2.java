package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class Q2 implements ModulePreferences {
    public final Ol a;

    public Q2(@NotNull Ol ol) {
        this.a = ol;
    }

    @NotNull
    public abstract String a(@NotNull String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void flushAsync() {
        this.a.flushAsync();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@NotNull String str, boolean z) {
        return ((Sd) this.a).a(str, z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@NotNull String str, int i) {
        return ((Sd) this.a).a(str, i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@NotNull String str, long j) {
        return ((Sd) this.a).a(a(str), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @Nullable
    public final String getString(@NotNull String str, @Nullable String str2) {
        return ((Sd) this.a).a(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@NotNull String str, boolean z) {
        Sd sd = (Sd) this.a;
        sd.d(sd.g(a(str)), z);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@NotNull String str, int i) {
        Sd sd = (Sd) this.a;
        sd.d(sd.g(str), i);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@NotNull String str, long j) {
        Sd sd = (Sd) this.a;
        sd.d(sd.g(a(str)), j);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@NotNull String str, @Nullable String str2) {
        Sd sd = (Sd) this.a;
        sd.d(sd.g(a(str)), str2);
    }
}
