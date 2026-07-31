package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonHooks.kt */
/* loaded from: classes15.dex */
public final class SetupRequest implements ClientHook {
    public static final SetupRequest INSTANCE = new SetupRequest();

    private SetupRequest() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function2 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getBefore(), new SetupRequest$install$1(handler, null));
    }
}
