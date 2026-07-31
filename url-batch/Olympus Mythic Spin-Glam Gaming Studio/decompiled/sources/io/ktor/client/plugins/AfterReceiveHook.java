package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.statement.HttpReceivePipeline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BodyProgress.kt */
/* loaded from: classes3.dex */
public final class AfterReceiveHook implements ClientHook {
    public static final AfterReceiveHook INSTANCE = new AfterReceiveHook();

    private AfterReceiveHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function2 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.getReceivePipeline().intercept(HttpReceivePipeline.Phases.getAfter(), new AfterReceiveHook$install$1(handler, null));
    }
}
