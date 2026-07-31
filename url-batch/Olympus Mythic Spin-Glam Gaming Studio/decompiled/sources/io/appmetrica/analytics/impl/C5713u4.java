package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5713u4 implements ClientStorageProvider {
    public final Ol a;

    public C5713u4(@NotNull Ol ol) {
        this.a = ol;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C5644rd(str, this.a);
    }
}
