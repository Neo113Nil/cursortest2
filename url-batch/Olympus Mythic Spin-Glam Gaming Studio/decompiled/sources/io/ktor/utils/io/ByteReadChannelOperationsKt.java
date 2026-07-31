package io.ktor.utils.io;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.charsets.TooLongLineException;
import io.ktor.utils.io.core.BuffersKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.io.Buffer;
import kotlinx.io.ByteStringsKt;
import kotlinx.io.Sink;
import kotlinx.io.Utf8Kt;
import kotlinx.io.bytestring.ByteString;

/* compiled from: ByteReadChannelOperations.kt */
/* loaded from: classes8.dex */
public abstract class ByteReadChannelOperationsKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object toByteArray(ByteReadChannel byteReadChannel, Continuation continuation) {
        ByteReadChannelOperationsKt$toByteArray$1 byteReadChannelOperationsKt$toByteArray$1;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$toByteArray$1) {
            byteReadChannelOperationsKt$toByteArray$1 = (ByteReadChannelOperationsKt$toByteArray$1) continuation;
            int i2 = byteReadChannelOperationsKt$toByteArray$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$toByteArray$1.label = i2 - Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$toByteArray$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$toByteArray$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteReadChannelOperationsKt$toByteArray$1.label = 1;
                    obj = readBuffer(byteReadChannel, byteReadChannelOperationsKt$toByteArray$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return BuffersKt.readBytes$default((Buffer) obj, 0, 1, null);
            }
        }
        byteReadChannelOperationsKt$toByteArray$1 = new ByteReadChannelOperationsKt$toByteArray$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$toByteArray$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$toByteArray$1.label;
        if (i != 0) {
        }
        return BuffersKt.readBytes$default((Buffer) obj2, 0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBuffer(ByteReadChannel byteReadChannel, Continuation continuation) {
        ByteReadChannelOperationsKt$readBuffer$1 byteReadChannelOperationsKt$readBuffer$1;
        int i;
        Buffer buffer;
        Throwable closedCause;
        if (continuation instanceof ByteReadChannelOperationsKt$readBuffer$1) {
            byteReadChannelOperationsKt$readBuffer$1 = (ByteReadChannelOperationsKt$readBuffer$1) continuation;
            int i2 = byteReadChannelOperationsKt$readBuffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readBuffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readBuffer$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readBuffer$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    buffer = new Buffer();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Buffer buffer2 = (Buffer) byteReadChannelOperationsKt$readBuffer$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readBuffer$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    buffer = buffer2;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    buffer.transferFrom(byteReadChannel.getReadBuffer());
                    byteReadChannelOperationsKt$readBuffer$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readBuffer$1.L$1 = buffer;
                    byteReadChannelOperationsKt$readBuffer$1.label = 1;
                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readBuffer$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                closedCause = byteReadChannel.getClosedCause();
                if (closedCause != null) {
                    return buffer;
                }
                throw closedCause;
            }
        }
        byteReadChannelOperationsKt$readBuffer$1 = new ByteReadChannelOperationsKt$readBuffer$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readBuffer$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readBuffer$1.label;
        if (i != 0) {
        }
        while (!byteReadChannel.isClosedForRead()) {
        }
        closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:25:0x0074, B:27:0x007a, B:35:0x00ae, B:41:0x00c9), top: B:24:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[Catch: all -> 0x00a9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a9, blocks: (B:25:0x0074, B:27:0x007a, B:35:0x00ae, B:41:0x00c9), top: B:24:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:23:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyAndClose(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, Continuation continuation) {
        ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$1;
        ?? r3;
        ByteReadChannel byteReadChannel2;
        long j;
        ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$12;
        ByteReadChannel byteReadChannel3;
        long j2;
        ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof ByteReadChannelOperationsKt$copyAndClose$1) {
                byteReadChannelOperationsKt$copyAndClose$1 = (ByteReadChannelOperationsKt$copyAndClose$1) continuation;
                int i = byteReadChannelOperationsKt$copyAndClose$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyAndClose$1.label = i - Integer.MIN_VALUE;
                    Object obj = byteReadChannelOperationsKt$copyAndClose$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyAndClose$1.label;
                    if (r3 != 0) {
                        ResultKt.throwOnFailure(obj);
                        j = 0;
                        r3 = byteWriteChannel;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else if (r3 == 1) {
                        j = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                        ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) byteReadChannelOperationsKt$copyAndClose$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        byteReadChannelOperationsKt$copyAndClose$1.L$0 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$1.L$1 = r3;
                        byteReadChannelOperationsKt$copyAndClose$1.J$0 = j;
                        byteReadChannelOperationsKt$copyAndClose$1.label = 2;
                        byteWriteChannel2 = r3;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyAndClose$1, 1, null) == coroutine_suspended) {
                        }
                        ByteReadChannel byteReadChannel4 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel4;
                        r3 = byteWriteChannel2;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j2 = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                                ResultKt.throwOnFailure(obj);
                                return Boxing.boxLong(j2);
                            }
                            if (r3 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j = byteReadChannelOperationsKt$copyAndClose$1.J$0;
                        ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) byteReadChannelOperationsKt$copyAndClose$1.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyAndClose$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel4;
                        ByteReadChannel byteReadChannel42 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                        byteReadChannel3 = byteReadChannel42;
                        r3 = byteWriteChannel2;
                        try {
                            if (byteReadChannel3.isClosedForRead()) {
                                j += byteReadChannel3.getReadBuffer().transferTo(r3.getWriteBuffer());
                                byteReadChannelOperationsKt$copyAndClose$12.L$0 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyAndClose$12.L$1 = r3;
                                byteReadChannelOperationsKt$copyAndClose$12.J$0 = j;
                                byteReadChannelOperationsKt$copyAndClose$12.label = 1;
                                if (r3.flush(byteReadChannelOperationsKt$copyAndClose$12) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$13 = byteReadChannelOperationsKt$copyAndClose$12;
                                byteReadChannel2 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyAndClose$1 = byteReadChannelOperationsKt$copyAndClose$13;
                                r3 = r3;
                                byteReadChannelOperationsKt$copyAndClose$1.L$0 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyAndClose$1.L$1 = r3;
                                byteReadChannelOperationsKt$copyAndClose$1.J$0 = j;
                                byteReadChannelOperationsKt$copyAndClose$1.label = 2;
                                byteWriteChannel2 = r3;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel2, 0, byteReadChannelOperationsKt$copyAndClose$1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ByteReadChannel byteReadChannel422 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyAndClose$12 = byteReadChannelOperationsKt$copyAndClose$1;
                                byteReadChannel3 = byteReadChannel422;
                                r3 = byteWriteChannel2;
                                if (byteReadChannel3.isClosedForRead()) {
                                    Throwable closedCause = byteReadChannel3.getClosedCause();
                                    if (closedCause != null) {
                                        throw closedCause;
                                    }
                                    byteReadChannelOperationsKt$copyAndClose$12.L$0 = null;
                                    byteReadChannelOperationsKt$copyAndClose$12.L$1 = null;
                                    byteReadChannelOperationsKt$copyAndClose$12.J$0 = j;
                                    byteReadChannelOperationsKt$copyAndClose$12.label = 3;
                                    if (r3.flushAndClose(byteReadChannelOperationsKt$copyAndClose$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j2 = j;
                                    return Boxing.boxLong(j2);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ByteReadChannelOperationsKt$copyAndClose$1 byteReadChannelOperationsKt$copyAndClose$14 = byteReadChannelOperationsKt$copyAndClose$12;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyAndClose$1 = byteReadChannelOperationsKt$copyAndClose$14;
                            try {
                                byteReadChannel2.cancel(th);
                                ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (Throwable th3) {
                                byteReadChannelOperationsKt$copyAndClose$1.L$0 = th3;
                                byteReadChannelOperationsKt$copyAndClose$1.L$1 = null;
                                byteReadChannelOperationsKt$copyAndClose$1.label = 4;
                                if (r3.flushAndClose(byteReadChannelOperationsKt$copyAndClose$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (r3 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyAndClose$1 = new ByteReadChannelOperationsKt$copyAndClose$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$copyAndClose$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = byteReadChannelOperationsKt$copyAndClose$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [io.ktor.utils.io.ByteWriteChannel] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d9 -> B:23:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, Continuation continuation) {
        ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$2;
        ?? r3;
        ByteReadChannel byteReadChannel2;
        long j2;
        long j3;
        ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$22;
        ByteReadChannel byteReadChannel3;
        Object flush;
        long j4;
        long j5;
        ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof ByteReadChannelOperationsKt$copyTo$2) {
                byteReadChannelOperationsKt$copyTo$2 = (ByteReadChannelOperationsKt$copyTo$2) continuation;
                int i = byteReadChannelOperationsKt$copyTo$2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$copyTo$2.label = i - Integer.MIN_VALUE;
                    Object obj = byteReadChannelOperationsKt$copyTo$2.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r3 = byteReadChannelOperationsKt$copyTo$2.label;
                    int i2 = 1;
                    if (r3 != 0) {
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel;
                        j2 = j;
                        j3 = j2;
                        byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                        byteReadChannel3 = byteReadChannel;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                        byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                        byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                        byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                        byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                        byteReadChannelOperationsKt$copyTo$22.label = 3;
                        if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                        }
                    } else if (r3 == 1) {
                        j2 = byteReadChannelOperationsKt$copyTo$2.J$1;
                        j3 = byteReadChannelOperationsKt$copyTo$2.J$0;
                        ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) byteReadChannelOperationsKt$copyTo$2.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyTo$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        r3 = byteWriteChannel3;
                        long min = Math.min(j2, ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                        byteReadChannel2.getReadBuffer().readTo(r3.getWriteBuffer(), min);
                        j2 -= min;
                        byteReadChannelOperationsKt$copyTo$2.L$0 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyTo$2.L$1 = r3;
                        byteReadChannelOperationsKt$copyTo$2.J$0 = j3;
                        byteReadChannelOperationsKt$copyTo$2.J$1 = j2;
                        byteReadChannelOperationsKt$copyTo$2.label = 2;
                        flush = r3.flush(byteReadChannelOperationsKt$copyTo$2);
                        byteWriteChannel2 = r3;
                        if (flush == coroutine_suspended) {
                        }
                        ByteReadChannel byteReadChannel4 = byteReadChannel2;
                        byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                        byteReadChannel3 = byteReadChannel4;
                        i2 = 1;
                        r3 = byteWriteChannel2;
                        if (byteReadChannel3.isClosedForRead()) {
                        }
                        byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                        byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                        byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                        byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                        byteReadChannelOperationsKt$copyTo$22.label = 3;
                        if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                        }
                    } else {
                        if (r3 != 2) {
                            if (r3 == 3) {
                                j4 = byteReadChannelOperationsKt$copyTo$2.J$1;
                                j5 = byteReadChannelOperationsKt$copyTo$2.J$0;
                                ResultKt.throwOnFailure(obj);
                                return Boxing.boxLong(j5 - j4);
                            }
                            if (r3 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) byteReadChannelOperationsKt$copyTo$2.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        j2 = byteReadChannelOperationsKt$copyTo$2.J$1;
                        j3 = byteReadChannelOperationsKt$copyTo$2.J$0;
                        ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) byteReadChannelOperationsKt$copyTo$2.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$copyTo$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel4;
                        try {
                            ByteReadChannel byteReadChannel42 = byteReadChannel2;
                            byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                            byteReadChannel3 = byteReadChannel42;
                            if (byteReadChannel3.isClosedForRead() && j2 > 0) {
                                if (byteReadChannel3.getReadBuffer().exhausted()) {
                                    byteReadChannelOperationsKt$copyTo$22.L$0 = byteReadChannel3;
                                    byteReadChannelOperationsKt$copyTo$22.L$1 = r3;
                                    byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                                    byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                                    byteReadChannelOperationsKt$copyTo$22.label = i2;
                                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$copyTo$22, i2, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$23 = byteReadChannelOperationsKt$copyTo$22;
                                byteReadChannel2 = byteReadChannel3;
                                byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$23;
                                r3 = r3;
                                long min2 = Math.min(j2, ByteReadPacketKt.getRemaining(byteReadChannel2.getReadBuffer()));
                                byteReadChannel2.getReadBuffer().readTo(r3.getWriteBuffer(), min2);
                                j2 -= min2;
                                byteReadChannelOperationsKt$copyTo$2.L$0 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyTo$2.L$1 = r3;
                                byteReadChannelOperationsKt$copyTo$2.J$0 = j3;
                                byteReadChannelOperationsKt$copyTo$2.J$1 = j2;
                                byteReadChannelOperationsKt$copyTo$2.label = 2;
                                flush = r3.flush(byteReadChannelOperationsKt$copyTo$2);
                                byteWriteChannel2 = r3;
                                if (flush == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ByteReadChannel byteReadChannel422 = byteReadChannel2;
                                byteReadChannelOperationsKt$copyTo$22 = byteReadChannelOperationsKt$copyTo$2;
                                byteReadChannel3 = byteReadChannel422;
                                i2 = 1;
                                r3 = byteWriteChannel2;
                                if (byteReadChannel3.isClosedForRead()) {
                                }
                                byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                                byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                                byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                                byteReadChannelOperationsKt$copyTo$22.label = 3;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                                }
                            } else {
                                byteReadChannelOperationsKt$copyTo$22.L$0 = null;
                                byteReadChannelOperationsKt$copyTo$22.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$22.J$0 = j3;
                                byteReadChannelOperationsKt$copyTo$22.J$1 = j2;
                                byteReadChannelOperationsKt$copyTo$22.label = 3;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$22) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                j4 = j2;
                                j5 = j3;
                                return Boxing.boxLong(j5 - j4);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ByteReadChannelOperationsKt$copyTo$2 byteReadChannelOperationsKt$copyTo$24 = byteReadChannelOperationsKt$copyTo$22;
                            byteReadChannel2 = byteReadChannel3;
                            byteReadChannelOperationsKt$copyTo$2 = byteReadChannelOperationsKt$copyTo$24;
                            try {
                                byteReadChannel2.cancel(th);
                                ByteWriteChannelOperationsKt.close(r3, th);
                                throw th;
                            } catch (Throwable th3) {
                                byteReadChannelOperationsKt$copyTo$2.L$0 = th3;
                                byteReadChannelOperationsKt$copyTo$2.L$1 = null;
                                byteReadChannelOperationsKt$copyTo$2.label = 4;
                                if (r3.flush(byteReadChannelOperationsKt$copyTo$2) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th3;
                            }
                        }
                        i2 = 1;
                        r3 = byteWriteChannel2;
                    }
                }
            }
            if (r3 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        byteReadChannelOperationsKt$copyTo$2 = new ByteReadChannelOperationsKt$copyTo$2(continuation);
        Object obj2 = byteReadChannelOperationsKt$copyTo$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = byteReadChannelOperationsKt$copyTo$2.label;
        int i22 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readRemaining(ByteReadChannel byteReadChannel, Continuation continuation) {
        ByteReadChannelOperationsKt$readRemaining$1 byteReadChannelOperationsKt$readRemaining$1;
        int i;
        Sink BytePacketBuilder;
        if (continuation instanceof ByteReadChannelOperationsKt$readRemaining$1) {
            byteReadChannelOperationsKt$readRemaining$1 = (ByteReadChannelOperationsKt$readRemaining$1) continuation;
            int i2 = byteReadChannelOperationsKt$readRemaining$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$1.label = i2 - Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readRemaining$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readRemaining$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sink sink = (Sink) byteReadChannelOperationsKt$readRemaining$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readRemaining$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = sink;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    BytePacketBuilder.transferFrom(byteReadChannel.getReadBuffer());
                    byteReadChannelOperationsKt$readRemaining$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readRemaining$1.L$1 = BytePacketBuilder;
                    byteReadChannelOperationsKt$readRemaining$1.label = 1;
                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readRemaining$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                rethrowCloseCauseIfNeeded(byteReadChannel);
                return BytePacketBuilder.getBuffer();
            }
        }
        byteReadChannelOperationsKt$readRemaining$1 = new ByteReadChannelOperationsKt$readRemaining$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readRemaining$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readRemaining$1.label;
        if (i != 0) {
        }
        while (!byteReadChannel.isClosedForRead()) {
        }
        rethrowCloseCauseIfNeeded(byteReadChannel);
        return BytePacketBuilder.getBuffer();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readRemaining(ByteReadChannel byteReadChannel, long j, Continuation continuation) {
        ByteReadChannelOperationsKt$readRemaining$2 byteReadChannelOperationsKt$readRemaining$2;
        int i;
        Sink BytePacketBuilder;
        if (continuation instanceof ByteReadChannelOperationsKt$readRemaining$2) {
            byteReadChannelOperationsKt$readRemaining$2 = (ByteReadChannelOperationsKt$readRemaining$2) continuation;
            int i2 = byteReadChannelOperationsKt$readRemaining$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readRemaining$2.label = i2 - Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readRemaining$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$readRemaining$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j2 = byteReadChannelOperationsKt$readRemaining$2.J$0;
                    Sink sink = (Sink) byteReadChannelOperationsKt$readRemaining$2.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readRemaining$2.L$0;
                    ResultKt.throwOnFailure(obj);
                    BytePacketBuilder = sink;
                    j = j2;
                    byteReadChannel = byteReadChannel2;
                }
                while (!byteReadChannel.isClosedForRead()) {
                    long j3 = 0;
                    if (j <= 0) {
                        break;
                    }
                    if (j >= ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer())) {
                        j3 = j - ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer());
                        Boxing.boxLong(byteReadChannel.getReadBuffer().transferTo(BytePacketBuilder));
                    } else {
                        byteReadChannel.getReadBuffer().readTo(BytePacketBuilder, j);
                    }
                    byteReadChannelOperationsKt$readRemaining$2.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$readRemaining$2.L$1 = BytePacketBuilder;
                    byteReadChannelOperationsKt$readRemaining$2.J$0 = j3;
                    byteReadChannelOperationsKt$readRemaining$2.label = 1;
                    if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readRemaining$2, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = j3;
                }
                return BytePacketBuilder.getBuffer();
            }
        }
        byteReadChannelOperationsKt$readRemaining$2 = new ByteReadChannelOperationsKt$readRemaining$2(continuation);
        Object obj2 = byteReadChannelOperationsKt$readRemaining$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$readRemaining$2.label;
        if (i != 0) {
        }
        while (!byteReadChannel.isClosedForRead()) {
        }
        return BytePacketBuilder.getBuffer();
    }

    public static final ReaderJob reader(CoroutineScope coroutineScope, CoroutineContext coroutineContext, boolean z, Function2 block) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(block, "block");
        return reader(coroutineScope, coroutineContext, new ByteChannel(false, 1, null), block);
    }

    public static final ReaderJob reader(CoroutineScope coroutineScope, CoroutineContext coroutineContext, final ByteChannel channel, Function2 block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new ByteReadChannelOperationsKt$reader$job$1(block, channel, null), 2, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: io.ktor.utils.io.ByteReadChannelOperationsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit reader$lambda$6$lambda$5;
                reader$lambda$6$lambda$5 = ByteReadChannelOperationsKt.reader$lambda$6$lambda$5(ByteChannel.this, (Throwable) obj);
                return reader$lambda$6$lambda$5;
            }
        });
        return new ReaderJob(CloseHookByteWriteChannelKt.onClose(channel, new ByteReadChannelOperationsKt$reader$1(launch$default, null)), launch$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reader$lambda$6$lambda$5(ByteChannel byteChannel, Throwable th) {
        if (th != null && !byteChannel.isClosedForRead()) {
            byteChannel.cancel(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006a -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readPacket(ByteReadChannel byteReadChannel, int i, Continuation continuation) {
        ByteReadChannelOperationsKt$readPacket$1 byteReadChannelOperationsKt$readPacket$1;
        int i2;
        int i3;
        Buffer buffer;
        if (continuation instanceof ByteReadChannelOperationsKt$readPacket$1) {
            byteReadChannelOperationsKt$readPacket$1 = (ByteReadChannelOperationsKt$readPacket$1) continuation;
            int i4 = byteReadChannelOperationsKt$readPacket$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$readPacket$1.label = i4 - Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$readPacket$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$readPacket$1.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = byteReadChannelOperationsKt$readPacket$1.I$0;
                    buffer = (Buffer) byteReadChannelOperationsKt$readPacket$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readPacket$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i5;
                    byteReadChannel = byteReadChannel2;
                    if (!byteReadChannel.isClosedForRead()) {
                        long j = i3;
                        if (ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()) > j - buffer.getSize()) {
                            byteReadChannel.getReadBuffer().readTo(buffer, j - buffer.getSize());
                        } else {
                            Boxing.boxLong(byteReadChannel.getReadBuffer().transferTo(buffer));
                        }
                        if (buffer.getSize() < i3) {
                            if (byteReadChannel.getReadBuffer().exhausted()) {
                                byteReadChannelOperationsKt$readPacket$1.L$0 = byteReadChannel;
                                byteReadChannelOperationsKt$readPacket$1.L$1 = buffer;
                                byteReadChannelOperationsKt$readPacket$1.I$0 = i3;
                                byteReadChannelOperationsKt$readPacket$1.label = 1;
                                if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readPacket$1, 1, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                byteReadChannel2 = byteReadChannel;
                                i5 = i3;
                                i3 = i5;
                                byteReadChannel = byteReadChannel2;
                            }
                            if (!byteReadChannel.isClosedForRead()) {
                            }
                        }
                    }
                    if (buffer.getSize() < i3) {
                        return buffer;
                    }
                    throw new EOFException("Not enough data available, required " + i3 + " bytes but only " + buffer.getSize() + " available");
                }
                ResultKt.throwOnFailure(obj);
                i3 = i;
                buffer = new Buffer();
                if (buffer.getSize() < i3) {
                }
                if (buffer.getSize() < i3) {
                }
            }
        }
        byteReadChannelOperationsKt$readPacket$1 = new ByteReadChannelOperationsKt$readPacket$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$readPacket$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$readPacket$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:11:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:10:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object discard(ByteReadChannel byteReadChannel, long j, Continuation continuation) {
        ByteReadChannelOperationsKt$discard$1 byteReadChannelOperationsKt$discard$1;
        int i;
        long j2;
        if (continuation instanceof ByteReadChannelOperationsKt$discard$1) {
            byteReadChannelOperationsKt$discard$1 = (ByteReadChannelOperationsKt$discard$1) continuation;
            int i2 = byteReadChannelOperationsKt$discard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$discard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = byteReadChannelOperationsKt$discard$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$discard$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 = j;
                    if (j <= 0) {
                    }
                    return Boxing.boxLong(j2 - j);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = byteReadChannelOperationsKt$discard$1.J$1;
                j2 = byteReadChannelOperationsKt$discard$1.J$0;
                ByteReadChannel byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$discard$1.L$0;
                ResultKt.throwOnFailure(obj);
                long j4 = j3;
                byteReadChannel = byteReadChannel2;
                j = j4;
                long min = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), min);
                j -= min;
                if (j <= 0 && !byteReadChannel.isClosedForRead()) {
                    if (getAvailableForRead(byteReadChannel) == 0) {
                        byteReadChannelOperationsKt$discard$1.L$0 = byteReadChannel;
                        byteReadChannelOperationsKt$discard$1.J$0 = j2;
                        byteReadChannelOperationsKt$discard$1.J$1 = j;
                        byteReadChannelOperationsKt$discard$1.label = 1;
                        if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$discard$1, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteReadChannel2 = byteReadChannel;
                        j3 = j;
                        long j42 = j3;
                        byteReadChannel = byteReadChannel2;
                        j = j42;
                    }
                    long min2 = Math.min(j, ByteReadPacketKt.getRemaining(byteReadChannel.getReadBuffer()));
                    ByteReadPacketKt.discard(byteReadChannel.getReadBuffer(), min2);
                    j -= min2;
                    if (j <= 0) {
                    }
                    return Boxing.boxLong(j2 - j);
                }
                return Boxing.boxLong(j2 - j);
            }
        }
        byteReadChannelOperationsKt$discard$1 = new ByteReadChannelOperationsKt$discard$1(continuation);
        Object obj2 = byteReadChannelOperationsKt$discard$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$discard$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (r8.getReadBuffer().exhausted() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e8, code lost:
    
        r2.L$0 = r8;
        r2.L$1 = r15;
        r2.L$2 = r14;
        r2.L$3 = r13;
        r2.I$0 = r0;
        r2.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        if (io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(r8, 0, r2, 1, null) != r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        r2 = r8;
        r3 = r13;
        r4 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01c6: INVOKE (r14 I:java.lang.AutoCloseable), (r1 I:java.lang.Throwable) STATIC call: kotlin.jdk7.AutoCloseableKt.closeFinally(java.lang.AutoCloseable, java.lang.Throwable):void A[MD:(java.lang.AutoCloseable, java.lang.Throwable):void (m)], block:B:85:0x01c5 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8 A[Catch: all -> 0x004d, LOOP:0: B:18:0x00c8->B:25:0x015d, LOOP_START, TryCatch #1 {all -> 0x004d, blocks: (B:13:0x0047, B:16:0x00c2, B:18:0x00c8, B:20:0x00d2, B:32:0x00de, B:34:0x00e8, B:39:0x0101, B:41:0x0111, B:42:0x0131, B:45:0x0128, B:27:0x0144, B:25:0x015d, B:47:0x0162, B:49:0x016d, B:52:0x0187, B:53:0x01a2, B:54:0x01a3, B:57:0x01ae, B:59:0x01b8, B:65:0x006c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:13:0x0047, B:16:0x00c2, B:18:0x00c8, B:20:0x00d2, B:32:0x00de, B:34:0x00e8, B:39:0x0101, B:41:0x0111, B:42:0x0131, B:45:0x0128, B:27:0x0144, B:25:0x015d, B:47:0x0162, B:49:0x016d, B:52:0x0187, B:53:0x01a2, B:54:0x01a3, B:57:0x01ae, B:59:0x01b8, B:65:0x006c), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0180 -> B:15:0x0183). Please report as a decompilation issue!!! */
    /* renamed from: readUTF8LineTo-RRvyBJ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8007readUTF8LineToRRvyBJ8(ByteReadChannel byteReadChannel, Appendable appendable, int i, int i2, Continuation continuation) {
        ByteReadChannelOperationsKt$readUTF8LineTo$2 byteReadChannelOperationsKt$readUTF8LineTo$2;
        int i3;
        Appendable appendable2;
        int i4;
        int i5;
        ByteReadChannel byteReadChannel2;
        int i6;
        Appendable appendable3;
        AutoCloseable buffer;
        ByteReadChannel byteReadChannel3;
        Buffer buffer2;
        try {
            if (continuation instanceof ByteReadChannelOperationsKt$readUTF8LineTo$2) {
                byteReadChannelOperationsKt$readUTF8LineTo$2 = (ByteReadChannelOperationsKt$readUTF8LineTo$2) continuation;
                int i7 = byteReadChannelOperationsKt$readUTF8LineTo$2.label;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    byteReadChannelOperationsKt$readUTF8LineTo$2.label = i7 - Integer.MIN_VALUE;
                    Object obj = byteReadChannelOperationsKt$readUTF8LineTo$2.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i3 = byteReadChannelOperationsKt$readUTF8LineTo$2.label;
                    long j = 0;
                    if (i3 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (byteReadChannel.getReadBuffer().exhausted()) {
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$0 = byteReadChannel;
                            appendable2 = appendable;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$1 = appendable2;
                            i4 = i;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$0 = i4;
                            i5 = i2;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$1 = i5;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.label = 1;
                            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            appendable2 = appendable;
                            i4 = i;
                            i5 = i2;
                        }
                        byteReadChannel2 = byteReadChannel;
                        i6 = i5;
                    } else if (i3 == 1) {
                        i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$1;
                        i4 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                        Appendable appendable4 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                        byteReadChannel2 = (ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        appendable2 = appendable4;
                    } else {
                        if (i3 == 2) {
                            i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                            Buffer buffer3 = (Buffer) byteReadChannelOperationsKt$readUTF8LineTo$2.L$3;
                            buffer = (AutoCloseable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$2;
                            Appendable appendable5 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                            ByteReadChannel byteReadChannel4 = (ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                            ResultKt.throwOnFailure(obj);
                            byteReadChannel3 = byteReadChannel4;
                            Buffer buffer4 = buffer3;
                            appendable3 = appendable5;
                            if (byteReadChannel3.getReadBuffer().getBuffer().get(j) == 10) {
                                readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, LineEndingMode.Companion.m8020getCRLFf0jXZW8());
                                Boxing.boxLong(ByteReadPacketKt.discard(byteReadChannel3.getReadBuffer(), 1L));
                            } else {
                                readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, LineEndingMode.Companion.m8019getCRf0jXZW8());
                            }
                            appendable3.append(Utf8Kt.readString(buffer4));
                            Boolean boxBoolean = Boxing.boxBoolean(true);
                            AutoCloseableKt.closeFinally(buffer, null);
                            return boxBoolean;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i6 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$1;
                        i4 = byteReadChannelOperationsKt$readUTF8LineTo$2.I$0;
                        Buffer buffer5 = (Buffer) byteReadChannelOperationsKt$readUTF8LineTo$2.L$3;
                        buffer = (AutoCloseable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$2;
                        appendable3 = (Appendable) byteReadChannelOperationsKt$readUTF8LineTo$2.L$1;
                        byteReadChannel3 = (ByteReadChannel) byteReadChannelOperationsKt$readUTF8LineTo$2.L$0;
                        ResultKt.throwOnFailure(obj);
                        Buffer buffer6 = buffer5;
                        j = 0;
                        buffer2 = buffer6;
                        if (!byteReadChannel3.isClosedForRead()) {
                            while (!byteReadChannel3.getReadBuffer().exhausted()) {
                                byte readByte = byteReadChannel3.getReadBuffer().readByte();
                                if (readByte == 13) {
                                    break;
                                }
                                if (readByte == 10) {
                                    readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(i6, LineEndingMode.Companion.m8021getLFf0jXZW8());
                                    appendable3.append(Utf8Kt.readString(buffer2));
                                    Boolean boxBoolean2 = Boxing.boxBoolean(true);
                                    AutoCloseableKt.closeFinally(buffer, null);
                                    return boxBoolean2;
                                }
                                buffer2.writeByte(readByte);
                            }
                            if (buffer2.getSize() >= i4) {
                                throw new TooLongLineException("Line exceeds limit of " + i4 + " characters");
                            }
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$0 = byteReadChannel3;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$1 = appendable3;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$2 = buffer;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.L$3 = buffer2;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$0 = i4;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.I$1 = i6;
                            byteReadChannelOperationsKt$readUTF8LineTo$2.label = 3;
                            buffer6 = buffer2;
                            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel3, 0, byteReadChannelOperationsKt$readUTF8LineTo$2, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            j = 0;
                            buffer2 = buffer6;
                            if (!byteReadChannel3.isClosedForRead()) {
                                Boolean boxBoolean3 = Boxing.boxBoolean(buffer2.getSize() > 0);
                                if (boxBoolean3.booleanValue()) {
                                    appendable3.append(Utf8Kt.readString(buffer2));
                                }
                                AutoCloseableKt.closeFinally(buffer, null);
                                return boxBoolean3;
                            }
                        }
                    }
                    if (!byteReadChannel2.isClosedForRead()) {
                        return Boxing.boxBoolean(false);
                    }
                    appendable3 = appendable2;
                    buffer = new Buffer();
                    byteReadChannel3 = byteReadChannel2;
                    buffer2 = buffer;
                    if (!byteReadChannel3.isClosedForRead()) {
                    }
                }
            }
            if (i3 != 0) {
            }
            if (!byteReadChannel2.isClosedForRead()) {
            }
        } finally {
        }
        byteReadChannelOperationsKt$readUTF8LineTo$2 = new ByteReadChannelOperationsKt$readUTF8LineTo$2(continuation);
        Object obj2 = byteReadChannelOperationsKt$readUTF8LineTo$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = byteReadChannelOperationsKt$readUTF8LineTo$2.label;
        long j2 = 0;
    }

    private static final void readUTF8LineTo_RRvyBJ8$checkLineEndingAllowed(int i, int i2) {
        if (LineEndingMode.m8012containslTjpP64(i, i2)) {
            return;
        }
        throw new IOException("Unexpected line ending " + ((Object) LineEndingMode.m8017toStringimpl(i2)) + ", while expected " + ((Object) LineEndingMode.m8017toStringimpl(i)));
    }

    public static final int getAvailableForRead(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        return (int) byteReadChannel.getReadBuffer().getBuffer().getSize();
    }

    public static final void rethrowCloseCauseIfNeeded(ByteReadChannel byteReadChannel) {
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(ByteWriteChannel byteWriteChannel) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        Throwable closedCause = byteWriteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final void rethrowCloseCauseIfNeeded(ByteChannel byteChannel) {
        Intrinsics.checkNotNullParameter(byteChannel, "<this>");
        Throwable closedCause = byteChannel.getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
    }

    public static final Object readUntil(ByteReadChannel byteReadChannel, ByteString byteString, ByteWriteChannel byteWriteChannel, long j, boolean z, Continuation continuation) {
        return new ByteChannelScanner(byteReadChannel, byteString, byteWriteChannel, j).findNext$ktor_io(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object skipIfFound(ByteReadChannel byteReadChannel, ByteString byteString, Continuation continuation) {
        ByteReadChannelOperationsKt$skipIfFound$1 byteReadChannelOperationsKt$skipIfFound$1;
        Object obj;
        int i;
        if (continuation instanceof ByteReadChannelOperationsKt$skipIfFound$1) {
            byteReadChannelOperationsKt$skipIfFound$1 = (ByteReadChannelOperationsKt$skipIfFound$1) continuation;
            int i2 = byteReadChannelOperationsKt$skipIfFound$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$skipIfFound$1.label = i2 - Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$skipIfFound$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteReadChannelOperationsKt$skipIfFound$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int size = byteString.getSize();
                    byteReadChannelOperationsKt$skipIfFound$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$skipIfFound$1.L$1 = byteString;
                    byteReadChannelOperationsKt$skipIfFound$1.label = 1;
                    obj = peek(byteReadChannel, size, byteReadChannelOperationsKt$skipIfFound$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    }
                    byteString = (ByteString) byteReadChannelOperationsKt$skipIfFound$1.L$1;
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$skipIfFound$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!Intrinsics.areEqual(obj, byteString)) {
                    long size2 = byteString.getSize();
                    byteReadChannelOperationsKt$skipIfFound$1.L$0 = null;
                    byteReadChannelOperationsKt$skipIfFound$1.L$1 = null;
                    byteReadChannelOperationsKt$skipIfFound$1.label = 2;
                    if (discard(byteReadChannel, size2, byteReadChannelOperationsKt$skipIfFound$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Boxing.boxBoolean(true);
                }
                return Boxing.boxBoolean(false);
            }
        }
        byteReadChannelOperationsKt$skipIfFound$1 = new ByteReadChannelOperationsKt$skipIfFound$1(continuation);
        obj = byteReadChannelOperationsKt$skipIfFound$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteReadChannelOperationsKt$skipIfFound$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual(obj, byteString)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object peek(ByteReadChannel byteReadChannel, int i, Continuation continuation) {
        ByteReadChannelOperationsKt$peek$1 byteReadChannelOperationsKt$peek$1;
        Object obj;
        int i2;
        if (continuation instanceof ByteReadChannelOperationsKt$peek$1) {
            byteReadChannelOperationsKt$peek$1 = (ByteReadChannelOperationsKt$peek$1) continuation;
            int i3 = byteReadChannelOperationsKt$peek$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                byteReadChannelOperationsKt$peek$1.label = i3 - Integer.MIN_VALUE;
                obj = byteReadChannelOperationsKt$peek$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteReadChannelOperationsKt$peek$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (byteReadChannel.isClosedForRead()) {
                        return null;
                    }
                    byteReadChannelOperationsKt$peek$1.L$0 = byteReadChannel;
                    byteReadChannelOperationsKt$peek$1.I$0 = i;
                    byteReadChannelOperationsKt$peek$1.label = 1;
                    obj = byteReadChannel.awaitContent(i, byteReadChannelOperationsKt$peek$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = byteReadChannelOperationsKt$peek$1.I$0;
                    byteReadChannel = (ByteReadChannel) byteReadChannelOperationsKt$peek$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return ByteStringsKt.readByteString(byteReadChannel.getReadBuffer().peek(), i);
            }
        }
        byteReadChannelOperationsKt$peek$1 = new ByteReadChannelOperationsKt$peek$1(continuation);
        obj = byteReadChannelOperationsKt$peek$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteReadChannelOperationsKt$peek$1.label;
        if (i2 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
