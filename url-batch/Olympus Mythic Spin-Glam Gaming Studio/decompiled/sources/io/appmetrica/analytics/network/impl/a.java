package io.appmetrica.analytics.network.impl;

import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.Response;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes13.dex */
public final class a extends Call {
    @Override // io.appmetrica.analytics.networkapi.Call
    @NotNull
    public final Response execute() {
        return new Response.Builder(new IllegalStateException("This is dummy call")).build();
    }
}
