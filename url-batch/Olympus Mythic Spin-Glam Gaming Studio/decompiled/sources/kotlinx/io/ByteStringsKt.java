package kotlinx.io;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations;

/* compiled from: ByteStrings.kt */
/* loaded from: classes3.dex */
public abstract class ByteStringsKt {
    public static final ByteString readByteString(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UnsafeByteStringOperations.INSTANCE.wrapUnsafe(SourcesKt.readByteArray(source));
    }

    public static final ByteString readByteString(Source source, int i) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UnsafeByteStringOperations.INSTANCE.wrapUnsafe(SourcesKt.readByteArray(source, i));
    }
}
