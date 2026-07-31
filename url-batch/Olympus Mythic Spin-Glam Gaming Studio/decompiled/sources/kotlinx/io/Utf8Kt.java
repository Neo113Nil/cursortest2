package kotlinx.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.internal._Utf8Kt;
import kotlinx.io.unsafe.SegmentReadContext;
import kotlinx.io.unsafe.UnsafeBufferOperations;
import kotlinx.io.unsafe.UnsafeBufferOperationsKt;

/* compiled from: Utf8.kt */
/* loaded from: classes15.dex */
public abstract class Utf8Kt {
    public static final String readString(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        source.request(Long.MAX_VALUE);
        return commonReadUtf8(source.getBuffer(), source.getBuffer().getSize());
    }

    public static final String readString(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return commonReadUtf8(buffer, buffer.getSize());
    }

    public static final String readString(Source source, long j) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        source.require(j);
        return commonReadUtf8(source.getBuffer(), j);
    }

    private static final String commonReadUtf8(Buffer buffer, long j) {
        SegmentReadContext unused;
        if (j == 0) {
            return "";
        }
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Segment head = buffer.getHead();
        if (head == null) {
            throw new IllegalStateException("Unreacheable");
        }
        unused = UnsafeBufferOperationsKt.SegmentReadContextImpl;
        if (head.getSize() >= j) {
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            String commonToUtf8String = _Utf8Kt.commonToUtf8String(dataAsByteArray, pos, Math.min(head.getLimit(), ((int) j) + pos));
            buffer.skip(j);
            return commonToUtf8String;
        }
        return _Utf8Kt.commonToUtf8String$default(SourcesKt.readByteArray(buffer, (int) j), 0, 0, 3, null);
    }
}
