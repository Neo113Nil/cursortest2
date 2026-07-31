package kotlin;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: DeepRecursive.kt */
/* loaded from: classes6.dex */
final class DeepRecursiveScopeImpl extends DeepRecursiveScope implements Continuation {
    private Continuation cont;
    private Function3 function;
    private Object result;
    private Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepRecursiveScopeImpl(Function3 block, Object obj) {
        super(null);
        Object obj2;
        Intrinsics.checkNotNullParameter(block, "block");
        this.function = block;
        this.value = obj;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = this;
        obj2 = DeepRecursiveKt.UNDEFINED_RESULT;
        this.result = obj2;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.cont = null;
        this.result = obj;
    }

    @Override // kotlin.DeepRecursiveScope
    public Object callRecursive(Object obj, Continuation continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = continuation;
        this.value = obj;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    public final Object runCallLoop() {
        Object obj;
        Object obj2;
        while (true) {
            Object obj3 = this.result;
            Continuation continuation = this.cont;
            if (continuation != null) {
                obj = DeepRecursiveKt.UNDEFINED_RESULT;
                if (!Result.m8025equalsimpl0(obj, obj3)) {
                    obj2 = DeepRecursiveKt.UNDEFINED_RESULT;
                    this.result = obj2;
                    continuation.resumeWith(obj3);
                } else {
                    try {
                        Function3 function3 = this.function;
                        Object obj4 = this.value;
                        Object wrapWithContinuationImpl = !(function3 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function3, this, obj4, continuation) : ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(this, obj4, continuation);
                        if (wrapWithContinuationImpl != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            continuation.resumeWith(Result.m8023constructorimpl(wrapWithContinuationImpl));
                        }
                    } catch (Throwable th) {
                        Result.Companion companion = Result.INSTANCE;
                        continuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(th)));
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj3);
                return obj3;
            }
        }
    }
}
