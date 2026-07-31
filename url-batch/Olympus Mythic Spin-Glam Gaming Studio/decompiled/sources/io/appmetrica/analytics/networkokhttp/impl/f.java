package io.appmetrica.analytics.networkokhttp.impl;

import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class f extends NetworkClient {
    public final OkHttpClient a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull NetworkClientSettings networkClientSettings) {
        this(networkClientSettings, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    @NotNull
    public final Call newCall(@NotNull Request request) {
        return new c(this.a, request, getSettings());
    }

    @NotNull
    public final String toString() {
        return "OkHttpNetworkClient(settings=" + getSettings() + ')';
    }

    public /* synthetic */ f(NetworkClientSettings networkClientSettings, OkHttpClient okHttpClient, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkClientSettings, (i & 2) != 0 ? e.a(networkClientSettings) : okHttpClient);
    }

    public f(@NotNull NetworkClientSettings networkClientSettings, @NotNull OkHttpClient okHttpClient) {
        super(networkClientSettings);
        this.a = okHttpClient;
    }
}
