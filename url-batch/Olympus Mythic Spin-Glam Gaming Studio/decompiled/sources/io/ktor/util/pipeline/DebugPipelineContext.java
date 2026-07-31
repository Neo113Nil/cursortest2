package io.ktor.util.pipeline;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugPipelineContext.kt */
/* loaded from: classes8.dex */
public final class DebugPipelineContext extends PipelineContext {
    private final CoroutineContext coroutineContext;
    private int index;
    private final List interceptors;
    private Object subject;

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugPipelineContext(Object context, List interceptors, Object subject, CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.interceptors = interceptors;
        this.coroutineContext = coroutineContext;
        this.subject = subject;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object getSubject() {
        return this.subject;
    }

    public void setSubject(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.subject = obj;
    }

    public void finish() {
        this.index = -1;
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceedWith(Object obj, Continuation continuation) {
        setSubject(obj);
        return proceed(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object proceed(Continuation continuation) {
        int i = this.index;
        if (i < 0) {
            return getSubject();
        }
        if (i >= this.interceptors.size()) {
            finish();
            return getSubject();
        }
        return proceedLoop(continuation);
    }

    @Override // io.ktor.util.pipeline.PipelineContext
    public Object execute$ktor_utils(Object obj, Continuation continuation) {
        this.index = 0;
        setSubject(obj);
        return proceed(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object proceedLoop(Continuation continuation) {
        DebugPipelineContext$proceedLoop$1 debugPipelineContext$proceedLoop$1;
        Object coroutine_suspended;
        int i;
        int i2;
        Function3 function3;
        Object subject;
        if (continuation instanceof DebugPipelineContext$proceedLoop$1) {
            debugPipelineContext$proceedLoop$1 = (DebugPipelineContext$proceedLoop$1) continuation;
            int i3 = debugPipelineContext$proceedLoop$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                debugPipelineContext$proceedLoop$1.label = i3 - Integer.MIN_VALUE;
                Object obj = debugPipelineContext$proceedLoop$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debugPipelineContext$proceedLoop$1.label;
                if (i == 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                do {
                    i2 = this.index;
                    if (i2 == -1) {
                        List list = this.interceptors;
                        if (i2 >= list.size()) {
                            finish();
                        } else {
                            function3 = (Function3) list.get(i2);
                            this.index = i2 + 1;
                            subject = getSubject();
                            debugPipelineContext$proceedLoop$1.label = 1;
                        }
                    }
                    return getSubject();
                } while (function3.invoke(this, subject, debugPipelineContext$proceedLoop$1) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        debugPipelineContext$proceedLoop$1 = new DebugPipelineContext$proceedLoop$1(this, continuation);
        Object obj2 = debugPipelineContext$proceedLoop$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debugPipelineContext$proceedLoop$1.label;
        if (i == 0) {
        }
        ResultKt.throwOnFailure(obj2);
        do {
            i2 = this.index;
            if (i2 == -1) {
            }
            return getSubject();
        } while (function3.invoke(this, subject, debugPipelineContext$proceedLoop$1) != coroutine_suspended);
        return coroutine_suspended;
    }
}
