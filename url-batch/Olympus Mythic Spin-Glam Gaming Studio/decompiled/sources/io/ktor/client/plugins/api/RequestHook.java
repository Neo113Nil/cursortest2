package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KtorCallContexts.kt */
/* loaded from: classes5.dex */
public final class RequestHook implements ClientHook {
    public static final RequestHook INSTANCE = new RequestHook();

    private RequestHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function4 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getState(), new RequestHook$install$1(handler, null));
    }
}
