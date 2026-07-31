package io.ktor.client.statement;

import io.ktor.util.pipeline.Pipeline;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HttpResponsePipeline.kt */
/* loaded from: classes15.dex */
public final class HttpReceivePipeline extends Pipeline {
    private final boolean developmentMode;
    public static final Phases Phases = new Phases(null);
    private static final PipelinePhase Before = new PipelinePhase("Before");
    private static final PipelinePhase State = new PipelinePhase("State");
    private static final PipelinePhase After = new PipelinePhase("After");

    public /* synthetic */ HttpReceivePipeline(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // io.ktor.util.pipeline.Pipeline
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    /* compiled from: HttpResponsePipeline.kt */
    public static final class Phases {
        public /* synthetic */ Phases(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Phases() {
        }

        public final PipelinePhase getBefore() {
            return HttpReceivePipeline.Before;
        }

        public final PipelinePhase getAfter() {
            return HttpReceivePipeline.After;
        }
    }

    public HttpReceivePipeline(boolean z) {
        super(Before, State, After);
        this.developmentMode = z;
    }
}
