package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponsePipeline;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KtorCallContexts.kt */
/* loaded from: classes11.dex */
public final class TransformResponseBodyHook implements ClientHook {
    public static final TransformResponseBodyHook INSTANCE = new TransformResponseBodyHook();

    private TransformResponseBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function5 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.getResponsePipeline().intercept(HttpResponsePipeline.Phases.getTransform(), new TransformResponseBodyHook$install$1(handler, null));
    }
}
