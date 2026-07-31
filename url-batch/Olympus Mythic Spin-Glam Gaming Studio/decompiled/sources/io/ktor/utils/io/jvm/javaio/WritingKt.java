package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.ByteReadChannel;
import java.io.OutputStream;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.io.BuffersJvmKt;

/* compiled from: Writing.kt */
/* loaded from: classes4.dex */
public abstract class WritingKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0052 -> B:11:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:10:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, OutputStream outputStream, long j, Continuation continuation) {
        WritingKt$copyTo$1 writingKt$copyTo$1;
        int i;
        long j2;
        if (continuation instanceof WritingKt$copyTo$1) {
            writingKt$copyTo$1 = (WritingKt$copyTo$1) continuation;
            int i2 = writingKt$copyTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                writingKt$copyTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = writingKt$copyTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = writingKt$copyTo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 = 0;
                    if (j < 0) {
                        throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
                    }
                    if (!byteReadChannel.isClosedForRead()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = writingKt$copyTo$1.J$0;
                    OutputStream outputStream2 = (OutputStream) writingKt$copyTo$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) writingKt$copyTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j2 = j3;
                    outputStream = outputStream2;
                    byteReadChannel = byteReadChannel2;
                    long size = byteReadChannel.getReadBuffer().getBuffer().getSize() + j2;
                    BuffersJvmKt.readTo$default(byteReadChannel.getReadBuffer().getBuffer(), outputStream, 0L, 2, null);
                    j2 = size;
                    if (!byteReadChannel.isClosedForRead()) {
                        if (byteReadChannel.getReadBuffer().exhausted()) {
                            writingKt$copyTo$1.L$0 = byteReadChannel;
                            writingKt$copyTo$1.L$1 = outputStream;
                            writingKt$copyTo$1.J$0 = j2;
                            writingKt$copyTo$1.label = 1;
                            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, writingKt$copyTo$1, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteReadChannel2 = byteReadChannel;
                            outputStream2 = outputStream;
                            j3 = j2;
                            j2 = j3;
                            outputStream = outputStream2;
                            byteReadChannel = byteReadChannel2;
                        }
                        long size2 = byteReadChannel.getReadBuffer().getBuffer().getSize() + j2;
                        BuffersJvmKt.readTo$default(byteReadChannel.getReadBuffer().getBuffer(), outputStream, 0L, 2, null);
                        j2 = size2;
                        if (!byteReadChannel.isClosedForRead()) {
                        }
                    } else {
                        return Boxing.boxLong(j2);
                    }
                }
            }
        }
        writingKt$copyTo$1 = new WritingKt$copyTo$1(continuation);
        Object obj2 = writingKt$copyTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writingKt$copyTo$1.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, OutputStream outputStream, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, outputStream, j, continuation);
    }
}
