package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.networkapi.NetworkClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class c extends NetworkClient.Builder {
    @NotNull
    public final b a() {
        return new b(getSettings());
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient.Builder
    public final NetworkClient build() {
        return new b(getSettings());
    }

    @NotNull
    public final String toString() {
        return "Dummy Network Client Builder";
    }
}
