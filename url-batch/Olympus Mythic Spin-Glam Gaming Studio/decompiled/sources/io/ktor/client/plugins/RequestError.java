package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestPipeline;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpCallValidator.kt */
/* loaded from: classes14.dex */
public final class RequestError implements ClientHook {
    public static final RequestError INSTANCE = new RequestError();

    private RequestError() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function3 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getBefore(), new RequestError$install$1(handler, null));
    }
}
