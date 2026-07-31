package io.ktor.util.pipeline;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SuspendFunctionGun.kt */
/* loaded from: classes3.dex */
public final class SuspendFunctionGun$continuation$1 implements Continuation, CoroutineStackFrame {
    private int currentIndex = Integer.MIN_VALUE;
    final /* synthetic */ SuspendFunctionGun this$0;

    SuspendFunctionGun$continuation$1(SuspendFunctionGun suspendFunctionGun) {
        this.this$0 = suspendFunctionGun;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation peekContinuation = peekContinuation();
        if (peekContinuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) peekContinuation;
        }
        return null;
    }

    private final Continuation peekContinuation() {
        Continuation[] continuationArr;
        int i;
        if (this.currentIndex == Integer.MIN_VALUE) {
            i = this.this$0.lastSuspensionIndex;
            this.currentIndex = i;
        }
        if (this.currentIndex >= 0) {
            try {
                continuationArr = this.this$0.suspensions;
                int i2 = this.currentIndex;
                Continuation continuation = continuationArr[i2];
                if (continuation == null) {
                    return StackWalkingFailedFrame.INSTANCE;
                }
                this.currentIndex = i2 - 1;
                return continuation;
            } catch (Throwable unused) {
                return StackWalkingFailedFrame.INSTANCE;
            }
        }
        this.currentIndex = Integer.MIN_VALUE;
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        Continuation[] continuationArr;
        int i;
        int i2;
        Continuation[] continuationArr2;
        continuationArr = this.this$0.suspensions;
        i = this.this$0.lastSuspensionIndex;
        Continuation continuation = continuationArr[i];
        if (continuation == this || continuation == null) {
            i2 = this.this$0.lastSuspensionIndex;
            int i3 = i2 - 1;
            while (i3 >= 0) {
                continuationArr2 = this.this$0.suspensions;
                int i4 = i3 - 1;
                Continuation continuation2 = continuationArr2[i3];
                if (continuation2 != this && continuation2 != null) {
                    return continuation2.getContext();
                }
                i3 = i4;
            }
            throw new IllegalStateException("Not started");
        }
        return continuation.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        if (!Result.m8028isFailureimpl(obj)) {
            this.this$0.loop(false);
            return;
        }
        SuspendFunctionGun suspendFunctionGun = this.this$0;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(obj);
        Intrinsics.checkNotNull(m8026exceptionOrNullimpl);
        suspendFunctionGun.resumeRootWith(Result.m8023constructorimpl(ResultKt.createFailure(m8026exceptionOrNullimpl)));
    }
}
