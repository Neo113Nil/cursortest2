package kotlinx.coroutines;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* compiled from: Timeout.kt */
/* loaded from: classes9.dex */
public abstract class TimeoutKt {
    public static final Object withTimeout(long j, Function2 function2, Continuation continuation) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object obj = setupTimeout(new TimeoutCoroutine(j, continuation), function2);
        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return obj;
    }

    /* renamed from: withTimeout-KLykuaI, reason: not valid java name */
    public static final Object m8205withTimeoutKLykuaI(long j, Function2 function2, Continuation continuation) {
        return withTimeout(DelayKt.m8204toDelayMillisLRDsOJo(j), function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.TimeoutCoroutine] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object withTimeoutOrNull(long j, Function2 function2, Continuation continuation) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            int i2 = timeoutKt$withTimeoutOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = timeoutKt$withTimeoutOrNull$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = timeoutKt$withTimeoutOrNull$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j <= 0) {
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        timeoutKt$withTimeoutOrNull$1.L$0 = function2;
                        timeoutKt$withTimeoutOrNull$1.L$1 = ref$ObjectRef2;
                        timeoutKt$withTimeoutOrNull$1.J$0 = j;
                        timeoutKt$withTimeoutOrNull$1.label = 1;
                        ?? timeoutCoroutine = new TimeoutCoroutine(j, timeoutKt$withTimeoutOrNull$1);
                        ref$ObjectRef2.element = timeoutCoroutine;
                        Object obj2 = setupTimeout(timeoutCoroutine, function2);
                        if (obj2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(timeoutKt$withTimeoutOrNull$1);
                        }
                        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
                    } catch (TimeoutCancellationException e) {
                        e = e;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (TimeoutCancellationException e2) {
                        e = e2;
                    }
                }
                if (e.coroutine != ref$ObjectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        Object obj3 = timeoutKt$withTimeoutOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = timeoutKt$withTimeoutOrNull$1.label;
        if (i != 0) {
        }
        if (e.coroutine != ref$ObjectRef.element) {
        }
    }

    /* renamed from: withTimeoutOrNull-KLykuaI, reason: not valid java name */
    public static final Object m8206withTimeoutOrNullKLykuaI(long j, Function2 function2, Continuation continuation) {
        return withTimeoutOrNull(DelayKt.m8204toDelayMillisLRDsOJo(j), function2, continuation);
    }

    private static final Object setupTimeout(TimeoutCoroutine timeoutCoroutine, Function2 function2) {
        JobKt.disposeOnCompletion(timeoutCoroutine, DelayKt.getDelay(timeoutCoroutine.uCont.getContext()).invokeOnTimeout(timeoutCoroutine.time, timeoutCoroutine, timeoutCoroutine.getContext()));
        return UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(timeoutCoroutine, timeoutCoroutine, function2);
    }

    public static final TimeoutCancellationException TimeoutCancellationException(long j, Delay delay, Job job) {
        return new TimeoutCancellationException("Timed out waiting for " + j + " ms", job);
    }
}
