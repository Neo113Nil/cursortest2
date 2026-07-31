package kotlin.coroutines.intrinsics;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes14.dex */
public abstract class IntrinsicsKt__IntrinsicsJvmKt {
    public static Object wrapWithContinuationImpl(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion)));
    }

    public static Object wrapWithContinuationImpl(Function3 function3, Object obj, Object obj2, Continuation completion) {
        Intrinsics.checkNotNullParameter(function3, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(obj, obj2, createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(DebugProbesKt.probeCoroutineCreated(completion)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation createCoroutineUnintercepted(final Function1 function1, Continuation completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        final Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(completion);
        if (function1 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function1).create(probeCoroutineCreated);
        }
        final CoroutineContext context = probeCoroutineCreated.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(probeCoroutineCreated, function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(probeCoroutineCreated);
                    this.$this_createCoroutineUnintercepted$inlined = function1;
                    Intrinsics.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected Object invokeSuspend(Object result) {
                    int i = this.label;
                    if (i == 0) {
                        this.label = 1;
                        ResultKt.throwOnFailure(result);
                        Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                        return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                    }
                    if (i == 1) {
                        this.label = 2;
                        ResultKt.throwOnFailure(result);
                        return result;
                    }
                    throw new IllegalStateException("This coroutine had already completed");
                }
            };
        }
        return new ContinuationImpl(probeCoroutineCreated, context, function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(probeCoroutineCreated, context);
                this.$this_createCoroutineUnintercepted$inlined = function1;
                Intrinsics.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object result) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    ResultKt.throwOnFailure(result);
                    Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
                }
                if (i == 1) {
                    this.label = 2;
                    ResultKt.throwOnFailure(result);
                    return result;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation createCoroutineUnintercepted(final Function2 function2, final Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        final Continuation probeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(completion);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(obj, probeCoroutineCreated);
        }
        final CoroutineContext context = probeCoroutineCreated.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(probeCoroutineCreated, function2, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                final /* synthetic */ Object $receiver$inlined;
                final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
                private int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(probeCoroutineCreated);
                    this.$this_createCoroutineUnintercepted$inlined = function2;
                    this.$receiver$inlined = obj;
                    Intrinsics.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected Object invokeSuspend(Object result) {
                    int i = this.label;
                    if (i == 0) {
                        this.label = 1;
                        ResultKt.throwOnFailure(result);
                        Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                    }
                    if (i == 1) {
                        this.label = 2;
                        ResultKt.throwOnFailure(result);
                        return result;
                    }
                    throw new IllegalStateException("This coroutine had already completed");
                }
            };
        }
        return new ContinuationImpl(probeCoroutineCreated, context, function2, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            final /* synthetic */ Object $receiver$inlined;
            final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
            private int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(probeCoroutineCreated, context);
                this.$this_createCoroutineUnintercepted$inlined = function2;
                this.$receiver$inlined = obj;
                Intrinsics.checkNotNull(probeCoroutineCreated, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object result) {
                int i = this.label;
                if (i == 0) {
                    this.label = 1;
                    ResultKt.throwOnFailure(result);
                    Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                    return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
                }
                if (i == 1) {
                    this.label = 2;
                    ResultKt.throwOnFailure(result);
                    return result;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
        };
    }

    public static Continuation intercepted(Continuation continuation) {
        Continuation intercepted;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? continuation : intercepted;
    }

    private static final Continuation createSimpleCoroutineForSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt(final Continuation continuation) {
        final CoroutineContext context = continuation.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(continuation);
                    Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                protected Object invokeSuspend(Object result) {
                    ResultKt.throwOnFailure(result);
                    return result;
                }
            };
        }
        return new ContinuationImpl(continuation, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuation, context);
                Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            protected Object invokeSuspend(Object result) {
                ResultKt.throwOnFailure(result);
                return result;
            }
        };
    }
}
