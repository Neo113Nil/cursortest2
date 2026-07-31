package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BodyProgress.kt */
/* loaded from: classes5.dex */
public final class AfterRenderHook implements ClientHook {
    public static final AfterRenderHook INSTANCE = new AfterRenderHook();

    private AfterRenderHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function3 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        PipelinePhase pipelinePhase = new PipelinePhase("ObservableContent");
        client.getRequestPipeline().insertPhaseAfter(HttpRequestPipeline.Phases.getRender(), pipelinePhase);
        client.getRequestPipeline().intercept(pipelinePhase, new AfterRenderHook$install$1(handler, null));
    }
}
