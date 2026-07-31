package io.ktor.utils.io;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;

/* compiled from: CountedByteReadChannel.kt */
/* loaded from: classes4.dex */
public final class CountedByteReadChannel implements ByteReadChannel {
    private final Buffer buffer;
    private long consumed;
    private final ByteReadChannel delegate;
    private long initial;

    public CountedByteReadChannel(ByteReadChannel delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.buffer = new Buffer();
    }

    public final long getTotalBytesRead() {
        updateConsumed();
        return this.consumed;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        return this.delegate.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.buffer.exhausted() && this.delegate.isClosedForRead();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Buffer getReadBuffer() {
        transferFromDelegate();
        return this.buffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitContent(int i, Continuation continuation) {
        CountedByteReadChannel$awaitContent$1 countedByteReadChannel$awaitContent$1;
        Object obj;
        int i2;
        if (continuation instanceof CountedByteReadChannel$awaitContent$1) {
            countedByteReadChannel$awaitContent$1 = (CountedByteReadChannel$awaitContent$1) continuation;
            int i3 = countedByteReadChannel$awaitContent$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                countedByteReadChannel$awaitContent$1.label = i3 - Integer.MIN_VALUE;
                obj = countedByteReadChannel$awaitContent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = countedByteReadChannel$awaitContent$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (getReadBuffer().getSize() >= i) {
                        return Boxing.boxBoolean(true);
                    }
                    ByteReadChannel byteReadChannel = this.delegate;
                    countedByteReadChannel$awaitContent$1.label = 1;
                    obj = byteReadChannel.awaitContent(i, countedByteReadChannel$awaitContent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    transferFromDelegate();
                    return Boxing.boxBoolean(true);
                }
                return Boxing.boxBoolean(false);
            }
        }
        countedByteReadChannel$awaitContent$1 = new CountedByteReadChannel$awaitContent$1(this, continuation);
        obj = countedByteReadChannel$awaitContent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = countedByteReadChannel$awaitContent$1.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    private final void transferFromDelegate() {
        updateConsumed();
        this.initial += this.buffer.transferFrom(this.delegate.getReadBuffer());
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable th) {
        this.delegate.cancel(th);
        this.buffer.close();
    }

    private final void updateConsumed() {
        this.consumed += this.initial - this.buffer.getSize();
        this.initial = this.buffer.getSize();
    }
}
