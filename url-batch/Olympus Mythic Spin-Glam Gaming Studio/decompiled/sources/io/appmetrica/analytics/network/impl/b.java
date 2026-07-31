package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class b extends NetworkClient {
    public b(@NotNull NetworkClientSettings networkClientSettings) {
        super(networkClientSettings);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    @NotNull
    public final Call newCall(@NotNull Request request) {
        return new a();
    }
}
