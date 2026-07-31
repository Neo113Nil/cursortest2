package okio.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import okio.buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealBufferedSource.kt */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", "offset", "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes11.dex */
public final class RealBufferedSource {
    public static final long commonRead(@NotNull buffer bufferVar, @NotNull Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        if (bufferVar.bufferField.size() == 0 && bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
            return -1L;
        }
        return bufferVar.bufferField.read(sink, Math.min(j, bufferVar.bufferField.size()));
    }

    public static final boolean commonExhausted(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        return bufferVar.bufferField.exhausted() && bufferVar.source.read(bufferVar.bufferField, 8192L) == -1;
    }

    public static final void commonRequire(@NotNull buffer bufferVar, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (!bufferVar.request(j)) {
            throw new EOFException();
        }
    }

    public static final boolean commonRequest(@NotNull buffer bufferVar, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        while (bufferVar.bufferField.size() < j) {
            if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.bufferField.writeAll(bufferVar.source);
        return bufferVar.bufferField.readByteArray();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.bufferField.writeAll(bufferVar.source);
        return bufferVar.bufferField.readByteString();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.bufferField.writeAll(bufferVar.source);
        return bufferVar.bufferField.readUtf8();
    }

    public static final byte commonReadByte(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(1L);
        return bufferVar.bufferField.readByte();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull buffer bufferVar, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(j);
        return bufferVar.bufferField.readByteString(j);
    }

    public static final int commonSelect(@NotNull buffer bufferVar, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int selectPrefix = Buffer.selectPrefix(bufferVar.bufferField, options, true);
            if (selectPrefix != -2) {
                if (selectPrefix == -1) {
                    return -1;
                }
                bufferVar.bufferField.skip(options.getByteStrings()[selectPrefix].size());
                return selectPrefix;
            }
        } while (bufferVar.source.read(bufferVar.bufferField, 8192L) != -1);
        return -1;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull buffer bufferVar, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(j);
        return bufferVar.bufferField.readByteArray(j);
    }

    public static final void commonReadFully(@NotNull buffer bufferVar, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            bufferVar.require(sink.length);
            bufferVar.bufferField.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (bufferVar.bufferField.size() > 0) {
                Buffer buffer = bufferVar.bufferField;
                int read = buffer.read(sink, i, (int) buffer.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    public static final int commonRead(@NotNull buffer bufferVar, @NotNull byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = i2;
        SegmentedByteString.checkOffsetAndCount(sink.length, i, j);
        if (bufferVar.bufferField.size() == 0 && bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
            return -1;
        }
        return bufferVar.bufferField.read(sink, i, (int) Math.min(j, bufferVar.bufferField.size()));
    }

    public static final void commonReadFully(@NotNull buffer bufferVar, @NotNull Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            bufferVar.require(j);
            bufferVar.bufferField.readFully(sink, j);
        } catch (EOFException e) {
            sink.writeAll(bufferVar.bufferField);
            throw e;
        }
    }

    public static final long commonReadAll(@NotNull buffer bufferVar, @NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j = 0;
        while (bufferVar.source.read(bufferVar.bufferField, 8192L) != -1) {
            long completeSegmentByteCount = bufferVar.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(bufferVar.bufferField, completeSegmentByteCount);
            }
        }
        if (bufferVar.bufferField.size() <= 0) {
            return j;
        }
        long size = j + bufferVar.bufferField.size();
        Buffer buffer = bufferVar.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull buffer bufferVar, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(j);
        return bufferVar.bufferField.readUtf8(j);
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        long indexOf = bufferVar.indexOf((byte) 10);
        if (indexOf != -1) {
            return Buffer.readUtf8Line(bufferVar.bufferField, indexOf);
        }
        if (bufferVar.bufferField.size() != 0) {
            return bufferVar.readUtf8(bufferVar.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull buffer bufferVar, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long indexOf = bufferVar.indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return Buffer.readUtf8Line(bufferVar.bufferField, indexOf);
        }
        if (j2 < Long.MAX_VALUE && bufferVar.request(j2) && bufferVar.bufferField.getByte(j2 - 1) == 13 && bufferVar.request(1 + j2) && bufferVar.bufferField.getByte(j2) == 10) {
            return Buffer.readUtf8Line(bufferVar.bufferField, j2);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = bufferVar.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(bufferVar.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final int commonReadUtf8CodePoint(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(1L);
        byte b = bufferVar.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            bufferVar.require(2L);
        } else if ((b & 240) == 224) {
            bufferVar.require(3L);
        } else if ((b & 248) == 240) {
            bufferVar.require(4L);
        }
        return bufferVar.bufferField.readUtf8CodePoint();
    }

    public static final short commonReadShort(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(2L);
        return bufferVar.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(2L);
        return bufferVar.bufferField.readShortLe();
    }

    public static final int commonReadInt(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(4L);
        return bufferVar.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(4L);
        return bufferVar.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(8L);
        return bufferVar.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(8L);
        return bufferVar.bufferField.readLongLe();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadDecimalLong(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!bufferVar.request(j2)) {
                break;
            }
            byte b = bufferVar.bufferField.getByte(j);
            if ((b < 48 || b > 57) && !(j == 0 && b == 45)) {
                break;
            }
            j = j2;
        }
        return bufferVar.bufferField.readDecimalLong();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadHexadecimalUnsignedLong(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        bufferVar.require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!bufferVar.request(i2)) {
                break;
            }
            byte b = bufferVar.bufferField.getByte(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                break;
            }
            i = i2;
        }
        return bufferVar.bufferField.readHexadecimalUnsignedLong();
    }

    public static final void commonSkip(@NotNull buffer bufferVar, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (bufferVar.bufferField.size() == 0 && bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, bufferVar.bufferField.size());
            bufferVar.bufferField.skip(min);
            j -= min;
        }
    }

    public static final long commonIndexOf(@NotNull buffer bufferVar, byte b, long j, long j2) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long indexOf = bufferVar.bufferField.indexOf(b, j, j2);
            if (indexOf == -1) {
                long size = bufferVar.bufferField.size();
                if (size >= j2 || bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                    break;
                }
                j = Math.max(j, size);
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    public static final long commonIndexOf(@NotNull buffer bufferVar, @NotNull ByteString bytes, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = bufferVar.bufferField.indexOf(bytes, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = bufferVar.bufferField.size();
            if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - bytes.size()) + 1);
        }
    }

    public static final long commonIndexOfElement(@NotNull buffer bufferVar, @NotNull ByteString targetBytes, long j) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = bufferVar.bufferField.indexOfElement(targetBytes, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = bufferVar.bufferField.size();
            if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    public static final boolean commonRangeEquals(@NotNull buffer bufferVar, long j, @NotNull ByteString bytes, int i, int i2) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!bufferVar.request(1 + j2) || bufferVar.bufferField.getByte(j2) != bytes.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        return Okio.buffer(new PeekSource(bufferVar));
    }

    public static final void commonClose(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        if (bufferVar.closed) {
            return;
        }
        bufferVar.closed = true;
        bufferVar.source.close();
        bufferVar.bufferField.clear();
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        return bufferVar.source.getTimeout();
    }

    @NotNull
    public static final String commonToString(@NotNull buffer bufferVar) {
        Intrinsics.checkNotNullParameter(bufferVar, "<this>");
        return "buffer(" + bufferVar.source + ')';
    }
}
