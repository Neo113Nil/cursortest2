package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5184b implements y {
    public final ServiceContext a;

    public C5184b(@NotNull ServiceContext serviceContext) {
        this.a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.y
    public final boolean a() {
        return this.a.getActiveNetworkTypeProvider().getNetworkType(this.a.getContext()) == NetworkType.CELL;
    }
}
