package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpCallValidator.kt */
/* loaded from: classes11.dex */
public final class ReceiveError implements ClientHook {
    public static final ReceiveError INSTANCE = new ReceiveError();

    private ReceiveError() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, Function3 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        PipelinePhase pipelinePhase = new PipelinePhase("BeforeReceive");
        client.getResponsePipeline().insertPhaseBefore(HttpResponsePipeline.Phases.getReceive(), pipelinePhase);
        client.getResponsePipeline().intercept(pipelinePhase, new ReceiveError$install$1(handler, null));
    }
}
