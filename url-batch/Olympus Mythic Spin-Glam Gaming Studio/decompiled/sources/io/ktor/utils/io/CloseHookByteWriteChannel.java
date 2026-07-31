package io.ktor.utils.io;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Sink;

/* compiled from: CloseHookByteWriteChannel.kt */
/* loaded from: classes4.dex */
public final class CloseHookByteWriteChannel implements ByteWriteChannel {
    private final ByteWriteChannel delegate;
    private final Function1 onClose;

    @Override // io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable th) {
        this.delegate.cancel(th);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object flush(Continuation continuation) {
        return this.delegate.flush(continuation);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Sink getWriteBuffer() {
        return this.delegate.getWriteBuffer();
    }

    public CloseHookByteWriteChannel(ByteWriteChannel delegate, Function1 onClose) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.delegate = delegate;
        this.onClose = onClose;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flushAndClose(Continuation continuation) {
        CloseHookByteWriteChannel$flushAndClose$1 closeHookByteWriteChannel$flushAndClose$1;
        Object coroutine_suspended;
        int i;
        Function1 function1;
        if (continuation instanceof CloseHookByteWriteChannel$flushAndClose$1) {
            closeHookByteWriteChannel$flushAndClose$1 = (CloseHookByteWriteChannel$flushAndClose$1) continuation;
            int i2 = closeHookByteWriteChannel$flushAndClose$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                closeHookByteWriteChannel$flushAndClose$1.label = i2 - Integer.MIN_VALUE;
                Object obj = closeHookByteWriteChannel$flushAndClose$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = closeHookByteWriteChannel$flushAndClose$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteWriteChannel byteWriteChannel = this.delegate;
                    closeHookByteWriteChannel$flushAndClose$1.label = 1;
                    if (byteWriteChannel.flushAndClose(closeHookByteWriteChannel$flushAndClose$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                function1 = this.onClose;
                closeHookByteWriteChannel$flushAndClose$1.label = 2;
                if (function1.invoke(closeHookByteWriteChannel$flushAndClose$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        closeHookByteWriteChannel$flushAndClose$1 = new CloseHookByteWriteChannel$flushAndClose$1(this, continuation);
        Object obj2 = closeHookByteWriteChannel$flushAndClose$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = closeHookByteWriteChannel$flushAndClose$1.label;
        if (i != 0) {
        }
        function1 = this.onClose;
        closeHookByteWriteChannel$flushAndClose$1.label = 2;
        if (function1.invoke(closeHookByteWriteChannel$flushAndClose$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
