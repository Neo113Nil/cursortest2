package com.unity3d.services.core.extensions;

import com.unity3d.services.core.log.DeviceLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaskExtensions.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ad\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "", "retryDelay", "", "retries", "", "scalingFactor", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fallbackException", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "withRetry", "(JIDLjava/lang/Exception;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaskExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011e -> B:11:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013c -> B:12:0x0145). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withRetry(long j, int i, double d, @NotNull Exception exc, @NotNull Function2 function2, @NotNull Continuation continuation) {
        TaskExtensionsKt$withRetry$1 taskExtensionsKt$withRetry$1;
        int i2;
        long j2;
        double d2;
        Function2 function22;
        Ref$LongRef ref$LongRef;
        TaskExtensionsKt$withRetry$1 taskExtensionsKt$withRetry$12;
        int i3;
        int i4;
        Exception exc2;
        Exception exc3;
        Function2 function23;
        Ref$LongRef ref$LongRef2;
        long j3;
        int i5;
        double d3;
        int i6;
        int i7;
        Throwable th;
        Object m8023constructorimpl;
        int i8;
        if (continuation instanceof TaskExtensionsKt$withRetry$1) {
            taskExtensionsKt$withRetry$1 = (TaskExtensionsKt$withRetry$1) continuation;
            int i9 = taskExtensionsKt$withRetry$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                taskExtensionsKt$withRetry$1.label = i9 - Integer.MIN_VALUE;
                Object obj = taskExtensionsKt$withRetry$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = taskExtensionsKt$withRetry$1.label;
                int i10 = 1;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    j2 = j;
                    ref$LongRef3.element = j2;
                    d2 = d;
                    function22 = function2;
                    ref$LongRef = ref$LongRef3;
                    taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                    i3 = 0;
                    i4 = i;
                    exc2 = exc;
                    if (i3 >= i4) {
                    }
                } else if (i2 == 1) {
                    i7 = taskExtensionsKt$withRetry$1.I$2;
                    i6 = taskExtensionsKt$withRetry$1.I$1;
                    d3 = taskExtensionsKt$withRetry$1.D$0;
                    i5 = taskExtensionsKt$withRetry$1.I$0;
                    j3 = taskExtensionsKt$withRetry$1.J$0;
                    ref$LongRef2 = (Ref$LongRef) taskExtensionsKt$withRetry$1.L$2;
                    function23 = (Function2) taskExtensionsKt$withRetry$1.L$1;
                    exc3 = (Exception) taskExtensionsKt$withRetry$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion = Result.INSTANCE;
                        m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                        int i11 = i6;
                        int i12 = i7;
                        i8 = i11;
                        if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                        }
                    }
                    m8023constructorimpl = Result.m8023constructorimpl(obj);
                    int i112 = i6;
                    int i122 = i7;
                    i8 = i112;
                    if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = taskExtensionsKt$withRetry$1.I$1;
                    double d4 = taskExtensionsKt$withRetry$1.D$0;
                    int i13 = taskExtensionsKt$withRetry$1.I$0;
                    long j4 = taskExtensionsKt$withRetry$1.J$0;
                    Ref$LongRef ref$LongRef4 = (Ref$LongRef) taskExtensionsKt$withRetry$1.L$2;
                    Function2 function24 = (Function2) taskExtensionsKt$withRetry$1.L$1;
                    Exception exc4 = (Exception) taskExtensionsKt$withRetry$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ref$LongRef4.element = (long) (j4 * d4);
                    i10 = 1;
                    Ref$LongRef ref$LongRef5 = ref$LongRef4;
                    taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                    i4 = i13;
                    Function2 function25 = function24;
                    ref$LongRef2 = ref$LongRef5;
                    function22 = function25;
                    d2 = d4;
                    j2 = j4;
                    int i14 = i8 + 1;
                    exc2 = exc4;
                    ref$LongRef = ref$LongRef2;
                    i3 = i14;
                    if (i3 >= i4) {
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            exc3 = exc2;
                            i7 = i3;
                            ref$LongRef2 = ref$LongRef;
                            function23 = function22;
                            i5 = i4;
                            taskExtensionsKt$withRetry$1 = taskExtensionsKt$withRetry$12;
                            j3 = j2;
                            d3 = d2;
                            i6 = i7;
                            Result.Companion companion2 = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
                            int i1122 = i6;
                            int i1222 = i7;
                            i8 = i1122;
                            if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                            }
                        }
                        Result.Companion companion3 = Result.INSTANCE;
                        Integer boxInt = Boxing.boxInt(i3);
                        taskExtensionsKt$withRetry$12.L$0 = exc2;
                        taskExtensionsKt$withRetry$12.L$1 = function22;
                        taskExtensionsKt$withRetry$12.L$2 = ref$LongRef;
                        taskExtensionsKt$withRetry$12.J$0 = j2;
                        taskExtensionsKt$withRetry$12.I$0 = i4;
                        taskExtensionsKt$withRetry$12.D$0 = d2;
                        taskExtensionsKt$withRetry$12.I$1 = i3;
                        taskExtensionsKt$withRetry$12.I$2 = i3;
                        taskExtensionsKt$withRetry$12.label = i10;
                        obj = function22.invoke(boxInt, taskExtensionsKt$withRetry$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        exc3 = exc2;
                        i7 = i3;
                        ref$LongRef2 = ref$LongRef;
                        function23 = function22;
                        i5 = i4;
                        taskExtensionsKt$withRetry$1 = taskExtensionsKt$withRetry$12;
                        j3 = j2;
                        d3 = d2;
                        i6 = i7;
                        m8023constructorimpl = Result.m8023constructorimpl(obj);
                        int i11222 = i6;
                        int i12222 = i7;
                        i8 = i11222;
                        if (Result.m8029isSuccessimpl(m8023constructorimpl)) {
                            ResultKt.throwOnFailure(m8023constructorimpl);
                            return m8023constructorimpl;
                        }
                        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                            Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
                            if (m8026exceptionOrNullimpl instanceof AbortRetryException) {
                                throw m8026exceptionOrNullimpl;
                            }
                            if (i12222 + i10 == i5) {
                                throw exc3;
                            }
                            DeviceLog.debug("Unity Ads init: retrying in " + ref$LongRef2.element + " milliseconds");
                            long j5 = ref$LongRef2.element;
                            taskExtensionsKt$withRetry$1.L$0 = exc3;
                            taskExtensionsKt$withRetry$1.L$1 = function23;
                            taskExtensionsKt$withRetry$1.L$2 = ref$LongRef2;
                            taskExtensionsKt$withRetry$1.J$0 = j3;
                            taskExtensionsKt$withRetry$1.I$0 = i5;
                            taskExtensionsKt$withRetry$1.D$0 = d3;
                            taskExtensionsKt$withRetry$1.I$1 = i8;
                            taskExtensionsKt$withRetry$1.label = 2;
                            if (DelayKt.delay(j5, taskExtensionsKt$withRetry$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            d4 = d3;
                            i13 = i5;
                            j4 = j3;
                            ref$LongRef4 = ref$LongRef2;
                            function24 = function23;
                            exc4 = exc3;
                            ref$LongRef4.element = (long) (j4 * d4);
                            i10 = 1;
                            Ref$LongRef ref$LongRef52 = ref$LongRef4;
                            taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                            i4 = i13;
                            Function2 function252 = function24;
                            ref$LongRef2 = ref$LongRef52;
                            function22 = function252;
                            d2 = d4;
                            j2 = j4;
                            int i142 = i8 + 1;
                            exc2 = exc4;
                            ref$LongRef = ref$LongRef2;
                            i3 = i142;
                            if (i3 >= i4) {
                                throw new IllegalStateException("Unknown exception from withRetry");
                            }
                        } else {
                            long j6 = j3;
                            taskExtensionsKt$withRetry$12 = taskExtensionsKt$withRetry$1;
                            i4 = i5;
                            function22 = function23;
                            exc4 = exc3;
                            d2 = d3;
                            j2 = j6;
                            int i1422 = i8 + 1;
                            exc2 = exc4;
                            ref$LongRef = ref$LongRef2;
                            i3 = i1422;
                            if (i3 >= i4) {
                            }
                        }
                    }
                }
            }
        }
        taskExtensionsKt$withRetry$1 = new TaskExtensionsKt$withRetry$1(continuation);
        Object obj2 = taskExtensionsKt$withRetry$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = taskExtensionsKt$withRetry$1.label;
        int i102 = 1;
        if (i2 != 0) {
        }
    }
}
