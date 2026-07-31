package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5541ne implements ServiceNetworkContext {
    public final C5740v5 a;
    public final String b = new C5733uo().a();
    public final Ml c = new Ml();

    public C5541ne(@NotNull Context context) {
        this.a = new C5740v5(new F5(context), new Ci(Ka.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final IExecutionPolicy getExecutionPolicy() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SimpleNetworkApi getNetworkApi() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return Ka.I.z();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    @NotNull
    public final String getUserAgent() {
        return this.b;
    }
}
