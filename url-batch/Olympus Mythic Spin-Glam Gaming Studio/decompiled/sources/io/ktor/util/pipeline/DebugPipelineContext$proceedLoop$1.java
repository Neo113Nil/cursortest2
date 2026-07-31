package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugPipelineContext.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {79}, m = "proceedLoop")
/* loaded from: classes8.dex */
final class DebugPipelineContext$proceedLoop$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DebugPipelineContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugPipelineContext$proceedLoop$1(DebugPipelineContext debugPipelineContext, Continuation continuation) {
        super(continuation);
        this.this$0 = debugPipelineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object proceedLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        proceedLoop = this.this$0.proceedLoop(this);
        return proceedLoop;
    }
}
