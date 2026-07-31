package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5488ld implements ModuleClientExecutorProvider {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return C5661s4.l().c.a();
    }
}
