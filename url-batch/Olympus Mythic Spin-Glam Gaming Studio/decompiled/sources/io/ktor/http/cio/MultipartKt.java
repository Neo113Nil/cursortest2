package io.ktor.http.cio;

import io.bidmachine.util.network.NetworkUtils;
import io.ktor.http.ContentType;
import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.StringsKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.LongRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.bytestring.ByteStringKt;

/* compiled from: Multipart.kt */
/* loaded from: classes12.dex */
public abstract class MultipartKt {
    private static final ByteString CrLf = new ByteString(StringsKt.toByteArray$default("\r\n", null, 1, null), 0, 0, 6, null);
    private static final ByteString PrefixString = ByteStringKt.ByteString(45, 45);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object parsePreambleImpl(ByteString byteString, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, Continuation continuation) {
        return ByteReadChannelOperationsKt.readUntil(byteReadChannel, byteString, byteWriteChannel, j, true, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0055, B:17:0x005a, B:18:0x0061), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object parsePartHeadersImpl(ByteReadChannel byteReadChannel, Continuation continuation) {
        MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$1;
        int i;
        Throwable th;
        CharArrayBuilder charArrayBuilder;
        HttpHeadersMap httpHeadersMap;
        if (continuation instanceof MultipartKt$parsePartHeadersImpl$1) {
            multipartKt$parsePartHeadersImpl$1 = (MultipartKt$parsePartHeadersImpl$1) continuation;
            int i2 = multipartKt$parsePartHeadersImpl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartHeadersImpl$1.label = i2 - Integer.MIN_VALUE;
                MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$12 = multipartKt$parsePartHeadersImpl$1;
                Object obj = multipartKt$parsePartHeadersImpl$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartHeadersImpl$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CharArrayBuilder charArrayBuilder2 = new CharArrayBuilder(null, 1, null);
                    try {
                        multipartKt$parsePartHeadersImpl$12.L$0 = charArrayBuilder2;
                        multipartKt$parsePartHeadersImpl$12.label = 1;
                        Object parseHeaders$default = HttpParserKt.parseHeaders$default(byteReadChannel, charArrayBuilder2, null, multipartKt$parsePartHeadersImpl$12, 4, null);
                        if (parseHeaders$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = parseHeaders$default;
                        charArrayBuilder = charArrayBuilder2;
                    } catch (Throwable th2) {
                        th = th2;
                        charArrayBuilder = charArrayBuilder2;
                        charArrayBuilder.release();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charArrayBuilder = (CharArrayBuilder) multipartKt$parsePartHeadersImpl$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        charArrayBuilder.release();
                        throw th;
                    }
                }
                httpHeadersMap = (HttpHeadersMap) obj;
                if (httpHeadersMap == null) {
                    return httpHeadersMap;
                }
                throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
            }
        }
        multipartKt$parsePartHeadersImpl$1 = new MultipartKt$parsePartHeadersImpl$1(continuation);
        MultipartKt$parsePartHeadersImpl$1 multipartKt$parsePartHeadersImpl$122 = multipartKt$parsePartHeadersImpl$1;
        Object obj2 = multipartKt$parsePartHeadersImpl$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartHeadersImpl$122.label;
        if (i != 0) {
        }
        httpHeadersMap = (HttpHeadersMap) obj2;
        if (httpHeadersMap == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object parsePartBodyImpl(ByteString byteString, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, HttpHeadersMap httpHeadersMap, long j, Continuation continuation) {
        MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$1;
        int i;
        ByteString byteString2;
        ByteWriteChannel byteWriteChannel2;
        long longValue;
        Object skipIfFoundReadCount;
        long j2;
        ByteReadChannel byteReadChannel2 = byteReadChannel;
        ByteWriteChannel byteWriteChannel3 = byteWriteChannel;
        if (continuation instanceof MultipartKt$parsePartBodyImpl$1) {
            multipartKt$parsePartBodyImpl$1 = (MultipartKt$parsePartBodyImpl$1) continuation;
            int i2 = multipartKt$parsePartBodyImpl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multipartKt$parsePartBodyImpl$1.label = i2 - Integer.MIN_VALUE;
                MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$12 = multipartKt$parsePartBodyImpl$1;
                Object obj = multipartKt$parsePartBodyImpl$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$parsePartBodyImpl$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CharSequence charSequence = httpHeadersMap.get(NetworkUtils.HEADER_CONTENT_LENGTH);
                    Long boxLong = charSequence != null ? Boxing.boxLong(CharsKt.parseDecLong(charSequence)) : null;
                    if (boxLong == null) {
                        multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.label = 1;
                        obj = ByteReadChannelOperationsKt.readUntil(byteReadChannel, byteString, byteWriteChannel, j, true, multipartKt$parsePartBodyImpl$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteWriteChannel2 = byteWriteChannel3;
                        longValue = ((Number) obj).longValue();
                        multipartKt$parsePartBodyImpl$12.L$0 = null;
                        multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                        multipartKt$parsePartBodyImpl$12.label = 4;
                        if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                        }
                    } else {
                        if (!new LongRange(0L, j).contains(boxLong.longValue())) {
                            throwLimitExceeded(boxLong.longValue(), j);
                            throw new KotlinNothingValueException();
                        }
                        long longValue2 = boxLong.longValue();
                        byteString2 = byteString;
                        multipartKt$parsePartBodyImpl$12.L$0 = byteString2;
                        multipartKt$parsePartBodyImpl$12.L$1 = byteReadChannel2;
                        multipartKt$parsePartBodyImpl$12.L$2 = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.label = 2;
                        obj = ByteReadChannelOperationsKt.copyTo(byteReadChannel2, byteWriteChannel3, longValue2, multipartKt$parsePartBodyImpl$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        long longValue3 = ((Number) obj).longValue();
                        multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel3;
                        multipartKt$parsePartBodyImpl$12.L$1 = null;
                        multipartKt$parsePartBodyImpl$12.L$2 = null;
                        multipartKt$parsePartBodyImpl$12.J$0 = longValue3;
                        multipartKt$parsePartBodyImpl$12.label = 3;
                        skipIfFoundReadCount = skipIfFoundReadCount(byteReadChannel2, byteString2, multipartKt$parsePartBodyImpl$12);
                        if (skipIfFoundReadCount != coroutine_suspended) {
                        }
                    }
                } else if (i == 1) {
                    byteWriteChannel2 = (ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    longValue = ((Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                    if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                    }
                } else if (i == 2) {
                    ByteWriteChannel byteWriteChannel4 = (ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$2;
                    ByteReadChannel byteReadChannel3 = (ByteReadChannel) multipartKt$parsePartBodyImpl$12.L$1;
                    byteString2 = (ByteString) multipartKt$parsePartBodyImpl$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteWriteChannel3 = byteWriteChannel4;
                    byteReadChannel2 = byteReadChannel3;
                    long longValue32 = ((Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = byteWriteChannel3;
                    multipartKt$parsePartBodyImpl$12.L$1 = null;
                    multipartKt$parsePartBodyImpl$12.L$2 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue32;
                    multipartKt$parsePartBodyImpl$12.label = 3;
                    skipIfFoundReadCount = skipIfFoundReadCount(byteReadChannel2, byteString2, multipartKt$parsePartBodyImpl$12);
                    if (skipIfFoundReadCount != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2 = longValue32;
                    obj = skipIfFoundReadCount;
                    byteWriteChannel2 = byteWriteChannel3;
                    longValue = j2 + ((Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                    if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                    }
                } else if (i == 3) {
                    j2 = multipartKt$parsePartBodyImpl$12.J$0;
                    byteWriteChannel2 = (ByteWriteChannel) multipartKt$parsePartBodyImpl$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    longValue = j2 + ((Number) obj).longValue();
                    multipartKt$parsePartBodyImpl$12.L$0 = null;
                    multipartKt$parsePartBodyImpl$12.J$0 = longValue;
                    multipartKt$parsePartBodyImpl$12.label = 4;
                    if (byteWriteChannel2.flush(multipartKt$parsePartBodyImpl$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    longValue = multipartKt$parsePartBodyImpl$12.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxLong(longValue);
            }
        }
        multipartKt$parsePartBodyImpl$1 = new MultipartKt$parsePartBodyImpl$1(continuation);
        MultipartKt$parsePartBodyImpl$1 multipartKt$parsePartBodyImpl$122 = multipartKt$parsePartBodyImpl$1;
        Object obj2 = multipartKt$parsePartBodyImpl$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$parsePartBodyImpl$122.label;
        if (i != 0) {
        }
        return Boxing.boxLong(longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object skipIfFoundReadCount(ByteReadChannel byteReadChannel, ByteString byteString, Continuation continuation) {
        MultipartKt$skipIfFoundReadCount$1 multipartKt$skipIfFoundReadCount$1;
        int i;
        if (continuation instanceof MultipartKt$skipIfFoundReadCount$1) {
            multipartKt$skipIfFoundReadCount$1 = (MultipartKt$skipIfFoundReadCount$1) continuation;
            int i2 = multipartKt$skipIfFoundReadCount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multipartKt$skipIfFoundReadCount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multipartKt$skipIfFoundReadCount$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = multipartKt$skipIfFoundReadCount$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    multipartKt$skipIfFoundReadCount$1.L$0 = byteString;
                    multipartKt$skipIfFoundReadCount$1.label = 1;
                    obj = ByteReadChannelOperationsKt.skipIfFound(byteReadChannel, byteString, multipartKt$skipIfFoundReadCount$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteString = (ByteString) multipartKt$skipIfFoundReadCount$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxLong(!((Boolean) obj).booleanValue() ? byteString.getSize() : 0L);
            }
        }
        multipartKt$skipIfFoundReadCount$1 = new MultipartKt$skipIfFoundReadCount$1(continuation);
        Object obj2 = multipartKt$skipIfFoundReadCount$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = multipartKt$skipIfFoundReadCount$1.label;
        if (i != 0) {
        }
        return Boxing.boxLong(!((Boolean) obj2).booleanValue() ? byteString.getSize() : 0L);
    }

    public static final ReceiveChannel parseMultipart(CoroutineScope coroutineScope, ByteReadChannel input, CharSequence contentType, Long l, long j) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (!ContentType.MultiPart.INSTANCE.contains(contentType)) {
            throw new UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) contentType));
        }
        return parseMultipart(coroutineScope, new ByteString(parseBoundaryInternal(contentType), 0, 0, 6, null), input, l, j);
    }

    private static final ReceiveChannel parseMultipart(CoroutineScope coroutineScope, ByteString byteString, ByteReadChannel byteReadChannel, Long l, long j) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new MultipartKt$parseMultipart$1(byteReadChannel, byteString, j, l, null), 3, null);
    }

    private static final int findBoundary(CharSequence charSequence) {
        int length = charSequence.length();
        char c = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = charSequence.charAt(i2);
            if (c == 0) {
                if (charAt != ';') {
                }
                i = 0;
                c = 1;
            } else if (c != 1) {
                if (c == 2) {
                    if (charAt != '\"') {
                        if (charAt != ',') {
                            if (charAt != ';') {
                            }
                            i = 0;
                            c = 1;
                        }
                        c = 0;
                    }
                    c = 3;
                } else if (c != 3) {
                    if (c != 4) {
                    }
                    c = 3;
                } else {
                    if (charAt != '\"') {
                        if (charAt == '\\') {
                            c = 4;
                        }
                    }
                    i = 0;
                    c = 1;
                }
            } else if (charAt == '=') {
                c = 2;
            } else if (charAt == ';') {
                i = 0;
            } else {
                if (charAt != ',') {
                    if (charAt == ' ') {
                        continue;
                    } else {
                        if (i == 0 && kotlin.text.StringsKt.startsWith(charSequence, (CharSequence) "boundary=", i2, true)) {
                            return i2;
                        }
                        i++;
                    }
                }
                c = 0;
            }
        }
        return -1;
    }

    public static final byte[] parseBoundaryInternal(CharSequence contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        int findBoundary = findBoundary(contentType);
        if (findBoundary == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        byte[] bArr = new byte[74];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        parseBoundaryInternal$put(ref$IntRef, bArr, (byte) 13);
        parseBoundaryInternal$put(ref$IntRef, bArr, (byte) 10);
        parseBoundaryInternal$put(ref$IntRef, bArr, (byte) 45);
        parseBoundaryInternal$put(ref$IntRef, bArr, (byte) 45);
        int length = contentType.length();
        char c = 0;
        for (int i = findBoundary + 9; i < length; i++) {
            char charAt = contentType.charAt(i);
            int i2 = charAt & 65535;
            if ((65535 & charAt) > 127) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to parse multipart: wrong boundary byte 0x");
                String num = Integer.toString(i2, kotlin.text.CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                sb.append(num);
                sb.append(" - should be 7bit character");
                throw new IOException(sb.toString());
            }
            if (c == 0) {
                if (charAt == ' ') {
                    continue;
                } else {
                    if (charAt != '\"') {
                        if (charAt == ',' || charAt == ';') {
                            break;
                        }
                        parseBoundaryInternal$put(ref$IntRef, bArr, (byte) i2);
                        c = 1;
                    }
                    c = 2;
                }
            } else if (c == 1) {
                if (charAt == ' ' || charAt == ',' || charAt == ';') {
                    break;
                }
                parseBoundaryInternal$put(ref$IntRef, bArr, (byte) i2);
            } else {
                if (c == 2) {
                    if (charAt == '\"') {
                        break;
                    }
                    if (charAt != '\\') {
                        parseBoundaryInternal$put(ref$IntRef, bArr, (byte) i2);
                    } else {
                        c = 3;
                    }
                } else if (c == 3) {
                    parseBoundaryInternal$put(ref$IntRef, bArr, (byte) i2);
                    c = 2;
                }
            }
        }
        int i3 = ref$IntRef.element;
        if (i3 == 4) {
            throw new IOException("Empty multipart boundary is not allowed");
        }
        return ArraysKt.copyOfRange(bArr, 0, i3);
    }

    private static final void parseBoundaryInternal$put(Ref$IntRef ref$IntRef, byte[] bArr, byte b) {
        int i = ref$IntRef.element;
        if (i >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        ref$IntRef.element = i + 1;
        bArr[i] = b;
    }

    private static final Void throwLimitExceeded(long j, long j2) {
        throw new IOException("Multipart content length exceeds limit " + j + " > " + j2 + "; limit is defined using 'formFieldLimit' argument");
    }
}
