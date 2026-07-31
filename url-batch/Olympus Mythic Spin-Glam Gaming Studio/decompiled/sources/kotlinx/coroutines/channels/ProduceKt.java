package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* compiled from: Produce.kt */
/* loaded from: classes12.dex */
public abstract class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitClose(ProducerScope producerScope, Function0 function0, Continuation continuation) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        int i;
        try {
            if (continuation instanceof ProduceKt$awaitClose$1) {
                produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuation;
                int i2 = produceKt$awaitClose$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    produceKt$awaitClose$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = produceKt$awaitClose$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = produceKt$awaitClose$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (produceKt$awaitClose$1.getContext().get(Job.Key) != producerScope) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        produceKt$awaitClose$1.L$0 = producerScope;
                        produceKt$awaitClose$1.L$1 = function0;
                        produceKt$awaitClose$1.label = 1;
                        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(produceKt$awaitClose$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        producerScope.invokeOnClose(new Function1() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Throwable) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Throwable th) {
                                CancellableContinuation cancellableContinuation = CancellableContinuation.this;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
                            }
                        });
                        Object result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(produceKt$awaitClose$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (Function0) produceKt$awaitClose$1.L$1;
                        ResultKt.throwOnFailure(obj);
                    }
                    function0.mo4828invoke();
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            function0.mo4828invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.mo4828invoke();
            throw th;
        }
        produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
        Object obj2 = produceKt$awaitClose$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = produceKt$awaitClose$1.label;
    }

    public static /* synthetic */ Object awaitClose$default(ProducerScope producerScope, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: kotlinx.coroutines.channels.ProduceKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo4828invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
        }
        return awaitClose(producerScope, function0, continuation);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return produce(coroutineScope, coroutineContext, i, function2);
    }

    public static final ReceiveChannel produce(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, Function2 function2) {
        return produce(coroutineScope, coroutineContext, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, function2);
    }

    public static /* synthetic */ ReceiveChannel produce$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i2 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return produce(coroutineScope, coroutineContext2, i3, bufferOverflow2, coroutineStart2, function1, function2);
    }

    public static final ReceiveChannel produce(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, Function1 function1, Function2 function2) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), ChannelKt.Channel$default(i, bufferOverflow, null, 4, null));
        if (function1 != null) {
            producerCoroutine.invokeOnCompletion(function1);
        }
        producerCoroutine.start(coroutineStart, producerCoroutine, function2);
        return producerCoroutine;
    }
}
