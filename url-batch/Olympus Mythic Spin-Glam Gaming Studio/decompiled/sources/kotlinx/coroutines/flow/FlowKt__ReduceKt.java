package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* compiled from: Reduce.kt */
/* loaded from: classes14.dex */
abstract /* synthetic */ class FlowKt__ReduceKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.Symbol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object single(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        T t;
        if (continuation instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) continuation;
            int i2 = flowKt__ReduceKt$single$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$single$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$single$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = NullSurrogateKt.NULL;
                    FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation2) {
                            Ref$ObjectRef ref$ObjectRef3 = Ref$ObjectRef.this;
                            if (ref$ObjectRef3.element != NullSurrogateKt.NULL) {
                                throw new IllegalArgumentException("Flow has more than one element");
                            }
                            ref$ObjectRef3.element = obj2;
                            return Unit.INSTANCE;
                        }
                    };
                    flowKt__ReduceKt$single$1.L$0 = ref$ObjectRef2;
                    flowKt__ReduceKt$single$1.label = 1;
                    if (flow.collect(flowCollector, flowKt__ReduceKt$single$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$single$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                t = ref$ObjectRef.element;
                if (t == NullSurrogateKt.NULL) {
                    return t;
                }
                throw new NoSuchElementException("Flow is empty");
            }
        }
        flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(continuation);
        Object obj2 = flowKt__ReduceKt$single$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$single$1.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.Symbol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object first(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        FlowCollector flowCollector;
        T t;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i2 = flowKt__ReduceKt$first$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$first$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = NullSurrogateKt.NULL;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public Object emit(Object obj2, Continuation continuation2) {
                            Ref$ObjectRef.this.element = obj2;
                            throw new AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$first$1.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$first$1.L$1 = flowCollector2;
                        flowKt__ReduceKt$first$1.label = 1;
                        if (flow.collect(flowCollector2, flowKt__ReduceKt$first$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        flowCollector = flowCollector2;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$first$1.getContext());
                        t = ref$ObjectRef.element;
                        if (t == NullSurrogateKt.NULL) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) flowKt__ReduceKt$first$1.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$first$1.getContext());
                        t = ref$ObjectRef.element;
                        if (t == NullSurrogateKt.NULL) {
                        }
                    }
                }
                t = ref$ObjectRef.element;
                if (t == NullSurrogateKt.NULL) {
                    return t;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        Object obj2 = flowKt__ReduceKt$first$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$first$1.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.internal.Symbol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object first(Flow flow, Function2 function2, Continuation continuation) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        FlowCollector flowCollector;
        T t;
        if (continuation instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuation;
            int i2 = flowKt__ReduceKt$first$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$first$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = NullSurrogateKt.NULL;
                    FlowCollector flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(function2, ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$first$3.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$first$3.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        flowKt__ReduceKt$first$3.label = 1;
                        if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$first$3.getContext());
                        t = ref$ObjectRef.element;
                        if (t == NullSurrogateKt.NULL) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$3.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$first$3.getContext());
                        t = ref$ObjectRef.element;
                        if (t == NullSurrogateKt.NULL) {
                        }
                    }
                }
                t = ref$ObjectRef.element;
                if (t == NullSurrogateKt.NULL) {
                    return t;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
        Object obj2 = flowKt__ReduceKt$first$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$first$3.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object firstOrNull(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        FlowCollector flowCollector;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            int i2 = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$firstOrNull$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public Object emit(Object obj2, Continuation continuation2) {
                            Ref$ObjectRef.this.element = obj2;
                            throw new AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$firstOrNull$1.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$firstOrNull$1.L$1 = flowCollector2;
                        flowKt__ReduceKt$firstOrNull$1.label = 1;
                        if (flow.collect(flowCollector2, flowKt__ReduceKt$firstOrNull$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        flowCollector = flowCollector2;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$firstOrNull$1.getContext());
                        return ref$ObjectRef.element;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) flowKt__ReduceKt$firstOrNull$1.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$firstOrNull$1.getContext());
                        return ref$ObjectRef.element;
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        Object obj2 = flowKt__ReduceKt$firstOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$firstOrNull$1.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object firstOrNull(Flow flow, Function2 function2, Continuation continuation) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        FlowCollector flowCollector;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuation;
            int i2 = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$firstOrNull$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    FlowCollector flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(function2, ref$ObjectRef2);
                    try {
                        flowKt__ReduceKt$firstOrNull$3.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$firstOrNull$3.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        flowKt__ReduceKt$firstOrNull$3.label = 1;
                        if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$firstOrNull$3.getContext());
                        return ref$ObjectRef.element;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        JobKt.ensureActive(flowKt__ReduceKt$firstOrNull$3.getContext());
                        return ref$ObjectRef.element;
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuation);
        Object obj2 = flowKt__ReduceKt$firstOrNull$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$firstOrNull$3.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }
}
