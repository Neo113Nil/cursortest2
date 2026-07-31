package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class S7 implements AskForPermissionStrategyModuleProvider {
    public final C5645re a = new C5645re();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.a;
    }
}
