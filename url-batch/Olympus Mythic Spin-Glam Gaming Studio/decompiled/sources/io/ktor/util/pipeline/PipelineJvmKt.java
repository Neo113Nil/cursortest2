package io.ktor.util.pipeline;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: PipelineJvm.kt */
/* loaded from: classes6.dex */
public abstract class PipelineJvmKt {
    public static final Object pipelineStartCoroutineUninterceptedOrReturn(Function3 interceptor, PipelineContext context, Object subject, Continuation continuation) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(interceptor, 3)).invoke(context, subject, continuation);
    }
}
