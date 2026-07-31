package io.ktor.utils.io;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.core.ByteReadPacketExtensions_jvmKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: ByteReadChannelOperations.jvm.kt */
/* loaded from: classes14.dex */
public abstract class ByteReadChannelOperations_jvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f5 -> B:11:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, final WritableByteChannel writableByteChannel, final long j, Continuation continuation) {
        ByteReadChannelOperations_jvmKt$copyTo$1 byteReadChannelOperations_jvmKt$copyTo$1;
        int i;
        final Ref$LongRef ref$LongRef;
        Function1 function1;
        Throwable closedCause;
        ByteReadChannel byteReadChannel2;
        ByteReadChannel byteReadChannel3;
        Function1 function12;
        Ref$LongRef ref$LongRef2;
        long j2;
        if (continuation instanceof ByteReadChannelOperations_jvmKt$copyTo$1) {
            byteReadChannelOperations_jvmKt$copyTo$1 = (ByteReadChannelOperations_jvmKt$copyTo$1) continuation;
            int i2 = byteReadChannelOperations_jvmKt$copyTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperations_jvmKt$copyTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = byteReadChannelOperations_jvmKt$copyTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperations_jvmKt$copyTo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j < 0) {
                        throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
                    }
                    if ((writableByteChannel instanceof SelectableChannel) && !((SelectableChannel) writableByteChannel).isBlocking()) {
                        throw new IllegalArgumentException("Non-blocking channels are not supported");
                    }
                    if (byteReadChannel.isClosedForRead()) {
                        Throwable closedCause2 = byteReadChannel.getClosedCause();
                        if (closedCause2 != null) {
                            throw closedCause2;
                        }
                        return Boxing.boxLong(0L);
                    }
                    ref$LongRef = new Ref$LongRef();
                    function1 = new Function1() { // from class: io.ktor.utils.io.ByteReadChannelOperations_jvmKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit copyTo$lambda$3;
                            copyTo$lambda$3 = ByteReadChannelOperations_jvmKt.copyTo$lambda$3(j, ref$LongRef, writableByteChannel, (ByteBuffer) obj2);
                            return copyTo$lambda$3;
                        }
                    };
                } else if (i == 1) {
                    int i3 = byteReadChannelOperations_jvmKt$copyTo$1.I$0;
                    long j3 = byteReadChannelOperations_jvmKt$copyTo$1.J$0;
                    ByteReadChannel byteReadChannel4 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$3;
                    function1 = (Function1) byteReadChannelOperations_jvmKt$copyTo$1.L$2;
                    Ref$LongRef ref$LongRef3 = (Ref$LongRef) byteReadChannelOperations_jvmKt$copyTo$1.L$1;
                    ByteReadChannel byteReadChannel5 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        throw new EOFException("Not enough bytes available: required " + i3 + " but " + ByteReadChannelOperationsKt.getAvailableForRead(byteReadChannel4) + " available");
                    }
                    ByteReadPacketExtensions_jvmKt.read(byteReadChannel4.getReadBuffer(), function1);
                    j = j3;
                    ref$LongRef = ref$LongRef3;
                    byteReadChannel = byteReadChannel5;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = byteReadChannelOperations_jvmKt$copyTo$1.J$0;
                    byteReadChannel3 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$3;
                    function12 = (Function1) byteReadChannelOperations_jvmKt$copyTo$1.L$2;
                    ref$LongRef2 = (Ref$LongRef) byteReadChannelOperations_jvmKt$copyTo$1.L$1;
                    byteReadChannel2 = (ByteReadChannel) byteReadChannelOperations_jvmKt$copyTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ByteReadPacketExtensions_jvmKt.read(byteReadChannel3.getReadBuffer(), function12);
                    }
                    ref$LongRef = ref$LongRef2;
                    function1 = function12;
                    j = j2;
                    byteReadChannel = byteReadChannel2;
                }
                if (ref$LongRef.element < j || byteReadChannel.isClosedForRead()) {
                    closedCause = byteReadChannel.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    return Boxing.boxLong(ref$LongRef.element);
                }
                byteReadChannelOperations_jvmKt$copyTo$1.L$0 = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.L$1 = ref$LongRef;
                byteReadChannelOperations_jvmKt$copyTo$1.L$2 = function1;
                byteReadChannelOperations_jvmKt$copyTo$1.L$3 = byteReadChannel;
                byteReadChannelOperations_jvmKt$copyTo$1.J$0 = j;
                byteReadChannelOperations_jvmKt$copyTo$1.label = 2;
                Object awaitContent$default = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperations_jvmKt$copyTo$1, 1, null);
                if (awaitContent$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteReadChannel2 = byteReadChannel;
                long j4 = j;
                byteReadChannel3 = byteReadChannel2;
                function12 = function1;
                ref$LongRef2 = ref$LongRef;
                obj = awaitContent$default;
                j2 = j4;
                if (((Boolean) obj).booleanValue()) {
                }
                ref$LongRef = ref$LongRef2;
                function1 = function12;
                j = j2;
                byteReadChannel = byteReadChannel2;
                if (ref$LongRef.element < j) {
                }
                closedCause = byteReadChannel.getClosedCause();
                if (closedCause != null) {
                }
            }
        }
        byteReadChannelOperations_jvmKt$copyTo$1 = new ByteReadChannelOperations_jvmKt$copyTo$1(continuation);
        Object obj2 = byteReadChannelOperations_jvmKt$copyTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperations_jvmKt$copyTo$1.label;
        if (i != 0) {
        }
        if (ref$LongRef.element < j) {
        }
        closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
        }
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, WritableByteChannel writableByteChannel, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, writableByteChannel, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyTo$lambda$3(long j, Ref$LongRef ref$LongRef, WritableByteChannel writableByteChannel, ByteBuffer bb) {
        Intrinsics.checkNotNullParameter(bb, "bb");
        long j2 = j - ref$LongRef.element;
        if (j2 < bb.remaining()) {
            int limit = bb.limit();
            bb.limit(bb.position() + ((int) j2));
            while (bb.hasRemaining()) {
                writableByteChannel.write(bb);
            }
            bb.limit(limit);
            ref$LongRef.element += j2;
        } else {
            long j3 = 0;
            while (bb.hasRemaining()) {
                j3 += writableByteChannel.write(bb);
            }
            ref$LongRef.element += j3;
        }
        return Unit.INSTANCE;
    }
}
