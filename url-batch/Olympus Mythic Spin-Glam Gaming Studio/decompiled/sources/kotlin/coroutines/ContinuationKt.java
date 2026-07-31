package kotlin.coroutines;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Continuation.kt */
/* loaded from: classes3.dex */
public abstract class ContinuationKt {
    public static final Continuation createCoroutine(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, obj, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final void startCoroutine(Function2 function2, Object obj, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, obj, completion));
        Result.Companion companion = Result.INSTANCE;
        intercepted.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
    }
}
