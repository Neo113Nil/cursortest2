package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestPipeline;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpPlainText.kt */
/* loaded from: classes10.dex */
public final class RenderRequestHook implements ClientHook {
    public static final RenderRequestHook INSTANCE = new RenderRequestHook();

    private RenderRequestHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function3 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getRender(), new RenderRequestHook$install$1(handler, null));
    }
}
