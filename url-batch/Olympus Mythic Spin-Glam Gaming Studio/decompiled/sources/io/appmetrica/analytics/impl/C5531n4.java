package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.n4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5531n4 implements ModuleServiceConfig {
    public final SdkIdentifiers a;
    public final Object b;

    public C5531n4(@NotNull SdkIdentifiers sdkIdentifiers, Object obj) {
        this.a = sdkIdentifiers;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.a;
    }
}
